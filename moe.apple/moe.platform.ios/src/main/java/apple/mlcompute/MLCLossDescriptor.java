package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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

/**
 * MLCLossDescriptor
 * <p>
 * The MLCLossDescriptor specifies a loss filter descriptor.
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCLossDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCLossDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCLossDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * [@property]    numberOfClasses
     * <p>
     * The number of classes parameter. The default value is 1.
     * <p>
     * This parameter is valid only for the loss function MLCLossTypeSoftmaxCrossEntropy.
     */
    @Generated
    @Selector("classCount")
    @NUInt
    public native long classCount();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property]    delta
     * <p>
     * The delta parameter. The default value is 1.0f.
     * <p>
     * This parameter is valid only for the loss function MLCLossTypeHuber.
     */
    @Generated
    @Selector("delta")
    public native float delta();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Create a loss descriptor object
     *
     * @param lossType      The loss function.
     * @param reductionType The reduction operation
     * @return A new MLCLossDescriptor object
     */
    @Generated
    @Selector("descriptorWithType:reductionType:")
    public static native MLCLossDescriptor descriptorWithTypeReductionType(int lossType, int reductionType);

    /**
     * Create a loss descriptor object
     *
     * @param lossType      The loss function.
     * @param reductionType The reduction operation
     * @param weight        The scale factor to apply to each element of a result.
     * @return A new MLCLossDescriptor object
     */
    @Generated
    @Selector("descriptorWithType:reductionType:weight:")
    public static native MLCLossDescriptor descriptorWithTypeReductionTypeWeight(int lossType, int reductionType,
            float weight);

    /**
     * Create a loss descriptor object
     *
     * @param lossType       The loss function.
     * @param reductionType  The reduction operation
     * @param weight         The scale factor to apply to each element of a result.
     * @param labelSmoothing The label smoothing parameter.
     * @param classCount     The number of classes parameter.
     * @return A new MLCLossDescriptor object
     */
    @Generated
    @Selector("descriptorWithType:reductionType:weight:labelSmoothing:classCount:")
    public static native MLCLossDescriptor descriptorWithTypeReductionTypeWeightLabelSmoothingClassCount(int lossType,
            int reductionType, float weight, float labelSmoothing, @NUInt long classCount);

    /**
     * Create a loss descriptor object
     *
     * @param lossType       The loss function.
     * @param reductionType  The reduction operation
     * @param weight         The scale factor to apply to each element of a result.
     * @param labelSmoothing The label smoothing parameter.
     * @param classCount     The number of classes parameter.
     * @param epsilon        The epsilon used by LogLoss
     * @param delta          The delta parameter used by Huber loss
     * @return A new MLCLossDescriptor object
     */
    @Generated
    @Selector("descriptorWithType:reductionType:weight:labelSmoothing:classCount:epsilon:delta:")
    public static native MLCLossDescriptor descriptorWithTypeReductionTypeWeightLabelSmoothingClassCountEpsilonDelta(
            int lossType, int reductionType, float weight, float labelSmoothing, @NUInt long classCount, float epsilon,
            float delta);

    /**
     * [@property]    epsilon
     * <p>
     * The epsilon parameter. The default value is 1e-7.
     * <p>
     * This parameter is valid only for the loss function MLCLossTypeLog.
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
    public native MLCLossDescriptor init();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property]    labelSmoothing
     * <p>
     * The label smoothing parameter. The default value is 0.0.
     * <p>
     * This parameter is valid only for the loss functions of the following type(s):
     * MLCLossTypeSoftmaxCrossEntropy and MLCLossTypeSigmoidCrossEntropy.
     */
    @Generated
    @Selector("labelSmoothing")
    public native float labelSmoothing();

    /**
     * [@property]   lossType
     * <p>
     * Specifies the loss function.
     */
    @Generated
    @Selector("lossType")
    public native int lossType();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * [@property]   reductionType
     * <p>
     * The reduction operation performed by the loss function.
     */
    @Generated
    @Selector("reductionType")
    public native int reductionType();

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
     * [@property]   weight
     * <p>
     * The scale factor to apply to each element of a result.  The default value is 1.0.
     */
    @Generated
    @Selector("weight")
    public native float weight();
}
