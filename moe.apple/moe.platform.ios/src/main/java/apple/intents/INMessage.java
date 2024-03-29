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
import apple.foundation.protocol.NSSecureCoding;
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
import apple.foundation.NSNumber;

/**
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INMessage extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INMessage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INMessage alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INMessage allocWithZone(VoidPtr zone);

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
    public static native INMessage new_objc();

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

    @Nullable
    @Generated
    @Selector("content")
    public native String content();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Nullable
    @Generated
    @Selector("dateSent")
    public native NSDate dateSent();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native INMessage init();

    @Generated
    @Selector("initWithCoder:")
    public native INMessage initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithIdentifier:content:dateSent:sender:recipients:")
    public native INMessage initWithIdentifierContentDateSentSenderRecipients(@NotNull String identifier,
            @Nullable String content, @Nullable NSDate dateSent, @Nullable INPerson sender,
            @Nullable NSArray<? extends INPerson> recipients);

    @Nullable
    @Generated
    @Selector("recipients")
    public native NSArray<? extends INPerson> recipients();

    @Nullable
    @Generated
    @Selector("sender")
    public native INPerson sender();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("conversationIdentifier")
    public native String conversationIdentifier();

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("groupName")
    public native INSpeakableString groupName();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:")
    public native INMessage initWithIdentifierConversationIdentifierContentDateSentSenderRecipientsGroupNameMessageType(
            @NotNull String identifier, @Nullable String conversationIdentifier, @Nullable String content,
            @Nullable NSDate dateSent, @Nullable INPerson sender, @Nullable NSArray<? extends INPerson> recipients,
            @Nullable INSpeakableString groupName, @NInt long messageType);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:messageType:")
    public native INMessage initWithIdentifierConversationIdentifierContentDateSentSenderRecipientsMessageType(
            @NotNull String identifier, @Nullable String conversationIdentifier, @Nullable String content,
            @Nullable NSDate dateSent, @Nullable INPerson sender, @Nullable NSArray<? extends INPerson> recipients,
            @NInt long messageType);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("messageType")
    @NInt
    public native long messageType();

    /**
     * API-Since: 13.2
     */
    @Generated
    @Selector("initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:serviceName:")
    public native INMessage initWithIdentifierConversationIdentifierContentDateSentSenderRecipientsGroupNameMessageTypeServiceName(
            @NotNull String identifier, @Nullable String conversationIdentifier, @Nullable String content,
            @Nullable NSDate dateSent, @Nullable INPerson sender, @Nullable NSArray<? extends INPerson> recipients,
            @Nullable INSpeakableString groupName, @NInt long messageType, @Nullable String serviceName);

    /**
     * API-Since: 13.2
     */
    @Nullable
    @Generated
    @Selector("serviceName")
    public native String serviceName();

    /**
     * API-Since: 16.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use attachmentFile instead
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("audioMessageFile")
    public native INFile audioMessageFile();

    @Generated
    @Selector("initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:serviceName:audioMessageFile:")
    public native INMessage initWithIdentifierConversationIdentifierContentDateSentSenderRecipientsGroupNameMessageTypeServiceNameAudioMessageFile(
            @NotNull String identifier, @Nullable String conversationIdentifier, @Nullable String content,
            @Nullable NSDate dateSent, @Nullable INPerson sender, @Nullable NSArray<? extends INPerson> recipients,
            @Nullable INSpeakableString groupName, @NInt long messageType, @Nullable String serviceName,
            @Nullable INFile audioMessageFile);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("attachmentFiles")
    @Nullable
    public native NSArray<? extends INFile> attachmentFiles();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:messageType:serviceName:attachmentFiles:")
    public native INMessage initWithIdentifierConversationIdentifierContentDateSentSenderRecipientsGroupNameMessageTypeServiceNameAttachmentFiles(
            @NotNull String identifier, @Nullable String conversationIdentifier, @Nullable String content,
            @Nullable NSDate dateSent, @Nullable INPerson sender, @Nullable NSArray<? extends INPerson> recipients,
            @Nullable INSpeakableString groupName, @NInt long messageType, @Nullable String serviceName,
            @Nullable NSArray<? extends INFile> attachmentFiles);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:serviceName:linkMetadata:")
    public native INMessage initWithIdentifierConversationIdentifierContentDateSentSenderRecipientsGroupNameServiceNameLinkMetadata(
            @NotNull String identifier, @Nullable String conversationIdentifier, @Nullable String content,
            @Nullable NSDate dateSent, @Nullable INPerson sender, @Nullable NSArray<? extends INPerson> recipients,
            @Nullable INSpeakableString groupName, @Nullable String serviceName,
            @Nullable INMessageLinkMetadata linkMetadata);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("initWithIdentifier:conversationIdentifier:content:dateSent:sender:recipients:groupName:serviceName:messageType:numberOfAttachments:")
    public native INMessage initWithIdentifierConversationIdentifierContentDateSentSenderRecipientsGroupNameServiceNameMessageTypeNumberOfAttachments(
            @NotNull String identifier, @Nullable String conversationIdentifier, @Nullable String content,
            @Nullable NSDate dateSent, @Nullable INPerson sender, @Nullable NSArray<? extends INPerson> recipients,
            @Nullable INSpeakableString groupName, @Nullable String serviceName, @NInt long messageType,
            @Nullable NSNumber numberOfAttachments);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("linkMetadata")
    @Nullable
    public native INMessageLinkMetadata linkMetadata();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("numberOfAttachments")
    @Nullable
    public native NSNumber numberOfAttachments();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
