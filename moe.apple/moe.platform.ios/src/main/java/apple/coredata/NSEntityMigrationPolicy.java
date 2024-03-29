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
 * API-Since: 3.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSEntityMigrationPolicy extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSEntityMigrationPolicy(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSEntityMigrationPolicy alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSEntityMigrationPolicy allocWithZone(VoidPtr zone);

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
    public static native NSEntityMigrationPolicy new_objc();

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
     * Invoked by the migration manager at the start of a given entity mapping. This is also the precursor to the
     * creation step.
     */
    @Generated
    @Selector("beginEntityMapping:manager:error:")
    public native boolean beginEntityMappingManagerError(@NotNull NSEntityMapping mapping,
            @NotNull NSMigrationManager manager, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Invoked by the migration manager on each source instance (as specified by the sourceExpression in the mapping) to
     * create the corresponding destination instance. The method also associates the source and destination instances by
     * calling NSMigrationManager's
     * associateSourceInstance:withDestinationInstance:forEntityMapping: method. Subclass implementations of this method
     * must be careful to
     * associate the source and destination instances as required if super is not called. A return value of NO indicates
     * an error.
     */
    @Generated
    @Selector("createDestinationInstancesForSourceInstance:entityMapping:manager:error:")
    public native boolean createDestinationInstancesForSourceInstanceEntityMappingManagerError(
            @NotNull NSManagedObject sInstance, @NotNull NSEntityMapping mapping, @NotNull NSMigrationManager manager,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Constructs the relationships between the newly-created destination instances. The association lookup methods on
     * the NSMigrationManager can be used to determine the appropriate relationship targets. A return value of NO
     * indicates an error.
     */
    @Generated
    @Selector("createRelationshipsForDestinationInstance:entityMapping:manager:error:")
    public native boolean createRelationshipsForDestinationInstanceEntityMappingManagerError(
            @NotNull NSManagedObject dInstance, @NotNull NSEntityMapping mapping, @NotNull NSMigrationManager manager,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Invoked by the migration manager at the end of a given entity mapping. This is also the end to the validation
     * step, which is the last step for migration.
     */
    @Generated
    @Selector("endEntityMapping:manager:error:")
    public native boolean endEntityMappingManagerError(@NotNull NSEntityMapping mapping,
            @NotNull NSMigrationManager manager, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Indicates the end of the creation step for the specified entity mapping, and the precursor to the next migration
     * step. Developers can override this method to set up or clean up information for further migration steps.
     */
    @Generated
    @Selector("endInstanceCreationForEntityMapping:manager:error:")
    public native boolean endInstanceCreationForEntityMappingManagerError(@NotNull NSEntityMapping mapping,
            @NotNull NSMigrationManager manager, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Indicates the end of the relationship creation step for the specified entity mapping. This method is invoked
     * after the createRelationshipsForDestinationInstance:entityMapping:manager:error: method, and can be used to clean
     * up state from the creation of relationships, or prepare state for the performance of custom validation.
     */
    @Generated
    @Selector("endRelationshipCreationForEntityMapping:manager:error:")
    public native boolean endRelationshipCreationForEntityMappingManagerError(@NotNull NSEntityMapping mapping,
            @NotNull NSMigrationManager manager, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSEntityMigrationPolicy init();

    /**
     * Invoked during the validation step of the entity migration policy, providing the option of performing custom
     * validation on migrated objects. (Implementors must manually obtain the collection of objects they are interested
     * in validating.)
     */
    @Generated
    @Selector("performCustomValidationForEntityMapping:manager:error:")
    public native boolean performCustomValidationForEntityMappingManagerError(@NotNull NSEntityMapping mapping,
            @NotNull NSMigrationManager manager, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
