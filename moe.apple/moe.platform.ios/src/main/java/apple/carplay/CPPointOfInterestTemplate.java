package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPPointOfInterestTemplateDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.carplay.protocol.CPBarButtonProviding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPPointOfInterestTemplate extends CPTemplate implements CPBarButtonProviding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPPointOfInterestTemplate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPPointOfInterestTemplate alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPPointOfInterestTemplate allocWithZone(VoidPtr zone);

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
    @Selector("init")
    public native CPPointOfInterestTemplate init();

    @Generated
    @Selector("initWithCoder:")
    public native CPPointOfInterestTemplate initWithCoder(@NotNull NSCoder coder);

    /**
     * CPPointOfInterestTemplate displays a map view with selectable points of interest.
     * 
     * [@note] the maximum number of POIs is 12. If you provide more than 12, only the first 12 will be used.
     * 
     * @param title            Template title
     * @param pointsOfInterest Points of interest to be presented in the map.
     * @param selectedIndex    Index of selected point of interest instance referenced in the pointsOfInterest array.
     *                         Use NSNotFound to indicate no selection.
     */
    @Generated
    @Selector("initWithTitle:pointsOfInterest:selectedIndex:")
    public native CPPointOfInterestTemplate initWithTitlePointsOfInterestSelectedIndex(@NotNull String title,
            @NotNull NSArray<? extends CPPointOfInterest> pointsOfInterest, @NUInt long selectedIndex);

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
    public static native CPPointOfInterestTemplate new_objc();

    /**
     * The Point of Interest template's delegate is informed of user events.
     */
    @Nullable
    @Generated
    @Selector("pointOfInterestDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CPPointOfInterestTemplateDelegate pointOfInterestDelegate();

    @NotNull
    @Generated
    @Selector("pointsOfInterest")
    public native NSArray<? extends CPPointOfInterest> pointsOfInterest();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Designate an instance in the pointsOfInterest array to highlight. Use NSNotFound to indicate no selection.
     */
    @Generated
    @Selector("selectedIndex")
    @NUInt
    public native long selectedIndex();

    /**
     * The Point of Interest template's delegate is informed of user events.
     */
    @Generated
    @Selector("setPointOfInterestDelegate:")
    public native void setPointOfInterestDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) CPPointOfInterestTemplateDelegate value);

    /**
     * The Point of Interest template's delegate is informed of user events.
     */
    @Generated
    public void setPointOfInterestDelegate(
            @Nullable @Mapped(ObjCObjectMapper.class) CPPointOfInterestTemplateDelegate value) {
        Object __old = pointOfInterestDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setPointOfInterestDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Update the template with a list of points of interests to dispay
     * 
     * [@note] the maximum number of POIs is 12. If you provide more than 12, only the first 12 will be used.
     * 
     * @param pointsOfInterest Points of interest to be presented in the map.
     * @param selectedIndex    Index of selected point of interest instance referenced in the pointsOfInterest array.
     *                         Use NSNotFound to indicate no selection.
     */
    @Generated
    @Selector("setPointsOfInterest:selectedIndex:")
    public native void setPointsOfInterestSelectedIndex(@NotNull NSArray<? extends CPPointOfInterest> pointsOfInterest,
            @NUInt long selectedIndex);

    /**
     * Designate an instance in the pointsOfInterest array to highlight. Use NSNotFound to indicate no selection.
     */
    @Generated
    @Selector("setSelectedIndex:")
    public native void setSelectedIndex(@NUInt long value);

    /**
     * Template title appears on the template point of interest picker
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@NotNull String value);

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

    /**
     * Template title appears on the template point of interest picker
     */
    @NotNull
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Nullable
    @Generated
    @Selector("backButton")
    public native CPBarButton backButton();

    @NotNull
    @Generated
    @Selector("leadingNavigationBarButtons")
    public native NSArray<? extends CPBarButton> leadingNavigationBarButtons();

    @Generated
    @Selector("setBackButton:")
    public native void setBackButton(@Nullable CPBarButton value);

    @Generated
    @Selector("setLeadingNavigationBarButtons:")
    public native void setLeadingNavigationBarButtons(@NotNull NSArray<? extends CPBarButton> value);

    @Generated
    @Selector("setTrailingNavigationBarButtons:")
    public native void setTrailingNavigationBarButtons(@NotNull NSArray<? extends CPBarButton> value);

    @NotNull
    @Generated
    @Selector("trailingNavigationBarButtons")
    public native NSArray<? extends CPBarButton> trailingNavigationBarButtons();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
