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

package apple.spritekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Blend modes that the SKNode uses to compose with the framebuffer to produce blended colors.
 * 
 * API-Since: 7.0
 */
@Generated
public final class SKBlendMode {
    /**
     * Blends the source and destination colors by multiplying the source alpha value.
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Alpha = 0x0000000000000000L;
    /**
     * Blends the source and destination colors by adding them up.
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Add = 0x0000000000000001L;
    /**
     * Blends the source and destination colors by subtracting the source from the destination.
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Subtract = 0x0000000000000002L;
    /**
     * Blends the source and destination colors by multiplying them.
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Multiply = 0x0000000000000003L;
    /**
     * Blends the source and destination colors by multiplying them and doubling the result.
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long MultiplyX2 = 0x0000000000000004L;
    /**
     * Blends the source and destination colors by multiplying one minus the source with the destination and adding the
     * source.
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Screen = 0x0000000000000005L;
    /**
     * Replaces the destination with the source (ignores alpha).
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Replace = 0x0000000000000006L;

    @Generated
    private SKBlendMode() {
    }

    /**
     * Blends the source and destination colors by multiplying them (with alpha).
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long MultiplyAlpha = 0x0000000000000007L;
}
