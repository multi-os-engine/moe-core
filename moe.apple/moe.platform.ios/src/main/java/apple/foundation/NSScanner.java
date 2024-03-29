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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSScanner extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSScanner(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSScanner alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSScanner allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("localizedScannerWithString:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object localizedScannerWithString(@NotNull String string);

    @Generated
    @Owned
    @Selector("new")
    public static native NSScanner new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scannerWithString:")
    public static native NSScanner scannerWithString(@NotNull String string);

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

    @Generated
    @Selector("caseSensitive")
    public native boolean caseSensitive();

    @Nullable
    @Generated
    @Selector("charactersToBeSkipped")
    public native NSCharacterSet charactersToBeSkipped();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("init")
    public native NSScanner init();

    @Generated
    @Selector("initWithString:")
    public native NSScanner initWithString(@NotNull String string);

    @Generated
    @Selector("isAtEnd")
    public native boolean isAtEnd();

    @Nullable
    @Generated
    @Selector("locale")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object locale();

    @Generated
    @Selector("scanCharactersFromSet:intoString:")
    public native boolean scanCharactersFromSetIntoString(@NotNull NSCharacterSet set,
            @Nullable @ReferenceInfo(type = NSString.class) Ptr<NSString> result);

    @Generated
    @Selector("scanDecimal:")
    public native boolean scanDecimal(@Nullable VoidPtr dcm);

    @Generated
    @Selector("scanDouble:")
    public native boolean scanDouble(@Nullable DoublePtr result);

    @Generated
    @Selector("scanFloat:")
    public native boolean scanFloat(@Nullable FloatPtr result);

    /**
     * Corresponding to %a or %A formatting. Requires "0x" or "0X" prefix.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("scanHexDouble:")
    public native boolean scanHexDouble(@Nullable DoublePtr result);

    /**
     * Corresponding to %a or %A formatting. Requires "0x" or "0X" prefix.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("scanHexFloat:")
    public native boolean scanHexFloat(@Nullable FloatPtr result);

    /**
     * Optionally prefixed with "0x" or "0X"
     */
    @Generated
    @Selector("scanHexInt:")
    public native boolean scanHexInt(@Nullable IntPtr result);

    /**
     * Optionally prefixed with "0x" or "0X"
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("scanHexLongLong:")
    public native boolean scanHexLongLong(@Nullable LongPtr result);

    /**
     * On overflow, the below methods will return success and clamp
     */
    @Generated
    @Selector("scanInt:")
    public native boolean scanInt(@Nullable IntPtr result);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("scanInteger:")
    public native boolean scanInteger(@Nullable NIntPtr result);

    @Generated
    @Selector("scanLocation")
    @NUInt
    public native long scanLocation();

    @Generated
    @Selector("scanLongLong:")
    public native boolean scanLongLong(@Nullable LongPtr result);

    @Generated
    @Selector("scanString:intoString:")
    public native boolean scanStringIntoString(@NotNull String string,
            @Nullable @ReferenceInfo(type = NSString.class) Ptr<NSString> result);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("scanUnsignedLongLong:")
    public native boolean scanUnsignedLongLong(@Nullable LongPtr result);

    @Generated
    @Selector("scanUpToCharactersFromSet:intoString:")
    public native boolean scanUpToCharactersFromSetIntoString(@NotNull NSCharacterSet set,
            @Nullable @ReferenceInfo(type = NSString.class) Ptr<NSString> result);

    @Generated
    @Selector("scanUpToString:intoString:")
    public native boolean scanUpToStringIntoString(@NotNull String string,
            @Nullable @ReferenceInfo(type = NSString.class) Ptr<NSString> result);

    @Generated
    @Selector("setCaseSensitive:")
    public native void setCaseSensitive(boolean value);

    @Generated
    @Selector("setCharactersToBeSkipped:")
    public native void setCharactersToBeSkipped(@Nullable NSCharacterSet value);

    @Generated
    @Selector("setLocale:")
    public native void setLocale(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setScanLocation:")
    public native void setScanLocation(@NUInt long value);

    @NotNull
    @Generated
    @Selector("string")
    public native String string();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
