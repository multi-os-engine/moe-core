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

package apple.modelio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.modelio.protocol.MDLMeshBufferAllocator;
import apple.scenekit.SCNLight;
import apple.scenekit.SCNNode;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MDLPhotometricLight
 * 
 * A light created from measurements at various angles.
 * 
 * [@property] lightCubeMap A cube map that can be sampled at various directions to
 * learn the intensity of the light in that direction.
 * [@property] sphericalHarmonicsLevel The value generateSphericalHarmonicsFromLight:
 * used to calculate the spherical harmonics coefficients
 * [@property] sphericalHarmonicsCoefficients The spherical harmonic coefficiencts
 * calculated by generateSphericalHarmonicsFromLight:
 * 
 * API-Since: 9.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLPhotometricLight extends MDLPhysicallyPlausibleLight {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLPhotometricLight(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLPhotometricLight alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLPhotometricLight allocWithZone(VoidPtr zone);

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
    @Selector("lightWithSCNLight:")
    public static native MDLPhotometricLight lightWithSCNLight(@NotNull SCNLight scnLight);

    @Generated
    @Owned
    @Selector("new")
    public static native MDLPhotometricLight new_objc();

    @Generated
    @Selector("objectWithSCNNode:")
    public static native MDLPhotometricLight objectWithSCNNode(@NotNull SCNNode scnNode);

    @Generated
    @Selector("objectWithSCNNode:bufferAllocator:")
    public static native MDLPhotometricLight objectWithSCNNodeBufferAllocator(@NotNull SCNNode scnNode,
            @Nullable @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

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
    @Selector("generateCubemapFromLight:")
    public native void generateCubemapFromLight(@NUInt long textureSize);

    @Generated
    @Selector("generateSphericalHarmonicsFromLight:")
    public native void generateSphericalHarmonicsFromLight(@NUInt long sphericalHarmonicsLevel);

    @Generated
    @Selector("init")
    public native MDLPhotometricLight init();

    /**
     * Init with an IES profile file, generate a light web of specified width and height
     */
    @Generated
    @Selector("initWithIESProfile:")
    public native MDLPhotometricLight initWithIESProfile(@NotNull NSURL URL);

    @Nullable
    @Generated
    @Selector("lightCubeMap")
    public native MDLTexture lightCubeMap();

    @Nullable
    @Generated
    @Selector("sphericalHarmonicsCoefficients")
    public native NSData sphericalHarmonicsCoefficients();

    @Generated
    @Selector("sphericalHarmonicsLevel")
    @NUInt
    public native long sphericalHarmonicsLevel();

    /**
     * generateTexture
     * 
     * Generate an IES compliant MDLTexture
     * 1D when the number of horizontal angles is one and the innerConeAngle is < 180
     * 2D when the previous statement fails and innerConeAngle < 89
     * 3D in all other cases
     * the parameter textureSize is the size in pixels of the texture image. For a size of N,
     * 1D generates an Nx1 image, 2D generates an NxN image, 3D generates an Nx(N*6) image (i.e. cubemap).
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("generateTexture:")
    public native MDLTexture generateTexture(@NUInt long textureSize);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
