package apple.usernotifications.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 15.0
 */
@Generated
public final class UNNotificationInterruptionLevel {
    @Generated
    private UNNotificationInterruptionLevel() {
    }

    /**
     * Added to the notification list; does not light up screen or play sound
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Passive = 0x0000000000000000L;
    /**
     * Presented immediately; Lights up screen and may play a sound
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Active = 0x0000000000000001L;
    /**
     * Presented immediately; Lights up screen and may play a sound; May be presented during Do Not Disturb
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long TimeSensitive = 0x0000000000000002L;
    /**
     * Presented immediately; Lights up screen and plays sound; Always presented during Do Not Disturb; Bypasses mute
     * switch; Includes default critical alert sound if no sound provided
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Critical = 0x0000000000000003L;
}
