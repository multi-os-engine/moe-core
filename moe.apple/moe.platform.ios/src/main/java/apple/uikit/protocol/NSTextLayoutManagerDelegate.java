package apple.uikit.protocol;

import apple.foundation.NSDictionary;
import apple.uikit.NSTextElement;
import apple.uikit.NSTextLayoutFragment;
import apple.uikit.NSTextLayoutManager;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextLayoutManagerDelegate")
public interface NSTextLayoutManagerDelegate {
    /**
     * Rendering attributes
     * Returns a dictionary of rendering attributes for rendering NSLinkAttributeName. Just as other rendering
     * attributes, specifying NSNull removes the attribute from the final attributes used for rendering. It has priority
     * over the general rendering attributes.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("textLayoutManager:renderingAttributesForLink:atLocation:defaultAttributes:")
    default NSDictionary<String, ?> textLayoutManagerRenderingAttributesForLinkAtLocationDefaultAttributes(
            @NotNull NSTextLayoutManager textLayoutManager, @NotNull @Mapped(ObjCObjectMapper.class) Object link,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location,
            @NotNull NSDictionary<String, ?> renderingAttributes) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Layout behavior
     * Invoked while determining the soft line break point. When hyphenating=NO, NSTextLayoutManager tries to find the
     * next line break opportunity before location. When hyphenating=YES, it is an auto-hyphenation point.
     */
    @Generated
    @IsOptional
    @Selector("textLayoutManager:shouldBreakLineBeforeLocation:hyphenating:")
    default boolean textLayoutManagerShouldBreakLineBeforeLocationHyphenating(
            @NotNull NSTextLayoutManager textLayoutManager,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location, boolean hyphenating) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * NSTextLayoutFragment management
     * Returns NSTextLayoutFragment for location in textElement. NSTextLayoutManagerDelegate could provide an
     * NSTextLayoutFragment specialized for an NSTextElement subclass targeted for the rendering surface.
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("textLayoutManager:textLayoutFragmentForLocation:inTextElement:")
    default NSTextLayoutFragment textLayoutManagerTextLayoutFragmentForLocationInTextElement(
            @NotNull NSTextLayoutManager textLayoutManager,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location, @NotNull NSTextElement textElement) {
        throw new java.lang.UnsupportedOperationException();
    }
}
