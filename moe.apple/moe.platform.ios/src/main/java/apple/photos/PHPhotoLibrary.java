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
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.photos.protocol.PHPhotoLibraryAvailabilityObserver;
import apple.photos.protocol.PHPhotoLibraryChangeObserver;
import apple.uikit.UIViewController;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
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
public class PHPhotoLibrary extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHPhotoLibrary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHPhotoLibrary alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHPhotoLibrary allocWithZone(VoidPtr zone);

    /**
     * Deprecated and replaced by authorizationStatusForAccessLevel:, will return \c PHAuthorizationStatusAuthorized if
     * the user has chosen limited photo library access
     * 
     * API-Since: 8.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

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
    public static native PHPhotoLibrary new_objc();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("requestAuthorization:")
    public static native void requestAuthorization(
            @NotNull @ObjCBlock(name = "call_requestAuthorization") Block_requestAuthorization handler);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("sharedPhotoLibrary")
    public static native PHPhotoLibrary sharedPhotoLibrary();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native PHPhotoLibrary init();

    /**
     * handlers are invoked on an arbitrary serial queue
     * Nesting change requests will throw an exception
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("performChanges:completionHandler:")
    public native void performChangesCompletionHandler(
            @NotNull @ObjCBlock(name = "call_performChangesCompletionHandler_0") Block_performChangesCompletionHandler_0 changeBlock,
            @Nullable @ObjCBlock(name = "call_performChangesCompletionHandler_1") Block_performChangesCompletionHandler_1 completionHandler);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("performChangesAndWait:error:")
    public native boolean performChangesAndWaitError(
            @NotNull @ObjCBlock(name = "call_performChangesAndWaitError") Block_performChangesAndWaitError changeBlock,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("registerChangeObserver:")
    public native void registerChangeObserver(
            @NotNull @Mapped(ObjCObjectMapper.class) PHPhotoLibraryChangeObserver observer);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("unregisterChangeObserver:")
    public native void unregisterChangeObserver(
            @NotNull @Mapped(ObjCObjectMapper.class) PHPhotoLibraryChangeObserver observer);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performChangesCompletionHandler_0 {
        @Generated
        void call_performChangesCompletionHandler_0();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performChangesCompletionHandler_1 {
        @Generated
        void call_performChangesCompletionHandler_1(boolean success, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performChangesAndWaitError {
        @Generated
        void call_performChangesAndWaitError();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorization {
        @Generated
        void call_requestAuthorization(@NInt long status);
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("registerAvailabilityObserver:")
    public native void registerAvailabilityObserver(
            @NotNull @Mapped(ObjCObjectMapper.class) PHPhotoLibraryAvailabilityObserver observer);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("unavailabilityReason")
    public native NSError unavailabilityReason();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("unregisterAvailabilityObserver:")
    public native void unregisterAvailabilityObserver(
            @NotNull @Mapped(ObjCObjectMapper.class) PHPhotoLibraryAvailabilityObserver observer);

    /**
     * Replaces \c +authorizationStatus to support add-only/read-write access level status
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("authorizationStatusForAccessLevel:")
    @NInt
    public static native long authorizationStatusForAccessLevel(@NInt long accessLevel);

    /**
     * Prompt the user to update their limited library selection by presenting the limited library image picker when the
     * user has opted into limited library access mode (see \c PHAuthorizationStatusLimited )
     * 
     * Use this API when the user has enabled limited photo library access to present the limited library picker and
     * give the user a way to update their selection. If the user has not enabled limited library access mode for this
     * application, then this method will do nothing. This should be used when disabling the automatic limited library
     * alert prompt (by adding \c PHPhotoLibraryPreventAutomaticLimitedAccessAlert = \c YES to the application's
     * Info.plist).
     * 
     * Any changes applied to the limited library selection by the user will trigger a \c PHPhotoLibraryChangeObserver
     * update that can be used to observe the changes to the selection.
     * 
     * API-Since: 14.0
     * 
     * @param controller The view controller that is used to present the limited library picker.
     */
    @Generated
    @Selector("presentLimitedLibraryPickerFromViewController:")
    public native void presentLimitedLibraryPickerFromViewController(@NotNull UIViewController controller);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("requestAuthorizationForAccessLevel:handler:")
    public static native void requestAuthorizationForAccessLevelHandler(@NInt long accessLevel,
            @NotNull @ObjCBlock(name = "call_requestAuthorizationForAccessLevelHandler") Block_requestAuthorizationForAccessLevelHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorizationForAccessLevelHandler {
        @Generated
        void call_requestAuthorizationForAccessLevelHandler(@NInt long status);
    }

    /**
     * Returns a dictionary that maps each local identifier from the provided array to a PLCloudIdentifierMapping result
     * containing the cloud identifier found for that local identifier
     * 
     * This method can be very expensive so they should be used sparingly for batch lookup of all needed identifiers.
     * Clients should work in terms of local identifiers and call these methods only once after loading from and before
     * saving to persistent storage. If the attempt to lookup a cloud identifier for a given local identifier fails, the
     * error parameter will indicate the reason.
     * 
     * @param localIdentifiers The array of \c NSString instances whose cloud identifiers are to being requested.
     * 
     *                         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("cloudIdentifierMappingsForLocalIdentifiers:")
    public native NSDictionary<String, ? extends PHCloudIdentifierMapping> cloudIdentifierMappingsForLocalIdentifiers(
            @NotNull NSArray<String> localIdentifiers);

    /**
     * Returns a dictionary that maps each cloud identifier from the provided array to a PLLocalIdentifierMapping result
     * containing the local identifier found for that cloud identifier.
     * 
     * This method can be very expensive so they should be used sparingly for batch lookup of all needed identifiers.
     * Clients should work in terms of local identifiers and call these methods only once after loading from and before
     * saving to persistent storage. If the attempt to lookup a local identifier for a given cloud identifier fails, the
     * error parameter will indicate the reason.
     * 
     * @param cloudIdentifiers The array of \c PHCloudIdentifier instances whose local identifiers are to being
     *                         requested.
     * 
     *                         API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("localIdentifierMappingsForCloudIdentifiers:")
    public native NSDictionary<? extends PHCloudIdentifier, ? extends PHLocalIdentifierMapping> localIdentifierMappingsForCloudIdentifiers(
            @NotNull NSArray<? extends PHCloudIdentifier> cloudIdentifiers);

    /**
     * Prompt the user to update their limited library selection by presenting the limited library image picker when the
     * user has opted into limited library access mode (see \c PHAuthorizationStatusLimited )
     * 
     * Use this API when the user has enabled limited photo library access to present the limited library picker and
     * give the user a way to update their selection. If the user has not enabled limited library access mode for this
     * application, then this method will do nothing. This should be used when disabling the automatic limited library
     * alert prompt (by adding \c PHPhotoLibraryPreventAutomaticLimitedAccessAlert = \c YES to the application's
     * Info.plist).
     * 
     * In addition to being provided the new asset local identifiers in the callback any changes applied to the limited
     * library selection by the user will trigger a \c PHPhotoLibraryChangeObserver update that can be used to observe
     * the changes to the selection.
     * 
     * API-Since: 15.0
     * 
     * @param controller        The view controller that is used to present the limited library picker.
     * @param completionHandler The block that will be called upon the user finishing their selection. Only newly
     *                          selected assets will be provided to the block.
     */
    @Generated
    @Selector("presentLimitedLibraryPickerFromViewController:completionHandler:")
    public native void presentLimitedLibraryPickerFromViewControllerCompletionHandler(
            @NotNull UIViewController controller,
            @NotNull @ObjCBlock(name = "call_presentLimitedLibraryPickerFromViewControllerCompletionHandler") Block_presentLimitedLibraryPickerFromViewControllerCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentLimitedLibraryPickerFromViewControllerCompletionHandler {
        @Generated
        void call_presentLimitedLibraryPickerFromViewControllerCompletionHandler(@NotNull NSArray<String> arg0);
    }

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("currentChangeToken")
    public native PHPersistentChangeToken currentChangeToken();

    /**
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("fetchPersistentChangesSinceToken:error:")
    public native PHPersistentChangeFetchResult fetchPersistentChangesSinceTokenError(
            @NotNull PHPersistentChangeToken token, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
