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
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEVPNProtocolIPSec
 * 
 * The NEVPNProtocolIPSec class declares the programmatic interface of an object that manages the IPSec-specific portion
 * of a VPN configuration.
 * 
 * Instances of this class use IKE version 1 for key negotiation.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEVPNProtocolIPSec extends NEVPNProtocol {
    static {
        NatJ.register();
    }

    @Generated
    protected NEVPNProtocolIPSec(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEVPNProtocolIPSec alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEVPNProtocolIPSec allocWithZone(VoidPtr zone);

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
    public static native NEVPNProtocolIPSec new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] authenticationMethod
     * 
     * The method used to authenticate with the IPSec server. Note that if this property is set to
     * NEVPNIKEAuthenticationMethodNone, extended authentication will still be negotiated if useExtendedAuthentication
     * is set to YES.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("authenticationMethod")
    @NInt
    public native long authenticationMethod();

    @Generated
    @Selector("init")
    public native NEVPNProtocolIPSec init();

    @Generated
    @Selector("initWithCoder:")
    public native NEVPNProtocolIPSec initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] localIdentifier
     * 
     * A string identifying the local IPSec endpoint for authentication purposes.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("localIdentifier")
    public native String localIdentifier();

    /**
     * [@property] remoteIdentifier
     * 
     * A string identifying the remote IPSec endpoint for authentication purposes.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("remoteIdentifier")
    public native String remoteIdentifier();

    /**
     * [@property] authenticationMethod
     * 
     * The method used to authenticate with the IPSec server. Note that if this property is set to
     * NEVPNIKEAuthenticationMethodNone, extended authentication will still be negotiated if useExtendedAuthentication
     * is set to YES.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setAuthenticationMethod:")
    public native void setAuthenticationMethod(@NInt long value);

    /**
     * [@property] localIdentifier
     * 
     * A string identifying the local IPSec endpoint for authentication purposes.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setLocalIdentifier:")
    public native void setLocalIdentifier(@Nullable String value);

    /**
     * [@property] remoteIdentifier
     * 
     * A string identifying the remote IPSec endpoint for authentication purposes.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setRemoteIdentifier:")
    public native void setRemoteIdentifier(@Nullable String value);

    /**
     * [@property] sharedSecretReference
     * 
     * A persistent reference to a keychain item of class kSecClassGenericPassword containing the IKE shared secret.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setSharedSecretReference:")
    public native void setSharedSecretReference(@Nullable NSData value);

    /**
     * [@property] useExtendedAuthentication
     * 
     * A flag indicating if extended authentication will be negotiated. This authentication is in addition to the IKE
     * authentication used to authenticate the endpoints of the IKE session.
     * For IKE version 1, when this flag is set X-Auth authentication will be negotiated as part of the IKE session,
     * using the username and password properties as the credential.
     * For IKE version 2, when this flag is set EAP authentication will be negotiated as part of the IKE session, using
     * the username, password, and/or identity properties as the credential depending on which EAP method the server
     * requires.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setUseExtendedAuthentication:")
    public native void setUseExtendedAuthentication(boolean value);

    /**
     * [@property] sharedSecretReference
     * 
     * A persistent reference to a keychain item of class kSecClassGenericPassword containing the IKE shared secret.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("sharedSecretReference")
    public native NSData sharedSecretReference();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] useExtendedAuthentication
     * 
     * A flag indicating if extended authentication will be negotiated. This authentication is in addition to the IKE
     * authentication used to authenticate the endpoints of the IKE session.
     * For IKE version 1, when this flag is set X-Auth authentication will be negotiated as part of the IKE session,
     * using the username and password properties as the credential.
     * For IKE version 2, when this flag is set EAP authentication will be negotiated as part of the IKE session, using
     * the username, password, and/or identity properties as the credential depending on which EAP method the server
     * requires.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("useExtendedAuthentication")
    public native boolean useExtendedAuthentication();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
