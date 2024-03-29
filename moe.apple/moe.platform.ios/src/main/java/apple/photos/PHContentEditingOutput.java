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

package apple.photos;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import apple.foundation.NSError;
import apple.uniformtypeidentifiers.UTType;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.Ptr;

/**
 * API-Since: 8.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHContentEditingOutput extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHContentEditingOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHContentEditingOutput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHContentEditingOutput allocWithZone(VoidPtr zone);

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
    public static native PHContentEditingOutput new_objc();

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
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("adjustmentData")
    public native PHAdjustmentData adjustmentData();

    @Generated
    @Selector("init")
    public native PHContentEditingOutput init();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("initWithContentEditingInput:")
    public native PHContentEditingOutput initWithContentEditingInput(
            @NotNull PHContentEditingInput contentEditingInput);

    /**
     * Create a PHContentEditingOutput from a newly created asset within the change request block
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("initWithPlaceholderForCreatedAsset:")
    public native PHContentEditingOutput initWithPlaceholderForCreatedAsset(
            @NotNull PHObjectPlaceholder placeholderForCreatedAsset);

    /**
     * File URL where the rendered output in the default format, with adjustments baked-in, needs to be written to.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("renderedContentURL")
    public native NSURL renderedContentURL();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setAdjustmentData:")
    public native void setAdjustmentData(@Nullable PHAdjustmentData value);

    /**
     * Returns the default type for the rendered content output
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("defaultRenderedContentType")
    @Nullable
    public native UTType defaultRenderedContentType();

    /**
     * Returns a file URL where the rendered output in the specified format, with adjustments baked-in, needs to be
     * written to. Returns nil and provides an error identifying the reason if the format is unsupported or the
     * requested content URL cannot be provided
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("renderedContentURLForType:error:")
    @Nullable
    public native NSURL renderedContentURLForTypeError(@NotNull UTType type,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Returns the supported types for the rendered content output
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("supportedRenderedContentTypes")
    @NotNull
    public native NSArray<? extends UTType> supportedRenderedContentTypes();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
