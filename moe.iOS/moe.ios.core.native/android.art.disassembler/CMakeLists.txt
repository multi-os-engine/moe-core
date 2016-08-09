project(android.art.disassembler)

add_library(android.art.disassembler STATIC ../../../../../art/disassembler/disassembler.cc ../../../../../art/disassembler/disassembler_mips.cc ../../../../../art/disassembler/disassembler_arm64.cc ../../../../../art/disassembler/disassembler_arm.cc ../../../../../art/disassembler/disassembler_x86.cc)

set_target_properties(android.art.disassembler PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")

target_compile_definitions(android.art.disassembler PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN MOE_NDEBUG SEVERITY_LEVEL=$(SEVERITY_LEVEL) IMT_SIZE=64 ART_DEFAULT_GC_TYPE_IS_CMS=1)

target_include_directories(android.art.disassembler SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../art/runtime" "${PROJECT_SOURCE_DIR}/../../../../../libnativehelper/include/nativehelper" ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

target_include_directories(android.art.disassembler PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../external/vixl/src")

