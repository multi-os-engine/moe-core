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

package apple.coremotion;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperationQueue;
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
 * API-Since: 8.0
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMAltimeter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CMAltimeter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMAltimeter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CMAltimeter allocWithZone(VoidPtr zone);

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

    /**
     * isRelativeAltitudeAvailable
     * 
     * Discussion:
     * Determines whether the device supports reporting relative altitude changes.
     */
    @Generated
    @Selector("isRelativeAltitudeAvailable")
    public static native boolean isRelativeAltitudeAvailable();

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
    public static native CMAltimeter new_objc();

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
    public native CMAltimeter init();

    /**
     * startRelativeAltitudeUpdatesToQueue:withHandler:
     * 
     * Discussion:
     * Starts relative altitude updates, providing data to the given handler on the given queue
     * every few seconds. The first altitude update will be established as the reference altitude
     * and have relative altitude 0.
     * 
     * Calls to start must be balanced with calls to stopRelativeAltitudeUpdates even if an error
     * is returned to the handler.
     */
    @Generated
    @Selector("startRelativeAltitudeUpdatesToQueue:withHandler:")
    public native void startRelativeAltitudeUpdatesToQueueWithHandler(@NotNull NSOperationQueue queue,
            @NotNull @ObjCBlock(name = "call_startRelativeAltitudeUpdatesToQueueWithHandler") Block_startRelativeAltitudeUpdatesToQueueWithHandler handler);

    /**
     * stopRelativeAltitudeUpdates
     * 
     * Discussion:
     * Stops relative altitude updates.
     */
    @Generated
    @Selector("stopRelativeAltitudeUpdates")
    public native void stopRelativeAltitudeUpdates();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startRelativeAltitudeUpdatesToQueueWithHandler {
        @Generated
        void call_startRelativeAltitudeUpdatesToQueueWithHandler(@Nullable CMAltitudeData altitudeData,
                @Nullable NSError error);
    }

    /**
     * authorizationStatus
     * 
     * Discussion:
     * Returns the current authorization status for altimeter.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

    /**
     * isAbsoluteAltitudeAvailable
     * 
     * Discussion:
     * Determines whether the device supports reporting the absolute altitude.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isAbsoluteAltitudeAvailable")
    public static native boolean isAbsoluteAltitudeAvailable();

    /**
     * startAbsoluteAltitudeUpdatesToQueue:withHandler:
     * 
     * Discussion:
     * Starts real-time absolute altitude updates, providing data to the given handler on the given queue, whenever a
     * change in elevation is detected.
     * 
     * Calls to start must be balanced with calls to stopAbsoluteAltitudeUpdates even if an error
     * is returned to the handler.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("startAbsoluteAltitudeUpdatesToQueue:withHandler:")
    public native void startAbsoluteAltitudeUpdatesToQueueWithHandler(@NotNull NSOperationQueue queue,
            @NotNull @ObjCBlock(name = "call_startAbsoluteAltitudeUpdatesToQueueWithHandler") Block_startAbsoluteAltitudeUpdatesToQueueWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startAbsoluteAltitudeUpdatesToQueueWithHandler {
        @Generated
        void call_startAbsoluteAltitudeUpdatesToQueueWithHandler(@Nullable CMAbsoluteAltitudeData altitudeData,
                @Nullable NSError error);
    }

    /**
     * stopAbsoluteAltitudeUpdates
     * 
     * Discussion:
     * Stops absolute altitude updates.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("stopAbsoluteAltitudeUpdates")
    public native void stopAbsoluteAltitudeUpdates();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
