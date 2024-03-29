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
import apple.uikit.protocol.UISplitViewControllerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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

/**
 * API-Since: 3.2
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISplitViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected UISplitViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISplitViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UISplitViewController allocWithZone(VoidPtr zone);

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
    public static native UISplitViewController new_objc();

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

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UISplitViewControllerDelegate delegate();

    /**
     * The actual current displayMode of the split view controller. This will never return
     * `UISplitViewControllerDisplayModeAutomatic`.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("displayMode")
    @NInt
    public native long displayMode();

    /**
     * A system bar button item whose action will change the displayMode property depending on the result of
     * targetDisplayModeForActionInSplitViewController:. When inserted into the navigation bar of the secondary view
     * controller it will change its appearance to match its target display mode. When the target displayMode is
     * PrimaryHidden, this will appear as a fullscreen button, for AllVisible or PrimaryOverlay it will appear as a Back
     * button, and when it won't cause any action it will become hidden.
     * Not supported for column-style UISplitViewController
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("displayModeButtonItem")
    public native UIBarButtonItem displayModeButtonItem();

    @Generated
    @Selector("init")
    public native UISplitViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UISplitViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UISplitViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * Specifies whether the split view controller has collapsed its primary and secondary view controllers together
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isCollapsed")
    public native boolean isCollapsed();

    /**
     * default: UISplitViewControllerAutomaticDimension
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("maximumPrimaryColumnWidth")
    @NFloat
    public native double maximumPrimaryColumnWidth();

    /**
     * default: UISplitViewControllerAutomaticDimension
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("minimumPrimaryColumnWidth")
    @NFloat
    public native double minimumPrimaryColumnWidth();

    /**
     * An animatable property that controls how the primary view controller is hidden and displayed. A value of
     * `UISplitViewControllerDisplayModeAutomatic` specifies the default behavior split view controller, which on an
     * iPad, corresponds to an overlay mode in portrait and a side-by-side mode in landscape.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("preferredDisplayMode")
    @NInt
    public native long preferredDisplayMode();

    /**
     * default: UISplitViewControllerAutomaticDimension
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("preferredPrimaryColumnWidthFraction")
    @NFloat
    public native double preferredPrimaryColumnWidthFraction();

    /**
     * If 'YES', hidden view can be presented and dismissed via a swipe gesture. Defaults to 'YES'.
     * 
     * API-Since: 5.1
     */
    @Generated
    @Selector("presentsWithGesture")
    public native boolean presentsWithGesture();

    /**
     * The current primary view controller's column width.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("primaryColumnWidth")
    @NFloat
    public native double primaryColumnWidth();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) UISplitViewControllerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UISplitViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * default: UISplitViewControllerAutomaticDimension
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setMaximumPrimaryColumnWidth:")
    public native void setMaximumPrimaryColumnWidth(@NFloat double value);

    /**
     * default: UISplitViewControllerAutomaticDimension
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setMinimumPrimaryColumnWidth:")
    public native void setMinimumPrimaryColumnWidth(@NFloat double value);

    /**
     * An animatable property that controls how the primary view controller is hidden and displayed. A value of
     * `UISplitViewControllerDisplayModeAutomatic` specifies the default behavior split view controller, which on an
     * iPad, corresponds to an overlay mode in portrait and a side-by-side mode in landscape.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPreferredDisplayMode:")
    public native void setPreferredDisplayMode(@NInt long value);

    /**
     * default: UISplitViewControllerAutomaticDimension
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPreferredPrimaryColumnWidthFraction:")
    public native void setPreferredPrimaryColumnWidthFraction(@NFloat double value);

    /**
     * If 'YES', hidden view can be presented and dismissed via a swipe gesture. Defaults to 'YES'.
     * 
     * API-Since: 5.1
     */
    @Generated
    @Selector("setPresentsWithGesture:")
    public native void setPresentsWithGesture(boolean value);

    /**
     * -setViewController:forColumn:/-viewControllerForColumn: recommended for column-style UISplitViewController
     */
    @Generated
    @Selector("setViewControllers:")
    public native void setViewControllers(@NotNull NSArray<? extends UIViewController> value);

    /**
     * In a horizontally-regular environment this will set the detail view controller unless it provided an
     * implementation for showViewController:sender: in which case it will be called. In a horizontally-compact
     * environment the master view controller or detail view controller is sent the showViewController:sender: message.
     * If neither one of them provide an implementation for this method then it will fall back to a full screen
     * presentation.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("showDetailViewController:sender:")
    public native void showDetailViewControllerSender(@NotNull UIViewController vc,
            @Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * In a horizontally-regular environment this will set either the master or detail view controller depending on the
     * original target. In a compact environment this defaults to a full screen presentation. In general the master or
     * detail view controller will have implemented showViewController:sender: so this method would not be invoked.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("showViewController:sender:")
    public native void showViewControllerSender(@NotNull UIViewController vc,
            @Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * -setViewController:forColumn:/-viewControllerForColumn: recommended for column-style UISplitViewController
     */
    @NotNull
    @Generated
    @Selector("viewControllers")
    public native NSArray<? extends UIViewController> viewControllers();

    /**
     * default: UISplitViewControllerPrimaryEdgeLeading
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("primaryEdge")
    @NInt
    public native long primaryEdge();

    /**
     * default: UISplitViewControllerPrimaryEdgeLeading
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPrimaryEdge:")
    public native void setPrimaryEdge(@NInt long value);

    /**
     * The background style of the primary view controller.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("primaryBackgroundStyle")
    @NInt
    public native long primaryBackgroundStyle();

    /**
     * The background style of the primary view controller.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPrimaryBackgroundStyle:")
    public native void setPrimaryBackgroundStyle(@NInt long value);

    /**
     * -hideColumn: and -showColumn: do not accept the Compact column
     * Collapsed:
     * -hideColumn:
     * always ignored for the Primary column, or if the requested column is not on top;
     * otherwise the column is popped
     * -showColumn:
     * pushes the column (and any intervening columns) if the column is not in the stack;
     * does nothing if the column is on top;
     * pops any covering columns if the column is in the stack but not on top
     * Expanded:
     * -hideColumn:
     * ignored for the Secondary column;
     * ignored when the column is not visible in the current displayMode;
     * otherwise animates to the nearest displayMode where the column is not visible
     * -showColumn:
     * ignored for the Secondary column;
     * ignored when the column is already visible in the current displayMode;
     * otherwise animates to the nearest displayMode where the column is visible
     * 
     * If an animation is started due to -show/hideColumn:, the transitionCoordinator for the UISplitViewController is
     * available following the -show/hideColumn: message.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("hideColumn:")
    public native void hideColumn(@NInt long column);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithStyle:")
    public native UISplitViewController initWithStyle(@NInt long style);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("maximumSupplementaryColumnWidth")
    @NFloat
    public native double maximumSupplementaryColumnWidth();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("minimumSupplementaryColumnWidth")
    @NFloat
    public native double minimumSupplementaryColumnWidth();

    /**
     * default: UISplitViewControllerAutomaticDimension
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("preferredPrimaryColumnWidth")
    @NFloat
    public native double preferredPrimaryColumnWidth();

    /**
     * default Automatic, actual behavior will be determined by width buckets and view aspect ration
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("preferredSplitBehavior")
    @NInt
    public native long preferredSplitBehavior();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("preferredSupplementaryColumnWidth")
    @NFloat
    public native double preferredSupplementaryColumnWidth();

    /**
     * Same as the "Primary" versions but applying to the Supplementary column for the triple-column style
     * UISplitViewController
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("preferredSupplementaryColumnWidthFraction")
    @NFloat
    public native double preferredSupplementaryColumnWidthFraction();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setMaximumSupplementaryColumnWidth:")
    public native void setMaximumSupplementaryColumnWidth(@NFloat double value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setMinimumSupplementaryColumnWidth:")
    public native void setMinimumSupplementaryColumnWidth(@NFloat double value);

    /**
     * default: UISplitViewControllerAutomaticDimension
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPreferredPrimaryColumnWidth:")
    public native void setPreferredPrimaryColumnWidth(@NFloat double value);

    /**
     * default Automatic, actual behavior will be determined by width buckets and view aspect ration
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPreferredSplitBehavior:")
    public native void setPreferredSplitBehavior(@NInt long value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPreferredSupplementaryColumnWidth:")
    public native void setPreferredSupplementaryColumnWidth(@NFloat double value);

    /**
     * Same as the "Primary" versions but applying to the Supplementary column for the triple-column style
     * UISplitViewController
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPreferredSupplementaryColumnWidthFraction:")
    public native void setPreferredSupplementaryColumnWidthFraction(@NFloat double value);

    /**
     * Default NO. The secondary-only shortcut button is applicable only for UISplitViewControllerStyleTripleColumn
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setShowsSecondaryOnlyButton:")
    public native void setShowsSecondaryOnlyButton(boolean value);

    /**
     * If the vc is not a UINavigationController, one will be created, except for UISplitViewControllerColumnCompact.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setViewController:forColumn:")
    public native void setViewControllerForColumn(@Nullable UIViewController vc, @NInt long column);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("showColumn:")
    public native void showColumn(@NInt long column);

    /**
     * Default NO. The secondary-only shortcut button is applicable only for UISplitViewControllerStyleTripleColumn
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("showsSecondaryOnlyButton")
    public native boolean showsSecondaryOnlyButton();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("splitBehavior")
    @NInt
    public native long splitBehavior();

    /**
     * For information only, will not be called from UIKit code
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("style")
    @NInt
    public native long style();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("supplementaryColumnWidth")
    @NFloat
    public native double supplementaryColumnWidth();

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("viewControllerForColumn:")
    public native UIViewController viewControllerForColumn(@NInt long column);

    /**
     * default: automatic
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("displayModeButtonVisibility")
    @NInt
    public native long displayModeButtonVisibility();

    /**
     * default: automatic
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("setDisplayModeButtonVisibility:")
    public native void setDisplayModeButtonVisibility(@NInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
