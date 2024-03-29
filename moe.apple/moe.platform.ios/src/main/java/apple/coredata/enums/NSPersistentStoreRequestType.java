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

package apple.coredata.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSPersistentStoreRequestType {
    @Generated @NUInt public static final long FetchRequestType = 0x0000000000000001L;
    @Generated @NUInt public static final long SaveRequestType = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long BatchUpdateRequestType = 0x0000000000000006L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long BatchDeleteRequestType = 0x0000000000000007L;

    @Generated
    private NSPersistentStoreRequestType() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long BatchInsertRequestType = 0x0000000000000005L;
}
