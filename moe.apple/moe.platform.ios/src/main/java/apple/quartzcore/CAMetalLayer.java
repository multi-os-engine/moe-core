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

package apple.quartzcore;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.quartzcore.protocol.CAAction;
import apple.quartzcore.protocol.CAMetalDrawable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
import apple.foundation.NSDictionary;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Note: The default value of the `opaque' property for CAMetalLayer
 * instances is true.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAMetalLayer extends CALayer {
    static {
        NatJ.register();
    }

    @Generated
    protected CAMetalLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CAMetalLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CAMetalLayer allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(@NotNull String event);

    @Nullable
    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(@NotNull String key);

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
    @Selector("layer")
    public static native CAMetalLayer layer();

    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CAMetalLayer new_objc();

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
     * This property determines which MTLDevice the MTLTexture objects for
     * the drawables will be created from.
     * On iOS this defaults to MTLCreateSystemDefaultDevice().
     * On macOS this defaults to nil and must be set explicitly before asking for
     * the first drawable.
     */
    @Nullable
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    /**
     * This property controls the pixel dimensions of the returned drawable
     * objects. The most typical value will be the layer size multiplied by
     * the layer contentsScale property.
     */
    @Generated
    @Selector("drawableSize")
    @ByValue
    public native CGSize drawableSize();

    /**
     * This property controls whether or not the returned drawables'
     * MTLTextures may only be used for framebuffer attachments (YES) or
     * whether they may also be used for texture sampling and pixel
     * read/write operations (NO). A value of YES allows CAMetalLayer to
     * allocate the MTLTexture objects in ways that are optimized for display
     * purposes that makes them unsuitable for sampling. The recommended
     * value for most applications is YES.
     */
    @Generated
    @Selector("framebufferOnly")
    public native boolean framebufferOnly();

    @Generated
    @Selector("init")
    public native CAMetalLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native CAMetalLayer initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithLayer:")
    public native CAMetalLayer initWithLayer(@NotNull @Mapped(ObjCObjectMapper.class) Object layer);

    /**
     * Get the swap queue's next available drawable. Always blocks until a drawable
     * is available. Can return nil under the following conditions:
     * 1) The layer has an invalid combination of drawable properties.
     * 2) All drawables in the swap queue are in-use and the 1 second timeout
     * has elapsed. (except when `allowsNextDrawableTimeout' is set to NO)
     * 3) Process is out of memory.
     */
    @Nullable
    @Generated
    @Selector("nextDrawable")
    @MappedReturn(ObjCObjectMapper.class)
    public native CAMetalDrawable nextDrawable();

    /**
     * This property controls the pixel format of the MTLTexture objects.
     * The two supported values are MTLPixelFormatBGRA8Unorm and
     * MTLPixelFormatBGRA8Unorm_sRGB.
     */
    @Generated
    @Selector("pixelFormat")
    @NUInt
    public native long pixelFormat();

    /**
     * When false (the default value) changes to the layer's render buffer
     * appear on-screen asynchronously to normal layer updates. When true,
     * changes to the MTL content are sent to the screen via the standard
     * CATransaction mechanisms.
     */
    @Generated
    @Selector("presentsWithTransaction")
    public native boolean presentsWithTransaction();

    /**
     * This property determines which MTLDevice the MTLTexture objects for
     * the drawables will be created from.
     * On iOS this defaults to MTLCreateSystemDefaultDevice().
     * On macOS this defaults to nil and must be set explicitly before asking for
     * the first drawable.
     */
    @Generated
    @Selector("setDevice:")
    public native void setDevice(@Nullable @Mapped(ObjCObjectMapper.class) MTLDevice value);

    /**
     * This property controls the pixel dimensions of the returned drawable
     * objects. The most typical value will be the layer size multiplied by
     * the layer contentsScale property.
     */
    @Generated
    @Selector("setDrawableSize:")
    public native void setDrawableSize(@ByValue CGSize value);

    /**
     * This property controls whether or not the returned drawables'
     * MTLTextures may only be used for framebuffer attachments (YES) or
     * whether they may also be used for texture sampling and pixel
     * read/write operations (NO). A value of YES allows CAMetalLayer to
     * allocate the MTLTexture objects in ways that are optimized for display
     * purposes that makes them unsuitable for sampling. The recommended
     * value for most applications is YES.
     */
    @Generated
    @Selector("setFramebufferOnly:")
    public native void setFramebufferOnly(boolean value);

    /**
     * This property controls the pixel format of the MTLTexture objects.
     * The two supported values are MTLPixelFormatBGRA8Unorm and
     * MTLPixelFormatBGRA8Unorm_sRGB.
     */
    @Generated
    @Selector("setPixelFormat:")
    public native void setPixelFormat(@NUInt long value);

    /**
     * When false (the default value) changes to the layer's render buffer
     * appear on-screen asynchronously to normal layer updates. When true,
     * changes to the MTL content are sent to the screen via the standard
     * CATransaction mechanisms.
     */
    @Generated
    @Selector("setPresentsWithTransaction:")
    public native void setPresentsWithTransaction(boolean value);

    /**
     * Controls if `-nextDrawable' is allowed to timeout after 1 second and return
     * nil if * the system does not have a free drawable available. The default
     * value is YES. If set to NO, then `-nextDrawable' will block forever until a
     * free drawable is available.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("allowsNextDrawableTimeout")
    public native boolean allowsNextDrawableTimeout();

    /**
     * Controls if `-nextDrawable' is allowed to timeout after 1 second and return
     * nil if * the system does not have a free drawable available. The default
     * value is YES. If set to NO, then `-nextDrawable' will block forever until a
     * free drawable is available.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setAllowsNextDrawableTimeout:")
    public native void setAllowsNextDrawableTimeout(boolean value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The colorspace of the rendered frames. If nil, no colormatching occurs.
     * If non-nil, the rendered content will be colormatched to the colorspace of
     * the context containing this layer (typically the display's colorspace).
     */
    @Nullable
    @Generated
    @Selector("colorspace")
    public native CGColorSpaceRef colorspace();

    @Generated
    @Selector("cornerCurveExpansionFactor:")
    @NFloat
    public static native double cornerCurveExpansionFactor(@NotNull String curve);

    /**
     * Controls the number maximum number of drawables in the swap queue. The
     * default value is 3. Values set outside of range [2, 3] are ignored and an
     * exception will be thrown.
     * 
     * API-Since: 11.2
     */
    @Generated
    @Selector("maximumDrawableCount")
    @NUInt
    public native long maximumDrawableCount();

    /**
     * This property returns the preferred MTLDevice for this CAMetalLayer.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("preferredDevice")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice preferredDevice();

    /**
     * The colorspace of the rendered frames. If nil, no colormatching occurs.
     * If non-nil, the rendered content will be colormatched to the colorspace of
     * the context containing this layer (typically the display's colorspace).
     */
    @Generated
    @Selector("setColorspace:")
    public native void setColorspace(@Nullable CGColorSpaceRef value);

    /**
     * Controls the number maximum number of drawables in the swap queue. The
     * default value is 3. Values set outside of range [2, 3] are ignored and an
     * exception will be thrown.
     * 
     * API-Since: 11.2
     */
    @Generated
    @Selector("setMaximumDrawableCount:")
    public native void setMaximumDrawableCount(@NUInt long value);

    /**
     * Metadata describing extended dynamic range content in the layer's drawable.
     * Must be set before calling nextDrawable. If non-nil, content may be
     * tone mapped to match the current display characteristics. If nil, samples
     * will be rendered without tone mapping and values above the maximum EDR value
     * -[NSScreen maximumExtendedDynamicRangeColorComponentValue] may be clamped.
     * Defaults to nil.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("EDRMetadata")
    public native CAEDRMetadata EDRMetadata();

    /**
     * When non-nil, controls the options of developer HUD. Defaults to nil.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("developerHUDProperties")
    public native NSDictionary<?, ?> developerHUDProperties();

    /**
     * When non-nil, controls the options of developer HUD. Defaults to nil.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDeveloperHUDProperties:")
    public native void setDeveloperHUDProperties(@Nullable NSDictionary<?, ?> value);

    /**
     * Metadata describing extended dynamic range content in the layer's drawable.
     * Must be set before calling nextDrawable. If non-nil, content may be
     * tone mapped to match the current display characteristics. If nil, samples
     * will be rendered without tone mapping and values above the maximum EDR value
     * -[NSScreen maximumExtendedDynamicRangeColorComponentValue] may be clamped.
     * Defaults to nil.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setEDRMetadata:")
    public native void setEDRMetadata(@Nullable CAEDRMetadata value);

    /**
     * If any rendering context on the screen has this enabled, all content will be
     * clamped to its NSScreen’s maximumExtendedDynamicRangeColorComponentValue
     * rather than 1.0. The default is NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setWantsExtendedDynamicRangeContent:")
    public native void setWantsExtendedDynamicRangeContent(boolean value);

    /**
     * If any rendering context on the screen has this enabled, all content will be
     * clamped to its NSScreen’s maximumExtendedDynamicRangeColorComponentValue
     * rather than 1.0. The default is NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("wantsExtendedDynamicRangeContent")
    public native boolean wantsExtendedDynamicRangeContent();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
