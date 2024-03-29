package apple.avfaudio;

import apple.NSObject;
import apple.audiotoolbox.AUAudioUnit;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAudioNode
 * 
 * Base class for an audio generation, processing, or I/O block.
 * 
 * `AVAudioEngine` objects contain instances of various AVAudioNode subclasses. This
 * base class provides certain common functionality.
 * 
 * Nodes have input and output busses, which can be thought of as connection points.
 * For example, an effect typically has one input bus and one output bus. A mixer
 * typically has multiple input busses and one output bus.
 * 
 * Busses have formats, expressed in terms of sample rate and channel count. When making
 * connections between nodes, often the format must match exactly. There are exceptions
 * (e.g. `AVAudioMixerNode` and `AVAudioOutputNode`).
 * 
 * Nodes do not currently provide useful functionality until attached to an engine.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioNode extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioNode(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] AUAudioUnit
     * 
     * An AUAudioUnit wrapping or underlying the implementation's AudioUnit.
     * 
     * This provides an AUAudioUnit which either wraps or underlies the implementation's
     * AudioUnit, depending on how that audio unit is packaged. Applications can interact with this
     * AUAudioUnit to control custom properties, select presets, change parameters, etc.
     * 
     * No operations that may conflict with state maintained by the engine should be performed
     * directly on the audio unit. These include changing initialization state, stream formats,
     * channel layouts or connections to other audio units.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("AUAudioUnit")
    public native AUAudioUnit AUAudioUnit();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioNode allocWithZone(VoidPtr zone);

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

    /**
     * [@property] engine
     * 
     * The engine to which the node is attached (or nil).
     */
    @Nullable
    @Generated
    @Selector("engine")
    public native AVAudioEngine engine();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioNode init();

    /**
     * inputFormatForBus:
     * 
     * Obtain an input bus's format.
     */
    @NotNull
    @Generated
    @Selector("inputFormatForBus:")
    public native AVAudioFormat inputFormatForBus(@NUInt long bus);

    /**
     * installTapOnBus:bufferSize:format:block:
     * 
     * Create a "tap" to record/monitor/observe the output of the node.
     * 
     * Only one tap may be installed on any bus. Taps may be safely installed and removed while
     * the engine is running.
     * 
     * Note that if you have a tap installed on AVAudioOutputNode, there could be a mismatch
     * between the tap buffer format and AVAudioOutputNode's output format, depending on the
     * underlying physical device. Hence, instead of tapping the AVAudioOutputNode, it is
     * advised to tap the node connected to it.
     * 
     * E.g. to capture audio from input node:
     * <pre>
     * AVAudioEngine *engine = [[AVAudioEngine alloc] init];
     * AVAudioInputNode *input = [engine inputNode];
     * AVAudioFormat *format = [input outputFormatForBus: 0];
     * [input installTapOnBus: 0 bufferSize: 8192 format: format block: ^(AVAudioPCMBuffer *buf, AVAudioTime *when) {
     * // ‘buf' contains audio captured from input node at time 'when'
     * }];
     * ....
     * // start engine
     * </pre>
     * 
     * @param bus
     *                   the node output bus to which to attach the tap
     * @param bufferSize
     *                   the requested size of the incoming buffers in sample frames. Supported range is [100, 400] ms.
     * @param format
     *                   If non-nil, attempts to apply this as the format of the specified output bus. This should
     *                   only be done when attaching to an output bus which is not connected to another node; an
     *                   error will result otherwise.
     *                   The tap and connection formats (if non-nil) on the specified bus should be identical.
     *                   Otherwise, the latter operation will override any previously set format.
     * @param tapBlock
     *                   a block to be called with audio buffers
     */
    @Generated
    @Selector("installTapOnBus:bufferSize:format:block:")
    public native void installTapOnBusBufferSizeFormatBlock(@NUInt long bus, int bufferSize,
            @Nullable AVAudioFormat format,
            @NotNull @ObjCBlock(name = "call_installTapOnBusBufferSizeFormatBlock") Block_installTapOnBusBufferSizeFormatBlock tapBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_installTapOnBusBufferSizeFormatBlock {
        @Generated
        void call_installTapOnBusBufferSizeFormatBlock(@NotNull AVAudioPCMBuffer buffer, @NotNull AVAudioTime when);
    }

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
     * [@property] lastRenderTime
     * 
     * Obtain the time for which the node most recently rendered.
     * 
     * Will return nil if the engine is not running or if the node is not connected to an input or
     * output node.
     */
    @Nullable
    @Generated
    @Selector("lastRenderTime")
    public native AVAudioTime lastRenderTime();

    /**
     * [@property] latency
     * 
     * The processing latency of the node, in seconds.
     * 
     * This property reflects the delay between when an impulse in the audio stream arrives at the
     * input vs. output of the node. This should reflect the delay due to signal processing
     * (e.g. filters, FFT's, etc.), not delay or reverberation which is being applied as an effect.
     * A value of zero indicates either no latency or an unknown latency.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("latency")
    public native double latency();

    /**
     * nameForInputBus:
     * 
     * Return the name of an input bus.
     */
    @Nullable
    @Generated
    @Selector("nameForInputBus:")
    public native String nameForInputBus(@NUInt long bus);

    /**
     * nameForOutputBus:
     * 
     * Return the name of an output bus.
     */
    @Nullable
    @Generated
    @Selector("nameForOutputBus:")
    public native String nameForOutputBus(@NUInt long bus);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioNode new_objc();

    /**
     * [@property] numberOfInputs
     * 
     * The node's number of input busses.
     */
    @Generated
    @Selector("numberOfInputs")
    @NUInt
    public native long numberOfInputs();

    /**
     * [@property] numberOfOutputs
     * 
     * The node's number of output busses.
     */
    @Generated
    @Selector("numberOfOutputs")
    @NUInt
    public native long numberOfOutputs();

    /**
     * outputFormatForBus:
     * 
     * Obtain an output bus's format.
     */
    @NotNull
    @Generated
    @Selector("outputFormatForBus:")
    public native AVAudioFormat outputFormatForBus(@NUInt long bus);

    /**
     * [@property] outputPresentationLatency
     * 
     * The maximum render pipeline latency downstream of the node, in seconds.
     * 
     * This describes the maximum time it will take for the audio at the output of a node to be
     * presented.
     * For instance, the output presentation latency of the output node in the engine is:
     * - zero in manual rendering mode
     * - the presentation latency of the device itself when rendering to an audio device
     * (see `AVAudioIONode(presentationLatency)`)
     * The output presentation latency of a node connected directly to the output node is the
     * output node's presentation latency plus the output node's processing latency (see `latency`).
     * 
     * For a node which is exclusively in the input node chain (i.e. not connected to engine's
     * output node), this property reflects the latency for the output of this node to be
     * presented at the output of the terminating node in the input chain.
     * 
     * A value of zero indicates either an unknown or no latency.
     * 
     * Note that this latency value can change as the engine is reconfigured (started/stopped,
     * connections made/altered downstream of this node etc.). So it is recommended not to cache
     * this value and fetch it whenever it's needed.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("outputPresentationLatency")
    public native double outputPresentationLatency();

    /**
     * removeTapOnBus:
     * 
     * Destroy a tap.
     * 
     * @param bus
     *            the node output bus whose tap is to be destroyed
     */
    @Generated
    @Selector("removeTapOnBus:")
    public native void removeTapOnBus(@NUInt long bus);

    /**
     * reset
     * 
     * Clear a unit's previous processing state.
     */
    @Generated
    @Selector("reset")
    public native void reset();

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
