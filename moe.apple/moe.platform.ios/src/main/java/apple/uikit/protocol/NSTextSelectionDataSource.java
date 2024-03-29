package apple.uikit.protocol;

import apple.uikit.NSTextRange;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextSelectionDataSource")
public interface NSTextSelectionDataSource {
    /**
     * Returns the base writing direction at location. It is recommended to return the resolved base direction either
     * NSTextSelectionNavigationWritingDirectionLeftToRight or NSTextSelectionNavigationWritingDirectionRightToLeft.
     */
    @Generated
    @Selector("baseWritingDirectionAtLocation:")
    @NInt
    long baseWritingDirectionAtLocation(@NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);

    /**
     * Declares the starting and ending locations for the document.
     */
    @NotNull
    @Generated
    @Selector("documentRange")
    NSTextRange documentRange();

    /**
     * Layout
     * Enumerates all the caret offset from left to right in visual order. caretOffset should be in the coordinate
     * system for the text container. When leadingEdge=YES, it indicates caretOffset is at the edge logically preceding
     * the character. For LTR characters, it is on the left, and on the right for RTL characters.
     */
    @Generated
    @Selector("enumerateCaretOffsetsInLineFragmentAtLocation:usingBlock:")
    void enumerateCaretOffsetsInLineFragmentAtLocationUsingBlock(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location,
            @NotNull @ObjCBlock(name = "call_enumerateCaretOffsetsInLineFragmentAtLocationUsingBlock") Block_enumerateCaretOffsetsInLineFragmentAtLocationUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateCaretOffsetsInLineFragmentAtLocationUsingBlock {
        @Generated
        void call_enumerateCaretOffsetsInLineFragmentAtLocationUsingBlock(@NFloat double caretOffset,
                @NotNull @Mapped(ObjCObjectMapper.class) Object location, boolean leadingEdge, @NotNull BoolPtr stop);
    }

    /**
     * This optional method should be implemented enumerating the text container/page boundary when the text selection
     * data provider supports such a layout functionality.
     */
    @Generated
    @IsOptional
    @Selector("enumerateContainerBoundariesFromLocation:reverse:usingBlock:")
    default void enumerateContainerBoundariesFromLocationReverseUsingBlock(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location, boolean reverse,
            @NotNull @ObjCBlock(name = "call_enumerateContainerBoundariesFromLocationReverseUsingBlock") Block_enumerateContainerBoundariesFromLocationReverseUsingBlock block) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateContainerBoundariesFromLocationReverseUsingBlock {
        @Generated
        void call_enumerateContainerBoundariesFromLocationReverseUsingBlock(
                @NotNull @Mapped(ObjCObjectMapper.class) Object boundaryLocation, @NotNull BoolPtr stop);
    }

    /**
     * Enumerating the textual segment boundaries starting at location. The segmentation logic should be based on the
     * natural language semantics and rules such as Unicode Text Segmentation UAX 29. It is allowed to have custom text
     * segmentation behavior for specialized document contents (i.e. text editors with structured document contents such
     * as a programming language). NSStringEnumerationByLines should be aware of the visual line boundaries based on
     * soft line wrapping.
     */
    @Generated
    @Selector("enumerateSubstringsFromLocation:options:usingBlock:")
    void enumerateSubstringsFromLocationOptionsUsingBlock(
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_enumerateSubstringsFromLocationOptionsUsingBlock") Block_enumerateSubstringsFromLocationOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateSubstringsFromLocationOptionsUsingBlock {
        @Generated
        void call_enumerateSubstringsFromLocationOptionsUsingBlock(@Nullable String substring,
                @NotNull NSTextRange substringRange, @Nullable NSTextRange enclosingRange, @NotNull BoolPtr stop);
    }

    /**
     * Returns the range of the line fragment containing point inside the coordinate system containing location.
     */
    @Nullable
    @Generated
    @Selector("lineFragmentRangeForPoint:inContainerAtLocation:")
    NSTextRange lineFragmentRangeForPointInContainerAtLocation(@ByValue CGPoint point,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);

    /**
     * Returns a new location from location with offset. The offset value could be positive or negative indicating the
     * logical direction. Could return nil when the inputs don't produce any legal location (i.e. out of bounds index).
     */
    @Nullable
    @Generated
    @Selector("locationFromLocation:withOffset:")
    @MappedReturn(ObjCObjectMapper.class)
    NSTextLocation locationFromLocationWithOffset(@NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location,
            @NInt long offset);

    /**
     * Returns the offset between from and to. The return value could be positive or negative. Could return NSNotFound
     * when the offset cannot be represented in an integer value (i.e. locations are not in the same document).
     */
    @Generated
    @Selector("offsetFromLocation:toLocation:")
    @NInt
    long offsetFromLocationToLocation(@NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation from,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation to);

    /**
     * Returns the text layout orientation at location. If not implemented, NSTextSelectionNavigation assumes it is
     * NSTextSelectionNavigationLayoutOrientationHorizontal.
     */
    @Generated
    @IsOptional
    @Selector("textLayoutOrientationAtLocation:")
    @NInt
    default long textLayoutOrientationAtLocation(@NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns a text range corresponding to selectionGranularity enclosing location. Returns nil when
     * documentRange.isEmpty=YES.
     */
    @Nullable
    @Generated
    @Selector("textRangeForSelectionGranularity:enclosingLocation:")
    NSTextRange textRangeForSelectionGranularityEnclosingLocation(@NInt long selectionGranularity,
            @NotNull @Mapped(ObjCObjectMapper.class) NSTextLocation location);
}
