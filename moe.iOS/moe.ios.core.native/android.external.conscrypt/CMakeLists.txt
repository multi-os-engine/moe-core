project(android.external.conscrypt)

add_library(android.external.conscrypt STATIC ../../../../../external/conscrypt/src/main/native/org_conscrypt_NativeCrypto.cpp)

set_target_properties(android.external.conscrypt PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/src/main/native/Conscrypt-Prefix.pch")

target_compile_definitions(android.external.conscrypt PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN NDEBUG JNI_JARJAR_PREFIX=com/android/)

target_include_directories(android.external.conscrypt SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../libnativehelper/include/nativehelper" "${PROJECT_SOURCE_DIR}/../../../../../system/core/include" "${PROJECT_SOURCE_DIR}/../../../../../external/openssl/include" ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

target_include_directories(android.external.conscrypt PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../libcore/luni/src/main/native" "${PROJECT_SOURCE_DIR}/../../../../../libcore/include" "${PROJECT_SOURCE_DIR}/../../../../../external/openssl")

