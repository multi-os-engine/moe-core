#ifndef DLFCN_H
#define DLFCN_H

#define RTLD_NOW 0
#define RTLD_LAZY 1
#define RTLD_GLOBAL 2

#define RTLD_DEFAULT ((void*)0)

#include <psapi.h>

MOE_WINDOWS_INTERNAL void* dlopen(const char* path, int mode) {
  if (path == NULL) {
    return GetModuleHandle(NULL);
  }
  return LoadLibrary(path);
}

// Borrowed from NatJ
MOE_WINDOWS_INTERNAL void* getProc(HMODULE module, LPCSTR name) {
  if (module != NULL) {
    return (void*)GetProcAddress(module, name);
  }

  HANDLE hProcess = GetCurrentProcess();
  DWORD cbNeeded;
  if (!EnumProcessModules(hProcess, NULL, 0, &cbNeeded)) {
    return NULL;
  }
  HMODULE* hMods = (HMODULE*)alloca(cbNeeded);
  EnumProcessModules(hProcess, hMods, cbNeeded, &cbNeeded);

  for (uint32_t i = 0; i < (cbNeeded / sizeof(HMODULE)); i++) {
    FARPROC proc = GetProcAddress(hMods[i], name);
    if (proc != NULL) return (void*)proc;
  }
  return NULL;
}

MOE_WINDOWS_INTERNAL void* dlsym(void* handle, const char* symbol) {
	return getProc((HMODULE)handle, (LPCSTR)symbol);
}


/*
 * These below are not used, thus not needed to implement.
 */

MOE_WINDOWS_INTERNAL int dlclose(void* handle) {
	return 0;
}

MOE_WINDOWS_INTERNAL char* dlerror() {
	return NULL;
}

#endif