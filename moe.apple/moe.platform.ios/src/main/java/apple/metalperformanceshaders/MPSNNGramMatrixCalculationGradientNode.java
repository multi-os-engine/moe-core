package apple.metalperformanceshaders;

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
 * Node representing a @ref MPSNNGramMatrixCalculationGradient kernel
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNGramMatrixCalculationGradientNode extends MPSNNGradientFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNGramMatrixCalculationGradientNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNGramMatrixCalculationGradientNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNGramMatrixCalculationGradientNode allocWithZone(VoidPtr zone);

    /**
     * [@property] alpha
     * 
     * Scaling factor for the output. Default: 1.0f.
     */
    @Generated
    @Selector("alpha")
    public native float alpha();

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
    public native MPSNNGramMatrixCalculationGradientNode init();

    @Generated
    @Selector("initWithSourceGradient:sourceImage:gradientState:")
    public native MPSNNGramMatrixCalculationGradientNode initWithSourceGradientSourceImageGradientState(
            @NotNull MPSNNImageNode sourceGradient, @NotNull MPSNNImageNode sourceImage,
            @NotNull MPSNNGradientStateNode gradientState);

    @Generated
    @Selector("initWithSourceGradient:sourceImage:gradientState:alpha:")
    public native MPSNNGramMatrixCalculationGradientNode initWithSourceGradientSourceImageGradientStateAlpha(
            @NotNull MPSNNImageNode sourceGradient, @NotNull MPSNNImageNode sourceImage,
            @NotNull MPSNNGradientStateNode gradientState, float alpha);

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
    public static native MPSNNGramMatrixCalculationGradientNode new_objc();

    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:gradientState:")
    public static native MPSNNGramMatrixCalculationGradientNode nodeWithSourceGradientSourceImageGradientState(
            @NotNull MPSNNImageNode sourceGradient, @NotNull MPSNNImageNode sourceImage,
            @NotNull MPSNNGradientStateNode gradientState);

    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:gradientState:alpha:")
    public static native MPSNNGramMatrixCalculationGradientNode nodeWithSourceGradientSourceImageGradientStateAlpha(
            @NotNull MPSNNImageNode sourceGradient, @NotNull MPSNNImageNode sourceImage,
            @NotNull MPSNNGradientStateNode gradientState, float alpha);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
