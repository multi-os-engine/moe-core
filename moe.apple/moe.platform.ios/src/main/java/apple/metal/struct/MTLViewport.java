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

package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLViewport extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MTLViewport() {
        super(MTLViewport.class);
    }

    @Generated
    protected MTLViewport(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native double originX();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOriginX(double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native double originY();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setOriginY(double value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native double width();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setWidth(double value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native double height();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setHeight(double value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native double znear();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setZnear(double value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native double zfar();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setZfar(double value);
}
