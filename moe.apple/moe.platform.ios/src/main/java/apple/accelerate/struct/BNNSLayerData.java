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

package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class BNNSLayerData extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public BNNSLayerData() {
        super(BNNSLayerData.class);
    }

    @Generated
    protected BNNSLayerData(Pointer peer) {
        super(peer);
    }

    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native ConstVoidPtr data();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setData(@Nullable ConstVoidPtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int data_type();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setData_type(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float data_scale();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setData_scale(float value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float data_bias();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setData_bias(float value);

    @Nullable
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native ConstFloatPtr data_table();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setData_table(@Nullable ConstFloatPtr value);
}
