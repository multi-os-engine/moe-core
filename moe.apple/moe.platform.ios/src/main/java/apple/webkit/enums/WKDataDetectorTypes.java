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

package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] WKDataDetectorTypes
 * 
 * The type of data detected.
 * [@constant] WKDataDetectorTypeNone No detection is performed.
 * [@constant] WKDataDetectorTypePhoneNumber Phone numbers are detected and turned into links.
 * [@constant] WKDataDetectorTypeLink URLs in text are detected and turned into links.
 * [@constant] WKDataDetectorTypeAddress Addresses are detected and turned into links.
 * [@constant] WKDataDetectorTypeCalendarEvent Dates and times that are in the future are detected and turned into
 * links.
 * [@constant] WKDataDetectorTypeAll All of the above data types are turned into links when detected. Choosing this
 * value will
 * automatically include any new detection type that is added.
 * 
 * API-Since: 10.0
 */
@Generated
public final class WKDataDetectorTypes {
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long PhoneNumber = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Link = 0x0000000000000002L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Address = 0x0000000000000004L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long CalendarEvent = 0x0000000000000008L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long TrackingNumber = 0x0000000000000010L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long FlightNumber = 0x0000000000000020L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long LookupSuggestion = 0x0000000000000040L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long All = org.moe.natj.general.NatJ.is64Bit() ?
            0xFFFFFFFFFFFFFFFFL :
            0x00000000FFFFFFFFL;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 10.0
     */
    @Deprecated @Generated @NUInt public static final long SpotlightSuggestion = 0x0000000000000040L;

    @Generated
    private WKDataDetectorTypes() {
    }
}
