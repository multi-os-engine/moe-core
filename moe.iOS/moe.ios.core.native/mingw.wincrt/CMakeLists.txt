project(mingw.wincrt)

FILE(GLOB SOURCES ${PROJECT_SOURCE_DIR}/src/*/*.c)
add_library(mingw.wincrt STATIC ${SOURCES})
target_compile_definitions(mingw.wincrt PRIVATE __LIBMSVCRT__)
target_include_directories(mingw.wincrt PRIVATE ${PROJECT_SOURCE_DIR}/include ${PROJECT_SOURCE_DIR}/src/include ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include)
set_target_properties(mingw.wincrt PROPERTIES COMPILE_FLAGS "-include ${PROJECT_SOURCE_DIR}/include/_mingw_mac.h")
