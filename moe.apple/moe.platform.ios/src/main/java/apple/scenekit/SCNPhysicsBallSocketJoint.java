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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.scenekit.struct.SCNVector3;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * SCNPhysicsBallSocketJoint
 * 
 * SCNPhysicsBallSocketJoint makes two bodies to move like they are connected by a ball-and-socket joint (i.e it allows
 * rotations around all axes).
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPhysicsBallSocketJoint extends SCNPhysicsBehavior {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNPhysicsBallSocketJoint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNPhysicsBallSocketJoint alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNPhysicsBallSocketJoint allocWithZone(VoidPtr zone);

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

    /**
     * Initializes and returns a physics ball-and-socket joint.
     * The joint attaches "body" to the 3d location specified by "anchor" and relative to the node that owns the body.
     */
    @Generated
    @Selector("jointWithBody:anchor:")
    public static native SCNPhysicsBallSocketJoint jointWithBodyAnchor(@NotNull SCNPhysicsBody body,
            @ByValue SCNVector3 anchor);

    /**
     * Initializes and returns a physics ball-and-socket joint.
     * The joint attaches bodyA and bodyB on anchorA and anchorB respectively.
     */
    @Generated
    @Selector("jointWithBodyA:anchorA:bodyB:anchorB:")
    public static native SCNPhysicsBallSocketJoint jointWithBodyAAnchorABodyBAnchorB(@NotNull SCNPhysicsBody bodyA,
            @ByValue SCNVector3 anchorA, @NotNull SCNPhysicsBody bodyB, @ByValue SCNVector3 anchorB);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNPhysicsBallSocketJoint new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * the attach point of bodyA
     */
    @Generated
    @Selector("anchorA")
    @ByValue
    public native SCNVector3 anchorA();

    /**
     * the attach point of bodyB
     */
    @Generated
    @Selector("anchorB")
    @ByValue
    public native SCNVector3 anchorB();

    /**
     * the first body attached to the ball-and-socket joint
     */
    @NotNull
    @Generated
    @Selector("bodyA")
    public native SCNPhysicsBody bodyA();

    /**
     * the second body attached to the ball-and-socket joint
     */
    @Nullable
    @Generated
    @Selector("bodyB")
    public native SCNPhysicsBody bodyB();

    @Generated
    @Selector("init")
    public native SCNPhysicsBallSocketJoint init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNPhysicsBallSocketJoint initWithCoder(@NotNull NSCoder coder);

    /**
     * the attach point of bodyA
     */
    @Generated
    @Selector("setAnchorA:")
    public native void setAnchorA(@ByValue SCNVector3 value);

    /**
     * the attach point of bodyB
     */
    @Generated
    @Selector("setAnchorB:")
    public native void setAnchorB(@ByValue SCNVector3 value);

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
