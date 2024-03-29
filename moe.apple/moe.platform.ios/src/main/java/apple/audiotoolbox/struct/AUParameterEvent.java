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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure(alignment = 4)
public final class AUParameterEvent extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AUParameterEvent() {
        super(AUParameterEvent.class);
    }

    @Generated
    protected AUParameterEvent(Pointer peer) {
        super(peer);
    }

    /**
     * !< The next event in a linked list of events.
     */
    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr next();

    /**
     * !< The next event in a linked list of events.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setNext(@Nullable VoidPtr value);

    /**
     * !< The sample time at which the event is scheduled to occur.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long eventSampleTime();

    /**
     * !< The sample time at which the event is scheduled to occur.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setEventSampleTime(long value);

    /**
     * !< AURenderEventParameter or AURenderEventParameterRamp.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte eventType();

    /**
     * !< AURenderEventParameter or AURenderEventParameterRamp.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setEventType(byte value);

    /**
     * !< Must be 0.
     */
    @Generated
    @StructureField(order = 3, isGetter = true, count = 3)
    public native byte reserved(int field_idx);

    /**
     * !< Must be 0.
     */
    @Generated
    @StructureField(order = 3, isGetter = false, count = 3)
    public native void setReserved(byte value, int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int rampDurationSampleFrames();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setRampDurationSampleFrames(int value);

    /**
     * !< The parameter to change.
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long parameterAddress();

    /**
     * !< The parameter to change.
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setParameterAddress(long value);

    /**
     * !< If ramped, the parameter value at the
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native float value();

    /**
     * !< If ramped, the parameter value at the
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setValue(float value);
}
