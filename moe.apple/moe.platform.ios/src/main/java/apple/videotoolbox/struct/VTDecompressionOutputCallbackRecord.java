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

package apple.videotoolbox.struct;

import apple.coremedia.struct.CMTime;
import apple.corevideo.opaque.CVBufferRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure(alignment = 4)
public final class VTDecompressionOutputCallbackRecord extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public VTDecompressionOutputCallbackRecord() {
        super(VTDecompressionOutputCallbackRecord.class);
    }

    @Generated
    protected VTDecompressionOutputCallbackRecord(Pointer peer) {
        super(peer);
    }

    @Generated
    public VTDecompressionOutputCallbackRecord(
            @FunctionPtr(name = "call_decompressionOutputCallback") @Nullable Function_decompressionOutputCallback decompressionOutputCallback,
            @Nullable VoidPtr decompressionOutputRefCon) {
        super(VTDecompressionOutputCallbackRecord.class);
        setDecompressionOutputCallback(decompressionOutputCallback);
        setDecompressionOutputRefCon(decompressionOutputRefCon);
    }

    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_decompressionOutputCallback")
    public native Function_decompressionOutputCallback decompressionOutputCallback();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDecompressionOutputCallback(
            @Nullable @FunctionPtr(name = "call_decompressionOutputCallback") Function_decompressionOutputCallback value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr decompressionOutputRefCon();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setDecompressionOutputRefCon(@Nullable VoidPtr value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_decompressionOutputCallback {
        @Generated
        void call_decompressionOutputCallback(@Nullable VoidPtr arg0, @Nullable VoidPtr arg1, int arg2, int arg3,
                @Nullable CVBufferRef arg4, @ByValue CMTime arg5, @ByValue CMTime arg6);
    }
}
