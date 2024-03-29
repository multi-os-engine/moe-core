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
import apple.foundation.NSDate;
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
 * API-Since: 7.0
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMMotionActivityManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CMMotionActivityManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMMotionActivityManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CMMotionActivityManager allocWithZone(VoidPtr zone);

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
     * isActivityAvailable
     * 
     * Discussion:
     * Determines whether activity estimation is available.
     */
    @Generated
    @Selector("isActivityAvailable")
    public static native boolean isActivityAvailable();

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
    public static native CMMotionActivityManager new_objc();

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
    public native CMMotionActivityManager init();

    /**
     * queryActivityStartingFrom:to:toQueue:withHandler:
     * 
     * Discussion:
     * Queries for activity transitions that happened during the given time
     * range. The date range must be in the past. Data is only available
     * for the last seven days. The result is returned to the handler/queue
     * specified.
     * 
     * The first activity returned may have a startDate before start. This
     * activity represents what the state was at the start time.
     */
    @Generated
    @Selector("queryActivityStartingFromDate:toDate:toQueue:withHandler:")
    public native void queryActivityStartingFromDateToDateToQueueWithHandler(@NotNull NSDate start, @NotNull NSDate end,
            @NotNull NSOperationQueue queue,
            @NotNull @ObjCBlock(name = "call_queryActivityStartingFromDateToDateToQueueWithHandler") Block_queryActivityStartingFromDateToDateToQueueWithHandler handler);

    /**
     * startActivityUpdatesToQueue:withHandler
     * 
     * Discussion:
     * Start activity updates, providing data to the given handler through
     * the given queue. An update with the current activity will arrive
     * first. Then when the activity state changes the handler will be
     * called with the new activity.
     * 
     * You can only have one handler installed at a time, calling
     * startActivityUpdatesToQueue:withHandler: replaces the current
     * handler.
     * 
     * Updates are not delivered while the application is suspended, the
     * application may use
     * queryActivityStartingFromDate:toDate:toQueue:withHandler: to get
     * activities from the time when the application was suspended.
     */
    @Generated
    @Selector("startActivityUpdatesToQueue:withHandler:")
    public native void startActivityUpdatesToQueueWithHandler(@NotNull NSOperationQueue queue,
            @NotNull @ObjCBlock(name = "call_startActivityUpdatesToQueueWithHandler") Block_startActivityUpdatesToQueueWithHandler handler);

    /**
     * stopActivityUpdates
     * 
     * Discussion:
     * Stop delivering live updates.
     */
    @Generated
    @Selector("stopActivityUpdates")
    public native void stopActivityUpdates();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryActivityStartingFromDateToDateToQueueWithHandler {
        @Generated
        void call_queryActivityStartingFromDateToDateToQueueWithHandler(
                @Nullable NSArray<? extends CMMotionActivity> activities, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startActivityUpdatesToQueueWithHandler {
        @Generated
        void call_startActivityUpdatesToQueueWithHandler(@Nullable CMMotionActivity activity);
    }

    /**
     * authorizationStatus
     * 
     * Discussion:
     * Returns the current authorization status for activity.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
