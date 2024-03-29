package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.3
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVContentKeyRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVContentKeyRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVContentKeyRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVContentKeyRequest allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] canProvidePersistableContentKey
     * 
     * When the value of this property is YES, you can use the method
     * -persistableContentKeyFromKeyVendorResponse:options:error: to create a persistable content key from the content
     * key response.
     * [@dicsussion] The value of this property will be YES only when the receiver is provided to your
     * AVContentKeySession delegate via the method -contentKeySession:didProvidePersistableContentKeyRequest:. If you
     * have an AVContentKeyRequest for which the value of canProvidePersistableContentKey is NO, but you wish to obtain
     * a persistable content key, send the AVContentKeyRequest the message
     * -respondByRequestingPersistableContentKeyRequest.
     */
    @Generated
    @Selector("canProvidePersistableContentKey")
    public native boolean canProvidePersistableContentKey();

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
     * [@property] error
     * 
     * If the receiver's status is AVContentKeyRequestStatusFailed, this describes the error that caused the failure.
     * 
     * The value of this property is an NSError that describes what caused the content key request to fail. If the
     * receiver's status is not AVContentKeyRequestStatusFailed, the value of this property is nil.
     */
    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] identifier
     * 
     * Container- and protocol-specific identifier for the content key.
     * 
     * In order to use a key with an HTTP Live Streaming AVURLAsset, the identifier must be an NSURL that matches a key
     * URI in the Media Playlist.
     */
    @Nullable
    @Generated
    @Selector("identifier")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object identifier();

    @Generated
    @Selector("init")
    public native AVContentKeyRequest init();

    /**
     * [@property] initializationData
     * 
     * Container- and protocol-specific data to be used to obtain a key response.
     */
    @Nullable
    @Generated
    @Selector("initializationData")
    public native NSData initializationData();

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
     * makeStreamingContentKeyRequestDataForApp:contentIdentifier:options:completionHandler:
     * 
     * Obtains a content key request data for a specific combination of application and content.
     * 
     * If option AVContentKeyRequestProtocolVersionsKey is not specified the default protocol version of 1 is assumed.
     * 
     * @param appIdentifier
     *                          An opaque identifier for the application. The value of this identifier depends on the
     *                          particular system used to provide the content key.
     * @param contentIdentifier
     *                          An optional opaque identifier for the content. The value of this identifier depends on
     *                          the particular system used to provide the content key.
     * @param options
     *                          Additional information necessary to obtain the key, or nil if none. See
     *                          AVContentKeyRequest*Key below.
     * @param handler
     *                          Once the streaming content key request is prepared, this block will be called with the
     *                          request data or an error describing the failure.
     */
    @Generated
    @Selector("makeStreamingContentKeyRequestDataForApp:contentIdentifier:options:completionHandler:")
    public native void makeStreamingContentKeyRequestDataForAppContentIdentifierOptionsCompletionHandler(
            @NotNull NSData appIdentifier, @Nullable NSData contentIdentifier,
            @Nullable NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_makeStreamingContentKeyRequestDataForAppContentIdentifierOptionsCompletionHandler") Block_makeStreamingContentKeyRequestDataForAppContentIdentifierOptionsCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_makeStreamingContentKeyRequestDataForAppContentIdentifierOptionsCompletionHandler {
        @Generated
        void call_makeStreamingContentKeyRequestDataForAppContentIdentifierOptionsCompletionHandler(
                @Nullable NSData contentKeyRequestData, @Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native AVContentKeyRequest new_objc();

    /**
     * processContentKeyResponse:
     * 
     * Informs the receiver to process the specified content key response.
     * 
     * After you receive an AVContentKeyRequest via -contentKeySession:didProvideContentKeyRequest: and after you invoke
     * -[AVContentKeyRequest makeStreamingContentKeyRequestDataForApp:contentIdentifier:options:completionHandler:] on
     * that request, you must obtain a response to the request in accordance with the protocol in use by the entity that
     * controls the use of the media data. This is the method you use to provide the content key response to make
     * protected content available for processing. If obtaining the content key response fails, use
     * -processContentKeyResponseError:.
     * 
     * @param keyResponse
     *                    An instance of AVContentKeyResponse carrying a response to a content key request.
     */
    @Generated
    @Selector("processContentKeyResponse:")
    public native void processContentKeyResponse(@NotNull AVContentKeyResponse keyResponse);

    /**
     * processContentKeyResponseError:
     * 
     * Informs the receiver that obtaining a content key response has failed, resulting in failure handling.
     * 
     * @param error
     *              An instance of NSError that describes the specific failure that occurred.
     */
    @Generated
    @Selector("processContentKeyResponseError:")
    public native void processContentKeyResponseError(@NotNull NSError error);

    /**
     * [@property] renewsExpiringResponseData
     * 
     * Indicates whether the receiver represents a request to renew previously provided response data that is expiring
     * or has expired.
     */
    @Generated
    @Selector("renewsExpiringResponseData")
    public native boolean renewsExpiringResponseData();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * respondByRequestingPersistableContentKeyRequest
     * 
     * Informs the receiver to process a persistable content key request.
     * 
     * When you receive an AVContentKeyRequest via -contentKeySession:didProvideContentKeyRequest: and you want the
     * resulting key response to produce a key that can persist across multiple playback sessions, you must invoke
     * -respondByRequestingPersistableContentKeyRequest on that AVContentKeyRequest in order to signal that you want to
     * process an AVPersistableContentKeyRequest instead. If the underlying protocol supports persistable content keys,
     * in response your delegate will receive an AVPersistableContentKeyRequest via
     * -contentKeySession:didProvidePersistableContentKeyRequest:. NSInternalInconsistencyException will be raised, if
     * you are attempting to create and use a persistable key but your AVContentKeySession delegate does not respond to
     * contentKeySession:didProvidePersistableContentKeyRequest:.
     * 
     * API-Since: 10.3
     * Deprecated-Since: 11.2
     */
    @Deprecated
    @Generated
    @Selector("respondByRequestingPersistableContentKeyRequest")
    public native void respondByRequestingPersistableContentKeyRequest();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] status
     * 
     * This describes the state of the AVContentKeyRequest, value is one of AVContentKeyRequestStatus.
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] options
     * 
     * Additional information specified while initiaing key loading using
     * -processContentKeyRequestWithIdentifier:initializationData:options:.
     * 
     * API-Since: 12.2
     */
    @NotNull
    @Generated
    @Selector("options")
    public native NSDictionary<String, ?> options();

    /**
     * respondByRequestingPersistableContentKeyRequestAndReturnError:
     * 
     * Informs the receiver to process a persistable content key request.
     * 
     * When you receive an AVContentKeyRequest via -contentKeySession:didProvideContentKeyRequest: and you want the
     * resulting key response to produce a key that can persist across multiple playback sessions, you must invoke
     * -respondByRequestingPersistableContentKeyRequest on that AVContentKeyRequest in order to signal that you want to
     * process an AVPersistableContentKeyRequest instead. If the underlying protocol supports persistable content keys,
     * in response your delegate will receive an AVPersistableContentKeyRequest via
     * -contentKeySession:didProvidePersistableContentKeyRequest:. NSInternalInconsistencyException will be raised, if
     * you are attempting to create and use a persistable key but your AVContentKeySession delegate does not respond to
     * contentKeySession:didProvidePersistableContentKeyRequest:.
     * 
     * API-Since: 11.2
     * 
     * @param outError
     *                 The error returned if a persistable content key request cannot be requested.
     * @return YES if sucessful. If NO, this request should be responded to via processContentKeyResponse: or
     *         processContentKeyResponseError:.
     */
    @Generated
    @Selector("respondByRequestingPersistableContentKeyRequestAndReturnError:")
    public native boolean respondByRequestingPersistableContentKeyRequestAndReturnError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] contentKey
     * 
     * Represents an AVContentKey that results from an invocation of -processContentKeyResponse:.
     * 
     * Before the receiver achieves the status AVContentKeyRequestReceivedResponse, the value of this property will be
     * nil. Once that status has been achieved, the value of this property becomes a non-nil AVContentKey that can be
     * provided to content key recipients that apply content keys manually to objects that require them, such as
     * CMSampleBuffers, or to initiate renewal. A non-nil value does not indicate that the content key is valid;
     * authorization failures may yet be possible.
     * 
     * API-Since: 14.5
     */
    @Nullable
    @Generated
    @Selector("contentKey")
    public native AVContentKey contentKey();

    /**
     * [@property] contentKeySpecifier
     * 
     * Specifies the requested content key.
     * 
     * API-Since: 14.5
     */
    @NotNull
    @Generated
    @Selector("contentKeySpecifier")
    public native AVContentKeySpecifier contentKeySpecifier();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
