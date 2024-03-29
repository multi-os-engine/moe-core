package apple.mlcompute;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MLCMultiheadAttentionLayer
 * 
 * A multi-head attention layer
 * 
 * A multi-head "Scaled Dot-Product Attention" layer which attends to one or more entries in the input key-value pairs
 * N=Batch, S=source length, L=target length, E = model(embedding) dimension, K = Key dimension, V = value
 * dimension H = headCount. The sources to this layer are of shapes: Query:(N,L,E), Key:(N,S,K), Value:(N,S,V),
 * KeyMask:(N,S), AttentionMask:(1,L,S) or (NxH,L,S). KeyMask and AttentionMask are optional and either, both
 * or none of them can be passed. KeyMask is of Boolean type and AttentionMask can be of Float or Boolean type.
 * Output is of shape:(N,L,E).
 * For details refer to: https://pytorch.org/docs/stable/nn.html#multiheadattention
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
public class MLCMultiheadAttentionLayer extends MLCLayer {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCMultiheadAttentionLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCMultiheadAttentionLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCMultiheadAttentionLayer allocWithZone(VoidPtr zone);

    /**
     * [@property] attentionBiases
     * 
     * The biases added to key and value
     */
    @Nullable
    @Generated
    @Selector("attentionBiases")
    public native NSArray<? extends MLCTensor> attentionBiases();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] biases
     * 
     * The biases of query, key, value and output projections
     */
    @Nullable
    @Generated
    @Selector("biases")
    public native NSArray<? extends MLCTensor> biases();

    /**
     * [@property] biasesParameters
     * 
     * The biases tensor parameters used for optimizer update
     */
    @Nullable
    @Generated
    @Selector("biasesParameters")
    public native NSArray<? extends MLCTensorParameter> biasesParameters();

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
     * [@property] descriptor
     * 
     * The multi-head attention descriptor
     */
    @NotNull
    @Generated
    @Selector("descriptor")
    public native MLCMultiheadAttentionDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCMultiheadAttentionLayer init();

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
     * Create a multi-head attention layer
     * 
     * @param weights         weights corresponding to query, key, value and output projections for all heads
     * @param biases          Optional, biases corresponding to query, key, value and output projections for all heads
     * @param attentionBiases Optional, An array of biases added to the key and value respectively
     * @return A new MultiheadAttention layer
     */
    @Generated
    @Selector("layerWithDescriptor:weights:biases:attentionBiases:")
    public static native MLCMultiheadAttentionLayer layerWithDescriptorWeightsBiasesAttentionBiases(
            @NotNull MLCMultiheadAttentionDescriptor descriptor, @NotNull NSArray<? extends MLCTensor> weights,
            @Nullable NSArray<? extends MLCTensor> biases, @Nullable NSArray<? extends MLCTensor> attentionBiases);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCMultiheadAttentionLayer new_objc();

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
    @Selector("supportsDataType:onDevice:")
    public static native boolean supportsDataTypeOnDevice(int dataType, @NotNull MLCDevice device);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] weights
     * 
     * The weights of query, key, value and output projections
     */
    @NotNull
    @Generated
    @Selector("weights")
    public native NSArray<? extends MLCTensor> weights();

    /**
     * [@property] weightsParameters
     * 
     * The weights tensor parameters used for optimizer update
     */
    @NotNull
    @Generated
    @Selector("weightsParameters")
    public native NSArray<? extends MLCTensorParameter> weightsParameters();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
