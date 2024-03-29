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
 * API-Since: 5.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUbiquitousKeyValueStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSUbiquitousKeyValueStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSUbiquitousKeyValueStore alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSUbiquitousKeyValueStore allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("defaultStore")
    public static native NSUbiquitousKeyValueStore defaultStore();

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
    public static native NSUbiquitousKeyValueStore new_objc();

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

    @Nullable
    @Generated
    @Selector("arrayForKey:")
    public native NSArray<?> arrayForKey(@NotNull String aKey);

    @Generated
    @Selector("boolForKey:")
    public native boolean boolForKey(@NotNull String aKey);

    @Nullable
    @Generated
    @Selector("dataForKey:")
    public native NSData dataForKey(@NotNull String aKey);

    @Nullable
    @Generated
    @Selector("dictionaryForKey:")
    public native NSDictionary<String, ?> dictionaryForKey(@NotNull String aKey);

    @NotNull
    @Generated
    @Selector("dictionaryRepresentation")
    public native NSDictionary<String, ?> dictionaryRepresentation();

    @Generated
    @Selector("doubleForKey:")
    public native double doubleForKey(@NotNull String aKey);

    @Generated
    @Selector("init")
    public native NSUbiquitousKeyValueStore init();

    @Generated
    @Selector("longLongForKey:")
    public native long longLongForKey(@NotNull String aKey);

    @Nullable
    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectForKey(@NotNull String aKey);

    @Generated
    @Selector("removeObjectForKey:")
    public native void removeObjectForKey(@NotNull String aKey);

    @Generated
    @Selector("setArray:forKey:")
    public native void setArrayForKey(@Nullable NSArray<?> anArray, @NotNull String aKey);

    @Generated
    @Selector("setBool:forKey:")
    public native void setBoolForKey(boolean value, @NotNull String aKey);

    @Generated
    @Selector("setData:forKey:")
    public native void setDataForKey(@Nullable NSData aData, @NotNull String aKey);

    @Generated
    @Selector("setDictionary:forKey:")
    public native void setDictionaryForKey(@Nullable NSDictionary<String, ?> aDictionary, @NotNull String aKey);

    @Generated
    @Selector("setDouble:forKey:")
    public native void setDoubleForKey(double value, @NotNull String aKey);

    @Generated
    @Selector("setLongLong:forKey:")
    public native void setLongLongForKey(long value, @NotNull String aKey);

    @Generated
    @Selector("setObject:forKey:")
    public native void setObjectForKey(@Nullable @Mapped(ObjCObjectMapper.class) Object anObject, @NotNull String aKey);

    @Generated
    @Selector("setString:forKey:")
    public native void setStringForKey(@Nullable String aString, @NotNull String aKey);

    @Nullable
    @Generated
    @Selector("stringForKey:")
    public native String stringForKey(@NotNull String aKey);

    @Generated
    @Selector("synchronize")
    public native boolean synchronize();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
