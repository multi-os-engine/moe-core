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

package apple.usernotifications;

import apple.NSObject;
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
 */
@Generated
@Library("UserNotifications")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UNTextInputNotificationAction extends UNNotificationAction {
    static {
        NatJ.register();
    }

    @Generated
    protected UNTextInputNotificationAction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("actionWithIdentifier:title:options:")
    public static native UNTextInputNotificationAction actionWithIdentifierTitleOptions(@NotNull String identifier,
            @NotNull String title, @NUInt long options);

    /**
     * Use -[NSString localizedUserNotificationStringForKey:arguments:] to provide a string that will be localized at
     * the time that the notification is presented.
     */
    @Generated
    @Selector("actionWithIdentifier:title:options:textInputButtonTitle:textInputPlaceholder:")
    public static native UNTextInputNotificationAction actionWithIdentifierTitleOptionsTextInputButtonTitleTextInputPlaceholder(
            @NotNull String identifier, @NotNull String title, @NUInt long options,
            @NotNull String textInputButtonTitle, @NotNull String textInputPlaceholder);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UNTextInputNotificationAction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UNTextInputNotificationAction allocWithZone(VoidPtr zone);

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
    public static native UNTextInputNotificationAction new_objc();

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
    @Selector("init")
    public native UNTextInputNotificationAction init();

    @Generated
    @Selector("initWithCoder:")
    public native UNTextInputNotificationAction initWithCoder(@NotNull NSCoder coder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The text input button title displayed for this action.
     */
    @NotNull
    @Generated
    @Selector("textInputButtonTitle")
    public native String textInputButtonTitle();

    /**
     * The placeholder text displayed in the text input field for this action.
     */
    @NotNull
    @Generated
    @Selector("textInputPlaceholder")
    public native String textInputPlaceholder();

    @Generated
    @Selector("actionWithIdentifier:title:options:icon:")
    public static native UNTextInputNotificationAction actionWithIdentifierTitleOptionsIcon(@NotNull String identifier,
            @NotNull String title, @NUInt long options, @Nullable UNNotificationActionIcon icon);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("actionWithIdentifier:title:options:icon:textInputButtonTitle:textInputPlaceholder:")
    public static native UNTextInputNotificationAction actionWithIdentifierTitleOptionsIconTextInputButtonTitleTextInputPlaceholder(
            @NotNull String identifier, @NotNull String title, @NUInt long options,
            @Nullable UNNotificationActionIcon icon, @NotNull String textInputButtonTitle,
            @NotNull String textInputPlaceholder);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
