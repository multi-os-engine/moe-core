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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIPrinterPickerControllerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPrinterPickerController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPrinterPickerController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPrinterPickerController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPrinterPickerController allocWithZone(VoidPtr zone);

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
    public static native UIPrinterPickerController new_objc();

    /**
     * printerPickerControllerWithInitiallySelectedPrinter:
     * 
     * This method returns a printer picker controller object for showing the
     * UI that allows the user to select a printer. This is only used with the
     * UIPrintInteractionController's printWithoutUIToPrinter: method.
     * If no printer should be preselected, use a value of nil for the parameter.
     */
    @NotNull
    @Generated
    @Selector("printerPickerControllerWithInitiallySelectedPrinter:")
    public static native UIPrinterPickerController printerPickerControllerWithInitiallySelectedPrinter(
            @Nullable UIPrinter printer);

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
    public native UIPrinterPickerControllerDelegate delegate();

    @Generated
    @Selector("dismissAnimated:")
    public native void dismissAnimated(boolean animated);

    @Generated
    @Selector("init")
    public native UIPrinterPickerController init();

    /**
     * iPhone
     */
    @Generated
    @Selector("presentAnimated:completionHandler:")
    public native boolean presentAnimatedCompletionHandler(boolean animated,
            @Nullable @ObjCBlock(name = "call_presentAnimatedCompletionHandler") Block_presentAnimatedCompletionHandler completion);

    /**
     * iPad
     */
    @Generated
    @Selector("presentFromBarButtonItem:animated:completionHandler:")
    public native boolean presentFromBarButtonItemAnimatedCompletionHandler(@NotNull UIBarButtonItem item,
            boolean animated,
            @Nullable @ObjCBlock(name = "call_presentFromBarButtonItemAnimatedCompletionHandler") Block_presentFromBarButtonItemAnimatedCompletionHandler completion);

    /**
     * iPad
     */
    @Generated
    @Selector("presentFromRect:inView:animated:completionHandler:")
    public native boolean presentFromRectInViewAnimatedCompletionHandler(@ByValue CGRect rect, @NotNull UIView view,
            boolean animated,
            @Nullable @ObjCBlock(name = "call_presentFromRectInViewAnimatedCompletionHandler") Block_presentFromRectInViewAnimatedCompletionHandler completion);

    /**
     * The selected printer. Set this before presenting the UI to show the currently
     * selected printer. Use this to determine which printer the user selected.
     */
    @Nullable
    @Generated
    @Selector("selectedPrinter")
    public native UIPrinter selectedPrinter();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) UIPrinterPickerControllerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UIPrinterPickerControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentAnimatedCompletionHandler {
        @Generated
        void call_presentAnimatedCompletionHandler(@NotNull UIPrinterPickerController printerPickerController,
                boolean userDidSelect, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentFromBarButtonItemAnimatedCompletionHandler {
        @Generated
        void call_presentFromBarButtonItemAnimatedCompletionHandler(
                @NotNull UIPrinterPickerController printerPickerController, boolean userDidSelect,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentFromRectInViewAnimatedCompletionHandler {
        @Generated
        void call_presentFromRectInViewAnimatedCompletionHandler(
                @NotNull UIPrinterPickerController printerPickerController, boolean userDidSelect,
                @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
