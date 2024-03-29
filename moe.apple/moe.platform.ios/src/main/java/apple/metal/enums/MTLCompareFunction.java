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

package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 8.0
 */
@Generated
public final class MTLCompareFunction {
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Never = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Less = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Equal = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long LessEqual = 0x0000000000000003L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Greater = 0x0000000000000004L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long NotEqual = 0x0000000000000005L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long GreaterEqual = 0x0000000000000006L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Always = 0x0000000000000007L;

    @Generated
    private MTLCompareFunction() {
    }
}
