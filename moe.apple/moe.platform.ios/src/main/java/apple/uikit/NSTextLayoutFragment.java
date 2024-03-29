package apple.uikit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperationQueue;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.protocol.NSTextLocation;
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
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextLayoutFragment extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextLayoutFragment(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextLayoutFragment alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTextLayoutFragment allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The amount of space reserved during paragraph layout between the bottom of the last line in the paragraph and the
     * bottom of the text layout fragment.
     */
    @Generated
    @Selector("bottomMargin")
    @NFloat
    public native double bottomMargin();

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

    /**
     * Renders the visual representation of this element in the specified graphics context.
     */
    @Generated
    @Selector("drawAtPoint:inContext:")
    public native void drawAtPointInContext(@ByValue CGPoint point, @NotNull CGContextRef context);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * Returns the frame in the text layout fragment coordinate system for the attachment at location. It returns
     * CGRectZero if location is not with any attachment or the state is not NSTextLayoutFragmentStateLayoutAvailable.
     */
    @Generated
    @Selector("frameForTextAttachmentAtLocation:")
    @ByValue
    public native CGRect frameForTextAttachmentAtLocation(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSTextLayoutFragment init();

    @Generated
    @Selector("initWithCoder:")
    public native NSTextLayoutFragment initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithTextElement:range:")
    public native NSTextLayoutFragment initWithTextElementRange(@NotNull NSTextElement textElement,
            @Nullable NSTextRange rangeInElement);

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

    /**
     * Invalidates any layout information associated with the receiver
     */
    @Generated
    @Selector("invalidateLayout")
    public native void invalidateLayout();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The rect for tiling the layout fragment inside the target layout coordinate system typically in an
     * NSTextContainer.
     */
    @Generated
    @Selector("layoutFragmentFrame")
    @ByValue
    public native CGRect layoutFragmentFrame();

    /**
     * When non-nil, the layout operation is dispatched to the queue asynchronously.
     */
    @Nullable
    @Generated
    @Selector("layoutQueue")
    public native NSOperationQueue layoutQueue();

    /**
     * The amount of margin space reserved during paragraph layout between the leading edge of the text layout fragment
     * (according to the primary writing direction of the paragraph) and the start of the lines in the paragraph.
     */
    @Generated
    @Selector("leadingPadding")
    @NFloat
    public native double leadingPadding();

    @Generated
    @Owned
    @Selector("new")
    public static native NSTextLayoutFragment new_objc();

    /**
     * range inside textElement relative to the document origin
     */
    @NotNull
    @Generated
    @Selector("rangeInElement")
    public native NSTextRange rangeInElement();

    /**
     * The bounds defining the area required for rendering the contents. The coordinate system is relative to the
     * layoutFragmentFrame. The coordinate system is vertically flipped, meaning origin ({0,0} is at the upper-left
     * corner). The size should be larger than layoutFragmentFrame.size. The origin could be in the negative coordinate
     * since the rendering could be stretched out of layoutFragmentFrame. Only valid when state >
     * NSTextLayoutFragmentStateEstimatedUsageBounds.
     */
    @Generated
    @Selector("renderingSurfaceBounds")
    @ByValue
    public native CGRect renderingSurfaceBounds();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * When non-nil, the layout operation is dispatched to the queue asynchronously.
     */
    @Generated
    @Selector("setLayoutQueue:")
    public native void setLayoutQueue(@Nullable NSOperationQueue value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The layout information state. KVO-compliant
     */
    @Generated
    @Selector("state")
    @NUInt
    public native long state();

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

    /**
     * Returns NSTextAttachmentViewProvider associated with the receiver. The property contents are only valid with
     * NSTextLayoutFragmentStateLayoutAvailable.
     */
    @NotNull
    @Generated
    @Selector("textAttachmentViewProviders")
    public native NSArray<? extends NSTextAttachmentViewProvider> textAttachmentViewProviders();

    /**
     * The parent text element
     */
    @Nullable
    @Generated
    @Selector("textElement")
    public native NSTextElement textElement();

    @Nullable
    @Generated
    @Selector("textLayoutManager")
    public native NSTextLayoutManager textLayoutManager();

    /**
     * An array of NSTextLineFragments. Valid when NSTextLayoutFragmentStateLayoutAvailable. KVO-compliant
     */
    @NotNull
    @Generated
    @Selector("textLineFragments")
    public native NSArray<? extends NSTextLineFragment> textLineFragments();

    /**
     * The amount of space reserved during paragraph layout between the top of the text layout fragment and the top of
     * the first line in the paragraph.
     */
    @Generated
    @Selector("topMargin")
    @NFloat
    public native double topMargin();

    /**
     * The amount of margin space reserved during paragraph layout between the end of the lines in the paragraph and the
     * trailing edge of the text layout fragment (according to the primary writing direction of the paragraph).
     */
    @Generated
    @Selector("trailingPadding")
    @NFloat
    public native double trailingPadding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns the NSTextLineFragment containing textLocation. When isUpstreamAffinity=YES, it returns the text line
     * fragment ending at textLocation.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("textLineFragmentForTextLocation:isUpstreamAffinity:")
    @Nullable
    public native NSTextLineFragment textLineFragmentForTextLocationIsUpstreamAffinity(
            @Mapped(ObjCObjectMapper.class) @NotNull NSTextLocation textLocation, boolean isUpstreamAffinity);

    /**
     * Returns the NSTextLineFragment containing verticalOffset if found. When requiresExactMatch=NO, it returns the
     * closest line fragment beyond verticalOffset if no line fragment contains verticalOffset.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("textLineFragmentForVerticalOffset:requiresExactMatch:")
    @Nullable
    public native NSTextLineFragment textLineFragmentForVerticalOffsetRequiresExactMatch(@NFloat double verticalOffset,
            boolean requiresExactMatch);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
