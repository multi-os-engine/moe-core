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
 * These constants are used to indicate how items in a request are ordered, from the first one given in a method
 * invocation or function call to the last (that is, left to right in code).
 * 
 * Given the function:
 * NSComparisonResult f(int a, int b)
 * 
 * If:
 * a < b then return NSOrderedAscending. The left operand is smaller than the right operand.
 * a > b then return NSOrderedDescending. The left operand is greater than the right operand.
 * a == b then return NSOrderedSame. The operands are equal.
 */
@Generated
public final class NSComparisonResult {
    @Generated @NInt public static final long Ascending = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long Same = 0x0000000000000000L;
    @Generated @NInt public static final long Descending = 0x0000000000000001L;

    @Generated
    private NSComparisonResult() {
    }
}
