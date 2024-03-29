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

package apple.photosui.protocol;

import apple.photosui.PHLivePhotoView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.uikit.UITouch;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 9.1
 */
@Generated
@Library("PhotosUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PHLivePhotoViewDelegate")
public interface PHLivePhotoViewDelegate {
    /**
     * API-Since: 9.1
     */
    @Generated
    @IsOptional
    @Selector("livePhotoView:didEndPlaybackWithStyle:")
    default void livePhotoViewDidEndPlaybackWithStyle(@NotNull PHLivePhotoView livePhotoView,
            @NInt long playbackStyle) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.1
     */
    @Generated
    @IsOptional
    @Selector("livePhotoView:willBeginPlaybackWithStyle:")
    default void livePhotoViewWillBeginPlaybackWithStyle(@NotNull PHLivePhotoView livePhotoView,
            @NInt long playbackStyle) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 9.1
     */
    @Generated
    @IsOptional
    @Selector("livePhotoView:canBeginPlaybackWithStyle:")
    default boolean livePhotoViewCanBeginPlaybackWithStyle(@NotNull PHLivePhotoView livePhotoView,
            @NInt long playbackStyle) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This will be called before gestureRecognizer get touch info (point location), so we need to provide the touch to
     * delegate to decide.
     * 
     * API-Since: 9.1
     */
    @Generated
    @IsOptional
    @Selector("livePhotoView:extraMinimumTouchDurationForTouch:withStyle:")
    default double livePhotoViewExtraMinimumTouchDurationForTouchWithStyle(@NotNull PHLivePhotoView livePhotoView,
            @NotNull UITouch touch, @NInt long playbackStyle) {
        throw new java.lang.UnsupportedOperationException();
    }
}
