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
 * SCNSphere
 * 
 * SCNSphere represents a sphere with controllable radius
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNSphere extends SCNGeometry {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNSphere(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNSphere alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNSphere allocWithZone(VoidPtr zone);

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
    @Selector("geometry")
    public static native SCNSphere geometry();

    @Generated
    @Selector("geometryWithMDLMesh:")
    public static native SCNSphere geometryWithMDLMesh(@NotNull MDLMesh mdlMesh);

    @Generated
    @Selector("geometryWithSources:elements:")
    public static native SCNSphere geometryWithSourcesElements(@NotNull NSArray<? extends SCNGeometrySource> sources,
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
    public static native SCNSphere new_objc();

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
     * sphereWithRadius:
     * 
     * Creates and returns a sphere with given radius.
     * 
     * @param radius The radius of the sphere.
     */
    @Generated
    @Selector("sphereWithRadius:")
    public static native SCNSphere sphereWithRadius(@NFloat double radius);

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

    @Generated
    @Selector("init")
    public native SCNSphere init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNSphere initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] geodesic
     * 
     * Indicate if the geometry is a geosphere.
     * 
     * The default value is NO.
     */
    @Generated
    @Selector("isGeodesic")
    public native boolean isGeodesic();

    /**
     * [@property] geodesic
     * 
     * Indicate if the geometry is a geosphere.
     * 
     * The default value is NO.
     */
    @Generated
    @Selector("setGeodesic:")
    public native void setGeodesic(boolean value);

    /**
     * [@property] radius
     * 
     * The sphere radius. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 0.5.
     */
    @Generated
    @Selector("radius")
    @NFloat
    public native double radius();

    /**
     * [@property] segmentCount
     * 
     * The number of segments along both spherical coordinates. Animatable.
     * 
     * If the value is less than 3, the behavior is undefined. The default value is 24.
     */
    @Generated
    @Selector("segmentCount")
    @NInt
    public native long segmentCount();

    /**
     * [@property] radius
     * 
     * The sphere radius. Animatable.
     * 
     * If the value is less than or equal to 0, the geometry is empty. The default value is 0.5.
     */
    @Generated
    @Selector("setRadius:")
    public native void setRadius(@NFloat double value);

    /**
     * [@property] segmentCount
     * 
     * The number of segments along both spherical coordinates. Animatable.
     * 
     * If the value is less than 3, the behavior is undefined. The default value is 24.
     */
    @Generated
    @Selector("setSegmentCount:")
    public native void setSegmentCount(@NInt long value);

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
