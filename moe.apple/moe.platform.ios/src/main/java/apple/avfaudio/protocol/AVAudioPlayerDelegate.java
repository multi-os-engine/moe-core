package apple.avfaudio.protocol;

import apple.avfaudio.AVAudioPlayer;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A protocol for delegates of AVAudioPlayer
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudioPlayerDelegate")
public interface AVAudioPlayerDelegate {
    /**
     * audioPlayerBeginInterruption: is called when the audio session has been interrupted while the player was playing.
     * The player will have been paused.
     * 
     * API-Since: 2.2
     * Deprecated-Since: 8.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioPlayerBeginInterruption:")
    default void audioPlayerBeginInterruption(@NotNull AVAudioPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * if an error occurs while decoding it will be reported to the delegate.
     */
    @Generated
    @IsOptional
    @Selector("audioPlayerDecodeErrorDidOccur:error:")
    default void audioPlayerDecodeErrorDidOccurError(@NotNull AVAudioPlayer player, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * audioPlayerDidFinishPlaying:successfully: is called when a sound has finished playing. This method is NOT called
     * if the player is stopped due to an interruption.
     */
    @Generated
    @IsOptional
    @Selector("audioPlayerDidFinishPlaying:successfully:")
    default void audioPlayerDidFinishPlayingSuccessfully(@NotNull AVAudioPlayer player, boolean flag) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * audioPlayerEndInterruption: is called when the preferred method, audioPlayerEndInterruption:withFlags:, is not
     * implemented.
     * 
     * API-Since: 2.2
     * Deprecated-Since: 6.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioPlayerEndInterruption:")
    default void audioPlayerEndInterruption(@NotNull AVAudioPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioPlayerEndInterruption:withFlags:")
    default void audioPlayerEndInterruptionWithFlags(@NotNull AVAudioPlayer player, @NUInt long flags) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * audioPlayerEndInterruption:withOptions: is called when the audio session interruption has ended and this player
     * had been interrupted while playing.
     * Currently the only flag is AVAudioSessionInterruptionFlags_ShouldResume.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioPlayerEndInterruption:withOptions:")
    default void audioPlayerEndInterruptionWithOptions(@NotNull AVAudioPlayer player, @NUInt long flags) {
        throw new java.lang.UnsupportedOperationException();
    }
}
