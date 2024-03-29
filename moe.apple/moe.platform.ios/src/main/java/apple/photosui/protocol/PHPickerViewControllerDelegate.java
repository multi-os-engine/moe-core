package apple.photosui.protocol;

import apple.foundation.NSArray;
import apple.photosui.PHPickerResult;
import apple.photosui.PHPickerViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * A set of methods that the delegate must implement to respond to \c PHPickerViewController user events.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("PhotosUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PHPickerViewControllerDelegate")
public interface PHPickerViewControllerDelegate {
    /**
     * Called when the user completes a selection or dismisses \c PHPickerViewController using the cancel button.
     * 
     * The picker won't be automatically dismissed when this method is called.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("picker:didFinishPicking:")
    void pickerDidFinishPicking(@NotNull PHPickerViewController picker,
            @NotNull NSArray<? extends PHPickerResult> results);
}
