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

package apple.storekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 3.0
 */
@Generated
public final class SKPaymentTransactionState {
    /**
     * Transaction is being added to the server queue.
     * 
     * API-Since: 3.0
     */
    @Generated @NInt public static final long Purchasing = 0x0000000000000000L;
    /**
     * Transaction is in queue, user has been charged. Client should complete the transaction.
     * 
     * API-Since: 3.0
     */
    @Generated @NInt public static final long Purchased = 0x0000000000000001L;
    /**
     * Transaction was cancelled or failed before being added to the server queue.
     * 
     * API-Since: 3.0
     */
    @Generated @NInt public static final long Failed = 0x0000000000000002L;
    /**
     * Transaction was restored from user's purchase history. Client should complete the transaction.
     * 
     * API-Since: 3.0
     */
    @Generated @NInt public static final long Restored = 0x0000000000000003L;
    /**
     * The transaction is in the queue, but its final status is pending external action.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Deferred = 0x0000000000000004L;

    @Generated
    private SKPaymentTransactionState() {
    }
}
