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

package apple.scenekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] SCNRenderingAPI
 * 
 * rendering API used by SCNView and SCNRenderer.
 * 
 * Default preferred API is SCNRenderingAPIMetal on iOS and it depends on the configuration on macOS.
 * If Metal is requested but not available then it fallbacks to SCNRenderingAPIOpenGLES2 on iOS and to
 * SCNRenderingAPIOpenGLLegacy on macOS.
 * 
 * API-Since: 9.0
 */
@Generated
public final class SCNRenderingAPI {
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long Metal = 0x0000000000000000L;
    @Generated @NUInt public static final long OpenGLES2 = 0x0000000000000001L;

    @Generated
    private SCNRenderingAPI() {
    }
}
