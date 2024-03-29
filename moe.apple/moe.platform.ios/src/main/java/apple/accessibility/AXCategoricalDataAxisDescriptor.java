package apple.accessibility;

import apple.NSObject;
import apple.accessibility.protocol.AXDataAxisDescriptor;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 15.0
 */
@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AXCategoricalDataAxisDescriptor extends NSObject implements AXDataAxisDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected AXCategoricalDataAxisDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AXCategoricalDataAxisDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AXCategoricalDataAxisDescriptor allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("attributedTitle")
    public native NSAttributedString attributedTitle();

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

    /**
     * The order of the category values for this axis.
     * This list should contain every possible category value for this axis, in the order they are displayed visually in
     * the graph or legend.
     * For example, if your categorical axis represented 'blood type', and the legend contained 'AB, A, B, O' in that
     * order,
     * you would provide an array containing "AB", "A", "B" and "O" in the same order.
     */
    @NotNull
    @Generated
    @Selector("categoryOrder")
    public native NSArray<String> categoryOrder();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    @Selector("init")
    public native AXCategoricalDataAxisDescriptor init();

    @Generated
    @Selector("initWithAttributedTitle:categoryOrder:")
    public native AXCategoricalDataAxisDescriptor initWithAttributedTitleCategoryOrder(
            @NotNull NSAttributedString attributedTitle, @NotNull NSArray<String> categoryOrder);

    @Generated
    @Selector("initWithTitle:categoryOrder:")
    public native AXCategoricalDataAxisDescriptor initWithTitleCategoryOrder(@NotNull String title,
            @NotNull NSArray<String> categoryOrder);

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
    public static native AXCategoricalDataAxisDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAttributedTitle:")
    public native void setAttributedTitle(@NotNull NSAttributedString value);

    /**
     * The order of the category values for this axis.
     * This list should contain every possible category value for this axis, in the order they are displayed visually in
     * the graph or legend.
     * For example, if your categorical axis represented 'blood type', and the legend contained 'AB, A, B, O' in that
     * order,
     * you would provide an array containing "AB", "A", "B" and "O" in the same order.
     */
    @Generated
    @Selector("setCategoryOrder:")
    public native void setCategoryOrder(@NotNull NSArray<String> value);

    @Generated
    @Selector("setTitle:")
    public native void setTitle(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @NotNull
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
