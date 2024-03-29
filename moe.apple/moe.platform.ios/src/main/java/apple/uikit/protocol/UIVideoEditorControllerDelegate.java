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

import apple.foundation.NSError;
import apple.uikit.UIVideoEditorController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIVideoEditorControllerDelegate")
public interface UIVideoEditorControllerDelegate {
    @Generated
    @IsOptional
    @Selector("videoEditorController:didFailWithError:")
    default void videoEditorControllerDidFailWithError(@NotNull UIVideoEditorController editor,
            @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * edited video is saved to a path in app's temporary directory
     */
    @Generated
    @IsOptional
    @Selector("videoEditorController:didSaveEditedVideoToPath:")
    default void videoEditorControllerDidSaveEditedVideoToPath(@NotNull UIVideoEditorController editor,
            @NotNull String editedVideoPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("videoEditorControllerDidCancel:")
    default void videoEditorControllerDidCancel(@NotNull UIVideoEditorController editor) {
        throw new java.lang.UnsupportedOperationException();
    }
}
