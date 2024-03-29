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

package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.struct.MTLTextureSwizzleChannels;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLTextureDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLTextureDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLTextureDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLTextureDescriptor allocWithZone(VoidPtr zone);

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
    public static native MTLTextureDescriptor new_objc();

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

    /**
     * texture2DDescriptorWithPixelFormat:width:height:mipmapped:
     * 
     * Create a TextureDescriptor for a common 2D texture.
     */
    @NotNull
    @Generated
    @Selector("texture2DDescriptorWithPixelFormat:width:height:mipmapped:")
    public static native MTLTextureDescriptor texture2DDescriptorWithPixelFormatWidthHeightMipmapped(
            @NUInt long pixelFormat, @NUInt long width, @NUInt long height, boolean mipmapped);

    /**
     * textureCubeDescriptorWithPixelFormat:size:mipmapped:
     * 
     * Create a TextureDescriptor for a common Cube texture.
     */
    @NotNull
    @Generated
    @Selector("textureCubeDescriptorWithPixelFormat:size:mipmapped:")
    public static native MTLTextureDescriptor textureCubeDescriptorWithPixelFormatSizeMipmapped(@NUInt long pixelFormat,
            @NUInt long size, boolean mipmapped);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] arrayLength
     * 
     * The number of array elements to allocate. The default value is 1.
     * 
     * When allocating any non-Array texture type, arrayLength has to be 1. Otherwise it must be set to something
     * greater than 1 and less than 2048.
     */
    @Generated
    @Selector("arrayLength")
    @NUInt
    public native long arrayLength();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] cpuCacheMode
     * 
     * Options to specify CPU cache mode of texture resource.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("cpuCacheMode")
    @NUInt
    public native long cpuCacheMode();

    /**
     * [@property] depth
     * 
     * The depth of the texture to create. The default value is 1.
     * 
     * depth When allocating any texture types other than 3D, depth must be 1.
     */
    @Generated
    @Selector("depth")
    @NUInt
    public native long depth();

    /**
     * [@property] height
     * 
     * The height of the texture to create. The default value is 1.
     * 
     * height If allocating a 1D texture, height must be 1.
     */
    @Generated
    @Selector("height")
    @NUInt
    public native long height();

    @Generated
    @Selector("init")
    public native MTLTextureDescriptor init();

    /**
     * [@property] mipmapLevelCount
     * 
     * The number of mipmap levels to allocate. The default value is 1.
     * 
     * When creating Buffer and Multisample textures, mipmapLevelCount must be 1.
     */
    @Generated
    @Selector("mipmapLevelCount")
    @NUInt
    public native long mipmapLevelCount();

    /**
     * [@property] pixelFormat
     * 
     * The pixel format to use when allocating this texture. This is also the pixel format that will be used to when the
     * caller writes or reads pixels from this texture. The default value is MTLPixelFormatRGBA8Unorm.
     */
    @Generated
    @Selector("pixelFormat")
    @NUInt
    public native long pixelFormat();

    /**
     * [@property] resourceOptions
     * 
     * Options to control memory allocation parameters, etc.
     * 
     * Contains a packed set of the storageMode, cpuCacheMode and hazardTrackingMode properties.
     */
    @Generated
    @Selector("resourceOptions")
    @NUInt
    public native long resourceOptions();

    /**
     * [@property] sampleCount
     * 
     * The number of samples in the texture to create. The default value is 1.
     * 
     * When creating Buffer textures sampleCount must be 1. Implementations may round sample counts up to the next
     * supported value.
     */
    @Generated
    @Selector("sampleCount")
    @NUInt
    public native long sampleCount();

    /**
     * [@property] arrayLength
     * 
     * The number of array elements to allocate. The default value is 1.
     * 
     * When allocating any non-Array texture type, arrayLength has to be 1. Otherwise it must be set to something
     * greater than 1 and less than 2048.
     */
    @Generated
    @Selector("setArrayLength:")
    public native void setArrayLength(@NUInt long value);

    /**
     * [@property] cpuCacheMode
     * 
     * Options to specify CPU cache mode of texture resource.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setCpuCacheMode:")
    public native void setCpuCacheMode(@NUInt long value);

    /**
     * [@property] depth
     * 
     * The depth of the texture to create. The default value is 1.
     * 
     * depth When allocating any texture types other than 3D, depth must be 1.
     */
    @Generated
    @Selector("setDepth:")
    public native void setDepth(@NUInt long value);

    /**
     * [@property] height
     * 
     * The height of the texture to create. The default value is 1.
     * 
     * height If allocating a 1D texture, height must be 1.
     */
    @Generated
    @Selector("setHeight:")
    public native void setHeight(@NUInt long value);

    /**
     * [@property] mipmapLevelCount
     * 
     * The number of mipmap levels to allocate. The default value is 1.
     * 
     * When creating Buffer and Multisample textures, mipmapLevelCount must be 1.
     */
    @Generated
    @Selector("setMipmapLevelCount:")
    public native void setMipmapLevelCount(@NUInt long value);

    /**
     * [@property] pixelFormat
     * 
     * The pixel format to use when allocating this texture. This is also the pixel format that will be used to when the
     * caller writes or reads pixels from this texture. The default value is MTLPixelFormatRGBA8Unorm.
     */
    @Generated
    @Selector("setPixelFormat:")
    public native void setPixelFormat(@NUInt long value);

    /**
     * [@property] resourceOptions
     * 
     * Options to control memory allocation parameters, etc.
     * 
     * Contains a packed set of the storageMode, cpuCacheMode and hazardTrackingMode properties.
     */
    @Generated
    @Selector("setResourceOptions:")
    public native void setResourceOptions(@NUInt long value);

    /**
     * [@property] sampleCount
     * 
     * The number of samples in the texture to create. The default value is 1.
     * 
     * When creating Buffer textures sampleCount must be 1. Implementations may round sample counts up to the next
     * supported value.
     */
    @Generated
    @Selector("setSampleCount:")
    public native void setSampleCount(@NUInt long value);

    /**
     * [@property] storageMode
     * 
     * To specify storage mode of texture resource.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setStorageMode:")
    public native void setStorageMode(@NUInt long value);

    /**
     * [@property] type
     * 
     * The overall type of the texture to be created. The default value is MTLTextureType2D.
     */
    @Generated
    @Selector("setTextureType:")
    public native void setTextureType(@NUInt long value);

    /**
     * [@property] usage
     * 
     * Description of texture usage
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setUsage:")
    public native void setUsage(@NUInt long value);

    /**
     * [@property] width
     * 
     * The width of the texture to create. The default value is 1.
     */
    @Generated
    @Selector("setWidth:")
    public native void setWidth(@NUInt long value);

    /**
     * [@property] storageMode
     * 
     * To specify storage mode of texture resource.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("storageMode")
    @NUInt
    public native long storageMode();

    /**
     * [@property] type
     * 
     * The overall type of the texture to be created. The default value is MTLTextureType2D.
     */
    @Generated
    @Selector("textureType")
    @NUInt
    public native long textureType();

    /**
     * [@property] usage
     * 
     * Description of texture usage
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("usage")
    @NUInt
    public native long usage();

    /**
     * [@property] width
     * 
     * The width of the texture to create. The default value is 1.
     */
    @Generated
    @Selector("width")
    @NUInt
    public native long width();

    /**
     * [@property] allowGPUOptimizedContents
     * 
     * Allow GPU-optimization for the contents of this texture. The default value is true.
     * 
     * Useful for opting-out of GPU-optimization when implicit optimization (e.g. RT writes) is regressing CPU-read-back
     * performance. See the documentation for optimizeContentsForGPUAccess: and optimizeContentsForCPUAccess: APIs.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("allowGPUOptimizedContents")
    public native boolean allowGPUOptimizedContents();

    /**
     * [@property] hazardTrackingMode
     * 
     * Set hazard tracking mode for the texture. The default value is MTLHazardTrackingModeDefault.
     * 
     * For resources created from the device, MTLHazardTrackingModeDefault is treated as MTLHazardTrackingModeTracked.
     * For resources created on a heap, MTLHazardTrackingModeDefault is treated as the hazardTrackingMode of the heap
     * itself.
     * In either case, it is possible to opt-out of hazard tracking by setting MTLHazardTrackingModeUntracked.
     * It is not possible to opt-in to hazard tracking on a heap that itself is not hazard tracked.
     * For optimal performance, perform hazard tracking manually through MTLFence or MTLEvent instead.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("hazardTrackingMode")
    @NUInt
    public native long hazardTrackingMode();

    /**
     * [@property] allowGPUOptimizedContents
     * 
     * Allow GPU-optimization for the contents of this texture. The default value is true.
     * 
     * Useful for opting-out of GPU-optimization when implicit optimization (e.g. RT writes) is regressing CPU-read-back
     * performance. See the documentation for optimizeContentsForGPUAccess: and optimizeContentsForCPUAccess: APIs.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setAllowGPUOptimizedContents:")
    public native void setAllowGPUOptimizedContents(boolean value);

    /**
     * [@property] hazardTrackingMode
     * 
     * Set hazard tracking mode for the texture. The default value is MTLHazardTrackingModeDefault.
     * 
     * For resources created from the device, MTLHazardTrackingModeDefault is treated as MTLHazardTrackingModeTracked.
     * For resources created on a heap, MTLHazardTrackingModeDefault is treated as the hazardTrackingMode of the heap
     * itself.
     * In either case, it is possible to opt-out of hazard tracking by setting MTLHazardTrackingModeUntracked.
     * It is not possible to opt-in to hazard tracking on a heap that itself is not hazard tracked.
     * For optimal performance, perform hazard tracking manually through MTLFence or MTLEvent instead.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setHazardTrackingMode:")
    public native void setHazardTrackingMode(@NUInt long value);

    /**
     * [@property] swizzle
     * 
     * Channel swizzle to use when reading or sampling from the texture, the default value is
     * MTLTextureSwizzleChannelsDefault.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setSwizzle:")
    public native void setSwizzle(@ByValue MTLTextureSwizzleChannels value);

    /**
     * [@property] swizzle
     * 
     * Channel swizzle to use when reading or sampling from the texture, the default value is
     * MTLTextureSwizzleChannelsDefault.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("swizzle")
    @ByValue
    public native MTLTextureSwizzleChannels swizzle();

    /**
     * textureBufferDescriptorWithPixelFormat:width:resourceOptions:usage:
     * 
     * Create a TextureDescriptor for a common texture buffer.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("textureBufferDescriptorWithPixelFormat:width:resourceOptions:usage:")
    public static native MTLTextureDescriptor textureBufferDescriptorWithPixelFormatWidthResourceOptionsUsage(
            @NUInt long pixelFormat, @NUInt long width, @NUInt long resourceOptions, @NUInt long usage);

    /**
     * [@property] compressionType
     * 
     * Controls how the texture contents will be compressed when written to by the GPU. Compression can be used to
     * reduce the bandwidth usage and storage requirements of a texture.
     * 
     * The default compression type is lossless, meaning that no loss of precision will occur when the texture content
     * is modified.
     * Losslessly compressed textures may benefit from reduced bandwidth usage when regions of correlated color values
     * are written, but do not benefit from reduced storage requirements.
     * Enabling lossy compression for textures that can tolerate some precision loss will guarantee both reduced
     * bandwidth usage and reduced storage requirements.
     * The amount of precision loss depends on the color values stored; regions with correlated color values can be
     * represented with limited to no precision loss, whereas regions with unrelated color values suffer more precision
     * loss.
     * Enabling lossy compression requires both storageMode == MTLStorageModePrivate, allowGPUOptimizedContents == YES,
     * and cannot be combined with either MTLTextureUsagePixelFormatView, MTLTextureUsageShaderWrite,
     * MTLTextureUsageShaderAtomic, MTLTextureType1D(Array) or MTLTextureTypeTextureBuffer.
     * Moreover, not all MTLPixelFormat are supported with lossy compression, verify that the MTLDevice's GPU family
     * supports the lossy compression feature for the pixelFormat requested.
     * Set allowGPUOptimizedContents to NO to opt out of both lossless and lossy compression; such textures do not
     * benefit from either reduced bandwidth usage or reduced storage requirements, but have predictable CPU readback
     * performance.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("compressionType")
    @NInt
    public native long compressionType();

    /**
     * [@property] compressionType
     * 
     * Controls how the texture contents will be compressed when written to by the GPU. Compression can be used to
     * reduce the bandwidth usage and storage requirements of a texture.
     * 
     * The default compression type is lossless, meaning that no loss of precision will occur when the texture content
     * is modified.
     * Losslessly compressed textures may benefit from reduced bandwidth usage when regions of correlated color values
     * are written, but do not benefit from reduced storage requirements.
     * Enabling lossy compression for textures that can tolerate some precision loss will guarantee both reduced
     * bandwidth usage and reduced storage requirements.
     * The amount of precision loss depends on the color values stored; regions with correlated color values can be
     * represented with limited to no precision loss, whereas regions with unrelated color values suffer more precision
     * loss.
     * Enabling lossy compression requires both storageMode == MTLStorageModePrivate, allowGPUOptimizedContents == YES,
     * and cannot be combined with either MTLTextureUsagePixelFormatView, MTLTextureUsageShaderWrite,
     * MTLTextureUsageShaderAtomic, MTLTextureType1D(Array) or MTLTextureTypeTextureBuffer.
     * Moreover, not all MTLPixelFormat are supported with lossy compression, verify that the MTLDevice's GPU family
     * supports the lossy compression feature for the pixelFormat requested.
     * Set allowGPUOptimizedContents to NO to opt out of both lossless and lossy compression; such textures do not
     * benefit from either reduced bandwidth usage or reduced storage requirements, but have predictable CPU readback
     * performance.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setCompressionType:")
    public native void setCompressionType(@NInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
