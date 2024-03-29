package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSCNNConvolutionDataSource;
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
import org.moe.natj.general.ptr.ConstFloatPtr;
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
 * A MPSNNFilterNode representing a MPSCNNBinaryConvolution kernel
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNBinaryConvolutionNode extends MPSCNNConvolutionNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNBinaryConvolutionNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNBinaryConvolutionNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNBinaryConvolutionNode allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNBinaryConvolutionNode init();

    @Generated
    @Selector("initWithSource:weights:")
    public native MPSCNNBinaryConvolutionNode initWithSourceWeights(@NotNull MPSNNImageNode sourceNode,
            @NotNull @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);

    /**
     * Init a node representing a MPSCNNBinaryConvolution kernel
     * 
     * @param sourceNode The MPSNNImageNode representing the source MPSImage for the filter
     * @param weights    A pointer to a valid object conforming to the MPSCNNConvolutionDataSource
     *                   protocol. This object is provided by you to encapsulate storage for
     *                   convolution weights and biases.
     * @param scaleValue A floating point value used to scale the entire convolution.
     * @param type       What kind of binarization strategy is to be used.
     * @param flags      See documentation of MPSCNNBinaryConvolutionFlags.
     * @return A new MPSNNFilter node for a MPSCNNBinaryConvolution kernel.
     */
    @Generated
    @Selector("initWithSource:weights:scaleValue:type:flags:")
    public native MPSCNNBinaryConvolutionNode initWithSourceWeightsScaleValueTypeFlags(
            @NotNull MPSNNImageNode sourceNode,
            @NotNull @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights, float scaleValue,
            @NUInt long type, @NUInt long flags);

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
    public static native MPSCNNBinaryConvolutionNode new_objc();

    @Generated
    @Selector("nodeWithSource:weights:")
    public static native MPSCNNBinaryConvolutionNode nodeWithSourceWeights(@NotNull MPSNNImageNode sourceNode,
            @NotNull @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);

    /**
     * Init an autoreleased node representing a MPSCNNBinaryConvolution kernel
     * 
     * @param sourceNode The MPSNNImageNode representing the source MPSImage for the filter
     * @param weights    A pointer to a valid object conforming to the MPSCNNConvolutionDataSource
     *                   protocol. This object is provided by you to encapsulate storage for
     *                   convolution weights and biases.
     * @param scaleValue A floating point value used to scale the entire convolution.
     * @param type       What kind of binarization strategy is to be used.
     * @param flags      See documentation of MPSCNNBinaryConvolutionFlags.
     * @return A new MPSNNFilter node for a MPSCNNBinaryConvolution kernel.
     */
    @Generated
    @Selector("nodeWithSource:weights:scaleValue:type:flags:")
    public static native MPSCNNBinaryConvolutionNode nodeWithSourceWeightsScaleValueTypeFlags(
            @NotNull MPSNNImageNode sourceNode,
            @NotNull @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights, float scaleValue,
            @NUInt long type, @NUInt long flags);

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Init a node representing a MPSCNNBinaryConvolution kernel
     * 
     * @param sourceNode       The MPSNNImageNode representing the source MPSImage for the filter
     * @param weights          A pointer to a valid object conforming to the MPSCNNConvolutionDataSource
     *                         protocol. This object is provided by you to encapsulate storage for
     *                         convolution weights and biases.
     * @param outputBiasTerms  A pointer to bias terms to be applied to the convolution output.
     *                         See MPSCNNBinaryConvolution for more details.
     * @param outputScaleTerms A pointer to scale terms to be applied to binary convolution
     *                         results per output feature channel. See MPSCNNBinaryConvolution for more details.
     * @param inputBiasTerms   A pointer to offset terms to be applied to the input before convolution and
     *                         before input scaling. See MPSCNNBinaryConvolution for more details.
     * @param inputScaleTerms  A pointer to scale terms to be applied to the input before convolution,
     *                         but after input biasing. See MPSCNNBinaryConvolution for more details.
     * @param type             What kind of binarization strategy is to be used.
     * @param flags            See documentation of MPSCNNBinaryConvolutionFlags.
     * @return A new MPSNNFilter node for a MPSCNNBinaryConvolution kernel.
     * 
     *         API-Since: 11.3
     */
    @Generated
    @Selector("initWithSource:weights:outputBiasTerms:outputScaleTerms:inputBiasTerms:inputScaleTerms:type:flags:")
    public native MPSCNNBinaryConvolutionNode initWithSourceWeightsOutputBiasTermsOutputScaleTermsInputBiasTermsInputScaleTermsTypeFlags(
            @NotNull MPSNNImageNode sourceNode,
            @NotNull @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights,
            @Nullable ConstFloatPtr outputBiasTerms, @Nullable ConstFloatPtr outputScaleTerms,
            @Nullable ConstFloatPtr inputBiasTerms, @Nullable ConstFloatPtr inputScaleTerms, @NUInt long type,
            @NUInt long flags);

    /**
     * Init an autoreleased node representing a MPSCNNBinaryConvolution kernel
     * 
     * @param sourceNode       The MPSNNImageNode representing the source MPSImage for the filter
     * @param weights          A pointer to a valid object conforming to the MPSCNNConvolutionDataSource
     *                         protocol. This object is provided by you to encapsulate storage for
     *                         convolution weights and biases.
     * @param outputBiasTerms  A pointer to bias terms to be applied to the convolution output.
     *                         See MPSCNNBinaryConvolution for more details.
     * @param outputScaleTerms A pointer to scale terms to be applied to binary convolution
     *                         results per output feature channel. See MPSCNNBinaryConvolution for more details.
     * @param inputBiasTerms   A pointer to offset terms to be applied to the input before convolution and
     *                         before input scaling. See MPSCNNBinaryConvolution for more details.
     * @param inputScaleTerms  A pointer to scale terms to be applied to the input before convolution,
     *                         but after input biasing. See MPSCNNBinaryConvolution for more details.
     * @param type             What kind of binarization strategy is to be used.
     * @param flags            See documentation of MPSCNNBinaryConvolutionFlags.
     * @return A new MPSNNFilter node for a MPSCNNBinaryConvolution kernel.
     * 
     *         API-Since: 11.3
     */
    @Generated
    @Selector("nodeWithSource:weights:outputBiasTerms:outputScaleTerms:inputBiasTerms:inputScaleTerms:type:flags:")
    public static native MPSCNNBinaryConvolutionNode nodeWithSourceWeightsOutputBiasTermsOutputScaleTermsInputBiasTermsInputScaleTermsTypeFlags(
            @NotNull MPSNNImageNode sourceNode,
            @NotNull @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights,
            @Nullable ConstFloatPtr outputBiasTerms, @Nullable ConstFloatPtr outputScaleTerms,
            @Nullable ConstFloatPtr inputBiasTerms, @Nullable ConstFloatPtr inputScaleTerms, @NUInt long type,
            @NUInt long flags);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
