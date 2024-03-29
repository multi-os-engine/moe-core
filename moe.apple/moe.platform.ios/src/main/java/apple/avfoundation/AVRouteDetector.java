package apple.avfoundation;

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
 * AVRouteDetector
 * 
 * AVRouteDetector detects the presence of media playback routes.
 * 
 * If route detection is enabled (it is disabled by default), AVRouteDetector reports whether or not multiple playback
 * routes have been detected. If this is the case, AVKit's AVRoutePickerView can be used to allow users to pick from the
 * set of available routes.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVRouteDetector extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVRouteDetector(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVRouteDetector alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVRouteDetector allocWithZone(VoidPtr zone);

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
    public native AVRouteDetector init();

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
     * [@property] routeDetectionEnabled
     * 
     * Whether or not route detection is enabled. The default value is NO.
     * 
     * Route detection significantly increases power consumption and must be turned off when it's no longer needed.
     */
    @Generated
    @Selector("isRouteDetectionEnabled")
    public native boolean isRouteDetectionEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] multipleRoutesDetected
     * 
     * This property is YES if, in addition to the local playback route, at least one more playback route has been
     * detected.
     * 
     * If multiple route have been detected, AVKit's AVRoutePickerView can be used to allow users to pick from the set
     * of available routes. When the values of this property changes
     * AVRouteDetectorMultipleRoutesDetectedDidChangeNotification is posted.
     */
    @Generated
    @Selector("multipleRoutesDetected")
    public native boolean multipleRoutesDetected();

    @Generated
    @Owned
    @Selector("new")
    public static native AVRouteDetector new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] routeDetectionEnabled
     * 
     * Whether or not route detection is enabled. The default value is NO.
     * 
     * Route detection significantly increases power consumption and must be turned off when it's no longer needed.
     */
    @Generated
    @Selector("setRouteDetectionEnabled:")
    public native void setRouteDetectionEnabled(boolean value);

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
     * [@property] detectsCustomRoutes
     * 
     * Whether or not route detection will include custom routes. The default value is NO.
     * 
     * Only set this to YES if also using AVCustomRoutingController.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("detectsCustomRoutes")
    public native boolean detectsCustomRoutes();

    /**
     * [@property] detectsCustomRoutes
     * 
     * Whether or not route detection will include custom routes. The default value is NO.
     * 
     * Only set this to YES if also using AVCustomRoutingController.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDetectsCustomRoutes:")
    public native void setDetectsCustomRoutes(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
