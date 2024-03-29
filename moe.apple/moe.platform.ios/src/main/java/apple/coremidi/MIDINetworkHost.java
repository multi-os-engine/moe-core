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

package apple.coremidi;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNetService;
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
 * __________________________________________________________________________________________________
 * MIDINetworkHost
 * 
 * Represents a network address.
 * name: the user's tag for this object.
 * Representations are either:
 * - address (IP address or hostname) and UDP port
 * - netServiceName and netServiceDomain
 * 
 * API-Since: 4.2
 */
@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MIDINetworkHost extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MIDINetworkHost(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MIDINetworkHost alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MIDINetworkHost allocWithZone(VoidPtr zone);

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
    @Selector("hostWithName:address:port:")
    public static native MIDINetworkHost hostWithNameAddressPort(@NotNull String name, @NotNull String address,
            @NUInt long port);

    @Generated
    @Selector("hostWithName:netService:")
    public static native MIDINetworkHost hostWithNameNetService(@NotNull String name, @NotNull NSNetService netService);

    @Generated
    @Selector("hostWithName:netServiceName:netServiceDomain:")
    public static native MIDINetworkHost hostWithNameNetServiceNameNetServiceDomain(@NotNull String name,
            @NotNull String netServiceName, @NotNull String netServiceDomain);

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
    public static native MIDINetworkHost new_objc();

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
     * IP address or hostname
     */
    @NotNull
    @Generated
    @Selector("address")
    public native String address();

    @Generated
    @Selector("hasSameAddressAs:")
    public native boolean hasSameAddressAs(@NotNull MIDINetworkHost other);

    @Generated
    @Selector("init")
    public native MIDINetworkHost init();

    /**
     * user's tag
     */
    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * NSNetService domain
     */
    @Nullable
    @Generated
    @Selector("netServiceDomain")
    public native String netServiceDomain();

    /**
     * NSNetService name
     */
    @Nullable
    @Generated
    @Selector("netServiceName")
    public native String netServiceName();

    /**
     * UDP port
     */
    @Generated
    @Selector("port")
    @NUInt
    public native long port();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
