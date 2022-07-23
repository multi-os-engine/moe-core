package apple.intents;

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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INSpatialEventTriggerResolutionResult extends INIntentResolutionResult {
    static {
        NatJ.register();
    }

    @Generated
    protected INSpatialEventTriggerResolutionResult(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INSpatialEventTriggerResolutionResult alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INSpatialEventTriggerResolutionResult allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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

    /**
     * This resolution result is to ask Siri to confirm if this is the spatialEventTrigger with which the user wants to
     * continue.
     */
    @Generated
    @Selector("confirmationRequiredWithSpatialEventTriggerToConfirm:")
    public static native INSpatialEventTriggerResolutionResult confirmationRequiredWithSpatialEventTriggerToConfirm(
            INSpatialEventTrigger spatialEventTriggerToConfirm);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * This resolution result is to ask Siri to disambiguate between the provided INSpatialEventTrigger.
     */
    @Generated
    @Selector("disambiguationWithSpatialEventTriggersToDisambiguate:")
    public static native INSpatialEventTriggerResolutionResult disambiguationWithSpatialEventTriggersToDisambiguate(
            NSArray<? extends INSpatialEventTrigger> spatialEventTriggersToDisambiguate);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INSpatialEventTriggerResolutionResult init();

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
    @Selector("needsValue")
    public static native INSpatialEventTriggerResolutionResult needsValue();

    @Generated
    @Owned
    @Selector("new")
    public static native INSpatialEventTriggerResolutionResult new_objc();

    @Generated
    @Selector("notRequired")
    public static native INSpatialEventTriggerResolutionResult notRequired();

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
     * This resolution result is for when the app extension wants to tell Siri to proceed, with a given
     * INSpatialEventTrigger. The resolvedSpatialEventTrigger can be different than the original INSpatialEventTrigger.
     * This allows app extensions to apply business logic constraints.
     * Use +notRequired to continue with a 'nil' value.
     */
    @Generated
    @Selector("successWithResolvedSpatialEventTrigger:")
    public static native INSpatialEventTriggerResolutionResult successWithResolvedSpatialEventTrigger(
            INSpatialEventTrigger resolvedSpatialEventTrigger);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unsupported")
    public static native INSpatialEventTriggerResolutionResult unsupported();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("confirmationRequiredWithItemToConfirm:forReason:")
    public static native INSpatialEventTriggerResolutionResult confirmationRequiredWithItemToConfirmForReason(
            @Mapped(ObjCObjectMapper.class) Object itemToConfirm, @NInt long reason);

    @Generated
    @Selector("unsupportedWithReason:")
    public static native INSpatialEventTriggerResolutionResult unsupportedWithReason(@NInt long reason);
}
