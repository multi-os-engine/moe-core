package apple.avfaudio;

import apple.NSObject;
import apple.coreaudiotypes.struct.AudioTimeStamp;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * AVAudioTime
 * 
 * Represent a moment in time.
 * 
 * AVAudioTime is used in AVAudioEngine to represent time. Instances are immutable.
 * 
 * A single moment in time may be represented in two different ways:
 * 1. mach_absolute_time(), the system's basic clock. Commonly referred to as "host time."
 * 2. audio samples at a particular sample rate
 * 
 * A single AVAudioTime instance may contain either or both representations; it might
 * represent only a sample time, only a host time, or both.
 * 
 * Rationale for using host time:
 * [a] internally we are using AudioTimeStamp, which uses host time, and it seems silly to divide
 * [b] it is consistent with a standard system timing service
 * [c] we do provide conveniences to convert between host ticks and seconds (host time divided by
 * frequency) so client code wanting to do what should be straightforward time computations can at
 * least not be cluttered by ugly multiplications and divisions by the host clock frequency.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioTime extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioTime(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioTime alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioTime allocWithZone(VoidPtr zone);

    /**
     * [@property] audioTimeStamp
     * 
     * The time expressed as an AudioTimeStamp structure.
     * 
     * This may be useful for compatibility with lower-level CoreAudio and AudioToolbox API's.
     */
    @Generated
    @Selector("audioTimeStamp")
    @ByValue
    public native AudioTimeStamp audioTimeStamp();

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
     * extrapolateTimeFromAnchor:
     * 
     * Converts between host and sample time.
     * 
     * If anchorTime is an AVAudioTime where both host time and sample time are valid,
     * and self is another timestamp where only one of the two is valid, this method
     * returns a new AVAudioTime copied from self and where any additional valid fields provided by
     * the anchor are also valid.
     * 
     * Note that the anchorTime must have both host and sample time valid, and self must have
     * sample rate and at least one of host or sample time valid. Otherwise this method returns nil.
     * 
     * <pre>
     * // time0 has a valid audio sample representation, but no host time representation.
     * AVAudioTime *time0 = [AVAudioTime timeWithSampleTime: 0.0 atRate: 44100.0];
     * // anchor has a valid host time representation and sample time representation.
     * AVAudioTime *anchor = [player playerTimeForNodeTime: player.lastRenderTime];
     * // fill in valid host time representation
     * AVAudioTime *fullTime0 = [time0 extrapolateTimeFromAnchor: anchor];
     * </pre>
     * 
     * @param anchorTime
     *                   An AVAudioTime with a more complete AudioTimeStamp than that of the receiver (self).
     * @return
     *         the extrapolated time
     */
    @Nullable
    @Generated
    @Selector("extrapolateTimeFromAnchor:")
    public native AVAudioTime extrapolateTimeFromAnchor(@NotNull AVAudioTime anchorTime);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] hostTime
     * 
     * The host time.
     */
    @Generated
    @Selector("hostTime")
    public native long hostTime();

    /**
     * hostTimeForSeconds:
     * 
     * Convert seconds to host time.
     */
    @Generated
    @Selector("hostTimeForSeconds:")
    public static native long hostTimeForSeconds(double seconds);

    @Generated
    @Selector("init")
    public native AVAudioTime init();

    /**
     * initWithAudioTimeStamp:sampleRate:
     */
    @Generated
    @Selector("initWithAudioTimeStamp:sampleRate:")
    public native AVAudioTime initWithAudioTimeStampSampleRate(@NotNull AudioTimeStamp ts, double sampleRate);

    /**
     * initWithHostTime:
     */
    @Generated
    @Selector("initWithHostTime:")
    public native AVAudioTime initWithHostTime(long hostTime);

    /**
     * initWithHostTime:sampleTime:atRate:
     */
    @Generated
    @Selector("initWithHostTime:sampleTime:atRate:")
    public native AVAudioTime initWithHostTimeSampleTimeAtRate(long hostTime, long sampleTime, double sampleRate);

    /**
     * initWithSampleTime:atRate:
     */
    @Generated
    @Selector("initWithSampleTime:atRate:")
    public native AVAudioTime initWithSampleTimeAtRate(long sampleTime, double sampleRate);

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

    /**
     * [@property] hostTimeValid
     * 
     * Whether the hostTime property is valid.
     */
    @Generated
    @Selector("isHostTimeValid")
    public native boolean isHostTimeValid();

    /**
     * [@property] sampleTimeValid
     * 
     * Whether the sampleTime and sampleRate properties are valid.
     */
    @Generated
    @Selector("isSampleTimeValid")
    public native boolean isSampleTimeValid();

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
    public static native AVAudioTime new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] sampleRate
     * 
     * The sample rate at which sampleTime is being expressed.
     */
    @Generated
    @Selector("sampleRate")
    public native double sampleRate();

    /**
     * [@property] sampleTime
     * 
     * The time as a number of audio samples, as tracked by the current audio device.
     */
    @Generated
    @Selector("sampleTime")
    public native long sampleTime();

    /**
     * secondsForHostTime:
     * 
     * Convert host time to seconds.
     */
    @Generated
    @Selector("secondsForHostTime:")
    public static native double secondsForHostTime(long hostTime);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * timeWithAudioTimeStamp:sampleRate:
     */
    @Generated
    @Selector("timeWithAudioTimeStamp:sampleRate:")
    public static native AVAudioTime timeWithAudioTimeStampSampleRate(@NotNull AudioTimeStamp ts, double sampleRate);

    /**
     * timeWithHostTime:
     */
    @Generated
    @Selector("timeWithHostTime:")
    public static native AVAudioTime timeWithHostTime(long hostTime);

    /**
     * timeWithHostTime:sampleTime:atRate:
     */
    @Generated
    @Selector("timeWithHostTime:sampleTime:atRate:")
    public static native AVAudioTime timeWithHostTimeSampleTimeAtRate(long hostTime, long sampleTime,
            double sampleRate);

    /**
     * timeWithSampleTime:atRate:
     */
    @Generated
    @Selector("timeWithSampleTime:atRate:")
    public static native AVAudioTime timeWithSampleTimeAtRate(long sampleTime, double sampleRate);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
