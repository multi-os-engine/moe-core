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

package apple.gamekit;

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
 * Asynchronously shows a notification banner like the one used for Game Center’s “Welcome Back” message.
 * If a banner is already being displayed, additional banners will be shown in sequence. Use this to notify the user of
 * game events, high scores, completed achievements, etc.
 * 
 * API-Since: 5.0
 * Deprecated-Since: 17.0
 * Deprecated-Message: Use UNNotificationRequest or provide custom UI instead. This method will become a no-op in a
 * future version of GameKit.
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKNotificationBanner extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKNotificationBanner(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKNotificationBanner alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKNotificationBanner allocWithZone(VoidPtr zone);

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
    public static native GKNotificationBanner new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 16.1
     * Deprecated-Message: Use UNNotificationRequest or provide custom UI instead. This method will become a no-op in a
     * future version of GameKit.
     */
    @Deprecated
    @Generated
    @Selector("showBannerWithTitle:message:completionHandler:")
    public static native void showBannerWithTitleMessageCompletionHandler(@Nullable String title,
            @Nullable String message,
            @Nullable @ObjCBlock(name = "call_showBannerWithTitleMessageCompletionHandler") Block_showBannerWithTitleMessageCompletionHandler completionHandler);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 16.1
     * Deprecated-Message: Use UNNotificationRequest or provide custom UI instead. This method will become a no-op in a
     * future version of GameKit.
     */
    @Deprecated
    @Generated
    @Selector("showBannerWithTitle:message:duration:completionHandler:")
    public static native void showBannerWithTitleMessageDurationCompletionHandler(@Nullable String title,
            @Nullable String message, double duration,
            @Nullable @ObjCBlock(name = "call_showBannerWithTitleMessageDurationCompletionHandler") Block_showBannerWithTitleMessageDurationCompletionHandler completionHandler);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native GKNotificationBanner init();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_showBannerWithTitleMessageCompletionHandler {
        @Generated
        void call_showBannerWithTitleMessageCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_showBannerWithTitleMessageDurationCompletionHandler {
        @Generated
        void call_showBannerWithTitleMessageDurationCompletionHandler();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
