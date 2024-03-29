package apple.coredata;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
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
 * API-Since: 13.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSBatchInsertRequest extends NSPersistentStoreRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected NSBatchInsertRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSBatchInsertRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSBatchInsertRequest allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("batchInsertRequestWithEntityName:objects:")
    public static native NSBatchInsertRequest batchInsertRequestWithEntityNameObjects(@NotNull String entityName,
            @NotNull NSArray<? extends NSDictionary<String, ?>> dictionaries);

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

    @Nullable
    @Generated
    @Selector("entity")
    public native NSEntityDescription entity();

    @NotNull
    @Generated
    @Selector("entityName")
    public native String entityName();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("init")
    public native NSBatchInsertRequest init();

    @Generated
    @Selector("initWithEntity:objects:")
    public native NSBatchInsertRequest initWithEntityObjects(@NotNull NSEntityDescription entity,
            @NotNull NSArray<? extends NSDictionary<String, ?>> dictionaries);

    @Generated
    @Selector("initWithEntityName:objects:")
    public native NSBatchInsertRequest initWithEntityNameObjects(@NotNull String entityName,
            @NotNull NSArray<? extends NSDictionary<String, ?>> dictionaries);

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
    public static native NSBatchInsertRequest new_objc();

    @Nullable
    @Generated
    @Selector("objectsToInsert")
    public native NSArray<? extends NSDictionary<String, ?>> objectsToInsert();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The type of result that should be returned from this request. Defaults to
     * NSBatchInsertRequestResultTypeStatusOnly
     */
    @Generated
    @Selector("resultType")
    @NUInt
    public native long resultType();

    @Generated
    @Selector("setObjectsToInsert:")
    public native void setObjectsToInsert(@Nullable NSArray<? extends NSDictionary<String, ?>> value);

    /**
     * The type of result that should be returned from this request. Defaults to
     * NSBatchInsertRequestResultTypeStatusOnly
     */
    @Generated
    @Selector("setResultType:")
    public native void setResultType(@NUInt long value);

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
     * API-Since: 14.0
     */
    @Generated
    @Selector("batchInsertRequestWithEntityName:dictionaryHandler:")
    public static native NSBatchInsertRequest batchInsertRequestWithEntityNameDictionaryHandler(
            @NotNull String entityName,
            @NotNull @ObjCBlock(name = "call_batchInsertRequestWithEntityNameDictionaryHandler") Block_batchInsertRequestWithEntityNameDictionaryHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_batchInsertRequestWithEntityNameDictionaryHandler {
        @Generated
        boolean call_batchInsertRequestWithEntityNameDictionaryHandler(
                @NotNull NSMutableDictionary<String, Object> obj);
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("batchInsertRequestWithEntityName:managedObjectHandler:")
    public static native NSBatchInsertRequest batchInsertRequestWithEntityNameManagedObjectHandler(
            @NotNull String entityName,
            @NotNull @ObjCBlock(name = "call_batchInsertRequestWithEntityNameManagedObjectHandler") Block_batchInsertRequestWithEntityNameManagedObjectHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_batchInsertRequestWithEntityNameManagedObjectHandler {
        @Generated
        boolean call_batchInsertRequestWithEntityNameManagedObjectHandler(@NotNull NSManagedObject obj);
    }

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("dictionaryHandler")
    @ObjCBlock(name = "call_dictionaryHandler_ret")
    public native Block_dictionaryHandler_ret dictionaryHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dictionaryHandler_ret {
        @Generated
        boolean call_dictionaryHandler_ret(@NotNull NSMutableDictionary<String, Object> arg0);
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithEntity:dictionaryHandler:")
    public native NSBatchInsertRequest initWithEntityDictionaryHandler(@NotNull NSEntityDescription entity,
            @NotNull @ObjCBlock(name = "call_initWithEntityDictionaryHandler") Block_initWithEntityDictionaryHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithEntityDictionaryHandler {
        @Generated
        boolean call_initWithEntityDictionaryHandler(@NotNull NSMutableDictionary<String, Object> obj);
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithEntity:managedObjectHandler:")
    public native NSBatchInsertRequest initWithEntityManagedObjectHandler(@NotNull NSEntityDescription entity,
            @NotNull @ObjCBlock(name = "call_initWithEntityManagedObjectHandler") Block_initWithEntityManagedObjectHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithEntityManagedObjectHandler {
        @Generated
        boolean call_initWithEntityManagedObjectHandler(@NotNull NSManagedObject obj);
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithEntityName:dictionaryHandler:")
    public native NSBatchInsertRequest initWithEntityNameDictionaryHandler(@NotNull String entityName,
            @NotNull @ObjCBlock(name = "call_initWithEntityNameDictionaryHandler") Block_initWithEntityNameDictionaryHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithEntityNameDictionaryHandler {
        @Generated
        boolean call_initWithEntityNameDictionaryHandler(@NotNull NSMutableDictionary<String, Object> obj);
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithEntityName:managedObjectHandler:")
    public native NSBatchInsertRequest initWithEntityNameManagedObjectHandler(@NotNull String entityName,
            @NotNull @ObjCBlock(name = "call_initWithEntityNameManagedObjectHandler") Block_initWithEntityNameManagedObjectHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithEntityNameManagedObjectHandler {
        @Generated
        boolean call_initWithEntityNameManagedObjectHandler(@NotNull NSManagedObject obj);
    }

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("managedObjectHandler")
    @ObjCBlock(name = "call_managedObjectHandler_ret")
    public native Block_managedObjectHandler_ret managedObjectHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_managedObjectHandler_ret {
        @Generated
        boolean call_managedObjectHandler_ret(@NotNull NSManagedObject arg0);
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDictionaryHandler:")
    public native void setDictionaryHandler(
            @Nullable @ObjCBlock(name = "call_setDictionaryHandler") Block_setDictionaryHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDictionaryHandler {
        @Generated
        boolean call_setDictionaryHandler(@NotNull NSMutableDictionary<String, Object> arg0);
    }

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setManagedObjectHandler:")
    public native void setManagedObjectHandler(
            @Nullable @ObjCBlock(name = "call_setManagedObjectHandler") Block_setManagedObjectHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setManagedObjectHandler {
        @Generated
        boolean call_setManagedObjectHandler(@NotNull NSManagedObject arg0);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
