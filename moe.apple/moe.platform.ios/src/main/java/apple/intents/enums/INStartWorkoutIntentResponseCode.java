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

package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 10.0
 */
@Generated
public final class INStartWorkoutIntentResponseCode {
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Ready = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ContinueInApp = 0x0000000000000002L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Failure = 0x0000000000000003L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long FailureRequiringAppLaunch = 0x0000000000000004L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long FailureOngoingWorkout = 0x0000000000000005L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long FailureNoMatchingWorkout = 0x0000000000000006L;

    @Generated
    private INStartWorkoutIntentResponseCode() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Success = 0x0000000000000008L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long HandleInApp = 0x0000000000000007L;
}
