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

package apple.externalaccessory;

import apple.NSObject;
import apple.externalaccessory.protocol.EAWiFiUnconfiguredAccessoryBrowserDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.uikit.UIViewController;
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
import apple.opaque.dispatch_queue_t;

/**
 * Interface for browsing unconfigured accessories
 * 
 * This class brokers access to the MFi Wireless Accessory Configuration (WAC) process.
 * This browser enables the application to scan for unconfigured accessories,
 * connect them to the user's Wi-Fi infrastructure and configure attributes of
 * the accessory.
 */
@Generated
@Library("ExternalAccessory")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EAWiFiUnconfiguredAccessoryBrowser extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected EAWiFiUnconfiguredAccessoryBrowser(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EAWiFiUnconfiguredAccessoryBrowser alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EAWiFiUnconfiguredAccessoryBrowser allocWithZone(VoidPtr zone);

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
    public static native EAWiFiUnconfiguredAccessoryBrowser new_objc();

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
     * Begin the configuration process for the chosen accessory
     * 
     * Stop the search for unconfigured accessories and begins the configuration process of the specified
     * EAWiFiUnconfiguredAccessory.
     * The user is guided through the configuration process via Apple UI. This process can take up to a few minutes to
     * complete.
     * The host application delegate will receive the didFinishConfiguringAccessory callback with an error that should
     * be
     * checked upon completion.
     * 
     * @param accessory      The accessory the application wishes to configure
     * @param viewController The UIViewController that will host the Apple guided setup UI in the host application.
     * 
     * 
     *                       API-Since: 8.0
     */
    @Generated
    @Selector("configureAccessory:withConfigurationUIOnViewController:")
    public native void configureAccessoryWithConfigurationUIOnViewController(
            @NotNull EAWiFiUnconfiguredAccessory accessory, @NotNull UIViewController viewController);

    /**
     * [@property] delegate
     * 
     * The delegate object that will receive the browser events.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native EAWiFiUnconfiguredAccessoryBrowserDelegate delegate();

    @Generated
    @Selector("init")
    public native EAWiFiUnconfiguredAccessoryBrowser init();

    /**
     * Designated initializer.
     * 
     * Initializes an instance of the EAWiFiUnconfiguredAccessoryBrowser class
     * which can be further configured based on the application's interests.
     * 
     * @param delegate The delegate that will receive the EAWiFiUnconfiguredAccessoryBrowserDelegate events.
     * @param queue    The dispatch queue the delegate would like to receive events on. If nil the events will be on the
     *                 main queue.
     * 
     * @return Instance object
     * 
     * 
     *         API-Since: 8.0
     */
    @Generated
    @Selector("initWithDelegate:queue:")
    public native EAWiFiUnconfiguredAccessoryBrowser initWithDelegateQueue(
            @Nullable @Mapped(ObjCObjectMapper.class) EAWiFiUnconfiguredAccessoryBrowserDelegate delegate,
            @Nullable dispatch_queue_t queue);

    /**
     * [@property] delegate
     * 
     * The delegate object that will receive the browser events.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) EAWiFiUnconfiguredAccessoryBrowserDelegate value);

    /**
     * [@property] delegate
     * 
     * The delegate object that will receive the browser events.
     */
    @Generated
    public void setDelegate(
            @Nullable @Mapped(ObjCObjectMapper.class) EAWiFiUnconfiguredAccessoryBrowserDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Start the search for unconfigured accessories
     * 
     * Starts a Wi-Fi scan for unconfigured accessories. This power and resource intensive process and must
     * only be used when actively searching for accessories. Scans should be stopped immediately when the
     * desired accessories have been located.
     * 
     * @param predicate The desired filter for unconfigured accessory results conforming to the
     *                  EAWiFiUnconfiguredAccessory protocol.
     * 
     * 
     *                  API-Since: 8.0
     */
    @Generated
    @Selector("startSearchingForUnconfiguredAccessoriesMatchingPredicate:")
    public native void startSearchingForUnconfiguredAccessoriesMatchingPredicate(@Nullable NSPredicate predicate);

    /**
     * Stop the search for unconfigured MFi Wireless Accessory Configuration accessories
     * 
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("stopSearchingForUnconfiguredAccessories")
    public native void stopSearchingForUnconfiguredAccessories();

    /**
     * [@property] unconfiguredAccessories
     * 
     * The set of discovered unconfigured accessories described by EAWiFiUnconfiguredAccessory objects.
     * This snapshot will only include objects matching the filter predicate defined when starting the search.
     */
    @NotNull
    @Generated
    @Selector("unconfiguredAccessories")
    public native NSSet<? extends EAWiFiUnconfiguredAccessory> unconfiguredAccessories();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
