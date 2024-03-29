package apple.sensorkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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
 * API-Since: 14.0
 */
@Generated
@Library("SensorKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SRDeviceUsageReport extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SRDeviceUsageReport(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SRDeviceUsageReport alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SRDeviceUsageReport allocWithZone(VoidPtr zone);

    /**
     * Usage time of applications per category
     * 
     * category is the primary genre from the app's iTunesMetadata.plist.
     */
    @NotNull
    @Generated
    @Selector("applicationUsageByCategory")
    public native NSDictionary<String, ? extends NSArray<? extends SRApplicationUsage>> applicationUsageByCategory();

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

    /**
     * The duration of this report
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SRDeviceUsageReport init();

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
    public static native SRDeviceUsageReport new_objc();

    /**
     * Usage time of notifications per category
     * 
     * category is the primary genre from the notifying app's iTunesMetadata.plist.
     */
    @NotNull
    @Generated
    @Selector("notificationUsageByCategory")
    public native NSDictionary<String, ? extends NSArray<? extends SRNotificationUsage>> notificationUsageByCategory();

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

    /**
     * Total number of screen wakes over this duration
     */
    @Generated
    @Selector("totalScreenWakes")
    @NInt
    public native long totalScreenWakes();

    /**
     * Total amount of time the device was unlocked over this duration
     */
    @Generated
    @Selector("totalUnlockDuration")
    public native double totalUnlockDuration();

    /**
     * Total number of unlocks over this duration
     */
    @Generated
    @Selector("totalUnlocks")
    @NInt
    public native long totalUnlocks();

    /**
     * Usage time of web domains per category
     * 
     * category based on the primary Screen Time category of the web domain
     */
    @NotNull
    @Generated
    @Selector("webUsageByCategory")
    public native NSDictionary<String, ? extends NSArray<? extends SRWebUsage>> webUsageByCategory();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Version of the algorithm used to produce the report
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("version")
    @NotNull
    public native String version();
}
