package apple.cryptotokenkit;

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
 * Holds configuration of one class of tokens
 * 
 * API-Since: 14.0
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKTokenDriverConfiguration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TKTokenDriverConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Creates new configuration object for token with specified instanceID and adds it into tokenConfigurations
     * dictionary. If configuration with specified instanceID already exists, it is replaced with new empty
     * configuration.
     */
    @NotNull
    @Generated
    @Selector("addTokenConfigurationForTokenInstanceID:")
    public native TKTokenConfiguration addTokenConfigurationForTokenInstanceID(@NotNull String instanceID);

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKTokenDriverConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native TKTokenDriverConfiguration allocWithZone(VoidPtr zone);

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

    /**
     * ClassID of the token configuration. ClassID is taken from @p com.apple.ctk.class-id token extension attribute.
     */
    @NotNull
    @Generated
    @Selector("classID")
    public native String classID();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Contains dictionary of token class configurations keyed by TKTokenDriverClassID of token driver.
     * 
     * Hosting application of token extension will contain the list of configurations for hosted token extensions. All
     * other callers will get an empty array. This means that only token's hosting application can actually modify
     * token's configuration. Typically, hosting application will contain only one token extension, therefore this
     * dictionary will have one element.
     */
    @NotNull
    @Generated
    @Selector("driverConfigurations")
    public static native NSDictionary<String, ? extends TKTokenDriverConfiguration> driverConfigurations();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native TKTokenDriverConfiguration init();

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
    public static native TKTokenDriverConfiguration new_objc();

    /**
     * Removes configuration with specified tokenID. Does nothing if no such token configuration exists.
     */
    @Generated
    @Selector("removeTokenConfigurationForTokenInstanceID:")
    public native void removeTokenConfigurationForTokenInstanceID(@NotNull String instanceID);

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
     * Dictionary of all currently configured tokens for this token class, keyed by instanceID.
     */
    @NotNull
    @Generated
    @Selector("tokenConfigurations")
    public native NSDictionary<String, ? extends TKTokenConfiguration> tokenConfigurations();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
