/*
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

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    if (argc < 4) {
        NSLog(@"Usage: cfg-trim <source .cfg file> <class> <destination .cfg file>");
        return 1;
    }
    
    NSLog(@"Loading file %s", argv[1]);
    
    NSError* error;
    NSString* string = [NSString stringWithContentsOfFile:[NSString stringWithUTF8String:argv[1]] encoding:NSUTF8StringEncoding error:&error];
    if (error != nil) {
        NSLog(@"Problem during reading from source file: %@", error);
        return 1;
    }
   
    NSString* cls = [NSString stringWithUTF8String:argv[2]];
    NSLog(@"Looking for class %s", argv[2]);
    
    NSUInteger pos = 0;
    
    NSMutableArray<NSString*>* strings = [NSMutableArray array];
    
    double nextLog = 10.0;
    while (true) {
        double perc = (double)pos/string.length*100;
        if (perc > nextLog) {
            NSLog(@"Parsed %f%%", perc);
            nextLog += 10.0;
        }
        NSRange range = [string rangeOfString:@"begin_compilation\n" options:NSLiteralSearch range:NSMakeRange(pos, string.length - pos)];
        if (range.location == NSNotFound) {
            break;
        }
        
        pos = range.location;
        pos += range.length;
        
        NSUInteger begin = range.location;
        
        range = [string rangeOfString:@"  name \"" options:NSLiteralSearch range:NSMakeRange(pos, @"  name \"".length)];
        if (range.location == NSNotFound) {
            continue;
        }
        
        pos += range.length;
        
        // Skip to class
        while ([string characterAtIndex:pos] != ' ') pos++;
        pos++;
        
        range = [string rangeOfString:cls options:NSLiteralSearch range:NSMakeRange(pos, cls.length)];
        if (range.location == NSNotFound) {
            continue;
        }
        
        pos += range.length;
        
        char c = [string characterAtIndex:pos];
        if (c != '.' && c != '$') {
            continue;
        }
        
        pos++;
        
        range = [string rangeOfString:@"begin_compilation" options:NSLiteralSearch range:NSMakeRange(pos, string.length - pos)];

        NSUInteger end = MIN(range.location, string.length);
        
        pos = range.location;
        
        [strings addObject:[string substringWithRange:NSMakeRange(begin, end - begin)]];
    }
    
    if (![[strings componentsJoinedByString:@"\n"] writeToFile:[NSString stringWithUTF8String:argv[3]] atomically:NO encoding:NSUTF8StringEncoding error:&error] || error) {
        if (error) {
            NSLog(@"Problem during writing to destination file: %@", error);
        } else {
            NSLog(@"Unknown problem during writing to destination file!");
        }
        return 1;
        
    }
    
    return 0;
}
