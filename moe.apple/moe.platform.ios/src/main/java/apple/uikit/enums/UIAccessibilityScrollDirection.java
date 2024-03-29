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
 * If the user interface requires a scrolling action (e.g. turning the page of a book), a view in the view
 * hierarchy should implement the following method. The return result indicates whether the action
 * succeeded for that direction. If the action failed, the method will be called on a view higher
 * in the hierarchy. If the action succeeds, UIAccessibilityPageScrolledNotification must be posted after
 * the scrolling completes.
 * default == NO
 */
@Generated
public final class UIAccessibilityScrollDirection {
    @Generated @NInt public static final long Right = 0x0000000000000001L;
    @Generated @NInt public static final long Left = 0x0000000000000002L;
    @Generated @NInt public static final long Up = 0x0000000000000003L;
    @Generated @NInt public static final long Down = 0x0000000000000004L;
    /**
     * API-Since: 5.0
     */
    @Generated @NInt public static final long Next = 0x0000000000000005L;
    /**
     * API-Since: 5.0
     */
    @Generated @NInt public static final long Previous = 0x0000000000000006L;

    @Generated
    private UIAccessibilityScrollDirection() {
    }
}
