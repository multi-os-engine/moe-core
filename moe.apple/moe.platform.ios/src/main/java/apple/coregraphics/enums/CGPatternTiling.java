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

package apple.coregraphics.enums;

import org.moe.natj.general.ann.Generated;

/**
 * kCGPatternTilingNoDistortion: The pattern cell is not distorted when
 * painted, however the spacing between pattern cells may vary by as much as
 * 1 device pixel.
 * 
 * kCGPatternTilingConstantSpacingMinimalDistortion: Pattern cells are
 * spaced consistently, however the pattern cell may be distorted by as much
 * as 1 device pixel when the pattern is painted.
 * 
 * kCGPatternTilingConstantSpacing: Pattern cells are spaced consistently as
 * with kCGPatternTilingConstantSpacingMinimalDistortion, however the
 * pattern cell may be distorted additionally to permit a more efficient
 * implementation.
 */
@Generated
public final class CGPatternTiling {
    @Generated public static final int NoDistortion = 0x00000000;
    @Generated public static final int ConstantSpacingMinimalDistortion = 0x00000001;
    @Generated public static final int ConstantSpacing = 0x00000002;

    @Generated
    private CGPatternTiling() {
    }
}
