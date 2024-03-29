package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
 * AVContentKeyResponse
 * 
 * AVContentKeyResponse is used to represent the data returned from the key server when requesting a key for decrypting
 * content.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 10.3
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVContentKeyResponse extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVContentKeyResponse(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVContentKeyResponse alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVContentKeyResponse allocWithZone(VoidPtr zone);

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
     * contentKeyResponseWithClearKeyData:initializationVector:
     * 
     * Create an AVContentKeyResponse from the key and IV when using AVContentKeySystemClearKey as the key system
     * 
     * The object created by this method is typically used with an AVContentKeyRequest created by an AVContentKeySession
     * using keySystem AVContentKeySystemClearKey. It is passed to AVContentKeyRequest -processContentKeyResponse: in
     * order to supply the decryptor with key data.
     * 
     * API-Since: 11.0
     * 
     * @param keyData
     *                             The key used for decrypting content.
     * @param initializationVector
     *                             The initialization vector used for decrypting content, or nil if initialization
     *                             vector is available in the media to be decrypted
     * @return A new AVContentKeyResponse holding Clear Key data.
     */
    @Generated
    @Selector("contentKeyResponseWithClearKeyData:initializationVector:")
    public static native AVContentKeyResponse contentKeyResponseWithClearKeyDataInitializationVector(
            @NotNull NSData keyData, @Nullable NSData initializationVector);

    /**
     * contentKeyResponseWithFairPlayStreamingKeyResponseData:
     * 
     * Create an AVContentKeyResponse from the server response to a key request made when using FairPlayStreaming (FPS)
     * as the method of key delivery.
     * 
     * The object created by this method is typically used with an AVContentKeyRequest created by an AVContentKeySession
     * using keySystem AVContentKeySystemFairPlayStreaming. It is passed to AVContentKeyRequest
     * -processContentKeyResponse: in order to supply the decryptor with key data
     * 
     * @param keyResponseData
     *                        The response from the FairPlayStreaming key server
     * @return A new AVContentKeyResponse holding data from a FairPlayStreaming key server that is used to decrypt the
     *         content
     */
    @Generated
    @Selector("contentKeyResponseWithFairPlayStreamingKeyResponseData:")
    public static native AVContentKeyResponse contentKeyResponseWithFairPlayStreamingKeyResponseData(
            @NotNull NSData keyResponseData);

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
    public native AVContentKeyResponse init();

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
    public static native AVContentKeyResponse new_objc();

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
     * contentKeyResponseWithAuthorizationTokenData:
     * 
     * Create an AVContentKeyResponse from authorization token data when using AVContentKeySystemAuthorizationToken key
     * system.
     * 
     * The object created by this method is typically used with an AVContentKeyRequest created by an AVContentKeySession
     * using keySystem AVContentKeySystemAuthorizationToken. It is passed to AVContentKeyRequest
     * -processContentKeyResponse: in order to supply the authorization token data.
     * 
     * API-Since: 13.0
     * 
     * @param authorizationTokenData
     *                               Data blob containing the authorization token.
     * @return A new AVContentKeyResponse holding the authorization token data.
     */
    @Generated
    @Selector("contentKeyResponseWithAuthorizationTokenData:")
    public static native AVContentKeyResponse contentKeyResponseWithAuthorizationTokenData(
            @NotNull NSData authorizationTokenData);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
