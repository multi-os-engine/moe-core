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

package apple.coremedia.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure(alignment = 4)
public final class CMBlockBufferCustomBlockSource extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CMBlockBufferCustomBlockSource() {
        super(CMBlockBufferCustomBlockSource.class);
    }

    @Generated
    protected CMBlockBufferCustomBlockSource(Pointer peer) {
        super(peer);
    }

    @Generated
    public CMBlockBufferCustomBlockSource(int version,
            @FunctionPtr(name = "call_AllocateBlock") @Nullable Function_AllocateBlock AllocateBlock,
            @FunctionPtr(name = "call_FreeBlock") @Nullable Function_FreeBlock FreeBlock, @Nullable VoidPtr refCon) {
        super(CMBlockBufferCustomBlockSource.class);
        setVersion(version);
        setAllocateBlock(AllocateBlock);
        setFreeBlock(FreeBlock);
        setRefCon(refCon);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_AllocateBlock")
    public native Function_AllocateBlock AllocateBlock();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAllocateBlock(
            @Nullable @FunctionPtr(name = "call_AllocateBlock") Function_AllocateBlock value);

    @Nullable
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_FreeBlock")
    public native Function_FreeBlock FreeBlock();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFreeBlock(@Nullable @FunctionPtr(name = "call_FreeBlock") Function_FreeBlock value);

    @Nullable
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native VoidPtr refCon();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRefCon(@Nullable VoidPtr value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_AllocateBlock {
        @Nullable
        @Generated
        VoidPtr call_AllocateBlock(@Nullable VoidPtr arg0, @NUInt long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_FreeBlock {
        @Generated
        void call_FreeBlock(@Nullable VoidPtr arg0, @NotNull VoidPtr arg1, @NUInt long arg2);
    }
}
