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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Deprecated
@Generated
@Structure()
public final class BNNSFullyConnectedLayerParameters extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public BNNSFullyConnectedLayerParameters() {
        super(BNNSFullyConnectedLayerParameters.class);
    }

    @Generated
    protected BNNSFullyConnectedLayerParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long in_size();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIn_size(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long out_size();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setOut_size(@NUInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSLayerData weights();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setWeights(@ByValue BNNSLayerData value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native BNNSLayerData bias();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setBias(@ByValue BNNSLayerData value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native BNNSActivation activation();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setActivation(@ByValue BNNSActivation value);
}
