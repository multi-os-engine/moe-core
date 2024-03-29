package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.NSTextLocation;
import apple.uikit.protocol.NSTextViewportLayoutControllerDelegate;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
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
public class NSTextViewportLayoutController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextViewportLayoutController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Adjusts the viewport rect by the specified offset if needed.
     * This is used to artificially move the viewport without affecting viewport content, can be both positive/negative
     * offset.
     */
    @Generated
    @Selector("adjustViewportByVerticalOffset:")
    public native void adjustViewportByVerticalOffset(@NFloat double verticalOffset);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextViewportLayoutController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTextViewportLayoutController allocWithZone(VoidPtr zone);

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

    /**
     * The viewport layout delegate.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextViewportLayoutControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSTextViewportLayoutController init();

    @Generated
    @Selector("initWithTextLayoutManager:")
    public native NSTextViewportLayoutController initWithTextLayoutManager(
            @NotNull NSTextLayoutManager textLayoutManager);

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

    /**
     * Performs layout in the viewport.
     */
    @Generated
    @Selector("layoutViewport")
    public native void layoutViewport();

    @Generated
    @Owned
    @Selector("new")
    public static native NSTextViewportLayoutController new_objc();

    /**
     * Relocates the viewport to start with the specified *location*.
     * This is used to programmatically scroll to the specified *location*.
     * Returns the suggested viewport anchor point.
     */
    @Generated
    @Selector("relocateViewportToTextLocation:")
    @NFloat
    public native double relocateViewportToTextLocation(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation textLocation);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The viewport layout delegate.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) NSTextViewportLayoutControllerDelegate value);

    /**
     * The viewport layout delegate.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) NSTextViewportLayoutControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The provider of viewport text layout fragments.
     */
    @Nullable
    @Generated
    @Selector("textLayoutManager")
    public native NSTextLayoutManager textLayoutManager();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The viewport of the current layout.
     * Not KVO-compliant.
     */
    @Generated
    @Selector("viewportBounds")
    @ByValue
    public native CGRect viewportBounds();

    /**
     * The text range of the current viewport layout.
     * Not KVO-compliant.
     */
    @Nullable
    @Generated
    @Selector("viewportRange")
    public native NSTextRange viewportRange();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
