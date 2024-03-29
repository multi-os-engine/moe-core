package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * MPSNNReshape
 * [@dependency] This depends on Metal.framework
 * 
 * Describes a reshape operation
 * 
 * This functions copies data from source MPSImage intot the new shape in the destination MPSImage
 * 
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNReshape extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNReshape(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNReshape alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNReshape allocWithZone(VoidPtr zone);

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
    public native MPSNNReshape init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNReshape initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNReshape initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a MPSNNReshape kernel
     * 
     * @param device The device the filter will run on
     * @return A valid MPSNNReshape object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSNNReshape initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSNNReshape new_objc();

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
     * Encode a reshape to a command buffer for a given shape.
     * 
     * @param commandBuffer           The command buffer on which to encode the reshape operation.
     * @param outState                A state to be created and autoreleased which will hold information about this
     *                                execution
     *                                to be provided to a subsequent gradient pass.
     * @param isTemporary             YES if the state is to be created as a temporary state, NO otherwise.
     * @param sourceImage             The input image to be reshaped.
     * @param reshapedWidth           The width of the resulting reshaped image.
     * @param reshapedHeight          The height of the resulting reshaped image.
     * @param reshapedFeatureChannels The number of feature channels in the resulting reshaped image.
     * 
     *                                API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:destinationState:destinationStateIsTemporary:reshapedWidth:reshapedHeight:reshapedFeatureChannels:")
    public native MPSImage encodeToCommandBufferSourceImageDestinationStateDestinationStateIsTemporaryReshapedWidthReshapedHeightReshapedFeatureChannels(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @NotNull @ReferenceInfo(type = MPSState.class) Ptr<MPSState> outState, boolean isTemporary,
            @NUInt long reshapedWidth, @NUInt long reshapedHeight, @NUInt long reshapedFeatureChannels);

    /**
     * Encode a reshape to a command buffer for a given shape.
     * 
     * @param commandBuffer           The command buffer on which to encode the reshape operation.
     * @param sourceImage             The input image to be reshaped.
     * @param reshapedWidth           The width of the resulting reshaped image.
     * @param reshapedHeight          The height of the resulting reshaped image.
     * @param reshapedFeatureChannels The number of feature channels in the resulting reshaped image.
     * 
     *                                API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:reshapedWidth:reshapedHeight:reshapedFeatureChannels:")
    public native MPSImage encodeToCommandBufferSourceImageReshapedWidthReshapedHeightReshapedFeatureChannels(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @NUInt long reshapedWidth, @NUInt long reshapedHeight, @NUInt long reshapedFeatureChannels);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
