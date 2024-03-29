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

package apple.gamekit.protocol;

import apple.foundation.NSData;
import apple.gamekit.GKCloudPlayer;
import apple.gamekit.GKGameSession;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 10.0
 * Deprecated-Since: 12.0
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKGameSessionEventListener")
public interface GKGameSessionEventListener {
    @Generated
    @IsOptional
    @Selector("session:didAddPlayer:")
    default void sessionDidAddPlayer(@NotNull GKGameSession session, @NotNull GKCloudPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didReceiveData:fromPlayer:")
    default void sessionDidReceiveDataFromPlayer(@NotNull GKGameSession session, @NotNull NSData data,
            @NotNull GKCloudPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didReceiveMessage:withData:fromPlayer:")
    default void sessionDidReceiveMessageWithDataFromPlayer(@NotNull GKGameSession session, @NotNull String message,
            @NotNull NSData data, @NotNull GKCloudPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didRemovePlayer:")
    default void sessionDidRemovePlayer(@NotNull GKGameSession session, @NotNull GKCloudPlayer player) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:player:didChangeConnectionState:")
    default void sessionPlayerDidChangeConnectionState(@NotNull GKGameSession session, @NotNull GKCloudPlayer player,
            @NInt long newState) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:player:didSaveData:")
    default void sessionPlayerDidSaveData(@NotNull GKGameSession session, @NotNull GKCloudPlayer player,
            @NotNull NSData data) {
        throw new java.lang.UnsupportedOperationException();
    }
}
