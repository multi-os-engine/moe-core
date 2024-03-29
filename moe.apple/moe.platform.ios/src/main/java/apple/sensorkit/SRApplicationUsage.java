package apple.sensorkit;

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
 * API-Since: 14.0
 */
@Generated
@Library("SensorKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SRApplicationUsage extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SRApplicationUsage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SRApplicationUsage alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SRApplicationUsage allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The bundle identifier of the app in use. Only populated for Apple apps.
     */
    @Nullable
    @Generated
    @Selector("bundleIdentifier")
    public native String bundleIdentifier();

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
    public native SRApplicationUsage init();

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
    public static native SRApplicationUsage new_objc();

    /**
     * [@property] reportApplicationIdentifier
     * 
     * An application identifier that is valid for the duration of the report.
     * 
     * This is useful for identifying distinct application uses within the same
     * report duration without revealing the actual application identifier.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reportApplicationIdentifier")
    public native String reportApplicationIdentifier();

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
     * [@property] textInputSessions
     * 
     * The text input session types that occurred during this application usage
     * 
     * The list of text input sessions describes the order and type of text input that may
     * have occured during an application usage. Multiple sessions of the same text input
     * type will appear as separate array entries. If no text input occurred, this array
     * will be empty.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("textInputSessions")
    public native NSArray<? extends SRTextInputSession> textInputSessions();

    /**
     * The amount of time the app is used
     */
    @Generated
    @Selector("usageTime")
    public native double usageTime();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] supplementalCategories
     * 
     * Additional categories that describe this app
     * 
     * API-Since: 16.4
     */
    @NotNull
    @Generated
    @Selector("supplementalCategories")
    public native NSArray<? extends SRSupplementalCategory> supplementalCategories();

    /**
     * [@property] relativeStartTime
     * 
     * App start time relative to the first app start time in the report interval
     * 
     * relativeStartTime value for the very first app in the report interval is equal to 0, N seconds for the seccond
     * app and so on.
     * This will allow to order app uses and determine the time between app uses.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("relativeStartTime")
    public native double relativeStartTime();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
