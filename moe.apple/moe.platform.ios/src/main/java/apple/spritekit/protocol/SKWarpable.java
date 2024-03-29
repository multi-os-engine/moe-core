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

package apple.spritekit.protocol;

import apple.spritekit.SKWarpGeometry;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SKWarpable")
public interface SKWarpable {
    /**
     * maximum number of subdivision iterations used to generate the final vertices
     */
    @Generated
    @Selector("setSubdivisionLevels:")
    void setSubdivisionLevels(@NInt long value);

    /**
     * Warp geometry used to define the distortion
     */
    @Generated
    @Selector("setWarpGeometry:")
    void setWarpGeometry(@Nullable SKWarpGeometry value);

    /**
     * maximum number of subdivision iterations used to generate the final vertices
     */
    @Generated
    @Selector("subdivisionLevels")
    @NInt
    long subdivisionLevels();

    /**
     * Warp geometry used to define the distortion
     */
    @Nullable
    @Generated
    @Selector("warpGeometry")
    SKWarpGeometry warpGeometry();
}
