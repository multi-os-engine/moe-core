package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVCaptureDataOutputSynchronizerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import apple.opaque.dispatch_queue_t;

/**
 * AVCaptureDataOutputSynchronizer
 * 
 * AVCaptureDataOutputSynchronizer synchronizes the delivery of data from multiple capture data outputs
 * (AVCaptureVideoDataOutput, AVCaptureDepthDataOutput, AVCaptureMetadataOutput, AVCaptureAudioDataOutput) to a single
 * delegate callback.
 * 
 * AVCaptureDataOutputSynchronizer is initialized with an array of data outputs (AVCaptureVideoDataOutput,
 * AVCaptureDepthDataOutput, AVCaptureMetadataOutput, or AVCaptureAudioDataOutput) from which you'd like to receive a
 * single, synchronized delegate callback. The first output in the array acts as the primary data output and determines
 * when the synchronized callback is delivered. When data is received for the primary data output, it is held until all
 * other data outputs have received data with an equal or later presentation time stamp, or it has been determined that
 * there is no data for a particular output at the primary data output's pts. Once all other outputs are ready, a single
 * delegate callback is sent with all the data aligned with the primary data output's data. Separate delegate callbacks
 * are sent for any other data received with presentation time stamps earlier than the next primary data output time.
 * 
 * For instance, if you specify a video data output as your first (primary) output and a metadata output for detected
 * faces as your second output, your data callback will not be called until there is face data ready for a video frame,
 * or it is assured that there is no face metadata for that particular video frame.
 * 
 * Note that the AVCaptureDataOutputSynchronizer overrides each data output's -setSampleBufferDelegate:queue:,
 * -setDepthDataDelegate:queue:, or -setMetadataObjectsDelegate:queue: method call. -[AVCaptureVideoDataOutput
 * alwaysDiscardsLateVideoFrames] and -[AVCaptureDepthDataOutput alwaysDiscardsLateDepthData] properties are honored.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureDataOutputSynchronizer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureDataOutputSynchronizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureDataOutputSynchronizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureDataOutputSynchronizer allocWithZone(VoidPtr zone);

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
     * [@property] dataOutputs
     * 
     * The data outputs provided in the initializer method.
     */
    @NotNull
    @Generated
    @Selector("dataOutputs")
    public native NSArray<? extends AVCaptureOutput> dataOutputs();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     * 
     * The value of this property is an object conforming to the AVCaptureDataOutputSynchronizerDelegate protocol that
     * will receive synchronized data output. The delegate is set using the -setDelegate:queue: method. This property is
     * key-value observable.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVCaptureDataOutputSynchronizerDelegate delegate();

    /**
     * [@property] delegateCallbackQueue
     * 
     * The dispatch queue on which all AVCaptureDataOutputSynchronizerDelegate methods will be called.
     * 
     * The value of this property is a dispatch_queue_t. The queue is set using the -setDelegate:queue: method.
     */
    @Nullable
    @Generated
    @Selector("delegateCallbackQueue")
    public native dispatch_queue_t delegateCallbackQueue();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaptureDataOutputSynchronizer init();

    /**
     * initWithDataOutputs:
     * 
     * Instantiates an AVCaptureDataOutputSynchronizer from one or more capture data outputs.
     * 
     * @param dataOutputs
     *                    An array of capture data outputs where the first is the primary output.
     * @return
     *         A newly initialized AVCaptureDataOutputSynchronizer instance.
     */
    @Generated
    @Selector("initWithDataOutputs:")
    public native AVCaptureDataOutputSynchronizer initWithDataOutputs(
            @NotNull NSArray<? extends AVCaptureOutput> dataOutputs);

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
    public static native AVCaptureDataOutputSynchronizer new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setDelegate:queue:
     * 
     * Sets the receiver's delegate that will accept synchronized data and the dispatch queue on which the delegate will
     * be called.
     * 
     * AVCaptureDataOutputSynchronizer gathers data from its dataOutputs, and when it determines that all data has been
     * received for a given timestamp, it calls the specified delegate on the specified delegateCallbackQueue.
     * AVCaptureDataOutputSynchronizer overrides all the data outputs' delegates and callbacks. Data outputs under the
     * control of AVCaptureDataOutputSynchronizer do not fire delegate callbacks. Delegate callbacks are restored to
     * individual data outputs when you call this method with nil as your delegate and NULL as your
     * delegateCallbackQueue.
     * 
     * A serial dispatch queue must be used to guarantee that synchronized data will be delivered in order. The
     * delegateCallbackQueue parameter may not be NULL, except when setting the delegate to nil.
     * 
     * @param delegate
     *                              An object conforming to the AVCaptureDataOutputSynchronizerDelegate protocol that
     *                              will receive synchronized data from the provided data outputs.
     * @param delegateCallbackQueue
     *                              A dispatch queue on which all AVCaptureDataOutputSynchronizerDelegate methods will
     *                              be called.
     */
    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(
            @Nullable @Mapped(ObjCObjectMapper.class) AVCaptureDataOutputSynchronizerDelegate delegate,
            @Nullable dispatch_queue_t delegateCallbackQueue);

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
