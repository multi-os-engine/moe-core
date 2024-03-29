package apple.cryptotokenkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * Represents parsed SmartCard ATR. Provides routine for parsing byte stream or NSData with binary ATR and accessors to
 * parsed ATR parts.
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKSmartCardATR extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TKSmartCardATR(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKSmartCardATR alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native TKSmartCardATR allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Full ATR as string of bytes
     */
    @NotNull
    @Generated
    @Selector("bytes")
    public native NSData bytes();

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

    /**
     * Just historical bytes of ATR, without Tck and interface bytes.
     */
    @NotNull
    @Generated
    @Selector("historicalBytes")
    public native NSData historicalBytes();

    /**
     * An array of TKCompactTLVRecord instances with TLV records parsed from historical bytes. If historical bytes are
     * not structured using Compact TLV encoding, nil is returned.
     * [@note] In case that ATR historical bytes begin with 0x00, the last three bytes (status indicator) are
     * automatically
     * appended into the returned records as if historical bytes would begin with 0x80 and 0x8 record is present
     * in historical bytes.
     */
    @Nullable
    @Generated
    @Selector("historicalRecords")
    public native NSArray<? extends TKCompactTLVRecord> historicalRecords();

    @Generated
    @Selector("init")
    public native TKSmartCardATR init();

    /**
     * Parses ATR from binary data block
     * 
     * @param bytes Data containing full valid ATR
     * @return Parsed ATR instance, or nil when #bytes do not contain valid ATR.
     */
    @Generated
    @Selector("initWithBytes:")
    public native TKSmartCardATR initWithBytes(@NotNull NSData bytes);

    /**
     * Parses ATR from stream.
     * 
     * @param source Provides one byte of ATR from the stream or -1 in case of an error
     * @return Parsed ATR instance, or nil when #source method failed or an invalid ATR is detected
     */
    @Generated
    @Selector("initWithSource:")
    public native TKSmartCardATR initWithSource(
            @NotNull @ObjCBlock(name = "call_initWithSource") Block_initWithSource source);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithSource {
        @Generated
        int call_initWithSource();
    }

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
     * Retrieves interface group with specified index.
     * 
     * @param index Index of the requested interface group. Indexing conforms to ISO7816-3, i.e. starts from 1.
     * @return Interface group with given index, or nil of no such group was present.
     */
    @Nullable
    @Generated
    @Selector("interfaceGroupAtIndex:")
    public native TKSmartCardATRInterfaceGroup interfaceGroupAtIndex(@NInt long index);

    /**
     * Retrieves interface group belonging to specified protocol.
     * 
     * @param protocol Protocol number for which the interface group is requested.
     */
    @Nullable
    @Generated
    @Selector("interfaceGroupForProtocol:")
    public native TKSmartCardATRInterfaceGroup interfaceGroupForProtocol(@NUInt long protocol);

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
    public static native TKSmartCardATR new_objc();

    /**
     * Array of NSNumber of protocols indicated in ATR, in the correct order (i.e. the default protocol comes first),
     * duplicates sorted out.
     */
    @NotNull
    @Generated
    @Selector("protocols")
    public native NSArray<? extends NSNumber> protocols();

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
