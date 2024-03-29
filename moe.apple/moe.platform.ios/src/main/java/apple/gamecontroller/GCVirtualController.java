package apple.gamecontroller;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import apple.corefoundation.struct.CGPoint;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.NFloat;

/**
 * GCVirtualController
 * 
 * API-Since: 15.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCVirtualController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GCVirtualController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCVirtualController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GCVirtualController allocWithZone(VoidPtr zone);

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
    @Selector("connectWithReplyHandler:")
    public native void connectWithReplyHandler(
            @Nullable @ObjCBlock(name = "call_connectWithReplyHandler") Block_connectWithReplyHandler reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_connectWithReplyHandler {
        @Generated
        void call_connectWithReplyHandler(@Nullable NSError error);
    }

    /**
     * GCController is only available when GCVirtualController is connected
     */
    @Nullable
    @Generated
    @Selector("controller")
    public native GCController controller();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("disconnect")
    public native void disconnect();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native GCVirtualController init();

    @Generated
    @Selector("initWithConfiguration:")
    public native GCVirtualController initWithConfiguration(@NotNull GCVirtualControllerConfiguration configuration);

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
    public static native GCVirtualController new_objc();

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

    /**
     * Changes the GCVirtualControllerElementConfiguration on a per element basis. Only applicable when the
     * GCVirtualController is not hidden and its
     * UI is being drawn by the system.
     */
    @Generated
    @Selector("updateConfigurationForElement:configuration:")
    public native void updateConfigurationForElementConfiguration(@NotNull String element,
            @NotNull @ObjCBlock(name = "call_updateConfigurationForElementConfiguration") Block_updateConfigurationForElementConfiguration config);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateConfigurationForElementConfiguration {
        @NotNull
        @Generated
        GCVirtualControllerElementConfiguration call_updateConfigurationForElementConfiguration(
                @NotNull GCVirtualControllerElementConfiguration oldConfiguration);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Create a virtual controller
     * 
     * @see GCVirtualControllerConfiguration
     */
    @NotNull
    @Generated
    @Selector("virtualControllerWithConfiguration:")
    public static native GCVirtualController virtualControllerWithConfiguration(
            @NotNull GCVirtualControllerConfiguration configuration);

    /**
     * Sets the (x,y) position for a GCControllerDirectionPad element (D-Pads as well as Joysticks). X and Y values are
     * clamped to the range (-1.0 - 1.0).
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setPosition:forDirectionPadElement:")
    public native void setPositionForDirectionPadElement(@ByValue CGPoint position, @NotNull String element);

    /**
     * Sets the value for a GCControllerButton element. Values are clamped to the range (0.0 - 1.0).
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setValue:forButtonElement:")
    public native void setValueForButtonElement(@NFloat double value, @NotNull String element);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
