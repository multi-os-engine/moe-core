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

package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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

@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NWTLSParameters extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NWTLSParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NWTLSParameters alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NWTLSParameters allocWithZone(VoidPtr zone);

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
    public static native NWTLSParameters new_objc();

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
     * [@property] SSLCipherSuites
     * 
     * The set of allowed cipher suites, as defined in <Security/CipherSuite.h>.
     * If set to nil, the default cipher suites will be used.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("SSLCipherSuites")
    public native NSSet<? extends NSNumber> SSLCipherSuites();

    /**
     * [@property] TLSSessionID
     * 
     * The session ID for the associated connection, used for TLS session resumption.
     * This property is optional when using TLS.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("TLSSessionID")
    public native NSData TLSSessionID();

    @Generated
    @Selector("init")
    public native NWTLSParameters init();

    /**
     * [@property] maximumSSLProtocolVersion
     * 
     * The maximum allowed SSLProtocol value. as defined in <Security/SecureTransport.h>.
     * If set, the SSL handshake will not accept any protocol version newer than the maximum.
     * This property should be used with caution, since it may limit the use of preferred
     * SSL protocols.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("maximumSSLProtocolVersion")
    @NUInt
    public native long maximumSSLProtocolVersion();

    /**
     * [@property] minimumSSLProtocolVersion
     * 
     * The minimum allowed SSLProtocol value. as defined in <Security/SecureTransport.h>.
     * If set, the SSL handshake will not accept any protocol version older than the minimum.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("minimumSSLProtocolVersion")
    @NUInt
    public native long minimumSSLProtocolVersion();

    /**
     * [@property] maximumSSLProtocolVersion
     * 
     * The maximum allowed SSLProtocol value. as defined in <Security/SecureTransport.h>.
     * If set, the SSL handshake will not accept any protocol version newer than the maximum.
     * This property should be used with caution, since it may limit the use of preferred
     * SSL protocols.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setMaximumSSLProtocolVersion:")
    public native void setMaximumSSLProtocolVersion(@NUInt long value);

    /**
     * [@property] minimumSSLProtocolVersion
     * 
     * The minimum allowed SSLProtocol value. as defined in <Security/SecureTransport.h>.
     * If set, the SSL handshake will not accept any protocol version older than the minimum.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setMinimumSSLProtocolVersion:")
    public native void setMinimumSSLProtocolVersion(@NUInt long value);

    /**
     * [@property] SSLCipherSuites
     * 
     * The set of allowed cipher suites, as defined in <Security/CipherSuite.h>.
     * If set to nil, the default cipher suites will be used.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setSSLCipherSuites:")
    public native void setSSLCipherSuites(@Nullable NSSet<? extends NSNumber> value);

    /**
     * [@property] TLSSessionID
     * 
     * The session ID for the associated connection, used for TLS session resumption.
     * This property is optional when using TLS.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setTLSSessionID:")
    public native void setTLSSessionID(@Nullable NSData value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
