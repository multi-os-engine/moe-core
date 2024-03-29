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
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamekit.protocol.GKTurnBasedMatchmakerViewControllerDelegate;
import apple.uikit.UINavigationController;
import apple.uikit.UIViewController;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKTurnBasedMatchmakerViewController extends UINavigationController {
    static {
        NatJ.register();
    }

    @Generated
    protected GKTurnBasedMatchmakerViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKTurnBasedMatchmakerViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKTurnBasedMatchmakerViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public static native GKTurnBasedMatchmakerViewController new_objc();

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
    public native GKTurnBasedMatchmakerViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native GKTurnBasedMatchmakerViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithMatchRequest:")
    public native GKTurnBasedMatchmakerViewController initWithMatchRequest(@NotNull GKMatchRequest request);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native GKTurnBasedMatchmakerViewController initWithNavigationBarClassToolbarClass(
            @Nullable Class navigationBarClass, @Nullable Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native GKTurnBasedMatchmakerViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native GKTurnBasedMatchmakerViewController initWithRootViewController(
            @NotNull UIViewController rootViewController);

    @Generated
    @Selector("setShowExistingMatches:")
    public native void setShowExistingMatches(boolean value);

    @Generated
    @Selector("setTurnBasedMatchmakerDelegate:")
    public native void setTurnBasedMatchmakerDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) GKTurnBasedMatchmakerViewControllerDelegate value);

    @Generated
    public void setTurnBasedMatchmakerDelegate(
            @Nullable @Mapped(ObjCObjectMapper.class) GKTurnBasedMatchmakerViewControllerDelegate value) {
        Object __old = turnBasedMatchmakerDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTurnBasedMatchmakerDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("showExistingMatches")
    public native boolean showExistingMatches();

    @Nullable
    @Generated
    @Selector("turnBasedMatchmakerDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKTurnBasedMatchmakerViewControllerDelegate turnBasedMatchmakerDelegate();

    /**
     * This controls the mode of matchmaking to support in the UI (all, nearby only, automatch only, invite only).
     * Throws an exception if you can not set to the desired mode (due to restrictions)
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("matchmakingMode")
    @NInt
    public native long matchmakingMode();

    /**
     * This controls the mode of matchmaking to support in the UI (all, nearby only, automatch only, invite only).
     * Throws an exception if you can not set to the desired mode (due to restrictions)
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMatchmakingMode:")
    public native void setMatchmakingMode(@NInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
