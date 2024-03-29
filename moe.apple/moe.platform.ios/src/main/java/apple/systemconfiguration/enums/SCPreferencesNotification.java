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

package apple.systemconfiguration.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] SCPreferencesNotification
 * 
 * Used with the SCPreferencesCallBack callback
 * to describe the type of notification.
 * [@constant] kSCPreferencesNotificationCommit Indicates when new
 * preferences have been saved.
 * [@constant] kSCPreferencesNotificationApply Key Indicates when a
 * request has been made to apply the currently saved
 * preferences to the active system configuration.
 */
@Generated
public final class SCPreferencesNotification {
    @Generated
    private SCPreferencesNotification() {
    }
}
