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

import apple.intents.INCurrencyAmountResolutionResult;
import apple.intents.INPersonResolutionResult;
import apple.intents.INSendPaymentCurrencyAmountResolutionResult;
import apple.intents.INSendPaymentIntent;
import apple.intents.INSendPaymentIntentResponse;
import apple.intents.INSendPaymentPayeeResolutionResult;
import apple.intents.INStringResolutionResult;
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
 * Protocol to declare support for handling an INSendPaymentIntent. By implementing this protocol, a class can provide
 * logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSendPaymentIntentHandling")
public interface INSendPaymentIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INSendPaymentIntentResponse containing additional details about
     *                   the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INSendPaymentIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSendPayment:completion:")
    default void confirmSendPaymentCompletion(@NotNull INSendPaymentIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmSendPaymentCompletion") Block_confirmSendPaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INSendPaymentIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INSendPaymentIntentResponse containing the details of the
     *                   result of having executed the intent
     * 
     * @see INSendPaymentIntentResponse
     */
    @Generated
    @Selector("handleSendPayment:completion:")
    void handleSendPaymentCompletion(@NotNull INSendPaymentIntent intent,
            @NotNull @ObjCBlock(name = "call_handleSendPaymentCompletion") Block_handleSendPaymentCompletion completion);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: resolveCurrencyAmountForSendPayment:withCompletion: is deprecated. Use
     * resolveCurrencyAmountForSendPayment:completion: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("resolveCurrencyAmountForSendPayment:withCompletion:")
    default void resolveCurrencyAmountForSendPaymentWithCompletion(@NotNull INSendPaymentIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveCurrencyAmountForSendPaymentWithCompletion") Block_resolveCurrencyAmountForSendPaymentWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveNoteForSendPayment:withCompletion:")
    default void resolveNoteForSendPaymentWithCompletion(@NotNull INSendPaymentIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveNoteForSendPaymentWithCompletion") Block_resolveNoteForSendPaymentWithCompletion completion) {
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
     * 
     *      API-Since: 10.0
     *      Deprecated-Since: 11.0
     *      Deprecated-Message: resolvePayeeForSendPayment:withCompletion: is deprecated. Use
     *      resolvePayeeForSendPayment:completion: instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("resolvePayeeForSendPayment:withCompletion:")
    default void resolvePayeeForSendPaymentWithCompletion(@NotNull INSendPaymentIntent intent,
            @NotNull @ObjCBlock(name = "call_resolvePayeeForSendPaymentWithCompletion") Block_resolvePayeeForSendPaymentWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSendPaymentCompletion {
        @Generated
        void call_confirmSendPaymentCompletion(@NotNull INSendPaymentIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSendPaymentCompletion {
        @Generated
        void call_handleSendPaymentCompletion(@NotNull INSendPaymentIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCurrencyAmountForSendPaymentWithCompletion {
        @Generated
        void call_resolveCurrencyAmountForSendPaymentWithCompletion(
                @NotNull INCurrencyAmountResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveNoteForSendPaymentWithCompletion {
        @Generated
        void call_resolveNoteForSendPaymentWithCompletion(@NotNull INStringResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePayeeForSendPaymentWithCompletion {
        @Generated
        void call_resolvePayeeForSendPaymentWithCompletion(@NotNull INPersonResolutionResult resolutionResult);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("resolveCurrencyAmountForSendPayment:completion:")
    default void resolveCurrencyAmountForSendPaymentCompletion(@NotNull INSendPaymentIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveCurrencyAmountForSendPaymentCompletion") Block_resolveCurrencyAmountForSendPaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCurrencyAmountForSendPaymentCompletion {
        @Generated
        void call_resolveCurrencyAmountForSendPaymentCompletion(
                @NotNull INSendPaymentCurrencyAmountResolutionResult resolutionResult);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("resolvePayeeForSendPayment:completion:")
    default void resolvePayeeForSendPaymentCompletion(@NotNull INSendPaymentIntent intent,
            @NotNull @ObjCBlock(name = "call_resolvePayeeForSendPaymentCompletion") Block_resolvePayeeForSendPaymentCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePayeeForSendPaymentCompletion {
        @Generated
        void call_resolvePayeeForSendPaymentCompletion(@NotNull INSendPaymentPayeeResolutionResult resolutionResult);
    }
}
