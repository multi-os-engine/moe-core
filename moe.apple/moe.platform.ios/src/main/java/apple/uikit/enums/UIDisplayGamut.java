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
public final class UIDisplayGamut {
    /**
     * UIKit will not set this anymore, instead a sensible default is chosen based on the device capabilities and
     * settings always
     */
    @Generated @NInt public static final long Unspecified = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long SRGB = 0x0000000000000000L;
    @Generated @NInt public static final long P3 = 0x0000000000000001L;

    @Generated
    private UIDisplayGamut() {
    }
}
