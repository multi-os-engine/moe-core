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

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CFNumberFormatterStyle {
    @Generated @NInt public static final long NoStyle = 0x0000000000000000L;
    @Generated @NInt public static final long DecimalStyle = 0x0000000000000001L;
    @Generated @NInt public static final long CurrencyStyle = 0x0000000000000002L;
    @Generated @NInt public static final long PercentStyle = 0x0000000000000003L;
    @Generated @NInt public static final long ScientificStyle = 0x0000000000000004L;
    @Generated @NInt public static final long SpellOutStyle = 0x0000000000000005L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long OrdinalStyle = 0x0000000000000006L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long CurrencyISOCodeStyle = 0x0000000000000008L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long CurrencyPluralStyle = 0x0000000000000009L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long CurrencyAccountingStyle = 0x000000000000000AL;

    @Generated
    private CFNumberFormatterStyle() {
    }
}
