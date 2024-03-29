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

@Generated
public final class UIImagePickerControllerQualityType {
    /**
     * highest quality
     */
    @Generated @NInt public static final long TypeHigh = 0x0000000000000000L;
    /**
     * medium quality, suitable for transmission via Wi-Fi
     */
    @Generated @NInt public static final long TypeMedium = 0x0000000000000001L;
    /**
     * lowest quality, suitable for transmission via cellular network
     */
    @Generated @NInt public static final long TypeLow = 0x0000000000000002L;
    /**
     * VGA quality
     * 
     * API-Since: 4.0
     */
    @Generated @NInt public static final long Type640x480 = 0x0000000000000003L;
    /**
     * API-Since: 5.0
     */
    @Generated @NInt public static final long TypeIFrame1280x720 = 0x0000000000000004L;
    /**
     * API-Since: 5.0
     */
    @Generated @NInt public static final long TypeIFrame960x540 = 0x0000000000000005L;

    @Generated
    private UIImagePickerControllerQualityType() {
    }
}
