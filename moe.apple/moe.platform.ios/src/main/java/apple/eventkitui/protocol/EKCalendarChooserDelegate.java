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

package apple.eventkitui.protocol;

import apple.eventkitui.EKCalendarChooser;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("EventKitUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("EKCalendarChooserDelegate")
public interface EKCalendarChooserDelegate {
    @Generated
    @IsOptional
    @Selector("calendarChooserDidCancel:")
    default void calendarChooserDidCancel(@NotNull EKCalendarChooser calendarChooser) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * These are called when the corresponding button is pressed to dismiss the
     * controller. It is up to the recipient to dismiss the chooser.
     */
    @Generated
    @IsOptional
    @Selector("calendarChooserDidFinish:")
    default void calendarChooserDidFinish(@NotNull EKCalendarChooser calendarChooser) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called whenever the selection is changed by the user
     */
    @Generated
    @IsOptional
    @Selector("calendarChooserSelectionDidChange:")
    default void calendarChooserSelectionDidChange(@NotNull EKCalendarChooser calendarChooser) {
        throw new java.lang.UnsupportedOperationException();
    }
}
