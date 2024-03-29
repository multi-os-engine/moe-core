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

package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 9.0
 */
@Generated
public final class PKAutomaticPassPresentationSuppressionResult {
    /**
     * Suppression is not supported for this device
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long NotSupported = 0x0000000000000000L;
    /**
     * Passes are already being presented and cannot be suppressed
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long AlreadyPresenting = 0x0000000000000001L;
    /**
     * Suppression was denied due to lack of entitlement
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long Denied = 0x0000000000000002L;
    /**
     * Suppression was cancelled before the response handler was fired
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long Cancelled = 0x0000000000000003L;
    /**
     * Suppression of automatic pass presentation was successful
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long Success = 0x0000000000000004L;

    @Generated
    private PKAutomaticPassPresentationSuppressionResult() {
    }
}
