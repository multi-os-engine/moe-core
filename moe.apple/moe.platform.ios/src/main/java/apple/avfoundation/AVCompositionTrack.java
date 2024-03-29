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

package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCompositionTrack extends AVAssetTrack {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCompositionTrack(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCompositionTrack alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCompositionTrack allocWithZone(VoidPtr zone);

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
    public static native AVCompositionTrack new_objc();

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
    @Selector("init")
    public native AVCompositionTrack init();

    /**
     * [@property] segments
     * 
     * Provides read-only access to the array of track segments, each an instance of AVCompositionTrackSegment.
     * 
     * Note that timeMapping.target.start of the first AVCompositionTrackSegment must be kCMTimeZero, and the
     * timeMapping.target.start of each subsequent AVCompositionTrackSegment must equal CMTimeRangeGetEnd(the previous
     * AVCompositionTrackSegment's timeMapping.target).
     * Use -validateTrackSegments:error: to perform a test to ensure that an array of AVCompositionTrackSegments
     * conforms to this rule.
     */
    @NotNull
    @Generated
    @Selector("segments")
    public native NSArray<? extends AVCompositionTrackSegment> segments();

    /**
     * segmentForTrackTime:
     * 
     * Supplies the AVCompositionTrackSegment from the segments array with a target timeRange that either contains the
     * specified track time or is the closest to it among the target timeRanges of the track's segments.
     * 
     * If the trackTime does not map to a sample presentation time (e.g. it's outside the track's timeRange), the
     * segment closest in time to the specified trackTime is returned.
     * 
     * @param trackTime
     *                  The trackTime for which an AVCompositionTrackSegment is requested.
     * @return An AVCompositionTrackSegment.
     */
    @Nullable
    @Generated
    @Selector("segmentForTrackTime:")
    public native AVCompositionTrackSegment segmentForTrackTime(@ByValue CMTime trackTime);

    /**
     * [@property] formatDescriptionReplacements
     * 
     * An array of AVCompositionTrackFormatDescriptionReplacement objects indicating original format descriptions and
     * their replacements.
     * 
     * The value of this property is an array of AVCompositionTrackFormatDescriptionReplacement objects, each of which
     * specifies an original format description together with its replacement format description (as specified by a
     * previous call to -replaceFormatDescription:withFormatDescription:). Only format descriptions that are to be
     * replaced will occur as the originalFormatDescription elements in the
     * AVCompositionTrackFormatDescriptionReplacement objects in this array.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("formatDescriptionReplacements")
    public native NSArray<? extends AVCompositionTrackFormatDescriptionReplacement> formatDescriptionReplacements();

    /**
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("associatedTracksOfType:")
    public native NSArray<? extends AVAssetTrack> associatedTracksOfType(@NotNull String trackAssociationType);

    @Generated
    @Selector("hasMediaCharacteristic:")
    public native boolean hasMediaCharacteristic(@NotNull String mediaCharacteristic);

    @NotNull
    @Generated
    @Selector("metadataForFormat:")
    public native NSArray<? extends AVMetadataItem> metadataForFormat(@NotNull String format);

    @Generated
    @Selector("samplePresentationTimeForTrackTime:")
    @ByValue
    public native CMTime samplePresentationTimeForTrackTime(@ByValue CMTime trackTime);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
