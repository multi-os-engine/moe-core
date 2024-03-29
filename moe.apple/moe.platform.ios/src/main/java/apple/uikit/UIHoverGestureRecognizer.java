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
import org.moe.natj.general.ann.NFloat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.corefoundation.struct.CGVector;
import org.moe.natj.general.ann.ByValue;

/**
 * UIHoverGestureRecognizer
 * On macOS or iPadOS, this gesture recognizer will begin recognition when the cursor
 * (while no mouse buttons are pressed) enters its view, changes during movement
 * within the view and ends when the cursor leaves said view.
 * Note: While buttons are pressed any currently active hover gesture recognizers
 * are effectively paused (letting other gesture recognizers work) until all
 * mouse buttons have been released.
 * 
 * On iOS, this gesture recognizer doesn't recognize anything and is effectively
 * a no-op.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIHoverGestureRecognizer extends UIGestureRecognizer {
    static {
        NatJ.register();
    }

    @Generated
    protected UIHoverGestureRecognizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIHoverGestureRecognizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIHoverGestureRecognizer allocWithZone(VoidPtr zone);

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
    public native UIHoverGestureRecognizer init();

    @Generated
    @Selector("initWithCoder:")
    public native UIHoverGestureRecognizer initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithTarget:action:")
    public native UIHoverGestureRecognizer initWithTargetAction(@Nullable @Mapped(ObjCObjectMapper.class) Object target,
            @Nullable SEL action);

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
    public static native UIHoverGestureRecognizer new_objc();

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
     * The normalized distance from the screen of the hovering device. This value will be 1 at the maximum distance
     * from the screen and will approach 0 as the device gets closer to the screen. Will always return 0 for devices
     * that
     * don't support z offset.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("zOffset")
    @NFloat
    public native double zOffset();

    /**
     * The altitude angle of the current device. 0 is returned for devices that don't support altitude.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("altitudeAngle")
    @NFloat
    public native double altitudeAngle();

    /**
     * The azimuth angle of the current device in the specified view, or the gesture recognizer's window if nil. 0 is
     * returned for devices that don't support azimuth.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("azimuthAngleInView:")
    @NFloat
    public native double azimuthAngleInView(@Nullable UIView view);

    /**
     * The azimuth unit vector of the current device in the specified view, or the gesture recognizer's window if nil.
     * An empty vector is returned for devices that don't support azimuth.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("azimuthUnitVectorInView:")
    @ByValue
    public native CGVector azimuthUnitVectorInView(@Nullable UIView view);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
