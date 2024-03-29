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

package apple.coregraphics.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class CGImageAlphaInfo {
    /**
     * For example, RGB.
     */
    @Generated public static final int None = 0x00000000;
    /**
     * For example, premultiplied RGBA
     */
    @Generated public static final int PremultipliedLast = 0x00000001;
    /**
     * For example, premultiplied ARGB
     */
    @Generated public static final int PremultipliedFirst = 0x00000002;
    /**
     * For example, non-premultiplied RGBA
     */
    @Generated public static final int Last = 0x00000003;
    /**
     * For example, non-premultiplied ARGB
     */
    @Generated public static final int First = 0x00000004;
    /**
     * For example, RGBX.
     */
    @Generated public static final int NoneSkipLast = 0x00000005;
    /**
     * For example, XRGB.
     */
    @Generated public static final int NoneSkipFirst = 0x00000006;
    /**
     * No color data, alpha data only
     */
    @Generated public static final int Only = 0x00000007;

    @Generated
    private CGImageAlphaInfo() {
    }
}
