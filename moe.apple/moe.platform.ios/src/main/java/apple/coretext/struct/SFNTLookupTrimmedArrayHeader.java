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

package apple.coretext.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class SFNTLookupTrimmedArrayHeader extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public SFNTLookupTrimmedArrayHeader() {
        super(SFNTLookupTrimmedArrayHeader.class);
    }

    @Generated
    protected SFNTLookupTrimmedArrayHeader(Pointer peer) {
        super(peer);
    }

    @Generated
    public SFNTLookupTrimmedArrayHeader(char firstGlyph, char count, char valueArray) {
        super(SFNTLookupTrimmedArrayHeader.class);
        setFirstGlyph(firstGlyph);
        setCount(count);
        setValueArray(valueArray);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native char firstGlyph();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFirstGlyph(char value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native char count();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCount(char value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char valueArray();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setValueArray(char value);
}
