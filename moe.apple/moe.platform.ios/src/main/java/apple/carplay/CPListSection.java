package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPListTemplateItem;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@c] CPListSection models a single section of items appearing in a @c CPListTemplate.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPListSection extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPListSection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPListSection alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPListSection allocWithZone(VoidPtr zone);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Optional string to use for a simple header in this section.
     */
    @Nullable
    @Generated
    @Selector("header")
    public native String header();

    @Generated
    @Selector("init")
    public native CPListSection init();

    @Generated
    @Selector("initWithCoder:")
    public native CPListSection initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithItems:")
    public native CPListSection initWithItems(@NotNull NSArray<?> items);

    @Generated
    @Selector("initWithItems:header:sectionIndexTitle:")
    public native CPListSection initWithItemsHeaderSectionIndexTitle(@NotNull NSArray<?> items, @Nullable String header,
            @Nullable String sectionIndexTitle);

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
     * Items appearing in this section.
     */
    @NotNull
    @Generated
    @Selector("items")
    public native NSArray<?> items();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CPListSection new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An optional section index title to use in a table displaying this section.
     * The system will enforce a maximum length of 1 for each section index title - in other words,
     * you must choose single-character section index titles.
     */
    @Nullable
    @Generated
    @Selector("sectionIndexTitle")
    public native String sectionIndexTitle();

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
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Search for an item in this section, returning its index
     * or @c NSNotFound if not found.
     */
    @Generated
    @Selector("indexOfItem:")
    @NUInt
    public native long indexOfItem(@NotNull @Mapped(ObjCObjectMapper.class) CPListTemplateItem item);

    /**
     * Convenience access to the item in this section at the specified index.
     */
    @NotNull
    @Generated
    @Selector("itemAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CPListTemplateItem itemAtIndex(@NUInt long index);

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("headerButton")
    public native CPButton headerButton();

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("headerImage")
    public native UIImage headerImage();

    /**
     * Optional section header elements used by the enhanced header in this section.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("headerSubtitle")
    public native String headerSubtitle();

    /**
     * Create a section with a list of items and an optional header containing labels, an image, and a button.
     * 
     * [@note] The maximum size of the section header image is given by CPMaximumListSectionImageSize.
     * 
     * When providing an image, your app may provide a @c UIImage that is display-ready. If necessary for the image,
     * provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * 
     * UIImageAsset is used to combine multiple UIImages with different trait collections into a single UIImage.
     * 
     * To properly size your header image, your app should consider the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("initWithItems:header:headerSubtitle:headerImage:headerButton:sectionIndexTitle:")
    public native CPListSection initWithItemsHeaderHeaderSubtitleHeaderImageHeaderButtonSectionIndexTitle(
            @NotNull NSArray<?> items, @NotNull String header, @Nullable String headerSubtitle,
            @Nullable UIImage headerImage, @Nullable CPButton headerButton, @Nullable String sectionIndexTitle);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setHeaderImage:")
    public native void setHeaderImage(@Nullable UIImage value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
