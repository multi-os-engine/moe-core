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

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptureTorchMode
 * <p>
 * Constants indicating the mode of the torch on the receiver's device, if it has one.
 * <p>
 * [@constant] AVCaptureTorchModeOff
 * Indicates that the torch should always be off.
 * [@constant] AVCaptureTorchModeOn
 * Indicates that the torch should always be on.
 * [@constant] AVCaptureTorchModeAuto
 * Indicates that the torch should be used automatically depending on ambient light conditions.
 */
@Generated
public final class AVCaptureTorchMode {
    @Generated @NInt public static final long Off = 0x0000000000000000L;
    @Generated @NInt public static final long On = 0x0000000000000001L;
    @Generated @NInt public static final long Auto = 0x0000000000000002L;

    @Generated
    private AVCaptureTorchMode() {
    }
}
