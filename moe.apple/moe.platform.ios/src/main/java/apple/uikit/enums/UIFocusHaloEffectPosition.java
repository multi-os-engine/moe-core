package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 15.0
 */
@Generated
public final class UIFocusHaloEffectPosition {
    @Generated
    private UIFocusHaloEffectPosition() {
    }

    /**
     * Automatically detects the best position depending on the the focus item and its containing view hierarchy.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Draws the halo around the given shape.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Outside = 0x0000000000000001L;
    /**
     * Draws the halo inside the given shape.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Inside = 0x0000000000000002L;
}
