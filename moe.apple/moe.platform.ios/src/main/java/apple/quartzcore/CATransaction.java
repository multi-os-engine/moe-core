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

package apple.quartzcore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * API-Since: 2.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CATransaction extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CATransaction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CATransaction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CATransaction allocWithZone(VoidPtr zone);

    /**
     * Accessors for the "animationDuration" per-thread transaction
     * property. Defines the default duration of animations added to
     * layers. Defaults to 1/4s.
     */
    @Generated
    @Selector("animationDuration")
    public static native double animationDuration();

    /**
     * Accessors for the "animationTimingFunction" per-thread transaction
     * property. The default value is nil, when set to a non-nil value any
     * animations added to layers will have this value set as their
     * "timingFunction" property. Added in Mac OS X 10.6.
     */
    @Nullable
    @Generated
    @Selector("animationTimingFunction")
    public static native CAMediaTimingFunction animationTimingFunction();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Begin a new transaction for the current thread; nests.
     */
    @Generated
    @Selector("begin")
    public static native void begin();

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

    /**
     * Commit all changes made during the current transaction. Raises an
     * exception if no current transaction exists.
     */
    @Generated
    @Selector("commit")
    public static native void commit();

    @Nullable
    @Generated
    @Selector("completionBlock")
    @ObjCBlock(name = "call_completionBlock_ret")
    public static native Block_completionBlock_ret completionBlock();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Accessors for the "disableActions" per-thread transaction property.
     * Defines whether or not the layer's -actionForKey: method is used to
     * find an action (aka. implicit animation) for each layer property
     * change. Defaults to NO, i.e. implicit animations enabled.
     */
    @Generated
    @Selector("disableActions")
    public static native boolean disableActions();

    /**
     * Commits any extant implicit transaction. Will delay the actual commit
     * until any nested explicit transactions have completed.
     */
    @Generated
    @Selector("flush")
    public static native void flush();

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
     * Methods to lock and unlock the global lock. Layer methods automatically
     * obtain this while modifying shared state, but callers may need to lock
     * around multiple operations to ensure consistency. The lock is a
     * recursive spin-lock (i.e shouldn't be held for extended periods).
     */
    @Generated
    @Selector("lock")
    public static native void lock();

    @Generated
    @Owned
    @Selector("new")
    public static native CATransaction new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration(double dur);

    @Generated
    @Selector("setAnimationTimingFunction:")
    public static native void setAnimationTimingFunction(@Nullable CAMediaTimingFunction function);

    @Generated
    @Selector("setCompletionBlock:")
    public static native void setCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setCompletionBlock") Block_setCompletionBlock block);

    @Generated
    @Selector("setDisableActions:")
    public static native void setDisableActions(boolean flag);

    @Generated
    @Selector("setValue:forKey:")
    public static native void setValueForKey_static(@Nullable @Mapped(ObjCObjectMapper.class) Object anObject,
            @NotNull String key);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unlock")
    public static native void unlock();

    /**
     * Associate arbitrary keyed-data with the current transaction (i.e.
     * with the current thread).
     * 
     * Nested transactions have nested data scope, i.e. reading a key
     * searches for the innermost scope that has set it, setting a key
     * always sets it in the innermost scope.
     * 
     * Currently supported transaction properties include:
     * "animationDuration", "animationTimingFunction", "completionBlock",
     * "disableActions". See method declarations above for descriptions of
     * each property.
     * 
     * Attempting to set a property to a type other than its document type
     * has an undefined result.
     */
    @Nullable
    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object valueForKey_static(@NotNull String key);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native CATransaction init();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionBlock_ret {
        @Generated
        void call_completionBlock_ret();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionBlock {
        @Generated
        void call_setCompletionBlock();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
