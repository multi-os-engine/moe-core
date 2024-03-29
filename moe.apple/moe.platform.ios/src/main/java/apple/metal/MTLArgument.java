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

package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * MTLArgument
 * 
 * API-Since: 8.0
 * Deprecated-Since: 16.0
 */
@Deprecated
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLArgument extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLArgument(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLArgument alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MTLArgument allocWithZone(VoidPtr zone);

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
    public static native MTLArgument new_objc();

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

    @Generated
    @Selector("access")
    @NUInt
    public native long access();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("arrayLength")
    @NUInt
    public native long arrayLength();

    /**
     * min alignment of starting offset in the buffer
     */
    @Generated
    @Selector("bufferAlignment")
    @NUInt
    public native long bufferAlignment();

    /**
     * sizeof(T) for T *argName
     */
    @Generated
    @Selector("bufferDataSize")
    @NUInt
    public native long bufferDataSize();

    /**
     * MTLDataTypeFloat, MTLDataTypeFloat4, MTLDataTypeStruct, ...
     */
    @Generated
    @Selector("bufferDataType")
    @NUInt
    public native long bufferDataType();

    @Nullable
    @Generated
    @Selector("bufferStructType")
    public native MTLStructType bufferStructType();

    @Generated
    @Selector("index")
    @NUInt
    public native long index();

    @Generated
    @Selector("init")
    public native MTLArgument init();

    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * true for depth textures
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("isDepthTexture")
    public native boolean isDepthTexture();

    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * half, float, int, or uint.
     */
    @Generated
    @Selector("textureDataType")
    @NUInt
    public native long textureDataType();

    /**
     * texture1D, texture2D...
     */
    @Generated
    @Selector("textureType")
    @NUInt
    public native long textureType();

    /**
     * for threadgroup memory arguments
     */
    @Generated
    @Selector("threadgroupMemoryAlignment")
    @NUInt
    public native long threadgroupMemoryAlignment();

    /**
     * sizeof(T) for T *argName
     */
    @Generated
    @Selector("threadgroupMemoryDataSize")
    @NUInt
    public native long threadgroupMemoryDataSize();

    @Generated
    @Selector("type")
    @NUInt
    public native long type();

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("bufferPointerType")
    public native MTLPointerType bufferPointerType();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
