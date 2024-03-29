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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIDynamicItem;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 7.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDynamicItemBehavior extends UIDynamicBehavior {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDynamicItemBehavior(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDynamicItemBehavior alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIDynamicItemBehavior allocWithZone(VoidPtr zone);

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
    public static native UIDynamicItemBehavior new_objc();

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

    /**
     * The angular velocity, expressed in radians per second, that you want to add to the specified dynamic item
     * If called before being associated to an animator, the behavior will accumulate values until being associated to
     * an animator
     */
    @Generated
    @Selector("addAngularVelocity:forItem:")
    public native void addAngularVelocityForItem(@NFloat double velocity,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    @Generated
    @Selector("addItem:")
    public native void addItem(@NotNull @Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * The linear velocity, expressed in points per second, that you want to add to the specified dynamic item
     * If called before being associated to an animator, the behavior will accumulate values until being associated to
     * an animator
     */
    @Generated
    @Selector("addLinearVelocity:forItem:")
    public native void addLinearVelocityForItem(@ByValue CGPoint velocity,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * force an item to never rotate
     */
    @Generated
    @Selector("allowsRotation")
    public native boolean allowsRotation();

    /**
     * 0: no angular velocity damping
     */
    @Generated
    @Selector("angularResistance")
    @NFloat
    public native double angularResistance();

    @Generated
    @Selector("angularVelocityForItem:")
    @NFloat
    public native double angularVelocityForItem(@NotNull @Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * Specifies the charge associated with the item behavior. Charge determines the degree to which a dynamic item is
     * affected by
     * electric and magnetic fields. Note that this is a unitless quantity, it is up to the developer to
     * set charge and field strength appropriately. Defaults to 0.0
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("charge")
    @NFloat
    public native double charge();

    /**
     * 1 by default
     */
    @Generated
    @Selector("density")
    @NFloat
    public native double density();

    /**
     * Usually between 0 (inelastic) and 1 (collide elastically)
     */
    @Generated
    @Selector("elasticity")
    @NFloat
    public native double elasticity();

    /**
     * 0 being no friction between objects slide along each other
     */
    @Generated
    @Selector("friction")
    @NFloat
    public native double friction();

    @Generated
    @Selector("init")
    public native UIDynamicItemBehavior init();

    @Generated
    @Selector("initWithItems:")
    public native UIDynamicItemBehavior initWithItems(@NotNull NSArray<?> items);

    /**
     * If an item is anchored, it can participate in collisions, but will not exhibit
     * any dynamic response. i.e. The item will behave more like a collision boundary.
     * The default is NO
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("isAnchored")
    public native boolean isAnchored();

    /**
     * If an item is anchored, it can participate in collisions, but will not exhibit
     * any dynamic response. i.e. The item will behave more like a collision boundary.
     * The default is NO
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAnchored:")
    public native void setAnchored(boolean value);

    @NotNull
    @Generated
    @Selector("items")
    public native NSArray<?> items();

    @Generated
    @Selector("linearVelocityForItem:")
    @ByValue
    public native CGPoint linearVelocityForItem(@NotNull @Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    @Generated
    @Selector("removeItem:")
    public native void removeItem(@NotNull @Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * 0: no velocity damping
     */
    @Generated
    @Selector("resistance")
    @NFloat
    public native double resistance();

    /**
     * force an item to never rotate
     */
    @Generated
    @Selector("setAllowsRotation:")
    public native void setAllowsRotation(boolean value);

    /**
     * 0: no angular velocity damping
     */
    @Generated
    @Selector("setAngularResistance:")
    public native void setAngularResistance(@NFloat double value);

    /**
     * Specifies the charge associated with the item behavior. Charge determines the degree to which a dynamic item is
     * affected by
     * electric and magnetic fields. Note that this is a unitless quantity, it is up to the developer to
     * set charge and field strength appropriately. Defaults to 0.0
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setCharge:")
    public native void setCharge(@NFloat double value);

    /**
     * 1 by default
     */
    @Generated
    @Selector("setDensity:")
    public native void setDensity(@NFloat double value);

    /**
     * Usually between 0 (inelastic) and 1 (collide elastically)
     */
    @Generated
    @Selector("setElasticity:")
    public native void setElasticity(@NFloat double value);

    /**
     * 0 being no friction between objects slide along each other
     */
    @Generated
    @Selector("setFriction:")
    public native void setFriction(@NFloat double value);

    /**
     * 0: no velocity damping
     */
    @Generated
    @Selector("setResistance:")
    public native void setResistance(@NFloat double value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
