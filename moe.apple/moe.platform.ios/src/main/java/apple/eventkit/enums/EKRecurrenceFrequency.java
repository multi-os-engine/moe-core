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

package apple.eventkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] EKRecurrenceFrequency
 * 
 * The frequency of a recurrence
 * 
 * EKRecurrenceFrequency designates the unit of time used to describe the recurrence.
 * It has four possible values, which correspond to recurrence rules that are defined
 * in terms of days, weeks, months, and years.
 */
@Generated
public final class EKRecurrenceFrequency {
    @Generated @NInt public static final long Daily = 0x0000000000000000L;
    @Generated @NInt public static final long Weekly = 0x0000000000000001L;
    @Generated @NInt public static final long Monthly = 0x0000000000000002L;
    @Generated @NInt public static final long Yearly = 0x0000000000000003L;

    @Generated
    private EKRecurrenceFrequency() {
    }
}
