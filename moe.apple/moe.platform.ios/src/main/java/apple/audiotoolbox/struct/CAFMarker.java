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

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 1)
public final class CAFMarker extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CAFMarker() {
        super(CAFMarker.class);
    }

    @Generated
    protected CAFMarker(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mType();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMType(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native double mFramePosition();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMFramePosition(double value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mMarkerID();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMMarkerID(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native CAF_SMPTE_Time mSMPTETime();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMSMPTETime(@ByValue CAF_SMPTE_Time value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int mChannel();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMChannel(int value);
}
