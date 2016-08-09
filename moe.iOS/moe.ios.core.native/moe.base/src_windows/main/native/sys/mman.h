#ifndef SYS_MMAN_H
#define SYS_MMAN_H

#define PROT_NONE 0
#define PROT_READ 1
#define PROT_WRITE 2
#define PROT_EXEC 4

// We deliberately only handle MAP_FIXED as other flags are not necessary to implement.
#define MAP_SHARED 0
#define MAP_PRIVATE 0
#define MAP_ANON 0
#define MAP_FIXED 1

#define MAP_FAILED ((void*)-1)

#define MADV_DONTNEED 1
#define MADV_RANDOM 2

MOE_WINDOWS_INTERNAL DWORD moe_mapProtectionFlags(int prot) {
    switch(prot) {
        case PROT_NONE: return PAGE_NOACCESS;

        case PROT_READ: return PAGE_READONLY;
        case PROT_WRITE: return PAGE_READWRITE; // There is no read only protection constant on Windows.
        case PROT_EXEC: return PAGE_EXECUTE;

        case PROT_READ | PROT_WRITE: return PAGE_READWRITE;
        case PROT_READ | PROT_EXEC: return PAGE_EXECUTE_READ;
        case PROT_READ | PROT_WRITE | PROT_EXEC: return PAGE_EXECUTE_READWRITE;

        case PROT_WRITE | PROT_EXEC: return PAGE_EXECUTE_READWRITE; // There is no read-exec only protection constant on Windows.

        default: return -1;
    }
}

MOE_WINDOWS_INTERNAL int madvise(void* addr, size_t length, int hint) {
    if (!length) {
        return -1;
    }

    if (hint == MADV_RANDOM) {
        // TODO: PAGE_NOCACHE is for disabling CPU caching and I am not sure that is what we shoudl do
        // in case of a MADV_RANDOM hint.
        return 0;
    } else if (hint != MADV_DONTNEED) {
        return -1;
    }

    SYSTEM_INFO sys;
    GetSystemInfo(&sys);
    DWORD page = sys.dwAllocationGranularity;

    size_t count = ((length - 1) / page) + 1;
    BOOL succ = TRUE;
    for (size_t i = 0; succ && i < count; i++) {
        char* paddr = (char*)addr + (page * i);

        MEMORY_BASIC_INFORMATION info;
        VirtualQuery(paddr, &info, sizeof(MEMORY_BASIC_INFORMATION));
        DWORD winProt = info.AllocationProtect;

        // We have to re-commit regardless of whether the previous de-commit was successful,
        // because we cannot leave pages unreachable.
        succ &= VirtualFree(paddr, 0, MEM_DECOMMIT);
        succ &= VirtualAlloc(paddr, page, MEM_COMMIT, winProt) != NULL;
    }

    return succ ? 0 : -1;
}

MOE_WINDOWS_INTERNAL void* mmap(void *addr, size_t length, int prot, int flags, int fd, off_t offset) {
    if (!length) {
        return MAP_FAILED;
    }

    SYSTEM_INFO sys;
    GetSystemInfo(&sys);
    DWORD page = sys.dwAllocationGranularity;

    size_t count = ((length - 1) / page) + 1;

    DWORD winProt = moe_mapProtectionFlags(prot);

    BOOL fixed = addr && (flags & MAP_FIXED);

    HANDLE fileMapping = NULL;
    DWORD64 fileSize;
    DWORD fileProt;
    if (fd >= 0) {
        DWORD mapProt;
        if ((prot & PROT_WRITE) == 0) {
            fileProt = FILE_MAP_READ;
            if ((prot & PROT_EXEC)) {
                fileProt |= FILE_MAP_EXECUTE;
                mapProt = PAGE_EXECUTE_READ;
            } else {
                mapProt = PAGE_READONLY;
            }
        }
        else {
            if (prot & MAP_PRIVATE) {
                fileProt = FILE_MAP_COPY;
                if ((prot & PROT_EXEC)) {
                    fileProt |= FILE_MAP_EXECUTE;
                    mapProt = PAGE_EXECUTE_WRITECOPY;
                } else {
                    mapProt = PAGE_WRITECOPY;
                }
            } else {
                fileProt = FILE_MAP_WRITE;
                if ((prot & PROT_EXEC)) {
                    fileProt |= FILE_MAP_EXECUTE;
                    mapProt = PAGE_EXECUTE_READWRITE;
                } else {
                    mapProt = PAGE_READWRITE;
                }
            }
        }

        HANDLE h = (HANDLE)_get_osfhandle(fd);
        fileMapping = CreateFileMapping(h, NULL, mapProt, 0, 0, NULL);
        if (!fileMapping) {
            return NULL;
        }
        ((DWORD*)&fileSize)[0] = GetFileSize(h, &((DWORD*)&fileSize)[1]);
    }

    while (TRUE) {
        if (!fixed) {
            addr = VirtualAlloc(NULL, count * page, MEM_RESERVE, winProt);
            if (!addr) {
                return NULL;
            }
            VirtualFree(addr, 0, MEM_RELEASE);
        }

        size_t i;
        BOOL succ = TRUE;
        for (i = 0; succ && i < count; i++) {
            void* paddr = (char*)addr + (page * i);
            PVOID saddr;
            if (fileMapping) {
                DWORD64 poffs = offset + (page * i);
                DWORD64 ppos = poffs + page;
                if (fileSize < ppos) {
                    ppos = fileSize;
                }
                if (ppos <= page * i) {
                    saddr = VirtualAlloc(paddr, page, MEM_COMMIT | MEM_RESERVE, winProt);
                } else {
                    saddr = MapViewOfFileEx(fileMapping, fileProt, poffs >> 32, poffs & 0xFFFFFFFF, ppos - poffs, paddr);
                }
            } else {
                saddr = VirtualAlloc(paddr, page, MEM_COMMIT | MEM_RESERVE, winProt);
            }
            if (!saddr) {
                succ = FALSE;
                break;
            }
        }

        if (succ) {
            break;
        } else {
            DWORD err = GetLastError();
            for (size_t j = 0; j < i; j++) {
                if (!VirtualFree((char*)addr + (page * j), 0, MEM_RELEASE)) {
                    succ = FALSE;
                    break;
                }
            }
            if (fixed || err != ERROR_INVALID_ADDRESS) {
                if (fileMapping) {
                    CloseHandle(fileMapping);
                }
                return MAP_FAILED;
            }
        }
    }

    if (fileMapping) {
        CloseHandle(fileMapping);
    }
    return addr;
}

MOE_WINDOWS_INTERNAL int munmap(void * addr, size_t length) {
    if (!length) {
        return -1;
    }

    SYSTEM_INFO sys;
    GetSystemInfo(&sys);
    DWORD page = sys.dwAllocationGranularity;

    size_t count = ((length - 1) / page) + 1;

    BOOL succ = TRUE;
    // We should not optimize by breaking out of the loop after the first failure,
    // because we have to make the best attempt to release everything.
    for (size_t i = 0; i < count; i++) {
        BOOL psucc = VirtualFree((char*)addr + (page * i), 0, MEM_RELEASE);
        if (!psucc && GetLastError() == ERROR_INVALID_PARAMETER) {
            psucc = UnmapViewOfFile(addr);
        }
        succ &= psucc;
    }

    return succ ? 0 : -1;
}

MOE_WINDOWS_INTERNAL int mprotect(void * addr, size_t length, int prot) {
    if (!length) {
        return -1;
    }

    DWORD old;
    DWORD winProt = moe_mapProtectionFlags(prot);

    SYSTEM_INFO sys;
    GetSystemInfo(&sys);
    DWORD page = sys.dwAllocationGranularity;

    size_t count = ((length - 1) / page) + 1;

    BOOL succ = TRUE;
    for (size_t i = 0; succ && i < count; i++) {
        succ &= VirtualProtect((char*)addr + (page * i), page, winProt, &old);
    }

    return succ ? 0 : -1;
}

MOE_WINDOWS_INTERNAL int mlock(void* addr, size_t length) {
    return VirtualLock(addr, length) ? 0 : -1;
}

MOE_WINDOWS_INTERNAL int munlock(void* addr, size_t length) {
    return VirtualUnlock(addr, length) ? 0 : -1;
}

#endif
