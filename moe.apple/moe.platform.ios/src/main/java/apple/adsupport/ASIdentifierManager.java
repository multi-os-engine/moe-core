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

package apple.adsupport;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
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
 * The object that contains the advertising identifier.
 * 
 * API-Since: 6.0
 */
@Generated
@Library("AdSupport")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASIdentifierManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ASIdentifierManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASIdentifierManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASIdentifierManager allocWithZone(VoidPtr zone);

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
    public static native ASIdentifierManager new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The shared instance of the identifier manager class.
     * 
     * - Returns: Returns the shared instance of the AdSupport identifier manager
     * class.
     */
    @NotNull
    @Generated
    @Selector("sharedManager")
    public static native ASIdentifierManager sharedManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The UUID that is specific to a device.
     * 
     * The ``ASIdentifierManager/advertisingIdentifier`` is an alphanumeric string
     * that’s unique to each device, and which you only use for advertising. Use
     * this string for frequency capping, attribution, conversion events,
     * estimating the number of unique users, advertising fraud detection, and
     * debugging. On devices running iOS 14.5 and later and iPadOS 14.5 and later,
     * your app must request tracking authorization before it can get the
     * advertising identifier. For more information on getting the advertising
     * identifier, see ``AdSupport``.
     * 
     * The advertising identifier returns either a unique UUID, or all zeros. It
     * returns a unique UUID in the following cases:
     * 
     * - If Settings &gt; Privacy &gt; Tracking &gt; Allow Apps to Request to Track
     * is On, you’ve requested tracking authorization from the user by calling the
     * <doc://com.apple.documentation/documentation/apptrackingtransparency> APIs,
     * and received authorization, indicated by
     * <doc://com.apple.documentation/documentation/apptrackingtransparency/attrackingmanager/authorizationstatus/authorized>.
     * - If the user changes Settings &gt; Privacy &gt; Tracking &gt; Allow Apps to
     * Request to Track to Off after authorizing your app, and leaves the
     * permissions On for your app.
     * 
     * The advertising identifier returns all zeros
     * (`00000000-0000-0000-0000-000000000000`) in the following cases:
     * 
     * - In Simulator, regardless of any settings.
     * - When you call this API on a device running macOS.
     * - When you call this API in a compatible iPad or iPhone app running in visionOS.
     * - On devices running iOS 14.5 and later and iPadOS 14.5 and later, if you haven’t requested authorization using
     * the <doc://com.apple.documentation/documentation/apptrackingtransparency> framework.
     * - If you’ve requested authorization using the
     * <doc://com.apple.documentation/documentation/apptrackingtransparency> framework and the user declines, which
     * results in an authorization status of
     * <doc://com.apple.documentation/documentation/apptrackingtransparency/attrackingmanager/authorizationstatus/denied>.
     * - When a profile or configuration restricts access to the advertising identifier. For more information about
     * restrictions, see
     * <doc://com.apple.documentation/documentation/apptrackingtransparency/attrackingmanager/authorizationstatus/restricted>.
     * 
     * As a best practice, don’t store the advertising identifier value; access
     * ``ASIdentifierManager/advertisingIdentifier`` instead. Users can change
     * their authorization for tracking at any time in Settings &gt; Privacy &gt;
     * Tracking. Check your app’s authorization using the App Tracking Transparency
     * API
     * <doc://com.apple.documentation/documentation/apptrackingtransparency/attrackingmanager/3547038-trackingauthorizationstatus>
     * to determine the user’s intent.
     * 
     * For more information about asking users for permission to track, see [User
     * Privacy and Data
     * Use](https://developer.apple.com/app-store/user-privacy-and-data-use/).
     */
    @NotNull
    @Generated
    @Selector("advertisingIdentifier")
    public native NSUUID advertisingIdentifier();

    @Generated
    @Selector("init")
    public native ASIdentifierManager init();

    /**
     * A Boolean value that indicates whether the user has limited ad tracking
     * enabled.
     * 
     * - Warning: This property is deprecated. Functionality has been replaced by
     * the <doc://com.apple.documentation/documentation/apptrackingtransparency>
     * framework.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: This has been replaced by functionality in AppTrackingTransparency's ATTrackingManager class.
     */
    @Deprecated
    @Generated
    @Selector("isAdvertisingTrackingEnabled")
    public native boolean isAdvertisingTrackingEnabled();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
