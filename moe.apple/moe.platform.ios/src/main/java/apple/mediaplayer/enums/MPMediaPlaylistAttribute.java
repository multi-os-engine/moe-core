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

package apple.mediaplayer.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * A playlist may have any number of MPMediaPlaylistAttributes associated.
 * 
 * API-Since: 3.0
 */
@Generated
public final class MPMediaPlaylistAttribute {
    /**
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * if set, the playlist was created on a device rather than synced from iTunes
     * 
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long OnTheGo = 0x0000000000000001L;
    /**
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long Smart = 0x0000000000000002L;
    /**
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long Genius = 0x0000000000000004L;

    @Generated
    private MPMediaPlaylistAttribute() {
    }
}
