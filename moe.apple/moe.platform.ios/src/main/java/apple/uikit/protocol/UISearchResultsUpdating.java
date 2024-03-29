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

import apple.uikit.UISearchController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UISearchResultsUpdating")
public interface UISearchResultsUpdating {
    /**
     * Called when the search bar's text or scope has changed or when the search bar becomes first responder.
     */
    @Generated
    @Selector("updateSearchResultsForSearchController:")
    void updateSearchResultsForSearchController(@NotNull UISearchController searchController);

    /**
     * Called when user selects one of the search suggestion buttons displayed under the keyboard on tvOS.
     * 
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("updateSearchResultsForSearchController:selectingSearchSuggestion:")
    default void updateSearchResultsForSearchControllerSelectingSearchSuggestion(
            @NotNull UISearchController searchController,
            @NotNull @Mapped(ObjCObjectMapper.class) UISearchSuggestion searchSuggestion) {
        throw new java.lang.UnsupportedOperationException();
    }
}
