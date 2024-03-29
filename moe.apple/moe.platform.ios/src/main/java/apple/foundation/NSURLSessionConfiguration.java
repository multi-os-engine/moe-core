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
 * Configuration options for an NSURLSession. When a session is
 * created, a copy of the configuration object is made - you cannot
 * modify the configuration of a session after it has been created.
 * 
 * The shared session uses the global singleton credential, cache
 * and cookie storage objects.
 * 
 * An ephemeral session has no persistent disk storage for cookies,
 * cache or credentials.
 * 
 * A background session can be used to perform networking operations
 * on behalf of a suspended application, within certain constraints.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLSessionConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLSessionConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLSessionConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSURLSessionConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 8.0
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("backgroundSessionConfiguration:")
    public static native NSURLSessionConfiguration backgroundSessionConfiguration(@NotNull String identifier);

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("backgroundSessionConfigurationWithIdentifier:")
    public static native NSURLSessionConfiguration backgroundSessionConfigurationWithIdentifier(
            @NotNull String identifier);

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

    @NotNull
    @Generated
    @Selector("defaultSessionConfiguration")
    public static native NSURLSessionConfiguration defaultSessionConfiguration();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("ephemeralSessionConfiguration")
    public static native NSURLSessionConfiguration ephemeralSessionConfiguration();

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

    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Please use NSURLSessionConfiguration.defaultSessionConfiguration or other class methods to
     * create instances
     */
    @Deprecated
    @Generated
    @Owned
    @Selector("new")
    public static native NSURLSessionConfiguration new_objc();

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
     * Specifies additional headers which will be set on outgoing requests.
     * Note that these headers are added to the request only if not already present.
     */
    @Nullable
    @Generated
    @Selector("HTTPAdditionalHeaders")
    public native NSDictionary<?, ?> HTTPAdditionalHeaders();

    /**
     * Policy for accepting cookies. This overrides the policy otherwise specified by the cookie storage.
     */
    @Generated
    @Selector("HTTPCookieAcceptPolicy")
    @NUInt
    public native long HTTPCookieAcceptPolicy();

    /**
     * The cookie storage object to use, or nil to indicate that no cookies should be handled
     */
    @Nullable
    @Generated
    @Selector("HTTPCookieStorage")
    public native NSHTTPCookieStorage HTTPCookieStorage();

    /**
     * The maximum number of simultaneous persistent connections per host
     */
    @Generated
    @Selector("HTTPMaximumConnectionsPerHost")
    @NInt
    public native long HTTPMaximumConnectionsPerHost();

    /**
     * Allow the session to set cookies on requests
     */
    @Generated
    @Selector("HTTPShouldSetCookies")
    public native boolean HTTPShouldSetCookies();

    /**
     * Allow the use of HTTP pipelining
     */
    @Generated
    @Selector("HTTPShouldUsePipelining")
    public native boolean HTTPShouldUsePipelining();

    /**
     * The maximum allowable versions of the TLS protocol, from <Security/SecureTransport.h>
     * 
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("TLSMaximumSupportedProtocol")
    public native int TLSMaximumSupportedProtocol();

    /**
     * The minimum allowable versions of the TLS protocol, from <Security/SecureTransport.h>
     * 
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("TLSMinimumSupportedProtocol")
    public native int TLSMinimumSupportedProtocol();

    /**
     * The URL resource cache, or nil to indicate that no caching is to be performed
     */
    @Nullable
    @Generated
    @Selector("URLCache")
    public native NSURLCache URLCache();

    /**
     * The credential storage object, or nil to indicate that no credential storage is to be used
     */
    @Nullable
    @Generated
    @Selector("URLCredentialStorage")
    public native NSURLCredentialStorage URLCredentialStorage();

    /**
     * allow request to route over cellular.
     */
    @Generated
    @Selector("allowsCellularAccess")
    public native boolean allowsCellularAccess();

    /**
     * The proxy dictionary, as described by <CFNetwork/CFHTTPStream.h>
     */
    @Nullable
    @Generated
    @Selector("connectionProxyDictionary")
    public native NSDictionary<?, ?> connectionProxyDictionary();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * identifier for the background session configuration
     */
    @Nullable
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Please use NSURLSessionConfiguration.defaultSessionConfiguration or other class methods to
     * create instances
     */
    @Deprecated
    @Generated
    @Selector("init")
    public native NSURLSessionConfiguration init();

    /**
     * allows background tasks to be scheduled at the discretion of the system for optimal performance.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isDiscretionary")
    public native boolean isDiscretionary();

    /**
     * allows background tasks to be scheduled at the discretion of the system for optimal performance.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setDiscretionary:")
    public native void setDiscretionary(boolean value);

    /**
     * type of service for requests.
     */
    @Generated
    @Selector("networkServiceType")
    @NUInt
    public native long networkServiceType();

    /**
     * An optional array of Class objects which subclass NSURLProtocol.
     * The Class will be sent +canInitWithRequest: when determining if
     * an instance of the class can be used for a given URL scheme.
     * You should not use +[NSURLProtocol registerClass:], as that
     * method will register your class with the default session rather
     * than with an instance of NSURLSession.
     * Custom NSURLProtocol subclasses are not available to background
     * sessions.
     */
    @Nullable
    @Generated
    @Selector("protocolClasses")
    public native NSArray<? extends Class> protocolClasses();

    /**
     * default cache policy for requests
     */
    @Generated
    @Selector("requestCachePolicy")
    @NUInt
    public native long requestCachePolicy();

    /**
     * Allows the app to be resumed or launched in the background when tasks in background sessions complete
     * or when auth is required. This only applies to configurations created with
     * +backgroundSessionConfigurationWithIdentifier:
     * and the default value is YES.
     * 
     * NOTE: macOS apps based on AppKit do not support background launch.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("sessionSendsLaunchEvents")
    public native boolean sessionSendsLaunchEvents();

    /**
     * allow request to route over cellular.
     */
    @Generated
    @Selector("setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean value);

    /**
     * The proxy dictionary, as described by <CFNetwork/CFHTTPStream.h>
     */
    @Generated
    @Selector("setConnectionProxyDictionary:")
    public native void setConnectionProxyDictionary(@Nullable NSDictionary<?, ?> value);

    /**
     * Specifies additional headers which will be set on outgoing requests.
     * Note that these headers are added to the request only if not already present.
     */
    @Generated
    @Selector("setHTTPAdditionalHeaders:")
    public native void setHTTPAdditionalHeaders(@Nullable NSDictionary<?, ?> value);

    /**
     * Policy for accepting cookies. This overrides the policy otherwise specified by the cookie storage.
     */
    @Generated
    @Selector("setHTTPCookieAcceptPolicy:")
    public native void setHTTPCookieAcceptPolicy(@NUInt long value);

    /**
     * The cookie storage object to use, or nil to indicate that no cookies should be handled
     */
    @Generated
    @Selector("setHTTPCookieStorage:")
    public native void setHTTPCookieStorage(@Nullable NSHTTPCookieStorage value);

    /**
     * The maximum number of simultaneous persistent connections per host
     */
    @Generated
    @Selector("setHTTPMaximumConnectionsPerHost:")
    public native void setHTTPMaximumConnectionsPerHost(@NInt long value);

    /**
     * Allow the session to set cookies on requests
     */
    @Generated
    @Selector("setHTTPShouldSetCookies:")
    public native void setHTTPShouldSetCookies(boolean value);

    /**
     * Allow the use of HTTP pipelining
     */
    @Generated
    @Selector("setHTTPShouldUsePipelining:")
    public native void setHTTPShouldUsePipelining(boolean value);

    /**
     * type of service for requests.
     */
    @Generated
    @Selector("setNetworkServiceType:")
    public native void setNetworkServiceType(@NUInt long value);

    /**
     * An optional array of Class objects which subclass NSURLProtocol.
     * The Class will be sent +canInitWithRequest: when determining if
     * an instance of the class can be used for a given URL scheme.
     * You should not use +[NSURLProtocol registerClass:], as that
     * method will register your class with the default session rather
     * than with an instance of NSURLSession.
     * Custom NSURLProtocol subclasses are not available to background
     * sessions.
     */
    @Generated
    @Selector("setProtocolClasses:")
    public native void setProtocolClasses(@Nullable NSArray<? extends Class> value);

    /**
     * default cache policy for requests
     */
    @Generated
    @Selector("setRequestCachePolicy:")
    public native void setRequestCachePolicy(@NUInt long value);

    /**
     * Allows the app to be resumed or launched in the background when tasks in background sessions complete
     * or when auth is required. This only applies to configurations created with
     * +backgroundSessionConfigurationWithIdentifier:
     * and the default value is YES.
     * 
     * NOTE: macOS apps based on AppKit do not support background launch.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setSessionSendsLaunchEvents:")
    public native void setSessionSendsLaunchEvents(boolean value);

    /**
     * The identifier of the shared data container into which files in background sessions should be downloaded.
     * App extensions wishing to use background sessions *must* set this property to a valid container identifier, or
     * all transfers in that session will fail with NSURLErrorBackgroundSessionRequiresSharedContainer.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setSharedContainerIdentifier:")
    public native void setSharedContainerIdentifier(@Nullable String value);

    /**
     * Enable extended background idle mode for any tcp sockets created. Enabling this mode asks the system to keep the
     * socket open
     * and delay reclaiming it when the process moves to the background (see
     * https://developer.apple.com/library/ios/technotes/tn2277/_index.html)
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setShouldUseExtendedBackgroundIdleMode:")
    public native void setShouldUseExtendedBackgroundIdleMode(boolean value);

    /**
     * The maximum allowable versions of the TLS protocol, from <Security/SecureTransport.h>
     * 
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("setTLSMaximumSupportedProtocol:")
    public native void setTLSMaximumSupportedProtocol(int value);

    /**
     * The minimum allowable versions of the TLS protocol, from <Security/SecureTransport.h>
     * 
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("setTLSMinimumSupportedProtocol:")
    public native void setTLSMinimumSupportedProtocol(int value);

    /**
     * default timeout for requests. This will cause a timeout if no data is transmitted for the given timeout value,
     * and is reset whenever data is transmitted.
     */
    @Generated
    @Selector("setTimeoutIntervalForRequest:")
    public native void setTimeoutIntervalForRequest(double value);

    /**
     * default timeout for requests. This will cause a timeout if a resource is not able to be retrieved within a given
     * timeout.
     */
    @Generated
    @Selector("setTimeoutIntervalForResource:")
    public native void setTimeoutIntervalForResource(double value);

    /**
     * The URL resource cache, or nil to indicate that no caching is to be performed
     */
    @Generated
    @Selector("setURLCache:")
    public native void setURLCache(@Nullable NSURLCache value);

    /**
     * The credential storage object, or nil to indicate that no credential storage is to be used
     */
    @Generated
    @Selector("setURLCredentialStorage:")
    public native void setURLCredentialStorage(@Nullable NSURLCredentialStorage value);

    /**
     * The identifier of the shared data container into which files in background sessions should be downloaded.
     * App extensions wishing to use background sessions *must* set this property to a valid container identifier, or
     * all transfers in that session will fail with NSURLErrorBackgroundSessionRequiresSharedContainer.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("sharedContainerIdentifier")
    public native String sharedContainerIdentifier();

    /**
     * Enable extended background idle mode for any tcp sockets created. Enabling this mode asks the system to keep the
     * socket open
     * and delay reclaiming it when the process moves to the background (see
     * https://developer.apple.com/library/ios/technotes/tn2277/_index.html)
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("shouldUseExtendedBackgroundIdleMode")
    public native boolean shouldUseExtendedBackgroundIdleMode();

    /**
     * default timeout for requests. This will cause a timeout if no data is transmitted for the given timeout value,
     * and is reset whenever data is transmitted.
     */
    @Generated
    @Selector("timeoutIntervalForRequest")
    public native double timeoutIntervalForRequest();

    /**
     * default timeout for requests. This will cause a timeout if a resource is not able to be retrieved within a given
     * timeout.
     */
    @Generated
    @Selector("timeoutIntervalForResource")
    public native double timeoutIntervalForResource();

    /**
     * multipath service type to use for connections. The default is NSURLSessionMultipathServiceTypeNone
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("multipathServiceType")
    @NInt
    public native long multipathServiceType();

    /**
     * multipath service type to use for connections. The default is NSURLSessionMultipathServiceTypeNone
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setMultipathServiceType:")
    public native void setMultipathServiceType(@NInt long value);

    /**
     * Causes tasks to wait for network connectivity to become available, rather
     * than immediately failing with an error (such as NSURLErrorNotConnectedToInternet)
     * when it is not. When waiting for connectivity, the timeoutIntervalForRequest
     * property does not apply, but the timeoutIntervalForResource property does.
     * 
     * Unsatisfactory connectivity (that requires waiting) includes cases where the
     * device has limited or insufficient connectivity for a task (e.g., only has a
     * cellular connection but the allowsCellularAccess property is NO, or requires
     * a VPN connection in order to reach the desired host).
     * 
     * Default value is NO. Ignored by background sessions, as background sessions
     * always wait for connectivity.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setWaitsForConnectivity:")
    public native void setWaitsForConnectivity(boolean value);

    /**
     * Causes tasks to wait for network connectivity to become available, rather
     * than immediately failing with an error (such as NSURLErrorNotConnectedToInternet)
     * when it is not. When waiting for connectivity, the timeoutIntervalForRequest
     * property does not apply, but the timeoutIntervalForResource property does.
     * 
     * Unsatisfactory connectivity (that requires waiting) includes cases where the
     * device has limited or insufficient connectivity for a task (e.g., only has a
     * cellular connection but the allowsCellularAccess property is NO, or requires
     * a VPN connection in order to reach the desired host).
     * 
     * Default value is NO. Ignored by background sessions, as background sessions
     * always wait for connectivity.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("waitsForConnectivity")
    public native boolean waitsForConnectivity();

    /**
     * The maximum allowable versions of the TLS protocol, from <Security/SecProtocolTypes.h>
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("TLSMaximumSupportedProtocolVersion")
    public native short TLSMaximumSupportedProtocolVersion();

    /**
     * The minimum allowable versions of the TLS protocol, from <Security/SecProtocolTypes.h>
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("TLSMinimumSupportedProtocolVersion")
    public native short TLSMinimumSupportedProtocolVersion();

    /**
     * allow request to route over networks in constrained mode. Defaults to YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("allowsConstrainedNetworkAccess")
    public native boolean allowsConstrainedNetworkAccess();

    /**
     * allow request to route over expensive networks. Defaults to YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("allowsExpensiveNetworkAccess")
    public native boolean allowsExpensiveNetworkAccess();

    /**
     * allow request to route over networks in constrained mode. Defaults to YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAllowsConstrainedNetworkAccess:")
    public native void setAllowsConstrainedNetworkAccess(boolean value);

    /**
     * allow request to route over expensive networks. Defaults to YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAllowsExpensiveNetworkAccess:")
    public native void setAllowsExpensiveNetworkAccess(boolean value);

    /**
     * The maximum allowable versions of the TLS protocol, from <Security/SecProtocolTypes.h>
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setTLSMaximumSupportedProtocolVersion:")
    public native void setTLSMaximumSupportedProtocolVersion(short value);

    /**
     * The minimum allowable versions of the TLS protocol, from <Security/SecProtocolTypes.h>
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setTLSMinimumSupportedProtocolVersion:")
    public native void setTLSMinimumSupportedProtocolVersion(short value);

    /**
     * requires requests from the session to be made with DNSSEC validation enabled. Defaults to NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("requiresDNSSECValidation")
    public native boolean requiresDNSSECValidation();

    /**
     * requires requests from the session to be made with DNSSEC validation enabled. Defaults to NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setRequiresDNSSECValidation:")
    public native void setRequiresDNSSECValidation(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
