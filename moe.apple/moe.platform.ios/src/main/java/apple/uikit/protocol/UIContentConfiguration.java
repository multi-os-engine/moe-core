package apple.uikit.protocol;

import apple.foundation.protocol.NSCopying;
import apple.uikit.UIView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIContentConfiguration")
public interface UIContentConfiguration extends NSCopying {
    /**
     * Initializes and returns a new instance of the content view using this configuration.
     */
    @NotNull
    @Generated
    @Selector("makeContentView")
    UIView makeContentView();

    /**
     * Returns a copy of the configuration updated for the specified state, by applying the configuration's default
     * values for that state to any properties that have not been customized.
     */
    @NotNull
    @Generated
    @Selector("updatedConfigurationForState:")
    UIContentConfiguration updatedConfigurationForState(
            @NotNull @Mapped(ObjCObjectMapper.class) UIConfigurationState state);
}
