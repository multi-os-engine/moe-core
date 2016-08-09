project(android.system.core.base)

add_library(android.system.core.base STATIC ../../../../../system/core/base/logging.cpp ../../../../../system/core/base/file.cpp ../../../../../system/core/base/strings.cpp ../../../../../system/core/base/stringprintf.cpp)

set_target_properties(android.system.core.base PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")

target_compile_definitions(android.system.core.base PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN NDEBUG)

target_include_directories(android.system.core.base SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../system/core/include" "${PROJECT_SOURCE_DIR}/../../../../../libnativehelper/include/nativehelper" ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

target_include_directories(android.system.core.base PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../system/core/base/include")

