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

import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICoordinateSpace")
public interface UICoordinateSpace {
    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("bounds")
    @ByValue
    CGRect bounds();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("convertPoint:fromCoordinateSpace:")
    @ByValue
    CGPoint convertPointFromCoordinateSpace(@ByValue CGPoint point,
            @NotNull @Mapped(ObjCObjectMapper.class) UICoordinateSpace coordinateSpace);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("convertPoint:toCoordinateSpace:")
    @ByValue
    CGPoint convertPointToCoordinateSpace(@ByValue CGPoint point,
            @NotNull @Mapped(ObjCObjectMapper.class) UICoordinateSpace coordinateSpace);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("convertRect:fromCoordinateSpace:")
    @ByValue
    CGRect convertRectFromCoordinateSpace(@ByValue CGRect rect,
            @NotNull @Mapped(ObjCObjectMapper.class) UICoordinateSpace coordinateSpace);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("convertRect:toCoordinateSpace:")
    @ByValue
    CGRect convertRectToCoordinateSpace(@ByValue CGRect rect,
            @NotNull @Mapped(ObjCObjectMapper.class) UICoordinateSpace coordinateSpace);
}
