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

import apple.uikit.UIDocumentMenuViewController;
import apple.uikit.UIDocumentPickerViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 8.0
 * Deprecated-Since: 13.0
 * Deprecated-Message: UIDocumentMenuDelegate is deprecated. Use UIDocumentPickerViewController directly.
 */
@Deprecated
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDocumentMenuDelegate")
public interface UIDocumentMenuDelegate {
    @Generated
    @Selector("documentMenu:didPickDocumentPicker:")
    void documentMenuDidPickDocumentPicker(@NotNull UIDocumentMenuViewController documentMenu,
            @NotNull UIDocumentPickerViewController documentPicker);

    @Generated
    @IsOptional
    @Selector("documentMenuWasCancelled:")
    default void documentMenuWasCancelled(@NotNull UIDocumentMenuViewController documentMenu) {
        throw new java.lang.UnsupportedOperationException();
    }
}
