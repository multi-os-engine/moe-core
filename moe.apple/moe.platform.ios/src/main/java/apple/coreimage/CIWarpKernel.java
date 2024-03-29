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
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * CIWarpKernel is an object that encapsulates a Core Image Kernel Language
 * function that processes only the geometry of an image.
 * 
 * Warp kernel functions are declared akin to this example:
 * kernel vec2 myWarpKernel (vec4 params)
 * 
 * Additional arguments can be of type float, vec2, vec3, vec4.
 * The destination pixel location is obtained by calling destCoord().
 * The kernel should not call sample(), samplerCoord(), or samplerTransform().
 * The function must return a vec2 source location.
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIWarpKernel extends CIKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected CIWarpKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIWarpKernel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIWarpKernel allocWithZone(VoidPtr zone);

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
     * The string argument should contain a program with one warp kernel.
     * On iOS8 [CIWarpKernel kernelWithString:] can return a CIKernel, CIColorKernel, or CIWarpKernel object.
     * On iOS9 [CIWarpKernel kernelWithString:] will return a CIWarpKernel object or nil.
     * On OS X [CIWarpKernel kernelWithString:] will return a CIWarpKernel object or nil.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Core Image Kernel Language API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these
     * warnings)
     */
    @Deprecated
    @Generated
    @Selector("kernelWithString:")
    public static native CIWarpKernel kernelWithString(@NotNull String string);

    @Nullable
    @Deprecated
    @Generated
    @Selector("kernelsWithString:")
    public static native NSArray<? extends CIKernel> kernelsWithString(@NotNull String string);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CIWarpKernel new_objc();

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
     * Apply the receiver CIWarpKernel to produce a new CIImage object.
     * 
     * The 'extent' is the bounding box of all pixel coordinates that are warped by the
     * kernel to fall within the extent of 'image'.
     * 
     * The 'image' is the input image that will be warped into a new image.
     * 
     * The 'callback' is a block that should return the rectangle of the input image
     * that is needed to produce a given rectangle in the coordinate space of the
     * new image.
     * 
     * The 'args' is an array of parameters needed to describe the warping function.
     * The object types of the items in the array correspond to the argument types of the
     * kernel function. For example, if the first argument in the kernel is a vec3,
     * then the first object in the array must be a CIVector of count 3.
     */
    @Nullable
    @Generated
    @Selector("applyWithExtent:roiCallback:inputImage:arguments:")
    public native CIImage applyWithExtentRoiCallbackInputImageArguments(@ByValue CGRect extent,
            @NotNull @ObjCBlock(name = "call_applyWithExtentRoiCallbackInputImageArguments") Block_applyWithExtentRoiCallbackInputImageArguments callback,
            @NotNull CIImage image, @Nullable NSArray<?> args);

    @Generated
    @Selector("init")
    public native CIWarpKernel init();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applyWithExtentRoiCallbackInputImageArguments {
        @Generated
        @ByValue
        CGRect call_applyWithExtentRoiCallbackInputImageArguments(int index, @ByValue CGRect destRect);
    }

    @Generated
    @Selector("kernelWithFunctionName:fromMetalLibraryData:error:")
    public static native CIWarpKernel kernelWithFunctionNameFromMetalLibraryDataError(@NotNull String name,
            @NotNull NSData data, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("kernelWithFunctionName:fromMetalLibraryData:outputPixelFormat:error:")
    public static native CIWarpKernel kernelWithFunctionNameFromMetalLibraryDataOutputPixelFormatError(
            @NotNull String name, @NotNull NSData data, int format,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @NotNull
    @Generated
    @Selector("kernelNamesFromMetalLibraryData:")
    public static native NSArray<String> kernelNamesFromMetalLibraryData(@NotNull NSData data);

    @Nullable
    @Generated
    @Selector("kernelsWithMetalString:error:")
    public static native NSArray<? extends CIKernel> kernelsWithMetalStringError(@NotNull String source,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
