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

import apple.coreaudiotypes.struct.AudioBufferList;
import apple.coreaudiotypes.struct.AudioTimeStamp;
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
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class AURenderCallbackStruct extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AURenderCallbackStruct() {
        super(AURenderCallbackStruct.class);
    }

    @Generated
    protected AURenderCallbackStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    public AURenderCallbackStruct(@FunctionPtr(name = "call_inputProc") @Nullable Function_inputProc inputProc,
            @Nullable VoidPtr inputProcRefCon) {
        super(AURenderCallbackStruct.class);
        setInputProc(inputProc);
        setInputProcRefCon(inputProcRefCon);
    }

    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_inputProc")
    public native Function_inputProc inputProc();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setInputProc(@Nullable @FunctionPtr(name = "call_inputProc") Function_inputProc value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr inputProcRefCon();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setInputProcRefCon(@Nullable VoidPtr value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_inputProc {
        @Generated
        int call_inputProc(@NotNull VoidPtr arg0, @NotNull IntPtr arg1,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg2,
                int arg3, int arg4,
                @Nullable @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg5);
    }
}
