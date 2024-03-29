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
 * CKDiscoverAllUserIdentitiesOperation
 * 
 * Finds all discoverable users in the device's contacts database. No Contacts access dialog will be displayed.
 * 
 * This operation scales linearly with the number of email addresses and phone numbers in the device's address book. It
 * may take some time to complete.
 * 
 * API-Since: 10.0
 * Deprecated-Since: 17.0
 * Deprecated-Message: No longer supported. Please see Sharing CloudKit Data with Other iCloud Users.
 */
@Deprecated
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKDiscoverAllUserIdentitiesOperation extends CKOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKDiscoverAllUserIdentitiesOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKDiscoverAllUserIdentitiesOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKDiscoverAllUserIdentitiesOperation allocWithZone(VoidPtr zone);

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
    public static native CKDiscoverAllUserIdentitiesOperation new_objc();

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
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Nullable
    @Generated
    @Selector("discoverAllUserIdentitiesCompletionBlock")
    @ObjCBlock(name = "call_discoverAllUserIdentitiesCompletionBlock_ret")
    public native Block_discoverAllUserIdentitiesCompletionBlock_ret discoverAllUserIdentitiesCompletionBlock();

    @Generated
    @Selector("init")
    public native CKDiscoverAllUserIdentitiesOperation init();

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Generated
    @Selector("setDiscoverAllUserIdentitiesCompletionBlock:")
    public native void setDiscoverAllUserIdentitiesCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setDiscoverAllUserIdentitiesCompletionBlock") Block_setDiscoverAllUserIdentitiesCompletionBlock value);

    /**
     * Called once for each successfully-discovered user identity from the device's address book.
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Generated
    @Selector("setUserIdentityDiscoveredBlock:")
    public native void setUserIdentityDiscoveredBlock(
            @Nullable @ObjCBlock(name = "call_setUserIdentityDiscoveredBlock") Block_setUserIdentityDiscoveredBlock value);

    /**
     * Called once for each successfully-discovered user identity from the device's address book.
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Nullable
    @Generated
    @Selector("userIdentityDiscoveredBlock")
    @ObjCBlock(name = "call_userIdentityDiscoveredBlock_ret")
    public native Block_userIdentityDiscoveredBlock_ret userIdentityDiscoveredBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverAllUserIdentitiesCompletionBlock_ret {
        @Generated
        void call_discoverAllUserIdentitiesCompletionBlock_ret(@Nullable NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDiscoverAllUserIdentitiesCompletionBlock {
        @Generated
        void call_setDiscoverAllUserIdentitiesCompletionBlock(@Nullable NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setUserIdentityDiscoveredBlock {
        @Generated
        void call_setUserIdentityDiscoveredBlock(@NotNull CKUserIdentity arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_userIdentityDiscoveredBlock_ret {
        @Generated
        void call_userIdentityDiscoveredBlock_ret(@NotNull CKUserIdentity arg0);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
