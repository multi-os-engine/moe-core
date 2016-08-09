/*
 * For strcasecmp and strncasecmp
 */

 #define strcasecmp _stricmp
 #define strncasecmp _strnicmp


/*
 * For common headers
 */

#include <unistd.h>
#include <malloc.h>


/*
 * For common types
 */

#include <stdint.h>
#include <uchar.h>

typedef unsigned int uint;

typedef void * caddr_t;


/*
 * For typeof
 */

#ifdef __cplusplus
#define typeof decltype
#endif


/*
 * For REPARSE_DATA_BUFFER
 */

// Copied from MinGW
typedef struct _REPARSE_DATA_BUFFER {
  unsigned long ReparseTag;
  unsigned short ReparseDataLength;
  unsigned short Reserved;
  _ANONYMOUS_UNION union {
    struct {
      unsigned short SubstituteNameOffset;
      unsigned short SubstituteNameLength;
      unsigned short PrintNameOffset;
      unsigned short PrintNameLength;
      unsigned long Flags;
      wchar_t PathBuffer[1];
    } SymbolicLinkReparseBuffer;
    struct {
      unsigned short SubstituteNameOffset;
      unsigned short SubstituteNameLength;
      unsigned short PrintNameOffset;
      unsigned short PrintNameLength;
      wchar_t PathBuffer[1];
    } MountPointReparseBuffer;
    struct {
      unsigned char DataBuffer[1];
    } GenericReparseBuffer;
  } DUMMYUNIONNAME;
} REPARSE_DATA_BUFFER, *PREPARSE_DATA_BUFFER;


/*
 * For byte swappers
 */

MOE_WINDOWS_INTERNAL uint16_t bswap_16(uint16_t toswap) {
  return ((toswap << 8) & 0xff00) | ((toswap >> 8) & 0x00ff);
}

MOE_WINDOWS_INTERNAL uint32_t bswap_32(uint32_t toswap) {
  return ((toswap << 24) & 0xff000000) | ((toswap << 8) & 0x00ff0000) |
         ((toswap >> 8) & 0x0000ff00) | ((toswap >> 24) & 0x000000ff);
}


/*
 * For lseek64
 */

// Copied from MinGW
MOE_WINDOWS_EXTERN_DECL
_off64_t lseek64(int fd,_off64_t offset, int whence);


/*
 * For byte localtime_r
 */

#include <time.h>

// Copied from MinGW
__forceinline struct tm *__cdecl localtime_r(const time_t *_Time, struct tm *_Tm) {
  return localtime_s(_Tm, _Time) ? NULL : _Tm;
}


/*
 * For asprintf
 */


// Copied from MinGW
MOE_WINDOWS_EXTERN_DECL
int __cdecl asprintf(char ** __restrict__ ret,const char * __restrict__ format,...) __attribute__ ((format (__MINGW_PRINTF_FORMAT, 2, 3)));


/*
 * For pthread
 */

#include <pthread.h>

#ifdef __cplusplus
#define NOMINMAX
#endif

#define _WINSOCK_DEPRECATED_NO_WARNINGS
#include <winsock2.h>
#include <windows.h>

#define __MINSIGSTKSZ (64 * 1024)

#define PTHREAD_STACK_MIN __MINSIGSTKSZ

MOE_WINDOWS_INTERNAL int pthread_attr_getguardsize(const pthread_attr_t* attr, size_t* size) {
    // The size of thread stack guard is specified as one page.
    // https://msdn.microsoft.com/en-us/library/windows/desktop/ms686774(v=vs.85).aspx
    SYSTEM_INFO si;
    GetSystemInfo(&si);
    *size = si.dwPageSize;
    return 0;
}

MOE_WINDOWS_INTERNAL int pthread_attr_setstack(pthread_attr_t* attr, void* addr, size_t size) {
    int err = pthread_attr_setstackaddr(attr, addr);
    if (err != 0) {
       return err;
    }
    err = pthread_attr_setstacksize(attr, size);
    return err;
}


/*
 * For common defines
 */

#if defined(__cplusplus)
# define __BEGIN_DECLS extern "C" {
# define __END_DECLS }
#else
# define __BEGIN_DECLS
# define __END_DECLS
#endif

// Copied from MinGW
#define _O_ACCMODE (_O_RDONLY|_O_WRONLY|_O_RDWR)
#define O_ACCMODE _O_ACCMODE

// Copied from MinGW
#define F_OK  0 /* Check for file existence */
#define X_OK  1 /* Check for execute permission. */
#define W_OK  2 /* Check for write permission */
#define R_OK  4 /* Check for read permission */

#undef offsetof
#define offsetof __builtin_offsetof

#define DEFFILEMODE 0

#define S_ISGID 0
#define S_ISUID 0
#define S_ISVTX 0

#define S_IFLNK 0
#define S_IFSOCK 0

// This is included in newer MinGW!
// These values were copied from it.
#define _S_IREAD 0x0100
#define _S_IWRITE 0x0080
#define _S_IEXEC 0x0040

#define _S_IRWXU  (_S_IREAD | _S_IWRITE | _S_IEXEC)
#define _S_IXUSR  _S_IEXEC
#define _S_IWUSR  _S_IWRITE

#define S_IRWXU   _S_IRWXU
#define S_IXUSR   _S_IXUSR
#define S_IWUSR   _S_IWUSR
#define S_IRUSR   _S_IRUSR
#define  _S_IRUSR  _S_IREAD

#define S_IRGRP    (S_IRUSR >> 3)
#define S_IWGRP    (S_IWUSR >> 3)
#define S_IXGRP    (S_IXUSR >> 3)
#define S_IRWXG    (S_IRWXU >> 3)

#define S_IROTH    (S_IRGRP >> 3)
#define S_IWOTH    (S_IWGRP >> 3)
#define S_IXOTH    (S_IXGRP >> 3)
#define S_IRWXO    (S_IRWXG >> 3)

#define _S_IFBLK  0x3000
#define _S_IFMT 0xF000
#define _S_IFDIR 0x4000
#define _S_IFREG 0x8000
#define _S_IFIFO 0x1000

#define S_IFMT _S_IFMT
#define S_IFDIR _S_IFDIR
#define S_IFREG _S_IFREG
#define S_IFBLK _S_IFBLK
#define S_IFIFO _S_IFIFO

#define S_ISDIR(m)  (((m) & S_IFMT) == S_IFDIR)
#define S_ISREG(m)  (((m) & S_IFMT) == S_IFREG)

#include <dirent.h>

#define EDQUOT 0
#define EMULTIHOP 0
#define ESTALE 0
#define EUSERS 0

#define TIOCOUTQ 0

#define MAXSYMLINKS 0

#define MIN(a,b) (((a)<(b))?(a):(b))

#define O_CLOEXEC 0
#define O_NOFOLLOW 1


/*
 * For strerror_r
 */

#define strerror_r(errno, buf, len) strerror_s(buf, len, errno)
#define strtok_r(str, del, ctx) strtok_s(str, del, ctx)


/*
 * For imcp
 */

#include <ipexport.h>


/*
 * For stpcpy
 */

MOE_WINDOWS_INTERNAL char *stpcpy(char *dest, const char *src) {
  char* d = dest;
  const char* s = src;
  while (*s) {
    *d++ = *s++;
  }
  *d = 0;
  return d;
}


/*
 * For getuid
 */

typedef unsigned int uid_t;

MOE_WINDOWS_EXTERN_DECL uid_t getuid();


/*
 * For geteuid
 */

MOE_WINDOWS_EXTERN_DECL uid_t geteuid();


/*
 * For getppid
 */

MOE_WINDOWS_EXTERN_DECL pid_t getppid();


/*
 * For getgid
 */

typedef unsigned int gid_t;

MOE_WINDOWS_EXTERN_DECL gid_t getgid();


/*
 * For getegid
 */

MOE_WINDOWS_EXTERN_DECL gid_t getegid();


/*
 * For setuid
 */

// TODO: This implementation is not working and
// may not be implemented.
MOE_WINDOWS_EXTERN_DECL int setuid(uid_t uid);

/*
 * For seteuid
 */

// TODO: This implementation is not working and
// may not be implemented.
MOE_WINDOWS_EXTERN_DECL int seteuid(uid_t euid);


/*
 * For setgid
 */

// TODO: This implementation is not working and
// may not be implemented.
MOE_WINDOWS_EXTERN_DECL int setgid(gid_t gid);


/*
 * For setegid
 */

// TODO: This implementation is not working and
// may not be implemented.
MOE_WINDOWS_EXTERN_DECL int setegid(gid_t egid);


/*
 * For setsid
 */

// This can not be implemented.
MOE_WINDOWS_INTERNAL pid_t setsid() {
  return -1;
}


/*
 * For setreuid
 */

// This can not be implemented.
MOE_WINDOWS_INTERNAL int setreuid(uid_t ruid, uid_t euid) {
  return -1;
}


/*
 * For setpgid
 */

// This can not be implemented.
MOE_WINDOWS_INTERNAL int setpgid(pid_t pid, pid_t pgid) {
  return -1;
}


/*
 * For setregid
 */

// This can not be implemented.
MOE_WINDOWS_INTERNAL int setregid(gid_t rgid, gid_t egid) {
  return -1;
}


/*
 * For getpgid
 */

// This can not be implemented.
MOE_WINDOWS_INTERNAL pid_t getpgid(pid_t pid) {
  return -1;
}


/*
 * For math
 */

#include <math.h>


/*
 * For pipe
 */

#include <io.h>

#include <fcntl.h>

#define pipe(fds) _pipe(fds, 4096, _O_BINARY)

// UNIX uses binary mode and Windows text mode by default. We should
// use _set_fmode to change this, but that would not be very safe and
// not trivial to link.
#undef _O_RDONLY
#define _O_RDONLY (0x0000 | _O_BINARY)

#undef _O_WRONLY
#define _O_WRONLY (0x0001 | _O_BINARY)

#undef _O_RDWR
#define _O_RDWR (0x0002 | _O_BINARY)


/*
 * For std::unique_ptr
 */

#ifdef __cplusplus
#include <memory>
#endif


/*
 * For std::find and others
 */

#ifdef __cplusplus
#include <algorithm>
#endif


/*
 * For strndup
 */

#include <stdlib.h>
#include <string.h>

MOE_WINDOWS_INTERNAL char* strndup(const char* s, size_t size) {
  char *r;
  char *end = (char*)memchr(s, 0, size);

  if (end) {
    size = end - s + 1;
  }

  r = (char*)malloc(size);

  if (size) {
      memcpy(r, s, size-1);
      r[size-1] = '\0';
  }
  return r;
}

MOE_WINDOWS_INTERNAL size_t strlcpy(char* dst, const char* src, size_t size) {
  if (!size || !src[0]) {
    return 0;
  }

  size_t len = 0;
  for (; len < size - 1 && src[len]; len++);
  memcpy(dst, src, len);
  dst[len] = 0;

  return len;
}


/*
 * for posix_memalign
 */

MOE_WINDOWS_INTERNAL int posix_memalign(void **memptr, size_t alignment, size_t size) {
    *memptr = _aligned_malloc(size, alignment);
    return 0;
}


/*
 * For pathconf
 */

#define _PC_NAME_MAX MAX_PATH

MOE_WINDOWS_INTERNAL long pathconf(const char* path, int name) {
    return name;
}


/*
 * For setsockopt
 */

#ifdef __cplusplus
#define setsockopt(sock, level, optname, optval, optlen) setsockopt(sock, level, optname, (const char*)optval, optlen)
#endif


/*
 * For sendfile
 */

#include <mswsock.h>

MOE_WINDOWS_INTERNAL int sendfile(int out_fd, int in_fd, off_t* offset, size_t count) {
  SOCKET sock = (SOCKET)out_fd;
  HANDLE file = (HANDLE)_get_osfhandle(in_fd);
  BOOL succ;
  if (offset) {
    // TODO: this is not a very concurrent implementation.
    DWORD start = SetFilePointer(file, 0, NULL, FILE_CURRENT);
    SetFilePointer(file, *offset, NULL, FILE_BEGIN);
    succ = TransmitFile(sock, file, count, 0, NULL, NULL, 0);
    *offset = SetFilePointer(file, 0, NULL, FILE_CURRENT);
    SetFilePointer(file, start, NULL, FILE_BEGIN);
  } else {
    succ = TransmitFile(sock, file, count, 0, NULL, NULL, 0);
  }
  return succ ? 0 : -1;
}


/*
 * For pread
 */

MOE_WINDOWS_INTERNAL ssize_t pread(int fd, void* buf, size_t size, off_t off) {
  HANDLE file = (HANDLE)_get_osfhandle(fd);
  OVERLAPPED o;
  memset(&o, 0, sizeof(o));
  o.Offset = off;
  DWORD ret;
  // TODO: this is not a very concurrent implementation.
  DWORD start = SetFilePointer(file, 0, NULL, FILE_CURRENT);
  if (!ReadFile(file, buf, size, &ret, &o)) {
    SetFilePointer(file, start, NULL, FILE_BEGIN);
    return -1;
  }
  SetFilePointer(file, start, NULL, FILE_BEGIN);
  return ret;
}


/*
 * For pwrite
 */

MOE_WINDOWS_INTERNAL ssize_t pwrite(int fd, const void* buf, size_t size, off_t off) {
  HANDLE file = (HANDLE)_get_osfhandle(fd);
  OVERLAPPED o;
  memset(&o, 0, sizeof(o));
  o.Offset = off;
  DWORD ret;
  // TODO: this is not a very concurrent implementation.
  DWORD start = SetFilePointer(file, 0, NULL, FILE_CURRENT);
  if (!WriteFile(file, buf, size, &ret, &o)) {
    SetFilePointer(file, start, NULL, FILE_BEGIN);
    return -1;
  }
  SetFilePointer(file, start, NULL, FILE_BEGIN);
  return ret;
}


/*
 * For fchmod
 */

#include <sys/stat.h>
#include <fileapi.h>

typedef unsigned short mode_t;
#define PATH_MAX MAX_PATH

MOE_WINDOWS_INTERNAL int fchmod(int fd, mode_t mode) {
    char path[PATH_MAX + 1];
    HANDLE handle = (HANDLE)_get_osfhandle(fd);
    GetFinalPathNameByHandle(handle, path, PATH_MAX, FILE_NAME_OPENED);
    return _chmod(path, mode);
}


/*
 * For mkdir
 */

#include <direct.h>

MOE_WINDOWS_INTERNAL int moe_mkdir(const char * path, mode_t mode) {
    int err = _mkdir(path);
    if (err != 0) {
      return err;
    }
    return _chmod(path, mode);
}

#define mkdir(path, mode) moe_mkdir(path, mode)


/*
 * For sysconf
 */

#define _SC_NPROCESSORS_CONF 0
#define _SC_PAGESIZE 1
#define _SC_PAGE_SIZE _SC_PAGESIZE
#define _SC_CLK_TCK 2
#define _SC_2_CHAR_TERM 0
#define _SC_2_C_BIND 0
#define _SC_2_C_DEV 0
#define _SC_2_FORT_DEV 0
#define _SC_2_FORT_RUN 0
#define _SC_2_LOCALEDEF 0
#define _SC_2_SW_DEV 0
#define _SC_2_UPE 0
#define _SC_2_VERSION 0
#define _SC_AIO_LISTIO_MAX 0
#define _SC_AIO_MAX 0
#define _SC_AIO_PRIO_DELTA_MAX 0
#define _SC_ARG_MAX 0
#define _SC_ASYNCHRONOUS_IO 0
#define _SC_ATEXIT_MAX 0
#define _SC_BC_BASE_MAX 0
#define _SC_BC_DIM_MAX 0
#define _SC_BC_SCALE_MAX 0
#define _SC_BC_STRING_MAX 0
#define _SC_CHILD_MAX 0
#define _SC_COLL_WEIGHTS_MAX 0
#define _SC_DELAYTIMER_MAX 0
#define _SC_EXPR_NEST_MAX 0
#define _SC_FSYNC 0
#define _SC_GETGR_R_SIZE_MAX 0
#define _SC_GETPW_R_SIZE_MAX 0
#define _SC_IOV_MAX 0
#define _SC_JOB_CONTROL 0
#define _SC_LINE_MAX 0
#define _SC_LOGIN_NAME_MAX 0
#define _SC_MAPPED_FILES 0
#define _SC_MEMLOCK 0
#define _SC_MEMLOCK_RANGE 0
#define _SC_MEMORY_PROTECTION 0
#define _SC_MESSAGE_PASSING 0
#define _SC_MQ_OPEN_MAX 0
#define _SC_MQ_PRIO_MAX 0
#define _SC_NGROUPS_MAX 0
#define _SC_NPROCESSORS_ONLN 0
#define _SC_OPEN_MAX 0
#define _SC_PASS_MAX 0
#define _SC_PRIORITIZED_IO 0
#define _SC_PRIORITY_SCHEDULING 0
#define _SC_REALTIME_SIGNALS 0
#define _SC_RE_DUP_MAX 0
#define _SC_RTSIG_MAX 0
#define _SC_SAVED_IDS 0
#define _SC_SEMAPHORES 0
#define _SC_SEM_NSEMS_MAX 0
#define _SC_SEM_VALUE_MAX 0
#define _SC_SHARED_MEMORY_OBJECTS 0
#define _SC_SIGQUEUE_MAX 0
#define _SC_STREAM_MAX 0
#define _SC_SYNCHRONIZED_IO 0
#define _SC_THREADS 0
#define _SC_THREAD_ATTR_STACKADDR 0
#define _SC_THREAD_ATTR_STACKSIZE 0
#define _SC_THREAD_DESTRUCTOR_ITERATIONS 0
#define _SC_THREAD_KEYS_MAX 0
#define _SC_THREAD_PRIORITY_SCHEDULING 0
#define _SC_THREAD_PRIO_INHERIT 0
#define _SC_THREAD_PRIO_PROTECT 0
#define _SC_THREAD_SAFE_FUNCTIONS 0
#define _SC_THREAD_STACK_MIN 0
#define _SC_THREAD_THREADS_MAX 0
#define _SC_TIMERS 0
#define _SC_TIMER_MAX 0
#define _SC_TTY_NAME_MAX 0
#define _SC_TZNAME_MAX 0
#define _SC_VERSION 0
#define _SC_XBS5_ILP32_OFF32 0
#define _SC_XBS5_ILP32_OFFBIG 0
#define _SC_XBS5_LP64_OFF64 0
#define _SC_XBS5_LPBIG_OFFBIG 0
#define _SC_XOPEN_CRYPT 0
#define _SC_XOPEN_ENH_I18N 0
#define _SC_XOPEN_LEGACY 0
#define _SC_XOPEN_REALTIME 0
#define _SC_XOPEN_REALTIME_THREADS 0
#define _SC_XOPEN_SHM 0
#define _SC_XOPEN_UNIX 0
#define _SC_XOPEN_VERSION 0
#define _SC_XOPEN_XCU_VERSION 0


MOE_WINDOWS_INTERNAL long sysconf(int key) {
    if (key == _SC_PAGE_SIZE) {
      SYSTEM_INFO system_info;
      GetSystemInfo (&system_info);
      return system_info.dwAllocationGranularity;
    } else if (key == _SC_NPROCESSORS_CONF) {
      SYSTEM_INFO system_info;
      GetSystemInfo (&system_info);
      return system_info.dwNumberOfProcessors;
    } else if (key == _SC_CLK_TCK) {
      LARGE_INTEGER freq;
      if (!QueryPerformanceFrequency(&freq)) {
        return -1;
      }
      return (long)freq.QuadPart;
    }
    return -1;
}


/*
 * For realpath
 */

MOE_WINDOWS_INTERNAL char* realpath(const char* in_path, char* out_path) {
  const size_t max = MAX_PATH > PATH_MAX ? MAX_PATH : PATH_MAX;
  char* storage;
  if (out_path) {
    storage = out_path;
  } else {
    storage = (char*)_alloca(max);
  }
  DWORD size = GetFullPathName(in_path, max, storage, NULL);
  if (size > 0) {
    return NULL;
  }
  if (!out_path) {
    out_path = (char*)malloc(size);
    memcpy(out_path, storage, size);
  }
  return out_path;
}


/*
 * For fsync
 */

MOE_WINDOWS_INTERNAL int fsync(int fd) {
  HANDLE handle = (HANDLE)_get_osfhandle(fd);
  return FlushFileBuffers(handle) ? 0 : -1;
}


/*
 * For getsockopt
 */

#define getsockopt(socket, level, option_name, option_value, option_len) getsockopt(socket, level, option_name, (char*)option_value, option_len)


/*
 * For unsetenv
 */

MOE_WINDOWS_INTERNAL int unsetenv(const char* name) {
  return _putenv_s(name, "");
}


/*
 * For strsignal
 */

// This could be implemented, but signals are not really supported on Windows.
MOE_WINDOWS_INTERNAL const char* strsignal(int sig) {
  return "";
}


/*
 * For setenv
 */

MOE_WINDOWS_INTERNAL int setenv(const char* name, const char* value, int overwrite) {
  BOOL exists = false;
  if (!overwrite) {
    char* buf;
    _dupenv_s(&buf, NULL, name);
    exists = buf != NULL;
    if (exists) {
      free(buf);
    } 
  }
  if (exists) {
    return _putenv_s(name, value);
  }
  return 0;
}


/*
 * For mkfifo
 */

// This can not be implemented.
MOE_WINDOWS_INTERNAL int mkfifo(const char* path, mode_t mode) {
  // Here is a very basic idea to implement this.
  // But probably this is not going to work, because hardlinks can only refer nodes
  // on the same file system.
  /*size_t len = strlen(path) + 1 + 9; // the last number is for pipe path prefix
  char* buff = (char*) _alloca(len);
  strcpy(buff, "\\\\.\\pipe\\");
  char* p = &buff[9];
  strcpy(p, path);
  while (*p) {
    if (*p == '\\' || *p == '/') {
      *p = '_';
    }
    p++;
  }
  HANDLE pipe = CreateNamedPipe(buff, PIPE_ACCESS_DUPLEX | FILE_FLAG_FIRST_PIPE_INSTANCE,
    PIPE_TYPE_BYTE | PIPE_READMODE_BYTE | PIPE_WAIT | PIPE_ACCEPT_REMOTE_CLIENTS,
    PIPE_UNLIMITED_INSTANCES, 512, 512, 0, NULL);
  if (pipe == INVALID_HANDLE_VALUE) {
    return -1;
  }
  if (!CreateHardLink(path, buff, NULL)) {
    CloseHandle(pipe);
    return -1;
  }
  if (!DeleteFile(buff)) {
    CloseHandle(pipe);
    DeleteFile(path);
    return -1;
  }
  if (chmod(path, mode) != 0) {
    CloseHandle(pipe);
    DeleteFile(path);
    return -1;
  }
  return 0;*/
  return -1;
}


/*
 * For link
 */

MOE_WINDOWS_INTERNAL int link(const char* o, const char* n) {
  return CreateHardLink(n, o, NULL) ? 0 : -1;
}


/*
 * For symlink
 */

MOE_WINDOWS_INTERNAL int symlink(const char* o, const char* n) {
  DWORD dwAttrib = GetFileAttributes(o);
  if (dwAttrib == INVALID_FILE_ATTRIBUTES) {
    return -1;
  }
  DWORD dwFlags = (dwAttrib & FILE_ATTRIBUTE_DIRECTORY) ? SYMBOLIC_LINK_FLAG_DIRECTORY : 0;
  return CreateSymbolicLink(n, o, dwFlags) ? 0 : -1;
}


/*
 * For lchown
 */

// This is very hard to implement and not even used anywhere,
// but still accessible through the Posix wrapper of libcore.
MOE_WINDOWS_INTERNAL int lchown(const char* path, uid_t uid, gid_t gid) {
  return -1;
}


/*
 * For lchown
 */

// This is very hard to implement and not even used anywhere,
// but still accessible through the Posix wrapper of libcore.
MOE_WINDOWS_INTERNAL int fchown(int fd, uid_t uid, gid_t gid) {
  return -1;
}


/*
 * For chown
 */

// This is very hard to implement and not even used anywhere,
// but still accessible through the Posix wrapper of libcore.
MOE_WINDOWS_INTERNAL int chown(const char* path, uid_t uid, gid_t gid) {
  return -1;
}


/*
 * For readlink
 */

MOE_WINDOWS_INTERNAL ssize_t readlink(const char* path, char* buf, size_t buflen) {
  OFSTRUCT of;
  HFILE file = OpenFile(path, &of, OF_READ);
  if (file == HFILE_ERROR) {
    return -1;
  }
  char temp[PATH_MAX + 1];
  DWORD size = GetFinalPathNameByHandle((HANDLE)file, temp, PATH_MAX, FILE_NAME_NORMALIZED);
  CloseHandle((HANDLE)file);
  if (!temp[size - 1]) {
    size--;
  }
  memcpy(buf, temp, buflen < size ? buflen : size);
  return 0;
}
