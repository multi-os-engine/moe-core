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

package apple.quartzcore;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.protocol.CAAction;
import apple.quartzcore.struct.CATransform3D;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * The replicator layer creates a specified number of copies of its
 * sublayers, each copy potentially having geometric, temporal and
 * color transformations applied to it.
 * 
 * Note: the CALayer -hitTest: method currently only tests the first
 * instance of z replicator layer's sublayers. This may change in the
 * future.
 * 
 * API-Since: 3.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAReplicatorLayer extends CALayer {
    static {
        NatJ.register();
    }

    @Generated
    protected CAReplicatorLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CAReplicatorLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CAReplicatorLayer allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(@NotNull String event);

    @Nullable
    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(@NotNull String key);

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
    @Selector("layer")
    public static native CAReplicatorLayer layer();

    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CAReplicatorLayer new_objc();

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

    @Generated
    @Selector("init")
    public native CAReplicatorLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native CAReplicatorLayer initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithLayer:")
    public native CAReplicatorLayer initWithLayer(@NotNull @Mapped(ObjCObjectMapper.class) Object layer);

    @Generated
    @Selector("instanceAlphaOffset")
    public native float instanceAlphaOffset();

    @Generated
    @Selector("instanceBlueOffset")
    public native float instanceBlueOffset();

    /**
     * The color to multiply the first object by (the source object). Defaults
     * to opaque white. Animatable.
     */
    @Nullable
    @Generated
    @Selector("instanceColor")
    public native CGColorRef instanceColor();

    /**
     * The number of copies to create, including the source object.
     * Default value is one (i.e. no extra copies). Animatable.
     */
    @Generated
    @Selector("instanceCount")
    @NInt
    public native long instanceCount();

    /**
     * The temporal delay between replicated copies. Defaults to zero.
     * Animatable.
     */
    @Generated
    @Selector("instanceDelay")
    public native double instanceDelay();

    @Generated
    @Selector("instanceGreenOffset")
    public native float instanceGreenOffset();

    /**
     * The color components added to the color of instance k-1 to produce
     * the modulation color of instance k. Defaults to the clear color (no
     * change). Animatable.
     */
    @Generated
    @Selector("instanceRedOffset")
    public native float instanceRedOffset();

    /**
     * The matrix applied to instance k-1 to produce instance k. The matrix
     * is applied relative to the center of the replicator layer, i.e. the
     * superlayer of each replicated sublayer. Defaults to the identity
     * matrix. Animatable.
     */
    @Generated
    @Selector("instanceTransform")
    @ByValue
    public native CATransform3D instanceTransform();

    /**
     * Defines whether this layer flattens its sublayers into its plane or
     * not (i.e. whether it's treated similarly to a transform layer or
     * not). Defaults to NO. If YES, the standard restrictions apply (see
     * CATransformLayer.h).
     */
    @Generated
    @Selector("preservesDepth")
    public native boolean preservesDepth();

    @Generated
    @Selector("setInstanceAlphaOffset:")
    public native void setInstanceAlphaOffset(float value);

    @Generated
    @Selector("setInstanceBlueOffset:")
    public native void setInstanceBlueOffset(float value);

    /**
     * The color to multiply the first object by (the source object). Defaults
     * to opaque white. Animatable.
     */
    @Generated
    @Selector("setInstanceColor:")
    public native void setInstanceColor(@Nullable CGColorRef value);

    /**
     * The number of copies to create, including the source object.
     * Default value is one (i.e. no extra copies). Animatable.
     */
    @Generated
    @Selector("setInstanceCount:")
    public native void setInstanceCount(@NInt long value);

    /**
     * The temporal delay between replicated copies. Defaults to zero.
     * Animatable.
     */
    @Generated
    @Selector("setInstanceDelay:")
    public native void setInstanceDelay(double value);

    @Generated
    @Selector("setInstanceGreenOffset:")
    public native void setInstanceGreenOffset(float value);

    /**
     * The color components added to the color of instance k-1 to produce
     * the modulation color of instance k. Defaults to the clear color (no
     * change). Animatable.
     */
    @Generated
    @Selector("setInstanceRedOffset:")
    public native void setInstanceRedOffset(float value);

    /**
     * The matrix applied to instance k-1 to produce instance k. The matrix
     * is applied relative to the center of the replicator layer, i.e. the
     * superlayer of each replicated sublayer. Defaults to the identity
     * matrix. Animatable.
     */
    @Generated
    @Selector("setInstanceTransform:")
    public native void setInstanceTransform(@ByValue CATransform3D value);

    /**
     * Defines whether this layer flattens its sublayers into its plane or
     * not (i.e. whether it's treated similarly to a transform layer or
     * not). Defaults to NO. If YES, the standard restrictions apply (see
     * CATransformLayer.h).
     */
    @Generated
    @Selector("setPreservesDepth:")
    public native void setPreservesDepth(boolean value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("cornerCurveExpansionFactor:")
    @NFloat
    public static native double cornerCurveExpansionFactor(@NotNull String curve);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
