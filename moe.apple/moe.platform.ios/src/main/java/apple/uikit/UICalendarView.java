package apple.uikit;

import apple.NSObject;
import apple.corefoundation.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCalendar;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDateComponents;
import apple.foundation.NSDateInterval;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSTimeZone;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UICalendarViewDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICalendarView extends UIView {
    static {
        NatJ.register();
    }

    @Generated
    protected UICalendarView(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICalendarView alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UICalendarView allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @Generated
    @Selector("appearance")
    public static native UICalendarView appearance();

    @Generated
    @ProtocolClassMethod("appearance")
    public UICalendarView _appearance() {
        return appearance();
    }

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UICalendarView appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UICalendarView _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UICalendarView appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UICalendarView _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UICalendarView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            UITraitCollection trait, NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UICalendarView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UICalendarView appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UICalendarView _appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UICalendarView appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UICalendarView _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * The available date range of the calendar view. The default is a date interval from @c NSDate.distantPast
     * to @c NSDate.distantFuture
     */
    @Generated
    @Selector("availableDateRange")
    public native NSDateInterval availableDateRange();

    @Generated
    @Deprecated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

    /**
     * The backing calendar of the calendar view. The default value is @c NSCalendar.currentCalendar
     */
    @Generated
    @Selector("calendar")
    public native NSCalendar calendar();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Deprecated
    @Selector("commitAnimations")
    public static native void commitAnimations();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The object that defines the delegate of the calendar view.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICalendarViewDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The font design of the calendar view. The default value is @c UIFontDescriptorSystemDesignDefault
     */
    @Generated
    @Selector("fontDesign")
    public native String fontDesign();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

    @Generated
    @Selector("init")
    public native UICalendarView init();

    @Generated
    @Selector("initWithCoder:")
    public native UICalendarView initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UICalendarView initWithFrame(@ByValue CGRect frame);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    /**
     * The backing locale of the calendar view. The default value is @c NSLocale.currentLocale
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    @Generated
    @Owned
    @Selector("new")
    public static native UICalendarView new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            NSArray<? extends UIView> views, @NUInt long options,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    /**
     * Reloads the decorations for the specified dates, with an option to animate the action.
     * Decorations are only available if you implement the delegate method @c calendarView:decorationForDate:
     */
    @Generated
    @Selector("reloadDecorationsForDateComponents:animated:")
    public native void reloadDecorationsForDateComponentsAnimated(NSArray<? extends NSDateComponents> dates,
            boolean animated);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The object that defines the selection behavior of the calendar view.
     */
    @Generated
    @Selector("selectionBehavior")
    public native UICalendarSelection selectionBehavior();

    @Generated
    @Deprecated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Generated
    @Deprecated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Generated
    @Deprecated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Generated
    @Deprecated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Generated
    @Deprecated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    @Generated
    @Deprecated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Generated
    @Deprecated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Deprecated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Generated
    @Deprecated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    @Generated
    @Deprecated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Generated
    @Deprecated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    /**
     * The available date range of the calendar view. The default is a date interval from @c NSDate.distantPast
     * to @c NSDate.distantFuture
     */
    @Generated
    @Selector("setAvailableDateRange:")
    public native void setAvailableDateRange(NSDateInterval value);

    /**
     * The backing calendar of the calendar view. The default value is @c NSCalendar.currentCalendar
     */
    @Generated
    @Selector("setCalendar:")
    public native void setCalendar(NSCalendar value);

    /**
     * The object that defines the delegate of the calendar view.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UICalendarViewDelegate value);

    /**
     * The object that defines the delegate of the calendar view.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UICalendarViewDelegate value) {
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
     * The font design of the calendar view. The default value is @c UIFontDescriptorSystemDesignDefault
     */
    @Generated
    @Selector("setFontDesign:")
    public native void setFontDesign(String value);

    /**
     * The backing locale of the calendar view. The default value is @c NSLocale.currentLocale
     */
    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);

    /**
     * The object that defines the selection behavior of the calendar view.
     */
    @Generated
    @Selector("setSelectionBehavior:")
    public native void setSelectionBehavior(UICalendarSelection value);

    /**
     * The backing time zone of the calendar view. Default is nil
     */
    @Generated
    @Selector("setTimeZone:")
    public native void setTimeZone(NSTimeZone value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The date components representing the current visible date of the calendar view. The default value is the
     * NSDateComponents representation of the current date given the granularity of the displayed component.
     * The @c visibleDateComponents must also be a valid date within @c availableDateRange
     * 
     * [@note] If @c visibleDateComponents.calendar and @c UICalendarView.calendar are not equal,the input date
     * components
     * will be converted to use @c UICalendarView.calendar upon assignment. UICalendarView will use
     * [@c] UICalendarView.calendar if @c visibleDateComponents.calendar is not explicitly marked, and may result
     * in incorrect dates if the dateComponents is not valid in @c UICalendarView.calendar.
     */
    @Generated
    @Selector("setVisibleDateComponents:")
    public native void setVisibleDateComponents(NSDateComponents value);

    /**
     * Sets the visible date components of the calendar view, with an option to animate the setting.
     * The @c visibleDateComponents must also be a valid date within @c availableDateRange
     * 
     * [@note] If @c visibleDateComponents.calendar and @c UICalendarView.calendar are not equal,the input date
     * components
     * will be converted to use @c UICalendarView.calendar upon assignment. UICalendarView will use
     * [@c] UICalendarView.calendar if @c visibleDateComponents.calendar is not explicitly marked, and may result
     * in incorrect dates if the dateComponents is not valid in @c UICalendarView.calendar.
     */
    @Generated
    @Selector("setVisibleDateComponents:animated:")
    public native void setVisibleDateComponentsAnimated(NSDateComponents dateComponents, boolean animated);

    /**
     * Determines if we show date decorations. By default, this value returns @c YES, but you must also implement
     * the delegate method @c calendarView:decorationForDate: to show decorations.
     */
    @Generated
    @Selector("setWantsDateDecorations:")
    public native void setWantsDateDecorations(boolean value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The backing time zone of the calendar view. Default is nil
     */
    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(UIView fromView, UIView toView,
            double duration, @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(UIView view, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

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

    /**
     * The date components representing the current visible date of the calendar view. The default value is the
     * NSDateComponents representation of the current date given the granularity of the displayed component.
     * The @c visibleDateComponents must also be a valid date within @c availableDateRange
     * 
     * [@note] If @c visibleDateComponents.calendar and @c UICalendarView.calendar are not equal,the input date
     * components
     * will be converted to use @c UICalendarView.calendar upon assignment. UICalendarView will use
     * [@c] UICalendarView.calendar if @c visibleDateComponents.calendar is not explicitly marked, and may result
     * in incorrect dates if the dateComponents is not valid in @c UICalendarView.calendar.
     */
    @Generated
    @Selector("visibleDateComponents")
    public native NSDateComponents visibleDateComponents();

    /**
     * Determines if we show date decorations. By default, this value returns @c YES, but you must also implement
     * the delegate method @c calendarView:decorationForDate: to show decorations.
     */
    @Generated
    @Selector("wantsDateDecorations")
    public native boolean wantsDateDecorations();
}