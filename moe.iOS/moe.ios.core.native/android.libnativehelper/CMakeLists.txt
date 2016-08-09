project(android.libnativehelper)

add_library(android.libnativehelper STATIC ../../../../../libnativehelper/AsynchronousCloseMonitor.cpp ../../../../../libnativehelper/JniInvocation.cpp ../../../../../libnativehelper/JniConstants.cpp ../../../../../libnativehelper/JNIHelp.cpp ../../../../../libnativehelper/toStringArray.cpp)

set_target_properties(android.libnativehelper PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")

target_compile_definitions(android.libnativehelper PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN NDEBUG)

target_include_directories(android.libnativehelper SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../system/core/include" ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

target_include_directories(android.libnativehelper PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../libnativehelper/include/nativehelper" "${PROJECT_SOURCE_DIR}/../../../../../libcore/include")

