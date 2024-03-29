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

package apple.eventkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
 * EKParticipant
 * 
 * Abstract class representing a participant attached to an event.
 */
@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKParticipant extends EKObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected EKParticipant(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKParticipant alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKParticipant allocWithZone(VoidPtr zone);

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
    public static native EKParticipant new_objc();

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
     * ABRecordWithAddressBook
     * 
     * Returns the ABRecordRef that represents this participant.
     * 
     * This method returns the ABRecordRef that represents this participant,
     * if a match can be found based on email address in the address book
     * passed. If we cannot find the participant, nil is returned.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("ABRecordWithAddressBook:")
    public native ConstVoidPtr ABRecordWithAddressBook(@NotNull ConstVoidPtr addressBook);

    /**
     * [@property] url
     * 
     * URL representing this participant.
     */
    @NotNull
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * contactPredicate
     * 
     * Returns a predicate to use with Contacts.framework to retrieve the corresponding
     * CNContact instance.
     * 
     * This method returns a predicate that can be used with a CNContactStore to fetch
     * a CNContact instance for this participant, if one exists.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("contactPredicate")
    public native NSPredicate contactPredicate();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("init")
    public native EKParticipant init();

    /**
     * [@property] currentUser
     * 
     * A boolean indicating whether this participant represents the
     * owner of this account.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("isCurrentUser")
    public native boolean isCurrentUser();

    /**
     * [@property] name
     * 
     * Name of this participant.
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] participantRole
     * 
     * The role of the attendee.
     * 
     * Returns the role of the attendee as a EKParticipantRole value.
     */
    @Generated
    @Selector("participantRole")
    @NInt
    public native long participantRole();

    /**
     * [@property] participantStatus
     * 
     * The status of the attendee.
     * 
     * Returns the status of the attendee as a EKParticipantStatus value.
     */
    @Generated
    @Selector("participantStatus")
    @NInt
    public native long participantStatus();

    /**
     * [@property] participantType
     * 
     * The type of the attendee.
     * 
     * Returns the type of the attendee as a EKParticipantType value.
     */
    @Generated
    @Selector("participantType")
    @NInt
    public native long participantType();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
