package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEDNSProxyProviderProtocol
 * 
 * The NEDNSProxyProviderProtocol class declares the programmatic interface for an object that contains
 * NEDNSProxyProvider-specific configuration settings.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEDNSProxyProviderProtocol extends NEVPNProtocol {
    static {
        NatJ.register();
    }

    @Generated
    protected NEDNSProxyProviderProtocol(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEDNSProxyProviderProtocol alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEDNSProxyProviderProtocol allocWithZone(VoidPtr zone);

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
    public native NEDNSProxyProviderProtocol init();

    @Generated
    @Selector("initWithCoder:")
    public native NEDNSProxyProviderProtocol initWithCoder(@NotNull NSCoder coder);

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
    public static native NEDNSProxyProviderProtocol new_objc();

    /**
     * [@property] providerBundleIdentifier
     * 
     * A string containing the bundle identifier of the NEDNSProxyProvider to be used by this configuration.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("providerBundleIdentifier")
    public native String providerBundleIdentifier();

    /**
     * [@property] providerConfiguration
     * 
     * A dictionary containing NEDNSProxyProvider vendor-specific configuration parameters. This dictionary is passed
     * as-is to NEDNSProxyProviders when a DNS proxy is started.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("providerConfiguration")
    public native NSDictionary<String, ?> providerConfiguration();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] providerBundleIdentifier
     * 
     * A string containing the bundle identifier of the NEDNSProxyProvider to be used by this configuration.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setProviderBundleIdentifier:")
    public native void setProviderBundleIdentifier(@Nullable String value);

    /**
     * [@property] providerConfiguration
     * 
     * A dictionary containing NEDNSProxyProvider vendor-specific configuration parameters. This dictionary is passed
     * as-is to NEDNSProxyProviders when a DNS proxy is started.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setProviderConfiguration:")
    public native void setProviderConfiguration(@Nullable NSDictionary<String, ?> value);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
