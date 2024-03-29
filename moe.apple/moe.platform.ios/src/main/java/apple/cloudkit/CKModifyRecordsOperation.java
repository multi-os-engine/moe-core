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

package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKModifyRecordsOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKModifyRecordsOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKModifyRecordsOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKModifyRecordsOperation allocWithZone(VoidPtr zone);

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
    public static native CKModifyRecordsOperation new_objc();

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
     * Determines whether the batch should fail atomically or not.
     * 
     * YES by default.
     * Server-side write atomicity is only enforced on zones that have @c CKRecordZoneCapabilityAtomic.
     * If @c isAtomic is YES, client-side checks are enforced regardless of the zone's capabilities. (For example, if a
     * record is malformed, and cannot be sent to the server, the client will forcibly fail all other
     * records-to-be-modified in that zone)
     */
    @Generated
    @Selector("atomic")
    public native boolean atomic();

    /**
     * This property is kept by the server to identify the last known request from this client.
     * Multiple requests from the client with the same change token will be ignored by the server.
     */
    @Nullable
    @Generated
    @Selector("clientChangeTokenData")
    public native NSData clientChangeTokenData();

    @Generated
    @Selector("init")
    public native CKModifyRecordsOperation init();

    @Generated
    @Selector("initWithRecordsToSave:recordIDsToDelete:")
    public native CKModifyRecordsOperation initWithRecordsToSaveRecordIDsToDelete(
            @Nullable NSArray<? extends CKRecord> records, @Nullable NSArray<? extends CKRecordID> recordIDs);

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of recordIDs to
     * errors keyed off of @c CKPartialErrorsByItemIDKey.
     * [@c] savedRecords, @c deletedRecordIDs and any @c CKPartialErrorsByItemIDKey errors are repeats of the data sent
     * back in previous @c perRecordSaveBlock and @c perRecordDeleteBlock invocations
     * This call happens as soon as the server has seen all record changes, and may be invoked while the server is
     * processing the side effects of those changes.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Nullable
    @Generated
    @Selector("modifyRecordsCompletionBlock")
    @ObjCBlock(name = "call_modifyRecordsCompletionBlock_ret")
    public native Block_modifyRecordsCompletionBlock_ret modifyRecordsCompletionBlock();

    /**
     * Called on success or failure for each record.
     * 
     * Will not be invoked if @c perRecordSaveBlock is set.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("perRecordCompletionBlock")
    @ObjCBlock(name = "call_perRecordCompletionBlock_ret")
    public native Block_perRecordCompletionBlock_ret perRecordCompletionBlock();

    /**
     * Indicates the progress for each record.
     * 
     * This method is called at least once with a progress of 1.0 for every record. Intermediate progress is only
     * reported for records that contain assets.
     * It is possible for progress to regress when a retry is automatically triggered.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Nullable
    @Generated
    @Selector("perRecordProgressBlock")
    @ObjCBlock(name = "call_perRecordProgressBlock_ret")
    public native Block_perRecordProgressBlock_ret perRecordProgressBlock();

    @Nullable
    @Generated
    @Selector("recordIDsToDelete")
    public native NSArray<? extends CKRecordID> recordIDsToDelete();

    @Nullable
    @Generated
    @Selector("recordsToSave")
    public native NSArray<? extends CKRecord> recordsToSave();

    /**
     * Determines what data is sent to the server and whether the save should succeed even if the record on the server
     * has changed.
     * 
     * The default value is @c CKRecordSaveIfServerRecordUnchanged, which is the recommended value for regular use.
     * A @c CKShare record is always treated as @c CKRecordSaveIfServerRecordUnchanged, regardless of the @c savePolicy
     * specified.
     */
    @Generated
    @Selector("savePolicy")
    @NInt
    public native long savePolicy();

    /**
     * Determines whether the batch should fail atomically or not.
     * 
     * YES by default.
     * Server-side write atomicity is only enforced on zones that have @c CKRecordZoneCapabilityAtomic.
     * If @c isAtomic is YES, client-side checks are enforced regardless of the zone's capabilities. (For example, if a
     * record is malformed, and cannot be sent to the server, the client will forcibly fail all other
     * records-to-be-modified in that zone)
     */
    @Generated
    @Selector("setAtomic:")
    public native void setAtomic(boolean value);

    /**
     * This property is kept by the server to identify the last known request from this client.
     * Multiple requests from the client with the same change token will be ignored by the server.
     */
    @Generated
    @Selector("setClientChangeTokenData:")
    public native void setClientChangeTokenData(@Nullable NSData value);

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of recordIDs to
     * errors keyed off of @c CKPartialErrorsByItemIDKey.
     * [@c] savedRecords, @c deletedRecordIDs and any @c CKPartialErrorsByItemIDKey errors are repeats of the data sent
     * back in previous @c perRecordSaveBlock and @c perRecordDeleteBlock invocations
     * This call happens as soon as the server has seen all record changes, and may be invoked while the server is
     * processing the side effects of those changes.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Generated
    @Selector("setModifyRecordsCompletionBlock:")
    public native void setModifyRecordsCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setModifyRecordsCompletionBlock") Block_setModifyRecordsCompletionBlock value);

    /**
     * Called on success or failure for each record.
     * 
     * Will not be invoked if @c perRecordSaveBlock is set.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @Selector("setPerRecordCompletionBlock:")
    public native void setPerRecordCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setPerRecordCompletionBlock") Block_setPerRecordCompletionBlock value);

    /**
     * Indicates the progress for each record.
     * 
     * This method is called at least once with a progress of 1.0 for every record. Intermediate progress is only
     * reported for records that contain assets.
     * It is possible for progress to regress when a retry is automatically triggered.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Generated
    @Selector("setPerRecordProgressBlock:")
    public native void setPerRecordProgressBlock(
            @Nullable @ObjCBlock(name = "call_setPerRecordProgressBlock") Block_setPerRecordProgressBlock value);

    @Generated
    @Selector("setRecordIDsToDelete:")
    public native void setRecordIDsToDelete(@Nullable NSArray<? extends CKRecordID> value);

    @Generated
    @Selector("setRecordsToSave:")
    public native void setRecordsToSave(@Nullable NSArray<? extends CKRecord> value);

    /**
     * Determines what data is sent to the server and whether the save should succeed even if the record on the server
     * has changed.
     * 
     * The default value is @c CKRecordSaveIfServerRecordUnchanged, which is the recommended value for regular use.
     * A @c CKShare record is always treated as @c CKRecordSaveIfServerRecordUnchanged, regardless of the @c savePolicy
     * specified.
     */
    @Generated
    @Selector("setSavePolicy:")
    public native void setSavePolicy(@NInt long value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modifyRecordsCompletionBlock_ret {
        @Generated
        void call_modifyRecordsCompletionBlock_ret(@Nullable NSArray<? extends CKRecord> arg0,
                @Nullable NSArray<? extends CKRecordID> arg1, @Nullable NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perRecordCompletionBlock_ret {
        @Generated
        void call_perRecordCompletionBlock_ret(@NotNull CKRecord arg0, @Nullable NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perRecordProgressBlock_ret {
        @Generated
        void call_perRecordProgressBlock_ret(@NotNull CKRecord arg0, double arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setModifyRecordsCompletionBlock {
        @Generated
        void call_setModifyRecordsCompletionBlock(@Nullable NSArray<? extends CKRecord> arg0,
                @Nullable NSArray<? extends CKRecordID> arg1, @Nullable NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerRecordCompletionBlock {
        @Generated
        void call_setPerRecordCompletionBlock(@NotNull CKRecord arg0, @Nullable NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerRecordProgressBlock {
        @Generated
        void call_setPerRecordProgressBlock(@NotNull CKRecord arg0, double arg1);
    }

    /**
     * Called on success or failure of a record deletion
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("perRecordDeleteBlock")
    @ObjCBlock(name = "call_perRecordDeleteBlock_ret")
    public native Block_perRecordDeleteBlock_ret perRecordDeleteBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perRecordDeleteBlock_ret {
        @Generated
        void call_perRecordDeleteBlock_ret(@NotNull CKRecordID arg0, @Nullable NSError arg1);
    }

    /**
     * Called on success or failure of a record save
     * 
     * Following a successful record save, this callback will be invoked with a nonnull @c record, and a nil @c error.
     * Following a save failure due to a per-item error (@c CKErrorServerRecordChanged, for example), this callback will
     * be invoked with a nil @c record, and a nonnull @c error
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("perRecordSaveBlock")
    @ObjCBlock(name = "call_perRecordSaveBlock_ret")
    public native Block_perRecordSaveBlock_ret perRecordSaveBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perRecordSaveBlock_ret {
        @Generated
        void call_perRecordSaveBlock_ret(@NotNull CKRecordID arg0, @Nullable CKRecord arg1, @Nullable NSError arg2);
    }

    /**
     * Called on success or failure of a record deletion
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPerRecordDeleteBlock:")
    public native void setPerRecordDeleteBlock(
            @Nullable @ObjCBlock(name = "call_setPerRecordDeleteBlock") Block_setPerRecordDeleteBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerRecordDeleteBlock {
        @Generated
        void call_setPerRecordDeleteBlock(@NotNull CKRecordID arg0, @Nullable NSError arg1);
    }

    /**
     * Called on success or failure of a record save
     * 
     * Following a successful record save, this callback will be invoked with a nonnull @c record, and a nil @c error.
     * Following a save failure due to a per-item error (@c CKErrorServerRecordChanged, for example), this callback will
     * be invoked with a nil @c record, and a nonnull @c error
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPerRecordSaveBlock:")
    public native void setPerRecordSaveBlock(
            @Nullable @ObjCBlock(name = "call_setPerRecordSaveBlock") Block_setPerRecordSaveBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerRecordSaveBlock {
        @Generated
        void call_setPerRecordSaveBlock(@NotNull CKRecordID arg0, @Nullable CKRecord arg1, @Nullable NSError arg2);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
