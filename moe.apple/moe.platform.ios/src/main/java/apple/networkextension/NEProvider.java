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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEProvider
 * 
 * The NEProvider class declares the programmatic interface that is common for all Network Extension providers.
 * 
 * See the sub classes of NEProvider for more details. Developers of Network Extension providers should create sub
 * classes of the sub classes of NEProvider.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEProvider extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEProvider alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEProvider allocWithZone(VoidPtr zone);

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
    public static native NEProvider new_objc();

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
     * createTCPConnectionToEndpoint:enableTLS:TLSParameters:delegate:
     * 
     * This function can be called by subclass implementations to create a TCP connection to a given network endpoint.
     * This function should not be overridden by subclasses.
     * 
     * @param remoteEndpoint An NWEndpoint object that specifies the remote network endpoint to connect to.
     * @param enableTLS      A flag indicating if a TLS session should be negotiated on the connection.
     * @param TLSParameters  A set of optional TLS parameters. Only valid if enableTLS is YES. If TLSParameters is nil,
     *                       the default system parameters will be used for TLS negotiation.
     * @param delegate       An object to use as the connections delegate. This object should conform to the
     *                       NWTCPConnectionAuthenticationDelegate protocol.
     * @return An NWTCPConnection object.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("createTCPConnectionToEndpoint:enableTLS:TLSParameters:delegate:")
    public native NWTCPConnection createTCPConnectionToEndpointEnableTLSTLSParametersDelegate(
            @NotNull NWEndpoint remoteEndpoint, boolean enableTLS, @Nullable NWTLSParameters TLSParameters,
            @Nullable @Mapped(ObjCObjectMapper.class) Object delegate);

    /**
     * createUDPSessionToEndpoint:fromEndpoint:
     * 
     * This function can be called by subclass implementations to create a UDP session between a local network endpoint
     * and a remote network endpoint. This function should not be overridden by subclasses.
     * 
     * @param remoteEndpoint An NWEndpoint object that specifies the remote endpoint to which UDP datagrams will be sent
     *                       by the UDP session.
     * @param localEndpoint  An NWHostEndpoint object that specifies the local IP address endpoint to use as the source
     *                       endpoint of the UDP session.
     * @return An NWUDPSession object.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("createUDPSessionToEndpoint:fromEndpoint:")
    public native NWUDPSession createUDPSessionToEndpointFromEndpoint(@NotNull NWEndpoint remoteEndpoint,
            @Nullable NWHostEndpoint localEndpoint);

    /**
     * [@property] defaultPath
     * 
     * The current default path for connections created by the provider. Use KVO to watch for network changes.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("defaultPath")
    public native NWPath defaultPath();

    /**
     * displayMessage:completionHandler:
     * 
     * This method can be called by subclass implementations to display a message to the user.
     * 
     * @param message           The message to be displayed.
     * @param completionHandler A block that is executed when the user acknowledges the message. If this method is
     *                          called on a NEFilterDataProvider instance or the message cannot be displayed, then the
     *                          completion handler block will be executed immediately with success parameter set to NO.
     *                          If the message was successfully displayed to the user, then the completion handler block
     *                          is executed with the success parameter set to YES when the user dismisses the message.
     * 
     *                          API-Since: 10.0
     *                          Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("displayMessage:completionHandler:")
    public native void displayMessageCompletionHandler(@NotNull String message,
            @NotNull @ObjCBlock(name = "call_displayMessageCompletionHandler") Block_displayMessageCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native NEProvider init();

    /**
     * sleepWithCompletionHandler:
     * 
     * This function is called by the framework when the system is about to go to sleep. Subclass developers can
     * override this method to implement custom behavior such as closing connections or pausing some network activity.
     * 
     * @param completionHandler When the method is finished handling the sleep event it must execute this completion
     *                          handler.
     * 
     *                          API-Since: 9.0
     */
    @Generated
    @Selector("sleepWithCompletionHandler:")
    public native void sleepWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_sleepWithCompletionHandler") Block_sleepWithCompletionHandler completionHandler);

    /**
     * wake
     * 
     * This function is called by the framework immediately after the system wakes up from sleep. Subclass developers
     * can override this method to implement custom behavior such as re-establishing connections or resuming some
     * network activity.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("wake")
    public native void wake();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_displayMessageCompletionHandler {
        @Generated
        void call_displayMessageCompletionHandler(boolean success);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sleepWithCompletionHandler {
        @Generated
        void call_sleepWithCompletionHandler();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
