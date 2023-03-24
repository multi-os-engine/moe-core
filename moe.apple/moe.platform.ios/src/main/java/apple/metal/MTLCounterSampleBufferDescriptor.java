package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLCounterSet;
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

/**
 * [@interface] MTLCounterSampleBufferDescriptor
 * 
 * Object to represent the counter state.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLCounterSampleBufferDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLCounterSampleBufferDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLCounterSampleBufferDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLCounterSampleBufferDescriptor allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] counterSet The counterset to be sampled for this counter sample buffer
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("counterSet")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCounterSet counterSet();

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
    public native MTLCounterSampleBufferDescriptor init();

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

    /**
     * [@property] label A label to identify the sample buffer in debugging tools.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native MTLCounterSampleBufferDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] sampleCount The number of samples that may be stored in the
     * counter sample buffer.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("sampleCount")
    @NUInt
    public native long sampleCount();

    /**
     * [@property] counterSet The counterset to be sampled for this counter sample buffer
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setCounterSet:")
    public native void setCounterSet(@Nullable @Mapped(ObjCObjectMapper.class) MTLCounterSet value);

    /**
     * [@property] label A label to identify the sample buffer in debugging tools.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(@NotNull String value);

    /**
     * [@property] sampleCount The number of samples that may be stored in the
     * counter sample buffer.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSampleCount:")
    public native void setSampleCount(@NUInt long value);

    /**
     * [@property] storageMode The storage mode for the sample buffer. Only
     * MTLStorageModeShared and MTLStorageModePrivate may be used.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setStorageMode:")
    public native void setStorageMode(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] storageMode The storage mode for the sample buffer. Only
     * MTLStorageModeShared and MTLStorageModePrivate may be used.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("storageMode")
    @NUInt
    public native long storageMode();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
