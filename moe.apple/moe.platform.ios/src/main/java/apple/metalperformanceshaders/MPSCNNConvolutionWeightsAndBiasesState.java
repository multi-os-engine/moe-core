package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLTextureDescriptor;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLResource;
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
 * MPSCNNConvolutionWeightsAndBiasesState
 * 
 * The MPSCNNConvolutionWeightsAndBiasesState is returned by exportWeightsAndBiasesWithCommandBuffer: method on
 * MPSCNNConvolution object.
 * This is mainly used for GPU side weights/biases update process.
 * During training, application can keep a copy of weights, velocity, momentum MTLBuffers in its data source, update the
 * weights (in-place or out of place)
 * with gradients obtained from MPSCNNConvolutionGradientState and call [MPSCNNConvolution
 * reloadWeightsAndBiasesWithCommandBuffer] with resulting updated
 * MTLBuffer. If application does not want to keep a copy of weights/biases, it can call [MPSCNNConvolution
 * exportWeightsAndBiasesWithCommandBuffer:] to get
 * the current weights from convolution itself, do the updated and call reloadWithCommandBuffer.
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNConvolutionWeightsAndBiasesState extends MPSState {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNConvolutionWeightsAndBiasesState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNConvolutionWeightsAndBiasesState alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNConvolutionWeightsAndBiasesState allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] biases
     * 
     * A buffer that contains the biases. Each value is float and there are ouputFeatureChannels values.
     */
    @Nullable
    @Generated
    @Selector("biases")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer biases();

    /**
     * [@property] biasesOffset
     * 
     * Offset at which weights start in biases buffer
     * Default value is 0.
     */
    @Generated
    @Selector("biasesOffset")
    @NUInt
    public native long biasesOffset();

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
    public native MPSCNNConvolutionWeightsAndBiasesState init();

    @Generated
    @Selector("initWithDevice:bufferSize:")
    public native MPSCNNConvolutionWeightsAndBiasesState initWithDeviceBufferSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long bufferSize);

    /**
     * Create and initialize MPSCNNConvolutionWeightsAndBiasesState with application provided convolution descriptor
     * 
     * Create weights and biases buffers of appropriate size
     */
    @Generated
    @Selector("initWithDevice:cnnConvolutionDescriptor:")
    public native MPSCNNConvolutionWeightsAndBiasesState initWithDeviceCnnConvolutionDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MPSCNNConvolutionDescriptor descriptor);

    @Generated
    @Selector("initWithDevice:resourceList:")
    public native MPSCNNConvolutionWeightsAndBiasesState initWithDeviceResourceList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MPSStateResourceList resourceList);

    @Generated
    @Selector("initWithDevice:textureDescriptor:")
    public native MPSCNNConvolutionWeightsAndBiasesState initWithDeviceTextureDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull MTLTextureDescriptor descriptor);

    @Generated
    @Selector("initWithResource:")
    public native MPSCNNConvolutionWeightsAndBiasesState initWithResource(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLResource resource);

    @Generated
    @Selector("initWithResources:")
    public native MPSCNNConvolutionWeightsAndBiasesState initWithResources(@Nullable NSArray<?> resources);

    /**
     * Create and initialize MPSCNNConvolutionWeightsAndBiasesState with application
     * provided weights and biases buffers.
     * 
     * This is the convinience API when buffers of exact size i.e.
     * [weights length] = inputFeatureChannels*kernelWidth*kernelHeight*channelMultiplier*sizeof(float) // for depthwise
     * convolution
     * outputFeatureChannels*kernelWidth*kernelHeight*(inputChannels/groups)*sizeof(float) // for regular otherwise
     * and [biases length] = outputFeatureChannels*sizeof(float)
     */
    @Generated
    @Selector("initWithWeights:biases:")
    public native MPSCNNConvolutionWeightsAndBiasesState initWithWeightsBiases(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer weights,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer biases);

    /**
     * Create and initialize MPSCNNConvolutionWeightsAndBiasesState with application
     * provided weights and biases buffers.
     * 
     * It gives finer allocation control to application e.g. application can pass same buffer for weights and biases
     * with
     * appropriate offsets. Or offset into some larger buffer from application managed heap etc. Number of weights
     * and biases or the length of weights and biases buffer this object owns (will read or write to), starting at
     * offset is
     * determined by MPSCNNConvolutionDescriptor passed in.
     * weightsLength = inputFeatureChannels*kernelWidth*kernelHeight*channelMultiplier*sizeof(float) // for depthwise
     * convolution
     * outputFeatureChannels*kernelWidth*kernelHeight*(inputChannels/groups)*sizeof(float) // for regular otherwise
     * biasesLength = outputFeatureChannels*sizeof(float)
     * Thus filters operating on this object will read or write to NSRange(weightsOffset, weightsLength) of weights
     * buffer
     * and NSRange(biasesOffset, biasesLength) of biases buffer. Thus sizes of buffers provided must be such that
     * weightsOffset + weightsLength <= [weights length]
     * and biasesOffset + biasesLength <= [biases length]
     * Offsets must of sizeof(float) aligned i.e. multiple of 4.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithWeights:weightsOffset:biases:biasesOffset:cnnConvolutionDescriptor:")
    public native MPSCNNConvolutionWeightsAndBiasesState initWithWeightsWeightsOffsetBiasesBiasesOffsetCnnConvolutionDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer weights, @NUInt long weightsOffset,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer biases, @NUInt long biasesOffset,
            @NotNull MPSCNNConvolutionDescriptor descriptor);

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
    public static native MPSCNNConvolutionWeightsAndBiasesState new_objc();

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
     * Create and initialize temporary MPSCNNConvolutionWeightsAndBiasesState with application provided convolution
     * descriptor
     * 
     * Create weights and biases buffers of appropriate size from command buffer cache.
     */
    @NotNull
    @Generated
    @Selector("temporaryCNNConvolutionWeightsAndBiasesStateWithCommandBuffer:cnnConvolutionDescriptor:")
    public static native MPSCNNConvolutionWeightsAndBiasesState temporaryCNNConvolutionWeightsAndBiasesStateWithCommandBufferCnnConvolutionDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MPSCNNConvolutionDescriptor descriptor);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:")
    public static native MPSCNNConvolutionWeightsAndBiasesState temporaryStateWithCommandBuffer(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:bufferSize:")
    public static native MPSCNNConvolutionWeightsAndBiasesState temporaryStateWithCommandBufferBufferSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NUInt long bufferSize);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:resourceList:")
    public static native MPSCNNConvolutionWeightsAndBiasesState temporaryStateWithCommandBufferResourceList(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MPSStateResourceList resourceList);

    @NotNull
    @Generated
    @Selector("temporaryStateWithCommandBuffer:textureDescriptor:")
    public static native MPSCNNConvolutionWeightsAndBiasesState temporaryStateWithCommandBufferTextureDescriptor(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NotNull MTLTextureDescriptor descriptor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] weights
     * 
     * A buffer that contains the weights.
     * Each value in the buffer is a float. The layout of the weights with respect to the weights is the same as
     * the weights layout provided by data source i.e. it can be interpreted as 4D array
     * 
     * weights[outputFeatureChannels][kernelHeight][kernelWidth][inputFeatureChannels/groups]
     * for regular convolution. For depthwise convolution
     * weights[outputFeatureChannels][kernelHeight][kernelWidth] as we currently only support channel multiplier of 1.
     */
    @NotNull
    @Generated
    @Selector("weights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer weights();

    /**
     * [@property] weightsOffset
     * 
     * Offset at which weights start in weights buffer
     * Default value is 0.
     */
    @Generated
    @Selector("weightsOffset")
    @NUInt
    public native long weightsOffset();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
