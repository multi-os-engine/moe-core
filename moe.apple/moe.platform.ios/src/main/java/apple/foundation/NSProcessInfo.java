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
import apple.foundation.struct.NSOperatingSystemVersion;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSProcessInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSProcessInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSProcessInfo alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSProcessInfo allocWithZone(VoidPtr zone);

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
    public static native NSProcessInfo new_objc();

    @NotNull
    @Generated
    @Selector("processInfo")
    public static native NSProcessInfo processInfo();

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
     * API-Since: 2.0
     */
    @Generated
    @Selector("activeProcessorCount")
    @NUInt
    public native long activeProcessorCount();

    @NotNull
    @Generated
    @Selector("arguments")
    public native NSArray<String> arguments();

    /**
     * Pass in an activity to this API, and a non-NULL, non-empty reason string. Indicate completion of the activity by
     * calling the corresponding endActivity: method with the result of the beginActivityWithOptions:reason: method. The
     * reason string is used for debugging.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("beginActivityWithOptions:reason:")
    @MappedReturn(ObjCObjectMapper.class)
    public native apple.protocol.NSObject beginActivityWithOptionsReason(long options, @NotNull String reason);

    /**
     * The argument to this method is the result of beginActivityWithOptions:reason:.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("endActivity:")
    public native void endActivity(@NotNull @Mapped(ObjCObjectMapper.class) apple.protocol.NSObject activity);

    @NotNull
    @Generated
    @Selector("environment")
    public native NSDictionary<String, String> environment();

    @NotNull
    @Generated
    @Selector("globallyUniqueString")
    public native String globallyUniqueString();

    @NotNull
    @Generated
    @Selector("hostName")
    public native String hostName();

    @Generated
    @Selector("init")
    public native NSProcessInfo init();

    /**
     * Retrieve the current setting of the system for the low power mode setting. On systems where the low power mode is
     * unknown or unsupported, the value returned from the lowPowerModeEnabled property is always NO
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("isLowPowerModeEnabled")
    public native boolean isLowPowerModeEnabled();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("isOperatingSystemAtLeastVersion:")
    public native boolean isOperatingSystemAtLeastVersion(@ByValue NSOperatingSystemVersion version);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: -operatingSystem always returns NSMACHOperatingSystem, use -operatingSystemVersion or
     * -isOperatingSystemAtLeastVersion: instead
     */
    @Generated
    @Deprecated
    @Selector("operatingSystem")
    @NUInt
    public native long operatingSystem();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: -operatingSystemName always returns NSMACHOperatingSystem, use -operatingSystemVersionString
     * instead
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("operatingSystemName")
    public native String operatingSystemName();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("operatingSystemVersion")
    @ByValue
    public native NSOperatingSystemVersion operatingSystemVersion();

    /**
     * Human readable, localized; appropriate for displaying to user or using in bug emails and such; NOT appropriate
     * for parsing
     */
    @NotNull
    @Generated
    @Selector("operatingSystemVersionString")
    public native String operatingSystemVersionString();

    /**
     * Synchronously perform an activity. The activity will be automatically ended after your block argument returns.
     * The reason string is used for debugging.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("performActivityWithOptions:reason:usingBlock:")
    public native void performActivityWithOptionsReasonUsingBlock(long options, @NotNull String reason,
            @NotNull @ObjCBlock(name = "call_performActivityWithOptionsReasonUsingBlock") Block_performActivityWithOptionsReasonUsingBlock block);

    /**
     * Perform an expiring background task, which obtains an expiring task assertion on iOS. The block contains any work
     * which needs to be completed as a background-priority task. The block will be scheduled on a system-provided
     * concurrent queue. After a system-specified time, the block will be called with the `expired` parameter set to
     * YES. The `expired` parameter will also be YES if the system decides to prematurely terminate a previous
     * non-expiration invocation of the block.
     * 
     * API-Since: 8.2
     */
    @Generated
    @Selector("performExpiringActivityWithReason:usingBlock:")
    public native void performExpiringActivityWithReasonUsingBlock(@NotNull String reason,
            @NotNull @ObjCBlock(name = "call_performExpiringActivityWithReasonUsingBlock") Block_performExpiringActivityWithReasonUsingBlock block);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("physicalMemory")
    public native long physicalMemory();

    @Generated
    @Selector("processIdentifier")
    public native int processIdentifier();

    @NotNull
    @Generated
    @Selector("processName")
    public native String processName();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("processorCount")
    @NUInt
    public native long processorCount();

    @Generated
    @Selector("setProcessName:")
    public native void setProcessName(@NotNull String value);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("systemUptime")
    public native double systemUptime();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performActivityWithOptionsReasonUsingBlock {
        @Generated
        void call_performActivityWithOptionsReasonUsingBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performExpiringActivityWithReasonUsingBlock {
        @Generated
        void call_performExpiringActivityWithReasonUsingBlock(boolean expired);
    }

    /**
     * Retrieve the current thermal state of the system. On systems where thermal state is unknown or unsupported, the
     * value returned from the thermalState property is always NSProcessInfoThermalStateNominal.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("thermalState")
    @NInt
    public native long thermalState();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("isMacCatalystApp")
    public native boolean isMacCatalystApp();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("isiOSAppOnMac")
    public native boolean isiOSAppOnMac();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
