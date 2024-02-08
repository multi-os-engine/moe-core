package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.authenticationservices.protocol.ASCredentialIdentity;

/**
 * ASPasswordCredentialIdentity
 * An ASPasswordCredentialIdentity is used to describe an identity that can use a service upon successful password based
 * authentication.
 * Use this class to save entries into ASCredentialIdentityStore.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASPasswordCredentialIdentity extends NSObject implements NSCopying, NSSecureCoding, ASCredentialIdentity {
    static {
        NatJ.register();
    }

    @Generated
    protected ASPasswordCredentialIdentity(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASPasswordCredentialIdentity alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASPasswordCredentialIdentity allocWithZone(VoidPtr zone);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates and initializes an instance of ASPasswordCredentialIdentity.
     * 
     * @param serviceIdentifier the service identifier for which this credential identity is valid.
     * @param user              the user that can authenticate into the service indicated by the serviceIdentifier.
     * @param recordIdentifier  an optional string to uniquely identify this record in your local database.
     */
    @Generated
    @Selector("identityWithServiceIdentifier:user:recordIdentifier:")
    public static native ASPasswordCredentialIdentity identityWithServiceIdentifierUserRecordIdentifier(
            @NotNull ASCredentialServiceIdentifier serviceIdentifier, @NotNull String user,
            @Nullable String recordIdentifier);

    @Generated
    @Selector("init")
    public native ASPasswordCredentialIdentity init();

    @Generated
    @Selector("initWithCoder:")
    public native ASPasswordCredentialIdentity initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes an instance of ASPasswordCredentialIdentity.
     * 
     * @param serviceIdentifier the service identifier for which this credential identity is valid.
     * @param user              the user that can authenticate into the service indicated by the serviceIdentifier.
     * @param recordIdentifier  an optional string to uniquely identify this record in your local database.
     */
    @Generated
    @Selector("initWithServiceIdentifier:user:recordIdentifier:")
    public native ASPasswordCredentialIdentity initWithServiceIdentifierUserRecordIdentifier(
            @NotNull ASCredentialServiceIdentifier serviceIdentifier, @NotNull String user,
            @Nullable String recordIdentifier);

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
    public static native ASPasswordCredentialIdentity new_objc();

    /**
     * Get or set the rank of the credential identity object.
     * 
     * The system may utilize the rank to decide which credential identity precedes the other
     * if two identities have the same service identifier. A credential identity with a larger rank value
     * precedes one with a smaller value if both credential identities have the same service identifier.
     * The default value of this property is 0.
     */
    @Generated
    @Selector("rank")
    @NInt
    public native long rank();

    /**
     * Get the record identifier.
     * 
     * You can utilize the record identifier to uniquely identify the credential identity in your local database.
     * 
     * @return The record identifier.
     */
    @Nullable
    @Generated
    @Selector("recordIdentifier")
    public native String recordIdentifier();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Get the service identifier.
     * 
     * @return The service identifier for this credential identity.
     */
    @NotNull
    @Generated
    @Selector("serviceIdentifier")
    public native ASCredentialServiceIdentifier serviceIdentifier();

    /**
     * Get or set the rank of the credential identity object.
     * 
     * The system may utilize the rank to decide which credential identity precedes the other
     * if two identities have the same service identifier. A credential identity with a larger rank value
     * precedes one with a smaller value if both credential identities have the same service identifier.
     * The default value of this property is 0.
     */
    @Generated
    @Selector("setRank:")
    public native void setRank(@NInt long value);

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

    /**
     * Get the user.
     * 
     * @return The user string.
     */
    @NotNull
    @Generated
    @Selector("user")
    public native String user();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
