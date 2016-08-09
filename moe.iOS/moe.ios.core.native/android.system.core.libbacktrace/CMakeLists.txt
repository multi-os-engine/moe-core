project(android.system.core.libbacktrace)

add_library(android.system.core.libbacktrace STATIC ../../../../../system/core/libbacktrace/Backtrace.cpp ../../../../../system/core/libbacktrace/BacktraceCurrent.cpp ../../../../../system/core/libbacktrace/UnwindCurrent.cpp ../../../../../system/core/libbacktrace/BacktraceMap.cpp ../../../../../system/core/libbacktrace/thread_utils.c)

set_target_properties(android.system.core.libbacktrace PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")

target_compile_definitions(android.system.core.libbacktrace PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN NDEBUG)

target_include_directories(android.system.core.libbacktrace SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../system/core/include" "${PROJECT_SOURCE_DIR}/../../../../../system/core/base/include" "${PROJECT_SOURCE_DIR}/../../../../../libnativehelper/include/nativehelper" ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

