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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIPressPhase {
    /**
     * whenever a button press begins.
     */
    @Generated @NInt public static final long Began = 0x0000000000000000L;
    /**
     * whenever a button moves.
     */
    @Generated @NInt public static final long Changed = 0x0000000000000001L;
    /**
     * whenever a buttons was pressed and is still being held down.
     */
    @Generated @NInt public static final long Stationary = 0x0000000000000002L;
    /**
     * whenever a button is released.
     */
    @Generated @NInt public static final long Ended = 0x0000000000000003L;
    /**
     * whenever a button press doesn't end but we need to stop tracking.
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000004L;

    @Generated
    private UIPressPhase() {
    }
}
