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
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 5.0
 */
@Generated
public final class NSJSONWritingOptions {
    @Generated
    private NSJSONWritingOptions() {
    }

    /**
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long PrettyPrinted = 0x0000000000000001L;
    /**
     * Sorts dictionary keys for output using [NSLocale systemLocale]. Keys are compared using NSNumericSearch. The
     * specific sorting method used is subject to change.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long SortedKeys = 0x0000000000000002L;
    /**
     * Sorts dictionary keys for output using [NSLocale systemLocale]. Keys are compared using NSNumericSearch. The
     * specific sorting method used is subject to change.
     * 
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long FragmentsAllowed = 0x0000000000000004L;
    /**
     * Sorts dictionary keys for output using [NSLocale systemLocale]. Keys are compared using NSNumericSearch. The
     * specific sorting method used is subject to change.
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long WithoutEscapingSlashes = 0x0000000000000008L;
}
