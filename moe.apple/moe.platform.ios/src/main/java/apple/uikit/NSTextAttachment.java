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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSFileWrapper;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.protocol.NSTextAttachmentContainer;
import apple.uikit.protocol.NSTextAttachmentLayout;
import apple.uikit.protocol.NSTextLocation;
import apple.uikit.protocol.UIAccessibilityContentSizeCategoryImageAdjusting;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 7.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextAttachment extends NSObject implements NSTextAttachmentLayout, NSTextAttachmentContainer,
        NSSecureCoding, UIAccessibilityContentSizeCategoryImageAdjusting {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextAttachment(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextAttachment alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTextAttachment allocWithZone(VoidPtr zone);

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
    public static native NSTextAttachment new_objc();

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
    @Selector("attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    @ByValue
    public native CGRect attachmentBoundsForTextContainerProposedLineFragmentGlyphPositionCharacterIndex(
            @Nullable NSTextContainer textContainer, @ByValue CGRect lineFrag, @ByValue CGPoint position,
            @NUInt long charIndex);

    /**
     * Defines the layout bounds of the receiver's graphical representation in the text coordinate system. The origin is
     * at the glyph location on the text baseline. The default value is CGRectZero.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    /**
     * These two properties define the contents for the text attachment. Modifying these properties have a side effect
     * of invalidating -image and -fileWrapper properties. -fileType is an UTI describing the format for -contents.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("contents")
    public native NSData contents();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("fileType")
    public native String fileType();

    /**
     * Optionally, NSTextAttachment can be associated with a file wrapper. Modifying this property has a side effect of
     * invalidating -image, -contents, and fileType properties.
     */
    @Nullable
    @Generated
    @Selector("fileWrapper")
    public native NSFileWrapper fileWrapper();

    /**
     * Image representing the text attachment contents. Modifying this property invalidates -contents, -fileType, and
     * -FileWrapper properties.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    @Nullable
    @Generated
    @Selector("imageForBounds:textContainer:characterIndex:")
    public native UIImage imageForBoundsTextContainerCharacterIndex(@ByValue CGRect imageBounds,
            @Nullable NSTextContainer textContainer, @NUInt long charIndex);

    @Generated
    @Selector("init")
    public native NSTextAttachment init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTextAttachment initWithCoder(@NotNull NSCoder coder);

    /**
     * Designated initializer. Both arguments can be nil. When contentData==nil || uti==nil, the receiver is consider to
     * be an attachment without document contents. In this case, the NSAttributedString methods writing external file
     * format tries to save the return value of -[NSTextAttachment image] instead.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("initWithData:ofType:")
    public native NSTextAttachment initWithDataOfType(@Nullable NSData contentData, @Nullable String uti);

    /**
     * Defines the layout bounds of the receiver's graphical representation in the text coordinate system. The origin is
     * at the glyph location on the text baseline. The default value is CGRectZero.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setBounds:")
    public native void setBounds(@ByValue CGRect value);

    /**
     * These two properties define the contents for the text attachment. Modifying these properties have a side effect
     * of invalidating -image and -fileWrapper properties. -fileType is an UTI describing the format for -contents.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setContents:")
    public native void setContents(@Nullable NSData value);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setFileType:")
    public native void setFileType(@Nullable String value);

    /**
     * Optionally, NSTextAttachment can be associated with a file wrapper. Modifying this property has a side effect of
     * invalidating -image, -contents, and fileType properties.
     */
    @Generated
    @Selector("setFileWrapper:")
    public native void setFileWrapper(@Nullable NSFileWrapper value);

    /**
     * Image representing the text attachment contents. Modifying this property invalidates -contents, -fileType, and
     * -FileWrapper properties.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    @Generated
    @Selector("adjustsImageSizeForAccessibilityContentSizeCategory")
    public native boolean adjustsImageSizeForAccessibilityContentSizeCategory();

    @Generated
    @Selector("setAdjustsImageSizeForAccessibilityContentSizeCategory:")
    public native void setAdjustsImageSizeForAccessibilityContentSizeCategory(boolean value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("textAttachmentWithImage:")
    public static native NSTextAttachment textAttachmentWithImage(@NotNull UIImage image);

    /**
     * When YES, the text attachment tries to use a text attachment view returned by
     * -viewProviderForParentView:location:textContainer:. YES by default
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("allowsTextAttachmentView")
    public native boolean allowsTextAttachmentView();

    @Generated
    @Selector("attachmentBoundsForAttributes:location:textContainer:proposedLineFragment:position:")
    @ByValue
    public native CGRect attachmentBoundsForAttributesLocationTextContainerProposedLineFragmentPosition(
            @NotNull NSDictionary<String, ?> attributes,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location, @Nullable NSTextContainer textContainer,
            @ByValue CGRect proposedLineFragment, @ByValue CGPoint position);

    @Nullable
    @Generated
    @Selector("imageForBounds:attributes:location:textContainer:")
    public native UIImage imageForBoundsAttributesLocationTextContainer(@ByValue CGRect bounds,
            @NotNull NSDictionary<String, ?> attributes,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location, @Nullable NSTextContainer textContainer);

    /**
     * Layout padding before and after the text attachment bounds. The layout and rendering bounds X origin gets inset
     * by the padding value. This affects the relationship between the text attachment bounds. 0.0 by default
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("lineLayoutPadding")
    @NFloat
    public native double lineLayoutPadding();

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("registerTextAttachmentViewProviderClass:forFileType:")
    public static native void registerTextAttachmentViewProviderClassForFileType(
            @NotNull Class textAttachmentViewProviderClass, @NotNull String fileType);

    /**
     * When YES, the text attachment tries to use a text attachment view returned by
     * -viewProviderForParentView:location:textContainer:. YES by default
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAllowsTextAttachmentView:")
    public native void setAllowsTextAttachmentView(boolean value);

    /**
     * Layout padding before and after the text attachment bounds. The layout and rendering bounds X origin gets inset
     * by the padding value. This affects the relationship between the text attachment bounds. 0.0 by default
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setLineLayoutPadding:")
    public native void setLineLayoutPadding(@NFloat double value);

    /**
     * Factory methods for defining the mapping between UTI and text attachment view provider class
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("textAttachmentViewProviderClassForFileType:")
    public static native Class textAttachmentViewProviderClassForFileType(@NotNull String fileType);

    /**
     * Returns YES if the text attachment is configured to use text attachment views. By default, it checks
     * -allowsTextAttachmentView, +textAttachmentViewClassForFileType:, and its contents
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("usesTextAttachmentView")
    public native boolean usesTextAttachmentView();

    @Nullable
    @Generated
    @Selector("viewProviderForParentView:location:textContainer:")
    public native NSTextAttachmentViewProvider viewProviderForParentViewLocationTextContainer(
            @Nullable UIView parentView, @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location,
            @Nullable NSTextContainer textContainer);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
