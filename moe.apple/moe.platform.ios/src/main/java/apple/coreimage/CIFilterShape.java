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

package apple.coreimage;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIFilterShape extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CIFilterShape(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIFilterShape alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIFilterShape allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CIFilterShape new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Create a shape representing the smallest integral rect containing 'r'.
     */
    @Generated
    @Selector("shapeWithRect:")
    public static native CIFilterShape shapeWithRect(@ByValue CGRect r);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Returns an integral rect that bounds the shape.
     */
    @Generated
    @Selector("extent")
    @ByValue
    public native CGRect extent();

    @Generated
    @Selector("init")
    public native CIFilterShape init();

    /**
     * Initializer.
     */
    @Generated
    @Selector("initWithRect:")
    public native CIFilterShape initWithRect(@ByValue CGRect r);

    /**
     * Create a shape representing the shape inset by 'delta'.
     */
    @NotNull
    @Generated
    @Selector("insetByX:Y:")
    public native CIFilterShape insetByXY(int dx, int dy);

    /**
     * Create a shape representing the intersection of the shape and 's2'.
     */
    @NotNull
    @Generated
    @Selector("intersectWith:")
    public native CIFilterShape intersectWith(@NotNull CIFilterShape s2);

    /**
     * Create a shape representing the intersection of the shape and the smallest
     * integral rect containing 'r'.
     */
    @NotNull
    @Generated
    @Selector("intersectWithRect:")
    public native CIFilterShape intersectWithRect(@ByValue CGRect r);

    /**
     * Create a shape from the result of transforming the shape by 'm'. If
     * 'flag' is false the new shape will contain all pixels in the
     * transformed shape (and possibly some outside the transformed shape).
     * If 'flag' is true the new shape will contain a subset of the pixels
     * in the transformed shape (but none of those outside the transformed
     * shape).
     */
    @NotNull
    @Generated
    @Selector("transformBy:interior:")
    public native CIFilterShape transformByInterior(@ByValue CGAffineTransform m, boolean flag);

    /**
     * Create a shape representing the union of the shape and 's2'.
     */
    @NotNull
    @Generated
    @Selector("unionWith:")
    public native CIFilterShape unionWith(@NotNull CIFilterShape s2);

    /**
     * Create a shape representing the union of the shape and the smallest
     * integral rect containing 'r'.
     */
    @NotNull
    @Generated
    @Selector("unionWithRect:")
    public native CIFilterShape unionWithRect(@ByValue CGRect r);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
