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

package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
import org.moe.natj.general.ptr.BoolPtr;
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
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKStatisticsCollection extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HKStatisticsCollection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKStatisticsCollection alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKStatisticsCollection allocWithZone(VoidPtr zone);

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
    public static native HKStatisticsCollection new_objc();

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
     * enumerateStatisticsFromDate:toDate:withBlock:
     * 
     * Enumerates all statistics objects from startDate to endDate.
     * 
     * Statistics objects will be enumerated in chronological order. If there are no samples for an interval
     * between the start and end date, then the HKStatistics object for that interval will have nil quantities.
     */
    @Generated
    @Selector("enumerateStatisticsFromDate:toDate:withBlock:")
    public native void enumerateStatisticsFromDateToDateWithBlock(@NotNull NSDate startDate, @NotNull NSDate endDate,
            @NotNull @ObjCBlock(name = "call_enumerateStatisticsFromDateToDateWithBlock") Block_enumerateStatisticsFromDateToDateWithBlock block);

    @Generated
    @Selector("init")
    public native HKStatisticsCollection init();

    /**
     * sources
     * 
     * Returns all HKSources found in the contained HKStatistics objects.
     * 
     * Sources will be empty unless HKStatisticsOptionSeparateBySource is specified in the
     * HKStatisticsCollectionQuery options.
     */
    @NotNull
    @Generated
    @Selector("sources")
    public native NSSet<? extends HKSource> sources();

    /**
     * statistics
     * 
     * Returns a copy of the populated statistics objects.
     * 
     * The statistics objects are ordered chronologically.
     */
    @NotNull
    @Generated
    @Selector("statistics")
    public native NSArray<? extends HKStatistics> statistics();

    /**
     * statisticsForDate:
     * 
     * Returns the statistics object that this date is inside of
     * 
     * If there are no samples for the given date, an HKStatistics instance with nil quantities will be returned.
     */
    @Nullable
    @Generated
    @Selector("statisticsForDate:")
    public native HKStatistics statisticsForDate(@NotNull NSDate date);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateStatisticsFromDateToDateWithBlock {
        @Generated
        void call_enumerateStatisticsFromDateToDateWithBlock(@NotNull HKStatistics result, @NotNull BoolPtr stop);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
