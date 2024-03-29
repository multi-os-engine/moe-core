package apple.coreml;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MLModelCollection
 * 
 * A collection of models managed as part of Core ML Model Deployment.
 * 
 * API-Since: 14.0
 * Deprecated-Since: 100000.0
 * Deprecated-Message: Use Background Assets or NSURLSession instead.
 */
@Deprecated
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLModelCollection extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MLModelCollection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLModelCollection alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLModelCollection allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Request access to a model collection. If the collection is not downloaded on the device, it is requested
     * from Core ML Model Deployment.
     * 
     * When called, this method downloads the model collection if it is not already on the device. Once
     * all models are downloaded, an MLModelCollection instance is made available for use with the completion handler.
     * 
     * @param identifier        The model collection identifier, as managed in Core ML Model Deployment.
     * @param completionHandler The completion handler, invoked with a valid MLModelCollection instance on success or
     *                          NSError on failure.
     * @return NSProgress for updates during setup and download of the model collection
     * 
     *         API-Since: 14.0
     *         Deprecated-Since: 100000.0
     *         Deprecated-Message: Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("beginAccessingModelCollectionWithIdentifier:completionHandler:")
    public static native NSProgress beginAccessingModelCollectionWithIdentifierCompletionHandler(
            @NotNull String identifier,
            @NotNull @ObjCBlock(name = "call_beginAccessingModelCollectionWithIdentifierCompletionHandler") Block_beginAccessingModelCollectionWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_beginAccessingModelCollectionWithIdentifierCompletionHandler {
        @Generated
        void call_beginAccessingModelCollectionWithIdentifierCompletionHandler(
                @Nullable MLModelCollection modelCollection, @Nullable NSError error);
    }

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

    /**
     * The identifier for the currently downloaded deployment, corresponding to a recent deployment on the Core ML Model
     * Deployment dashboard.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("deploymentID")
    public native String deploymentID();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * End access to a model collection. This informs the system you have finished accessing the models within the
     * collection.
     * 
     * Call this method as soon as you have finished using the models in this collection.
     * 
     * @param identifier        The model collection identifier, as managed in Core ML Model Deployment.
     * @param completionHandler The completion handler, invoked with YES on success or NSError on failure.
     * 
     *                          API-Since: 14.0
     *                          Deprecated-Since: 100000.0
     *                          Deprecated-Message: Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @Generated
    @Selector("endAccessingModelCollectionWithIdentifier:completionHandler:")
    public static native void endAccessingModelCollectionWithIdentifierCompletionHandler(@NotNull String identifier,
            @NotNull @ObjCBlock(name = "call_endAccessingModelCollectionWithIdentifierCompletionHandler") Block_endAccessingModelCollectionWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_endAccessingModelCollectionWithIdentifierCompletionHandler {
        @Generated
        void call_endAccessingModelCollectionWithIdentifierCompletionHandler(boolean success, @Nullable NSError error);
    }

    /**
     * Information about the models downloaded in the collection, or an empty dictionary if the collection has not been
     * downloaded.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("entries")
    public native NSDictionary<String, ? extends MLModelCollectionEntry> entries();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The identifier of the model collection you want to access, as configured in the Core ML Model Deployment
     * dashboard.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native MLModelCollection init();

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
    public static native MLModelCollection new_objc();

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
