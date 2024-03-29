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

package apple.coretelephony;

import apple.NSObject;
import apple.foundation.NSArray;
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

@Generated
@Library("CoreTelephony")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CTCarrier extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CTCarrier(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CTCarrier alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CTCarrier allocWithZone(VoidPtr zone);

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
    public static native CTCarrier new_objc();

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
     * allowsVOIP
     * 
     * Discussion:
     * A BOOL value that is YES if this carrier allows VOIP calls to be
     * made on its network, NO otherwise.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Deprecated; returns YES at some point in the future
     */
    @Deprecated
    @Generated
    @Selector("allowsVOIP")
    public native boolean allowsVOIP();

    /**
     * carrierName
     * 
     * Discussion:
     * An NSString containing the name of the subscriber's cellular service provider.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Deprecated; returns '--' at some point in the future
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("carrierName")
    public native String carrierName();

    @Generated
    @Selector("init")
    public native CTCarrier init();

    /**
     * isoCountryCode
     * 
     * Discussion:
     * Returns an NSString object that contains country code for
     * the subscriber's cellular service provider, represented as an ISO 3166-1
     * country code string
     * 
     * API-Since: 4.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Deprecated; returns '--' at some point in the future
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("isoCountryCode")
    public native String isoCountryCode();

    /**
     * mobileCountryCode
     * 
     * Discussion:
     * An NSString containing the mobile country code for the subscriber's
     * cellular service provider, in its numeric representation
     * 
     * API-Since: 4.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Deprecated; returns '65535' at some point in the future
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("mobileCountryCode")
    public native String mobileCountryCode();

    /**
     * mobileNetworkCode
     * 
     * Discussion:
     * An NSString containing the mobile network code for the subscriber's
     * cellular service provider, in its numeric representation
     * 
     * API-Since: 4.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Deprecated; returns '65535' at some point in the future
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("mobileNetworkCode")
    public native String mobileNetworkCode();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
