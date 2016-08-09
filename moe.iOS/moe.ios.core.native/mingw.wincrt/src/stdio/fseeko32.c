/*non-standard*/
#include <stdio.h>

// MOE ADDED -- BEGIN
#include "_mingw_off_t.h"
// MOE ADDED -- END

int fseeko(FILE* stream, _off_t offset, int whence){
  _off64_t off = offset;
  return fseeko64(stream,off,whence);
}
