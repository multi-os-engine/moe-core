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

package apple.videotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * When multi-pass encoding has been enabled by setting kVTCompressionPropertyKey_MultiPassStorage, you must call
 * VTCompressionSessionBeginPass before each pass in which you call VTCompressionSessionEncodeFrame for source frames;
 * you must call VTCompressionSessionEndPass to end each pass; and in each pass you must pass an identical sequence of
 * source frames, frame properties and timestamps (except that source frames outside a pass' time ranges should be
 * skipped). See kVTCompressionPropertyKey_MultiPassStorage for additional rules and guidance.
 */
@Generated
public final class VTCompressionSessionOptionFlags {
    @Generated public static final int kVTCompressionSessionBeginFinalPass = 0x00000001;

    @Generated
    private VTCompressionSessionOptionFlags() {
    }
}
