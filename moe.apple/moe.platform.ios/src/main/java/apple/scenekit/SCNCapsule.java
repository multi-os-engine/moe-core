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
import apple.modelio.MDLMesh;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNCapsule
 * 
 * SCNCapsule represents a capsule with controllable height and cap radius.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNCapsule extends SCNGeometry {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNCapsule(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNCapsule alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNCapsule allocWithZone(VoidPtr zone);

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

    /**
     * capsuleWithCapRadius:height:
     * 
     * Creates and returns a capsule with given radius and height.
     * 
     * @param capRadius The radius of the capsule.
     * @param height    The height of the capsule.
     */
    @Generated
    @Selector("capsuleWithCapRadius:height:")
    public static native SCNCapsule capsuleWithCapRadiusHeight(@NFloat double capRadius, @NFloat double height);

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
    @Selector("geometry")
    public static native SCNCapsule geometry();

    @Generated
    @Selector("geometryWithMDLMesh:")
    public static native SCNCapsule geometryWithMDLMesh(@NotNull MDLMesh mdlMesh);

    @Generated
    @Selector("geometryWithSources:elements:")
    public static native SCNCapsule geometryWithSourcesElements(@NotNull NSArray<? extends SCNGeometrySource> sources,
            @Nullable NSArray<? extends SCNGeometryElement> elements);

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
    public static native SCNCapsule new_objc();

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
     * [@property] capRadius
     * 
     * The cap radius of the capsule. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 0.5.
     */
    @Generated
    @Selector("capRadius")
    @NFloat
    public native double capRadius();

    /**
     * [@property] capSegmentCount
     * 
     * The number of subdivisions in the cap. Animatable.
     * 
     * If the value is less than 2, the behavior is undefined. The default value is 24.
     */
    @Generated
    @Selector("capSegmentCount")
    @NInt
    public native long capSegmentCount();

    /**
     * [@property] height
     * 
     * The height of the capsule. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 2.
     */
    @Generated
    @Selector("height")
    @NFloat
    public native double height();

    /**
     * [@property] heightSegmentCount
     * 
     * The number of subdivisions along the Y axis. Animatable.
     * 
     * If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("heightSegmentCount")
    @NInt
    public native long heightSegmentCount();

    @Generated
    @Selector("init")
    public native SCNCapsule init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNCapsule initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] radialSegmentCount
     * 
     * The number of subdivisions along the radial coordinate. Animatable.
     * 
     * If the value is less than 3, the behavior is undefined. The default value is 48.
     */
    @Generated
    @Selector("radialSegmentCount")
    @NInt
    public native long radialSegmentCount();

    /**
     * [@property] capRadius
     * 
     * The cap radius of the capsule. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 0.5.
     */
    @Generated
    @Selector("setCapRadius:")
    public native void setCapRadius(@NFloat double value);

    /**
     * [@property] capSegmentCount
     * 
     * The number of subdivisions in the cap. Animatable.
     * 
     * If the value is less than 2, the behavior is undefined. The default value is 24.
     */
    @Generated
    @Selector("setCapSegmentCount:")
    public native void setCapSegmentCount(@NInt long value);

    /**
     * [@property] height
     * 
     * The height of the capsule. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 2.
     */
    @Generated
    @Selector("setHeight:")
    public native void setHeight(@NFloat double value);

    /**
     * [@property] heightSegmentCount
     * 
     * The number of subdivisions along the Y axis. Animatable.
     * 
     * If the value is less than 1, the behavior is undefined. The default value is 1.
     */
    @Generated
    @Selector("setHeightSegmentCount:")
    public native void setHeightSegmentCount(@NInt long value);

    /**
     * [@property] radialSegmentCount
     * 
     * The number of subdivisions along the radial coordinate. Animatable.
     * 
     * If the value is less than 3, the behavior is undefined. The default value is 48.
     */
    @Generated
    @Selector("setRadialSegmentCount:")
    public native void setRadialSegmentCount(@NInt long value);

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
