project(android.external.javasqlite)

add_library(android.external.javasqlite STATIC ../../../../../external/javasqlite/src/main/native/sqlite_jni.c)

set_target_properties(android.external.javasqlite PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")

target_compile_definitions(android.external.javasqlite PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN NDEBUG U_I18N_IMPLEMENTATION U_COMMON_IMPLEMENTATION)

target_include_directories(android.external.javasqlite SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../external/javasqlite/src/main/native" "${PROJECT_SOURCE_DIR}/../../../../../libnativehelper/include/nativehelper" ${PROJECT_SOURCE_DIR}/../../../../../external/sqlite/dist ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

