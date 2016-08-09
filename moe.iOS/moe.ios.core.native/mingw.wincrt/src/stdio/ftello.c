#include <stdio.h>

// MOE ADDED -- BEGIN
#include "_mingw_off_t.h"
// MOE ADDED -- END

_off_t ftello(FILE * stream){
  return (_off_t) ftello64(stream);
}
