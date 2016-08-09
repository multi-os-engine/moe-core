#ifndef SYS_UIO_H
#define SYS_UIO_H

#include <ws2tcpip.h>
#include <winsock2.h>

struct iovec {
  u_long iov_len;
  void* iov_base;
};

MOE_WINDOWS_INTERNAL ssize_t writev(int sock, const struct iovec* buf, int count) {
  DWORD sent;
  if (WSASend(sock, (LPWSABUF)buf, count, &sent, 0, NULL, NULL) != 0) {
    return -1;
  }
  return sent;
}

MOE_WINDOWS_INTERNAL ssize_t readv(int sock, const struct iovec* buf, int count) {
  DWORD received;
  if (WSARecv(sock, (LPWSABUF)buf, count, &received, 0, NULL, NULL) != 0) {
    return -1;
  }
  return received;
}

#endif
