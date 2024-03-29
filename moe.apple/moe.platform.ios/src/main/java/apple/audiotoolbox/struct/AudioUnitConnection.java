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

package apple.audiotoolbox.struct;

import apple.audiotoolbox.opaque.AudioComponentInstance;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class AudioUnitConnection extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AudioUnitConnection() {
        super(AudioUnitConnection.class);
    }

    @Generated
    protected AudioUnitConnection(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioUnitConnection(@Nullable AudioComponentInstance sourceAudioUnit, int sourceOutputNumber,
            int destInputNumber) {
        super(AudioUnitConnection.class);
        setSourceAudioUnit(sourceAudioUnit);
        setSourceOutputNumber(sourceOutputNumber);
        setDestInputNumber(destInputNumber);
    }

    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native AudioComponentInstance sourceAudioUnit();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSourceAudioUnit(@Nullable AudioComponentInstance value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int sourceOutputNumber();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSourceOutputNumber(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int destInputNumber();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDestInputNumber(int value);
}
