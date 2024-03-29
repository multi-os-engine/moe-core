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

package apple.usernotificationsui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Constants indicating the preferred response to a notification.
 * 
 * API-Since: 10.0
 */
@Generated
public final class UNNotificationContentExtensionResponseOption {
    /**
     * Don't dismiss the notification interface.
     * 
     * The content extension handles the selected action.
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long DoNotDismiss = 0x0000000000000000L;
    /**
     * Dismiss the notification interface.
     * 
     * The content extension handles the selected action.
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Dismiss = 0x0000000000000001L;
    /**
     * Dismiss the notification interface and forward the notification to the app.
     * 
     * Choose this option when you want the app to respond to the action or handle
     * it.
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long DismissAndForwardAction = 0x0000000000000002L;

    @Generated
    private UNNotificationContentExtensionResponseOption() {
    }
}
