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
public final class AURenderEventHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AURenderEventHeader() {
        super(AURenderEventHeader.class);
    }

    @Generated
    protected AURenderEventHeader(Pointer peer) {
        super(peer);
    }

    @Generated
    public AURenderEventHeader(@Nullable VoidPtr next, long eventSampleTime, byte eventType, byte reserved) {
        super(AURenderEventHeader.class);
        setNext(next);
        setEventSampleTime(eventSampleTime);
        setEventType(eventType);
        setReserved(reserved);
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
     * !< The type of the event.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native byte eventType();

    /**
     * !< The type of the event.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setEventType(byte value);

    /**
     * !< Must be 0.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte reserved();

    /**
     * !< Must be 0.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setReserved(byte value);
}
