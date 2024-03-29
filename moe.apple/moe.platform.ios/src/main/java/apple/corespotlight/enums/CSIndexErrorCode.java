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

package apple.corespotlight.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 9.0
 */
@Generated
public final class CSIndexErrorCode {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long UnknownError = 0xFFFFFFFFFFFFFFFFL;
    /**
     * The indexer was unavailable
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long IndexUnavailableError = 0xFFFFFFFFFFFFFC18L;
    /**
     * The CSSearchableItem is invalid for some reason
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long InvalidItemError = 0xFFFFFFFFFFFFFC17L;
    /**
     * The provided clientState was not valid for some reason
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long InvalidClientStateError = 0xFFFFFFFFFFFFFC16L;
    /**
     * There was an error trying to communicate with the remote process
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long RemoteConnectionError = 0xFFFFFFFFFFFFFC15L;
    /**
     * Quota for bundle was exceeded
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long QuotaExceeded = 0xFFFFFFFFFFFFFC14L;
    /**
     * Indexing isn't supported on this device
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long IndexingUnsupported = 0xFFFFFFFFFFFFFC13L;

    @Generated
    private CSIndexErrorCode() {
    }
}
