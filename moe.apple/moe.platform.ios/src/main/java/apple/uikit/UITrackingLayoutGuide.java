package apple.uikit;

import apple.NSObject;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITrackingLayoutGuide extends UILayoutGuide {
    static {
        NatJ.register();
    }

    @Generated
    protected UITrackingLayoutGuide(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITrackingLayoutGuide alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITrackingLayoutGuide allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("constraintsActiveWhenAwayFromEdge:")
    public native NSArray<? extends NSLayoutConstraint> constraintsActiveWhenAwayFromEdge(@NUInt long edge);

    @Generated
    @Selector("constraintsActiveWhenNearEdge:")
    public native NSArray<? extends NSLayoutConstraint> constraintsActiveWhenNearEdge(@NUInt long edge);

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
    public native UITrackingLayoutGuide init();

    @Generated
    @Selector("initWithCoder:")
    public native UITrackingLayoutGuide initWithCoder(NSCoder coder);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UITrackingLayoutGuide new_objc();

    /**
     * Manually remove all constraints from this guide's tracking.
     */
    @Generated
    @Selector("removeAllTrackedConstraints")
    public native void removeAllTrackedConstraints();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @param trackingConstraints Constraints to deactivate when the guide is close to the specified edge, and activate when it moves away. Sending nil will remove the constraints associated with this edge from tracking.
     * @param edge                When the tracking layout guide is close to this edge, specified constraints will change
     */
    @Generated
    @Selector("setConstraints:activeWhenAwayFromEdge:")
    public native void setConstraintsActiveWhenAwayFromEdge(NSArray<? extends NSLayoutConstraint> trackingConstraints,
            @NUInt long edge);

    /**
     * @param trackingConstraints Constraints to activate when the guide is close to the specified edge, and deactivate when it moves away. Sending nil will deactivate any currently active constraints associated with this edge and remove them from tracking.
     * @param edge                When the tracking layout guide is close to this edge, specified constraints will change
     */
    @Generated
    @Selector("setConstraints:activeWhenNearEdge:")
    public native void setConstraintsActiveWhenNearEdge(NSArray<? extends NSLayoutConstraint> trackingConstraints,
            @NUInt long edge);

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
}