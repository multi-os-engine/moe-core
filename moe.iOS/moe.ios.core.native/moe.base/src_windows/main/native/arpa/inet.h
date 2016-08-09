#ifndef DLFCN_H
#define DLFCN_H

#include <ws2tcpip.h>

MOE_WINDOWS_INTERNAL int inet_aton(const char* addr, struct in_addr* buf) {
  return InetPton(AF_INET, addr, buf);
}

#endif