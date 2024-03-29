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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 7.0
 */
@Generated
public final class NSURLSessionResponseDisposition {
    /**
     * Cancel the load, this is the same as -[task cancel]
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Cancel = 0x0000000000000000L;
    /**
     * Allow the load to continue
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Allow = 0x0000000000000001L;
    /**
     * Turn this request into a download
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long BecomeDownload = 0x0000000000000002L;
    /**
     * Turn this task into a stream task
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long BecomeStream = 0x0000000000000003L;

    @Generated
    private NSURLSessionResponseDisposition() {
    }
}
