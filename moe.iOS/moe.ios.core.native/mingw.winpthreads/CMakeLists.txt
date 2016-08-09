project(mingw.winpthreads)

FILE(GLOB SOURCES ${PROJECT_SOURCE_DIR}/src/*.c)
add_library(mingw.winpthreads STATIC ${SOURCES})
set_target_properties(mingw.winpthreads PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native/MOE-Prefix.pch")
target_include_directories(mingw.winpthreads PRIVATE ${PROJECT_SOURCE_DIR}/include ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include)
