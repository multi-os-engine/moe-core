project(android.art.dalvikvm)

add_library(android.art.dalvikvm STATIC ../../../../../art/dalvikvm/dalvikvm.cc)

set_target_properties(android.art.dalvikvm PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")

target_compile_definitions(android.art.dalvikvm PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN NDEBUG DVM_NO_ASM_INTERP)

target_include_directories(android.art.dalvikvm SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../art" "${PROJECT_SOURCE_DIR}/../../../../../dalvik/vm" "${PROJECT_SOURCE_DIR}/../../../../../libcore/include" "${PROJECT_SOURCE_DIR}/../../../../../libnativehelper/include/nativehelper" "${PROJECT_SOURCE_DIR}/../../../../../system/core/include" ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

target_include_directories(android.art.dalvikvm PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../bionic/libc/arch-arm/include")

