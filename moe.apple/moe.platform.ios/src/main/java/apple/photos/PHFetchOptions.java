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
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import apple.foundation.NSSortDescriptor;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHFetchOptions extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PHFetchOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHFetchOptions alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHFetchOptions allocWithZone(VoidPtr zone);

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
    public static native PHFetchOptions new_objc();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Limits the maximum number of objects returned in the fetch result, a value of 0 means no limit. Defaults to 0.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("fetchLimit")
    @NUInt
    public native long fetchLimit();

    /**
     * Whether hidden burst assets are included in fetch results. Defaults to NO
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("includeAllBurstAssets")
    public native boolean includeAllBurstAssets();

    /**
     * The asset source types included in the fetch results. Defaults to PHAssetSourceTypeNone.
     * If set to PHAssetSourceTypeNone the asset source types included in the fetch results are inferred from the type
     * of query performed (see PHAsset fetchAssetsWithOptions:)
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("includeAssetSourceTypes")
    @NUInt
    public native long includeAssetSourceTypes();

    /**
     * Whether hidden assets are included in fetch results. Defaults to NO
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("includeHiddenAssets")
    public native boolean includeHiddenAssets();

    @Generated
    @Selector("init")
    public native PHFetchOptions init();

    /**
     * Some predicates / sorts may be suboptimal and we will log
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * Limits the maximum number of objects returned in the fetch result, a value of 0 means no limit. Defaults to 0.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setFetchLimit:")
    public native void setFetchLimit(@NUInt long value);

    /**
     * Whether hidden burst assets are included in fetch results. Defaults to NO
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setIncludeAllBurstAssets:")
    public native void setIncludeAllBurstAssets(boolean value);

    /**
     * The asset source types included in the fetch results. Defaults to PHAssetSourceTypeNone.
     * If set to PHAssetSourceTypeNone the asset source types included in the fetch results are inferred from the type
     * of query performed (see PHAsset fetchAssetsWithOptions:)
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setIncludeAssetSourceTypes:")
    public native void setIncludeAssetSourceTypes(@NUInt long value);

    /**
     * Whether hidden assets are included in fetch results. Defaults to NO
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setIncludeHiddenAssets:")
    public native void setIncludeHiddenAssets(boolean value);

    /**
     * Some predicates / sorts may be suboptimal and we will log
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPredicate:")
    public native void setPredicate(@Nullable NSPredicate value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setSortDescriptors:")
    public native void setSortDescriptors(@Nullable NSArray<? extends NSSortDescriptor> value);

    /**
     * Whether the owner of this object is interested in incremental change details for the results of this fetch (see
     * PHChange)
     * Defaults to YES
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setWantsIncrementalChangeDetails:")
    public native void setWantsIncrementalChangeDetails(boolean value);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("sortDescriptors")
    public native NSArray<? extends NSSortDescriptor> sortDescriptors();

    /**
     * Whether the owner of this object is interested in incremental change details for the results of this fetch (see
     * PHChange)
     * Defaults to YES
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("wantsIncrementalChangeDetails")
    public native boolean wantsIncrementalChangeDetails();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
