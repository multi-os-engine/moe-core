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
import apple.foundation.NSIndexPath;
import apple.uikit.UICollectionView;
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
@ObjCProtocolName("UICollectionViewDataSourcePrefetching")
public interface UICollectionViewDataSourcePrefetching {
    /**
     * indexPaths that previously were considered as candidates for pre-fetching, but were not actually used; may be a
     * subset of the previous call to -collectionView:prefetchItemsAtIndexPaths:
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("collectionView:cancelPrefetchingForItemsAtIndexPaths:")
    default void collectionViewCancelPrefetchingForItemsAtIndexPaths(@NotNull UICollectionView collectionView,
            @NotNull NSArray<? extends NSIndexPath> indexPaths) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * indexPaths are ordered ascending by geometric distance from the collection view
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("collectionView:prefetchItemsAtIndexPaths:")
    void collectionViewPrefetchItemsAtIndexPaths(@NotNull UICollectionView collectionView,
            @NotNull NSArray<? extends NSIndexPath> indexPaths);
}
