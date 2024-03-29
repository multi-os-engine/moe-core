/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.uikit.protocol;

import apple.foundation.struct.NSRange;
import apple.uikit.NSLayoutManager;
import apple.uikit.NSTextContainer;
import apple.uikit.UIFont;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstNIntPtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSLayoutManagerDelegate")
public interface NSLayoutManagerDelegate {
    /**
     * Invoked for resolving the glyph metrics for NSControlCharacterWhitespaceAction control character.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManager:boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    @ByValue
    default CGRect layoutManagerBoundingBoxForControlGlyphAtIndexForTextContainerProposedLineFragmentGlyphPositionCharacterIndex(
            @NotNull NSLayoutManager layoutManager, @NUInt long glyphIndex, @NotNull NSTextContainer textContainer,
            @ByValue CGRect proposedRect, @ByValue CGPoint glyphPosition, @NUInt long charIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is sent whenever a container has been filled. This method can be useful for paginating. The textContainer
     * might be nil if we have completed all layout and not all of it fit into the existing containers. The atEnd flag
     * indicates whether all layout is complete.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManager:didCompleteLayoutForTextContainer:atEnd:")
    default void layoutManagerDidCompleteLayoutForTextContainerAtEnd(@NotNull NSLayoutManager layoutManager,
            @Nullable NSTextContainer textContainer, boolean layoutFinishedFlag) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the spacing after the line ending with glyphIndex.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManager:lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    @NFloat
    default double layoutManagerLineSpacingAfterGlyphAtIndexWithProposedLineFragmentRect(
            @NotNull NSLayoutManager layoutManager, @NUInt long glyphIndex, @ByValue CGRect rect) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the paragraph spacing after the line ending with glyphIndex.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManager:paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    @NFloat
    default double layoutManagerParagraphSpacingAfterGlyphAtIndexWithProposedLineFragmentRect(
            @NotNull NSLayoutManager layoutManager, @NUInt long glyphIndex, @ByValue CGRect rect) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the paragraph spacing before the line starting with glyphIndex.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManager:paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:")
    @NFloat
    default double layoutManagerParagraphSpacingBeforeGlyphAtIndexWithProposedLineFragmentRect(
            @NotNull NSLayoutManager layoutManager, @NUInt long glyphIndex, @ByValue CGRect rect) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked while determining the hyphenation point. When NO, NSLayoutManager tries to find the next hyphenation
     * opportunity before charIndex
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManager:shouldBreakLineByHyphenatingBeforeCharacterAtIndex:")
    default boolean layoutManagerShouldBreakLineByHyphenatingBeforeCharacterAtIndex(
            @NotNull NSLayoutManager layoutManager, @NUInt long charIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked while determining the soft line break point. When NO, NSLayoutManager tries to find the next line break
     * opportunity before charIndex
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManager:shouldBreakLineByWordBeforeCharacterAtIndex:")
    default boolean layoutManagerShouldBreakLineByWordBeforeCharacterAtIndex(@NotNull NSLayoutManager layoutManager,
            @NUInt long charIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Glyph generation ***********************
     * This is sent whenever layoutManager is about to store the initial glyph information via
     * -setGlyphs:properties:characterIndexes:forGlyphRange:. This method allows customizing the initial glyph
     * generation process. It can invoke -setGlyphs:properties:characterIndexes:forGlyphRange: with modified glyph
     * information. The return value specifies the actual glyph range stored in this method. By returning 0, it can
     * indicate layoutManager to do the default processing. Note that querying glyph information surrounding glyphRange
     * could lead to recursion since the data might not be available, yet.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManager:shouldGenerateGlyphs:properties:characterIndexes:font:forGlyphRange:")
    @NUInt
    default long layoutManagerShouldGenerateGlyphsPropertiesCharacterIndexesFontForGlyphRange(
            @NotNull NSLayoutManager layoutManager, @NotNull ConstCharPtr glyphs, @NotNull ConstNIntPtr props,
            @NotNull ConstNUIntPtr charIndexes, @NotNull UIFont aFont, @ByValue NSRange glyphRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Allows NSLayoutManagerDelegate to customize the line fragment geometry before committing to the layout cache. The
     * implementation of this method should make sure that the modified fragments are still valid inside the text
     * container coordinate. When it returns YES, the layout manager uses the modified rects. Otherwise, it ignores the
     * rects returned from this method.
     * 
     * API-Since: 9.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManager:shouldSetLineFragmentRect:lineFragmentUsedRect:baselineOffset:inTextContainer:forGlyphRange:")
    default boolean layoutManagerShouldSetLineFragmentRectLineFragmentUsedRectBaselineOffsetInTextContainerForGlyphRange(
            @NotNull NSLayoutManager layoutManager, @NotNull CGRect lineFragmentRect,
            @NotNull CGRect lineFragmentUsedRect, @NotNull NFloatPtr baselineOffset,
            @NotNull NSTextContainer textContainer, @ByValue NSRange glyphRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the control character action for the control character at charIndex.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManager:shouldUseAction:forControlCharacterAtIndex:")
    @NInt
    default long layoutManagerShouldUseActionForControlCharacterAtIndex(@NotNull NSLayoutManager layoutManager,
            @NInt long action, @NUInt long charIndex) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is sent right before layoutManager invalidates the layout due to textContainer changing geometry. The
     * receiver of this method can react to the geometry change and perform adjustments such as recreating the exclusion
     * path.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManager:textContainer:didChangeGeometryFromSize:")
    default void layoutManagerTextContainerDidChangeGeometryFromSize(@NotNull NSLayoutManager layoutManager,
            @NotNull NSTextContainer textContainer, @ByValue CGSize oldSize) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Layout processing ***********************
     * This is sent whenever layout or glyphs become invalidated in a layout manager which previously had all layout
     * complete.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("layoutManagerDidInvalidateLayout:")
    default void layoutManagerDidInvalidateLayout(@NotNull NSLayoutManager sender) {
        throw new java.lang.UnsupportedOperationException();
    }
}
