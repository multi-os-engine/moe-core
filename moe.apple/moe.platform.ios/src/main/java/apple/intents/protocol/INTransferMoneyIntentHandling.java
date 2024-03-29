package apple.intents.protocol;

import apple.intents.INDateComponentsRangeResolutionResult;
import apple.intents.INPaymentAccountResolutionResult;
import apple.intents.INPaymentAmountResolutionResult;
import apple.intents.INStringResolutionResult;
import apple.intents.INTransferMoneyIntent;
import apple.intents.INTransferMoneyIntentResponse;
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
 * Protocol to declare support for handling an INTransferMoneyIntent. By implementing this protocol, a class can provide
 * logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 11.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INTransferMoneyIntentHandling is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INTransferMoneyIntentHandling")
public interface INTransferMoneyIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INTransferMoneyIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INTransferMoneyIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmTransferMoney:completion:")
    default void confirmTransferMoneyCompletion(@NotNull INTransferMoneyIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmTransferMoneyCompletion") Block_confirmTransferMoneyCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmTransferMoneyCompletion {
        @Generated
        void call_confirmTransferMoneyCompletion(@NotNull INTransferMoneyIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INTransferMoneyIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INTransferMoneyIntentResponse containing the details of the
     *                   result of having executed the intent
     * 
     * @see INTransferMoneyIntentResponse
     */
    @Generated
    @Selector("handleTransferMoney:completion:")
    void handleTransferMoneyCompletion(@NotNull INTransferMoneyIntent intent,
            @NotNull @ObjCBlock(name = "call_handleTransferMoneyCompletion") Block_handleTransferMoneyCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleTransferMoneyCompletion {
        @Generated
        void call_handleTransferMoneyCompletion(@NotNull INTransferMoneyIntentResponse response);
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
    @Selector("resolveFromAccountForTransferMoney:withCompletion:")
    default void resolveFromAccountForTransferMoneyWithCompletion(@NotNull INTransferMoneyIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveFromAccountForTransferMoneyWithCompletion") Block_resolveFromAccountForTransferMoneyWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveFromAccountForTransferMoneyWithCompletion {
        @Generated
        void call_resolveFromAccountForTransferMoneyWithCompletion(
                @NotNull INPaymentAccountResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveToAccountForTransferMoney:withCompletion:")
    default void resolveToAccountForTransferMoneyWithCompletion(@NotNull INTransferMoneyIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveToAccountForTransferMoneyWithCompletion") Block_resolveToAccountForTransferMoneyWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveToAccountForTransferMoneyWithCompletion {
        @Generated
        void call_resolveToAccountForTransferMoneyWithCompletion(
                @NotNull INPaymentAccountResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTransactionAmountForTransferMoney:withCompletion:")
    default void resolveTransactionAmountForTransferMoneyWithCompletion(@NotNull INTransferMoneyIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveTransactionAmountForTransferMoneyWithCompletion") Block_resolveTransactionAmountForTransferMoneyWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTransactionAmountForTransferMoneyWithCompletion {
        @Generated
        void call_resolveTransactionAmountForTransferMoneyWithCompletion(
                @NotNull INPaymentAmountResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTransactionNoteForTransferMoney:withCompletion:")
    default void resolveTransactionNoteForTransferMoneyWithCompletion(@NotNull INTransferMoneyIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveTransactionNoteForTransferMoneyWithCompletion") Block_resolveTransactionNoteForTransferMoneyWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTransactionNoteForTransferMoneyWithCompletion {
        @Generated
        void call_resolveTransactionNoteForTransferMoneyWithCompletion(
                @NotNull INStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTransactionScheduledDateForTransferMoney:withCompletion:")
    default void resolveTransactionScheduledDateForTransferMoneyWithCompletion(@NotNull INTransferMoneyIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveTransactionScheduledDateForTransferMoneyWithCompletion") Block_resolveTransactionScheduledDateForTransferMoneyWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTransactionScheduledDateForTransferMoneyWithCompletion {
        @Generated
        void call_resolveTransactionScheduledDateForTransferMoneyWithCompletion(
                @NotNull INDateComponentsRangeResolutionResult resolutionResult);
    }
}
