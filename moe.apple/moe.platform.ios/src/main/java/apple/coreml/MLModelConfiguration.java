package apple.coreml;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object to hold options for loading a model.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLModelConfiguration extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MLModelConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLModelConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLModelConfiguration allocWithZone(VoidPtr zone);

    /**
     * Set to YES to allow low precision accumulation on GPU when available. Defaults to NO
     */
    @Generated
    @Selector("allowLowPrecisionAccumulationOnGPU")
    public native boolean allowLowPrecisionAccumulationOnGPU();

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
    @Selector("computeUnits")
    @NInt
    public native long computeUnits();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLModelConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native MLModelConfiguration initWithCoder(@NotNull NSCoder coder);

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
    public static native MLModelConfiguration new_objc();

    /**
     * Optional dictionary with any requested changes to model or update parameters
     */
    @Nullable
    @Generated
    @Selector("parameters")
    public native NSDictionary<? extends MLParameterKey, ?> parameters();

    /**
     * Set to specify a preferred Metal device. Defaults to nil which indicates automatic selection
     */
    @Nullable
    @Generated
    @Selector("preferredMetalDevice")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice preferredMetalDevice();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set to YES to allow low precision accumulation on GPU when available. Defaults to NO
     */
    @Generated
    @Selector("setAllowLowPrecisionAccumulationOnGPU:")
    public native void setAllowLowPrecisionAccumulationOnGPU(boolean value);

    @Generated
    @Selector("setComputeUnits:")
    public native void setComputeUnits(@NInt long value);

    /**
     * Optional dictionary with any requested changes to model or update parameters
     */
    @Generated
    @Selector("setParameters:")
    public native void setParameters(@Nullable NSDictionary<? extends MLParameterKey, ?> value);

    /**
     * Set to specify a preferred Metal device. Defaults to nil which indicates automatic selection
     */
    @Generated
    @Selector("setPreferredMetalDevice:")
    public native void setPreferredMetalDevice(@Nullable @Mapped(ObjCObjectMapper.class) MTLDevice value);

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * A human readable name of a MLModel instance for display purposes.
     * 
     * Use this property to set a name of a model instance so that runtime analysis tools (e.g. Instruments and os_log)
     * can display that name in the user interface.
     * 
     * CoreML framework doesn't parse nor filter the text. It is the client's responsibility to use appropriate text,
     * which may involve localization and privacy considerations.
     * 
     * When the property is nil, CoreML framework provides a default.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("modelDisplayName")
    public native String modelDisplayName();

    /**
     * A human readable name of a MLModel instance for display purposes.
     * 
     * Use this property to set a name of a model instance so that runtime analysis tools (e.g. Instruments and os_log)
     * can display that name in the user interface.
     * 
     * CoreML framework doesn't parse nor filter the text. It is the client's responsibility to use appropriate text,
     * which may involve localization and privacy considerations.
     * 
     * When the property is nil, CoreML framework provides a default.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setModelDisplayName:")
    public native void setModelDisplayName(@Nullable String value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
