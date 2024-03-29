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

package apple.coremidi.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class MIDISysexSendRequest extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MIDISysexSendRequest() {
        super(MIDISysexSendRequest.class);
    }

    @Generated
    protected MIDISysexSendRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int destination();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDestination(int value);

    @NotNull
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native ConstBytePtr data();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setData(@NotNull ConstBytePtr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int bytesToSend();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBytesToSend(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte complete();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setComplete(byte value);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 3)
    public native byte reserved(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 3)
    public native void setReserved(byte value, int field_idx);

    @NotNull
    @Generated
    @StructureField(order = 5, isGetter = true)
    @FunctionPtr(name = "call_completionProc")
    public native Function_completionProc completionProc();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setCompletionProc(
            @NotNull @FunctionPtr(name = "call_completionProc") Function_completionProc value);

    @Nullable
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native VoidPtr completionRefCon();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setCompletionRefCon(@Nullable VoidPtr value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_completionProc {
        @Generated
        void call_completionProc(
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MIDISysexSendRequest arg0);
    }
}
