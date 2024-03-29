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
 * [@enum]
 * 
 * Auto-activation settings.
 * [@constant] kCTFontManagerAutoActivationDefault
 * Default auto-activation setting. When specified, the application will use the global setting.
 * [@constant] kCTFontManagerAutoActivationDisabled
 * Disables auto-activation.
 * [@constant] kCTFontManagerAutoActivationEnabled
 * Enables auto-activation.
 * [@constant] kCTFontManagerAutoActivationPromptUser - deprecated and treated as kCTFontManagerAutoActivationDefault on
 * 10.13.
 * Requires user input for auto-activation. A dialog will be presented to the user to confirm auto
 * activation of the font.
 */
@Generated
public final class CTFontManagerAutoActivationSetting {
    @Generated public static final int Default = 0x00000000;
    @Generated public static final int Disabled = 0x00000001;
    @Generated public static final int Enabled = 0x00000002;

    @Generated
    private CTFontManagerAutoActivationSetting() {
    }
}
