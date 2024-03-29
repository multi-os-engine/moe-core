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

import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Protocol for classes that act as a factory to find a restorable object during state restoration
 * A class must implement this protocol if it is specified as the restoration class of a UIRestorableObject.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIObjectRestoration")
public interface UIObjectRestoration {
    @Nullable
    @Generated
    @Selector("objectWithRestorationIdentifierPath:coder:")
    @ProtocolClassMethod("objectWithRestorationIdentifierPathCoder")
    @MappedReturn(ObjCObjectMapper.class)
    UIStateRestoring _objectWithRestorationIdentifierPathCoder(@NotNull NSArray<String> identifierComponents,
            @NotNull NSCoder coder);
}
