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

package apple.coretext.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] CTFrameProgression
 * 
 * These constants specify frame progression types.
 * 
 * The lines of text within a frame may be stacked for either
 * horizontal or vertical text. Values are enumerated for each
 * stacking type supported by CTFrame. Frames created with a
 * progression type specifying vertical text will rotate lines
 * 90 degrees counterclockwise when drawing.
 * 
 * [@constant] kCTFrameProgressionTopToBottom
 * Lines are stacked top to bottom for horizontal text.
 * 
 * [@constant] kCTFrameProgressionRightToLeft
 * Lines are stacked right to left for vertical text.
 * 
 * [@constant] kCTFrameProgressionLeftToRight
 * Lines are stacked left to right for vertical text.
 */
@Generated
public final class CTFrameProgression {
    @Generated public static final int TopToBottom = 0x00000000;
    @Generated public static final int RightToLeft = 0x00000001;
    @Generated public static final int LeftToRight = 0x00000002;

    @Generated
    private CTFrameProgression() {
    }
}
