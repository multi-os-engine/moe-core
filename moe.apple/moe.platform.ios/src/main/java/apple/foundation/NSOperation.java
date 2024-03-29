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

package apple.foundation;

import apple.NSObject;
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
 * API-Since: 2.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOperation extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSOperation allocWithZone(VoidPtr zone);

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
    public static native NSOperation new_objc();

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
    @Selector("addDependency:")
    public native void addDependency(@NotNull NSOperation op);

    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("completionBlock")
    @ObjCBlock(name = "call_completionBlock_ret")
    public native Block_completionBlock_ret completionBlock();

    @NotNull
    @Generated
    @Selector("dependencies")
    public native NSArray<? extends NSOperation> dependencies();

    @Generated
    @Selector("init")
    public native NSOperation init();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("isAsynchronous")
    public native boolean isAsynchronous();

    @Generated
    @Selector("isCancelled")
    public native boolean isCancelled();

    /**
     * To be deprecated; use and override 'asynchronous' below
     */
    @Generated
    @Selector("isConcurrent")
    public native boolean isConcurrent();

    @Generated
    @Selector("isExecuting")
    public native boolean isExecuting();

    @Generated
    @Selector("isFinished")
    public native boolean isFinished();

    @Generated
    @Selector("isReady")
    public native boolean isReady();

    @Generated
    @Selector("main")
    public native void main();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("qualityOfService")
    @NInt
    public native long qualityOfService();

    @Generated
    @Selector("queuePriority")
    @NInt
    public native long queuePriority();

    @Generated
    @Selector("removeDependency:")
    public native void removeDependency(@NotNull NSOperation op);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("setCompletionBlock:")
    public native void setCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setCompletionBlock") Block_setCompletionBlock value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setQualityOfService:")
    public native void setQualityOfService(@NInt long value);

    @Generated
    @Selector("setQueuePriority:")
    public native void setQueuePriority(@NInt long value);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Not supported
     */
    @Generated
    @Deprecated
    @Selector("setThreadPriority:")
    public native void setThreadPriority(double value);

    @Generated
    @Selector("start")
    public native void start();

    /**
     * API-Since: 4.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Not supported
     */
    @Generated
    @Deprecated
    @Selector("threadPriority")
    public native double threadPriority();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("waitUntilFinished")
    public native void waitUntilFinished();

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
