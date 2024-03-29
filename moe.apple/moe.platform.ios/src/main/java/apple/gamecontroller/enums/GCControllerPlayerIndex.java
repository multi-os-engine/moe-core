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

package apple.gamecontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * This is the player index that a connected controller will have if it has never been assigned a player index on the
 * current system.
 * Controllers retain the player index they have been assigned between game sessions, so if you wish to unset the player
 * index of a
 * controller set it back to this value.
 */
@Generated
public final class GCControllerPlayerIndex {
    @Generated @NInt public static final long IndexUnset = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long Index1 = 0x0000000000000000L;
    @Generated @NInt public static final long Index2 = 0x0000000000000001L;
    @Generated @NInt public static final long Index3 = 0x0000000000000002L;
    @Generated @NInt public static final long Index4 = 0x0000000000000003L;

    @Generated
    private GCControllerPlayerIndex() {
    }
}
