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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPersonNameComponents;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.intents.protocol.INSpeakable;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INPerson extends NSObject implements NSCopying, NSSecureCoding, INSpeakable {
    static {
        NatJ.register();
    }

    @Generated
    protected INPerson(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INPerson alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("aliases")
    public native NSArray<? extends INPersonHandle> aliases();

    @Generated
    @Selector("contactIdentifier")
    public native String contactIdentifier();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("customIdentifier")
    public native String customIdentifier();

    @Generated
    @Selector("displayName")
    public native String displayName();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("handle")
    public native String handle();

    @IsOptional
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("image")
    public native INImage image();

    @Generated
    @Selector("init")
    public native INPerson init();

    @Generated
    @Selector("initWithCoder:")
    public native INPerson initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithHandle:displayName:contactIdentifier:")
    public native INPerson initWithHandleDisplayNameContactIdentifier(String handle, String displayName,
            String contactIdentifier);

    @Generated
    @Selector("initWithHandle:nameComponents:contactIdentifier:")
    public native INPerson initWithHandleNameComponentsContactIdentifier(String handle,
            NSPersonNameComponents nameComponents, String contactIdentifier);

    @Generated
    @Selector("initWithHandle:nameComponents:displayName:image:contactIdentifier:")
    public native INPerson initWithHandleNameComponentsDisplayNameImageContactIdentifier(String handle,
            NSPersonNameComponents nameComponents, String displayName, INImage image, String contactIdentifier);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:")
    public native INPerson initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifier(
            INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image,
            String contactIdentifier, String customIdentifier);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:aliases:suggestionType:")
    public native INPerson initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierAliasesSuggestionType(
            INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image,
            String contactIdentifier, String customIdentifier, NSArray<? extends INPersonHandle> aliases,
            @NInt long suggestionType);

    @Generated
    @Selector("nameComponents")
    public native NSPersonNameComponents nameComponents();

    @Generated
    @Selector("personHandle")
    public native INPersonHandle personHandle();

    @Generated
    @Selector("pronunciationHint")
    public native String pronunciationHint();

    @Generated
    @Selector("relationship")
    public native String relationship();

    @Generated
    @Selector("spokenPhrase")
    public native String spokenPhrase();

    @Generated
    @Selector("suggestionType")
    @NInt
    public native long suggestionType();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("alternativeSpeakableMatches")
    public native NSArray<?> alternativeSpeakableMatches();

    @Generated
    @Selector("isMe")
    public native boolean isMe();

    @Generated
    @Selector("siriMatches")
    public native NSArray<? extends INPerson> siriMatches();

    @Generated
    @Selector("vocabularyIdentifier")
    public native String vocabularyIdentifier();

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:isMe:")
    public native INPerson initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierIsMe(
            INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image,
            String contactIdentifier, String customIdentifier, boolean isMe);

    @Generated
    @Selector("initWithPersonHandle:nameComponents:displayName:image:contactIdentifier:customIdentifier:relationship:")
    public native INPerson initWithPersonHandleNameComponentsDisplayNameImageContactIdentifierCustomIdentifierRelationship(
            INPersonHandle personHandle, NSPersonNameComponents nameComponents, String displayName, INImage image,
            String contactIdentifier, String customIdentifier, String relationship);
}
