/*
   Copyright (c) 2013 mingw-w64 project
   Copyright (c) 2015 Intel Corporation

   Permission is hereby granted, free of charge, to any person obtaining a
   copy of this software and associated documentation files (the "Software"),
   to deal in the Software without restriction, including without limitation
   the rights to use, copy, modify, merge, publish, distribute, sublicense,
   and/or sell copies of the Software, and to permit persons to whom the
   Software is furnished to do so, subject to the following conditions:

   The above copyright notice and this permission notice shall be included in
   all copies or substantial portions of the Software.

   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
   FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
   DEALINGS IN THE SOFTWARE.
*/

#include "pthread.h"

// MOE ADDED -- BEGIN
#include <windows.h>
// MOE ADDED -- END

#define likely(cond) __builtin_expect((cond) != 0, 1)
#define unlikely(cond) __builtin_expect((cond) != 0, 0)

/* We use the pthread_spinlock_t itself as a lock:
   -1 is free, 0 is locked.
   (This is dictated by PTHREAD_SPINLOCK_INITIALIZER, which we can't change
   without breaking binary compatibility.) */
typedef intptr_t spinlock_word_t;

int
pthread_spin_init (pthread_spinlock_t *lock, int pshared)
{
  spinlock_word_t *lk = (spinlock_word_t *)lock;
  *lk = -1;
  return 0;
}


int
pthread_spin_destroy (pthread_spinlock_t *lock)
{
  return 0;
}

int
pthread_spin_lock (pthread_spinlock_t *lock)
{
  volatile spinlock_word_t *lk = (volatile spinlock_word_t *)lock;
// MOE ADDED -- BEGIN
//  while (unlikely(__sync_lock_test_and_set(lk, 0) == 0))
  while (unlikely(InterlockedExchangePointer(lk, 0) == 0))
// MOE ADDED -- END
    do {
// MOE ADDED -- BEGIN
//      asm("pause" ::: "memory");
      SwitchToThread();
// MOE ADDED -- BEGIN
    } while (*lk == 0);
  return 0;
}
  
int
pthread_spin_trylock (pthread_spinlock_t *lock)
{
  spinlock_word_t *lk = (spinlock_word_t *)lock;
// MOE ADDED -- BEGIN
//  return __sync_lock_test_and_set(lk, 0) == 0 ? EBUSY : 0;
  return InterlockedExchangePointer(lk, 0) == 0 ? EBUSY : 0;
// MOE ADDED -- END
}


int
pthread_spin_unlock (pthread_spinlock_t *lock)
{
  volatile spinlock_word_t *lk = (volatile spinlock_word_t *)lock;
  *lk = -1;
  return 0;
}
