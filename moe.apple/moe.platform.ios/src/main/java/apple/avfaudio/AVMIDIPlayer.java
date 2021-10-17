package apple.avfaudio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVMIDIPlayer
 * <p>
 * A player for music file formats (MIDI, iMelody).
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMIDIPlayer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMIDIPlayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMIDIPlayer alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVMIDIPlayer allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * [@property] currentPosition
     * <p>
     * The current playback position in seconds
     * <p>
     * Setting this positions the player to the specified time.  No range checking on the time value is done.
     * This can be set while the player is playing, in which case playback will resume at the new time.
     */
    @Generated
    @Selector("currentPosition")
    public native double currentPosition();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] duration
     * <p>
     * The length of the currently loaded file in seconds.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVMIDIPlayer init();

    /**
     * initWithContentsOfURL:soundBankURL:error:
     * <p>
     * Create a player with the contents of the file specified by the URL.
     * <p>
     * 'bankURL' should contain the path to a SoundFont2 or DLS bank to be used
     * by the MIDI synthesizer.  For OSX it can be set to nil for the default,
     * but for iOS it must always refer to a valid bank file.
     */
    @Generated
    @Selector("initWithContentsOfURL:soundBankURL:error:")
    public native AVMIDIPlayer initWithContentsOfURLSoundBankURLError(NSURL inURL, NSURL bankURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * initWithData:soundBankURL:error:
     * <p>
     * Create a player with the contents of the data object
     * <p>
     * 'bankURL' should contain the path to a SoundFont2 or DLS bank to be used
     * by the MIDI synthesizer.  For OSX it can be set to nil for the default,
     * but for iOS it must always refer to a valid bank file.
     */
    @Generated
    @Selector("initWithData:soundBankURL:error:")
    public native AVMIDIPlayer initWithDataSoundBankURLError(NSData data, NSURL bankURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
     * [@property] playing
     * <p>
     * Indicates whether or not the player is playing
     */
    @Generated
    @Selector("isPlaying")
    public native boolean isPlaying();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVMIDIPlayer new_objc();

    /**
     * play:
     * <p>
     * Play the sequence.
     */
    @Generated
    @Selector("play:")
    public native void play(@ObjCBlock(name = "call_play") Block_play completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_play {
        @Generated
        void call_play();
    }

    /**
     * prepareToPlay
     * <p>
     * Get ready to play the sequence by prerolling all events
     * <p>
     * Happens automatically on play if it has not already been called, but may produce a delay in startup.
     */
    @Generated
    @Selector("prepareToPlay")
    public native void prepareToPlay();

    /**
     * [@property] rate
     * <p>
     * The playback rate of the player
     * <p>
     * 1.0 is normal playback rate.  Rate must be > 0.0.
     */
    @Generated
    @Selector("rate")
    public native float rate();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] currentPosition
     * <p>
     * The current playback position in seconds
     * <p>
     * Setting this positions the player to the specified time.  No range checking on the time value is done.
     * This can be set while the player is playing, in which case playback will resume at the new time.
     */
    @Generated
    @Selector("setCurrentPosition:")
    public native void setCurrentPosition(double value);

    /**
     * [@property] rate
     * <p>
     * The playback rate of the player
     * <p>
     * 1.0 is normal playback rate.  Rate must be > 0.0.
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * stop
     * <p>
     * Stop playing the sequence.
     */
    @Generated
    @Selector("stop")
    public native void stop();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
