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

/**
 * NEVPNIKEv2SecurityAssociationParameters
 * 
 * The NEVPNIKEv2SecurityAssociationParameters class declares the programmatic interface of an object that manages
 * parameters for an IPSec Security Association
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEVPNIKEv2SecurityAssociationParameters extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NEVPNIKEv2SecurityAssociationParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEVPNIKEv2SecurityAssociationParameters alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEVPNIKEv2SecurityAssociationParameters allocWithZone(VoidPtr zone);

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
    public static native NEVPNIKEv2SecurityAssociationParameters new_objc();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] diffieHellmanGroup
     * 
     * The Diffie Hellman group used by the Security Association. Default is NEVPNIKEv2DiffieHellmanGroup14 starting in
     * macOS 11, iOS 14, and tvOS 17. Prior to that the default was NEVPNIKEv2DiffieHellmanGroup2.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("diffieHellmanGroup")
    @NInt
    public native long diffieHellmanGroup();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] encryptionAlgorithm
     * 
     * The algorithm used by the Security Association to encrypt and decrypt data. On macOS and iOS, the default is
     * NEVPNIKEv2EncryptionAlgorithmAES256 starting in macOS 11 and iOS 14.
     * Prior to that the default was NEVPNIKEv2EncryptionAlgorithm3DES. On tvOS, the default is
     * NEVPNIKEv2EncryptionAlgorithmAES256GCM.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("encryptionAlgorithm")
    @NInt
    public native long encryptionAlgorithm();

    @Generated
    @Selector("init")
    public native NEVPNIKEv2SecurityAssociationParameters init();

    @Generated
    @Selector("initWithCoder:")
    public native NEVPNIKEv2SecurityAssociationParameters initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] integrityAlgorithm
     * 
     * The algorithm used by the Security Association to verify the integrity of data. The IKE psedo-random function
     * algorithm will be inferred based on the integrity algorithm.
     * Default is NEVPNIKEv2IntegrityAlgorithmSHA256 starting in macOS 11, iOS 14, and tvOS 17. Prior to that the
     * default was NEVPNIKEv2IntegrityAlgorithmSHA96.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("integrityAlgorithm")
    @NInt
    public native long integrityAlgorithm();

    /**
     * [@property] lifetimeMinutes
     * 
     * The life time of the Security Association, in minutes. Default is 60 for IKE Security Associations, and 30 for
     * Child Security Associations. Before the lifetime is reached, IKEv2 will attempt to rekey the Security Association
     * to maintain the connection.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("lifetimeMinutes")
    public native int lifetimeMinutes();

    /**
     * [@property] diffieHellmanGroup
     * 
     * The Diffie Hellman group used by the Security Association. Default is NEVPNIKEv2DiffieHellmanGroup14 starting in
     * macOS 11, iOS 14, and tvOS 17. Prior to that the default was NEVPNIKEv2DiffieHellmanGroup2.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setDiffieHellmanGroup:")
    public native void setDiffieHellmanGroup(@NInt long value);

    /**
     * [@property] encryptionAlgorithm
     * 
     * The algorithm used by the Security Association to encrypt and decrypt data. On macOS and iOS, the default is
     * NEVPNIKEv2EncryptionAlgorithmAES256 starting in macOS 11 and iOS 14.
     * Prior to that the default was NEVPNIKEv2EncryptionAlgorithm3DES. On tvOS, the default is
     * NEVPNIKEv2EncryptionAlgorithmAES256GCM.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setEncryptionAlgorithm:")
    public native void setEncryptionAlgorithm(@NInt long value);

    /**
     * [@property] integrityAlgorithm
     * 
     * The algorithm used by the Security Association to verify the integrity of data. The IKE psedo-random function
     * algorithm will be inferred based on the integrity algorithm.
     * Default is NEVPNIKEv2IntegrityAlgorithmSHA256 starting in macOS 11, iOS 14, and tvOS 17. Prior to that the
     * default was NEVPNIKEv2IntegrityAlgorithmSHA96.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setIntegrityAlgorithm:")
    public native void setIntegrityAlgorithm(@NInt long value);

    /**
     * [@property] lifetimeMinutes
     * 
     * The life time of the Security Association, in minutes. Default is 60 for IKE Security Associations, and 30 for
     * Child Security Associations. Before the lifetime is reached, IKEv2 will attempt to rekey the Security Association
     * to maintain the connection.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setLifetimeMinutes:")
    public native void setLifetimeMinutes(int value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
