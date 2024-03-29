package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKElectrocardiogramClassification
 * 
 * The possible classifications determined for HKElectrocardiograms
 * 
 * [@constant] HKElectrocardiogramClassificationNotSet No classification is set on this sample.
 * [@constant] HKElectrocardiogramClassificationSinusRhythm The sample exhibits no signs of atrial fibrillation.
 * [@constant] HKElectrocardiogramClassificationAtrialFibrillation The sample exhibits signs of atrial fibrillation.
 * [@constant] HKElectrocardiogramClassificationInconclusiveLowHeartRate The sample classifier could not check for
 * atrial fibrillation due to a heart rate under 50 BPM.
 * [@constant] HKElectrocardiogramClassificationInconclusiveHighHeartRate The sample classifier could not check for
 * atrial fibrillation due to a high heart rate.
 * [@constant] HKElectrocardiogramClassificationInconclusivePoorReading The sample classifier did not attempt a
 * classification due to not meeting the signal requirements.
 * [@constant] HKElectrocardiogramClassificationInconclusiveOther The sample classifier could not determine a
 * classification.
 * [@constant] HKElectrocardiogramClassificationUnrecognized The classification created for this sample is unrecognized
 * on this device.
 * 
 * API-Since: 14.0
 */
@Generated
public final class HKElectrocardiogramClassification {
    @Generated
    private HKElectrocardiogramClassification() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long NotSet = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long SinusRhythm = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long AtrialFibrillation = 0x0000000000000002L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long InconclusiveLowHeartRate = 0x0000000000000003L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long InconclusiveHighHeartRate = 0x0000000000000004L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long InconclusivePoorReading = 0x0000000000000005L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long InconclusiveOther = 0x0000000000000006L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Unrecognized = 0x0000000000000064L;
}
