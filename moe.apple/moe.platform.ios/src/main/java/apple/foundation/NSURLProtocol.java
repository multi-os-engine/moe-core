/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSURLProtocolClient;
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
 * NSURLProtocol
 * 
 * NSURLProtocol is an abstract class which provides the
 * basic structure for performing protocol-specific loading of URL
 * data. Concrete subclasses handle the specifics associated with one
 * or more protocols or URL schemes.
 * 
 * API-Since: 2.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLProtocol extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLProtocol(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLProtocol alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSURLProtocol allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * canInitWithRequest:
     * 
     * This method determines whether this protocol can handle
     * the given request.
     * 
     * A concrete subclass should inspect the given request and
     * determine whether or not the implementation can perform a load with
     * that request. This is an abstract method. Subclasses must provide an
     * implementation.
     * 
     * @param request A request to inspect.
     * @return YES if the protocol can handle the given request, NO if not.
     */
    @Generated
    @Selector("canInitWithRequest:")
    public static native boolean canInitWithRequest(@NotNull NSURLRequest request);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("canInitWithTask:")
    public static native boolean canInitWithTask(@NotNull NSURLSessionTask task);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * canonicalRequestForRequest:
     * 
     * This method returns a canonical version of the given
     * request.
     * 
     * It is up to each concrete protocol implementation to
     * define what "canonical" means. However, a protocol should
     * guarantee that the same input request always yields the same
     * canonical form. Special consideration should be given when
     * implementing this method since the canonical form of a request is
     * used to look up objects in the URL cache, a process which performs
     * equality checks between NSURLRequest objects.
     * <p>
     * This is an abstract method; subclasses must provide an
     * implementation.
     * 
     * @param request A request to make canonical.
     * @return The canonical form of the given request.
     */
    @NotNull
    @Generated
    @Selector("canonicalRequestForRequest:")
    public static native NSURLRequest canonicalRequestForRequest(@NotNull NSURLRequest request);

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
    public static native NSURLProtocol new_objc();

    /**
     * propertyForKey:inRequest:
     * 
     * Returns the property in the given request previously
     * stored with the given key.
     * 
     * The purpose of this method is to provide an interface
     * for protocol implementors to access protocol-specific information
     * associated with NSURLRequest objects.
     * 
     * @param key     The string to use for the property lookup.
     * @param request The request to use for the property lookup.
     * @return The property stored with the given key, or nil if no property
     *         had previously been stored with the given key in the given request.
     */
    @Nullable
    @Generated
    @Selector("propertyForKey:inRequest:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object propertyForKeyInRequest(@NotNull String key, @NotNull NSURLRequest request);

    /**
     * registerClass:
     * 
     * This method registers a protocol class, making it visible
     * to several other NSURLProtocol class methods.
     * 
     * When the URL loading system begins to load a request,
     * each protocol class that has been registered is consulted in turn to
     * see if it can be initialized with a given request. The first
     * protocol handler class to provide a YES answer to
     * <tt>+canInitWithRequest:</tt> "wins" and that protocol
     * implementation is used to perform the URL load. There is no
     * guarantee that all registered protocol classes will be consulted.
     * Hence, it should be noted that registering a class places it first
     * on the list of classes that will be consulted in calls to
     * <tt>+canInitWithRequest:</tt>, moving it in front of all classes
     * that had been registered previously.
     * <p>A similar design governs the process to create the canonical form
     * of a request with the <tt>+canonicalRequestForRequest:</tt> class
     * method.
     * 
     * @param protocolClass the class to register.
     * @return YES if the protocol was registered successfully, NO if not.
     *         The only way that failure can occur is if the given class is not a
     *         subclass of NSURLProtocol.
     */
    @Generated
    @Selector("registerClass:")
    public static native boolean registerClass(@NotNull Class protocolClass);

    /**
     * removePropertyForKey:inRequest:
     * 
     * Remove any property stored under the given key
     * 
     * Like setProperty:forKey:inRequest: above, the purpose of this
     * method is to give protocol implementors the ability to store
     * protocol-specific information in an NSURLRequest
     * 
     * @param key     The key whose value should be removed
     * @param request The request to be modified
     */
    @Generated
    @Selector("removePropertyForKey:inRequest:")
    public static native void removePropertyForKeyInRequest(@NotNull String key, @NotNull NSMutableURLRequest request);

    /**
     * requestIsCacheEquivalent:toRequest:
     * 
     * Compares two requests for equivalence with regard to caching.
     * 
     * Requests are considered equivalent for cache purposes
     * if and only if they would be handled by the same protocol AND that
     * protocol declares them equivalent after performing
     * implementation-specific checks.
     * 
     * @return YES if the two requests are cache-equivalent, NO otherwise.
     */
    @Generated
    @Selector("requestIsCacheEquivalent:toRequest:")
    public static native boolean requestIsCacheEquivalentToRequest(@NotNull NSURLRequest a, @NotNull NSURLRequest b);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setProperty:forKey:inRequest:
     * 
     * Stores the given property in the given request using the
     * given key.
     * 
     * The purpose of this method is to provide an interface
     * for protocol implementors to customize protocol-specific
     * information associated with NSMutableURLRequest objects.
     * 
     * @param value   The property to store.
     * @param key     The string to use for the property storage.
     * @param request The request in which to store the property.
     */
    @Generated
    @Selector("setProperty:forKey:inRequest:")
    public static native void setPropertyForKeyInRequest(@NotNull @Mapped(ObjCObjectMapper.class) Object value,
            @NotNull String key, @NotNull NSMutableURLRequest request);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * unregisterClass:
     * 
     * This method unregisters a protocol.
     * 
     * After unregistration, a protocol class is no longer
     * consulted in calls to NSURLProtocol class methods.
     * 
     * @param protocolClass The class to unregister.
     */
    @Generated
    @Selector("unregisterClass:")
    public static native void unregisterClass(@NotNull Class protocolClass);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns the NSCachedURLResponse of the receiver.
     * 
     * @return The NSCachedURLResponse of the receiver.
     */
    @Nullable
    @Generated
    @Selector("cachedResponse")
    public native NSCachedURLResponse cachedResponse();

    /**
     * Returns the NSURLProtocolClient of the receiver.
     * 
     * @return The NSURLProtocolClient of the receiver.
     */
    @Nullable
    @Generated
    @Selector("client")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSURLProtocolClient client();

    @Generated
    @Selector("init")
    public native NSURLProtocol init();

    /**
     * initWithRequest:cachedResponse:client:
     * 
     * Initializes an NSURLProtocol given request,
     * cached response, and client.
     * 
     * @param request        The request to load.
     * @param cachedResponse A response that has been retrieved from the
     *                       cache for the given request. The protocol implementation should
     *                       apply protocol-specific validity checks if such tests are
     *                       necessary.
     * @param client         The NSURLProtocolClient object that serves as the
     *                       interface the protocol implementation can use to report results back
     *                       to the URL loading system.
     */
    @Generated
    @Selector("initWithRequest:cachedResponse:client:")
    public native NSURLProtocol initWithRequestCachedResponseClient(@NotNull NSURLRequest request,
            @Nullable NSCachedURLResponse cachedResponse,
            @Nullable @Mapped(ObjCObjectMapper.class) NSURLProtocolClient client);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("initWithTask:cachedResponse:client:")
    public native NSURLProtocol initWithTaskCachedResponseClient(@NotNull NSURLSessionTask task,
            @Nullable NSCachedURLResponse cachedResponse,
            @Nullable @Mapped(ObjCObjectMapper.class) NSURLProtocolClient client);

    /**
     * Returns the NSURLRequest of the receiver.
     * 
     * @return The NSURLRequest of the receiver.
     */
    @NotNull
    @Generated
    @Selector("request")
    public native NSURLRequest request();

    /**
     * startLoading
     * 
     * Starts protocol-specific loading of a request.
     * 
     * When this method is called, the protocol implementation
     * should start loading a request.
     */
    @Generated
    @Selector("startLoading")
    public native void startLoading();

    /**
     * stopLoading
     * 
     * Stops protocol-specific loading of a request.
     * 
     * When this method is called, the protocol implementation
     * should end the work of loading a request. This could be in response
     * to a cancel operation, so protocol implementations must be able to
     * handle this call while a load is in progress.
     */
    @Generated
    @Selector("stopLoading")
    public native void stopLoading();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("task")
    public native NSURLSessionTask task();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
