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
import apple.foundation.NSDateComponents;
import apple.foundation.NSDateInterval;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSNumber;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKObserverQuery extends HKQuery {
    static {
        NatJ.register();
    }

    @Generated
    protected HKObserverQuery(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKObserverQuery alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKObserverQuery allocWithZone(VoidPtr zone);

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
    public static native HKObserverQuery new_objc();

    @NotNull
    @Generated
    @Selector("predicateForActivitySummariesBetweenStartDateComponents:endDateComponents:")
    public static native NSPredicate predicateForActivitySummariesBetweenStartDateComponentsEndDateComponents(
            @NotNull NSDateComponents startDateComponents, @NotNull NSDateComponents endDateComponents);

    @NotNull
    @Generated
    @Selector("predicateForActivitySummaryWithDateComponents:")
    public static native NSPredicate predicateForActivitySummaryWithDateComponents(
            @NotNull NSDateComponents dateComponents);

    @NotNull
    @Generated
    @Selector("predicateForCategorySamplesWithOperatorType:value:")
    public static native NSPredicate predicateForCategorySamplesWithOperatorTypeValue(@NUInt long operatorType,
            @NInt long value);

    @NotNull
    @Generated
    @Selector("predicateForObjectWithUUID:")
    public static native NSPredicate predicateForObjectWithUUID(@NotNull NSUUID UUID);

    @NotNull
    @Generated
    @Selector("predicateForObjectsFromDevices:")
    public static native NSPredicate predicateForObjectsFromDevices(@NotNull NSSet<? extends HKDevice> devices);

    @NotNull
    @Generated
    @Selector("predicateForObjectsFromSource:")
    public static native NSPredicate predicateForObjectsFromSource(@NotNull HKSource source);

    @NotNull
    @Generated
    @Selector("predicateForObjectsFromSourceRevisions:")
    public static native NSPredicate predicateForObjectsFromSourceRevisions(
            @NotNull NSSet<? extends HKSourceRevision> sourceRevisions);

    @NotNull
    @Generated
    @Selector("predicateForObjectsFromSources:")
    public static native NSPredicate predicateForObjectsFromSources(@NotNull NSSet<? extends HKSource> sources);

    @NotNull
    @Generated
    @Selector("predicateForObjectsFromWorkout:")
    public static native NSPredicate predicateForObjectsFromWorkout(@NotNull HKWorkout workout);

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithDeviceProperty:allowedValues:")
    public static native NSPredicate predicateForObjectsWithDevicePropertyAllowedValues(@NotNull String key,
            @NotNull NSSet<String> allowedValues);

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:")
    public static native NSPredicate predicateForObjectsWithMetadataKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:allowedValues:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyAllowedValues(@NotNull String key,
            @NotNull NSArray<?> allowedValues);

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithMetadataKey:operatorType:value:")
    public static native NSPredicate predicateForObjectsWithMetadataKeyOperatorTypeValue(@NotNull String key,
            @NUInt long operatorType, @NotNull @Mapped(ObjCObjectMapper.class) Object value);

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithNoCorrelation")
    public static native NSPredicate predicateForObjectsWithNoCorrelation();

    @NotNull
    @Generated
    @Selector("predicateForObjectsWithUUIDs:")
    public static native NSPredicate predicateForObjectsWithUUIDs(@NotNull NSSet<? extends NSUUID> UUIDs);

    @NotNull
    @Generated
    @Selector("predicateForQuantitySamplesWithOperatorType:quantity:")
    public static native NSPredicate predicateForQuantitySamplesWithOperatorTypeQuantity(@NUInt long operatorType,
            @NotNull HKQuantity quantity);

    @NotNull
    @Generated
    @Selector("predicateForSamplesWithStartDate:endDate:options:")
    public static native NSPredicate predicateForSamplesWithStartDateEndDateOptions(@Nullable NSDate startDate,
            @Nullable NSDate endDate, @NUInt long options);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:duration:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalDistance:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalDistance(@NUInt long operatorType,
            @NotNull HKQuantity totalDistance);

    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalEnergyBurned:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalEnergyBurned(@NUInt long operatorType,
            @NotNull HKQuantity totalEnergyBurned);

    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalSwimmingStrokeCount:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalSwimmingStrokeCount(
            @NUInt long operatorType, @NotNull HKQuantity totalSwimmingStrokeCount);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithWorkoutActivityType:")
    public static native NSPredicate predicateForWorkoutsWithWorkoutActivityType(@NUInt long workoutActivityType);

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
    public native HKObserverQuery init();

    @NotNull
    @Deprecated
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:totalFlightsClimbed:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeTotalFlightsClimbed(@NUInt long operatorType,
            @NotNull HKQuantity totalFlightsClimbed);

    @NotNull
    @Generated
    @Selector("predicateForClinicalRecordsFromSource:FHIRResourceType:identifier:")
    public static native NSPredicate predicateForClinicalRecordsFromSourceFHIRResourceTypeIdentifier(
            @NotNull HKSource source, @NotNull String resourceType, @NotNull String identifier);

    @NotNull
    @Generated
    @Selector("predicateForClinicalRecordsWithFHIRResourceType:")
    public static native NSPredicate predicateForClinicalRecordsWithFHIRResourceType(@NotNull String resourceType);

    /**
     * initWithSampleType:predicate:updateHandler:
     * 
     * This method installs a handler that is called when a sample type has a new sample added.
     * 
     * If you have subscribed to background updates you must call the passed completion block
     * once you have processed data from this notification. Otherwise the system will continue
     * to notify you of this data.
     */
    @Generated
    @Selector("initWithSampleType:predicate:updateHandler:")
    public native HKObserverQuery initWithSampleTypePredicateUpdateHandler(@NotNull HKSampleType sampleType,
            @Nullable NSPredicate predicate,
            @NotNull @ObjCBlock(name = "call_initWithSampleTypePredicateUpdateHandler") Block_initWithSampleTypePredicateUpdateHandler updateHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithSampleTypePredicateUpdateHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_initWithSampleTypePredicateUpdateHandler {
            @Generated
            void call_Block_initWithSampleTypePredicateUpdateHandler();
        }

        @Generated
        void call_initWithSampleTypePredicateUpdateHandler(@NotNull HKObserverQuery query,
                @NotNull @ObjCBlock(name = "call_Block_initWithSampleTypePredicateUpdateHandler") Block_Block_initWithSampleTypePredicateUpdateHandler completionHandler,
                @Nullable NSError error);
    }

    @NotNull
    @Generated
    @Selector("predicateForElectrocardiogramsWithClassification:")
    public static native NSPredicate predicateForElectrocardiogramsWithClassification(@NInt long classification);

    @NotNull
    @Generated
    @Selector("predicateForElectrocardiogramsWithSymptomsStatus:")
    public static native NSPredicate predicateForElectrocardiogramsWithSymptomsStatus(@NInt long symptomsStatus);

    @NotNull
    @Generated
    @Selector("predicateForObjectsAssociatedWithElectrocardiogram:")
    public static native NSPredicate predicateForObjectsAssociatedWithElectrocardiogram(
            @NotNull HKElectrocardiogram electrocardiogram);

    /**
     * initWithQueryDescriptors:updateHandler:
     * 
     * This method installs a handler that is called when a sample matching the query descriptors is added.
     * 
     * If you have subscribed to background updates you must call the passed completion block
     * once you have processed data from this notification. Otherwise the system will continue
     * to notify you of this data.
     * 
     * @param queryDescriptors An array of query descriptors that describes the sample types and predicates for
     *                         which you are interested in getting notified.
     * 
     *                         API-Since: 15.0
     */
    @Generated
    @Selector("initWithQueryDescriptors:updateHandler:")
    public native HKObserverQuery initWithQueryDescriptorsUpdateHandler(
            @NotNull NSArray<? extends HKQueryDescriptor> queryDescriptors,
            @NotNull @ObjCBlock(name = "call_initWithQueryDescriptorsUpdateHandler") Block_initWithQueryDescriptorsUpdateHandler updateHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithQueryDescriptorsUpdateHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_initWithQueryDescriptorsUpdateHandler {
            @Generated
            void call_Block_initWithQueryDescriptorsUpdateHandler();
        }

        @Generated
        void call_initWithQueryDescriptorsUpdateHandler(@NotNull HKObserverQuery query,
                @Nullable NSSet<? extends HKSampleType> sampleTypesAdded,
                @NotNull @ObjCBlock(name = "call_Block_initWithQueryDescriptorsUpdateHandler") Block_Block_initWithQueryDescriptorsUpdateHandler completionHandler,
                @Nullable NSError error);
    }

    @NotNull
    @Generated
    @Selector("predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval:")
    public static native NSPredicate predicateForVerifiableClinicalRecordsWithRelevantDateWithinDateInterval(
            @NotNull NSDateInterval dateInterval);

    @NotNull
    @Generated
    @Selector("predicateForCategorySamplesEqualToValues:")
    public static native NSPredicate predicateForCategorySamplesEqualToValues(
            @NotNull NSSet<? extends NSNumber> values);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:duration:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeDuration(@NUInt long operatorType,
            double duration);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:averageQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeAverageQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity averageQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:maximumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeMaximumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity maximumQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:minimumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeMinimumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity minimumQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithOperatorType:quantityType:sumQuantity:")
    public static native NSPredicate predicateForWorkoutActivitiesWithOperatorTypeQuantityTypeSumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity sumQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithStartDate:endDate:options:")
    public static native NSPredicate predicateForWorkoutActivitiesWithStartDateEndDateOptions(
            @Nullable NSDate startDate, @Nullable NSDate endDate, @NUInt long options);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutActivitiesWithWorkoutActivityType:")
    public static native NSPredicate predicateForWorkoutActivitiesWithWorkoutActivityType(
            @NUInt long workoutActivityType);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithActivityPredicate:")
    public static native NSPredicate predicateForWorkoutsWithActivityPredicate(@NotNull NSPredicate activityPredicate);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:averageQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeAverageQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity averageQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:maximumQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeMaximumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity maximumQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:minimumQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeMinimumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity minimumQuantity);

    @NotNull
    @Generated
    @Selector("predicateForWorkoutsWithOperatorType:quantityType:sumQuantity:")
    public static native NSPredicate predicateForWorkoutsWithOperatorTypeQuantityTypeSumQuantity(
            @NUInt long operatorType, @NotNull HKQuantityType quantityType, @NotNull HKQuantity sumQuantity);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
