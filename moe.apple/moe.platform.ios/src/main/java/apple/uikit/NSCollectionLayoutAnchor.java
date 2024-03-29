package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCollectionLayoutAnchor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCollectionLayoutAnchor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCollectionLayoutAnchor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSCollectionLayoutAnchor allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("edges")
    @NUInt
    public native long edges();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSCollectionLayoutAnchor init();

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
    @Selector("isAbsoluteOffset")
    public native boolean isAbsoluteOffset();

    @Generated
    @Selector("isFractionalOffset")
    public native boolean isFractionalOffset();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * +------------------+ +------+ +------------------+
     * | [.top, .leading] | |[.top]| | [.top,.trailing] |
     * +--+---------------+ +---+--+ +---------------+--+
     * | | |
     * v v v
     * +-----+----------------+-----+----------------+-----+
     * |~~~~~| |~~~~~| |~~~~~|
     * |~~~~~| |~~~~~| |~~~~~|
     * +-----+ +-----+ +-----+
     * | |
     * +-----+ +-----+
     * +--------------+ |~~~~~| |~~~~~| +-------------+
     * | [.leading] |--->|~~~~~| |~~~~~|<---| [.trailing] |
     * +--------------+ +-----+ +-----+ +-------------+
     * | |
     * +-----+ +-----+ +-----+
     * |~~~~~| |~~~~~| |~~~~~|
     * |~~~~~| |~~~~~| |~~~~~|
     * +-----+----------------+-----+----------------+-----+
     * ^ ^ ^
     * | | |
     * +---+---------------+ +----+----+ +--------------+----+
     * |[.bottom, .leading]| |[.bottom]| |[.bottom,.trailing]|
     * +-------------------+ +---------+ +-------------------+
     * 
     * Edges are specified as shown above.
     */
    @Generated
    @Selector("layoutAnchorWithEdges:")
    public static native NSCollectionLayoutAnchor layoutAnchorWithEdges(@NUInt long edges);

    /**
     * +-----+ +------------------------------------+
     * |~~~~~| | edges: [.top,.trailing] |
     * +----------------------------+~~~~~|<------+ unitOffset: CGPoint(x:0.5,y:-0.5) |
     * | |~~~~~| +------------------------------------+
     * | +--+--+
     * | |
     * | |
     * | |
     * | |
     * +-------------------------------+
     * 
     * To specify additional offsets, combine edges with absoluteOffset or unitOffset.
     */
    @Generated
    @Selector("layoutAnchorWithEdges:absoluteOffset:")
    public static native NSCollectionLayoutAnchor layoutAnchorWithEdgesAbsoluteOffset(@NUInt long edges,
            @ByValue CGPoint absoluteOffset);

    @Generated
    @Selector("layoutAnchorWithEdges:fractionalOffset:")
    public static native NSCollectionLayoutAnchor layoutAnchorWithEdgesFractionalOffset(@NUInt long edges,
            @ByValue CGPoint fractionalOffset);

    @Generated
    @Owned
    @Selector("new")
    public static native NSCollectionLayoutAnchor new_objc();

    @Generated
    @Selector("offset")
    @ByValue
    public native CGPoint offset();

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
