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
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Mutable Data ***************
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableData extends NSData {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableData alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMutableData allocWithZone(VoidPtr zone);

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
    @Selector("data")
    public static native NSMutableData data();

    @Generated
    @Selector("dataWithBytes:length:")
    public static native NSMutableData dataWithBytesLength(@Nullable ConstVoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("dataWithBytesNoCopy:length:")
    public static native NSMutableData dataWithBytesNoCopyLength(@NotNull VoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("dataWithBytesNoCopy:length:freeWhenDone:")
    public static native NSMutableData dataWithBytesNoCopyLengthFreeWhenDone(@NotNull VoidPtr bytes, @NUInt long length,
            boolean b);

    @Generated
    @Selector("dataWithCapacity:")
    public static native NSMutableData dataWithCapacity(@NUInt long aNumItems);

    @Generated
    @Selector("dataWithContentsOfFile:")
    public static native NSMutableData dataWithContentsOfFile(@NotNull String path);

    @Generated
    @Selector("dataWithContentsOfFile:options:error:")
    public static native NSMutableData dataWithContentsOfFileOptionsError(@NotNull String path,
            @NUInt long readOptionsMask, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Deprecated
    @Selector("dataWithContentsOfMappedFile:")
    public static native NSMutableData dataWithContentsOfMappedFile(@NotNull String path);

    @Generated
    @Selector("dataWithContentsOfURL:")
    public static native NSMutableData dataWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Selector("dataWithContentsOfURL:options:error:")
    public static native NSMutableData dataWithContentsOfURLOptionsError(@NotNull NSURL url,
            @NUInt long readOptionsMask, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Selector("dataWithData:")
    public static native NSMutableData dataWithData(@NotNull NSData data);

    @Generated
    @Selector("dataWithLength:")
    public static native NSMutableData dataWithLength(@NUInt long length);

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
    public static native NSMutableData new_objc();

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
    @Selector("appendBytes:length:")
    public native void appendBytesLength(@NotNull ConstVoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("appendData:")
    public native void appendData(@NotNull NSData other);

    @Generated
    @Selector("increaseLengthBy:")
    public native void increaseLengthBy(@NUInt long extraLength);

    @Generated
    @Selector("init")
    public native NSMutableData init();

    @Generated
    @Selector("initWithBase64EncodedData:options:")
    public native NSMutableData initWithBase64EncodedDataOptions(@NotNull NSData base64Data, @NUInt long options);

    @Generated
    @Selector("initWithBase64EncodedString:options:")
    public native NSMutableData initWithBase64EncodedStringOptions(@NotNull String base64String, @NUInt long options);

    @Generated
    @Deprecated
    @Selector("initWithBase64Encoding:")
    public native NSMutableData initWithBase64Encoding(@NotNull String base64String);

    @Generated
    @Selector("initWithBytes:length:")
    public native NSMutableData initWithBytesLength(@Nullable ConstVoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("initWithBytesNoCopy:length:")
    public native NSMutableData initWithBytesNoCopyLength(@NotNull VoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("initWithBytesNoCopy:length:deallocator:")
    public native NSMutableData initWithBytesNoCopyLengthDeallocator(@NotNull VoidPtr bytes, @NUInt long length,
            @Nullable @ObjCBlock(name = "call_initWithBytesNoCopyLengthDeallocator") NSData.Block_initWithBytesNoCopyLengthDeallocator deallocator);

    @Generated
    @Selector("initWithBytesNoCopy:length:freeWhenDone:")
    public native NSMutableData initWithBytesNoCopyLengthFreeWhenDone(@NotNull VoidPtr bytes, @NUInt long length,
            boolean b);

    @Generated
    @Selector("initWithCapacity:")
    public native NSMutableData initWithCapacity(@NUInt long capacity);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableData initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSMutableData initWithContentsOfFile(@NotNull String path);

    @Generated
    @Selector("initWithContentsOfFile:options:error:")
    public native NSMutableData initWithContentsOfFileOptionsError(@NotNull String path, @NUInt long readOptionsMask,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Deprecated
    @Selector("initWithContentsOfMappedFile:")
    public native NSMutableData initWithContentsOfMappedFile(@NotNull String path);

    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSMutableData initWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Selector("initWithContentsOfURL:options:error:")
    public native NSMutableData initWithContentsOfURLOptionsError(@NotNull NSURL url, @NUInt long readOptionsMask,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Selector("initWithData:")
    public native NSMutableData initWithData(@NotNull NSData data);

    @Generated
    @Selector("initWithLength:")
    public native NSMutableData initWithLength(@NUInt long length);

    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    @NotNull
    @Generated
    @Selector("mutableBytes")
    public native VoidPtr mutableBytes();

    @Generated
    @Selector("replaceBytesInRange:withBytes:")
    public native void replaceBytesInRangeWithBytes(@ByValue NSRange range, @NotNull ConstVoidPtr bytes);

    @Generated
    @Selector("replaceBytesInRange:withBytes:length:")
    public native void replaceBytesInRangeWithBytesLength(@ByValue NSRange range,
            @Nullable ConstVoidPtr replacementBytes, @NUInt long replacementLength);

    @Generated
    @Selector("resetBytesInRange:")
    public native void resetBytesInRange(@ByValue NSRange range);

    @Generated
    @Selector("setData:")
    public native void setData(@NotNull NSData data);

    @Generated
    @Selector("setLength:")
    public native void setLength(@NUInt long value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("compressUsingAlgorithm:error:")
    public native boolean compressUsingAlgorithmError(@NInt long algorithm,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * These methods compress or decompress the receiver's contents in-place using the specified algorithm. If the
     * operation is not successful, these methods leave the receiver unchanged..
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("decompressUsingAlgorithm:error:")
    public native boolean decompressUsingAlgorithmError(@NInt long algorithm,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
