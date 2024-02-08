package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRDoorLockClusterGetUserResponseParams extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRDoorLockClusterGetUserResponseParams(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRDoorLockClusterGetUserResponseParams alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRDoorLockClusterGetUserResponseParams allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("creatorFabricIndex")
    @Nullable
    public native NSNumber creatorFabricIndex();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("credentialRule")
    @Nullable
    public native NSNumber credentialRule();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("credentials")
    @Nullable
    public native NSArray<?> credentials();

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
    public native MTRDoorLockClusterGetUserResponseParams init();

    /**
     * Initialize an MTRDoorLockClusterGetUserResponseParams with a response-value dictionary
     * of the sort that MTRDeviceResponseHandler would receive.
     * 
     * Will return nil and hand out an error if the response-value dictionary is not
     * a command data response or is not the right command response.
     * 
     * Will return nil and hand out an error if the data response does not match the known
     * schema for this command.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithResponseValue:error:")
    public native MTRDoorLockClusterGetUserResponseParams initWithResponseValueError(
            @NotNull NSDictionary<String, ?> responseValue,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("lastModifiedFabricIndex")
    @Nullable
    public native NSNumber lastModifiedFabricIndex();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRDoorLockClusterGetUserResponseParams new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("nextUserIndex")
    @Nullable
    public native NSNumber nextUserIndex();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setCreatorFabricIndex:")
    public native void setCreatorFabricIndex(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setCredentialRule:")
    public native void setCredentialRule(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setCredentials:")
    public native void setCredentials(@Nullable NSArray<?> value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setLastModifiedFabricIndex:")
    public native void setLastModifiedFabricIndex(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setNextUserIndex:")
    public native void setNextUserIndex(@Nullable NSNumber value);

    /**
     * Controls whether the command is a timed command (using Timed Invoke).
     * 
     * If nil (the default value), a regular invoke is done for commands that do
     * not require a timed invoke and a timed invoke with some default timed request
     * timeout is done for commands that require a timed invoke.
     * 
     * If not nil, a timed invoke is done, with the provided value used as the timed
     * request timeout. The value should be chosen small enough to provide the
     * desired security properties but large enough that it will allow a round-trip
     * from the sever to the client (for the status response and actual invoke
     * request) within the timeout window.
     * 
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Timed invoke does not make sense for server to client commands
     */
    @Generated
    @Deprecated
    @Selector("setTimedInvokeTimeoutMs:")
    public native void setTimedInvokeTimeoutMs(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setUserIndex:")
    public native void setUserIndex(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setUserName:")
    public native void setUserName(@Nullable String value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setUserStatus:")
    public native void setUserStatus(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setUserType:")
    public native void setUserType(@Nullable NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setUserUniqueID:")
    public native void setUserUniqueID(@Nullable NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use userUniqueID
     */
    @Generated
    @Deprecated
    @Selector("setUserUniqueId:")
    public native void setUserUniqueId(@Nullable NSNumber value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Controls whether the command is a timed command (using Timed Invoke).
     * 
     * If nil (the default value), a regular invoke is done for commands that do
     * not require a timed invoke and a timed invoke with some default timed request
     * timeout is done for commands that require a timed invoke.
     * 
     * If not nil, a timed invoke is done, with the provided value used as the timed
     * request timeout. The value should be chosen small enough to provide the
     * desired security properties but large enough that it will allow a round-trip
     * from the sever to the client (for the status response and actual invoke
     * request) within the timeout window.
     * 
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Timed invoke does not make sense for server to client commands
     */
    @Generated
    @Deprecated
    @Selector("timedInvokeTimeoutMs")
    @Nullable
    public native NSNumber timedInvokeTimeoutMs();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("userIndex")
    @NotNull
    public native NSNumber userIndex();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("userName")
    @Nullable
    public native String userName();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("userStatus")
    @Nullable
    public native NSNumber userStatus();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("userType")
    @Nullable
    public native NSNumber userType();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("userUniqueID")
    @Nullable
    public native NSNumber userUniqueID();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use userUniqueID
     */
    @Generated
    @Deprecated
    @Selector("userUniqueId")
    @Nullable
    public native NSNumber userUniqueId();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}