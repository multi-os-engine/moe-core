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

package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 8.0
 */
@Generated
public final class HKWorkoutEventType {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Pause = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Resume = 0x0000000000000002L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Lap = 0x0000000000000003L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Marker = 0x0000000000000004L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long MotionPaused = 0x0000000000000005L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long MotionResumed = 0x0000000000000006L;

    @Generated
    private HKWorkoutEventType() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Segment = 0x0000000000000007L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long PauseOrResumeRequest = 0x0000000000000008L;
}
