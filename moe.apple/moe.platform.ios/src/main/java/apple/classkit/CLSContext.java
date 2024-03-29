package apple.classkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Contexts represent activities, documents, and areas within your app.
 * 
 * Contexts have two major components.
 * 
 * (1) Child contexts, used to model your app hierarchy.
 * (2) Activity, holds user generated data that pertains to this context.
 * 
 * 
 * API-Since: 11.3
 */
@Generated
@Library("ClassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLSContext extends CLSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CLSContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Adds a child context.
     * 
     * A context can only have a single parent.
     * [@note] objectID of child context may change after it's been added.
     */
    @Generated
    @Selector("addChildContext:")
    public native void addChildContext(@NotNull CLSContext child);

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLSContext alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CLSContext allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Marks contexts as active.
     * 
     * If a context is already active, it will remain active. If another context is active, the other will resign active
     * before this one becomes active.
     */
    @Generated
    @Selector("becomeActive")
    public native void becomeActive();

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
     * Creates a new activity
     * 
     * Creates a new activity and sets it as the current activity.
     */
    @NotNull
    @Generated
    @Selector("createNewActivity")
    public native CLSActivity createNewActivity();

    /**
     * Returns the current activity.
     * 
     * Activity associated with a context. If no activity was ever created this is nil. See: @c -[CLSContext
     * createNewActivity]; for more details.
     */
    @Nullable
    @Generated
    @Selector("currentActivity")
    public native CLSActivity currentActivity();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Returns a descendant of this context matching the context path you provide. Context path must start with an
     * identifier of a child context of the context to which this message is sent.
     * 
     * If there are any missing contexts, they will be filled in by calling the following method on the context's data
     * store's delegate: @code -[CLSDataStoreDelegate
     * createContextForIdentifier:parentContext:parentIdentifierPath:] @endcode If the dataStore does not have a
     * delegate and there are missing contexts then an incomplete list of contexts will be passed to the completion
     * handler. Completion block is called on a background thread.
     */
    @Generated
    @Selector("descendantMatchingIdentifierPath:completion:")
    public native void descendantMatchingIdentifierPathCompletion(@NotNull NSArray<String> identifierPath,
            @NotNull @ObjCBlock(name = "call_descendantMatchingIdentifierPathCompletion") Block_descendantMatchingIdentifierPathCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_descendantMatchingIdentifierPathCompletion {
        @Generated
        void call_descendantMatchingIdentifierPathCompletion(@Nullable CLSContext context, @Nullable NSError error);
    }

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The displayOrder is by default sorted ascending.
     * 
     * Set the displayOrder if you want your contexts to be displayed in a particular order. The sort key is used as a
     * way to sort sibling contexts in a particular order.
     */
    @Generated
    @Selector("displayOrder")
    @NInt
    public native long displayOrder();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * App-assigned identifier. This identifier should work across users and devices and be unique with regards to its
     * siblings within its parent.
     * 
     * The identifier could be used to embed information later used for deep linking. For example: @em hydrogen-element,
     * or @em chapter-1.
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native CLSContext init();

    @Generated
    @Selector("initWithCoder:")
    public native CLSContext initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize and configure the type of content this context represents.
     * 
     * @param identifier App-assigned identifier for this context. 256 characters max length.
     * @param type       The type of content this context represents.
     * @param title      Title for what this context represents. 256 characters max length.
     */
    @Generated
    @Selector("initWithType:identifier:title:")
    public native CLSContext initWithTypeIdentifierTitle(@NInt long type, @NotNull String identifier,
            @NotNull String title);

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

    /**
     * Returns true if self is the active context.
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

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
    public static native CLSContext new_objc();

    /**
     * Returns the parent of this context.
     */
    @Nullable
    @Generated
    @Selector("parent")
    public native CLSContext parent();

    /**
     * Removes this child context from its parent.
     * 
     * If you remove a context from its parent and do not add it as a child of another context, it will be deleted when
     * you call -save on the dataStore.
     */
    @Generated
    @Selector("removeFromParent")
    public native void removeFromParent();

    /**
     * Resign being active.
     * 
     * This method does nothing if the reciever of the message is not active.
     */
    @Generated
    @Selector("resignActive")
    public native void resignActive();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The displayOrder is by default sorted ascending.
     * 
     * Set the displayOrder if you want your contexts to be displayed in a particular order. The sort key is used as a
     * way to sort sibling contexts in a particular order.
     */
    @Generated
    @Selector("setDisplayOrder:")
    public native void setDisplayOrder(@NInt long value);

    /**
     * Title of this context.
     * 
     * For example: @em Level 1 @em.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@NotNull String value);

    /**
     * Topic associated with this context.
     * 
     * See above for valid, predefined topics.
     */
    @Generated
    @Selector("setTopic:")
    public native void setTopic(@Nullable String value);

    /**
     * Alternative deep link URL using universal links.
     * 
     * If your app supports universal links, you can supply them here to link the content this context represents.
     * 
     * API-Since: 11.4
     */
    @Generated
    @Selector("setUniversalLinkURL:")
    public native void setUniversalLinkURL(@Nullable NSURL value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Title of this context.
     * 
     * For example: @em Level 1 @em.
     */
    @NotNull
    @Generated
    @Selector("title")
    public native String title();

    /**
     * Topic associated with this context.
     * 
     * See above for valid, predefined topics.
     */
    @Nullable
    @Generated
    @Selector("topic")
    public native String topic();

    /**
     * Type of this context
     * 
     * The type that best describes this context.
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();

    /**
     * Alternative deep link URL using universal links.
     * 
     * If your app supports universal links, you can supply them here to link the content this context represents.
     * 
     * API-Since: 11.4
     */
    @Nullable
    @Generated
    @Selector("universalLinkURL")
    public native NSURL universalLinkURL();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * An optional user-visible name for the context if its type is CLSContextTypeCustom.
     * 
     * This property is relevant only if the type is CLSContextTypeCustom. This string should be localized. If this
     * property is not set for a context of type CLSContextTypeCustom, Schoolwork app will use a default localized
     * string ‘Custom’ as the name of the activity representing this context.
     * 
     * API-Since: 13.4
     */
    @Nullable
    @Generated
    @Selector("customTypeName")
    public native String customTypeName();

    /**
     * Context identifier path of this context.
     * 
     * The identifier path starts with the main app context object and finishes with the identifier of this context.
     * This is the identifier path that one would use in @code -[CLSDataStore
     * contextsMatchingIdintifierPath:completion:] @endcode to find `this' context.
     * 
     * API-Since: 13.4
     */
    @NotNull
    @Generated
    @Selector("identifierPath")
    public native NSArray<String> identifierPath();

    /**
     * An optional user-visible name for the context if its type is CLSContextTypeCustom.
     * 
     * This property is relevant only if the type is CLSContextTypeCustom. This string should be localized. If this
     * property is not set for a context of type CLSContextTypeCustom, Schoolwork app will use a default localized
     * string ‘Custom’ as the name of the activity representing this context.
     * 
     * API-Since: 13.4
     */
    @Generated
    @Selector("setCustomTypeName:")
    public native void setCustomTypeName(@Nullable String value);

    /**
     * An optional user-visible summary describing the context limited to 4000 characters in length.
     * 
     * This may be used to provide information about the types of activities available under a given context or the
     * context itself. This string should be localized.
     * 
     * API-Since: 13.4
     */
    @Generated
    @Selector("setSummary:")
    public native void setSummary(@Nullable String value);

    /**
     * An optional thumbnail image associated with the context.
     * 
     * The size of this image should be equal to or larger than 80x80 pixels and equal to or smaller than 330x330
     * pixels. Images larger than 330x330 pixels will be scaled down. Images with both dimensions smaller than 80x80
     * pixels will not be accepted.
     * 
     * API-Since: 13.4
     */
    @Generated
    @Selector("setThumbnail:")
    public native void setThumbnail(@Nullable CGImageRef value);

    /**
     * An optional user-visible summary describing the context limited to 4000 characters in length.
     * 
     * This may be used to provide information about the types of activities available under a given context or the
     * context itself. This string should be localized.
     * 
     * API-Since: 13.4
     */
    @Nullable
    @Generated
    @Selector("summary")
    public native String summary();

    /**
     * An optional thumbnail image associated with the context.
     * 
     * The size of this image should be equal to or larger than 80x80 pixels and equal to or smaller than 330x330
     * pixels. Images larger than 330x330 pixels will be scaled down. Images with both dimensions smaller than 80x80
     * pixels will not be accepted.
     * 
     * API-Since: 13.4
     */
    @Nullable
    @Generated
    @Selector("thumbnail")
    public native CGImageRef thumbnail();

    /**
     * Add or replace additional progress reporting capabilities of the app for this context.
     * 
     * If this parameter contains multiple items with the same value for kind, then one of them will be arbitrarily
     * selected and used. If this parameter contains a capability of kind CLSProgressReportingCapabilityKindDuration, it
     * will be ignored.
     * 
     * @param capabilities Progress reporting capabilities to add or replace existing capabilties.
     * 
     *                     API-Since: 14.0
     */
    @Generated
    @Selector("addProgressReportingCapabilities:")
    public native void addProgressReportingCapabilities(
            @NotNull NSSet<? extends CLSProgressReportingCapability> capabilities);

    /**
     * This property is true if the context can be assigned as an activity.
     * 
     * The default value of this property is true. This should be set to false for a context that is used as a container
     * for other contexts, but by itself, is not an assignable activity.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("isAssignable")
    public native boolean isAssignable();

    /**
     * Specifies progress reporting capablities of the app for this context.
     * 
     * This information is intended to help teachers as they choose activities for their students. By default a
     * CLSContext will have one CLSProgressReportingCapability instance of kind
     * CLSProgressReportingCapabilityKindDuration. More progress reporting capabilities can be specified via
     * '-addProgressReportingCapabilities:' to customize this set.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("progressReportingCapabilities")
    public native NSSet<? extends CLSProgressReportingCapability> progressReportingCapabilities();

    /**
     * Clears CLSProgressReportingCapability objects added to the receiver.
     * 
     * Removes all capabilities added via '-addProgressReportingCapabilities:'. The context will have the default
     * progress reporting capability of kind CLSProgressReportingCapabilityKindDuration.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("resetProgressReportingCapabilities")
    public native void resetProgressReportingCapabilities();

    /**
     * This property is true if the context can be assigned as an activity.
     * 
     * The default value of this property is true. This should be set to false for a context that is used as a container
     * for other contexts, but by itself, is not an assignable activity.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAssignable:")
    public native void setAssignable(boolean value);

    /**
     * Suggested age range of students, expressed in years, for whom this context is suitable. This information is
     * intended to help teachers to choose age-appropriate activities for their students.
     * 
     * The default value is [0, NSIntegerMax - 1]. This is @em NSRange(0...Int.max-1) in @em Swift or @em
     * NSMakeRange(0,NSIntegerMax) in @em Objective-C. Set the lower bound to 0 to specify no minimum age limit and set
     * the upper bound to NSIntegerMax - 1 to specify no maximum age limit.
     * [@example] An age range of 4 to 6 years is expressed by @em NSRange(4...6) in @em Swift or by @em
     * NSMakeRange(4,3) in @Objective-C.
     * [@example] An age range of up 10 years is expressed by @em NSRange(0...10) in @em Swift or by @em
     * NSMakeRange(0,11) in @Objective-C.
     * [@example] An age range of 18 years or above is expressed by @em NSRange(18...Int.max-1) in @em Swift or by @em
     * NSMakeRange(18,NSIntegerMax-18) in @Objective-C.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSuggestedAge:")
    public native void setSuggestedAge(@ByValue NSRange value);

    /**
     * Suggested time range, expressed in minutes, to complete the activity. This information will help teachers as they
     * choose activities for their students.
     * 
     * The default value is [0, NSIntegerMax - 1]. This is @em NSRange(0...Int.max-1) in @em Swift or @em
     * NSMakeRange(0,NSIntegerMax) in @em Objective-C. Set the lower bound value to 0 to specify no minimum time limit
     * and set the upper bound to NSIntegerMax - 1 to specify no maximum time limit.
     * [@example] An time range of 10 to 15 minutes is expressed by @em NSRange(10...15) in @em Swift or by @em
     * NSMakeRange(10,6) in @Objective-C.
     * [@example] An time range of up to 10 minutes is expressed by @em NSRange(0...10) in @em Swift or by @em
     * NSMakeRange(0,11) in @Objective-C.
     * [@example] An time range of at least 20 minutes is expressed by @em NSRange(20...Int.max-1) in @em Swift or
     * by @em NSMakeRange(20,NSIntegerMax-20) in @Objective-C.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSuggestedCompletionTime:")
    public native void setSuggestedCompletionTime(@ByValue NSRange value);

    /**
     * Sets the type.
     * 
     * Use this to update a previously saved context.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setType:")
    public native void setType(@NInt long type);

    /**
     * Suggested age range of students, expressed in years, for whom this context is suitable. This information is
     * intended to help teachers to choose age-appropriate activities for their students.
     * 
     * The default value is [0, NSIntegerMax - 1]. This is @em NSRange(0...Int.max-1) in @em Swift or @em
     * NSMakeRange(0,NSIntegerMax) in @em Objective-C. Set the lower bound to 0 to specify no minimum age limit and set
     * the upper bound to NSIntegerMax - 1 to specify no maximum age limit.
     * [@example] An age range of 4 to 6 years is expressed by @em NSRange(4...6) in @em Swift or by @em
     * NSMakeRange(4,3) in @Objective-C.
     * [@example] An age range of up 10 years is expressed by @em NSRange(0...10) in @em Swift or by @em
     * NSMakeRange(0,11) in @Objective-C.
     * [@example] An age range of 18 years or above is expressed by @em NSRange(18...Int.max-1) in @em Swift or by @em
     * NSMakeRange(18,NSIntegerMax-18) in @Objective-C.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("suggestedAge")
    @ByValue
    public native NSRange suggestedAge();

    /**
     * Suggested time range, expressed in minutes, to complete the activity. This information will help teachers as they
     * choose activities for their students.
     * 
     * The default value is [0, NSIntegerMax - 1]. This is @em NSRange(0...Int.max-1) in @em Swift or @em
     * NSMakeRange(0,NSIntegerMax) in @em Objective-C. Set the lower bound value to 0 to specify no minimum time limit
     * and set the upper bound to NSIntegerMax - 1 to specify no maximum time limit.
     * [@example] An time range of 10 to 15 minutes is expressed by @em NSRange(10...15) in @em Swift or by @em
     * NSMakeRange(10,6) in @Objective-C.
     * [@example] An time range of up to 10 minutes is expressed by @em NSRange(0...10) in @em Swift or by @em
     * NSMakeRange(0,11) in @Objective-C.
     * [@example] An time range of at least 20 minutes is expressed by @em NSRange(20...Int.max-1) in @em Swift or
     * by @em NSMakeRange(20,NSIntegerMax-20) in @Objective-C.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("suggestedCompletionTime")
    @ByValue
    public native NSRange suggestedCompletionTime();

    /**
     * Adds a child context to specify the user can navigate to the child from this context.
     * 
     * Used only for presentation purpose. Unlike @code -[CLSContext addChildContext:] @endcode, this method does not
     * affect the identifierPath.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("addNavigationChildContext:")
    public native void addNavigationChildContext(@NotNull CLSContext child);

    /**
     * Child contexts that can be navigated to from this context.
     * 
     * Returns all the child contexts added via @code -[CLSContext addNavigationChildContext:] @endcode
     * 
     * API-Since: 14.5
     */
    @NotNull
    @Generated
    @Selector("navigationChildContexts")
    public native NSArray<? extends CLSContext> navigationChildContexts();

    /**
     * Removes the navigation path to the child context from this context.
     * 
     * Used only for presentation purpose. Unlike @code -[CLSContext removeFromParent:] @endcode, this method does not
     * affect the identiferPath.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("removeNavigationChildContext:")
    public native void removeNavigationChildContext(@NotNull CLSContext child);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
