package apple.corenfc;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NFCVASCommandConfiguration
 * 
 * Configuration for one GET VAS DATA command.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NFCVASCommandConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NFCVASCommandConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NFCVASCommandConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NFCVASCommandConfiguration allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    public native NFCVASCommandConfiguration init();

    /**
     * initWithVASMode:passTypeIdentifier:url:
     * 
     * @param mode               VAS operation mode
     * @param passTypeIdentifier Pass type identifier of the Wallet pass.
     * @param url                URL for VAR URL Only mode. Set to <i>nil</i> for VAS normal mode.
     */
    @Generated
    @Selector("initWithVASMode:passTypeIdentifier:url:")
    public native NFCVASCommandConfiguration initWithVASModePassTypeIdentifierUrl(@NInt long mode,
            @NotNull String passTypeIdentifier, @Nullable NSURL url);

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

    /**
     * [@property] mode
     * 
     * VAS protocol mode.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("mode")
    @NInt
    public native long mode();

    @Generated
    @Owned
    @Selector("new")
    public static native NFCVASCommandConfiguration new_objc();

    /**
     * [@property] passTypeIdentifier
     * 
     * Wallet Pass Type Identifier of the Wallet Pass. The string value will be used to calculate the
     * Merchant ID value for the GET VAS DATA command.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("passTypeIdentifier")
    public native String passTypeIdentifier();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] mode
     * 
     * VAS protocol mode.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setMode:")
    public native void setMode(@NInt long value);

    /**
     * [@property] passTypeIdentifier
     * 
     * Wallet Pass Type Identifier of the Wallet Pass. The string value will be used to calculate the
     * Merchant ID value for the GET VAS DATA command.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPassTypeIdentifier:")
    public native void setPassTypeIdentifier(@NotNull String value);

    /**
     * [@property] url
     * 
     * Merchant URL object. Maximum length of the URL is 64 characters, including the schema.
     * Set to nil to disable the merchant URL.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setUrl:")
    public native void setUrl(@Nullable NSURL value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] url
     * 
     * Merchant URL object. Maximum length of the URL is 64 characters, including the schema.
     * Set to nil to disable the merchant URL.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("url")
    public native NSURL url();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
