package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSImageGuidedFilter
 * 
 * Perform Guided Filter to produce a coefficients image
 * The filter is broken into two stages:
 * - Regression
 * - Reconstruction
 * 
 * The regression stage learns a 4-channel "coefficient" texture (typically at a very low resolution),
 * and represents the per-pixel linear regression of the source texture to the guidance texture.
 * 
 * The reconstruction stage upsamples the coefficeints to the same size as the final output and
 * then at each pixel computes the inner product to produce the output.
 * 
 * The filter is broken into two stages to allow coefficients to be filtered (such as for example - temporally filtering
 * for video to prevent flicker).
 * 
 * There is also support for an optional weight texture that can be used to discard values in the source data.
 * 
 * Guided Filter is described at https://arxiv.org/pdf/1505.00996.pdf.
 * 
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageGuidedFilter extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageGuidedFilter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageGuidedFilter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageGuidedFilter allocWithZone(VoidPtr zone);

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Perform Guided Filter Reconstruction (inference) to produce the filtered output
     * 
     * The filter will not begin to execute until after the command buffer has been enqueued and committed.
     * 
     * [@pparam] sourceGuidanceTexture Input guidance pixel buffer. This should be a color (RGB) image.
     * [@pparam] coefficientsTexture Input coefficients texture generated generated by a previous
     * encodeRegressionToCommandBuffer
     * 
     * @param destinationTexture Output texture
     * 
     *                           Note: The coefficients are upsampled at the reconstruction of the filtered data.
     *                           Reconstruct(guidance RGB) = a.r * R + a.g * G + a.b * B + b, where a and b
     *                           are the coefficients learnt using encodeRegressionToCommandBuffer.
     * 
     *                           Final reconstructed value = value * reconstructScale + reconstructOffset
     */
    @Generated
    @Selector("encodeReconstructionToCommandBuffer:guidanceTexture:coefficientsTexture:destinationTexture:")
    public native void encodeReconstructionToCommandBufferGuidanceTextureCoefficientsTextureDestinationTexture(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture guidanceTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture coefficientsTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture);

    /**
     * Perform Guided Filter Regression (correlation) to produce a coefficients texture
     * 
     * The filter will not begin to execute until after the command buffer has been enqueued and committed.
     * 
     * @param commandBuffer                  A valid MTLCommandBuffer.
     * @param sourceTexture                  Input source texture to be filtered (typically a mask). This should be a
     *                                       single channel image.
     * @param guidanceTexture                Input guidance texture. This should be a color (RGB) image.
     * @param weightsTexture                 Optional input confidence texture. This should also a single channel image.
     * @param destinationCoefficientsTexture Output texture with four coefficients that minimize the mean squared error
     *                                       between
     *                                       the source and an affine function of guidance R, G, B.
     *                                       Note: The destinationCoefficientsTexture computes the linear cofficients
     *                                       "a" and "b". The "a" coefficient is
     *                                       stored in the RGB channels of destinationCoefficientsTexture and the "b"
     *                                       coefficient in the alpha chnanel.
     * 
     *                                       Set the MPSKernelOptionsAllowReducedPrecision in the "options" property for
     *                                       this kernel to peform the
     *                                       computations using half-precision arithmetic. This can potentially improve
     *                                       performance and/or power usage.
     */
    @Generated
    @Selector("encodeRegressionToCommandBuffer:sourceTexture:guidanceTexture:weightsTexture:destinationCoefficientsTexture:")
    public native void encodeRegressionToCommandBufferSourceTextureGuidanceTextureWeightsTextureDestinationCoefficientsTexture(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture guidanceTexture,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLTexture weightsTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture destinationCoefficientsTexture);

    /**
     * [@property] epsilon
     * 
     * The regularization parameter
     * 
     * The parameter used when computing the linear coefficients a and b.
     */
    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSImageGuidedFilter init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageGuidedFilter initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageGuidedFilter initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageGuidedFilter initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Specifies information to apply the guided filter regression.
     * 
     * @param device         The device the filter will run on
     * @param kernelDiameter The local window size
     * @return A valid MPSImageGuidedFilterRegression object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelDiameter:")
    public native MPSImageGuidedFilter initWithDeviceKernelDiameter(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelDiameter);

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

    /**
     * [@property] kernelDiameter
     * 
     * The local window size
     * 
     * The local window size.
     */
    @Generated
    @Selector("kernelDiameter")
    @NUInt
    public native long kernelDiameter();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSImageGuidedFilter new_objc();

    /**
     * [@property] reconstructOffset
     * 
     * The offset parameter
     * 
     * The offset parameter added to the result of the scaled reconstructed value.
     * The default value is 0.0f.
     */
    @Generated
    @Selector("reconstructOffset")
    public native float reconstructOffset();

    /**
     * [@property] reconstructScale
     * 
     * The scale parameter
     * 
     * The parameter used to scale the result of the reconstruction operation.
     * The default value is 1.0f.
     */
    @Generated
    @Selector("reconstructScale")
    public native float reconstructScale();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] epsilon
     * 
     * The regularization parameter
     * 
     * The parameter used when computing the linear coefficients a and b.
     */
    @Generated
    @Selector("setEpsilon:")
    public native void setEpsilon(float value);

    /**
     * [@property] reconstructOffset
     * 
     * The offset parameter
     * 
     * The offset parameter added to the result of the scaled reconstructed value.
     * The default value is 0.0f.
     */
    @Generated
    @Selector("setReconstructOffset:")
    public native void setReconstructOffset(float value);

    /**
     * [@property] reconstructScale
     * 
     * The scale parameter
     * 
     * The parameter used to scale the result of the reconstruction operation.
     * The default value is 1.0f.
     */
    @Generated
    @Selector("setReconstructScale:")
    public native void setReconstructScale(float value);

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
     * Perform Guided Filter Reconstruction (inference) to produce the filtered output
     * 
     * The filter will not begin to execute until after the command buffer has been enqueued and committed.
     * 
     * @param commandBuffer        A valid MTLCommandBuffer.
     * @param guidanceTexture      Input guidance pixel buffer.
     * @param coefficientsTextureA Input coefficients A texture generated generated by a previous
     *                             encodeRegressionToCommandBuffer.
     * @param coefficientsTextureB Input coefficients B texture generated generated by a previous
     *                             encodeRegressionToCommandBuffer.
     * @param destinationTexture   Output texture
     * 
     *                             API-Since: 13.2
     */
    @Generated
    @Selector("encodeReconstructionToCommandBuffer:guidanceTexture:coefficientsTextureA:coefficientsTextureB:destinationTexture:")
    public native void encodeReconstructionToCommandBufferGuidanceTextureCoefficientsTextureACoefficientsTextureBDestinationTexture(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture guidanceTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture coefficientsTextureA,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture coefficientsTextureB,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture);

    /**
     * Perform per-channel (non-color correlated) Guided Filter Regression (correlation) to produce a coefficients
     * texture
     * 
     * The filter will not begin to execute until after the command buffer has been enqueued and committed.
     * This encode call differs from the one above in that the correlations are not computed across channels
     * and therefore this filter computes two coefficient textures: ai and bi.
     * 
     * @param commandBuffer                   A valid MTLCommandBuffer.
     * @param sourceTexture                   Input source texture to be filtered.
     * @param guidanceTexture                 Input guidance texture. This should be a color (RGB) image.
     * @param weightsTexture                  Optional input confidence texture. This should be a single channel image.
     * @param destinationCoefficientsTextureA Output texture with four coefficients A that minimize the mean squared
     *                                        error between
     *                                        the source channels and an affine function of guidance channels.
     * @param destinationCoefficientsTextureB Output texture with four coefficients B that minimize the mean squared
     *                                        error between
     *                                        the source channels and an affine function of guidance channels.
     * 
     *                                        Set the MPSKernelOptionsAllowReducedPrecision in the "options" property
     *                                        for this kernel to peform the
     *                                        computations using half-precision arithmetic. This can potentially improve
     *                                        performance and/or power usage.
     * 
     *                                        API-Since: 13.2
     */
    @Generated
    @Selector("encodeRegressionToCommandBuffer:sourceTexture:guidanceTexture:weightsTexture:destinationCoefficientsTextureA:destinationCoefficientsTextureB:")
    public native void encodeRegressionToCommandBufferSourceTextureGuidanceTextureWeightsTextureDestinationCoefficientsTextureADestinationCoefficientsTextureB(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture guidanceTexture,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLTexture weightsTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture destinationCoefficientsTextureA,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture destinationCoefficientsTextureB);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
