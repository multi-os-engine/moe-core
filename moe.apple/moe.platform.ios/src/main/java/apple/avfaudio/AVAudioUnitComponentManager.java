package apple.avfaudio;

import apple.NSObject;
import apple.audiotoolbox.struct.AudioComponentDescription;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
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
 * AVAudioUnitComponentManager
 * 
 * A singleton object that provides an easy way to find audio components that are
 * registered with the system.
 * 
 * AVAudioUnitComponentManager provides methods to search and query various information about the
 * audio components without opening them.
 * 
 * Currently audio components that are audio units can only be searched.
 * 
 * The class also supports predefined system tags and arbitrary user tags. Each audio unit can be
 * tagged as part of its definition. Refer to AudioComponent.h for more details. AudioUnit Hosts
 * such as Logic or GarageBand can present groupings of audio units based on the tags.
 * 
 * Searching for audio units can be done in various ways
 * - using a NSPredicate that contains search strings for tags or descriptions
 * - using a block to match on custom criteria
 * - using an AudioComponentDescription
 * 
 * API-Since: 9.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioUnitComponentManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioUnitComponentManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioUnitComponentManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioUnitComponentManager allocWithZone(VoidPtr zone);

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

    /**
     * componentsMatchingDescription:
     * 
     * returns an array of AVAudioUnitComponent objects that match the description.
     * 
     * This method provides a mechanism to search for AudioComponents using AudioComponentDescription
     * structure. The type, subtype and manufacturer fields are used to search for audio units. A
     * value of 0 for any of these fields is a wildcard and returns the first match found.
     */
    @NotNull
    @Generated
    @Selector("componentsMatchingDescription:")
    public native NSArray<? extends AVAudioUnitComponent> componentsMatchingDescription(
            @ByValue AudioComponentDescription desc);

    /**
     * componentsMatchingPredicate:
     * 
     * returns an array of AVAudioUnitComponent objects that match the search predicate.
     * 
     * AudioComponent's information or tags can be used to build a search criteria.
     * For example, "typeName CONTAINS 'Effect'" or tags IN {'Sampler', 'MIDI'}"
     */
    @NotNull
    @Generated
    @Selector("componentsMatchingPredicate:")
    public native NSArray<? extends AVAudioUnitComponent> componentsMatchingPredicate(@NotNull NSPredicate predicate);

    /**
     * componentsPassingTest:
     * 
     * returns an array of AVAudioUnitComponent objects that pass the user provided block method.
     * 
     * For each AudioComponent found by the manager, the block method will be called. If the return
     * value is YES then the AudioComponent is added to the resulting array else it will excluded.
     * This gives more control to the block provider to filter out the components returned.
     */
    @NotNull
    @Generated
    @Selector("componentsPassingTest:")
    public native NSArray<? extends AVAudioUnitComponent> componentsPassingTest(
            @NotNull @ObjCBlock(name = "call_componentsPassingTest") Block_componentsPassingTest testHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_componentsPassingTest {
        @Generated
        boolean call_componentsPassingTest(@NotNull AVAudioUnitComponent comp, @NotNull BoolPtr stop);
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
    public native AVAudioUnitComponentManager init();

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
    public static native AVAudioUnitComponentManager new_objc();

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
     * returns singleton instance of AVAudioUnitComponentManager
     */
    @NotNull
    @Generated
    @Selector("sharedAudioUnitComponentManager")
    public static native AVAudioUnitComponentManager sharedAudioUnitComponentManager();

    /**
     * returns the localized standard system tags defined by the audio unit(s).
     */
    @NotNull
    @Generated
    @Selector("standardLocalizedTagNames")
    public native NSArray<String> standardLocalizedTagNames();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * returns all tags associated with the current user as well as all system tags defined by
     * the audio unit(s).
     */
    @NotNull
    @Generated
    @Selector("tagNames")
    public native NSArray<String> tagNames();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
