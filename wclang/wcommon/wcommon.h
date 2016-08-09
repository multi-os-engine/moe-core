/*
 * Copyright (C) 2007-2008 The Android Open Source Project
 * Copyright (c) 2014-2016, Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef wcommon_h
#define wcommon_h

#include <string>
#include <sstream>
#include <vector>

std::string convertPath(std::string path) {
    size_t c = std::count(path.begin(), path.end(), '/');
    if (c == 0) {
        return path;
    }
    c *= 2;
    char buff[path.length() + c + 3];
    size_t j = 0;
    bool first = true;
    for (size_t i = 0; path[i]; i++) {
        char ch = path[i];
        if (ch == '/') {
            if (first) {
                first = false;
                if (i == 0 || !isalnum(path[i-1])) {
                    buff[j++] = 'z';
                    buff[j++] = ':';
                }
            }
            buff[j++] = '\\';
            buff[j++] = '\\';
        } else {
            buff[j++] = ch;
        }
    }
    buff[j] = 0;

    return buff;
}

std::string replaceAll(std::string str, const std::string& from, const std::string& to) {
    size_t start_pos = 0;
    while((start_pos = str.find(from, start_pos)) != std::string::npos) {
        str.replace(start_pos, from.length(), to);
        start_pos += to.length();
    }
    return str;
}

int redirect(int argc, const char* argv[], const std::string& exec, void (appender) (std::vector<std::string>&, const std::string&), bool wine = true) {
    // Get executable path.
    std::string path;
    {
        // Get full executable path.
        std::string command = std::string("which wlink");
        FILE* which = popen(command.c_str(), "r");
        char buf[1024];
        fscanf(which, "%s", buf);
        path = buf;
        pclose(which);
    }

    // Get bin path.
    const char* ptr = std::strrchr(path.c_str(), '/');
    std::string bin = path.substr(0, ptr - path.c_str());
    
    // Get root path.
    ptr = std::strrchr(bin.c_str(), '/');
    std::string root = bin.substr(0, ptr - bin.c_str());
 
    // Fill up arguments.
    std::vector<std::string> args;
    
    // Set executable.
    std::string active_root;
    if (wine) {
        std::string win_root = convertPath(root);
        active_root = win_root;
        args.push_back(std::string("WINEPREFIX=") + root + "/wine");
        args.push_back(std::string("WINEPATH=") + win_root + "\\\\bin");
        args.push_back(std::string("VCINSTALLDIR=") + win_root);
        args.push_back("WINEDEBUG=-all");
        args.push_back("WINEDLLOVERRIDES=\"MSVCP140,vcruntime140,ucrtbase,api-ms-win-crt-locale-l1-1-0,api-ms-win-crt-runtime-l1-1-0,api-ms-win-crt-stdio-l1-1-0,api-ms-win-crt-heap-l1-1-0,api-ms-win-crt-conio-l1-1-0,mspdb140=n\"");
        args.push_back("wine");
    } else {
        active_root = root;
        args.push_back(std::string("VCINSTALLDIR=") + root);
    }
    args.push_back(bin + "/" + exec);

    // Forward original arguments.
    for (int argi = 1; argi < argc; argi++) {
        std::string converted = argv[argi];
        if (!wine) {
            converted = replaceAll(converted, "\\", "\\\\");
        }
        if (std::strrchr(converted.c_str(), ' ')) {
            converted = "\"" + converted + "\"";
        }
        args.push_back(converted);
    }
    
    // Append custom arguments.
    appender(args, active_root);
    
    // Concatenate command string.
    std::stringstream ss;
    for (size_t i = 0; i < args.size(); ++i) {
        if (i != 0) {
            ss << ' ';
        }
        ss << args[i];
    }
    std::string command = ss.str();
    
    if (/* DISABLES CODE */ (0)) {
        printf("Forwarding: %s\n", command.c_str());
    }
    
    int ret = system(command.c_str());
    if (ret == -1) {
        printf("Could not fork\n");
        return 1;
    } else {
        return WEXITSTATUS(ret);
    }
}

#endif /* wcommon_h */
