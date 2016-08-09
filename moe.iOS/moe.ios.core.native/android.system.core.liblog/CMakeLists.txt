project(android.system.core.liblog)

add_library(android.system.core.liblog STATIC ../../../../../system/core/liblog/fake_log_device.c ../../../../../system/core/liblog/logd_write.c ../../../../../system/core/liblog/event_tag_map.c)

set_target_properties(android.system.core.liblog PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")

target_compile_definitions(android.system.core.liblog PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN NDEBUG)

target_include_directories(android.system.core.liblog SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../system/core/include" ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)

