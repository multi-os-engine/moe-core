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
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class AUInputSamplesInOutputCallbackStruct extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AUInputSamplesInOutputCallbackStruct() {
        super(AUInputSamplesInOutputCallbackStruct.class);
    }

    @Generated
    protected AUInputSamplesInOutputCallbackStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    public AUInputSamplesInOutputCallbackStruct(
            @FunctionPtr(name = "call_inputToOutputCallback") @NotNull Function_inputToOutputCallback inputToOutputCallback,
            @Nullable VoidPtr userData) {
        super(AUInputSamplesInOutputCallbackStruct.class);
        setInputToOutputCallback(inputToOutputCallback);
        setUserData(userData);
    }

    @NotNull
    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_inputToOutputCallback")
    public native Function_inputToOutputCallback inputToOutputCallback();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setInputToOutputCallback(
            @NotNull @FunctionPtr(name = "call_inputToOutputCallback") Function_inputToOutputCallback value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr userData();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setUserData(@Nullable VoidPtr value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_inputToOutputCallback {
        @Generated
        void call_inputToOutputCallback(@NotNull VoidPtr arg0,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg1,
                double arg2, double arg3);
    }
}
