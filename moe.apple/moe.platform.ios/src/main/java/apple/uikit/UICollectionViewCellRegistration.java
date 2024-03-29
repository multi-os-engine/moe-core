package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Cell Registration
 * 
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionViewCellRegistration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewCellRegistration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewCellRegistration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICollectionViewCellRegistration allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("cellClass")
    public native Class cellClass();

    @Nullable
    @Generated
    @Selector("cellNib")
    public native UINib cellNib();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Selector("configurationHandler")
    @ObjCBlock(name = "call_configurationHandler_ret")
    public native Block_configurationHandler_ret configurationHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configurationHandler_ret {
        @Generated
        void call_configurationHandler_ret(@NotNull UICollectionViewCell cell, @NotNull NSIndexPath indexPath,
                @NotNull @Mapped(ObjCObjectMapper.class) Object item);
    }

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
    public native UICollectionViewCellRegistration init();

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
    public static native UICollectionViewCellRegistration new_objc();

    @Generated
    @Selector("registrationWithCellClass:configurationHandler:")
    public static native UICollectionViewCellRegistration registrationWithCellClassConfigurationHandler(
            @NotNull Class cellClass,
            @NotNull @ObjCBlock(name = "call_registrationWithCellClassConfigurationHandler") Block_registrationWithCellClassConfigurationHandler configurationHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registrationWithCellClassConfigurationHandler {
        @Generated
        void call_registrationWithCellClassConfigurationHandler(@NotNull UICollectionViewCell cell,
                @NotNull NSIndexPath indexPath, @NotNull @Mapped(ObjCObjectMapper.class) Object item);
    }

    @Generated
    @Selector("registrationWithCellNib:configurationHandler:")
    public static native UICollectionViewCellRegistration registrationWithCellNibConfigurationHandler(
            @NotNull UINib cellNib,
            @NotNull @ObjCBlock(name = "call_registrationWithCellNibConfigurationHandler") Block_registrationWithCellNibConfigurationHandler configurationHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registrationWithCellNibConfigurationHandler {
        @Generated
        void call_registrationWithCellNibConfigurationHandler(@NotNull UICollectionViewCell cell,
                @NotNull NSIndexPath indexPath, @NotNull @Mapped(ObjCObjectMapper.class) Object item);
    }

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
