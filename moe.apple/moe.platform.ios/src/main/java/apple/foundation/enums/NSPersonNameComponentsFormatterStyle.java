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
 * API-Since: 9.0
 */
@Generated
public final class NSPersonNameComponentsFormatterStyle {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * Relies on user preferences and language defaults to display shortened form appropriate
     * for display in space-constrained settings, e.g. C Darwin
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Short = 0x0000000000000001L;
    /**
     * The minimally necessary features for differentiation in a casual setting , e.g. Charles Darwin
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Medium = 0x0000000000000002L;
    /**
     * The fully-qualified name complete with all known components, e.g. Charles Robert Darwin, FRS
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Long = 0x0000000000000003L;
    /**
     * The maximally-abbreviated form of a name suitable for monograms, e.g. CRD)
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Abbreviated = 0x0000000000000004L;

    @Generated
    private NSPersonNameComponentsFormatterStyle() {
    }
}
