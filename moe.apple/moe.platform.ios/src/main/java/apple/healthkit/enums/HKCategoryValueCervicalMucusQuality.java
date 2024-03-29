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

package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKCategoryValueCervicalMucusQuality
 * 
 * Set of values that may be used for HKCategorySamples with the
 * HKCategoryTypeIdentifierCervicalMucusQuality type.
 * 
 * These cervical mucus quality values are ordered from least-fertile (Dry) to most-fertile (EggWhite).
 * 
 * API-Since: 9.0
 */
@Generated
public final class HKCategoryValueCervicalMucusQuality {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Dry = 0x0000000000000001L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Sticky = 0x0000000000000002L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Creamy = 0x0000000000000003L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Watery = 0x0000000000000004L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long EggWhite = 0x0000000000000005L;

    @Generated
    private HKCategoryValueCervicalMucusQuality() {
    }
}
