/*
 * Copyright (c) 2014-2016, Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef MOE_iOS_MOE_Common_h
#define MOE_iOS_MOE_Common_h

#ifdef _WIN32
// Built-in __builtin_expect is not yet supported by Clang/C2.
#define __builtin_expect(v, l) (v)

// Pull-in MinGW specific implementations wherever it is possible.
#define __MINGW32__

#define _USE_32BIT_TIME_T
#define MOE_WINDOWS
#define _WIN32_WINNT 0x600
#define WINVER 0x600
#define _POSIX_SOURCE
#define MOE_WINDOWS_INTERNAL static inline __attribute__((always_inline)) __attribute__((visibility ("hidden")))
#ifdef __cplusplus
#define MOE_WINDOWS_EXTERN_DECL extern "C"
#else
#define MOE_WINDOWS_EXTERN_DECL
#endif
#define __STDC__ 0
#include <intrin.h>
#include "Windows-Compatibility.h"
#define MOE_WINDOWS_DLL "moe.sdk.dll"
#if _WIN64
#define __LP64__ 1
#endif
#undef ERROR
#undef interface
#undef IN
#endif

#ifndef _WIN32
#include <TargetConditionals.h>
#include <Availability.h>
#endif
#include <stdio.h>
#include <errno.h>

//#define U_DISABLE_RENAMING 1

#ifndef _WIN32
# if !defined(__IPHONE_8_0) && !defined(MOE_COMPILER)
# warning "This project uses features only available in iOS 8.0 and later."
# endif
#endif

#ifdef __arm__
#define __ARM_ARCH_7__
#define __ARM_ARCH__ 7
#endif

#include "AndroidConfig.h"

#define MOE_ARCH_ARM    TARGET_CPU_ARM
#define MOE_ARCH_ARM64  TARGET_CPU_ARM64
#define MOE_ARCH_X86    TARGET_CPU_X86
#define MOE_ARCH_X86_64 TARGET_CPU_X86_64

#ifdef DEBUG
#define MOE_LOG_FUNCTION_NOT_SUPPORTED { fprintf(stderr, "Function '%s' not supported by MOE!\n", __func__); errno = EPERM; }
#define VERY_VERBOSE_LOG 1
#else
#define MOE_LOG_FUNCTION_NOT_SUPPORTED { errno = EPERM; }
#endif

#define MOE_UNSUPPORTED_MESSAGE(name) "" #name " is unsupported on this platform!"

// Disable checks to avoid overhead
#ifndef NDEBUG
#define NDEBUG
#endif

/* Missing from unistd.h */
/* Used to retry syscalls that can return EINTR. */
#define TEMP_FAILURE_RETRY(exp) ({         \
decltype (exp) _rc;                      \
do {                                   \
_rc = (exp);                       \
} while (_rc == -1 && errno == EINTR); \
_rc; })

#define ATRACE_ENABLED() false
#define ATRACE_BEGIN(unused)
#define ATRACE_END()
#define ATRACE_INT(unused1, unused2)

// Comment this out for tvOS or watchOS support.
#define MOE_DEX2OAT_ENABLE_IMPLICIT_EXCEPTION

#endif /* MOE_iOS_MOE_Common_h */
