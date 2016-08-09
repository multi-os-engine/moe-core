/**
 * This file has no copyright assigned and is placed in the Public Domain.
 * This file is part of the mingw-w64 runtime package.
 * No warranty is given; refer to the file DISCLAIMER.PD within this package.
 */
#include <io.h>

// MOE ADDED -- BEGIN
#include "_mingw_off_t.h"
// MOE ADDED -- END

_off64_t lseek64(int fd,_off64_t offset, int whence) 
{
  return _lseeki64(fd, (_off64_t) offset, whence);
}

