project(android.external.sqlite)

add_library(android.external.sqlite STATIC ${PROJECT_SOURCE_DIR}/../../../../../external/sqlite/dist/sqlite3.c)

set_target_properties(android.external.sqlite PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")

target_compile_definitions(android.external.sqlite PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN MOE_NDEBUG)

target_include_directories(android.external.sqlite SYSTEM PRIVATE ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../../../../../external/icu/android_utils/include ${PROJECT_SOURCE_DIR}/../../../../../external/sqlite/android ${PROJECT_SOURCE_DIR}/../../../../../external/sqlite/dist ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include)

