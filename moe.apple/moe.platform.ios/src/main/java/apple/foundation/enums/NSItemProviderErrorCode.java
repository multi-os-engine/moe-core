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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * NSItemProvider-related error codes
 * 
 * API-Since: 8.0
 */
@Generated
public final class NSItemProviderErrorCode {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UnknownError = 0xFFFFFFFFFFFFFFFFL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ItemUnavailableError = 0xFFFFFFFFFFFFFC18L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UnexpectedValueClassError = 0xFFFFFFFFFFFFFBB4L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long UnavailableCoercionError = 0xFFFFFFFFFFFFFB50L;

    @Generated
    private NSItemProviderErrorCode() {
    }
}
