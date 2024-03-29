/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * CFURLEnumeratorResult - Results for CFURLEnumeratorGetNextURL
 */
@Generated
public final class CFURLEnumeratorResult {
    /**
     * The enumeration was successful. The url output parameter is valid.
     */
    @Generated @NInt public static final long Success = 0x0000000000000001L;
    /**
     * The enumeration is complete.
     */
    @Generated @NInt public static final long End = 0x0000000000000002L;
    /**
     * An error occured during enumeration. The retained error output parameter describes the error.
     */
    @Generated @NInt public static final long Error = 0x0000000000000003L;
    /**
     * The enumeration was successful. The url output parameter is for a directory after all of directory's descendants
     * have been visited (post-order). This result will only be returned for directories when both the
     * kCFURLEnumeratorDescendRecursively and kCFURLEnumeratorIncludeDirectoriesPostOrder options are passed to
     * CFURLEnumeratorCreateForDirectoryURL.
     */
    @Generated @NInt public static final long DirectoryPostOrderSuccess = 0x0000000000000004L;

    @Generated
    private CFURLEnumeratorResult() {
    }
}
