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
public final class UIBarMetrics {
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    @Generated @NInt public static final long Compact = 0x0000000000000001L;
    /**
     * Applicable only in bars with the prompt property, such as UINavigationBar and UISearchBar
     */
    @Generated @NInt public static final long DefaultPrompt = 0x0000000000000065L;
    @Generated @NInt public static final long CompactPrompt = 0x0000000000000066L;
    /**
     * API-Since: 5.0
     * Deprecated-Since: 8.0
     */
    @Deprecated @Generated @NInt public static final long LandscapePhone = 0x0000000000000001L;
    /**
     * API-Since: 7.0
     * Deprecated-Since: 8.0
     */
    @Deprecated @Generated @NInt public static final long LandscapePhonePrompt = 0x0000000000000066L;

    @Generated
    private UIBarMetrics() {
    }
}
