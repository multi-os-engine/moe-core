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
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * A SpriteKit node that masks child nodes using another node's alpha component
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKCropNode extends SKNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SKCropNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKCropNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKCropNode allocWithZone(VoidPtr zone);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public static native SKCropNode new_objc();

    @Generated
    @Selector("node")
    public static native SKCropNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKCropNode nodeWithFileNamed(@NotNull String filename);

    @NotNull
    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(
            @NotNull NSArray<? extends SKNode> nodes);

    @NotNull
    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            @NotNull NSArray<? extends SKNode> nodes);

    @NotNull
    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            @NotNull NSArray<? extends SKNode> sprites, float accuracy);

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
    public native SKCropNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKCropNode initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * SKNode to be used as the mask.
     * 
     * The SKNode supplied as the mask must not be a child of another node, but it may have children. Anywhere the
     * mask's output alpha component is less than 0.05 masks out that area for the SKCropNode's children. If the mask is
     * nil, nothing is masked out.
     */
    @Nullable
    @Generated
    @Selector("maskNode")
    public native SKNode maskNode();

    /**
     * SKNode to be used as the mask.
     * 
     * The SKNode supplied as the mask must not be a child of another node, but it may have children. Anywhere the
     * mask's output alpha component is less than 0.05 masks out that area for the SKCropNode's children. If the mask is
     * nil, nothing is masked out.
     */
    @Generated
    @Selector("setMaskNode:")
    public native void setMaskNode(@Nullable SKNode value);

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKCropNode nodeWithFileNamedSecurelyWithClassesAndError(@NotNull String filename,
            @NotNull NSSet<? extends Class> classes, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
