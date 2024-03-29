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

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CFNotificationSuspensionBehavior {
    @Generated @NInt public static final long Drop = 0x0000000000000001L;
    /**
     * The server will not queue any notifications with this name and object while the process/app is in the background.
     */
    @Generated @NInt public static final long Coalesce = 0x0000000000000002L;
    /**
     * The server will only queue the last notification of the specified name and object; earlier notifications are
     * dropped.
     */
    @Generated @NInt public static final long Hold = 0x0000000000000003L;
    /**
     * The server will hold all matching notifications until the queue has been filled (queue size determined by the
     * server) at which point the server may flush queued notifications.
     */
    @Generated @NInt public static final long DeliverImmediately = 0x0000000000000004L;

    @Generated
    private CFNotificationSuspensionBehavior() {
    }
}
