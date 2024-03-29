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

/**
 * API-Since: 9.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPersonNameComponents extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPersonNameComponents(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersonNameComponents alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPersonNameComponents allocWithZone(VoidPtr zone);

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
    public static native NSPersonNameComponents new_objc();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * Name passed from one generation to another to indicate lineage, e.g. Appleseed
     */
    @Nullable
    @Generated
    @Selector("familyName")
    public native String familyName();

    /**
     * Name bestowed upon an individual by one's parents, e.g. Johnathan
     */
    @Nullable
    @Generated
    @Selector("givenName")
    public native String givenName();

    @Generated
    @Selector("init")
    public native NSPersonNameComponents init();

    @Generated
    @Selector("initWithCoder:")
    public native NSPersonNameComponents initWithCoder(@NotNull NSCoder coder);

    /**
     * Secondary given name chosen to differentiate those with the same first name, e.g. Maple
     */
    @Nullable
    @Generated
    @Selector("middleName")
    public native String middleName();

    /**
     * Pre-nominal letters denoting title, salutation, or honorific, e.g. Dr., Mr.
     */
    @Nullable
    @Generated
    @Selector("namePrefix")
    public native String namePrefix();

    /**
     * Post-nominal letters denoting degree, accreditation, or other honor, e.g. Esq., Jr., Ph.D.
     */
    @Nullable
    @Generated
    @Selector("nameSuffix")
    public native String nameSuffix();

    /**
     * Name substituted for the purposes of familiarity, e.g. "Johnny"
     */
    @Nullable
    @Generated
    @Selector("nickname")
    public native String nickname();

    /**
     * Each element of the phoneticRepresentation should correspond to an element of the original PersonNameComponents
     * instance.
     * The phoneticRepresentation of the phoneticRepresentation object itself will be ignored. nil by default, must be
     * instantiated.
     */
    @Nullable
    @Generated
    @Selector("phoneticRepresentation")
    public native NSPersonNameComponents phoneticRepresentation();

    /**
     * Name passed from one generation to another to indicate lineage, e.g. Appleseed
     */
    @Generated
    @Selector("setFamilyName:")
    public native void setFamilyName(@Nullable String value);

    /**
     * Name bestowed upon an individual by one's parents, e.g. Johnathan
     */
    @Generated
    @Selector("setGivenName:")
    public native void setGivenName(@Nullable String value);

    /**
     * Secondary given name chosen to differentiate those with the same first name, e.g. Maple
     */
    @Generated
    @Selector("setMiddleName:")
    public native void setMiddleName(@Nullable String value);

    /**
     * Pre-nominal letters denoting title, salutation, or honorific, e.g. Dr., Mr.
     */
    @Generated
    @Selector("setNamePrefix:")
    public native void setNamePrefix(@Nullable String value);

    /**
     * Post-nominal letters denoting degree, accreditation, or other honor, e.g. Esq., Jr., Ph.D.
     */
    @Generated
    @Selector("setNameSuffix:")
    public native void setNameSuffix(@Nullable String value);

    /**
     * Name substituted for the purposes of familiarity, e.g. "Johnny"
     */
    @Generated
    @Selector("setNickname:")
    public native void setNickname(@Nullable String value);

    /**
     * Each element of the phoneticRepresentation should correspond to an element of the original PersonNameComponents
     * instance.
     * The phoneticRepresentation of the phoneticRepresentation object itself will be ignored. nil by default, must be
     * instantiated.
     */
    @Generated
    @Selector("setPhoneticRepresentation:")
    public native void setPhoneticRepresentation(@Nullable NSPersonNameComponents value);

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
