project(android.external.vixl)

add_library(android.external.vixl STATIC ../../../../../external/vixl/src/vixl/a64/assembler-a64.cc ../../../../../external/vixl/src/vixl/a64/instrument-a64.cc ../../../../../external/vixl/src/vixl/a64/macro-assembler-a64.cc ../../../../../external/vixl/src/vixl/a64/disasm-a64.cc ../../../../../external/vixl/src/vixl/compiler-intrinsics.cc ../../../../../external/vixl/src/vixl/a64/cpu-a64.cc ../../../../../external/vixl/src/vixl/a64/instructions-a64.cc ../../../../../external/vixl/src/vixl/a64/logic-a64.cc ../../../../../external/vixl/src/vixl/utils.cc ../../../../../external/vixl/src/vixl/a64/debugger-a64.cc ../../../../../external/vixl/src/vixl/a64/simulator-a64.cc ../../../../../external/vixl/src/vixl/code-buffer.cc ../../../../../external/vixl/src/vixl/a64/decoder-a64.cc)

set_target_properties(android.external.vixl PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")

target_compile_definitions(android.external.vixl PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN MOE_NDEBUG)

target_include_directories(android.external.vixl SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../external/vixl/src" ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

