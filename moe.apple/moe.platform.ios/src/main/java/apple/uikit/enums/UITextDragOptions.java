package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class UITextDragOptions {
    @Generated
    private UITextDragOptions() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long OptionsNone = 0x0000000000000000L;
    /**
     * By default, previews generated by the system will retain
     * the foreground and background text colors.
     * Activating this option causes those colors to be stripped away,
     * resulting in a text preview with black text on a clear background.
     * This affects only the preview, not the contents of the drag.
     * Any embedded images in the preview will remain as they are.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long OptionStripTextColorFromPreviews = 0x0000000000000001L;
}