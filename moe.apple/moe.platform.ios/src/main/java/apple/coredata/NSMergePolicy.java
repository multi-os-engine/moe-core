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

package apple.coredata;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * API-Since: 5.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMergePolicy extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMergePolicy(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMergePolicy alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMergePolicy allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("errorMergePolicy")
    public static native NSMergePolicy errorMergePolicy();

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

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("mergeByPropertyObjectTrumpMergePolicy")
    public static native NSMergePolicy mergeByPropertyObjectTrumpMergePolicy();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("mergeByPropertyStoreTrumpMergePolicy")
    public static native NSMergePolicy mergeByPropertyStoreTrumpMergePolicy();

    @Generated
    @Owned
    @Selector("new")
    public static native NSMergePolicy new_objc();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("overwriteMergePolicy")
    public static native NSMergePolicy overwriteMergePolicy();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("rollbackMergePolicy")
    public static native NSMergePolicy rollbackMergePolicy();

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
    public native NSMergePolicy init();

    /**
     * In a subclass implementation of initWithMergeType:, you should invoke super with the NSMergePolicyType that is
     * closest to the behavior you want.
     * This will make it easier to use the superclass's implementation of -resolveConflicts:error:, and then customize
     * the results. You are strongly encouraged to do so.
     * Due to the complexity of merging to-many relationships, this class is designed with the expectation that you call
     * super as the base implemenation.
     */
    @Generated
    @Selector("initWithMergeType:")
    public native NSMergePolicy initWithMergeType(@NUInt long ty);

    @Generated
    @Selector("mergeType")
    @NUInt
    public native long mergeType();

    /**
     * In a subclass, you are strongly encouraged to override initWithMergeType: and customize the results from calling
     * super instead of performing your own actions from scratch.
     * Correctly merging to-many relationships is very challenging and any mistakes will cause permanent data corruption
     * in the form of dangling foreign keys.
     * Calls -resolveOptimisticLockingVersionConflicts:error: and then -resolveConstraintConflicts:error:
     */
    @Generated
    @Selector("resolveConflicts:error:")
    public native boolean resolveConflictsError(@NotNull NSArray<?> list,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Resolve uniqueness constraint violations for the list of failures.
     * Will be called after -resolveOptimisticLockingVersionConflicts:error:
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("resolveConstraintConflicts:error:")
    public native boolean resolveConstraintConflictsError(@NotNull NSArray<? extends NSConstraintConflict> list,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Resolve optimistic locking failures for the list of failures. In a subclass, you are strongly encouraged to
     * override initWithMergeType: and customize
     * the results from calling super instead of performing your own actions from scratch. Correctly merging to-many
     * relationships is very challenging and
     * any mistakes will cause permanent data corruption in the form of dangling foreign keys.
     * Will be called before -resolveConstraintConflicts:error:
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("resolveOptimisticLockingVersionConflicts:error:")
    public native boolean resolveOptimisticLockingVersionConflictsError(
            @NotNull NSArray<? extends NSMergeConflict> list,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
