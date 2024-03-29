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

import apple.uikit.UITraitCollection;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Trait environments expose a trait collection that describes their environment.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITraitEnvironment")
public interface UITraitEnvironment {
    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("traitCollection")
    UITraitCollection traitCollection();

    /**
     * To be overridden as needed to provide custom behavior when the environment's traits change.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use the trait change registration APIs declared in the UITraitChangeObservable protocol
     */
    @Deprecated
    @Generated
    @Selector("traitCollectionDidChange:")
    void traitCollectionDidChange(@Nullable UITraitCollection previousTraitCollection);
}
