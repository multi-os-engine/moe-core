package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptureMicrophoneMode
 * 
 * Constants describing microphone filtering modes.
 * 
 * [@constant] AVCaptureMicrophoneModeStandard
 * Indicates that microphone audio is being processed with standard voice DSP.
 * [@constant] AVCaptureMicrophoneModeWideSpectrum
 * Indicates that microphone audio processing is minimized to capture all sounds in the room.
 * [@constant] AVCaptureMicrophoneModeVoiceIsolation
 * Indicates that microphone audio is being processed to isolate the voice and attenuate other signals.
 * 
 * API-Since: 15.0
 */
@Generated
public final class AVCaptureMicrophoneMode {
    @Generated
    private AVCaptureMicrophoneMode() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Standard = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long WideSpectrum = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long VoiceIsolation = 0x0000000000000002L;
}
