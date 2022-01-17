package apple.chip;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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

/**
 * Cluster Application Basic
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPApplicationBasic extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPApplicationBasic(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPApplicationBasic alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPApplicationBasic allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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
    @Selector("init")
    public native CHIPApplicationBasic init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPApplicationBasic initWithDeviceEndpointQueue(CHIPDevice device, char endpoint, NSObject queue);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CHIPApplicationBasic new_objc();

    @Generated
    @Selector("readAttributeApplicationIdWithResponseHandler:")
    public native void readAttributeApplicationIdWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeApplicationIdWithResponseHandler") Block_readAttributeApplicationIdWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApplicationIdWithResponseHandler {
        @Generated
        void call_readAttributeApplicationIdWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeApplicationNameWithResponseHandler:")
    public native void readAttributeApplicationNameWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeApplicationNameWithResponseHandler") Block_readAttributeApplicationNameWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApplicationNameWithResponseHandler {
        @Generated
        void call_readAttributeApplicationNameWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeCatalogVendorIdWithResponseHandler:")
    public native void readAttributeCatalogVendorIdWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeCatalogVendorIdWithResponseHandler") Block_readAttributeCatalogVendorIdWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCatalogVendorIdWithResponseHandler {
        @Generated
        void call_readAttributeCatalogVendorIdWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeClusterRevisionWithResponseHandler:")
    public native void readAttributeClusterRevisionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithResponseHandler") Block_readAttributeClusterRevisionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithResponseHandler {
        @Generated
        void call_readAttributeClusterRevisionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeProductIdWithResponseHandler:")
    public native void readAttributeProductIdWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeProductIdWithResponseHandler") Block_readAttributeProductIdWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeProductIdWithResponseHandler {
        @Generated
        void call_readAttributeProductIdWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeVendorIdWithResponseHandler:")
    public native void readAttributeVendorIdWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeVendorIdWithResponseHandler") Block_readAttributeVendorIdWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVendorIdWithResponseHandler {
        @Generated
        void call_readAttributeVendorIdWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeVendorNameWithResponseHandler:")
    public native void readAttributeVendorNameWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeVendorNameWithResponseHandler") Block_readAttributeVendorNameWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVendorNameWithResponseHandler {
        @Generated
        void call_readAttributeVendorNameWithResponseHandler(NSError error, NSDictionary<?, ?> values);
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
    @Selector("changeStatus:responseHandler:")
    public native void changeStatusResponseHandler(byte status,
            @ObjCBlock(name = "call_changeStatusResponseHandler") Block_changeStatusResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_changeStatusResponseHandler {
        @Generated
        void call_changeStatusResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeApplicationStatusWithResponseHandler:")
    public native void readAttributeApplicationStatusWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeApplicationStatusWithResponseHandler") Block_readAttributeApplicationStatusWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApplicationStatusWithResponseHandler {
        @Generated
        void call_readAttributeApplicationStatusWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }
}