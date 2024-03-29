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
import apple.corelocation.CLPlacemark;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INSearchForPhotosIntent is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INSearchForPhotosIntent extends INIntent {
    static {
        NatJ.register();
    }

    @Generated
    protected INSearchForPhotosIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INSearchForPhotosIntent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INSearchForPhotosIntent allocWithZone(VoidPtr zone);

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
    public static native INSearchForPhotosIntent new_objc();

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

    /**
     * Search for photos contained in albums matching this name.
     */
    @Nullable
    @Generated
    @Selector("albumName")
    public native String albumName();

    /**
     * Search for photos created in the specified date interval.
     */
    @Nullable
    @Generated
    @Selector("dateCreated")
    public native INDateComponentsRange dateCreated();

    /**
     * When specified, do not match photos of the given types.
     */
    @Generated
    @Selector("excludedAttributes")
    @NUInt
    public native long excludedAttributes();

    /**
     * When specified, only match photos of the given types.
     */
    @Generated
    @Selector("includedAttributes")
    @NUInt
    public native long includedAttributes();

    @Generated
    @Selector("init")
    public native INSearchForPhotosIntent init();

    @Generated
    @Selector("initWithCoder:")
    public native INSearchForPhotosIntent initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithDateCreated:locationCreated:albumName:searchTerms:includedAttributes:excludedAttributes:peopleInPhoto:")
    public native INSearchForPhotosIntent initWithDateCreatedLocationCreatedAlbumNameSearchTermsIncludedAttributesExcludedAttributesPeopleInPhoto(
            @Nullable INDateComponentsRange dateCreated, @Nullable CLPlacemark locationCreated,
            @Nullable String albumName, @Nullable NSArray<String> searchTerms, @NUInt long includedAttributes,
            @NUInt long excludedAttributes, @Nullable NSArray<? extends INPerson> peopleInPhoto);

    /**
     * Search for photos taken at the specified location.
     */
    @Nullable
    @Generated
    @Selector("locationCreated")
    public native CLPlacemark locationCreated();

    /**
     * INPerson objects that should be present in the matched photos, dependent on the peopleInPhotoOperator.
     */
    @Nullable
    @Generated
    @Selector("peopleInPhoto")
    public native NSArray<? extends INPerson> peopleInPhoto();

    /**
     * Describes how to combine the contents of the peopleInPhoto array.
     */
    @Generated
    @Selector("peopleInPhotoOperator")
    @NInt
    public native long peopleInPhotoOperator();

    /**
     * Search for photos with keywords, names, descriptions, etc. that match these search terms.
     */
    @Nullable
    @Generated
    @Selector("searchTerms")
    public native NSArray<String> searchTerms();

    /**
     * Describes how to combine the contents of the searchTerm array.
     */
    @Generated
    @Selector("searchTermsOperator")
    @NInt
    public native long searchTermsOperator();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
