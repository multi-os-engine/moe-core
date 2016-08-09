project(android.external.zlib)

add_library(android.external.zlib STATIC ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/adler32.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/compress.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/crc32.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/deflate.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/gzclose.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/gzlib.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/gzread.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/gzwrite.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/infback.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/inflate.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/inftrees.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/inffast.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/trees.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/uncompr.c ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src/zutil.c)

set_target_properties(android.external.zlib PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")

target_compile_definitions(android.external.zlib PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN MOE_NDEBUG)

target_include_directories(android.external.zlib SYSTEM PRIVATE ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native ${PROJECT_SOURCE_DIR}/../../../../../external/zlib/src ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include)

