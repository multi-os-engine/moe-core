package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
 * MLCConvolutionDescriptor
 * 
 * The MLCConvolutionDescriptor specifies a convolution descriptor
 * 
 * API-Since: 14.0
 * Deprecated-Since: 100000.0
 * Deprecated-Message: Use Metal Performance Shaders Graph or BNNS instead.
 */
@Deprecated
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCConvolutionDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCConvolutionDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCConvolutionDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCConvolutionDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * Create a MLCConvolutionDescriptor object for convolution transpose
     * 
     * @param kernelSizes               The kernel sizes in x and y
     * @param inputFeatureChannelCount  The number of feature channels in the input tensor
     * @param outputFeatureChannelCount The number of feature channels in the output tensor
     * @param groupCount                Number of groups
     * @param strides                   The kernel strides in x and y
     * @param dilationRates             The dilation rates in x and y
     * @param paddingPolicy             The padding policy
     * @param paddingSizes              The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @return A new MLCConvolutionDescriptor object.
     */
    @NotNull
    @Generated
    @Selector("convolutionTransposeDescriptorWithKernelSizes:inputFeatureChannelCount:outputFeatureChannelCount:groupCount:strides:dilationRates:paddingPolicy:paddingSizes:")
    public static native MLCConvolutionDescriptor convolutionTransposeDescriptorWithKernelSizesInputFeatureChannelCountOutputFeatureChannelCountGroupCountStridesDilationRatesPaddingPolicyPaddingSizes(
            @NotNull NSArray<? extends NSNumber> kernelSizes, @NUInt long inputFeatureChannelCount,
            @NUInt long outputFeatureChannelCount, @NUInt long groupCount, @NotNull NSArray<? extends NSNumber> strides,
            @NotNull NSArray<? extends NSNumber> dilationRates, int paddingPolicy,
            @Nullable NSArray<? extends NSNumber> paddingSizes);

    /**
     * Create a MLCConvolutionDescriptor object for convolution transpose
     * 
     * @param kernelSizes               The kernel sizes in x and y
     * @param inputFeatureChannelCount  The number of feature channels in the input tensor
     * @param outputFeatureChannelCount The number of feature channels in the output tensor
     * @param strides                   The kernel strides in x and y
     * @param paddingPolicy             The padding policy
     * @param paddingSizes              The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @return A new MLCConvolutionDescriptor object.
     */
    @NotNull
    @Generated
    @Selector("convolutionTransposeDescriptorWithKernelSizes:inputFeatureChannelCount:outputFeatureChannelCount:strides:paddingPolicy:paddingSizes:")
    public static native MLCConvolutionDescriptor convolutionTransposeDescriptorWithKernelSizesInputFeatureChannelCountOutputFeatureChannelCountStridesPaddingPolicyPaddingSizes(
            @NotNull NSArray<? extends NSNumber> kernelSizes, @NUInt long inputFeatureChannelCount,
            @NUInt long outputFeatureChannelCount, @NotNull NSArray<? extends NSNumber> strides, int paddingPolicy,
            @Nullable NSArray<? extends NSNumber> paddingSizes);

    /**
     * Create a MLCConvolutionDescriptor object for convolution transpose
     * 
     * @param kernelWidth               The kernel size in x
     * @param kernelHeight              The kernel size in x
     * @param inputFeatureChannelCount  The number of feature channels in the input tensor
     * @param outputFeatureChannelCount The number of feature channels in the output tensor
     * @return A new MLCConvolutionDescriptor object.
     */
    @NotNull
    @Generated
    @Selector("convolutionTransposeDescriptorWithKernelWidth:kernelHeight:inputFeatureChannelCount:outputFeatureChannelCount:")
    public static native MLCConvolutionDescriptor convolutionTransposeDescriptorWithKernelWidthKernelHeightInputFeatureChannelCountOutputFeatureChannelCount(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long inputFeatureChannelCount,
            @NUInt long outputFeatureChannelCount);

    /**
     * [@property] convolutionType
     * 
     * The type of convolution.
     */
    @Generated
    @Selector("convolutionType")
    public native int convolutionType();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Create a MLCConvolutionDescriptor object for depthwise convolution
     * 
     * @param kernelSizes              The kernel sizes in x and y
     * @param inputFeatureChannelCount The number of feature channels in the input tensor
     * @param channelMultiplier        The channel multiplier
     * @param strides                  The kernel strides in x and y
     * @param dilationRates            The dilation rates in x and y
     * @param paddingPolicy            The padding policy
     * @param paddingSizes             The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @return A new MLCConvolutionDescriptor object.
     */
    @NotNull
    @Generated
    @Selector("depthwiseConvolutionDescriptorWithKernelSizes:inputFeatureChannelCount:channelMultiplier:strides:dilationRates:paddingPolicy:paddingSizes:")
    public static native MLCConvolutionDescriptor depthwiseConvolutionDescriptorWithKernelSizesInputFeatureChannelCountChannelMultiplierStridesDilationRatesPaddingPolicyPaddingSizes(
            @NotNull NSArray<? extends NSNumber> kernelSizes, @NUInt long inputFeatureChannelCount,
            @NUInt long channelMultiplier, @NotNull NSArray<? extends NSNumber> strides,
            @NotNull NSArray<? extends NSNumber> dilationRates, int paddingPolicy,
            @Nullable NSArray<? extends NSNumber> paddingSizes);

    /**
     * Create a MLCConvolutionDescriptor object for depthwise convolution
     * 
     * @param kernelSizes              The kernel sizes in x and y
     * @param inputFeatureChannelCount The number of feature channels in the input tensor
     * @param channelMultiplier        The channel multiplier
     * @param strides                  The kernel strides in x and y
     * @param paddingPolicy            The padding policy
     * @param paddingSizes             The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @return A new MLCConvolutionDescriptor object.
     */
    @NotNull
    @Generated
    @Selector("depthwiseConvolutionDescriptorWithKernelSizes:inputFeatureChannelCount:channelMultiplier:strides:paddingPolicy:paddingSizes:")
    public static native MLCConvolutionDescriptor depthwiseConvolutionDescriptorWithKernelSizesInputFeatureChannelCountChannelMultiplierStridesPaddingPolicyPaddingSizes(
            @NotNull NSArray<? extends NSNumber> kernelSizes, @NUInt long inputFeatureChannelCount,
            @NUInt long channelMultiplier, @NotNull NSArray<? extends NSNumber> strides, int paddingPolicy,
            @Nullable NSArray<? extends NSNumber> paddingSizes);

    /**
     * Create a MLCConvolutionDescriptor object for depthwise convolution
     * 
     * @param kernelWidth              The kernel size in x
     * @param kernelHeight             The kernel size in x
     * @param inputFeatureChannelCount The number of feature channels in the input tensor
     * @param channelMultiplier        The channel multiplier
     * @return A new MLCConvolutionDescriptor object.
     */
    @NotNull
    @Generated
    @Selector("depthwiseConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannelCount:channelMultiplier:")
    public static native MLCConvolutionDescriptor depthwiseConvolutionDescriptorWithKernelWidthKernelHeightInputFeatureChannelCountChannelMultiplier(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long inputFeatureChannelCount,
            @NUInt long channelMultiplier);

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Create a MLCConvolutionDescriptor object
     * 
     * @param kernelSizes               The kernel sizes in x and y
     * @param inputFeatureChannelCount  The number of feature channels in the input tensor
     * @param outputFeatureChannelCount The number of feature channels in the output tensor
     * @param groupCount                Number of groups
     * @param strides                   The kernel strides in x and y
     * @param dilationRates             The dilation rates in x and y
     * @param paddingPolicy             The padding policy
     * @param paddingSizes              The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @return A new MLCConvolutionDescriptor object.
     */
    @Generated
    @Selector("descriptorWithKernelSizes:inputFeatureChannelCount:outputFeatureChannelCount:groupCount:strides:dilationRates:paddingPolicy:paddingSizes:")
    public static native MLCConvolutionDescriptor descriptorWithKernelSizesInputFeatureChannelCountOutputFeatureChannelCountGroupCountStridesDilationRatesPaddingPolicyPaddingSizes(
            @NotNull NSArray<? extends NSNumber> kernelSizes, @NUInt long inputFeatureChannelCount,
            @NUInt long outputFeatureChannelCount, @NUInt long groupCount, @NotNull NSArray<? extends NSNumber> strides,
            @NotNull NSArray<? extends NSNumber> dilationRates, int paddingPolicy,
            @Nullable NSArray<? extends NSNumber> paddingSizes);

    /**
     * Create a MLCConvolutionDescriptor object
     * 
     * @param kernelSizes               The kernel sizes in x and y
     * @param inputFeatureChannelCount  The number of feature channels in the input tensor
     * @param outputFeatureChannelCount The number of feature channels in the output tensor
     * @param strides                   The kernel strides in x and y
     * @param paddingPolicy             The padding policy
     * @param paddingSizes              The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @return A new MLCConvolutionDescriptor object.
     */
    @Generated
    @Selector("descriptorWithKernelSizes:inputFeatureChannelCount:outputFeatureChannelCount:strides:paddingPolicy:paddingSizes:")
    public static native MLCConvolutionDescriptor descriptorWithKernelSizesInputFeatureChannelCountOutputFeatureChannelCountStridesPaddingPolicyPaddingSizes(
            @NotNull NSArray<? extends NSNumber> kernelSizes, @NUInt long inputFeatureChannelCount,
            @NUInt long outputFeatureChannelCount, @NotNull NSArray<? extends NSNumber> strides, int paddingPolicy,
            @Nullable NSArray<? extends NSNumber> paddingSizes);

    /**
     * Create a MLCConvolutionDescriptor object
     * 
     * @param kernelWidth               The kernel size in x
     * @param kernelHeight              The kernel size in x
     * @param inputFeatureChannelCount  The number of feature channels in the input tensor
     * @param outputFeatureChannelCount The number of feature channels in the output tensor
     * @return A new MLCConvolutionDescriptor object.
     */
    @Generated
    @Selector("descriptorWithKernelWidth:kernelHeight:inputFeatureChannelCount:outputFeatureChannelCount:")
    public static native MLCConvolutionDescriptor descriptorWithKernelWidthKernelHeightInputFeatureChannelCountOutputFeatureChannelCount(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long inputFeatureChannelCount,
            @NUInt long outputFeatureChannelCount);

    /**
     * Creates a convolution descriptor with the specified convolution type.
     * 
     * @param convolutionType           The type of convolution.
     * @param kernelSizes               The kernel sizes in x and y.
     * @param inputFeatureChannelCount  The number of feature channels in the input tensor.
     * @param outputFeatureChannelCount The number of feature channels in the output tensor. When the convolution type
     *                                  is \p MLCConvolutionTypeDepthwise , this value must be a multiple of \p
     *                                  inputFeatureChannelCount .
     * @param groupCount                The number of groups.
     * @param strides                   The kernel strides in x and y.
     * @param dilationRates             The dilation rates in x and y.
     * @param paddingPolicy             The padding policy.
     * @param paddingSizes              The padding sizes in x and y if padding policy is \p
     *                                  MLCPaddingPolicyUsePaddingSize .
     * @return A new convolution descriptor.
     */
    @Generated
    @Selector("descriptorWithType:kernelSizes:inputFeatureChannelCount:outputFeatureChannelCount:groupCount:strides:dilationRates:paddingPolicy:paddingSizes:")
    public static native MLCConvolutionDescriptor descriptorWithTypeKernelSizesInputFeatureChannelCountOutputFeatureChannelCountGroupCountStridesDilationRatesPaddingPolicyPaddingSizes(
            int convolutionType, @NotNull NSArray<? extends NSNumber> kernelSizes, @NUInt long inputFeatureChannelCount,
            @NUInt long outputFeatureChannelCount, @NUInt long groupCount, @NotNull NSArray<? extends NSNumber> strides,
            @NotNull NSArray<? extends NSNumber> dilationRates, int paddingPolicy,
            @Nullable NSArray<? extends NSNumber> paddingSizes);

    /**
     * [@property] dilationRateInX
     * 
     * The dilation rate i.e. stride of elements in the kernel in x.
     */
    @Generated
    @Selector("dilationRateInX")
    @NUInt
    public native long dilationRateInX();

    /**
     * [@property] dilationRateInY
     * 
     * The dilation rate i.e. stride of elements in the kernel in y.
     */
    @Generated
    @Selector("dilationRateInY")
    @NUInt
    public native long dilationRateInY();

    /**
     * [@property] groupCount
     * 
     * Number of blocked connections from input channels to output channels
     */
    @Generated
    @Selector("groupCount")
    @NUInt
    public native long groupCount();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCConvolutionDescriptor init();

    /**
     * [@property] inputFeatureChannelCount
     * 
     * Number of channels in the input tensor
     */
    @Generated
    @Selector("inputFeatureChannelCount")
    @NUInt
    public native long inputFeatureChannelCount();

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
     * [@property] isConvolutionTranspose
     * 
     * A flag to indicate if this is a convolution transpose
     */
    @Generated
    @Selector("isConvolutionTranspose")
    public native boolean isConvolutionTranspose();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * [@property] kernelHeight
     * 
     * The convolution kernel size in y.
     */
    @Generated
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    /**
     * [@property] kernelWidth
     * 
     * The convolution kernel size in x.
     */
    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCConvolutionDescriptor new_objc();

    /**
     * [@property] outputFeatureChannelCount
     * 
     * Number of channels in the output tensor
     */
    @Generated
    @Selector("outputFeatureChannelCount")
    @NUInt
    public native long outputFeatureChannelCount();

    /**
     * [@property] paddingPolicy
     * 
     * The padding policy to use.
     */
    @Generated
    @Selector("paddingPolicy")
    public native int paddingPolicy();

    /**
     * [@property] paddingSizeInX
     * 
     * The pooling size in x (left and right) to use if paddingPolicy is MLCPaddingPolicyUsePaddingSize
     */
    @Generated
    @Selector("paddingSizeInX")
    @NUInt
    public native long paddingSizeInX();

    /**
     * [@property] paddingSizeInY
     * 
     * The pooling size in y (top and bottom) to use if paddingPolicy is MLCPaddingPolicyUsePaddingSize
     */
    @Generated
    @Selector("paddingSizeInY")
    @NUInt
    public native long paddingSizeInY();

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
     * [@property] strideInX
     * 
     * The stride of the kernel in x.
     */
    @Generated
    @Selector("strideInX")
    @NUInt
    public native long strideInX();

    /**
     * [@property] strideInY
     * 
     * The stride of the kernel in y.
     */
    @Generated
    @Selector("strideInY")
    @NUInt
    public native long strideInY();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] usesDepthwiseConvolution
     * 
     * A flag to indicate depthwise convolution
     */
    @Generated
    @Selector("usesDepthwiseConvolution")
    public native boolean usesDepthwiseConvolution();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
