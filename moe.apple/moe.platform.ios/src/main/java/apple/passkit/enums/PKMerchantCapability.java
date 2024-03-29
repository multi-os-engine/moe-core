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
 * API-Since: 8.0
 */
@Generated
public final class PKMerchantCapability {
    /**
     * Merchant supports 3DS
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Capability3DS = 0x0000000000000001L;
    /**
     * Merchant supports EMV
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long CapabilityEMV = 0x0000000000000002L;
    /**
     * Merchant supports credit
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long CapabilityCredit = 0x0000000000000004L;
    /**
     * Merchant supports debit
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long CapabilityDebit = 0x0000000000000008L;

    @Generated
    private PKMerchantCapability() {
    }

    /**
     * Merchant supports instant funds out
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long CapabilityInstantFundsOut = 0x0000000000000080L;
}
