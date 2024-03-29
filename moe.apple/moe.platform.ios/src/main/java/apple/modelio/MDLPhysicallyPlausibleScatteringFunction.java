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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * API-Since: 9.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLPhysicallyPlausibleScatteringFunction extends MDLScatteringFunction {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLPhysicallyPlausibleScatteringFunction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLPhysicallyPlausibleScatteringFunction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLPhysicallyPlausibleScatteringFunction allocWithZone(VoidPtr zone);

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
    public static native MDLPhysicallyPlausibleScatteringFunction new_objc();

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
     * shape of specular highlight
     */
    @NotNull
    @Generated
    @Selector("anisotropic")
    public native MDLMaterialProperty anisotropic();

    /**
     * shape of specular highlight
     */
    @NotNull
    @Generated
    @Selector("anisotropicRotation")
    public native MDLMaterialProperty anisotropicRotation();

    /**
     * like clear acrylic on a car
     */
    @NotNull
    @Generated
    @Selector("clearcoat")
    public native MDLMaterialProperty clearcoat();

    /**
     * 0 = satin, 1 = glossy
     */
    @NotNull
    @Generated
    @Selector("clearcoatGloss")
    public native MDLMaterialProperty clearcoatGloss();

    @Generated
    @Selector("init")
    public native MDLPhysicallyPlausibleScatteringFunction init();

    /**
     * 0 = dielectric, 1 = metallic
     */
    @NotNull
    @Generated
    @Selector("metallic")
    public native MDLMaterialProperty metallic();

    /**
     * diffuse and specular response
     */
    @NotNull
    @Generated
    @Selector("roughness")
    public native MDLMaterialProperty roughness();

    /**
     * like velvet
     */
    @NotNull
    @Generated
    @Selector("sheen")
    public native MDLMaterialProperty sheen();

    /**
     * bias towards surface color
     */
    @NotNull
    @Generated
    @Selector("sheenTint")
    public native MDLMaterialProperty sheenTint();

    /**
     * specular value
     */
    @NotNull
    @Generated
    @Selector("specularAmount")
    public native MDLMaterialProperty specularAmount();

    /**
     * bias towards surface color
     */
    @NotNull
    @Generated
    @Selector("specularTint")
    public native MDLMaterialProperty specularTint();

    /**
     * diffuse shape
     */
    @NotNull
    @Generated
    @Selector("subsurface")
    public native MDLMaterialProperty subsurface();

    /**
     * currently 1
     */
    @Generated
    @Selector("version")
    @NInt
    public native long version();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
