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

package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * PKPaymentRequest defines an application's request to produce a payment instrument for the
 * purchase of goods and services. It encapsulates information about the selling party's payment
 * processing capabilities, an amount to pay, and the currency code.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKPaymentRequest extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKPaymentRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKPaymentRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKPaymentRequest allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The payment networks and platforms supported for in-app payment
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("availableNetworks")
    public static native NSArray<String> availableNetworks();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PKPaymentRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Optional merchant-supplied information about the payment request. Examples of this are an order
     * or cart identifier. It will be signed and included in the resulting PKPaymentToken.
     */
    @Nullable
    @Generated
    @Selector("applicationData")
    public native NSData applicationData();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: ABRecordRef has been deprecated, and does not support all available address properties. You
     * should migrate to billingContact.
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("billingAddress")
    public native ConstVoidPtr billingAddress();

    /**
     * If the merchant already has a billing address on file, set it here.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("billingContact")
    public native PKContact billingContact();

    /**
     * The merchant's ISO country code.
     */
    @NotNull
    @Generated
    @Selector("countryCode")
    public native String countryCode();

    /**
     * Currency code for this payment.
     */
    @NotNull
    @Generated
    @Selector("currencyCode")
    public native String currencyCode();

    @Generated
    @Selector("init")
    public native PKPaymentRequest init();

    /**
     * The payment processing capabilities of the merchant.
     */
    @Generated
    @Selector("merchantCapabilities")
    @NUInt
    public native long merchantCapabilities();

    /**
     * Identifies the merchant, as previously agreed with Apple. Must match one of the merchant
     * identifiers in the application's entitlement.
     */
    @NotNull
    @Generated
    @Selector("merchantIdentifier")
    public native String merchantIdentifier();

    /**
     * Array of PKPaymentSummaryItem objects which should be presented to the user.
     * The last item should be the total you wish to charge, and should not be pending
     */
    @NotNull
    @Generated
    @Selector("paymentSummaryItems")
    public native NSArray<? extends PKPaymentSummaryItem> paymentSummaryItems();

    /**
     * Indicates which billing address fields are required. The default is PKAddressFieldNone.
     * This property is deprecated and should not be used.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("requiredBillingAddressFields")
    @NUInt
    public native long requiredBillingAddressFields();

    /**
     * Indicates which shipping address fields are required. The default is PKAddressFieldNone.
     * This property is deprecated and should not be used
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("requiredShippingAddressFields")
    @NUInt
    public native long requiredShippingAddressFields();

    /**
     * Optional merchant-supplied information about the payment request. Examples of this are an order
     * or cart identifier. It will be signed and included in the resulting PKPaymentToken.
     */
    @Generated
    @Selector("setApplicationData:")
    public native void setApplicationData(@Nullable NSData value);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: ABRecordRef has been deprecated, and does not support all available address properties. You
     * should migrate to billingContact.
     */
    @Generated
    @Deprecated
    @Selector("setBillingAddress:")
    public native void setBillingAddress(@Nullable ConstVoidPtr value);

    /**
     * If the merchant already has a billing address on file, set it here.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setBillingContact:")
    public native void setBillingContact(@Nullable PKContact value);

    /**
     * The merchant's ISO country code.
     */
    @Generated
    @Selector("setCountryCode:")
    public native void setCountryCode(@NotNull String value);

    /**
     * Currency code for this payment.
     */
    @Generated
    @Selector("setCurrencyCode:")
    public native void setCurrencyCode(@NotNull String value);

    /**
     * The payment processing capabilities of the merchant.
     */
    @Generated
    @Selector("setMerchantCapabilities:")
    public native void setMerchantCapabilities(@NUInt long value);

    /**
     * Identifies the merchant, as previously agreed with Apple. Must match one of the merchant
     * identifiers in the application's entitlement.
     */
    @Generated
    @Selector("setMerchantIdentifier:")
    public native void setMerchantIdentifier(@NotNull String value);

    /**
     * Array of PKPaymentSummaryItem objects which should be presented to the user.
     * The last item should be the total you wish to charge, and should not be pending
     */
    @Generated
    @Selector("setPaymentSummaryItems:")
    public native void setPaymentSummaryItems(@NotNull NSArray<? extends PKPaymentSummaryItem> value);

    /**
     * Indicates which billing address fields are required. The default is PKAddressFieldNone.
     * This property is deprecated and should not be used.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("setRequiredBillingAddressFields:")
    public native void setRequiredBillingAddressFields(@NUInt long value);

    /**
     * Indicates which shipping address fields are required. The default is PKAddressFieldNone.
     * This property is deprecated and should not be used
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("setRequiredShippingAddressFields:")
    public native void setRequiredShippingAddressFields(@NUInt long value);

    /**
     * These properties have been deprecated and should not be used.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: ABRecordRef has been deprecated, and does not support all available address properties. You
     * should migrate to shippingContact.
     */
    @Generated
    @Deprecated
    @Selector("setShippingAddress:")
    public native void setShippingAddress(@Nullable ConstVoidPtr value);

    /**
     * If the merchant already has a shipping address on file, set it here.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setShippingContact:")
    public native void setShippingContact(@Nullable PKContact value);

    /**
     * Shipping methods supported by the merchant.
     */
    @Generated
    @Selector("setShippingMethods:")
    public native void setShippingMethods(@Nullable NSArray<? extends PKShippingMethod> value);

    /**
     * Indicates the display mode for the shipping (e.g, "Pick Up", "Ship To", "Deliver To"). Localized.
     * The default is PKShippingTypeShipping
     * 
     * API-Since: 8.3
     */
    @Generated
    @Selector("setShippingType:")
    public native void setShippingType(@NUInt long value);

    /**
     * The payment networks supported by the merchant, for example @[ PKPaymentNetworkVisa,
     * PKPaymentNetworkMasterCard ]. This property constrains payment cards that may fund the payment.
     */
    @Generated
    @Selector("setSupportedNetworks:")
    public native void setSupportedNetworks(@NotNull NSArray<String> value);

    /**
     * These properties have been deprecated and should not be used.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: ABRecordRef has been deprecated, and does not support all available address properties. You
     * should migrate to shippingContact.
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("shippingAddress")
    public native ConstVoidPtr shippingAddress();

    /**
     * If the merchant already has a shipping address on file, set it here.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("shippingContact")
    public native PKContact shippingContact();

    /**
     * Shipping methods supported by the merchant.
     */
    @Nullable
    @Generated
    @Selector("shippingMethods")
    public native NSArray<? extends PKShippingMethod> shippingMethods();

    /**
     * Indicates the display mode for the shipping (e.g, "Pick Up", "Ship To", "Deliver To"). Localized.
     * The default is PKShippingTypeShipping
     * 
     * API-Since: 8.3
     */
    @Generated
    @Selector("shippingType")
    @NUInt
    public native long shippingType();

    /**
     * The payment networks supported by the merchant, for example @[ PKPaymentNetworkVisa,
     * PKPaymentNetworkMasterCard ]. This property constrains payment cards that may fund the payment.
     */
    @NotNull
    @Generated
    @Selector("supportedNetworks")
    public native NSArray<String> supportedNetworks();

    /**
     * Convenience method to create a payment billing address error with the supplied CNPostalAddressKey and description
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("paymentBillingAddressInvalidErrorWithKey:localizedDescription:")
    public static native NSError paymentBillingAddressInvalidErrorWithKeyLocalizedDescription(
            @NotNull String postalAddressKey, @Nullable String localizedDescription);

    /**
     * Convenience method to create a payment contact error with the supplied field
     * You may optionally provide a localized description to be displayed to the user.
     * Available display space for descriptions may be limited, so you should keep your messages concise
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("paymentContactInvalidErrorWithContactField:localizedDescription:")
    public static native NSError paymentContactInvalidErrorWithContactFieldLocalizedDescription(@NotNull String field,
            @Nullable String localizedDescription);

    /**
     * Convenience method to create a payment shipping address error with the supplied CNPostalAddressKey and
     * description
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("paymentShippingAddressInvalidErrorWithKey:localizedDescription:")
    public static native NSError paymentShippingAddressInvalidErrorWithKeyLocalizedDescription(
            @NotNull String postalAddressKey, @Nullable String localizedDescription);

    /**
     * Convenience method to create a payment shipping address service error with the supplied description
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("paymentShippingAddressUnserviceableErrorWithLocalizedDescription:")
    public static native NSError paymentShippingAddressUnserviceableErrorWithLocalizedDescription(
            @Nullable String localizedDescription);

    /**
     * Indicates which billing contact fields the merchant requires in order to process a transaction.
     * Currently only postal address may be requested for billing contact. For all other fields use
     * -requiredShippingContactFields
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("requiredBillingContactFields")
    public native NSSet<String> requiredBillingContactFields();

    /**
     * Indicates which shipping contact fields the merchant requires in order to process a transactions
     * 
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("requiredShippingContactFields")
    public native NSSet<String> requiredShippingContactFields();

    /**
     * Indicates which billing contact fields the merchant requires in order to process a transaction.
     * Currently only postal address may be requested for billing contact. For all other fields use
     * -requiredShippingContactFields
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRequiredBillingContactFields:")
    public native void setRequiredBillingContactFields(@NotNull NSSet<String> value);

    /**
     * Indicates which shipping contact fields the merchant requires in order to process a transactions
     * 
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRequiredShippingContactFields:")
    public native void setRequiredShippingContactFields(@NotNull NSSet<String> value);

    /**
     * Set of two-letter ISO 3166 country codes. When provided will filter the selectable payment passes to those
     * issued in the supported countries.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setSupportedCountries:")
    public native void setSupportedCountries(@Nullable NSSet<String> value);

    /**
     * Set of two-letter ISO 3166 country codes. When provided will filter the selectable payment passes to those
     * issued in the supported countries.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("supportedCountries")
    public native NSSet<String> supportedCountries();

    /**
     * An optional coupon code that is valid and has been applied to the payment request already.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("couponCode")
    public native String couponCode();

    /**
     * Convenience method to create a payment coupon code expired error with the supplied description.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("paymentCouponCodeExpiredErrorWithLocalizedDescription:")
    public static native NSError paymentCouponCodeExpiredErrorWithLocalizedDescription(
            @Nullable String localizedDescription);

    /**
     * Convenience method to create a payment coupon code invalid error with the supplied description.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("paymentCouponCodeInvalidErrorWithLocalizedDescription:")
    public static native NSError paymentCouponCodeInvalidErrorWithLocalizedDescription(
            @Nullable String localizedDescription);

    /**
     * An optional coupon code that is valid and has been applied to the payment request already.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setCouponCode:")
    public native void setCouponCode(@Nullable String value);

    /**
     * Indicates the editing mode for the shipping contact. The default is PKShippingContactEditingModeEnabled.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setShippingContactEditingMode:")
    public native void setShippingContactEditingMode(@NUInt long value);

    /**
     * Indicates whether the merchant supports coupon code entry and validation. Defaults to NO.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSupportsCouponCode:")
    public native void setSupportsCouponCode(boolean value);

    /**
     * Indicates the editing mode for the shipping contact. The default is PKShippingContactEditingModeEnabled.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("shippingContactEditingMode")
    @NUInt
    public native long shippingContactEditingMode();

    /**
     * Indicates whether the merchant supports coupon code entry and validation. Defaults to NO.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("supportsCouponCode")
    public native boolean supportsCouponCode();

    /**
     * Optional request to set up an automatic reload, such as a store card top-up. This payment request
     * will receive a merchant-specific payment token if the payment network supports merchant-specific
     * payment tokens.
     * 
     * This property cannot be used simultaneously with multi token contexts, recurring payment requests or deferred
     * payment requests.
     * 
     * Merchant-specific payment tokens are not supported on watchOS.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("automaticReloadPaymentRequest")
    public native PKAutomaticReloadPaymentRequest automaticReloadPaymentRequest();

    /**
     * Array of payment token contexts that indicates multiple payment tokens are requested, one for
     * each context object provided.
     * 
     * The sum of all context amounts must be less than or equal to the total amount of the enclosing
     * payment request, as indicated by the last payment summary item.
     * 
     * This property cannot be used simultaneously with recurring, automatic reload or deferred payment requests.
     * 
     * Multiple payment tokens are not supported on watchOS.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("multiTokenContexts")
    public native NSArray<? extends PKPaymentTokenContext> multiTokenContexts();

    /**
     * Optional request to set up a recurring payment, typically a subscription. This payment request
     * will receive a merchant-specific payment token if the payment network supports merchant-specific
     * payment tokens.
     * 
     * This property cannot be used simultaneously with multi token contexts, automatic reload or deferred payment
     * requests.
     * 
     * Merchant-specific payment tokens are not supported on watchOS.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("recurringPaymentRequest")
    public native PKRecurringPaymentRequest recurringPaymentRequest();

    /**
     * Optional request to set up an automatic reload, such as a store card top-up. This payment request
     * will receive a merchant-specific payment token if the payment network supports merchant-specific
     * payment tokens.
     * 
     * This property cannot be used simultaneously with multi token contexts, recurring payment requests or deferred
     * payment requests.
     * 
     * Merchant-specific payment tokens are not supported on watchOS.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAutomaticReloadPaymentRequest:")
    public native void setAutomaticReloadPaymentRequest(@Nullable PKAutomaticReloadPaymentRequest value);

    /**
     * Array of payment token contexts that indicates multiple payment tokens are requested, one for
     * each context object provided.
     * 
     * The sum of all context amounts must be less than or equal to the total amount of the enclosing
     * payment request, as indicated by the last payment summary item.
     * 
     * This property cannot be used simultaneously with recurring, automatic reload or deferred payment requests.
     * 
     * Multiple payment tokens are not supported on watchOS.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMultiTokenContexts:")
    public native void setMultiTokenContexts(@NotNull NSArray<? extends PKPaymentTokenContext> value);

    /**
     * Optional request to set up a recurring payment, typically a subscription. This payment request
     * will receive a merchant-specific payment token if the payment network supports merchant-specific
     * payment tokens.
     * 
     * This property cannot be used simultaneously with multi token contexts, automatic reload or deferred payment
     * requests.
     * 
     * Merchant-specific payment tokens are not supported on watchOS.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setRecurringPaymentRequest:")
    public native void setRecurringPaymentRequest(@Nullable PKRecurringPaymentRequest value);

    /**
     * Opt out of Apple Pay Later. Defaults to enabled.
     * Only set this property if you have a specific requirement to disable Apple Pay Later.
     * Be sure to select the correct mode that matches your requirement, since this will be displayed to the user.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("applePayLaterAvailability")
    @NInt
    public native long applePayLaterAvailability();

    /**
     * Optional request to set up a deferred payment, such as a hospitality booking or a pre-order. This payment request
     * will receive a merchant-specific payment token if the payment network supports merchant-specific
     * payment tokens.
     * 
     * This property cannot be used simultaneously with: multi token contexts, recurring payment requests or automatic
     * reload payment requests.
     * 
     * Merchant-specific payment tokens are not supported on watchOS.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("deferredPaymentRequest")
    @Nullable
    public native PKDeferredPaymentRequest deferredPaymentRequest();

    /**
     * Opt out of Apple Pay Later. Defaults to enabled.
     * Only set this property if you have a specific requirement to disable Apple Pay Later.
     * Be sure to select the correct mode that matches your requirement, since this will be displayed to the user.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setApplePayLaterAvailability:")
    public native void setApplePayLaterAvailability(@NInt long value);

    /**
     * Optional request to set up a deferred payment, such as a hospitality booking or a pre-order. This payment request
     * will receive a merchant-specific payment token if the payment network supports merchant-specific
     * payment tokens.
     * 
     * This property cannot be used simultaneously with: multi token contexts, recurring payment requests or automatic
     * reload payment requests.
     * 
     * Merchant-specific payment tokens are not supported on watchOS.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setDeferredPaymentRequest:")
    public native void setDeferredPaymentRequest(@Nullable PKDeferredPaymentRequest value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
