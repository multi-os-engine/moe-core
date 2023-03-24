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
import apple.foundation.NSSet;
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
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INIntent extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INIntent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INIntent allocWithZone(VoidPtr zone);

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
    public static native INIntent new_objc();

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
     * Returns the identifier of the receiver.
     * Could be used to keep track of the entire transaction for resolve, confirm and handleIntent
     */
    @Nullable
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native INIntent init();

    @Generated
    @Selector("initWithCoder:")
    public native INIntent initWithCoder(@NotNull NSCoder coder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * A human-understandable string representation of the intent's user-facing behavior
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("intentDescription")
    public native String intentDescription();

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("imageForParameterNamed:")
    public native INImage imageForParameterNamed(@NotNull String parameterName);

    /**
     * The image most relevant for display to the receiver, accounting for both parameter-associated images and other
     * images defined in the receiver.
     */
    @Nullable
    @Generated
    @Selector("keyImage")
    public native INImage keyImage();

    /**
     * Set an image associated with a parameter on the receiver. This image will be used in display of the receiver
     * throughout the system.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setImage:forParameterNamed:")
    public native void setImageForParameterNamed(@Nullable INImage image, @NotNull String parameterName);

    /**
     * A human-understandable string that can be shown to the user as an suggestion of the phrase they might want to use
     * when adding intent as a shortcut to Siri.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setSuggestedInvocationPhrase:")
    public native void setSuggestedInvocationPhrase(@Nullable String value);

    /**
     * A human-understandable string that can be shown to the user as an suggestion of the phrase they might want to use
     * when adding intent as a shortcut to Siri.
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("suggestedInvocationPhrase")
    public native String suggestedInvocationPhrase();

    /**
     * Defines additional contexts in which this intent is relevant to be suggested to the user. Applies to intents
     * donated using INInteraction or set as suggested using INVoiceShortcutCenter.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setShortcutAvailability:")
    public native void setShortcutAvailability(@NUInt long value);

    /**
     * Defines additional contexts in which this intent is relevant to be suggested to the user. Applies to intents
     * donated using INInteraction or set as suggested using INVoiceShortcutCenter.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("shortcutAvailability")
    @NUInt
    public native long shortcutAvailability();

    /**
     * A metadata object to attach additional metadata to this intent when donated
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("donationMetadata")
    public native INIntentDonationMetadata donationMetadata();

    /**
     * A metadata object to attach additional metadata to this intent when donated
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setDonationMetadata:")
    public native void setDonationMetadata(@Nullable INIntentDonationMetadata value);
}
