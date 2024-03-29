package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptureLensStabilizationStatus
 * 
 * Constants indicating the status of the lens stabilization module (aka OIS).
 * 
 * [@constant] AVCaptureLensStabilizationStatusUnsupported
 * Indicates that lens stabilization is unsupported.
 * [@constant] AVCaptureLensStabilizationStatusOff
 * Indicates that lens stabilization was not in use for this capture.
 * [@constant] AVCaptureLensStabilizationStatusActive
 * Indicates that the lens stabilization module was active for the duration of the capture.
 * [@constant] AVCaptureLensStabilizationStatusOutOfRange
 * Indicates that device motion or capture duration exceeded the stabilization module's correction limits.
 * [@constant] AVCaptureLensStabilizationStatusUnavailable
 * Indicates that the lens stabilization module was unavailable for use at the time of capture. The module may be
 * available in subsequent captures.
 * 
 * API-Since: 11.0
 */
@Generated
public final class AVCaptureLensStabilizationStatus {
    @Generated
    private AVCaptureLensStabilizationStatus() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Unsupported = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Off = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Active = 0x0000000000000002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long OutOfRange = 0x0000000000000003L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Unavailable = 0x0000000000000004L;
}
