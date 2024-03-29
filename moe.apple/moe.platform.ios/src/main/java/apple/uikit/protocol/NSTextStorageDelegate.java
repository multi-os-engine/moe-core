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

import apple.foundation.struct.NSRange;
import apple.uikit.NSTextStorage;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * NSTextStorage delegate methods ***
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextStorageDelegate")
public interface NSTextStorageDelegate {
    /**
     * Sent inside -processEditing right before notifying layout managers. Delegates can change the attributes.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("textStorage:didProcessEditing:range:changeInLength:")
    default void textStorageDidProcessEditingRangeChangeInLength(@NotNull NSTextStorage textStorage,
            @NUInt long editedMask, @ByValue NSRange editedRange, @NInt long delta) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent inside -processEditing right before fixing attributes. Delegates can change the characters or attributes.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("textStorage:willProcessEditing:range:changeInLength:")
    default void textStorageWillProcessEditingRangeChangeInLength(@NotNull NSTextStorage textStorage,
            @NUInt long editedMask, @ByValue NSRange editedRange, @NInt long delta) {
        throw new java.lang.UnsupportedOperationException();
    }
}
