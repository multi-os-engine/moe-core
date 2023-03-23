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

package apple.foundation;

import apple.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSConstantString extends NSSimpleCString {
    static {
        NatJ.register();
    }

    @Generated
    protected NSConstantString(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSConstantString alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSConstantString allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("availableStringEncodings")
    public static native ConstNUIntPtr availableStringEncodings();

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
    @Selector("defaultCStringEncoding")
    @NUInt
    public static native long defaultCStringEncoding();

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
    @Selector("localizedNameOfStringEncoding:")
    public static native String localizedNameOfStringEncoding(@NUInt long encoding);

    @Generated
    @Variadic()
    @Selector("localizedStringWithFormat:")
    public static native NSConstantString localizedStringWithFormat(String format, Object... varargs);

    @Generated
    @Selector("localizedUserNotificationStringForKey:arguments:")
    public static native String localizedUserNotificationStringForKeyArguments(String key, NSArray<?> arguments);

    @Generated
    @Owned
    @Selector("new")
    public static native NSConstantString new_objc();

    @Generated
    @Selector("pathWithComponents:")
    public static native String pathWithComponents(NSArray<String> components);

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
    @Selector("string")
    public static native NSConstantString string();

    @Generated
    @Selector("stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:")
    @NUInt
    public static native long stringEncodingForDataEncodingOptionsConvertedStringUsedLossyConversion(NSData data,
            NSDictionary<String, ?> opts, @ReferenceInfo(type = NSString.class) Ptr<NSString> string,
            BoolPtr usedLossyConversion);

    @Generated
    @Deprecated
    @Selector("stringWithCString:")
    public static native NSConstantString stringWithCString(ConstBytePtr bytes);

    @Generated
    @Selector("stringWithCString:encoding:")
    public static native NSConstantString stringWithCStringEncoding(ConstBytePtr cString, @NUInt long enc);

    @Generated
    @Deprecated
    @Selector("stringWithCString:length:")
    public static native NSConstantString stringWithCStringLength(ConstBytePtr bytes, @NUInt long length);

    @Generated
    @Selector("stringWithCharacters:length:")
    public static native NSConstantString stringWithCharactersLength(ConstCharPtr characters, @NUInt long length);

    @Generated
    @Deprecated
    @Selector("stringWithContentsOfFile:")
    public static native NSConstantString stringWithContentsOfFile(String path);

    @Generated
    @Selector("stringWithContentsOfFile:encoding:error:")
    public static native NSConstantString stringWithContentsOfFileEncodingError(String path, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("stringWithContentsOfFile:usedEncoding:error:")
    public static native NSConstantString stringWithContentsOfFileUsedEncodingError(String path, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("stringWithContentsOfURL:")
    public static native NSConstantString stringWithContentsOfURL(NSURL url);

    @Generated
    @Selector("stringWithContentsOfURL:encoding:error:")
    public static native NSConstantString stringWithContentsOfURLEncodingError(NSURL url, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("stringWithContentsOfURL:usedEncoding:error:")
    public static native NSConstantString stringWithContentsOfURLUsedEncodingError(NSURL url, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("stringWithFormat:")
    public static native NSConstantString stringWithFormat(String format, Object... varargs);

    @Generated
    @Selector("stringWithString:")
    public static native NSConstantString stringWithString(String string);

    @Generated
    @Selector("stringWithUTF8String:")
    public static native NSConstantString stringWithUTF8String(ConstBytePtr nullTerminatedCString);

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
    @Selector("init")
    public native NSConstantString init();

    @Generated
    @Selector("initWithBytes:length:encoding:")
    public native NSConstantString initWithBytesLengthEncoding(ConstVoidPtr bytes, @NUInt long len,
            @NUInt long encoding);

    @Generated
    @Selector("initWithBytesNoCopy:length:encoding:freeWhenDone:")
    public native NSConstantString initWithBytesNoCopyLengthEncodingFreeWhenDone(VoidPtr bytes, @NUInt long len,
            @NUInt long encoding, boolean freeBuffer);

    @Generated
    @Deprecated
    @Selector("initWithCString:")
    public native NSConstantString initWithCString(ConstBytePtr bytes);

    @Generated
    @Selector("initWithCString:encoding:")
    public native NSConstantString initWithCStringEncoding(ConstBytePtr nullTerminatedCString, @NUInt long encoding);

    @Generated
    @Deprecated
    @Selector("initWithCString:length:")
    public native NSConstantString initWithCStringLength(ConstBytePtr bytes, @NUInt long length);

    @Generated
    @Deprecated
    @Selector("initWithCStringNoCopy:length:freeWhenDone:")
    public native NSConstantString initWithCStringNoCopyLengthFreeWhenDone(BytePtr bytes, @NUInt long length,
            boolean freeBuffer);

    @Generated
    @Selector("initWithCharacters:length:")
    public native NSConstantString initWithCharactersLength(ConstCharPtr characters, @NUInt long length);

    @Generated
    @Selector("initWithCharactersNoCopy:length:freeWhenDone:")
    public native NSConstantString initWithCharactersNoCopyLengthFreeWhenDone(CharPtr characters, @NUInt long length,
            boolean freeBuffer);

    @Generated
    @Selector("initWithCoder:")
    public native NSConstantString initWithCoder(NSCoder coder);

    @Generated
    @Deprecated
    @Selector("initWithContentsOfFile:")
    public native NSConstantString initWithContentsOfFile(String path);

    @Generated
    @Selector("initWithContentsOfFile:encoding:error:")
    public native NSConstantString initWithContentsOfFileEncodingError(String path, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithContentsOfFile:usedEncoding:error:")
    public native NSConstantString initWithContentsOfFileUsedEncodingError(String path, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("initWithContentsOfURL:")
    public native NSConstantString initWithContentsOfURL(NSURL url);

    @Generated
    @Selector("initWithContentsOfURL:encoding:error:")
    public native NSConstantString initWithContentsOfURLEncodingError(NSURL url, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithContentsOfURL:usedEncoding:error:")
    public native NSConstantString initWithContentsOfURLUsedEncodingError(NSURL url, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithData:encoding:")
    public native NSConstantString initWithDataEncoding(NSData data, @NUInt long encoding);

    @Generated
    @Variadic()
    @Selector("initWithFormat:")
    public native NSConstantString initWithFormat(String format, Object... varargs);

    @Generated
    @Selector("initWithFormat:arguments:")
    public native NSConstantString initWithFormatArguments(String format, BytePtr argList);

    @Generated
    @Variadic()
    @Selector("initWithFormat:locale:")
    public native NSConstantString initWithFormatLocale(String format, @Mapped(ObjCObjectMapper.class) Object locale,
            Object... varargs);

    @Generated
    @Selector("initWithFormat:locale:arguments:")
    public native NSConstantString initWithFormatLocaleArguments(String format,
            @Mapped(ObjCObjectMapper.class) Object locale, BytePtr argList);

    @Generated
    @Selector("initWithString:")
    public native NSConstantString initWithString(String aString);

    @Generated
    @Selector("initWithUTF8String:")
    public native NSConstantString initWithUTF8String(ConstBytePtr nullTerminatedCString);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native NSConstantString objectWithItemProviderDataTypeIdentifierError(NSData data,
            String typeIdentifier, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public NSConstantString _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @Generated
    @Variadic()
    @Selector("deferredLocalizedIntentsStringWithFormat:")
    public static native String deferredLocalizedIntentsStringWithFormat(String format, Object... varargs);

    @Generated
    @Variadic()
    @Selector("deferredLocalizedIntentsStringWithFormat:fromTable:")
    public static native String deferredLocalizedIntentsStringWithFormatFromTable(String format, String table,
            Object... varargs);

    @Generated
    @Selector("deferredLocalizedIntentsStringWithFormat:fromTable:arguments:")
    public static native String deferredLocalizedIntentsStringWithFormatFromTableArguments(String format, String table,
            BytePtr arguments);

    @Generated
    @Selector("initWithBytesNoCopy:length:encoding:deallocator:")
    public native NSConstantString initWithBytesNoCopyLengthEncodingDeallocator(VoidPtr bytes, @NUInt long len,
            @NUInt long encoding,
            @ObjCBlock(name = "call_initWithBytesNoCopyLengthEncodingDeallocator") NSString.Block_initWithBytesNoCopyLengthEncodingDeallocator deallocator);

    @Generated
    @Selector("initWithCharactersNoCopy:length:deallocator:")
    public native NSConstantString initWithCharactersNoCopyLengthDeallocator(CharPtr chars, @NUInt long len,
            @ObjCBlock(name = "call_initWithCharactersNoCopyLengthDeallocator") NSString.Block_initWithCharactersNoCopyLengthDeallocator deallocator);

    @Generated
    @Selector("initWithValidatedFormat:validFormatSpecifiers:arguments:error:")
    public native NSConstantString initWithValidatedFormatValidFormatSpecifiersArgumentsError(String format,
            String validFormatSpecifiers, BytePtr argList, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("initWithValidatedFormat:validFormatSpecifiers:error:")
    public native NSConstantString initWithValidatedFormatValidFormatSpecifiersError(String format,
            String validFormatSpecifiers, @ReferenceInfo(type = NSError.class) Ptr<NSError> error, Object... varargs);

    @Generated
    @Selector("initWithValidatedFormat:validFormatSpecifiers:locale:arguments:error:")
    public native NSConstantString initWithValidatedFormatValidFormatSpecifiersLocaleArgumentsError(String format,
            String validFormatSpecifiers, @Mapped(ObjCObjectMapper.class) Object locale, BytePtr argList,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("initWithValidatedFormat:validFormatSpecifiers:locale:error:")
    public native NSConstantString initWithValidatedFormatValidFormatSpecifiersLocaleError(String format,
            String validFormatSpecifiers, @Mapped(ObjCObjectMapper.class) Object locale,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error, Object... varargs);

    @Generated
    @Variadic()
    @Selector("localizedStringWithValidatedFormat:validFormatSpecifiers:error:")
    public static native NSConstantString localizedStringWithValidatedFormatValidFormatSpecifiersError(String format,
            String validFormatSpecifiers, @ReferenceInfo(type = NSError.class) Ptr<NSError> error, Object... varargs);

    @Generated
    @Variadic()
    @Selector("stringWithValidatedFormat:validFormatSpecifiers:error:")
    public static native NSConstantString stringWithValidatedFormatValidFormatSpecifiersError(String format,
            String validFormatSpecifiers, @ReferenceInfo(type = NSError.class) Ptr<NSError> error, Object... varargs);
}
