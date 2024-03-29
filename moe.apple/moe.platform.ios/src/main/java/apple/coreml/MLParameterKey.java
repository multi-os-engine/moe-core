package apple.coreml;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A class to specify list of supported model update parameters.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLParameterKey extends MLKey {
    static {
        NatJ.register();
    }

    @Generated
    protected MLParameterKey(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLParameterKey alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLParameterKey allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Double parameter used to control the beta1 of Adam optimizer. Adjustable at load-time
     */
    @NotNull
    @Generated
    @Selector("beta1")
    public static native MLParameterKey beta1();

    /**
     * Double parameter used to control the beta2 of Adam optimizer. Adjustable at load-time
     */
    @NotNull
    @Generated
    @Selector("beta2")
    public static native MLParameterKey beta2();

    /**
     * MLMultiArray parameter returned when client requests for biases of a particular layer using a scoped parameter.
     */
    @NotNull
    @Generated
    @Selector("biases")
    public static native MLParameterKey biases();

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
     * Int64 parameter used to specify the number of epochs used by optimizer. Adjustable at load-time
     */
    @NotNull
    @Generated
    @Selector("epochs")
    public static native MLParameterKey epochs();

    /**
     * Double parameter used to control the epsilon of Adam optimizer. Adjustable at load-time
     */
    @NotNull
    @Generated
    @Selector("eps")
    public static native MLParameterKey eps();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLParameterKey init();

    @Generated
    @Selector("initWithCoder:")
    public native MLParameterKey initWithCoder(@NotNull NSCoder coder);

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
     * Double parameter used to control the learning rate of an optimizer. Adjustable in progress
     */
    @NotNull
    @Generated
    @Selector("learningRate")
    public static native MLParameterKey learningRate();

    /**
     * String parameter used to specify the name of a linked model
     */
    @NotNull
    @Generated
    @Selector("linkedModelFileName")
    public static native MLParameterKey linkedModelFileName();

    /**
     * String parameteru sed to specify the search path for a linked model
     */
    @NotNull
    @Generated
    @Selector("linkedModelSearchPath")
    public static native MLParameterKey linkedModelSearchPath();

    /**
     * Int64 parameter used to specify the size of a miniBatch used by optimizer. Adjustable at load-time
     */
    @NotNull
    @Generated
    @Selector("miniBatchSize")
    public static native MLParameterKey miniBatchSize();

    /**
     * Double parameter used to control the momentum of gradient based optimizers. Adjustable at load-time
     */
    @NotNull
    @Generated
    @Selector("momentum")
    public static native MLParameterKey momentum();

    @Generated
    @Owned
    @Selector("new")
    public static native MLParameterKey new_objc();

    /**
     * Int64 parameter used to specify the number of neighbors to use for class affinity (applicable to kNN). Not
     * adjustable in progress
     */
    @NotNull
    @Generated
    @Selector("numberOfNeighbors")
    public static native MLParameterKey numberOfNeighbors();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns a new MLParameterKey instance after adding additional scoping
     */
    @NotNull
    @Generated
    @Selector("scopedTo:")
    public native MLParameterKey scopedTo(@NotNull String scope);

    /**
     * Int64 parameter used to specify the seed to be used if shuffling data between epochs. Adjustable at load-time
     */
    @NotNull
    @Generated
    @Selector("seed")
    public static native MLParameterKey seed();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Bool parameter used to specify whether to shuffle the data between epochs. Adjustable at load-time
     */
    @NotNull
    @Generated
    @Selector("shuffle")
    public static native MLParameterKey shuffle();

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
     * MLMultiArray parameter returned when client requests for weights of a particular layer using a scoped parameter.
     */
    @NotNull
    @Generated
    @Selector("weights")
    public static native MLParameterKey weights();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
