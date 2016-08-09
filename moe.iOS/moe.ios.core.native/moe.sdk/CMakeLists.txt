cmake_minimum_required(VERSION 3.0.0)

# the name of the target operating system
SET(CMAKE_SYSTEM_NAME Windows)

SET(CMAKE_VS_PLATFORM_TOOLSET v140_lang_3_7)

project(moe_windows)


# Include subprojects
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.art.compiler ${PROJECT_SOURCE_DIR}/../android.art.compiler/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.art.dalvikvm ${PROJECT_SOURCE_DIR}/../android.art.dalvikvm/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.art.dex2oat ${PROJECT_SOURCE_DIR}/../android.art.dex2oat/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.art.disassembler ${PROJECT_SOURCE_DIR}/../android.art.disassembler/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.art.runtime ${PROJECT_SOURCE_DIR}/../android.art.runtime/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.external.conscrypt ${PROJECT_SOURCE_DIR}/../android.external.conscrypt/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.external.expat ${PROJECT_SOURCE_DIR}/../android.external.expat/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.external.fdlibm ${PROJECT_SOURCE_DIR}/../android.external.fdlibm/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.external.icu ${PROJECT_SOURCE_DIR}/../android.external.icu/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.external.javasqlite ${PROJECT_SOURCE_DIR}/../android.external.javasqlite/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.external.openssl ${PROJECT_SOURCE_DIR}/../android.external.openssl/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.external.vixl ${PROJECT_SOURCE_DIR}/../android.external.vixl/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.libcore ${PROJECT_SOURCE_DIR}/../android.libcore/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.libnativehelper ${PROJECT_SOURCE_DIR}/../android.libnativehelper/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.system.core.base ${PROJECT_SOURCE_DIR}/../android.system.core.base/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.system.core.libbacktrace ${PROJECT_SOURCE_DIR}/../android.system.core.libbacktrace/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.system.core.libcutils ${PROJECT_SOURCE_DIR}/../android.system.core.libcutils/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.system.core.liblog ${PROJECT_SOURCE_DIR}/../android.system.core.liblog/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.system.core.libutils ${PROJECT_SOURCE_DIR}/../android.system.core.libutils/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.system.core.libziparchive ${PROJECT_SOURCE_DIR}/../android.system.core.libziparchive/build_windows)
# Include external projects
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.external.sqlite ${PROJECT_SOURCE_DIR}/../android.external.sqlite/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../android.external.zlib ${PROJECT_SOURCE_DIR}/../android.external.zlib/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../mingw.wincrt ${PROJECT_SOURCE_DIR}/../mingw.wincrt/build_windows)
add_subdirectory(${PROJECT_SOURCE_DIR}/../mingw.winpthreads ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/build_windows)


add_library(moe.windows.compat STATIC ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native/base.cpp)
set_target_properties(moe.windows.compat PROPERTIES COMPILE_FLAGS "/-include MOE-Prefix.pch")
target_compile_definitions(moe.windows.compat PRIVATE MOE)
target_include_directories(moe.windows.compat SYSTEM PRIVATE ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include)


add_library(moe.sdk SHARED  ${PROJECT_SOURCE_DIR}/src_windows/MOE.cpp)
target_compile_definitions(moe.sdk PRIVATE ANDROID_SMP=1 ANDROID MOE=1 HAVE_LITTLE_ENDIAN NDEBUG BUILD_VERSION=${GRADLE_BUILD_VERSION})
target_include_directories(moe.sdk SYSTEM PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../external/openssl/include" ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/src_windows/modern)
target_include_directories(moe.sdk PRIVATE "${PROJECT_SOURCE_DIR}/../../../../../art/runtime" "${PROJECT_SOURCE_DIR}/../../../../../libnativehelper/include/nativehelper")
target_link_libraries(moe.sdk "/LIBPATH:${PROJECT_SOURCE_DIR}/../../../../prebuilt/natj-win/$(PlatformTargetAsMSBuildArchitecture)-$(Configuration)" "/LIBPATH:${PROJECT_SOURCE_DIR}/../../../../prebuilt/libffi/$(PlatformTargetAsMSBuildArchitecture)-microsoft-windows-msvc-$(Configuration)/libs" android.external.zlib android.external.sqlite natj-static libffi Pathcch Shlwapi android.system.core.base android.system.core.libziparchive android.system.core.libbacktrace android.system.core.libutils android.system.core.libcutils android.system.core.liblog android.art.runtime android.art.dalvikvm android.external.conscrypt android.external.expat android.external.fdlibm android.external.icu android.external.openssl android.libcore android.libnativehelper android.external.javasqlite moe.windows.compat mingw.winpthreads mingw.wincrt comsuppw psapi ws2_32 mswsock wbemuuid)
