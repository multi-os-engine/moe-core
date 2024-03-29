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

package apple.eventkitui;

import apple.NSObject;
import apple.eventkit.EKCalendar;
import apple.eventkit.EKEventStore;
import apple.eventkitui.protocol.EKCalendarChooserDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIViewController;
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

@Generated
@Library("EventKitUI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKCalendarChooser extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected EKCalendarChooser(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKCalendarChooser alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKCalendarChooser allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public static native EKCalendarChooser new_objc();

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
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native EKCalendarChooserDelegate delegate();

    @Generated
    @Selector("init")
    public native EKCalendarChooser init();

    @Generated
    @Selector("initWithCoder:")
    public native EKCalendarChooser initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native EKCalendarChooser initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * variant to only show calendars for events or reminders.
     */
    @Generated
    @Selector("initWithSelectionStyle:displayStyle:entityType:eventStore:")
    public native EKCalendarChooser initWithSelectionStyleDisplayStyleEntityTypeEventStore(@NInt long style,
            @NInt long displayStyle, @NUInt long entityType, @NotNull EKEventStore eventStore);

    @Generated
    @Selector("initWithSelectionStyle:displayStyle:eventStore:")
    public native EKCalendarChooser initWithSelectionStyleDisplayStyleEventStore(@NInt long selectionStyle,
            @NInt long displayStyle, @NotNull EKEventStore eventStore);

    /**
     * Regardless of whether the chooser allows you to select one or multiple
     * calendars, the selection is always expressed as a set.
     */
    @NotNull
    @Generated
    @Selector("selectedCalendars")
    public native NSSet<? extends EKCalendar> selectedCalendars();

    @Generated
    @Selector("selectionStyle")
    @NInt
    public native long selectionStyle();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) EKCalendarChooserDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) EKCalendarChooserDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Regardless of whether the chooser allows you to select one or multiple
     * calendars, the selection is always expressed as a set.
     */
    @Generated
    @Selector("setSelectedCalendars:")
    public native void setSelectedCalendars(@NotNull NSSet<? extends EKCalendar> value);

    @Generated
    @Selector("setShowsCancelButton:")
    public native void setShowsCancelButton(boolean value);

    /**
     * When used in a navigation controller (presented modally), you can enable
     * the done/cancel buttons and get informed when pressed via the delegate.
     */
    @Generated
    @Selector("setShowsDoneButton:")
    public native void setShowsDoneButton(boolean value);

    @Generated
    @Selector("showsCancelButton")
    public native boolean showsCancelButton();

    /**
     * When used in a navigation controller (presented modally), you can enable
     * the done/cancel buttons and get informed when pressed via the delegate.
     */
    @Generated
    @Selector("showsDoneButton")
    public native boolean showsDoneButton();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
