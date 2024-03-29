package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.usernotifications.protocol.UNNotificationContentProviding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INStartCallIntent extends INIntent implements UNNotificationContentProviding {
    static {
        NatJ.register();
    }

    @Generated
    protected INStartCallIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INStartCallIntent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INStartCallIntent allocWithZone(VoidPtr zone);

    @Generated
    @Selector("audioRoute")
    @NInt
    public native long audioRoute();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("callCapability")
    @NInt
    public native long callCapability();

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

    @Nullable
    @Generated
    @Selector("contacts")
    public native NSArray<? extends INPerson> contacts();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("destinationType")
    @NInt
    public native long destinationType();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INStartCallIntent init();

    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("initWithAudioRoute:destinationType:contacts:recordTypeForRedialing:callCapability:")
    public native INStartCallIntent initWithAudioRouteDestinationTypeContactsRecordTypeForRedialingCallCapability(
            @NInt long audioRoute, @NInt long destinationType, @Nullable NSArray<? extends INPerson> contacts,
            @NInt long recordTypeForRedialing, @NInt long callCapability);

    @Generated
    @Selector("initWithCoder:")
    public native INStartCallIntent initWithCoder(@NotNull NSCoder coder);

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
    public static native INStartCallIntent new_objc();

    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("recordTypeForRedialing")
    @NInt
    public native long recordTypeForRedialing();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("callRecordFilter")
    public native INCallRecordFilter callRecordFilter();

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("callRecordToCallBack")
    public native INCallRecord callRecordToCallBack();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithCallRecordFilter:callRecordToCallBack:audioRoute:destinationType:contacts:callCapability:")
    public native INStartCallIntent initWithCallRecordFilterCallRecordToCallBackAudioRouteDestinationTypeContactsCallCapability(
            @Nullable INCallRecordFilter callRecordFilter, @Nullable INCallRecord callRecordToCallBack,
            @NInt long audioRoute, @NInt long destinationType, @Nullable NSArray<? extends INPerson> contacts,
            @NInt long callCapability);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
