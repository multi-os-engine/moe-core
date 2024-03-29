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
 * [@interface] NEAppRule
 * 
 * The NEAppRule class declares the programmatic interface for an object that contains the match conditions for a rule
 * that is used to match network traffic originated by applications.
 * 
 * NEAppRule is used in the context of a Network Extension configuration to specify what traffic should be made
 * available to the Network Extension.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEAppRule extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NEAppRule(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEAppRule alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEAppRule allocWithZone(VoidPtr zone);

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
    public static native NEAppRule new_objc();

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native NEAppRule init();

    @Generated
    @Selector("initWithCoder:")
    public native NEAppRule initWithCoder(@NotNull NSCoder coder);

    /**
     * initWithSigningIdentifier:
     * 
     * Initializes a newly-allocated NEAppRule object.
     * 
     * @param signingIdentifier The signing identifier of the executable that matches the rule.
     * 
     *                          API-Since: 9.0
     */
    @Generated
    @Selector("initWithSigningIdentifier:")
    public native NEAppRule initWithSigningIdentifier(@NotNull String signingIdentifier);

    /**
     * [@property] matchDomains
     * 
     * An array of strings. This property is actually read-only. If the destination host of the network traffic being
     * evaluated has a suffix equal to one of the strings in this array and all other conditions of the rule match, then
     * the rule matches. This property is optional.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("matchDomains")
    public native NSArray<?> matchDomains();

    /**
     * [@property] matchPath
     * 
     * A string containing a file system path. If the file system path of the executable being evaluated is equal to
     * this string and all other conditions of the rule match, then the rule matches. This property is optional.
     * 
     * API-Since: 9.3
     */
    @Nullable
    @Generated
    @Selector("matchPath")
    public native String matchPath();

    /**
     * [@property] matchSigningIdentifier
     * 
     * A string containing a signing identifier. If the code signature of the executable being evaluated has a signing
     * identifier equal to this string and all other conditions of the rule match, then the rule matches.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("matchSigningIdentifier")
    public native String matchSigningIdentifier();

    /**
     * [@property] matchDomains
     * 
     * An array of strings. This property is actually read-only. If the destination host of the network traffic being
     * evaluated has a suffix equal to one of the strings in this array and all other conditions of the rule match, then
     * the rule matches. This property is optional.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setMatchDomains:")
    public native void setMatchDomains(@Nullable NSArray<?> value);

    /**
     * [@property] matchPath
     * 
     * A string containing a file system path. If the file system path of the executable being evaluated is equal to
     * this string and all other conditions of the rule match, then the rule matches. This property is optional.
     * 
     * API-Since: 9.3
     */
    @Generated
    @Selector("setMatchPath:")
    public native void setMatchPath(@Nullable String value);

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
