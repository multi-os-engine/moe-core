package apple.gamecontroller;

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
 * Keyboard profile. Contains the current state of buttons specified in GCKeyCodes.h.
 * 
 * GCKeyboardInput is designed primarly for input polling. For the best text input experience, UIKit/AppKit usage is
 * recommended.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCKeyboardInput extends GCPhysicalInputProfile {
    static {
        NatJ.register();
    }

    @Generated
    protected GCKeyboardInput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCKeyboardInput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GCKeyboardInput allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Alongside general subscript notation of GCPhysicalInputProfile keys can be accessed using this method.
     * 
     * [@example] [keyboard buttonForKey:GCKeyCode.UpArrow] == keyboard[GCKeyUpArrow]
     * [@note] Full list of supported key constants can be found in GCKeyCodes.h and GCKeyNames.h
     * 
     * @param code is a low level key code that can be used for accessing a keyboard button.
     */
    @Nullable
    @Generated
    @Selector("buttonForKeyCode:")
    public native GCControllerButtonInput buttonForKeyCode(@NInt long code);

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
    @Selector("init")
    public native GCKeyboardInput init();

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
     * Before querying any key for a value it might be useful to check if any key is actually pressed
     */
    @Generated
    @Selector("isAnyKeyPressed")
    public native boolean isAnyKeyPressed();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Nullable
    @Generated
    @Selector("keyChangedHandler")
    @ObjCBlock(name = "call_keyChangedHandler_ret")
    public native Block_keyChangedHandler_ret keyChangedHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keyChangedHandler_ret {
        @Generated
        void call_keyChangedHandler_ret(@NotNull GCKeyboardInput keyboard, @NotNull GCControllerButtonInput key,
                @NInt long keyCode, boolean pressed);
    }

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native GCKeyboardInput new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setKeyChangedHandler:")
    public native void setKeyChangedHandler(
            @Nullable @ObjCBlock(name = "call_setKeyChangedHandler") Block_setKeyChangedHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setKeyChangedHandler {
        @Generated
        void call_setKeyChangedHandler(@NotNull GCKeyboardInput keyboard, @NotNull GCControllerButtonInput key,
                @NInt long keyCode, boolean pressed);
    }

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
