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
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.protocol.UIPrintInteractionControllerDelegate;
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
 * API-Since: 4.2
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPrintInteractionController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPrintInteractionController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPrintInteractionController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPrintInteractionController allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("canPrintData:")
    public static native boolean canPrintData(@NotNull NSData data);

    @Generated
    @Selector("canPrintURL:")
    public static native boolean canPrintURL(@NotNull NSURL url);

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

    /**
     * return YES if system supports printing. use this to hide HI for unsupported devices.
     */
    @Generated
    @Selector("isPrintingAvailable")
    public static native boolean isPrintingAvailable();

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
    public static native UIPrintInteractionController new_objc();

    /**
     * return set of all document UTI types we can print
     */
    @NotNull
    @Generated
    @Selector("printableUTIs")
    public static native NSSet<String> printableUTIs();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @NotNull
    @Generated
    @Selector("sharedPrintController")
    public static native UIPrintInteractionController sharedPrintController();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * not retained. default is nil
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIPrintInteractionControllerDelegate delegate();

    @Generated
    @Selector("dismissAnimated:")
    public native void dismissAnimated(boolean animated);

    @Generated
    @Selector("init")
    public native UIPrintInteractionController init();

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
     * uses a single formatter to fill the pages
     */
    @Nullable
    @Generated
    @Selector("printFormatter")
    public native UIPrintFormatter printFormatter();

    /**
     * changes to printInfo ignored while printing. default is nil
     */
    @Nullable
    @Generated
    @Selector("printInfo")
    public native UIPrintInfo printInfo();

    /**
     * calls class to render each page
     */
    @Nullable
    @Generated
    @Selector("printPageRenderer")
    public native UIPrintPageRenderer printPageRenderer();

    /**
     * set after printer selection
     */
    @Nullable
    @Generated
    @Selector("printPaper")
    public native UIPrintPaper printPaper();

    /**
     * Use to print without showing the standard print panel. Use with a
     * UIPrinter found using the UIPrinterPickerController.
     * The value for the duplex property on printInfo will be ignored.
     */
    @Generated
    @Selector("printToPrinter:completionHandler:")
    public native boolean printToPrinterCompletionHandler(@NotNull UIPrinter printer,
            @Nullable @ObjCBlock(name = "call_printToPrinterCompletionHandler") Block_printToPrinterCompletionHandler completion);

    /**
     * single NSData, NSURL, UIImage
     */
    @Nullable
    @Generated
    @Selector("printingItem")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object printingItem();

    /**
     * array of NSData, NSURL, UIImage. does not support page range
     */
    @Nullable
    @Generated
    @Selector("printingItems")
    public native NSArray<?> printingItems();

    /**
     * not retained. default is nil
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) UIPrintInteractionControllerDelegate value);

    /**
     * not retained. default is nil
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UIPrintInteractionControllerDelegate value) {
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
     * uses a single formatter to fill the pages
     */
    @Generated
    @Selector("setPrintFormatter:")
    public native void setPrintFormatter(@Nullable UIPrintFormatter value);

    /**
     * changes to printInfo ignored while printing. default is nil
     */
    @Generated
    @Selector("setPrintInfo:")
    public native void setPrintInfo(@Nullable UIPrintInfo value);

    /**
     * calls class to render each page
     */
    @Generated
    @Selector("setPrintPageRenderer:")
    public native void setPrintPageRenderer(@Nullable UIPrintPageRenderer value);

    /**
     * single NSData, NSURL, UIImage
     */
    @Generated
    @Selector("setPrintingItem:")
    public native void setPrintingItem(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * array of NSData, NSURL, UIImage. does not support page range
     */
    @Generated
    @Selector("setPrintingItems:")
    public native void setPrintingItems(@Nullable NSArray<?> value);

    /**
     * default is YES.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setShowsNumberOfCopies:")
    public native void setShowsNumberOfCopies(boolean value);

    /**
     * API-Since: 4.2
     * Deprecated-Since: 10.0
     * Deprecated-Message: Pages can be removed from the print preview, so page range is always shown.
     */
    @Deprecated
    @Generated
    @Selector("setShowsPageRange:")
    public native void setShowsPageRange(boolean value);

    /**
     * default is NO. Paper selection for loaded papers is always shown for UIPrintInfoOutputPhoto and
     * UIPrintInfoOutputPhotoGrayscale
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setShowsPaperSelectionForLoadedPapers:")
    public native void setShowsPaperSelectionForLoadedPapers(boolean value);

    /**
     * default is YES.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("showsNumberOfCopies")
    public native boolean showsNumberOfCopies();

    /**
     * API-Since: 4.2
     * Deprecated-Since: 10.0
     * Deprecated-Message: Pages can be removed from the print preview, so page range is always shown.
     */
    @Deprecated
    @Generated
    @Selector("showsPageRange")
    public native boolean showsPageRange();

    /**
     * default is NO. Paper selection for loaded papers is always shown for UIPrintInfoOutputPhoto and
     * UIPrintInfoOutputPhotoGrayscale
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("showsPaperSelectionForLoadedPapers")
    public native boolean showsPaperSelectionForLoadedPapers();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentAnimatedCompletionHandler {
        @Generated
        void call_presentAnimatedCompletionHandler(@NotNull UIPrintInteractionController printInteractionController,
                boolean completed, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentFromBarButtonItemAnimatedCompletionHandler {
        @Generated
        void call_presentFromBarButtonItemAnimatedCompletionHandler(
                @NotNull UIPrintInteractionController printInteractionController, boolean completed,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentFromRectInViewAnimatedCompletionHandler {
        @Generated
        void call_presentFromRectInViewAnimatedCompletionHandler(
                @NotNull UIPrintInteractionController printInteractionController, boolean completed,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_printToPrinterCompletionHandler {
        @Generated
        void call_printToPrinterCompletionHandler(@NotNull UIPrintInteractionController printInteractionController,
                boolean completed, @Nullable NSError error);
    }

    /**
     * default is YES. Indicates whether the the printing options include the paper orientation control when available.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setShowsPaperOrientation:")
    public native void setShowsPaperOrientation(boolean value);

    /**
     * default is YES. Indicates whether the the printing options include the paper orientation control when available.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("showsPaperOrientation")
    public native boolean showsPaperOrientation();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
