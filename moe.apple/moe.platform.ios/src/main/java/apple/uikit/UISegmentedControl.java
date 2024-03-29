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
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UISpringLoadedInteractionSupporting;
import apple.uikit.struct.UIOffset;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISegmentedControl extends UIControl implements NSCoding, UISpringLoadedInteractionSupporting {
    static {
        NatJ.register();
    }

    @Generated
    protected UISegmentedControl(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @NotNull @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISegmentedControl alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UISegmentedControl allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @NotNull @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @NotNull @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @NotNull
    @Generated
    @Selector("appearance")
    public static native UISegmentedControl appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UISegmentedControl appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UISegmentedControl appearanceForTraitCollectionWhenContainedIn(
            @NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UISegmentedControl appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UISegmentedControl appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UISegmentedControl appearanceWhenContainedInInstancesOfClasses(
            @NotNull NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Deprecated
    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(@Nullable String animationID, @Nullable VoidPtr context);

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

    @Deprecated
    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

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
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

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

    @NotNull
    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native UISegmentedControl new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            @NotNull NSArray<? extends UIView> views, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @Nullable @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @NotNull @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Deprecated
    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Deprecated
    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Deprecated
    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Deprecated
    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Nullable @Mapped(ObjCObjectMapper.class) Object delegate);

    @Deprecated
    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(@Nullable SEL selector);

    @Deprecated
    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Deprecated
    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Deprecated
    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Deprecated
    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(@NotNull NSDate startDate);

    @Deprecated
    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, @NotNull UIView view,
            boolean cache);

    @Deprecated
    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(@Nullable SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(@NotNull UIView fromView,
            @NotNull UIView toView, double duration, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(@NotNull UIView view,
            double duration, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttributeRelativeToLayoutDirection(
            @NInt long semanticContentAttribute, @NInt long layoutDirection);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UISegmentedControl _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UISegmentedControl _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UISegmentedControl _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UISegmentedControl _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UISegmentedControl _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UISegmentedControl _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * For segments whose width value is 0, setting this property to YES attempts to adjust segment widths based on
     * their content widths. Default is NO.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("apportionsSegmentWidthsByContent")
    public native boolean apportionsSegmentWidthsByContent();

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("backgroundImageForState:barMetrics:")
    public native UIImage backgroundImageForStateBarMetrics(@NUInt long state, @NInt long barMetrics);

    @Generated
    @Selector("contentOffsetForSegmentAtIndex:")
    @ByValue
    public native CGSize contentOffsetForSegmentAtIndex(@NUInt long segment);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("contentPositionAdjustmentForSegmentType:barMetrics:")
    @ByValue
    public native UIOffset contentPositionAdjustmentForSegmentTypeBarMetrics(@NInt long leftCenterRightOrAlone,
            @NInt long barMetrics);

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("dividerImageForLeftSegmentState:rightSegmentState:barMetrics:")
    public native UIImage dividerImageForLeftSegmentStateRightSegmentStateBarMetrics(@NUInt long leftState,
            @NUInt long rightState, @NInt long barMetrics);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Nullable
    @Generated
    @Selector("imageForSegmentAtIndex:")
    public native UIImage imageForSegmentAtIndex(@NUInt long segment);

    @Generated
    @Selector("init")
    public native UISegmentedControl init();

    @Generated
    @Selector("initWithCoder:")
    public native UISegmentedControl initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UISegmentedControl initWithFrame(@ByValue CGRect frame);

    /**
     * Initializes the segmented control with the given items. Items may be NSStrings, UIImages, or (as of iOS 14.0)
     * UIActions. When constructing from a UIAction segments will prefer images over titles when both are provided. The
     * segmented control is automatically sized to fit content.
     */
    @Generated
    @Selector("initWithItems:")
    public native UISegmentedControl initWithItems(@Nullable NSArray<?> items);

    @Generated
    @Selector("insertSegmentWithImage:atIndex:animated:")
    public native void insertSegmentWithImageAtIndexAnimated(@Nullable UIImage image, @NUInt long segment,
            boolean animated);

    /**
     * insert before segment number. 0..#segments. value pinned
     */
    @Generated
    @Selector("insertSegmentWithTitle:atIndex:animated:")
    public native void insertSegmentWithTitleAtIndexAnimated(@Nullable String title, @NUInt long segment,
            boolean animated);

    @Generated
    @Selector("isEnabledForSegmentAtIndex:")
    public native boolean isEnabledForSegmentAtIndex(@NUInt long segment);

    /**
     * if set, then we don't keep showing selected state after tracking ends. default is NO
     */
    @Generated
    @Selector("isMomentary")
    public native boolean isMomentary();

    /**
     * if set, then we don't keep showing selected state after tracking ends. default is NO
     */
    @Generated
    @Selector("setMomentary:")
    public native void setMomentary(boolean value);

    @Generated
    @Selector("numberOfSegments")
    @NUInt
    public native long numberOfSegments();

    @Generated
    @Selector("removeAllSegments")
    public native void removeAllSegments();

    @Generated
    @Selector("removeSegmentAtIndex:animated:")
    public native void removeSegmentAtIndexAnimated(@NUInt long segment, boolean animated);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: The segmentedControlStyle property no longer has any effect
     */
    @Generated
    @Deprecated
    @Selector("segmentedControlStyle")
    @NInt
    public native long segmentedControlStyle();

    /**
     * ignored in momentary mode. returns last segment pressed. default is UISegmentedControlNoSegment until a segment
     * is pressed
     * the UIControlEventValueChanged action is invoked when the segment changes via a user event. set to
     * UISegmentedControlNoSegment to turn off selection
     */
    @Generated
    @Selector("selectedSegmentIndex")
    @NInt
    public native long selectedSegmentIndex();

    /**
     * For segments whose width value is 0, setting this property to YES attempts to adjust segment widths based on
     * their content widths. Default is NO.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setApportionsSegmentWidthsByContent:")
    public native void setApportionsSegmentWidthsByContent(boolean value);

    /**
     * If backgroundImage is an image returned from -[UIImage resizableImageWithCapInsets:] the cap widths will be
     * calculated from that information, otherwise, the cap width will be calculated by subtracting one from the image's
     * width then dividing by 2. The cap widths will also be used as the margins for text placement. To adjust the
     * margin use the margin adjustment methods.
     * 
     * In general, you should specify a value for the normal state to be used by other states which don't have a custom
     * value set.
     * 
     * Similarly, when a property is dependent on the bar metrics, be sure to specify a value for UIBarMetricsDefault.
     * In the case of the segmented control, appearance properties for UIBarMetricsCompact are only respected for
     * segmented controls in the smaller navigation and toolbars.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setBackgroundImage:forState:barMetrics:")
    public native void setBackgroundImageForStateBarMetrics(@Nullable UIImage backgroundImage, @NUInt long state,
            @NInt long barMetrics);

    /**
     * adjust offset of image or text inside the segment. default is (0,0)
     */
    @Generated
    @Selector("setContentOffset:forSegmentAtIndex:")
    public native void setContentOffsetForSegmentAtIndex(@ByValue CGSize offset, @NUInt long segment);

    /**
     * For adjusting the position of a title or image within the given segment of a segmented control.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setContentPositionAdjustment:forSegmentType:barMetrics:")
    public native void setContentPositionAdjustmentForSegmentTypeBarMetrics(@ByValue UIOffset adjustment,
            @NInt long leftCenterRightOrAlone, @NInt long barMetrics);

    /**
     * To customize the segmented control appearance you will need to provide divider images to go between two
     * unselected segments (leftSegmentState:UIControlStateNormal rightSegmentState:UIControlStateNormal), selected on
     * the left and unselected on the right (leftSegmentState:UIControlStateSelected
     * rightSegmentState:UIControlStateNormal), and unselected on the left and selected on the right
     * (leftSegmentState:UIControlStateNormal rightSegmentState:UIControlStateSelected).
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setDividerImage:forLeftSegmentState:rightSegmentState:barMetrics:")
    public native void setDividerImageForLeftSegmentStateRightSegmentStateBarMetrics(@Nullable UIImage dividerImage,
            @NUInt long leftState, @NUInt long rightState, @NInt long barMetrics);

    /**
     * default is YES
     */
    @Generated
    @Selector("setEnabled:forSegmentAtIndex:")
    public native void setEnabledForSegmentAtIndex(boolean enabled, @NUInt long segment);

    /**
     * can only have image or title, not both. must be 0..#segments - 1 (or ignored). default is nil
     */
    @Generated
    @Selector("setImage:forSegmentAtIndex:")
    public native void setImageForSegmentAtIndex(@Nullable UIImage image, @NUInt long segment);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: The segmentedControlStyle property no longer has any effect
     */
    @Generated
    @Deprecated
    @Selector("setSegmentedControlStyle:")
    public native void setSegmentedControlStyle(@NInt long value);

    /**
     * ignored in momentary mode. returns last segment pressed. default is UISegmentedControlNoSegment until a segment
     * is pressed
     * the UIControlEventValueChanged action is invoked when the segment changes via a user event. set to
     * UISegmentedControlNoSegment to turn off selection
     */
    @Generated
    @Selector("setSelectedSegmentIndex:")
    public native void setSelectedSegmentIndex(@NInt long value);

    /**
     * can only have image or title, not both. must be 0..#segments - 1 (or ignored). default is nil
     */
    @Generated
    @Selector("setTitle:forSegmentAtIndex:")
    public native void setTitleForSegmentAtIndex(@Nullable String title, @NUInt long segment);

    /**
     * You may specify the font, text color, and shadow properties for the title in the text attributes dictionary,
     * using the keys found in NSAttributedString.h.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setTitleTextAttributes:forState:")
    public native void setTitleTextAttributesForState(@Nullable NSDictionary<String, ?> attributes, @NUInt long state);

    /**
     * set to 0.0 width to autosize. default is 0.0
     */
    @Generated
    @Selector("setWidth:forSegmentAtIndex:")
    public native void setWidthForSegmentAtIndex(@NFloat double width, @NUInt long segment);

    @Nullable
    @Generated
    @Selector("titleForSegmentAtIndex:")
    public native String titleForSegmentAtIndex(@NUInt long segment);

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("titleTextAttributesForState:")
    public native NSDictionary<String, ?> titleTextAttributesForState(@NUInt long state);

    @Generated
    @Selector("widthForSegmentAtIndex:")
    @NFloat
    public native double widthForSegmentAtIndex(@NUInt long segment);

    @Generated
    @Selector("isSpringLoaded")
    public native boolean isSpringLoaded();

    @Generated
    @Selector("setSpringLoaded:")
    public native void setSpringLoaded(boolean value);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * The color to use for highlighting the currently selected segment.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("selectedSegmentTintColor")
    public native UIColor selectedSegmentTintColor();

    /**
     * The color to use for highlighting the currently selected segment.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setSelectedSegmentTintColor:")
    public native void setSelectedSegmentTintColor(@Nullable UIColor value);

    /**
     * Fetch the action for the given segment, if one has been assigned to that segment
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("actionForSegmentAtIndex:")
    public native UIAction actionForSegmentAtIndex(@NUInt long segment);

    /**
     * Initializes the segmented control with the given frame and segments constructed from the given UIActions.
     * Segments will prefer images over titles when both are provided. Selecting a segment calls UIAction.actionHandler
     * as well as handlers for the ValueChanged and PrimaryActionTriggered control events.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithFrame:actions:")
    public native UISegmentedControl initWithFrameActions(@ByValue CGRect frame,
            @NotNull NSArray<? extends UIAction> actions);

    @Generated
    @Selector("initWithFrame:primaryAction:")
    public native UISegmentedControl initWithFramePrimaryAction(@ByValue CGRect frame,
            @Nullable UIAction primaryAction);

    /**
     * Insert a segment with the given action at the given index. Segments will prefer images over titles when both are
     * provided. When the segment is selected UIAction.actionHandler is called. If a segment already exists with the
     * action's identifier that segment will either be updated (if the index is the same) or it will be removed (if
     * different).
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("insertSegmentWithAction:atIndex:animated:")
    public native void insertSegmentWithActionAtIndexAnimated(@NotNull UIAction action, @NUInt long segment,
            boolean animated);

    /**
     * Returns the index of the segment associated with the given actionIdentifier, or NSNotFound if the identifier
     * could not be found.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("segmentIndexForActionIdentifier:")
    @NInt
    public native long segmentIndexForActionIdentifier(@NotNull String actionIdentifier);

    /**
     * Reconfigures the given segment with this action. Segments will prefer images over titles when both are provided.
     * When the segment is selected UIAction.actionHandler is called. UIAction.identifier must either match the action
     * of the existing segment at this index, or be unique within all actions associated with the segmented control, or
     * this method will assert.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAction:forSegmentAtIndex:")
    public native void setActionForSegmentAtIndex(@NotNull UIAction action, @NUInt long segment);

    @Generated
    @Selector("animateWithSpringDuration:bounce:initialSpringVelocity:delay:options:animations:completion:")
    public static native void animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion(
            double duration, @NFloat double bounce, @NFloat double velocity, double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5") @NotNull UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6") @Nullable UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6 completion);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
