package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * A set of options to use when fetching changes from the server.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKSyncEngineFetchChangesOptions extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CKSyncEngineFetchChangesOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKSyncEngineFetchChangesOptions alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CKSyncEngineFetchChangesOptions allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    @Selector("init")
    public native CKSyncEngineFetchChangesOptions init();

    /**
     * Initializes a set of options with the specific scope.
     * If no scope is provided, the default scope will include everything.
     */
    @Generated
    @Selector("initWithScope:")
    public native CKSyncEngineFetchChangesOptions initWithScope(@Nullable CKSyncEngineFetchChangesScope scope);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CKSyncEngineFetchChangesOptions new_objc();

    /**
     * The operation group to use for the underlying operations when fetching changes.
     * 
     * You might set an operation group with a particular name in order to help you analyze telemetry in the CloudKit
     * Console.
     * If you don't provide an operation group, a default one will be created for you.
     */
    @Generated
    @Selector("operationGroup")
    @NotNull
    public native CKOperationGroup operationGroup();

    /**
     * A list of zones that should be prioritized over others while fetching changes.
     * 
     * `CKSyncEngine` will fetch changes for the zones in this list first before any other zones.
     * You might use this to prioritize a specific set of zones for initial sync.
     * You could also prioritize the object currently showing in the UI by putting it first in this list.
     * 
     * Any zones not included in this list will be prioritized in a default manner.
     * If a zone in this list has no changes to fetch, then that zone will be ignored.
     */
    @Generated
    @Selector("prioritizedZoneIDs")
    @NotNull
    public native NSArray<? extends CKRecordZoneID> prioritizedZoneIDs();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The scope in which to fetch changes from the server.
     */
    @Generated
    @Selector("scope")
    @NotNull
    public native CKSyncEngineFetchChangesScope scope();

    /**
     * The operation group to use for the underlying operations when fetching changes.
     * 
     * You might set an operation group with a particular name in order to help you analyze telemetry in the CloudKit
     * Console.
     * If you don't provide an operation group, a default one will be created for you.
     */
    @Generated
    @Selector("setOperationGroup:")
    public native void setOperationGroup(@NotNull CKOperationGroup value);

    /**
     * A list of zones that should be prioritized over others while fetching changes.
     * 
     * `CKSyncEngine` will fetch changes for the zones in this list first before any other zones.
     * You might use this to prioritize a specific set of zones for initial sync.
     * You could also prioritize the object currently showing in the UI by putting it first in this list.
     * 
     * Any zones not included in this list will be prioritized in a default manner.
     * If a zone in this list has no changes to fetch, then that zone will be ignored.
     */
    @Generated
    @Selector("setPrioritizedZoneIDs:")
    public native void setPrioritizedZoneIDs(@NotNull NSArray<? extends CKRecordZoneID> value);

    /**
     * The scope in which to fetch changes from the server.
     */
    @Generated
    @Selector("setScope:")
    public native void setScope(@NotNull CKSyncEngineFetchChangesScope value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}