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
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKNoiseMap;
import apple.uikit.UIImage;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SKMutableTextures are not currently supported in the simulator
 * 
 * API-Since: 8.0
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKMutableTexture extends SKTexture {
    static {
        NatJ.register();
    }

    @Generated
    protected SKMutableTexture(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKMutableTexture alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKMutableTexture allocWithZone(VoidPtr zone);

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
    @Selector("mutableTextureWithSize:")
    public static native SKMutableTexture mutableTextureWithSize(@ByValue CGSize size);

    @Generated
    @Owned
    @Selector("new")
    public static native SKMutableTexture new_objc();

    @Generated
    @Selector("preloadTextures:withCompletionHandler:")
    public static native void preloadTexturesWithCompletionHandler(@NotNull NSArray<? extends SKTexture> textures,
            @NotNull @ObjCBlock(name = "call_preloadTexturesWithCompletionHandler") SKTexture.Block_preloadTexturesWithCompletionHandler completionHandler);

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
    @Selector("textureNoiseWithSmoothness:size:grayscale:")
    public static native SKMutableTexture textureNoiseWithSmoothnessSizeGrayscale(@NFloat double smoothness,
            @ByValue CGSize size, boolean grayscale);

    @Generated
    @Selector("textureVectorNoiseWithSmoothness:size:")
    public static native SKMutableTexture textureVectorNoiseWithSmoothnessSize(@NFloat double smoothness,
            @ByValue CGSize size);

    @Generated
    @Selector("textureWithCGImage:")
    public static native SKMutableTexture textureWithCGImage(@NotNull CGImageRef image);

    @Generated
    @Selector("textureWithData:size:")
    public static native SKMutableTexture textureWithDataSize(@NotNull NSData pixelData, @ByValue CGSize size);

    @Generated
    @Selector("textureWithData:size:flipped:")
    public static native SKMutableTexture textureWithDataSizeFlipped(@NotNull NSData pixelData, @ByValue CGSize size,
            boolean flipped);

    @Generated
    @Selector("textureWithData:size:rowLength:alignment:")
    public static native SKMutableTexture textureWithDataSizeRowLengthAlignment(@NotNull NSData pixelData,
            @ByValue CGSize size, int rowLength, int alignment);

    @Generated
    @Selector("textureWithImage:")
    public static native SKMutableTexture textureWithImage(@NotNull UIImage image);

    @Generated
    @Selector("textureWithImageNamed:")
    public static native SKMutableTexture textureWithImageNamed(@NotNull String name);

    @Generated
    @Selector("textureWithNoiseMap:")
    public static native SKMutableTexture textureWithNoiseMap(@NotNull GKNoiseMap noiseMap);

    @Generated
    @Selector("textureWithRect:inTexture:")
    public static native SKMutableTexture textureWithRectInTexture(@ByValue CGRect rect, @NotNull SKTexture texture);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native SKMutableTexture init();

    @Generated
    @Selector("initWithCoder:")
    public native SKMutableTexture initWithCoder(@NotNull NSCoder coder);

    /**
     * Create a mutable texture with a specfic size.
     * 
     * @param size the dimension to use when creating the given texture.
     */
    @Generated
    @Selector("initWithSize:")
    public native SKMutableTexture initWithSize(@ByValue CGSize size);

    /**
     * Create a mutable texture with a specfic size and type.
     * 
     * @param size   the dimension to use when creating the given texture.
     * @param format the CoreVideo format type. supported types include 'RGBA', 'RGhA', and 'RGfA' for byte, half-float,
     *               and float components.
     */
    @Generated
    @Selector("initWithSize:pixelFormat:")
    public native SKMutableTexture initWithSizePixelFormat(@ByValue CGSize size, int format);

    /**
     * Modify the created mutable texture.
     */
    @Generated
    @Selector("modifyPixelDataWithBlock:")
    public native void modifyPixelDataWithBlock(
            @ObjCBlock(name = "call_modifyPixelDataWithBlock") Block_modifyPixelDataWithBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modifyPixelDataWithBlock {
        @Generated
        void call_modifyPixelDataWithBlock(VoidPtr pixelData, @NUInt long lengthInBytes);
    }

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
