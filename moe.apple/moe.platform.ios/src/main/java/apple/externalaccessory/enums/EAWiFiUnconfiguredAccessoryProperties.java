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

package apple.externalaccessory.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@options] EAWiFiUnconfiguredAccessoryProperties
 * 
 * Represents the properties of an EAWiFiUnconfiguredAccessory.
 * 
 * [@constant] EAWiFiUnconfiguredAccessoryPropertySupportsAirPlay Option set if the accessory is advertising that it
 * supports AirPlay.
 * [@constant] EAWiFiUnconfiguredAccessoryPropertySupportsAirPrint Option set if the accessory is advertising that it
 * supports AirPrint.
 * [@constant] EAWiFiUnconfiguredAccessoryPropertySupportsHomeKit Option set if the accessory is advertising that it
 * supports HomeKit.
 */
@Generated
public final class EAWiFiUnconfiguredAccessoryProperties {
    @Generated @NUInt public static final long AirPlay = 0x0000000000000001L;
    @Generated @NUInt public static final long AirPrint = 0x0000000000000002L;
    @Generated @NUInt public static final long HomeKit = 0x0000000000000004L;

    @Generated
    private EAWiFiUnconfiguredAccessoryProperties() {
    }
}
