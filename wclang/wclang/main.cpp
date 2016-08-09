#include "wcommon.h"

int main(int argc, const char* argv[]) {
    return redirect(argc, argv, "clang-cl", [] (std::vector<std::string>& args, const std::string& root) {
        args.push_back(std::string("-I ") + root + "/include/VC");
        args.push_back(std::string("-I ") + root + "/include/WK/shared");
        args.push_back(std::string("-I ") + root + "/include/WK/ucrt");
        args.push_back(std::string("-I ") + root + "/include/WK/um");
        args.push_back(std::string("-I ") + root + "/include/WK/winrt");
        args.push_back(std::string("-I ") + root + "/include/MINGW");
    }, false);
}
