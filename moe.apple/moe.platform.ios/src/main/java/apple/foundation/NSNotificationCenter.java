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
 * Notification Center ***************
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNotificationCenter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSNotificationCenter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSNotificationCenter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSNotificationCenter allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("defaultCenter")
    public static native NSNotificationCenter defaultCenter();

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
    public static native NSNotificationCenter new_objc();

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
    @Selector("addObserver:selector:name:object:")
    public native void addObserverSelectorNameObject(@NotNull @Mapped(ObjCObjectMapper.class) Object observer,
            @NotNull SEL aSelector, @Nullable String aName, @Nullable @Mapped(ObjCObjectMapper.class) Object anObject);

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("addObserverForName:object:queue:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    public native apple.protocol.NSObject addObserverForNameObjectQueueUsingBlock(@Nullable String name,
            @Nullable @Mapped(ObjCObjectMapper.class) Object obj, @Nullable NSOperationQueue queue,
            @NotNull @ObjCBlock(name = "call_addObserverForNameObjectQueueUsingBlock") Block_addObserverForNameObjectQueueUsingBlock block);

    @Generated
    @Selector("init")
    public native NSNotificationCenter init();

    @Generated
    @Selector("postNotification:")
    public native void postNotification(@NotNull NSNotification notification);

    @Generated
    @Selector("postNotificationName:object:")
    public native void postNotificationNameObject(@NotNull String aName,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anObject);

    @Generated
    @Selector("postNotificationName:object:userInfo:")
    public native void postNotificationNameObjectUserInfo(@NotNull String aName,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anObject, @Nullable NSDictionary<?, ?> aUserInfo);

    @Generated
    @Selector("removeObserver:")
    public native void removeObserver(@NotNull @Mapped(ObjCObjectMapper.class) Object observer);

    @Generated
    @Selector("removeObserver:name:object:")
    public native void removeObserverNameObject(@NotNull @Mapped(ObjCObjectMapper.class) Object observer,
            @Nullable String aName, @Nullable @Mapped(ObjCObjectMapper.class) Object anObject);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addObserverForNameObjectQueueUsingBlock {
        @Generated
        void call_addObserverForNameObjectQueueUsingBlock(@NotNull NSNotification notification);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
