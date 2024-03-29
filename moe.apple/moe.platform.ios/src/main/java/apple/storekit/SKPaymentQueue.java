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

package apple.storekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.storekit.protocol.SKPaymentQueueDelegate;
import apple.storekit.protocol.SKPaymentTransactionObserver;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
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
 * SKPaymentQueue interacts with the server-side payment queue
 * 
 * API-Since: 3.0
 */
@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKPaymentQueue extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SKPaymentQueue(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKPaymentQueue alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKPaymentQueue allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * NO if this device is not able or allowed to make payments
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("canMakePayments")
    public static native boolean canMakePayments();

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

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("defaultQueue")
    public static native SKPaymentQueue defaultQueue();

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
    public static native SKPaymentQueue new_objc();

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
     * Asynchronous. Add a payment to the server queue. The payment is copied to add an SKPaymentTransaction to the
     * transactions array. The same payment can be added multiple times to create multiple transactions.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("addPayment:")
    public native void addPayment(@NotNull SKPayment payment);

    /**
     * Observers are not retained. The transactions array will only be synchronized with the server while the queue has
     * observers. This may require that the user authenticate.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("addTransactionObserver:")
    public native void addTransactionObserver(
            @NotNull @Mapped(ObjCObjectMapper.class) SKPaymentTransactionObserver observer);

    /**
     * Asynchronous. Cancel downloads (SKDownload)
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated
    @Generated
    @Selector("cancelDownloads:")
    public native void cancelDownloads(@NotNull NSArray<? extends SKDownload> downloads);

    /**
     * Asynchronous. Remove a finished (i.e. failed or completed) transaction from the queue. Attempting to finish a
     * purchasing transaction will throw an exception.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("finishTransaction:")
    public native void finishTransaction(@NotNull SKPaymentTransaction transaction);

    @Generated
    @Selector("init")
    public native SKPaymentQueue init();

    /**
     * Asynchronous. Pause/resume downloads (SKDownload).
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated
    @Generated
    @Selector("pauseDownloads:")
    public native void pauseDownloads(@NotNull NSArray<? extends SKDownload> downloads);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("removeTransactionObserver:")
    public native void removeTransactionObserver(
            @NotNull @Mapped(ObjCObjectMapper.class) SKPaymentTransactionObserver observer);

    /**
     * Asynchronous. Will add completed transactions for the current user back to the queue to be re-completed. User
     * will be asked to authenticate. Observers will receive 0 or more -paymentQueue:updatedTransactions:, followed by
     * either -paymentQueueRestoreCompletedTransactionsFinished: on success or
     * -paymentQueue:restoreCompletedTransactionsFailedWithError: on failure. In the case of partial success, some
     * transactions may still be delivered.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("restoreCompletedTransactions")
    public native void restoreCompletedTransactions();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("restoreCompletedTransactionsWithApplicationUsername:")
    public native void restoreCompletedTransactionsWithApplicationUsername(@Nullable String username);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated
    @Generated
    @Selector("resumeDownloads:")
    public native void resumeDownloads(@NotNull NSArray<? extends SKDownload> downloads);

    /**
     * Asynchronous. Start the given downloads (SKDownload).
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Hosted content is no longer supported
     */
    @Deprecated
    @Generated
    @Selector("startDownloads:")
    public native void startDownloads(@NotNull NSArray<? extends SKDownload> downloads);

    /**
     * Array of unfinished SKPaymentTransactions. Only valid while the queue has observers. Updated asynchronously.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("transactions")
    public native NSArray<? extends SKPaymentTransaction> transactions();

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SKPaymentQueueDelegate delegate();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) SKPaymentQueueDelegate value);

    /**
     * API-Since: 13.0
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) SKPaymentQueueDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("storefront")
    public native SKStorefront storefront();

    /**
     * If StoreKit has called your SKPaymentQueueDelegate's "paymentQueueShouldShowPriceConsent:" method and you
     * returned NO, you can use this method to show the price consent UI at a later time that is more appropriate for
     * your app. If there is no pending price consent, this method will do nothing.
     * 
     * API-Since: 13.4
     */
    @Generated
    @Selector("showPriceConsentIfNeeded")
    public native void showPriceConsentIfNeeded();

    /**
     * Call this method to have StoreKit present a sheet enabling the user to redeem codes provided by your app.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("presentCodeRedemptionSheet")
    public native void presentCodeRedemptionSheet();

    /**
     * Array of transactionObservers that are available. Transaction observers are not retained.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("transactionObservers")
    public native NSArray<?> transactionObservers();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
