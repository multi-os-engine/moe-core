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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.UITabBarControllerDelegate;
import apple.uikit.protocol.UITabBarDelegate;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * UITabBarController manages a button bar and transition view, for an application with multiple top-level modes.
 * 
 * To use in your application, add its view to the view hierarchy, then add top-level view controllers in order.
 * Most clients will not need to subclass UITabBarController.
 * 
 * If more than five view controllers are added to a tab bar controller, only the first four will display.
 * The rest will be accessible under an automatically generated More item.
 * 
 * UITabBarController is rotatable if all of its view controllers are rotatable.
 * 
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITabBarController extends UIViewController implements UITabBarDelegate, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UITabBarController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITabBarController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITabBarController allocWithZone(VoidPtr zone);

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
    public static native UITabBarController new_objc();

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
     * If non-nil, then the "More" view will include an "Edit" button that displays customization UI for the specified
     * controllers. By default, all view controllers are customizable.
     */
    @Nullable
    @Generated
    @Selector("customizableViewControllers")
    public native NSArray<? extends UIViewController> customizableViewControllers();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITabBarControllerDelegate delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native UITabBarController init();

    @Generated
    @Selector("initWithCoder:")
    public native UITabBarController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UITabBarController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * Returns the "More" navigation controller, creating it if it does not already exist.
     */
    @NotNull
    @Generated
    @Selector("moreNavigationController")
    public native UINavigationController moreNavigationController();

    @Generated
    @Selector("selectedIndex")
    @NUInt
    public native long selectedIndex();

    /**
     * This may return the "More" navigation controller if it exists.
     */
    @Nullable
    @Generated
    @Selector("selectedViewController")
    public native UIViewController selectedViewController();

    /**
     * If non-nil, then the "More" view will include an "Edit" button that displays customization UI for the specified
     * controllers. By default, all view controllers are customizable.
     */
    @Generated
    @Selector("setCustomizableViewControllers:")
    public native void setCustomizableViewControllers(@Nullable NSArray<? extends UIViewController> value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UITabBarControllerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UITabBarControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setSelectedIndex:")
    public native void setSelectedIndex(@NUInt long value);

    /**
     * This may return the "More" navigation controller if it exists.
     */
    @Generated
    @Selector("setSelectedViewController:")
    public native void setSelectedViewController_unsafe(@Nullable UIViewController value);

    /**
     * This may return the "More" navigation controller if it exists.
     */
    @Generated
    public void setSelectedViewController(@Nullable UIViewController value) {
        Object __old = selectedViewController();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setSelectedViewController_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setViewControllers:")
    public native void setViewControllers(@Nullable NSArray<? extends UIViewController> value);

    /**
     * If the number of view controllers is greater than the number displayable by a tab bar, a "More" navigation
     * controller will automatically be shown.
     * The "More" navigation controller will not be returned by -viewControllers, but it may be returned by
     * -selectedViewController.
     */
    @Generated
    @Selector("setViewControllers:animated:")
    public native void setViewControllersAnimated(@Nullable NSArray<? extends UIViewController> viewControllers,
            boolean animated);

    /**
     * Provided for -[UIActionSheet showFromTabBar:]. Attempting to modify the contents of the tab bar directly will
     * throw an exception.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("tabBar")
    public native UITabBar tabBar();

    @Generated
    @IsOptional
    @Selector("tabBar:didBeginCustomizingItems:")
    public native void tabBarDidBeginCustomizingItems(@NotNull UITabBar tabBar,
            @NotNull NSArray<? extends UITabBarItem> items);

    @Generated
    @IsOptional
    @Selector("tabBar:didEndCustomizingItems:changed:")
    public native void tabBarDidEndCustomizingItemsChanged(@NotNull UITabBar tabBar,
            @NotNull NSArray<? extends UITabBarItem> items, boolean changed);

    @Generated
    @IsOptional
    @Selector("tabBar:didSelectItem:")
    public native void tabBarDidSelectItem(@NotNull UITabBar tabBar, @NotNull UITabBarItem item);

    @Generated
    @IsOptional
    @Selector("tabBar:willBeginCustomizingItems:")
    public native void tabBarWillBeginCustomizingItems(@NotNull UITabBar tabBar,
            @NotNull NSArray<? extends UITabBarItem> items);

    @Generated
    @IsOptional
    @Selector("tabBar:willEndCustomizingItems:changed:")
    public native void tabBarWillEndCustomizingItemsChanged(@NotNull UITabBar tabBar,
            @NotNull NSArray<? extends UITabBarItem> items, boolean changed);

    @Nullable
    @Generated
    @Selector("viewControllers")
    public native NSArray<? extends UIViewController> viewControllers();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
