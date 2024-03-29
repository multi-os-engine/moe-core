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

package apple.gameplaykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSFastEnumeration;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A collection of GKGoals or GKBehaviors with weights that can be applied to a GKAgent
 * The sub-goals or sub-behaviors are summed to produce a total force to be applied to an agent
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKBehavior extends NSObject implements NSFastEnumeration, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected GKBehavior(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKBehavior alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKBehavior allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Creates a behavior with a single goal and weight
     */
    @Generated
    @Selector("behaviorWithGoal:weight:")
    public static native GKBehavior behaviorWithGoalWeight(@NotNull GKGoal goal, float weight);

    /**
     * Creates a behavior with an array of goals. All weights are set to 1.0f
     */
    @Generated
    @Selector("behaviorWithGoals:")
    public static native GKBehavior behaviorWithGoals(@NotNull NSArray<? extends GKGoal> goals);

    /**
     * Creates a behavior with two associated arrays of goals and weights
     */
    @Generated
    @Selector("behaviorWithGoals:andWeights:")
    public static native GKBehavior behaviorWithGoalsAndWeights(@NotNull NSArray<? extends GKGoal> goals,
            @NotNull NSArray<? extends NSNumber> weights);

    /**
     * Creates a behavior with a dictionary of goal/weight pairs
     */
    @Generated
    @Selector("behaviorWithWeightedGoals:")
    public static native GKBehavior behaviorWithWeightedGoals(
            @NotNull NSDictionary<? extends GKGoal, ? extends NSNumber> weightedGoals);

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
    public static native GKBehavior new_objc();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("countByEnumeratingWithState:objects:count:")
    @NUInt
    public native long countByEnumeratingWithStateObjectsCount(@NotNull VoidPtr state,
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffer, @NUInt long len);

    /**
     * The number of GKGoals in this behavior
     */
    @Generated
    @Selector("goalCount")
    @NInt
    public native long goalCount();

    @Generated
    @Selector("init")
    public native GKBehavior init();

    /**
     * Supports getting goals via a [int] subscript.
     */
    @NotNull
    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native GKGoal objectAtIndexedSubscript(@NUInt long idx);

    /**
     * Supports getting a weight via a [goal] subscript.
     */
    @Nullable
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native NSNumber objectForKeyedSubscript(@NotNull GKGoal goal);

    /**
     * Removes all the goals on the behavior.
     */
    @Generated
    @Selector("removeAllGoals")
    public native void removeAllGoals();

    /**
     * Remove the indicated goal from this behavior.
     * 
     * @param goal the goal to be removed
     */
    @Generated
    @Selector("removeGoal:")
    public native void removeGoal(@NotNull GKGoal goal);

    /**
     * Supports setting a weight via a [goal] subscript.
     */
    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(@NotNull NSNumber weight, @NotNull GKGoal goal);

    /**
     * Adds a new goal or changes the weight of the existing goal in this behavior.
     * If the goal does not exist in this behavior, it is added.
     * 
     * @param weight the weight for this goal
     * @param goal   the goal who's weight to change
     */
    @Generated
    @Selector("setWeight:forGoal:")
    public native void setWeightForGoal(float weight, @NotNull GKGoal goal);

    /**
     * Gets the current weight for a given goal.
     * 
     * @return the weight of the goal, or 0 if there is no such goal on this behavior
     */
    @Generated
    @Selector("weightForGoal:")
    public native float weightForGoal(@NotNull GKGoal goal);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
