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
 * [@enum] HKFitzpatrickSkinType
 * 
 * This enumerated type is used to represent the skin type of an individual based on the Fitzpatrick scale.
 * 
 * The Fitzpatrick scale is a numerical classification for skin color based on the skin's response to sun
 * exposure in terms of the degree of burning and tanning.
 * 
 * [@constant] HKFitzpatrickSkinTypeI Pale white skin that always burns easily in the sun and never tans.
 * [@constant] HKFitzpatrickSkinTypeII White skin that burns easily and tans minimally.
 * [@constant] HKFitzpatrickSkinTypeIII White to light brown skin that burns moderately and tans uniformly.
 * [@constant] HKFitzpatrickSkinTypeIV Beige-olive, lightly tanned skin that burns minimally and tans moderately.
 * [@constant] HKFitzpatrickSkinTypeV Brown skin that rarely burns and tans profusely.
 * [@constant] HKFitzpatrickSkinTypeVI Dark brown to black skin that never burns and tans profusely.
 * 
 * API-Since: 9.0
 */
@Generated
public final class HKFitzpatrickSkinType {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long NotSet = 0x0000000000000000L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long I = 0x0000000000000001L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long II = 0x0000000000000002L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long III = 0x0000000000000003L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long IV = 0x0000000000000004L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long V = 0x0000000000000005L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long VI = 0x0000000000000006L;

    @Generated
    private HKFitzpatrickSkinType() {
    }
}
