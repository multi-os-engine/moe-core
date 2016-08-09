project(android.system.core.libutils)

add_library(android.system.core.libutils STATIC ../../../../../system/core/libutils/FileMap.cpp)

set_target_properties(android.system.core.libutils PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/src/main/native/LibUtils-Prefix.pch")

target_compile_definitions(android.system.core.libutils PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN NDEBUG)

target_include_directories(android.system.core.libutils SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../system/core/include" "${PROJECT_SOURCE_DIR}/../../../../../libnativehelper/include/nativehelper" ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

