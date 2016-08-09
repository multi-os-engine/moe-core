#include <stdint.h>
#include <stdlib.h>
#include <windows.h>
#include <sddl.h>

#include <iostream>
#include <iomanip>
#include <memory>

// This was taken from here:
// http://stackoverflow.com/questions/1594746/win32-equivalent-of-getuid

struct heap_delete
{
 typedef LPVOID pointer;
 void operator()(LPVOID p)
 {
  ::HeapFree(::GetProcessHeap(), 0, p);
 }
};
typedef std::unique_ptr<LPVOID, heap_delete> heap_unique_ptr;

struct handle_delete
{
 typedef HANDLE pointer;
 void operator()(HANDLE p)
 {
  ::CloseHandle(p);
 }
};
typedef std::unique_ptr<HANDLE, handle_delete> handle_unique_ptr;

typedef uint32_t uid_t;
typedef uint32_t gid_t;

static BOOL GetSID(TOKEN_INFORMATION_CLASS token_class, HANDLE token, PSID* sid)
{
 if (
  token == nullptr || token == INVALID_HANDLE_VALUE
  || sid == nullptr
  )
 {
  SetLastError(ERROR_INVALID_PARAMETER);
  return FALSE;
 }
 DWORD tokenInformationLength = 0;
 ::GetTokenInformation(
  token, token_class, nullptr, 0, &tokenInformationLength);
 if (GetLastError() != ERROR_INSUFFICIENT_BUFFER)
 {
  return FALSE;
 }
 heap_unique_ptr data(
  ::HeapAlloc(
   ::GetProcessHeap(), HEAP_ZERO_MEMORY,
   tokenInformationLength));
 if (data.get() == nullptr)
 {
  return FALSE;
 }
 BOOL getTokenInfo = ::GetTokenInformation(
  token, token_class, data.get(),
  tokenInformationLength, &tokenInformationLength);
 if (!getTokenInfo)
 {
  return FALSE;
 }
 PSID foundSid;
 if (token_class == TokenUser) {
  PTOKEN_USER pTokenUser = (PTOKEN_USER)(data.get());
  foundSid = pTokenUser->User.Sid;
 }
 else if (token_class == TokenPrimaryGroup) {
  PTOKEN_PRIMARY_GROUP pTokenPGroup = (PTOKEN_PRIMARY_GROUP)(data.get());
  foundSid = pTokenPGroup->PrimaryGroup;
 }
 else {
  return FALSE;
 }
 DWORD sidLength = ::GetLengthSid(foundSid);
 heap_unique_ptr sidPtr(
  ::HeapAlloc(
   GetProcessHeap(), HEAP_ZERO_MEMORY, sidLength));
 PSID sidL = (PSID)(sidPtr.get());
 if (sidL == nullptr)
 {
  return FALSE;
 }
 BOOL copySid = ::CopySid(sidLength, sidL, foundSid);
 if (!copySid)
 {
  return FALSE;
 }
 if (!IsValidSid(sidL))
 {
  return FALSE;
 }
 *sid = sidL;
 sidPtr.release();
 return TRUE;
}

static uint32_t GetID(TOKEN_INFORMATION_CLASS token_class, HANDLE token)
{
 PSID sid = nullptr;
 BOOL getSID = GetSID(token_class, token, &sid);
 if (!getSID || !sid)
 {
  return -1;
 }
 heap_unique_ptr sidPtr((LPVOID)(sid));
 LPWSTR stringSid = nullptr;
 BOOL convertSid = ::ConvertSidToStringSidW(
  sid, &stringSid);
 if (!convertSid)
 {
  return -1;
 }
 heap_unique_ptr stringSidPtr(stringSid);
 uint32_t ret = -1;
 LPCWSTR p = ::wcsrchr(stringSid, L'-');
 if (p && ::iswdigit(p[1]))
 {
  ++p;
  ret = ::_wtoi(p);
 }
 return ret;
}

// MOE Added  BEGIN

HANDLE getProcessToken(BOOL readOnly) {
 HANDLE process = ::GetCurrentProcess();
 handle_unique_ptr processPtr(process);
 HANDLE token;
 BOOL openToken = ::OpenProcessToken(
  process, readOnly ? TOKEN_READ | TOKEN_QUERY_SOURCE : TOKEN_ALL_ACCESS, &token);
 if (!openToken) {
  return nullptr;
 }
 return token;
}

HANDLE getThreadToken(BOOL readOnly) {
 HANDLE process = ::GetCurrentProcess();
 handle_unique_ptr processPtr(process);
 HANDLE thread = ::GetCurrentThread(); // We don't need do close this handle.
 HANDLE token;
 BOOL openToken = ::OpenThreadToken(
  thread, TOKEN_READ | TOKEN_QUERY_SOURCE, FALSE, &token);
 if (!openToken && ::GetLastError() == ERROR_NO_TOKEN)
 {
  openToken = ::OpenThreadToken(
   thread, TOKEN_READ | TOKEN_QUERY_SOURCE, TRUE, &token);
  if (!openToken && ::GetLastError() == ERROR_NO_TOKEN)
  {
   openToken = ::OpenProcessToken(
    process, TOKEN_READ | TOKEN_QUERY_SOURCE, &token);
  }
 }
 if (!openToken) {
  return nullptr;
 }
 return token;
}

// MOE Added END

uint32_t GetIntID(TOKEN_INFORMATION_CLASS token_class, BOOL process)
{
 HANDLE token = process ? getProcessToken(TRUE) : getThreadToken(TRUE);
 if (!token)
 {
  return -1;
 }
 handle_unique_ptr tokenPtr(token);
 uid_t ret = GetID(token_class, token);
 return ret;
}

// MOE Added BEGIN

static BOOL SetSID(TOKEN_INFORMATION_CLASS token_class, HANDLE token, PSID sid)
{
 if (
  token == nullptr || token == INVALID_HANDLE_VALUE
  || sid == nullptr || !IsValidSid(sid)
  )
 {
  SetLastError(ERROR_INVALID_PARAMETER);
  return FALSE;
 }

 size_t tokenInformationLength;
 if (token_class == TokenUser) {
  tokenInformationLength = sizeof(TOKEN_USER);
 }
 else if (token_class == TokenPrimaryGroup) {
  tokenInformationLength = sizeof(TOKEN_PRIMARY_GROUP);
 }
 else {
  return FALSE;
 }

 heap_unique_ptr data(::HeapAlloc(
  GetProcessHeap(), HEAP_ZERO_MEMORY, tokenInformationLength));
 if (data.get() == nullptr) {
  return FALSE;
 }

 if (token_class == TokenUser) {
  PTOKEN_USER pTokenUser = (PTOKEN_USER)(data.get());
  pTokenUser->User.Sid = sid;
 }
 else if (token_class == TokenPrimaryGroup) {
  PTOKEN_PRIMARY_GROUP pTokenPGroup = (PTOKEN_PRIMARY_GROUP)(data.get());
  pTokenPGroup->PrimaryGroup = sid;
 }

 return ::SetTokenInformation(
  token, token_class, data.get(), tokenInformationLength);
}

static uint32_t SetID(TOKEN_INFORMATION_CLASS token_class, HANDLE token, uint32_t value)
{
 PSID sid = nullptr;
 BOOL getSID = GetSID(token_class, token, &sid);
 if (!getSID || !sid)
 {
  return -1;
 }
 heap_unique_ptr sidPtr((LPVOID)(sid));
 LPWSTR stringSid = nullptr;
 BOOL convertSid = ::ConvertSidToStringSidW(
  sid, &stringSid);
 if (!convertSid)
 {
  return -1;
 }
 heap_unique_ptr stringSidPtr(stringSid);
 LPCWSTR p = ::wcsrchr(stringSid, L'-');
 if (p && ::iswdigit(p[1]))
 {
  ++p;
  int digits = (int)floor(log10(abs((int)value))) + 1;
  size_t prefixLen = p - stringSid;
  size_t len = prefixLen + digits + 1;
  heap_unique_ptr newSidStringPtr(
   ::HeapAlloc(
    ::GetProcessHeap(), HEAP_ZERO_MEMORY,
    len));
  if (newSidStringPtr.get() == nullptr) {
   return -1;
  }
  wchar_t* newSidString = (wchar_t*)(newSidStringPtr.get());
  wcsncpy_s(newSidString, prefixLen + 1, stringSid, prefixLen);
  ::_itow_s(value, &newSidString[prefixLen], digits + 1, 10);
  PSID newSid;
  if (!::ConvertStringSidToSidW(newSidString, &newSid)) {
   return -1;
  }
  heap_unique_ptr newSidPtr(newSid);
  return SetSID(token_class, token, newSid);
 } else {
  return -1;
 }
}

int SetIntID(TOKEN_INFORMATION_CLASS token_class, BOOL process, uint32_t value)
{
 HANDLE token = process ? getProcessToken(TRUE) : getThreadToken(TRUE);
 if (!token)
 {
  return -1;
 }
 handle_unique_ptr tokenPtr(token);
 return SetID(token_class, token, value);
}

extern "C" uid_t getuid() {
 return (uid_t)GetIntID(TokenUser, TRUE);
}

extern "C" uid_t geteuid() {
 return (uid_t)GetIntID(TokenUser, FALSE);
}

extern "C" gid_t getgid() {
 return (gid_t)GetIntID(TokenPrimaryGroup, TRUE);
}

extern "C" gid_t getegid() {
 return (gid_t)GetIntID(TokenPrimaryGroup, FALSE);
}

extern "C" int setuid(uid_t value) {
 // TODO: re-enable this when it's done.
 //return SetIntID(TokenUser, TRUE, value);
 return -1;
}

extern "C" int seteuid(uid_t value) {
 // TODO: re-enable this when it's done.
 //return SetIntID(TokenUser, FALSE, value);
 return -1;
}

extern "C" int setgid(gid_t value) {
 // TODO: re-enable this when it's done.
 //return SetIntID(TokenPrimaryGroup, TRUE, value);
 return -1;
}

extern "C" int setegid(gid_t value) {
 // TODO: re-enable this when it's done.
 //return SetIntID(TokenPrimaryGroup, FALSE, value);
 return -1;
}

// MOE Added END

// This part was taken from:
// https://gist.github.com/hasegawayosuke/252992

#include <tlhelp32.h>

extern "C" pid_t getppid()
{
 HANDLE hSnapshot = INVALID_HANDLE_VALUE;
 PROCESSENTRY32 pe32;
 DWORD ppid = 0, pid = GetCurrentProcessId();

 hSnapshot = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, 0);
 if (hSnapshot == INVALID_HANDLE_VALUE) return ppid;

 ZeroMemory(&pe32, sizeof(pe32));
 pe32.dwSize = sizeof(pe32);
 if (!Process32First(hSnapshot, &pe32)) return ppid;

 do {
  if (pe32.th32ProcessID == pid) {
   ppid = pe32.th32ParentProcessID;
   break;
  }
 } while (Process32Next(hSnapshot, &pe32));

 if (hSnapshot != INVALID_HANDLE_VALUE) CloseHandle(hSnapshot);
 return (pid_t)ppid;
}

// This part was taken from:
// https://msdn.microsoft.com/en-us/library/windows/desktop/aa390423(v=vs.85).aspx

#include <sys/utsname.h>

#define interface struct
#include <comutil.h>
#include <wbemidl.h>

extern "C" int uname(utsname* utsname) {
 HRESULT hres;

 // Step 1: --------------------------------------------------
 // Initialize COM. ------------------------------------------

 hres = CoInitializeEx(0, COINIT_MULTITHREADED);
 if (FAILED(hres))
 {
  return -1;                  // Program has failed.
 }

 // Step 2: --------------------------------------------------
 // Set general COM security levels --------------------------

 hres = CoInitializeSecurity(
  NULL,
  -1,                          // COM authentication
  NULL,                        // Authentication services
  NULL,                        // Reserved
  RPC_C_AUTHN_LEVEL_DEFAULT,   // Default authentication
  RPC_C_IMP_LEVEL_IMPERSONATE, // Default Impersonation
  NULL,                        // Authentication info
  EOAC_NONE,                   // Additional capabilities
  NULL                         // Reserved
  );


 if (FAILED(hres))
 {
  CoUninitialize();
  return -1;                    // Program has failed.
 }

 // Step 3: ---------------------------------------------------
 // Obtain the initial locator to WMI -------------------------

 IWbemLocator *pLoc = NULL;

 hres = CoCreateInstance(
  CLSID_WbemLocator,
  0,
  CLSCTX_INPROC_SERVER,
  IID_IWbemLocator, (LPVOID *)&pLoc);

 if (FAILED(hres))
 {
  CoUninitialize();
  return -1;                 // Program has failed.
 }

 // Step 4: -----------------------------------------------------
 // Connect to WMI through the IWbemLocator::ConnectServer method

 IWbemServices *pSvc = NULL;

 // Connect to the root\cimv2 namespace with
 // the current user and obtain pointer pSvc
 // to make IWbemServices calls.
 hres = pLoc->ConnectServer(
  _bstr_t(L"ROOT\\CIMV2"), // Object path of WMI namespace
  NULL,                    // User name. NULL = current user
  NULL,                    // User password. NULL = current
  0,                       // Locale. NULL indicates current
  NULL,                    // Security flags.
  0,                       // Authority (for example, Kerberos)
  0,                       // Context object
  &pSvc                    // pointer to IWbemServices proxy
  );

 if (FAILED(hres))
 {
  pLoc->Release();
  CoUninitialize();
  return -1;                // Program has failed.
 }

 // Step 5: --------------------------------------------------
 // Set security levels on the proxy -------------------------

 hres = CoSetProxyBlanket(
  pSvc,                        // Indicates the proxy to set
  RPC_C_AUTHN_WINNT,           // RPC_C_AUTHN_xxx
  RPC_C_AUTHZ_NONE,            // RPC_C_AUTHZ_xxx
  NULL,                        // Server principal name
  RPC_C_AUTHN_LEVEL_CALL,      // RPC_C_AUTHN_LEVEL_xxx
  RPC_C_IMP_LEVEL_IMPERSONATE, // RPC_C_IMP_LEVEL_xxx
  NULL,                        // client identity
  EOAC_NONE                    // proxy capabilities
  );

 if (FAILED(hres))
 {
  pSvc->Release();
  pLoc->Release();
  CoUninitialize();
  return -1;               // Program has failed.
 }

 // Step 6: --------------------------------------------------
 // Use the IWbemServices pointer to make requests of WMI ----

 // For example, get the name of the operating system
 IEnumWbemClassObject* pEnumerator = NULL;
 hres = pSvc->ExecQuery(
  bstr_t("WQL"),
  bstr_t("SELECT * FROM Win32_OperatingSystem"),
  WBEM_FLAG_FORWARD_ONLY | WBEM_FLAG_RETURN_IMMEDIATELY,
  NULL,
  &pEnumerator);

 if (FAILED(hres))
 {
  pSvc->Release();
  pLoc->Release();
  CoUninitialize();
  return -1;               // Program has failed.
 }

 // Step 7: -------------------------------------------------
 // Get the data from the query in step 6 -------------------

 IWbemClassObject *pclsObj = NULL;
 ULONG uReturn = 0;

 const wchar_t* winNames[] = { L"Caption", L"CSName", L"Version", L"BuildNumber", L"OSArchitecture" };

 if (pEnumerator)
 {
  HRESULT hr = pEnumerator->Next(WBEM_INFINITE, 1,
   &pclsObj, &uReturn);

  if (0 == uReturn)
  {
   pSvc->Release();
   pLoc->Release();
   pEnumerator->Release();
   CoUninitialize();

   return -1;
  }

  VARIANT vtProp;

  // Get the value of the Name property
  {
   char* p = (char *)utsname;
   for (const wchar_t* name : winNames) {
    hr = pclsObj->Get(name, 0, &vtProp, 0, 0);
    wchar_t* src;
    if (wcscmp(L"Caption", name) == 0) {
        src = wcsstr(vtProp.bstrVal, L"Windows");
    } else {
        src = vtProp.bstrVal;
    }
    int err = wcstombs_s(NULL, p, _SYS_NAMELEN - 1, src, _SYS_NAMELEN - 1);
    if (err) {
     VariantClear(&vtProp);
     pclsObj->Release();

     pSvc->Release();
     pLoc->Release();
     pEnumerator->Release();
     CoUninitialize();

     return -1;
    }
    VariantClear(&vtProp);
    p += _SYS_NAMELEN;
   }
  }

  pclsObj->Release();
 }

 // Cleanup
 // ========

 pSvc->Release();
 pLoc->Release();
 pEnumerator->Release();
 CoUninitialize();

 return 0;   // Program successfully completed.
}
