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
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 3.0
 * Deprecated-Since: 8.0
 * Deprecated-Message: Use UserNotifications Framework's UNAuthorizationOptions for user notifications and
 * registerForRemoteNotifications for receiving remote notifications instead.
 */
@Deprecated
@Generated
public final class UIRemoteNotificationType {
    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use UserNotifications Framework's UNAuthorizationOptions for user notifications and
     * registerForRemoteNotifications for receiving remote notifications instead.
     */
    @Deprecated @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use UserNotifications Framework's UNAuthorizationOptions for user notifications and
     * registerForRemoteNotifications for receiving remote notifications instead.
     */
    @Deprecated @Generated @NUInt public static final long Badge = 0x0000000000000001L;
    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use UserNotifications Framework's UNAuthorizationOptions for user notifications and
     * registerForRemoteNotifications for receiving remote notifications instead.
     */
    @Deprecated @Generated @NUInt public static final long Sound = 0x0000000000000002L;
    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use UserNotifications Framework's UNAuthorizationOptions for user notifications and
     * registerForRemoteNotifications for receiving remote notifications instead.
     */
    @Deprecated @Generated @NUInt public static final long Alert = 0x0000000000000004L;
    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use UserNotifications Framework's UNAuthorizationOptions for user notifications and
     * registerForRemoteNotifications for receiving remote notifications instead.
     */
    @Deprecated @Generated @NUInt public static final long NewsstandContentAvailability = 0x0000000000000008L;

    @Generated
    private UIRemoteNotificationType() {
    }
}
