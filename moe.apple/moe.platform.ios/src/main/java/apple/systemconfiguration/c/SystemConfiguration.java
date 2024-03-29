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

package apple.systemconfiguration.c;

import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFRunLoopRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.struct.sockaddr;
import apple.systemconfiguration.opaque.SCNetworkReachabilityRef;
import apple.systemconfiguration.struct.SCNetworkReachabilityContext;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.opaque.dispatch_queue_t;

@Generated
@Library("SystemConfiguration")
@Runtime(CRuntime.class)
public final class SystemConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    private SystemConfiguration() {
    }

    /**
     * [@function] SCNetworkReachabilityCreateWithAddress
     * 
     * Creates a reference to the specified network
     * address. This reference can be used later to monitor the
     * reachability of the target host.
     * 
     * @param address The address of the desired host.
     * @return Returns a reference to the new immutable SCNetworkReachabilityRef.
     * 
     *         You must release the returned value.
     * 
     *         API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native SCNetworkReachabilityRef SCNetworkReachabilityCreateWithAddress(
            @Nullable CFAllocatorRef allocator,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") sockaddr address);

    /**
     * [@function] SCNetworkReachabilityCreateWithAddressPair
     * 
     * Creates a reference to the specified network
     * address. This reference can be used later to monitor the
     * reachability of the target host.
     * 
     * @param localAddress  The local address associated with a network
     *                      connection. If NULL, only the remote address is of interest.
     * @param remoteAddress The remote address associated with a network
     *                      connection. If NULL, only the local address is of interest.
     * @return Returns a reference to the new immutable SCNetworkReachabilityRef.
     * 
     *         You must release the returned value.
     * 
     *         API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native SCNetworkReachabilityRef SCNetworkReachabilityCreateWithAddressPair(
            @Nullable CFAllocatorRef allocator,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") sockaddr localAddress,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") sockaddr remoteAddress);

    /**
     * [@function] SCNetworkReachabilityCreateWithName
     * 
     * Creates a reference to the specified network host or node
     * name. This reference can be used later to monitor the
     * reachability of the target host.
     * 
     * @param nodename The node name of the desired host.
     *                 This name would be the same as that passed to the
     *                 gethostbyname(3) or getaddrinfo(3) functions.
     * @return Returns a reference to the new immutable SCNetworkReachabilityRef.
     * 
     *         You must release the returned value.
     * 
     *         API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native SCNetworkReachabilityRef SCNetworkReachabilityCreateWithName(
            @Nullable CFAllocatorRef allocator,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String nodename);

    /**
     * [@function] SCNetworkReachabilityGetTypeID
     * 
     * Returns the type identifier of all SCNetworkReachability
     * instances.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SCNetworkReachabilityGetTypeID();

    /**
     * [@function] SCNetworkReachabilityGetFlags
     * 
     * Determines if the given target is reachable using the
     * current network configuration.
     * 
     * @param target The network reference associated with the address or name
     *               to be checked for reachability.
     * @param flags  A pointer to memory that will be filled with the
     *               SCNetworkReachabilityFlags detailing the reachability
     *               of the specified target.
     * @return Returns TRUE if the network connection flags are valid;
     *         FALSE if the status could not be determined.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native byte SCNetworkReachabilityGetFlags(@NotNull SCNetworkReachabilityRef target,
            @NotNull IntPtr flags);

    /**
     * [@function] SCNetworkReachabilitySetCallback
     * 
     * Assigns a client to a target, which receives callbacks
     * when the reachability of the target changes.
     * 
     * @param target  The network reference associated with the address or
     *                name to be checked for reachability.
     * @param callout The function to be called when the reachability of the
     *                target changes. If NULL, the current client for the target
     *                is removed.
     * @param context The SCNetworkReachabilityContext associated with
     *                the callout. The value may be NULL.
     * @return Returns TRUE if the notification client was successfully set.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native byte SCNetworkReachabilitySetCallback(@NotNull SCNetworkReachabilityRef target,
            @Nullable @FunctionPtr(name = "call_SCNetworkReachabilitySetCallback") Function_SCNetworkReachabilitySetCallback callout,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") SCNetworkReachabilityContext context);

    /**
     * [@function] SCNetworkReachabilityScheduleWithRunLoop
     * 
     * Schedules the given target with the given run loop and mode.
     * 
     * @param target      The address or name that is set up for asynchronous
     *                    notifications. Must be non-NULL.
     * @param runLoop     A reference to a run loop on which the target should
     *                    be scheduled. Must be non-NULL.
     * @param runLoopMode The mode on which to schedule the target.
     *                    Must be non-NULL.
     * @return Returns TRUE if the target is scheduled successfully;
     *         FALSE otherwise.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native byte SCNetworkReachabilityScheduleWithRunLoop(@NotNull SCNetworkReachabilityRef target,
            @NotNull CFRunLoopRef runLoop, @NotNull CFStringRef runLoopMode);

    /**
     * [@function] SCNetworkReachabilityUnscheduleFromRunLoop
     * 
     * Unschedules the given target from the given run loop
     * and mode.
     * 
     * @param target      The address or name that is set up for asynchronous
     *                    notifications. Must be non-NULL.
     * @param runLoop     A reference to a run loop from which the target
     *                    should be unscheduled. Must be non-NULL.
     * @param runLoopMode The mode on which to unschedule the target.
     *                    Must be non-NULL.
     * @return Returns TRUE if the target is unscheduled successfully;
     *         FALSE otherwise.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native byte SCNetworkReachabilityUnscheduleFromRunLoop(@NotNull SCNetworkReachabilityRef target,
            @NotNull CFRunLoopRef runLoop, @NotNull CFStringRef runLoopMode);

    /**
     * [@function] SCNetworkReachabilitySetDispatchQueue
     * 
     * Schedule or unschedule callbacks for the given target on the given
     * dispatch queue.
     * 
     * @param target The address or name that is set up for asynchronous
     *               notifications. Must be non-NULL.
     * @param queue  A libdispatch queue to run the callback on.
     *               Pass NULL to unschedule callbacks.
     * @return Returns TRUE if the target is scheduled or unscheduled successfully;
     *         FALSE otherwise.
     * 
     *         API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native byte SCNetworkReachabilitySetDispatchQueue(@NotNull SCNetworkReachabilityRef target,
            @Nullable dispatch_queue_t queue);

    /**
     * [@function] SCCopyLastError
     * 
     * Returns the most recent status or error code generated
     * as the result of calling a System Configuration framework API.
     * 
     * @return Returns the last error encountered.
     * 
     *         API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFErrorRef SCCopyLastError();

    /**
     * [@function] SCError
     * 
     * Returns the most recent status or error code generated
     * as the result of calling a System Configuration framework API.
     * 
     * @return Returns the last error encountered.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int SCError();

    /**
     * [@function] SCErrorString
     * 
     * Returns a pointer to the message string
     * associated with the specified status or error
     * number.
     * 
     * @param status The status or error number.
     * @return Returns a pointer to the error message string.
     * 
     *         API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String SCErrorString(int status);

    /**
     * [@function] CNSetSupportedSSIDs
     * 
     * Provides Captive Network Support with an updated list of
     * SSIDs that this application will perform authentication on.
     * 
     * Captive Network Support suppresses showing the Web Sheet
     * for a captive Wi-Fi network if that network's SSID is in the
     * specified list.
     * 
     * On iOS, the registrations persist until the application is
     * removed from the device.
     * 
     * On MacOSX, the registrations persist as long as the application
     * is running.
     * 
     * @param ssidArray A CFArray of CFStrings of the SSIDs.
     * @return Returns TRUE if the operation succeeded, FALSE otherwise.
     * 
     *         API-Since: 4.0
     *         Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CNSetSupportedSSIDs(@NotNull CFArrayRef ssidArray);

    /**
     * [@function] CNMarkPortalOnline
     * 
     * Tells Captive Network Support that your application has
     * authenticated the device to the network. Captive Network Support
     * will notify the rest of the system that WiFi is now a viable
     * interface.
     * 
     * @param interfaceName Name of the interface that is now online.
     * @return Returns TRUE if the operation succeeded, FALSE otherwise.
     * 
     *         API-Since: 4.0
     *         Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CNMarkPortalOnline(@NotNull CFStringRef interfaceName);

    /**
     * [@function] CNMarkPortalOffline
     * 
     * Tells Captive Network Support that the device is not
     * authenticated on the given network interface.
     * 
     * @param interfaceName Name of the interface that is still captive.
     * @return Returns TRUE if the operation succeeded, FALSE otherwise.
     * 
     *         API-Since: 4.0
     *         Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CNMarkPortalOffline(@NotNull CFStringRef interfaceName);

    /**
     * [@function] CNCopySupportedInterfaces
     * 
     * copies a list of all interfaces CaptiveNetworkSupport is monitoring.
     * 
     * @return An array of CFStringRef- BSD interface names.
     *         Returns NULL if an error was encountered.
     *         You MUST release the returned value.
     * 
     *         API-Since: 4.1
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CNCopySupportedInterfaces();

    /**
     * [@function] CNCopyCurrentNetworkInfo
     * 
     * Returns the network information for the specified interface when the requesting application meets one of
     * following 4 requirements -.
     * 1. application is using CoreLocation API and has the user's authorization to access location.
     * 2. application has used the NEHotspotConfiguration API to configure the current Wi-Fi network.
     * 3. application has active VPN configurations installed.
     * 4. application has active NEDNSSettingsManager configurations installed.
     * 
     * - An application that is linked against iOS 12.0 SDK and above must have the
     * "com.apple.developer.networking.wifi-info" entitlement.
     * - An application will receive a pseudo network information if it is linked against an SDK before iOS 13.0, and if
     * it fails to meet any of the
     * above requirements.
     * - An application will receive NULL if it is linked against iOS 13.0 SDK (or newer), and if it fails to meet any
     * of the above requirements.
     * - On Mac Catalyst platform, to receive current Wi-Fi network information, an application must have
     * "com.apple.developer.networking.wifi-info"
     * entitlement and user's authorization to access location.
     * 
     * Network Information dictionary will contain the following keys, and values:
     * <pre>
     * 
     * @textblock
     *            Keys : Values
     *            =======================================
     *            kCNNetworkInfoKeySSIDData : CFDataRef
     *            kCNNetworkInfoKeySSID : CFStringRef
     *            kCNNetworkInfoKeyBSSID : CFStringRef
     * @/textblock
     *             </pre>
     * 
     *             Pseudo network information will contain "Wi-Fi" SSID and "00:00:00:00:00:00" BSSID. For China region,
     *             the SSID will be "WLAN".
     * 
     * @param interfaceName Name of the interface you are interested in
     * @return Network Information dictionary associated with the interface.
     *         Returns NULL if an error was encountered.
     *         You MUST release the returned value.
     * 
     *         API-Since: 4.1
     *         Deprecated-Since: 100000.0
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CFDictionaryRef CNCopyCurrentNetworkInfo(@NotNull CFStringRef interfaceName);

    /**
     * [@const] kCFErrorDomainSystemConfiguration
     * 
     * CFError domain associated with errors reported by
     * the SystemConfiguration.framework.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainSystemConfiguration();

    /**
     * [@constant] kCNNetworkInfoKeySSIDData
     * 
     * NetworkInfo Dictionary key for SSID in CFData format
     * 
     * API-Since: 4.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCNNetworkInfoKeySSIDData();

    /**
     * [@constant] kCNNetworkInfoKeySSID
     * 
     * NetworkInfo Dictionary key for SSID in CFString format
     * 
     * API-Since: 4.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCNNetworkInfoKeySSID();

    /**
     * [@constant] kCNNetworkInfoKeyBSSID
     * 
     * NetworkInfo Dictionary key for BSSID in CFString format
     * 
     * API-Since: 4.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCNNetworkInfoKeyBSSID();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_SCNetworkReachabilitySetCallback {
        @Generated
        void call_SCNetworkReachabilitySetCallback(@NotNull SCNetworkReachabilityRef arg0, int arg1,
                @Nullable VoidPtr arg2);
    }
}
