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

package apple.intents.protocol;

import apple.intents.INBooleanResolutionResult;
import apple.intents.INCarAirCirculationModeResolutionResult;
import apple.intents.INCarSeatResolutionResult;
import apple.intents.INDoubleResolutionResult;
import apple.intents.INIntegerResolutionResult;
import apple.intents.INRelativeSettingResolutionResult;
import apple.intents.INSetClimateSettingsInCarIntent;
import apple.intents.INSetClimateSettingsInCarIntentResponse;
import apple.intents.INSpeakableStringResolutionResult;
import apple.intents.INTemperatureResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * Protocol to declare support for handling an INSetClimateSettingsInCarIntent. By implementing this protocol, a class
 * can provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 10.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INSetClimateSettingsInCarIntentHandling is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSetClimateSettingsInCarIntentHandling")
public interface INSetClimateSettingsInCarIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INSetClimateSettingsInCarIntentResponse containing additional
     *                   details about the intent that may be relevant for the system to show the user prior to
     *                   handling.
     * 
     * @see INSetClimateSettingsInCarIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSetClimateSettingsInCar:completion:")
    default void confirmSetClimateSettingsInCarCompletion(@NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmSetClimateSettingsInCarCompletion") Block_confirmSetClimateSettingsInCarCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INSetClimateSettingsInCarIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INSetClimateSettingsInCarIntentResponse containing the
     *                   details of the result of having executed the intent
     * 
     * @see INSetClimateSettingsInCarIntentResponse
     */
    @Generated
    @Selector("handleSetClimateSettingsInCar:completion:")
    void handleSetClimateSettingsInCarCompletion(@NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_handleSetClimateSettingsInCarCompletion") Block_handleSetClimateSettingsInCarCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveAirCirculationModeForSetClimateSettingsInCar:withCompletion:")
    default void resolveAirCirculationModeForSetClimateSettingsInCarWithCompletion(
            @NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveAirCirculationModeForSetClimateSettingsInCarWithCompletion") Block_resolveAirCirculationModeForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveClimateZoneForSetClimateSettingsInCar:withCompletion:")
    default void resolveClimateZoneForSetClimateSettingsInCarWithCompletion(
            @NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveClimateZoneForSetClimateSettingsInCarWithCompletion") Block_resolveClimateZoneForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveEnableAirConditionerForSetClimateSettingsInCar:withCompletion:")
    default void resolveEnableAirConditionerForSetClimateSettingsInCarWithCompletion(
            @NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveEnableAirConditionerForSetClimateSettingsInCarWithCompletion") Block_resolveEnableAirConditionerForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveEnableAutoModeForSetClimateSettingsInCar:withCompletion:")
    default void resolveEnableAutoModeForSetClimateSettingsInCarWithCompletion(
            @NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveEnableAutoModeForSetClimateSettingsInCarWithCompletion") Block_resolveEnableAutoModeForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveEnableClimateControlForSetClimateSettingsInCar:withCompletion:")
    default void resolveEnableClimateControlForSetClimateSettingsInCarWithCompletion(
            @NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveEnableClimateControlForSetClimateSettingsInCarWithCompletion") Block_resolveEnableClimateControlForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * 
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for
     * validating if the intent needs any further fleshing out.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveEnableFanForSetClimateSettingsInCar:withCompletion:")
    default void resolveEnableFanForSetClimateSettingsInCarWithCompletion(
            @NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveEnableFanForSetClimateSettingsInCarWithCompletion") Block_resolveEnableFanForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveFanSpeedIndexForSetClimateSettingsInCar:withCompletion:")
    default void resolveFanSpeedIndexForSetClimateSettingsInCarWithCompletion(
            @NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveFanSpeedIndexForSetClimateSettingsInCarWithCompletion") Block_resolveFanSpeedIndexForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveFanSpeedPercentageForSetClimateSettingsInCar:withCompletion:")
    default void resolveFanSpeedPercentageForSetClimateSettingsInCarWithCompletion(
            @NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveFanSpeedPercentageForSetClimateSettingsInCarWithCompletion") Block_resolveFanSpeedPercentageForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRelativeFanSpeedSettingForSetClimateSettingsInCar:withCompletion:")
    default void resolveRelativeFanSpeedSettingForSetClimateSettingsInCarWithCompletion(
            @NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveRelativeFanSpeedSettingForSetClimateSettingsInCarWithCompletion") Block_resolveRelativeFanSpeedSettingForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRelativeTemperatureSettingForSetClimateSettingsInCar:withCompletion:")
    default void resolveRelativeTemperatureSettingForSetClimateSettingsInCarWithCompletion(
            @NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveRelativeTemperatureSettingForSetClimateSettingsInCarWithCompletion") Block_resolveRelativeTemperatureSettingForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveTemperatureForSetClimateSettingsInCar:withCompletion:")
    default void resolveTemperatureForSetClimateSettingsInCarWithCompletion(
            @NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveTemperatureForSetClimateSettingsInCarWithCompletion") Block_resolveTemperatureForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetClimateSettingsInCarCompletion {
        @Generated
        void call_confirmSetClimateSettingsInCarCompletion(@NotNull INSetClimateSettingsInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetClimateSettingsInCarCompletion {
        @Generated
        void call_handleSetClimateSettingsInCarCompletion(@NotNull INSetClimateSettingsInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAirCirculationModeForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveAirCirculationModeForSetClimateSettingsInCarWithCompletion(
                @NotNull INCarAirCirculationModeResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveClimateZoneForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveClimateZoneForSetClimateSettingsInCarWithCompletion(
                @NotNull INCarSeatResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableAirConditionerForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableAirConditionerForSetClimateSettingsInCarWithCompletion(
                @NotNull INBooleanResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableAutoModeForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableAutoModeForSetClimateSettingsInCarWithCompletion(
                @NotNull INBooleanResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableClimateControlForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableClimateControlForSetClimateSettingsInCarWithCompletion(
                @NotNull INBooleanResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveEnableFanForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveEnableFanForSetClimateSettingsInCarWithCompletion(
                @NotNull INBooleanResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveFanSpeedIndexForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveFanSpeedIndexForSetClimateSettingsInCarWithCompletion(
                @NotNull INIntegerResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveFanSpeedPercentageForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveFanSpeedPercentageForSetClimateSettingsInCarWithCompletion(
                @NotNull INDoubleResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRelativeFanSpeedSettingForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveRelativeFanSpeedSettingForSetClimateSettingsInCarWithCompletion(
                @NotNull INRelativeSettingResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRelativeTemperatureSettingForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveRelativeTemperatureSettingForSetClimateSettingsInCarWithCompletion(
                @NotNull INRelativeSettingResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTemperatureForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveTemperatureForSetClimateSettingsInCarWithCompletion(
                @NotNull INTemperatureResolutionResult resolutionResult);
    }

    /**
     * API-Since: 12.0
     */
    @Generated
    @IsOptional
    @Selector("resolveCarNameForSetClimateSettingsInCar:withCompletion:")
    default void resolveCarNameForSetClimateSettingsInCarWithCompletion(@NotNull INSetClimateSettingsInCarIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveCarNameForSetClimateSettingsInCarWithCompletion") Block_resolveCarNameForSetClimateSettingsInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCarNameForSetClimateSettingsInCarWithCompletion {
        @Generated
        void call_resolveCarNameForSetClimateSettingsInCarWithCompletion(
                @NotNull INSpeakableStringResolutionResult resolutionResult);
    }
}
