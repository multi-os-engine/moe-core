/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.struct.MTLRegion;
import apple.metalperformanceshaders.protocol.MPSImageAllocator;
import apple.metalperformanceshaders.protocol.MPSNNPadding;
import apple.metalperformanceshaders.struct.MPSOffset;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
 * MPSCNNKernel
 * [@dependency] This depends on Metal.framework
 * 
 * Describes a convolution neural network kernel.
 * 
 * A MPSCNNKernel consumes one MPSImage and produces one MPSImage.
 * 
 * The region overwritten in the destination MPSImage is described
 * by the clipRect. The top left corner of the region consumed (ignoring
 * adjustments for filter size -- e.g. convolution filter size) is given
 * by the offset. The size of the region consumed is a function of the
 * clipRect size and any subsampling caused by pixel strides at work,
 * e.g. MPSCNNPooling.strideInPixelsX/Y. Where the offset + clipRect
 * would cause a {x,y} pixel address not in the image to be read, the
 * edgeMode is used to determine what value to read there.
 * 
 * The Z/depth component of the offset, clipRect.origin and clipRect.size
 * indexes which images to use. If the MPSImage contains only a single image
 * then these should be offset.z = 0, clipRect.origin.z = 0
 * and clipRect.size.depth = 1. If the MPSImage contains multiple images,
 * clipRect.size.depth refers to number of images to process. Both source
 * and destination MPSImages must have at least this many images. offset.z
 * refers to starting source image index. Thus offset.z + clipRect.size.depth must
 * be <= source.numberOfImages. Similarly, clipRect.origin.z refers to starting
 * image index in destination. So clipRect.origin.z + clipRect.size.depth must be
 * <= destination.numberOfImage.
 * 
 * destinationFeatureChannelOffset property can be used to control where the MPSKernel will
 * start writing in feature channel dimension. For example, if the destination image has
 * 64 channels, and MPSKernel outputs 32 channels, by default channels 0-31 of destination
 * will be populated by MPSKernel. But if we want this MPSKernel to populate channel 32-63
 * of the destination, we can set destinationFeatureChannelOffset = 32.
 * A good example of this is concat (concatenation) operation in Tensor Flow. Suppose
 * we have a src = w x h x Ni which goes through CNNConvolution_0 which produces
 * output O0 = w x h x N0 and CNNConvolution_1 which produces output O1 = w x h x N1 followed
 * by concatenation which produces O = w x h x (N0 + N1). We can achieve this by creating
 * an MPSImage with dimensions O = w x h x (N0 + N1) and using this as destination of
 * both convolutions as follows
 * CNNConvolution0: destinationFeatureChannelOffset = 0, this will output N0 channels starting at
 * channel 0 of destination thus populating [0,N0-1] channels.
 * CNNConvolution1: destinationFeatureChannelOffset = N0, this will output N1 channels starting at
 * channel N0 of destination thus populating [N0,N0+N1-1] channels.
 * 
 * 
 * A MPSCNNKernel can be saved to disk / network using NSCoders such as NSKeyedArchiver.
 * When decoding, the system default MTLDevice will be chosen unless the NSCoder adopts
 * the <MPSDeviceProvider> protocol. To accomplish this you will likely need to subclass your
 * unarchiver to add this method.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNKernel extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNKernel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNKernel allocWithZone(VoidPtr zone);

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
    public static native MPSCNNKernel new_objc();

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
     * [@property] clipRect
     * 
     * An optional clip rectangle to use when writing data. Only the pixels in the rectangle will be overwritten.
     * 
     * A MTLRegion that indicates which part of the destination to overwrite. If the clipRect does not lie
     * completely within the destination image, the intersection between clip rectangle and destination bounds is
     * used. Default: MPSRectNoClip (MPSKernel::MPSRectNoClip) indicating the entire image.
     * clipRect.origin.z is the index of starting destination image in batch processing mode. clipRect.size.depth
     * is the number of images to process in batch processing mode.
     * 
     * See Also: @ref MetalPerformanceShaders.h subsubsection_clipRect
     */
    @Generated
    @Selector("clipRect")
    @ByValue
    public native MTLRegion clipRect();

    /**
     * [@property] destinationFeatureChannelOffset
     * 
     * The number of channels in the destination MPSImage to skip before writing output.
     * 
     * This is the starting offset into the destination image in the feature channel dimension
     * at which destination data is written.
     * This allows an application to pass a subset of all the channels in MPSImage as output of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel outputs 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as output, we can set destinationFeatureChannelOffset = 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel outputs N channels,
     * the destination image MUST have at least destinationFeatureChannelOffset + N channels. Using a destination
     * image with insufficient number of feature channels will result in an error.
     * E.g. if the MPSCNNConvolution outputs 32 channels, and the destination has 64 channels, then it is an error to
     * set
     * destinationFeatureChannelOffset > 32.
     */
    @Generated
    @Selector("destinationFeatureChannelOffset")
    @NUInt
    public native long destinationFeatureChannelOffset();

    /**
     * [@property] edgeMode
     * 
     * The MPSImageEdgeMode to use when texture reads stray off the edge of an image
     * 
     * Most MPSKernel objects can read off the edge of the source image. This can happen
     * because of a negative offset property, because the offset + clipRect.size is larger
     * than the source image or because the filter looks at neighboring pixels, such as a
     * Convolution filter. Default: MPSImageEdgeModeZero.
     * 
     * See Also: @ref MetalPerformanceShaders.h subsubsection_edgemode
     * Note: For @ref MPSCNNPoolingAverage specifying edge mode @ref MPSImageEdgeModeClamp
     * is interpreted as a "shrink-to-edge" operation, which shrinks the effective
     * filtering window to remain within the source image borders.
     */
    @Generated
    @Selector("edgeMode")
    @NUInt
    public native long edgeMode();

    /**
     * Encode a MPSCNNKernel into a command Buffer. The operation shall proceed out-of-place.
     * 
     * This is the older style of encode which reads the offset, doesn't change it,
     * and ignores the padding method.
     * 
     * @param commandBuffer    A valid MTLCommandBuffer to receive the encoded filter
     * @param sourceImage      A valid MPSImage object containing the source image.
     * @param destinationImage A valid MPSImage to be overwritten by result image. destinationImage may not alias
     *                         sourceImage.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:destinationImage:")
    public native void encodeToCommandBufferSourceImageDestinationImage(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @NotNull MPSImage destinationImage);

    @Generated
    @Selector("init")
    public native MPSCNNKernel init();

    /**
     * Standard init with default properties per filter type
     * 
     * @param device The device that the filter will be used on. May not be NULL.
     * @return A pointer to the newly initialized object. This will fail, returning
     *         nil if the device is not supported. Devices must be
     *         MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNKernel initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * [@property] offset
     * 
     * The position of the destination clip rectangle origin relative to the source buffer.
     * 
     * The offset is defined to be the position of clipRect.origin in source coordinates.
     * Default: {0,0,0}, indicating that the top left corners of the clipRect and source image align.
     * offset.z is the index of starting source image in batch processing mode.
     * 
     * See Also: @ref MetalPerformanceShaders.h subsubsection_mpsoffset
     */
    @Generated
    @Selector("offset")
    @ByValue
    public native MPSOffset offset();

    /**
     * [@property] clipRect
     * 
     * An optional clip rectangle to use when writing data. Only the pixels in the rectangle will be overwritten.
     * 
     * A MTLRegion that indicates which part of the destination to overwrite. If the clipRect does not lie
     * completely within the destination image, the intersection between clip rectangle and destination bounds is
     * used. Default: MPSRectNoClip (MPSKernel::MPSRectNoClip) indicating the entire image.
     * clipRect.origin.z is the index of starting destination image in batch processing mode. clipRect.size.depth
     * is the number of images to process in batch processing mode.
     * 
     * See Also: @ref MetalPerformanceShaders.h subsubsection_clipRect
     */
    @Generated
    @Selector("setClipRect:")
    public native void setClipRect(@ByValue MTLRegion value);

    /**
     * [@property] destinationFeatureChannelOffset
     * 
     * The number of channels in the destination MPSImage to skip before writing output.
     * 
     * This is the starting offset into the destination image in the feature channel dimension
     * at which destination data is written.
     * This allows an application to pass a subset of all the channels in MPSImage as output of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel outputs 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as output, we can set destinationFeatureChannelOffset = 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel outputs N channels,
     * the destination image MUST have at least destinationFeatureChannelOffset + N channels. Using a destination
     * image with insufficient number of feature channels will result in an error.
     * E.g. if the MPSCNNConvolution outputs 32 channels, and the destination has 64 channels, then it is an error to
     * set
     * destinationFeatureChannelOffset > 32.
     */
    @Generated
    @Selector("setDestinationFeatureChannelOffset:")
    public native void setDestinationFeatureChannelOffset(@NUInt long value);

    /**
     * [@property] edgeMode
     * 
     * The MPSImageEdgeMode to use when texture reads stray off the edge of an image
     * 
     * Most MPSKernel objects can read off the edge of the source image. This can happen
     * because of a negative offset property, because the offset + clipRect.size is larger
     * than the source image or because the filter looks at neighboring pixels, such as a
     * Convolution filter. Default: MPSImageEdgeModeZero.
     * 
     * See Also: @ref MetalPerformanceShaders.h subsubsection_edgemode
     * Note: For @ref MPSCNNPoolingAverage specifying edge mode @ref MPSImageEdgeModeClamp
     * is interpreted as a "shrink-to-edge" operation, which shrinks the effective
     * filtering window to remain within the source image borders.
     */
    @Generated
    @Selector("setEdgeMode:")
    public native void setEdgeMode(@NUInt long value);

    /**
     * [@property] offset
     * 
     * The position of the destination clip rectangle origin relative to the source buffer.
     * 
     * The offset is defined to be the position of clipRect.origin in source coordinates.
     * Default: {0,0,0}, indicating that the top left corners of the clipRect and source image align.
     * offset.z is the index of starting source image in batch processing mode.
     * 
     * See Also: @ref MetalPerformanceShaders.h subsubsection_mpsoffset
     */
    @Generated
    @Selector("setOffset:")
    public native void setOffset(@ByValue MPSOffset value);

    /**
     * Method to allocate the result image for -encodeToCommandBuffer:sourceImage:
     * 
     * Default: MPSTemporaryImage.defaultAllocator
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("destinationImageAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSImageAllocator destinationImageAllocator();

    /**
     * Encode a MPSCNNKernel into a command Buffer. Create a texture to hold the result and return it.
     * 
     * In the first iteration on this method, encodeToCommandBuffer:sourceImage:destinationImage:
     * some work was left for the developer to do in the form of correctly setting the offset property
     * and sizing the result buffer. With the introduction of the padding policy (see padding property)
     * the filter can do this work itself. If you would like to have some input into what sort of MPSImage
     * (e.g. temporary vs. regular) or what size it is or where it is allocated, you may set the
     * destinationImageAllocator to allocate the image yourself.
     * 
     * This method uses the MPSNNPadding padding property to figure out how to size
     * the result image and to set the offset property. See discussion in MPSNeuralNetworkTypes.h.
     * All images in a batch must have MPSImage.numberOfImages = 1.
     * 
     * @param commandBuffer The command buffer
     * @param sourceImage   A MPSImage to use as the source images for the filter.
     * @return A MPSImage or MPSTemporaryImage allocated per the destinationImageAllocator containing the output of the
     *         graph.
     *         The offset property will be adjusted to reflect the offset used during the encode.
     *         The returned image will be automatically released when the command buffer completes. If you want to
     *         keep it around for longer, retain the image. (ARC will do this for you if you use it later.)
     * 
     *         API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:")
    public native MPSImage encodeToCommandBufferSourceImage(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage);

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNKernel initWithCoder(@NotNull NSCoder aDecoder);

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
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNKernel initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * [@property] isBackwards
     * 
     * YES if the filter operates backwards.
     * 
     * This influences how strideInPixelsX/Y should be interpreted.
     * Most filters either have stride 1 or are reducing, meaning that
     * the result image is smaller than the original by roughly a factor
     * of the stride. A few "backward" filters (e.g convolution transpose) are intended
     * to "undo" the effects of an earlier forward filter, and so
     * enlarge the image. The stride is in the destination coordinate frame
     * rather than the source coordinate frame.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isBackwards")
    public native boolean isBackwards();

    /**
     * [@property] kernelHeight
     * 
     * The height of the MPSCNNKernel filter window
     * 
     * This is the vertical diameter of the region read by the filter for each
     * result pixel. If the MPSCNNKernel does not have a filter window, then
     * 1 will be returned.
     * 
     * Warning: This property was lowered to this class in ios/tvos 11
     * The property may not be available on iOS/tvOS 10 for
     * all subclasses of MPSCNNKernel
     */
    @Generated
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    /**
     * [@property] kernelWidth
     * 
     * The width of the MPSCNNKernel filter window
     * 
     * This is the horizontal diameter of the region read by the filter for each
     * result pixel. If the MPSCNNKernel does not have a filter window, then
     * 1 will be returned.
     * 
     * Warning: This property was lowered to this class in ios/tvos 11
     * The property may not be available on iOS/tvOS 10 for
     * all subclasses of MPSCNNKernel
     */
    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    /**
     * [@property] padding
     * 
     * The padding method used by the filter
     * 
     * This influences how the destination image is sized and how
     * the offset into the source image is set. It is used by the
     * -encode methods that return a MPSImage from the left hand side.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("padding")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSNNPadding padding();

    /**
     * Method to allocate the result image for -encodeToCommandBuffer:sourceImage:
     * 
     * Default: MPSTemporaryImage.defaultAllocator
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDestinationImageAllocator:")
    public native void setDestinationImageAllocator(@NotNull @Mapped(ObjCObjectMapper.class) MPSImageAllocator value);

    /**
     * [@property] padding
     * 
     * The padding method used by the filter
     * 
     * This influences how the destination image is sized and how
     * the offset into the source image is set. It is used by the
     * -encode methods that return a MPSImage from the left hand side.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPadding:")
    public native void setPadding(@NotNull @Mapped(ObjCObjectMapper.class) MPSNNPadding value);

    /**
     * [@property] strideInPixelsX
     * 
     * The downsampling (or upsampling if a backwards filter) factor in the horizontal dimension
     * 
     * If the filter does not do up or downsampling, 1 is returned.
     * 
     * Warning: This property was lowered to this class in ios/tvos 11
     * The property may not be available on iOS/tvOS 10 for
     * all subclasses of MPSCNNKernel
     */
    @Generated
    @Selector("strideInPixelsX")
    @NUInt
    public native long strideInPixelsX();

    /**
     * [@property] strideInPixelsY
     * 
     * The downsampling (or upsampling if a backwards filter) factor in the vertical dimension
     * 
     * If the filter does not do up or downsampling, 1 is returned.
     * 
     * Warning: This property was lowered to this class in ios/tvos 11
     * The property may not be available on iOS/tvOS 10 for
     * all subclasses of MPSCNNKernel
     */
    @Generated
    @Selector("strideInPixelsY")
    @NUInt
    public native long strideInPixelsY();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Returns YES if the filter must be run over the entire batch before its
     * results may be used
     * 
     * Nearly all filters do not need to see the entire batch all at once and can
     * operate correctly with partial batches. This allows the graph to
     * strip-mine the problem, processing the graph top to bottom on a subset
     * of the batch at a time, dramatically reducing memory usage. As the full
     * nominal working set for a graph is often so large that it may not fit
     * in memory, sub-batching may be required forward progress.
     * 
     * Batch normalization statistics on the other hand must complete the batch
     * before the statistics may be used to normalize the images in the batch
     * in the ensuing normalization filter. Consequently, batch normalization statistics
     * requests the graph insert a batch barrier following it by returning
     * YES from -appendBatchBarrier. This tells the graph to complete the batch
     * before any dependent filters can start. Note that the filter itself may
     * still be subject to sub-batching in its operation. All filters must be able to
     * function without seeing the entire batch in a single -encode call. Carry
     * over state that is accumulated across sub-batches is commonly carried in
     * a shared MPSState containing a MTLBuffer. See -isResultStateReusedAcrossBatch.
     * 
     * Caution: on most supported devices, the working set may be so large
     * that the graph may be forced to throw away and recalculate most
     * intermediate images in cases where strip-mining can not occur because
     * -appendBatchBarrier returns YES. A single batch barrier can commonly
     * cause a memory size increase and/or performance reduction by many fold
     * over the entire graph. Filters of this variety should be avoided.
     * 
     * Default: NO
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("appendBatchBarrier")
    public native boolean appendBatchBarrier();

    /**
     * Get a suggested destination image descriptor for a source image
     * 
     * Your application is certainly free to pass in any destinationImage
     * it likes to encodeToCommandBuffer:sourceImage:destinationImage,
     * within reason. This is the basic design for iOS 10. This method
     * is therefore not required.
     * 
     * However, calculating the MPSImage size and MPSCNNKernel properties
     * for each filter can be tedious and complicated work, so this method
     * is made available to automate the process. The application may
     * modify the properties of the descriptor before a MPSImage is made from
     * it, so long as the choice is sensible for the kernel in question.
     * Please see individual kernel descriptions for restrictions.
     * 
     * The expected timeline for use is as follows:
     * 
     * 1) This method is called:
     * a) The default MPS padding calculation is applied. It
     * uses the MPSNNPaddingMethod of the .padding property to
     * provide a consistent addressing scheme over the graph.
     * It creates the MPSImageDescriptor and adjusts the .offset
     * property of the MPSNNKernel. When using a MPSNNGraph, the
     * padding is set using the MPSNNFilterNode as a proxy.
     * 
     * b) This method may be overridden by MPSCNNKernel subclass
     * to achieve any customization appropriate to the object type.
     * 
     * c) Source states are then applied in order. These may modify the
     * descriptor and may update other object properties. See:
     * -destinationImageDescriptorForSourceImages:sourceStates:
     * forKernel:suggestedDescriptor: This is the typical way
     * in which MPS may attempt to influence the operation of
     * its kernels.
     * 
     * d) If the .padding property has a custom padding policy method
     * of the same name, it is called. Similarly, it may also adjust
     * the descriptor and any MPSCNNKernel properties. This is the
     * typical way in which your application may attempt to influence
     * the operation of the MPS kernels.
     * 
     * 2) A result is returned from this method and the caller
     * may further adjust the descriptor and kernel properties
     * directly.
     * 
     * 3) The caller uses the descriptor to make a new MPSImage to
     * use as the destination image for the -encode call in step 5.
     * 
     * 4) The caller calls -resultStateForSourceImage:sourceStates:destinationImage:
     * to make any result states needed for the kernel. If there isn't
     * one, it will return nil. A variant is available to return a
     * temporary state instead.
     * 
     * 5) a -encode method is called to encode the kernel.
     * 
     * The entire process 1-5 is more simply achieved by just calling an -encode...
     * method that returns a MPSImage out the left hand sid of the method. Simpler
     * still, use the MPSNNGraph to coordinate the entire process from end to end.
     * Opportunities to influence the process are of course reduced, as (2) is no longer
     * possible with either method. Your application may opt to use the five step method
     * if it requires greater customization as described, or if it would like to estimate
     * storage in advance based on the sum of MPSImageDescriptors before processing
     * a graph. Storage estimation is done by using the MPSImageDescriptor to create
     * a MPSImage (without passing it a texture), and then call -resourceSize. As long
     * as the MPSImage is not used in an encode call and the .texture property is not
     * invoked, the underlying MTLTexture is not created.
     * 
     * No destination state or destination image is provided as an argument to this
     * function because it is expected they will be made / configured after this
     * is called. This method is expected to auto-configure important object properties
     * that may be needed in the ensuing destination image and state creation steps.
     * 
     * @param sourceImages A array of source images that will be passed into the -encode call
     *                     Since MPSCNNKernel is a unary kernel, it is an array of length 1.
     * @param sourceStates An optional array of source states that will be passed into the -encode call
     * @return an image descriptor allocated on the autorelease pool
     * 
     *         API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("destinationImageDescriptorForSourceImages:sourceStates:")
    public native MPSImageDescriptor destinationImageDescriptorForSourceImagesSourceStates(
            @NotNull NSArray<? extends MPSImage> sourceImages, @Nullable NSArray<? extends MPSState> sourceStates);

    /**
     * [@property] dilationRateX
     * 
     * Stride in source coordinates from one kernel tap to the next in the X dimension.
     */
    @Generated
    @Selector("dilationRateX")
    @NUInt
    public native long dilationRateX();

    /**
     * [@property] dilationRate
     * 
     * Stride in source coordinates from one kernel tap to the next in the Y dimension.
     */
    @Generated
    @Selector("dilationRateY")
    @NUInt
    public native long dilationRateY();

    /**
     * Encode a MPSCNNKernel with a destination state into a command Buffer.
     * 
     * This is typically used during training. The state is commonly a MPSNNGradientState.
     * Please see -resultStateForSourceImages:SourceStates: and batch+temporary variants.
     * 
     * @param commandBuffer    A valid MTLCommandBuffer to receive the encoded filter
     * @param sourceImage      A valid MPSImage object containing the source image.
     * @param destinationState A state to be overwritten by additional state information.
     * @param destinationImage A valid MPSImage to be overwritten by result image. destinationImage may not alias
     *                         sourceImage.
     * 
     *                         API-Since: 11.3
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:destinationState:destinationImage:")
    public native void encodeToCommandBufferSourceImageDestinationStateDestinationImage(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @NotNull MPSState destinationState, @NotNull MPSImage destinationImage);

    /**
     * Encode a MPSCNNKernel into a command Buffer. Create a texture and state to hold the results and return them.
     * 
     * In the first iteration on this method, encodeToCommandBuffer:sourceImage:destinationState:destinationImage:
     * some work was left for the developer to do in the form of correctly setting the offset property
     * and sizing the result buffer. With the introduction of the padding policy (see padding property)
     * the filter can do this work itself. If you would like to have some input into what sort of MPSImage
     * (e.g. temporary vs. regular) or what size it is or where it is allocated, you may set the
     * destinationImageAllocator to allocate the image yourself.
     * 
     * This method uses the MPSNNPadding padding property to figure out how to size
     * the result image and to set the offset property. See discussion in MPSNeuralNetworkTypes.h.
     * All images in a batch must have MPSImage.numberOfImages = 1.
     * 
     * @param commandBuffer The command buffer
     * @param sourceImage   A MPSImage to use as the source images for the filter.
     * @param outState      A new state object is returned here.
     * @return A MPSImage or MPSTemporaryImage allocated per the destinationImageAllocator containing the output of the
     *         graph.
     *         The offset property will be adjusted to reflect the offset used during the encode.
     *         The returned image will be automatically released when the command buffer completes. If you want to
     *         keep it around for longer, retain the image. (ARC will do this for you if you use it later.)
     * 
     *         API-Since: 11.3
     */
    @NotNull
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:destinationState:destinationStateIsTemporary:")
    public native MPSImage encodeToCommandBufferSourceImageDestinationStateDestinationStateIsTemporary(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @NotNull @ReferenceInfo(type = MPSState.class) Ptr<MPSState> outState, boolean isTemporary);

    /**
     * The size of extra MPS heap storage allocated while the kernel is encoding
     * 
     * This is best effort and just describes things that are likely to end up on the MPS heap. It does not
     * describe all allocation done by the -encode call. It is intended for use with high water calculations
     * for MTLHeap sizing. Allocations are typically for temporary storage needed for multipass algorithms.
     * This interface should not be used to detect multipass algorithms.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("encodingStorageSizeForSourceImage:sourceStates:destinationImage:")
    @NUInt
    public native long encodingStorageSizeForSourceImageSourceStatesDestinationImage(@NotNull MPSImage sourceImage,
            @Nullable NSArray<? extends MPSState> sourceStates, @Nullable MPSImage destinationImage);

    /**
     * Returns YES if the same state is used for every operation in a batch
     * 
     * If NO, then each image in a MPSImageBatch will need a corresponding
     * (and different) state to go with it. Set to YES to avoid allocating
     * redundant state in the case when the same state is used all the time.
     * Default: NO
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("isResultStateReusedAcrossBatch")
    public native boolean isResultStateReusedAcrossBatch();

    /**
     * Returns true if the -encode call modifies the state object it accepts.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("isStateModified")
    public native boolean isStateModified();

    /**
     * Allocate a MPSState (subclass) to hold the results from a -encodeBatchToCommandBuffer... operation
     * 
     * A graph may need to allocate storage up front before executing. This may be
     * necessary to avoid using too much memory and to manage large batches. The function
     * should allocate any MPSState objects that will be produced by an -encode call
     * with the indicated sourceImages and sourceStates inputs. Though the states
     * can be further adjusted in the ensuing -encode call, the states should
     * be initialized with all important data and all MTLResource storage allocated.
     * The data stored in the MTLResource need not be initialized, unless the ensuing
     * -encode call expects it to be.
     * 
     * The MTLDevice used by the result is derived from the source image.
     * The padding policy will be applied to the filter before this is called
     * to give it the chance to configure any properties like MPSCNNKernel.offset.
     * 
     * CAUTION:
     * The kernel must have all properties set to values that will ultimately be
     * passed to the -encode call that writes to the state, before
     * -resultStateForSourceImages:sourceStates:destinationImage: is called or behavior is undefined.
     * Please note that -destinationImageDescriptorForSourceImages:sourceStates:
     * will alter some of these properties automatically based on the padding policy.
     * If you intend to call that to make the destination image, then you should
     * call that before -resultStateForSourceImages:sourceStates:destinationImage:. This will ensure the
     * properties used in the encode call and in the destination image creation
     * match those used to configure the state.
     * 
     * The following order is recommended:
     * 
     * // Configure MPSCNNKernel properties first
     * kernel.edgeMode = MPSImageEdgeModeZero;
     * kernel.destinationFeatureChannelOffset = 128; // concatenation without the copy
     * ...
     * 
     * // ALERT: will change MPSCNNKernel properties
     * MPSImageDescriptor * d = [kernel destinationImageDescriptorForSourceImage: source
     * sourceStates: states];
     * MPSTemporaryImage * dest = [MPSTemporaryImage temporaryImageWithCommandBuffer: cmdBuf
     * imageDescriptor: d];
     * 
     * // Now that all properties are configured properly, we can make the result state
     * // and call encode.
     * MPSState * __nullable destState = [kernel resultStateForSourceImage: source
     * sourceStates: states
     * destinationImage: dest];
     * 
     * // This form of -encode will be declared by the MPSCNNKernel subclass
     * [kernel encodeToCommandBuffer: cmdBuf
     * sourceImage: source
     * destinationState: destState
     * destinationImage: dest ];
     * 
     * Default: returns nil
     * 
     * @param sourceImage      The MPSImage consumed by the associated -encode call.
     * @param sourceStates     The list of MPSStates consumed by the associated -encode call,
     *                         for a batch size of 1.
     * @param destinationImage The destination image for the encode call
     * @return The list of states produced by the -encode call for batch size of 1.
     *         When the batch size is not 1, this function will be called repeatedly unless
     *         -isResultStateReusedAcrossBatch returns YES. If -isResultStateReusedAcrossBatch
     *         returns YES, then it will be called once per batch and the MPSStateBatch array will
     *         contain MPSStateBatch.length references to the same object.
     * 
     *         API-Since: 11.3
     */
    @Nullable
    @Generated
    @Selector("resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSState resultStateForSourceImageSourceStatesDestinationImage(@NotNull MPSImage sourceImage,
            @Nullable NSArray<? extends MPSState> sourceStates, @NotNull MPSImage destinationImage);

    /**
     * [@property] sourceFeatureChannelMaxCount
     * 
     * The maximum number of channels in the source MPSImage to use
     * 
     * Most filters can insert a slice operation into the filter for free.
     * Use this to limit the size of the feature channel slice taken from
     * the input image. If the value is too large, it is truncated to be
     * the remaining size in the image after the sourceFeatureChannelOffset
     * is taken into account. Default: ULONG_MAX
     */
    @Generated
    @Selector("setSourceFeatureChannelMaxCount:")
    public native void setSourceFeatureChannelMaxCount(@NUInt long value);

    /**
     * [@property] sourceFeatureChannelOffset
     * 
     * The number of channels in the source MPSImage to skip before reading the input.
     * 
     * This is the starting offset into the source image in the feature channel dimension
     * at which source data is read. Unit: feature channels
     * This allows an application to read a subset of all the channels in MPSImage as input of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel needs to read 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as input, we can set sourceFeatureChannelOffset = 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel inputs N channels,
     * the source image MUST have at least sourceFeatureChannelOffset + N channels. Using a source
     * image with insufficient number of feature channels will result in an error.
     * E.g. if the MPSCNNConvolution inputs 32 channels, and the source has 64 channels, then it is an error to set
     * sourceFeatureChannelOffset > 32.
     */
    @Generated
    @Selector("setSourceFeatureChannelOffset:")
    public native void setSourceFeatureChannelOffset(@NUInt long value);

    /**
     * [@property] sourceFeatureChannelMaxCount
     * 
     * The maximum number of channels in the source MPSImage to use
     * 
     * Most filters can insert a slice operation into the filter for free.
     * Use this to limit the size of the feature channel slice taken from
     * the input image. If the value is too large, it is truncated to be
     * the remaining size in the image after the sourceFeatureChannelOffset
     * is taken into account. Default: ULONG_MAX
     */
    @Generated
    @Selector("sourceFeatureChannelMaxCount")
    @NUInt
    public native long sourceFeatureChannelMaxCount();

    /**
     * [@property] sourceFeatureChannelOffset
     * 
     * The number of channels in the source MPSImage to skip before reading the input.
     * 
     * This is the starting offset into the source image in the feature channel dimension
     * at which source data is read. Unit: feature channels
     * This allows an application to read a subset of all the channels in MPSImage as input of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel needs to read 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as input, we can set sourceFeatureChannelOffset = 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel inputs N channels,
     * the source image MUST have at least sourceFeatureChannelOffset + N channels. Using a source
     * image with insufficient number of feature channels will result in an error.
     * E.g. if the MPSCNNConvolution inputs 32 channels, and the source has 64 channels, then it is an error to set
     * sourceFeatureChannelOffset > 32.
     */
    @Generated
    @Selector("sourceFeatureChannelOffset")
    @NUInt
    public native long sourceFeatureChannelOffset();

    /**
     * Allocate a temporary MPSState (subclass) to hold the results from a -encodeBatchToCommandBuffer... operation
     * 
     * A graph may need to allocate storage up front before executing. This may be
     * necessary to avoid using too much memory and to manage large batches. The function
     * should allocate any MPSState objects that will be produced by an -encode call
     * with the indicated sourceImages and sourceStates inputs. Though the states
     * can be further adjusted in the ensuing -encode call, the states should
     * be initialized with all important data and all MTLResource storage allocated.
     * The data stored in the MTLResource need not be initialized, unless the ensuing
     * -encode call expects it to be.
     * 
     * The MTLDevice used by the result is derived from the command buffer.
     * The padding policy will be applied to the filter before this is called
     * to give it the chance to configure any properties like MPSCNNKernel.offset.
     * 
     * CAUTION:
     * The kernel must have all properties set to values that will ultimately be
     * passed to the -encode call that writes to the state, before
     * -resultStateForSourceImages:sourceStates:destinationImage: is called or behavior is undefined.
     * Please note that -destinationImageDescriptorForSourceImages:sourceStates:destinationImage:
     * will alter some of these properties automatically based on the padding policy.
     * If you intend to call that to make the destination image, then you should
     * call that before -resultStateForSourceImages:sourceStates:destinationImage:. This will ensure the
     * properties used in the encode call and in the destination image creation
     * match those used to configure the state.
     * 
     * The following order is recommended:
     * 
     * // Configure MPSCNNKernel properties first
     * kernel.edgeMode = MPSImageEdgeModeZero;
     * kernel.destinationFeatureChannelOffset = 128; // concatenation without the copy
     * ...
     * 
     * // ALERT: will change MPSCNNKernel properties
     * MPSImageDescriptor * d = [kernel destinationImageDescriptorForSourceImage: source
     * sourceStates: states];
     * MPSTemporaryImage * dest = [MPSTemporaryImage temporaryImageWithCommandBuffer: cmdBuf
     * imageDescriptor: d];
     * 
     * // Now that all properties are configured properly, we can make the result state
     * // and call encode.
     * MPSState * __nullable destState = [kernel temporaryResultStateForCommandBuffer: cmdBuf
     * sourceImage: source
     * sourceStates: states];
     * 
     * // This form of -encode will be declared by the MPSCNNKernel subclass
     * [kernel encodeToCommandBuffer: cmdBuf
     * sourceImage: source
     * destinationState: destState
     * destinationImage: dest ];
     * 
     * Default: returns nil
     * 
     * @param commandBuffer    The command buffer to allocate the temporary storage against
     *                         The state will only be valid on this command buffer.
     * @param sourceImage      The MPSImage consumed by the associated -encode call.
     * @param sourceStates     The list of MPSStates consumed by the associated -encode call,
     *                         for a batch size of 1.
     * @param destinationImage The destination image for the encode call
     * @return The list of states produced by the -encode call for batch size of 1.
     *         When the batch size is not 1, this function will be called repeatedly unless
     *         -isResultStateReusedAcrossBatch returns YES. If -isResultStateReusedAcrossBatch
     *         returns YES, then it will be called once per batch and the MPSStateBatch array will
     *         contain MPSStateBatch.length references to the same object.
     * 
     *         API-Since: 11.3
     */
    @Nullable
    @Generated
    @Selector("temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSState temporaryResultStateForCommandBufferSourceImageSourceStatesDestinationImage(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @Nullable NSArray<? extends MPSState> sourceStates, @NotNull MPSImage destinationImage);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
