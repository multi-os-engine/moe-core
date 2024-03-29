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

package apple.spritekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SKRange object used to define a range of allowable values
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKRange extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected SKRange(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKRange alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKRange allocWithZone(VoidPtr zone);

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
    public static native SKRange new_objc();

    /**
     * SKRange representing a single value
     */
    @Generated
    @Selector("rangeWithConstantValue:")
    public static native SKRange rangeWithConstantValue(@NFloat double value);

    /**
     * SKRange with only a lower limit
     */
    @Generated
    @Selector("rangeWithLowerLimit:")
    public static native SKRange rangeWithLowerLimit(@NFloat double lower);

    /**
     * SKRange with a lower and upper limit
     */
    @Generated
    @Selector("rangeWithLowerLimit:upperLimit:")
    public static native SKRange rangeWithLowerLimitUpperLimit(@NFloat double lower, @NFloat double upper);

    /**
     * SKRange with no upper or lower limit
     */
    @Generated
    @Selector("rangeWithNoLimits")
    public static native SKRange rangeWithNoLimits();

    /**
     * SKRange with only a upper limit
     */
    @Generated
    @Selector("rangeWithUpperLimit:")
    public static native SKRange rangeWithUpperLimit(@NFloat double upper);

    /**
     * SKRange representing a variance about a value
     */
    @Generated
    @Selector("rangeWithValue:variance:")
    public static native SKRange rangeWithValueVariance(@NFloat double value, @NFloat double variance);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native SKRange init();

    @Generated
    @Selector("initWithCoder:")
    public native SKRange initWithCoder(@NotNull NSCoder coder);

    /**
     * SKRange with a lower and upper limit. Designated initializer.
     */
    @Generated
    @Selector("initWithLowerLimit:upperLimit:")
    public native SKRange initWithLowerLimitUpperLimit(@NFloat double lower, @NFloat double upper);

    /**
     * The lower limit, -1.0 * CGFLOAT_MAX means no limit
     */
    @Generated
    @Selector("lowerLimit")
    @NFloat
    public native double lowerLimit();

    /**
     * The lower limit, -1.0 * CGFLOAT_MAX means no limit
     */
    @Generated
    @Selector("setLowerLimit:")
    public native void setLowerLimit(@NFloat double value);

    /**
     * The upper limit, +1.0 * CGFLOAT_MAX means no limit
     */
    @Generated
    @Selector("setUpperLimit:")
    public native void setUpperLimit(@NFloat double value);

    /**
     * The upper limit, +1.0 * CGFLOAT_MAX means no limit
     */
    @Generated
    @Selector("upperLimit")
    @NFloat
    public native double upperLimit();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
