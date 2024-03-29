package apple.oslog;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * OSLogMessageComponent
 * 
 * The message arguments for a particular entry. There is one
 * component for each placeholder in the formatString plus one
 * component for any text after the last placeholder.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("OSLog")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class OSLogMessageComponent extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected OSLogMessageComponent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native OSLogMessageComponent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native OSLogMessageComponent allocWithZone(VoidPtr zone);

    /**
     * [@property] argumentCategory
     * 
     * The type of argument corresponding to the placeholder; see
     * OSLogMessageComponentArgumentCategory.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("argumentCategory")
    @NInt
    public native long argumentCategory();

    /**
     * [@property] argumentDataValue
     * 
     * The argument as a sequence of bytes. Can be nil if the
     * argument cannot be decoded (for example, it could be
     * redacted), or if this is the last component.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("argumentDataValue")
    public native NSData argumentDataValue();

    /**
     * [@property] argumentDoubleValue
     * 
     * The argument as a double-precision floating point number; the
     * value is undefined if the argument cannot be decoded or if this
     * is the last component.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("argumentDoubleValue")
    public native double argumentDoubleValue();

    /**
     * [@property] argumentInt64Value
     * 
     * The argument as a 64-bit signed integer; the value is undefined
     * if it cannot be decoded or if this is the last component.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("argumentInt64Value")
    public native long argumentInt64Value();

    /**
     * [@property] argumentNumberValue
     * 
     * The argument as a number. Can be nil if the argument cannot
     * be decoded (for example, it could be redacted), or if this is
     * the last component.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("argumentNumberValue")
    public native NSNumber argumentNumberValue();

    /**
     * [@property] argumentStringValue
     * 
     * The argument as a string. Can be nil if the argument cannot
     * be decoded (for example, it could be redacted), or if this is
     * the last component.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("argumentStringValue")
    public native String argumentStringValue();

    /**
     * [@property] argumentUInt64Value
     * 
     * The argument as a 64-bit unsigned integer; the value is
     * undefined if the argument cannot be decoded or if this is the
     * last component.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("argumentUInt64Value")
    public native long argumentUInt64Value();

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] formatSubstring
     * 
     * The text immediately preceding a placeholder. This can be an
     * empty string if there is nothing between two placeholders, or
     * between the placeholder and the bounds of the string.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("formatSubstring")
    public native String formatSubstring();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native OSLogMessageComponent init();

    @Generated
    @Selector("initWithCoder:")
    public native OSLogMessageComponent initWithCoder(@NotNull NSCoder coder);

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
    public static native OSLogMessageComponent new_objc();

    /**
     * [@property] placeholder
     * 
     * The placeholder text. Is empty for is the last component.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("placeholder")
    public native String placeholder();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
