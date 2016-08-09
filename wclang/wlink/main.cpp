#include "wcommon.h"

int main(int argc, const char* argv[]) {
    return redirect(argc, argv, "link_win.exe", [] (std::vector<std::string>& args, const std::string& win_root) {
        args.push_back(std::string("/LIBPATH:") + win_root + "\\\\lib\\\\VC\\\\amd64");
        args.push_back(std::string("/LIBPATH:") + win_root + "\\\\lib\\\\WK\\\\ucrt\\\\x64");
        args.push_back(std::string("/LIBPATH:") + win_root + "\\\\lib\\\\WK\\\\um\\\\x64");
        args.push_back(std::string("/LIBPATH:") + win_root + "\\\\lib\\\\MINGW\\\\x64");
    });
}
