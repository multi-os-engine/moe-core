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
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mediatoolbox.opaque.MTAudioProcessingTapRef;
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

/**
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMutableAudioMixInputParameters extends AVAudioMixInputParameters {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableAudioMixInputParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableAudioMixInputParameters alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMutableAudioMixInputParameters allocWithZone(VoidPtr zone);

    /**
     * audioMixInputParameters
     * 
     * Returns a new instance of AVMutableAudioMixInputParameters with no volume ramps and a trackID initialized to
     * kCMPersistentTrackID_Invalid.
     */
    @Generated
    @Selector("audioMixInputParameters")
    public static native AVMutableAudioMixInputParameters audioMixInputParameters();

    /**
     * audioMixInputParametersWithTrack:
     * 
     * Returns a new instance of AVMutableAudioMixInputParameters with no volume ramps and a trackID set to the
     * specified track's trackID.
     * 
     * @param track
     *              A reference to an AVAssetTrack.
     */
    @Generated
    @Selector("audioMixInputParametersWithTrack:")
    public static native AVMutableAudioMixInputParameters audioMixInputParametersWithTrack(AVAssetTrack track);

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
    public static native AVMutableAudioMixInputParameters new_objc();

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

    /**
     * [@property] audioTapProcessor
     * 
     * Indicates the audio processing tap that will be used for the audio track.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("audioTapProcessor")
    public native MTAudioProcessingTapRef audioTapProcessor();

    /**
     * [@property] audioTimePitchAlgorithm
     * 
     * Indicates the processing algorithm used to manage audio pitch at varying rates and for scaled audio edits.
     * 
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchSpectral, are defined in
     * AVAudioProcessingSettings.h.
     * Can be nil, in which case the audioTimePitchAlgorithm set on the AVPlayerItem, AVAssetExportSession, or
     * AVAssetReaderAudioMixOutput on which the AVAudioMix is set will be used for the associated track.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("audioTimePitchAlgorithm")
    public native String audioTimePitchAlgorithm();

    @Generated
    @Selector("init")
    public native AVMutableAudioMixInputParameters init();

    /**
     * [@property] audioTapProcessor
     * 
     * Indicates the audio processing tap that will be used for the audio track.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setAudioTapProcessor:")
    public native void setAudioTapProcessor(MTAudioProcessingTapRef value);

    /**
     * [@property] audioTimePitchAlgorithm
     * 
     * Indicates the processing algorithm used to manage audio pitch at varying rates and for scaled audio edits.
     * 
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchSpectral, are defined in
     * AVAudioProcessingSettings.h.
     * Can be nil, in which case the audioTimePitchAlgorithm set on the AVPlayerItem, AVAssetExportSession, or
     * AVAssetReaderAudioMixOutput on which the AVAudioMix is set will be used for the associated track.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(String value);

    /**
     * [@property] trackID
     * 
     * Indicates the trackID of the audio track to which the parameters should be applied.
     */
    @Generated
    @Selector("setTrackID:")
    public native void setTrackID(int value);

    /**
     * setVolume:atTime:
     * 
     * Sets the value of the audio volume at a specific time.
     * 
     * This method throws an exception if the time is not numeric.
     */
    @Generated
    @Selector("setVolume:atTime:")
    public native void setVolumeAtTime(float volume, @ByValue CMTime time);

    /**
     * setVolumeRampFromStartVolume:toEndVolume:timeRange:
     * 
     * Sets a volume ramp to apply during the specified timeRange.
     * 
     * This method throws an exception if the time range's start or duration is not numeric.
     */
    @Generated
    @Selector("setVolumeRampFromStartVolume:toEndVolume:timeRange:")
    public native void setVolumeRampFromStartVolumeToEndVolumeTimeRange(float startVolume, float endVolume,
            @ByValue CMTimeRange timeRange);

    /**
     * [@property] trackID
     * 
     * Indicates the trackID of the audio track to which the parameters should be applied.
     */
    @Generated
    @Selector("trackID")
    public native int trackID();
}
