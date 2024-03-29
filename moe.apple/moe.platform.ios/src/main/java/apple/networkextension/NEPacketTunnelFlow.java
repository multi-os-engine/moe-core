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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEPacketTunnelFlow
 * 
 * The NEPacketTunnelFlow class declares the programmatic interface of an object that is used by NEPacketTunnelProvider
 * implementations to tunnel IP packets.
 * 
 * NEPacketTunnelFlow is part of NetworkExtension.framework
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEPacketTunnelFlow extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEPacketTunnelFlow(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEPacketTunnelFlow alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEPacketTunnelFlow allocWithZone(VoidPtr zone);

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
    public static native NEPacketTunnelFlow new_objc();

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

    @Generated
    @Selector("init")
    public native NEPacketTunnelFlow init();

    /**
     * readPacketObjectsWithCompletionHandler:
     * 
     * Read available IP packets from the flow.
     * 
     * @param completionHandler A block that will be executed to handle the packets. This block takes an array of
     *                          NEPacket objects. If after handling the packets the caller wants to read more packets
     *                          then the caller must call this method again.
     * 
     *                          API-Since: 10.0
     */
    @Generated
    @Selector("readPacketObjectsWithCompletionHandler:")
    public native void readPacketObjectsWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_readPacketObjectsWithCompletionHandler") Block_readPacketObjectsWithCompletionHandler completionHandler);

    /**
     * readPacketsWithCompletionHandler:
     * 
     * Read available IP packets from the flow.
     * 
     * @param completionHandler A block that will be executed to handle the packets. This block takes an array of NSData
     *                          objects and an array of NSNumber objects. The NSData and NSNumber in corresponding
     *                          indicies in the array represent one packet. If after handling the packets the caller
     *                          wants to read more packets then the caller must call this method again.
     * 
     *                          API-Since: 9.0
     */
    @Generated
    @Selector("readPacketsWithCompletionHandler:")
    public native void readPacketsWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_readPacketsWithCompletionHandler") Block_readPacketsWithCompletionHandler completionHandler);

    /**
     * writePacketObjects:
     * 
     * Write multiple IP packets to the flow.
     * 
     * @param packets An array of NEPacket objects, each containing packet data and protocol family to be written.
     * 
     *                API-Since: 10.0
     */
    @Generated
    @Selector("writePacketObjects:")
    public native boolean writePacketObjects(@NotNull NSArray<? extends NEPacket> packets);

    /**
     * writePackets:completionHandler:
     * 
     * Write multiple IP packets to the flow.
     * 
     * @param packets   An array of NSData objects, each containing packet data to be written.
     * @param protocols An array of NSNumber objects. Each number contains the protocol of the packet in the
     *                  corresponding index in the packets array.
     * 
     *                  API-Since: 9.0
     */
    @Generated
    @Selector("writePackets:withProtocols:")
    public native boolean writePacketsWithProtocols(@NotNull NSArray<? extends NSData> packets,
            @NotNull NSArray<? extends NSNumber> protocols);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readPacketObjectsWithCompletionHandler {
        @Generated
        void call_readPacketObjectsWithCompletionHandler(@NotNull NSArray<? extends NEPacket> packets);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readPacketsWithCompletionHandler {
        @Generated
        void call_readPacketsWithCompletionHandler(@NotNull NSArray<? extends NSData> packets,
                @NotNull NSArray<? extends NSNumber> protocols);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
