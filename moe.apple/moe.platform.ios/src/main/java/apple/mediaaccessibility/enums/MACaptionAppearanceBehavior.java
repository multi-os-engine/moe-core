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

package apple.mediaaccessibility.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] MACaptionAppearanceBehavior
 * 
 * MACaptionAppearanceBehavior is used to determine how a preference value should be used.
 * 
 * [@constant] kMACaptionAppearanceBehaviorUseValue
 * The value should override any content, application, or otherwise-defined values.
 * [@constant] kMACaptionAppearanceBehaviorUseContentIfAvailable
 * Content, application, or otherwise-defined values should override the returned value. If no other value is defined,
 * then the return value should be used.
 * 
 * API-Since: 7.0
 */
@Generated
public final class MACaptionAppearanceBehavior {
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long Value = 0x0000000000000000L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long ContentIfAvailable = 0x0000000000000001L;

    @Generated
    private MACaptionAppearanceBehavior() {
    }
}
