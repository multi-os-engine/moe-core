package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.struct.MTLSize;
import apple.metalperformanceshaders.protocol.MPSImageTransformProvider;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * Abstract Node representing a image resampling operation
 * 
 * Please make a MPSNNBilinearScale or MPSNNLanczosScale object instead
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNScaleNode extends MPSNNFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNScaleNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNScaleNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNScaleNode allocWithZone(VoidPtr zone);

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
    public native MPSNNScaleNode init();

    /**
     * init a node to convert a MPSImage to the desired size
     * 
     * @param sourceNode A valid MPSNNImageNode
     * @param size       The size of the output image {width, height, depth}
     */
    @Generated
    @Selector("initWithSource:outputSize:")
    public native MPSNNScaleNode initWithSourceOutputSize(@NotNull MPSNNImageNode sourceNode, @ByValue MTLSize size);

    /**
     * init a node to convert a MPSImage to the desired size for a region of interest
     * 
     * @param sourceNode        A valid MPSNNImageNode
     * @param transformProvider If non-nil, a valid MPSImageTransformProvider that provides the region of interest
     * @param size              The size of the output image {width, height, depth}
     */
    @Generated
    @Selector("initWithSource:transformProvider:outputSize:")
    public native MPSNNScaleNode initWithSourceTransformProviderOutputSize(@NotNull MPSNNImageNode sourceNode,
            @Nullable @Mapped(ObjCObjectMapper.class) MPSImageTransformProvider transformProvider,
            @ByValue MTLSize size);

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
    public static native MPSNNScaleNode new_objc();

    /**
     * create an autoreleased node to convert a MPSImage to the desired size
     * 
     * @param sourceNode A valid MPSNNImageNode
     * @param size       The size of the output image {width, height, depth}
     */
    @Generated
    @Selector("nodeWithSource:outputSize:")
    public static native MPSNNScaleNode nodeWithSourceOutputSize(@NotNull MPSNNImageNode sourceNode,
            @ByValue MTLSize size);

    /**
     * create an autoreleased node to convert a MPSImage to the desired size for a region of interest
     * 
     * @param sourceNode        A valid MPSNNImageNode
     * @param transformProvider If non-nil, a valid MPSImageTransformProvider that provides the region of interest
     * @param size              The size of the output image {width, height, depth}
     */
    @Generated
    @Selector("nodeWithSource:transformProvider:outputSize:")
    public static native MPSNNScaleNode nodeWithSourceTransformProviderOutputSize(@NotNull MPSNNImageNode sourceNode,
            @Nullable @Mapped(ObjCObjectMapper.class) MPSImageTransformProvider transformProvider,
            @ByValue MTLSize size);

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
