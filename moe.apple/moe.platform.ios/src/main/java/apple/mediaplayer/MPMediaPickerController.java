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

package apple.mediaplayer;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mediaplayer.protocol.MPMediaPickerControllerDelegate;
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

/**
 * API-Since: 3.0
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMediaPickerController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected MPMediaPickerController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMediaPickerController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPMediaPickerController allocWithZone(VoidPtr zone);

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
    public static native MPMediaPickerController new_objc();

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
     * default is NO
     */
    @Generated
    @Selector("allowsPickingMultipleItems")
    public native boolean allowsPickingMultipleItems();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPMediaPickerControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native MPMediaPickerController init();

    @Generated
    @Selector("initWithCoder:")
    public native MPMediaPickerController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithMediaTypes:")
    public native MPMediaPickerController initWithMediaTypes(@NUInt long mediaTypes);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native MPMediaPickerController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    @Generated
    @Selector("mediaTypes")
    @NUInt
    public native long mediaTypes();

    /**
     * displays a prompt for the user above the navigation bar buttons
     */
    @Nullable
    @Generated
    @Selector("prompt")
    public native String prompt();

    /**
     * default is NO
     */
    @Generated
    @Selector("setAllowsPickingMultipleItems:")
    public native void setAllowsPickingMultipleItems(boolean value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) MPMediaPickerControllerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) MPMediaPickerControllerDelegate value) {
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
     * displays a prompt for the user above the navigation bar buttons
     */
    @Generated
    @Selector("setPrompt:")
    public native void setPrompt(@Nullable String value);

    /**
     * default is YES
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setShowsCloudItems:")
    public native void setShowsCloudItems(boolean value);

    /**
     * default is YES
     * 
     * API-Since: 9.2
     */
    @Generated
    @Selector("setShowsItemsWithProtectedAssets:")
    public native void setShowsItemsWithProtectedAssets(boolean value);

    /**
     * default is YES
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("showsCloudItems")
    public native boolean showsCloudItems();

    /**
     * default is YES
     * 
     * API-Since: 9.2
     */
    @Generated
    @Selector("showsItemsWithProtectedAssets")
    public native boolean showsItemsWithProtectedAssets();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
