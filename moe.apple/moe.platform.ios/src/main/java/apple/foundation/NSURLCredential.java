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
import apple.foundation.protocol.NSSecureCoding;
import apple.security.opaque.SecIdentityRef;
import apple.security.opaque.SecTrustRef;
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

/**
 * NSURLCredential
 * 
 * This class is an immutable object representing an authentication credential. The actual type of the credential is
 * determined by the constructor called in the categories declared below.
 * 
 * API-Since: 2.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLCredential extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLCredential(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLCredential alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSURLCredential allocWithZone(VoidPtr zone);

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
     * credentialForTrust:
     * 
     * Create a new NSURLCredential which specifies that a handshake has been trusted.
     * 
     * @return The new autoreleased NSURLCredential
     * 
     *         API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("credentialForTrust:")
    public static native NSURLCredential credentialForTrust(@NotNull SecTrustRef trust);

    /**
     * credentialWithIdentity:certificates:persistence:
     * 
     * Create a new NSURLCredential with an identity and certificate array
     * 
     * @param identity    a SecIdentityRef object
     * @param certArray   an array containing at least one SecCertificateRef objects
     * @param persistence enum that says to store per session, permanently or not at all
     * @return The new autoreleased NSURLCredential
     * 
     *         API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("credentialWithIdentity:certificates:persistence:")
    public static native NSURLCredential credentialWithIdentityCertificatesPersistence(@NotNull SecIdentityRef identity,
            @Nullable NSArray<?> certArray, @NUInt long persistence);

    /**
     * credentialWithUser:password:persistence:
     * 
     * Create a new NSURLCredential with a user and password
     * 
     * @param user        the username
     * @param password    the password
     * @param persistence enum that says to store per session, permanently or not at all
     * @return The new autoreleased NSURLCredential
     */
    @NotNull
    @Generated
    @Selector("credentialWithUser:password:persistence:")
    public static native NSURLCredential credentialWithUserPasswordPersistence(@NotNull String user,
            @NotNull String password, @NUInt long persistence);

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
    public static native NSURLCredential new_objc();

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
     * Returns an NSArray of SecCertificateRef objects representing the client certificate for this credential, if this
     * credential was created with an identity and certificate.
     * 
     * @return an NSArray of SecCertificateRef or NULL if this is a username/password credential
     * 
     *         API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("certificates")
    public native NSArray<?> certificates();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * Find out if this credential has a password, without trying to get it
     * 
     * If this credential's password is actually kept in an
     * external store, the password method may return nil even if this
     * method returns YES, since getting the password may fail, or the
     * user may refuse access.
     * 
     * @return YES if this credential has a password, otherwise NO
     */
    @Generated
    @Selector("hasPassword")
    public native boolean hasPassword();

    /**
     * Returns the SecIdentityRef of this credential, if it was created with a certificate and identity
     * 
     * @return A SecIdentityRef or NULL if this is a username/password credential
     */
    @Nullable
    @Generated
    @Selector("identity")
    public native SecIdentityRef identity();

    @Generated
    @Selector("init")
    public native NSURLCredential init();

    @Generated
    @Selector("initWithCoder:")
    public native NSURLCredential initWithCoder(@NotNull NSCoder coder);

    /**
     * initWithIdentity:certificates:persistence:
     * 
     * Initialize an NSURLCredential with an identity and array of at least 1 client certificates (SecCertificateRef)
     * 
     * @param identity    a SecIdentityRef object
     * @param certArray   an array containing at least one SecCertificateRef objects
     * @param persistence enum that says to store per session, permanently or not at all
     * @return the Initialized NSURLCredential
     * 
     *         API-Since: 3.0
     */
    @Generated
    @Selector("initWithIdentity:certificates:persistence:")
    public native NSURLCredential initWithIdentityCertificatesPersistence(@NotNull SecIdentityRef identity,
            @Nullable NSArray<?> certArray, @NUInt long persistence);

    /**
     * initWithTrust:
     * 
     * Initialize a new NSURLCredential which specifies that the specified trust has been accepted.
     * 
     * @return the Initialized NSURLCredential
     * 
     *         API-Since: 3.0
     */
    @Generated
    @Selector("initWithTrust:")
    public native NSURLCredential initWithTrust(@NotNull SecTrustRef trust);

    /**
     * initWithUser:password:persistence:
     * 
     * Initialize a NSURLCredential with a user and password
     * 
     * @param user        the username
     * @param password    the password
     * @param persistence enum that says to store per session, permanently or not at all
     * @return The initialized NSURLCredential
     */
    @Generated
    @Selector("initWithUser:password:persistence:")
    public native NSURLCredential initWithUserPasswordPersistence(@NotNull String user, @NotNull String password,
            @NUInt long persistence);

    /**
     * Get the password
     * 
     * This method might actually attempt to retrieve the
     * password from an external store, possible resulting in prompting,
     * so do not call it unless needed.
     * 
     * @return The password string
     */
    @Nullable
    @Generated
    @Selector("password")
    public native String password();

    /**
     * Determine whether this credential is or should be stored persistently
     * 
     * @return A value indicating whether this credential is stored permanently, per session or not at all.
     */
    @Generated
    @Selector("persistence")
    @NUInt
    public native long persistence();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Get the username
     * 
     * @return The user string
     */
    @Nullable
    @Generated
    @Selector("user")
    public native String user();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
