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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Attribute values ***********************
 * This defines currently supported values for NSUnderlineStyleAttributeName and NSStrikethroughStyleAttributeName.
 * These values are or'ed together to produce an underline style.
 * Underlines will be drawn with a solid pattern by default, so NSUnderlineStylePatternSolid does not need to be
 * specified.
 * 
 * API-Since: 6.0
 */
@Generated
public final class NSUnderlineStyle {
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long PatternSolid = 0x0000000000000000L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long PatternDot = 0x0000000000000100L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long PatternDash = 0x0000000000000200L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long PatternDashDot = 0x0000000000000300L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long PatternDashDotDot = 0x0000000000000400L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long ByWord = 0x0000000000008000L;

    @Generated
    private NSUnderlineStyle() {
    }

    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long Single = 0x0000000000000001L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Thick = 0x0000000000000002L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Double = 0x0000000000000009L;
}
