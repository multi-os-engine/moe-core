package apple.corehaptics;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * CHHapticParameterCurve
 * 
 * A CHHapticParameterCurve is a set of CHHapticParameterCurveControlPoints which describe the control (inflection)
 * points
 * for the parameter values to be applied to the associated pattern.
 * 
 * The CHHapticParameterCurve generates an interpolated value output which passed through each control point at its
 * associated relative time. These times will all be relative to the start time of the CHHapticParameterCurve within the
 * playing pattern.
 */
@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHHapticParameterCurve extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CHHapticParameterCurve(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHHapticParameterCurve alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHHapticParameterCurve allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("controlPoints")
    public native NSArray<? extends CHHapticParameterCurveControlPoint> controlPoints();

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
    public native CHHapticParameterCurve init();

    /**
     * initWithParameterID:controlPoints:relativeTime
     * 
     * Initialize a CHHapticParameterCurve with a parameter ID, time, and an array of
     * CHHapticParameterCurveControlPoint.
     * 
     * @param parameterID
     *                      The CHHapticDynamicParameterID for the desired parameter.
     * @param controlPoints
     *                      An array of CHHapticParameterCurveControlPoints.
     * @param relativeTime
     *                      The time at which this parameter curve should start, relative to the start time of the
     *                      CHHapticPattern to which this
     *                      parameter curve belongs.
     */
    @Generated
    @Selector("initWithParameterID:controlPoints:relativeTime:")
    public native CHHapticParameterCurve initWithParameterIDControlPointsRelativeTime(@NotNull String parameterID,
            @NotNull NSArray<? extends CHHapticParameterCurveControlPoint> controlPoints, double relativeTime);

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
    public static native CHHapticParameterCurve new_objc();

    @NotNull
    @Generated
    @Selector("parameterID")
    public native String parameterID();

    @Generated
    @Selector("relativeTime")
    public native double relativeTime();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setRelativeTime:")
    public native void setRelativeTime(double value);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
