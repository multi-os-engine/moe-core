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

package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INRestaurantReservationUserBooking extends INRestaurantReservationBooking implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected INRestaurantReservationUserBooking(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INRestaurantReservationUserBooking alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INRestaurantReservationUserBooking allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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
    public static native INRestaurantReservationUserBooking new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * a string representing restaurant specific information related to the reservation: things like late policies,
     * parking instructions, or specials
     */
    @Nullable
    @Generated
    @Selector("advisementText")
    public native String advisementText();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * date indicating when the status was updated to its current value
     */
    @NotNull
    @Generated
    @Selector("dateStatusModified")
    public native NSDate dateStatusModified();

    @NotNull
    @Generated
    @Selector("guest")
    public native INRestaurantGuest guest();

    /**
     * any user-specified special request text submitted with the reservation
     */
    @Nullable
    @Generated
    @Selector("guestProvidedSpecialRequestText")
    public native String guestProvidedSpecialRequestText();

    @Generated
    @Selector("init")
    public native INRestaurantReservationUserBooking init();

    @Generated
    @Selector("initWithCoder:")
    public native INRestaurantReservationUserBooking initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithRestaurant:bookingDate:partySize:bookingIdentifier:")
    public native INRestaurantReservationUserBooking initWithRestaurantBookingDatePartySizeBookingIdentifier(
            @NotNull INRestaurant restaurant, @NotNull NSDate bookingDate, @NUInt long partySize,
            @NotNull String bookingIdentifier);

    @Generated
    @Selector("initWithRestaurant:bookingDate:partySize:bookingIdentifier:guest:status:dateStatusModified:")
    public native INRestaurantReservationUserBooking initWithRestaurantBookingDatePartySizeBookingIdentifierGuestStatusDateStatusModified(
            @NotNull INRestaurant restaurant, @NotNull NSDate bookingDate, @NUInt long partySize,
            @NotNull String bookingIdentifier, @NotNull INRestaurantGuest guest, @NUInt long status,
            @NotNull NSDate dateStatusModified);

    /**
     * an offer, if any, attached to the booking
     */
    @Nullable
    @Generated
    @Selector("selectedOffer")
    public native INRestaurantOffer selectedOffer();

    /**
     * a string representing restaurant specific information related to the reservation: things like late policies,
     * parking instructions, or specials
     */
    @Generated
    @Selector("setAdvisementText:")
    public native void setAdvisementText(@Nullable String value);

    /**
     * date indicating when the status was updated to its current value
     */
    @Generated
    @Selector("setDateStatusModified:")
    public native void setDateStatusModified(@NotNull NSDate value);

    @Generated
    @Selector("setGuest:")
    public native void setGuest(@NotNull INRestaurantGuest value);

    /**
     * any user-specified special request text submitted with the reservation
     */
    @Generated
    @Selector("setGuestProvidedSpecialRequestText:")
    public native void setGuestProvidedSpecialRequestText(@Nullable String value);

    /**
     * an offer, if any, attached to the booking
     */
    @Generated
    @Selector("setSelectedOffer:")
    public native void setSelectedOffer(@Nullable INRestaurantOffer value);

    /**
     * an enum indicating whether a booking was denied, pending, or confirmed
     */
    @Generated
    @Selector("setStatus:")
    public native void setStatus(@NUInt long value);

    /**
     * an enum indicating whether a booking was denied, pending, or confirmed
     */
    @Generated
    @Selector("status")
    @NUInt
    public native long status();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
