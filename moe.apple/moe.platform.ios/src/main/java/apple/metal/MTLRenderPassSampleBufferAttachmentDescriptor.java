package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLCounterSampleBuffer;
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
 * API-Since: 14.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLRenderPassSampleBufferAttachmentDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLRenderPassSampleBufferAttachmentDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLRenderPassSampleBufferAttachmentDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLRenderPassSampleBufferAttachmentDescriptor allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] endOfFragmentSampleIndex
     * 
     * The sample index to use to store the sample taken at the end of
     * fragment processing. Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * 
     * On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a render pass will fail.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("endOfFragmentSampleIndex")
    @NUInt
    public native long endOfFragmentSampleIndex();

    /**
     * [@property] endOfVertexSampleIndex
     * 
     * The sample index to use to store the sample taken at the end of
     * vertex processing. Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * 
     * On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a render pass will fail.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("endOfVertexSampleIndex")
    @NUInt
    public native long endOfVertexSampleIndex();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTLRenderPassSampleBufferAttachmentDescriptor init();

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
    public static native MTLRenderPassSampleBufferAttachmentDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] sampleBuffer
     * 
     * The sample buffer to store samples for the render-pass defined samples.
     * If sampleBuffer is non-nil, the sample indices will be used to store samples into
     * the sample buffer. If no sample buffer is provided, no samples will be taken.
     * If any of the sample indices are specified as MTLCounterDontSample, no sample
     * will be taken for that action.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("sampleBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCounterSampleBuffer sampleBuffer();

    /**
     * [@property] endOfFragmentSampleIndex
     * 
     * The sample index to use to store the sample taken at the end of
     * fragment processing. Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * 
     * On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a render pass will fail.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setEndOfFragmentSampleIndex:")
    public native void setEndOfFragmentSampleIndex(@NUInt long value);

    /**
     * [@property] endOfVertexSampleIndex
     * 
     * The sample index to use to store the sample taken at the end of
     * vertex processing. Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * 
     * On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a render pass will fail.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setEndOfVertexSampleIndex:")
    public native void setEndOfVertexSampleIndex(@NUInt long value);

    /**
     * [@property] sampleBuffer
     * 
     * The sample buffer to store samples for the render-pass defined samples.
     * If sampleBuffer is non-nil, the sample indices will be used to store samples into
     * the sample buffer. If no sample buffer is provided, no samples will be taken.
     * If any of the sample indices are specified as MTLCounterDontSample, no sample
     * will be taken for that action.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSampleBuffer:")
    public native void setSampleBuffer(@Nullable @Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer value);

    /**
     * [@property] startOfFragmentSampleIndex
     * 
     * The sample index to use to store the sample taken at the start of
     * fragment processing. Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * 
     * On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a render pass will fail.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setStartOfFragmentSampleIndex:")
    public native void setStartOfFragmentSampleIndex(@NUInt long value);

    /**
     * [@property] startOfVertexSampleIndex
     * 
     * The sample index to use to store the sample taken at the start of
     * vertex processing. Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * 
     * On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a render pass will fail.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setStartOfVertexSampleIndex:")
    public native void setStartOfVertexSampleIndex(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] startOfFragmentSampleIndex
     * 
     * The sample index to use to store the sample taken at the start of
     * fragment processing. Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * 
     * On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a render pass will fail.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("startOfFragmentSampleIndex")
    @NUInt
    public native long startOfFragmentSampleIndex();

    /**
     * [@property] startOfVertexSampleIndex
     * 
     * The sample index to use to store the sample taken at the start of
     * vertex processing. Setting the value to MTLCounterDontSample will cause
     * this sample to be omitted.
     * 
     * On devices where MTLCounterSamplingPointAtStageBoundary is unsupported,
     * this sample index is invalid and must be set to MTLCounterDontSample or creation of a render pass will fail.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("startOfVertexSampleIndex")
    @NUInt
    public native long startOfVertexSampleIndex();

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
