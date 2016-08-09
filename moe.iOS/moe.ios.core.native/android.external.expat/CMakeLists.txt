project(android.external.expat)

add_library(android.external.expat STATIC ../../../../../external/expat/lib/xmlparse.c ../../../../../external/expat/lib/xmltok.c ../../../../../external/expat/lib/xmlrole.c)

set_target_properties(android.external.expat PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")

target_compile_definitions(android.external.expat PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN NDEBUG HAVE_EXPAT_CONFIG_H)

target_include_directories(android.external.expat SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../external/expat" ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

