project(android.system.core.libziparchive)

add_library(android.system.core.libziparchive STATIC ../../../../../system/core/libziparchive/zip_writer.cc ../../../../../system/core/libziparchive/zip_archive.cc)

set_target_properties(android.system.core.libziparchive PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/src/main/native/LibZipArchive-Prefix.pch")

target_compile_definitions(android.system.core.libziparchive PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN NDEBUG)

target_include_directories(android.system.core.libziparchive SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../system/core/include" "${PROJECT_SOURCE_DIR}/../../../../../libnativehelper/include/nativehelper" ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native ${PROJECT_SOURCE_DIR}/../../../../../external/zlib ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

target_include_directories(android.system.core.libziparchive PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../system/core/base/include")

