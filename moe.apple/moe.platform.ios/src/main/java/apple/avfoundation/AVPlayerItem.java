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
import apple.avfoundation.protocol.AVVideoCompositing;
import apple.coremedia.opaque.CMTimebaseRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.avkit.AVInterstitialTimeRange;
import apple.foundation.NSDictionary;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItem extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerItem allocWithZone(VoidPtr zone);

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
    public static native AVPlayerItem new_objc();

    /**
     * playerItemWithAsset:
     * 
     * Returns an instance of AVPlayerItem for playing an AVAsset.
     * 
     * Equivalent to +playerItemWithAsset:automaticallyLoadedAssetKeys:, passing @[ @"duration" ] as the value of
     * automaticallyLoadedAssetKeys.
     * 
     * @param asset
     * @return An instance of AVPlayerItem.
     */
    @Generated
    @Selector("playerItemWithAsset:")
    public static native AVPlayerItem playerItemWithAsset(@NotNull AVAsset asset);

    /**
     * playerItemWithAsset:automaticallyLoadedAssetKeys:
     * 
     * Returns an instance of AVPlayerItem for playing an AVAsset.
     * 
     * The value of each key in automaticallyLoadedAssetKeys will be automatically be loaded by the underlying AVAsset
     * before the receiver achieves the status AVPlayerItemStatusReadyToPlay; i.e. when the item is ready to play, the
     * value of -[[AVPlayerItem asset] statusOfValueForKey:error:] will be one of the terminal status values greater
     * than AVKeyValueStatusLoading.
     * 
     * API-Since: 7.0
     * 
     * @param asset
     * @param automaticallyLoadedAssetKeys
     *                                     An NSArray of NSStrings, each representing a property key defined by AVAsset.
     *                                     See AVAsset.h for property keys, e.g. duration.
     * @return An instance of AVPlayerItem.
     */
    @Generated
    @Selector("playerItemWithAsset:automaticallyLoadedAssetKeys:")
    public static native AVPlayerItem playerItemWithAssetAutomaticallyLoadedAssetKeys(@NotNull AVAsset asset,
            @Nullable NSArray<String> automaticallyLoadedAssetKeys);

    /**
     * playerItemWithURL:
     * 
     * Returns an instance of AVPlayerItem for playing a resource at the specified location.
     * 
     * Equivalent to +playerItemWithAsset:, passing [AVAsset assetWithURL:URL] as the value of asset.
     * 
     * @param URL
     * @return An instance of AVPlayerItem.
     */
    @Generated
    @Selector("playerItemWithURL:")
    public static native AVPlayerItem playerItemWithURL(@NotNull NSURL URL);

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
     * accessLog
     * 
     * Returns an object that represents a snapshot of the network access log. Can be nil.
     * 
     * An AVPlayerItemAccessLog provides methods to retrieve the network access log in a format suitable for
     * serialization.
     * If nil is returned then there is no logging information currently available for this AVPlayerItem.
     * An AVPlayerItemNewAccessLogEntryNotification will be posted when new logging information becomes available.
     * However, accessLog might already return a non-nil value even before the first notification is posted.
     * 
     * @return An autoreleased AVPlayerItemAccessLog instance.
     * 
     *         API-Since: 4.3
     */
    @Nullable
    @Generated
    @Selector("accessLog")
    public native AVPlayerItemAccessLog accessLog();

    /**
     * addMediaDataCollector:
     * 
     * Adds the specified instance of AVPlayerItemMediaDataCollector to the receiver's collection of
     * mediaDataCollectors.
     * 
     * This method may incur additional I/O to collect the requested media data asynchronously.
     * 
     * @param collector
     *                  An instance of AVPlayerItemMediaDataCollector
     * 
     *                  API-Since: 9.3
     */
    @Generated
    @Selector("addMediaDataCollector:")
    public native void addMediaDataCollector(@NotNull AVPlayerItemMediaDataCollector collector);

    /**
     * addOutput:
     * 
     * Adds the specified instance of AVPlayerItemOutput to the receiver's collection of outputs.
     * 
     * The class of AVPlayerItemOutput provided dictates the data structure that decoded samples are vended in.
     * 
     * When an AVPlayerItemOutput is associated with an AVPlayerItem, samples are provided for a media type in
     * accordance with the rules for mixing, composition, or exclusion that the AVPlayer honors among multiple enabled
     * tracks of that media type for its own rendering purposes. For example, video media will be composed according to
     * the instructions provided via AVPlayerItem.videoComposition, if present. Audio media will be mixed according to
     * the parameters provided via AVPlayerItem.audioMix, if present.
     * 
     * @param output
     *               An instance of AVPlayerItemOutput
     * 
     *               API-Since: 6.0
     */
    @Generated
    @Selector("addOutput:")
    public native void addOutput(@NotNull AVPlayerItemOutput output);

    /**
     * [@property] asset
     * 
     * Accessor for underlying AVAsset.
     */
    @NotNull
    @Generated
    @Selector("asset")
    public native AVAsset asset();

    /**
     * [@property] audioMix
     * 
     * Indicates the audio mix parameters to be applied during playback
     * 
     * The inputParameters of the AVAudioMix must have trackIDs that correspond to a track of the receiver's asset.
     * Otherwise they will be ignored. (See AVAudioMix.h for the declaration of AVAudioMixInputParameters and
     * AVPlayerItem's asset property.)
     */
    @Nullable
    @Generated
    @Selector("audioMix")
    public native AVAudioMix audioMix();

    /**
     * [@property] audioTimePitchAlgorithm
     * 
     * Indicates the processing algorithm used to manage audio pitch at varying rates and for scaled audio edits.
     * 
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchSpectral, are defined in
     * AVAudioProcessingSettings.h.
     * The default value for applications linked on or after iOS 15.0 or macOS 12.0 is
     * AVAudioTimePitchAlgorithmTimeDomain. For iOS versions prior to 15.0 the default value is
     * AVAudioTimePitchAlgorithmLowQualityZeroLatency.
     * For macOS versions prior to 12.0 the default value is AVAudioTimePitchAlgorithmSpectral.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("audioTimePitchAlgorithm")
    public native String audioTimePitchAlgorithm();

    /**
     * [@property] automaticallyLoadedAssetKeys
     * 
     * An array of property keys defined on AVAsset. The value of each key in the array is automatically loaded while
     * the receiver is being made ready to play.
     * 
     * The value of each key in automaticallyLoadedAssetKeys will be automatically be loaded by the underlying AVAsset
     * before the receiver achieves the status AVPlayerItemStatusReadyToPlay; i.e. when the item is ready to play, the
     * value of -[[AVPlayerItem asset] statusOfValueForKey:error:] will be AVKeyValueStatusLoaded. If loading of any of
     * the values fails, the status of the AVPlayerItem will change instead to AVPlayerItemStatusFailed..
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("automaticallyLoadedAssetKeys")
    public native NSArray<String> automaticallyLoadedAssetKeys();

    /**
     * For releases of macOS prior to 10.9 and releases of iOS prior to 7.0, indicates whether the item can be played at
     * rates greater than 1.0.
     * Starting with macOS 10.9 and iOS 7.0, all AVPlayerItems with status AVPlayerItemReadyToPlay can be played at
     * rates between 1.0 and 2.0, inclusive, even if canPlayFastForward is NO; for those releases canPlayFastForward
     * indicates whether the item can be played at rates greater than 2.0.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("canPlayFastForward")
    public native boolean canPlayFastForward();

    /**
     * indicates whether the item can be played at rates less than -1.0
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("canPlayFastReverse")
    public native boolean canPlayFastReverse();

    /**
     * indicates whether the item can be played at rate -1.0
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("canPlayReverse")
    public native boolean canPlayReverse();

    /**
     * indicates whether the item can be played at rates between 0.0 and 1.0
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("canPlaySlowForward")
    public native boolean canPlaySlowForward();

    /**
     * indicates whether the item can be played at rates less between 0.0 and -1.0
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("canPlaySlowReverse")
    public native boolean canPlaySlowReverse();

    /**
     * indicates whether the item supports stepping backward; see -stepByCount:. Once the item has become ready to play,
     * the value of canStepBackward does not change even when boundary conditions are reached, such as when the item's
     * currentTime is equal to kCMTimeZero.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("canStepBackward")
    public native boolean canStepBackward();

    /**
     * Indicates whether the item supports stepping forward; see -stepByCount:. Once the item has become ready to play,
     * the value of canStepForward does not change even when boundary conditions are reached, such as when the item's
     * currentTime is its end time.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("canStepForward")
    public native boolean canStepForward();

    /**
     * [@property] canUseNetworkResourcesForLiveStreamingWhilePaused
     * 
     * Indicates whether the player item can use network resources to keep playback state up to date while paused
     * 
     * For live streaming content, the player item may need to use extra networking and power resources to keep playback
     * state up to date when paused. For example, when this property is set to YES, the seekableTimeRanges property will
     * be periodically updated to reflect the current state of the live stream.
     * 
     * For clients linked on or after macOS 10.11 or iOS 9.0, the default value is NO. To minimize power usage, avoid
     * setting this property to YES when you do not need playback state to stay up to date while paused.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("canUseNetworkResourcesForLiveStreamingWhilePaused")
    public native boolean canUseNetworkResourcesForLiveStreamingWhilePaused();

    /**
     * cancelPendingSeeks
     * 
     * Cancel any pending seek requests and invoke the corresponding completion handlers if present.
     * 
     * Use this method to cancel and release the completion handlers of pending seeks. The finished parameter of the
     * completion handlers will
     * be set to NO.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("cancelPendingSeeks")
    public native void cancelPendingSeeks();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * currentDate
     * 
     * If currentTime is mapped to a particular (real-time) date, return that date.
     * 
     * @return Returns the date of current playback, or nil if playback is not mapped to any date.
     */
    @Nullable
    @Generated
    @Selector("currentDate")
    public native NSDate currentDate();

    /**
     * [@property] currentMediaSelection
     * 
     * Provides an instance of AVMediaSelection carrying current selections for each of the receiver's media selection
     * groups.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("currentMediaSelection")
    public native AVMediaSelection currentMediaSelection();

    /**
     * currentTime
     * 
     * Returns the current time of the item.
     * 
     * Returns the current time of the item. Not key-value observable; use -[AVPlayer
     * addPeriodicTimeObserverForInterval:queue:usingBlock:] instead.
     * 
     * @return A CMTime
     */
    @Generated
    @Selector("currentTime")
    @ByValue
    public native CMTime currentTime();

    /**
     * [@property] customVideoCompositor
     * 
     * Indicates the custom video compositor instance.
     * 
     * This property is nil if there is no video compositor, or if the internal video compositor is in use. This
     * reference can be used to provide extra context to the custom video compositor instance if required. The value of
     * this property can change as a result of setting the `videoComposition` property.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this property must be accessed on the main thread/queue.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("customVideoCompositor")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositing customVideoCompositor();

    /**
     * [@property] duration
     * 
     * Indicates the duration of the item, not considering either its forwardPlaybackEndTime or reversePlaybackEndTime.
     * 
     * This property is observable. The duration of an item can change dynamically during playback.
     * 
     * Unless you omit @"duration" from the array of asset keys you pass to
     * +playerItemWithAsset:automaticallyLoadedAssetKeys: or
     * -initWithAsset:automaticallyLoadedAssetKeys:, the value of this property will accord with the properties of the
     * underlying
     * AVAsset and the current state of playback once the receiver becomes ready to play.
     * 
     * Before the underlying duration has been loaded, the value of this property is kCMTimeIndefinite. Use key-value
     * observation to
     * obtain a valid duration as soon as it becomes available. (Note that the value of duration may remain
     * kCMTimeIndefinite,
     * e.g. for live streams.)
     * 
     * API-Since: 4.3
     */
    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    /**
     * [@property] error
     * 
     * If the receiver's status is AVPlayerItemStatusFailed, this describes the error that caused the failure.
     * 
     * The value of this property is an NSError that describes what caused the receiver to no longer be able to be
     * played.
     * If the receiver's status is not AVPlayerItemStatusFailed, the value of this property is nil.
     */
    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * errorLog
     * 
     * Returns an object that represents a snapshot of the error log. Can be nil.
     * 
     * An AVPlayerItemErrorLog provides methods to retrieve the error log in a format suitable for serialization.
     * If nil is returned then there is no logging information currently available for this AVPlayerItem.
     * 
     * @return An autoreleased AVPlayerItemErrorLog instance.
     * 
     *         API-Since: 4.3
     */
    @Nullable
    @Generated
    @Selector("errorLog")
    public native AVPlayerItemErrorLog errorLog();

    /**
     * [@property] forwardPlaybackEndTime
     * 
     * The end time for forward playback.
     * 
     * Specifies the time at which playback should end when the playback rate is positive (see AVPlayer's rate
     * property).
     * The default value is kCMTimeInvalid, which indicates that no end time for forward playback is specified.
     * In this case, the effective end time for forward playback is the receiver's duration.
     * 
     * When the end time is reached, the receiver will post AVPlayerItemDidPlayToEndTimeNotification and the AVPlayer
     * will take
     * the action indicated by the value of its actionAtItemEnd property (see AVPlayerActionAtItemEnd in AVPlayer.h).
     * 
     * The value of this property has no effect on playback when the rate is negative.
     */
    @Generated
    @Selector("forwardPlaybackEndTime")
    @ByValue
    public native CMTime forwardPlaybackEndTime();

    @Generated
    @Selector("init")
    public native AVPlayerItem init();

    /**
     * initWithAsset:
     * 
     * Initializes an AVPlayerItem with an AVAsset.
     * 
     * Equivalent to -initWithAsset:automaticallyLoadedAssetKeys:, passing @[ @"duration" ] as the value of
     * automaticallyLoadedAssetKeys.
     * 
     * @param asset
     * @return An instance of AVPlayerItem
     */
    @Generated
    @Selector("initWithAsset:")
    public native AVPlayerItem initWithAsset(@NotNull AVAsset asset);

    /**
     * initWithAsset:automaticallyLoadedAssetKeys:
     * 
     * Initializes an AVPlayerItem with an AVAsset.
     * 
     * The value of each key in automaticallyLoadedAssetKeys will be automatically be loaded by the underlying AVAsset
     * before the receiver achieves the status AVPlayerItemStatusReadyToPlay; i.e. when the item is ready to play, the
     * value of -[[AVPlayerItem asset] statusOfValueForKey:error:] will be one of the terminal status values greater
     * than AVKeyValueStatusLoading.
     * 
     * API-Since: 7.0
     * 
     * @param asset
     *                                     An instance of AVAsset.
     * @param automaticallyLoadedAssetKeys
     *                                     An NSArray of NSStrings, each representing a property key defined by AVAsset.
     *                                     See AVAsset.h for property keys, e.g. duration.
     * @return An instance of AVPlayerItem
     */
    @Generated
    @Selector("initWithAsset:automaticallyLoadedAssetKeys:")
    public native AVPlayerItem initWithAssetAutomaticallyLoadedAssetKeys(@NotNull AVAsset asset,
            @Nullable NSArray<String> automaticallyLoadedAssetKeys);

    /**
     * initWithURL:
     * 
     * Initializes an AVPlayerItem with an NSURL.
     * 
     * Equivalent to -initWithAsset:, passing [AVAsset assetWithURL:URL] as the value of asset.
     * 
     * @param URL
     * @return An instance of AVPlayerItem
     */
    @Generated
    @Selector("initWithURL:")
    public native AVPlayerItem initWithURL(@NotNull NSURL URL);

    /**
     * indicates that playback has consumed all buffered media and that playback will stall or end
     */
    @Generated
    @Selector("isPlaybackBufferEmpty")
    public native boolean isPlaybackBufferEmpty();

    /**
     * [@property] playbackBufferFull
     * 
     * Indicates that the internal media buffer is full and that further I/O is suspended.
     * 
     * This property reports that the data buffer used for playback has reach capacity.
     * Despite the playback buffer reaching capacity there might not exist sufficient statistical
     * data to support a playbackLikelyToKeepUp prediction of YES. See playbackLikelyToKeepUp above.
     */
    @Generated
    @Selector("isPlaybackBufferFull")
    public native boolean isPlaybackBufferFull();

    /**
     * [@property] playbackLikelyToKeepUp
     * 
     * Indicates whether the item will likely play through without stalling.
     * 
     * This property communicates a prediction of playability. Factors considered in this prediction
     * include I/O throughput and media decode performance. It is possible for playbackLikelyToKeepUp to
     * indicate NO while the property playbackBufferFull indicates YES. In this event the playback buffer has
     * reached capacity but there isn't the statistical data to support a prediction that playback is likely to
     * keep up. It is left to the application programmer to decide to continue media playback or not.
     * See playbackBufferFull below.
     */
    @Generated
    @Selector("isPlaybackLikelyToKeepUp")
    public native boolean isPlaybackLikelyToKeepUp();

    /**
     * [@property] loadedTimeRanges
     * 
     * This property provides a collection of time ranges for which the player has the media data readily available. The
     * ranges provided might be discontinuous.
     * 
     * Returns an NSArray of NSValues containing CMTimeRanges.
     */
    @NotNull
    @Generated
    @Selector("loadedTimeRanges")
    public native NSArray<? extends NSValue> loadedTimeRanges();

    /**
     * [@property] mediaDataCollectors
     * 
     * The collection of associated mediaDataCollectors.
     * 
     * API-Since: 9.3
     */
    @NotNull
    @Generated
    @Selector("mediaDataCollectors")
    public native NSArray<? extends AVPlayerItemMediaDataCollector> mediaDataCollectors();

    /**
     * [@property] outputs
     * 
     * The collection of associated outputs.
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("outputs")
    public native NSArray<? extends AVPlayerItemOutput> outputs();

    /**
     * [@property] preferredForwardBufferDuration
     * 
     * Indicates the media duration the caller prefers the player to buffer from the network ahead of the playhead to
     * guard against playback disruption.
     * 
     * The value is in seconds. If it is set to 0, the player will choose an appropriate level of buffering for most use
     * cases.
     * Note that setting this property to a low value will increase the chance that playback will stall and re-buffer,
     * while setting it to a high value will increase demand on system resources.
     * Note that the system may buffer less than the value of this property in order to manage resource consumption.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("preferredForwardBufferDuration")
    public native double preferredForwardBufferDuration();

    /**
     * [@property] preferredPeakBitRate
     * 
     * Indicates the desired limit of network bandwidth consumption for this item.
     * 
     * Set preferredPeakBitRate to non-zero to indicate that the player should attempt to limit item playback to that
     * bit rate, expressed in bits per second.
     * 
     * If network bandwidth consumption cannot be lowered to meet the preferredPeakBitRate, it will be reduced as much
     * as possible while continuing to play the item.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("preferredPeakBitRate")
    public native double preferredPeakBitRate();

    /**
     * [@property] presentationSize
     * 
     * The size of the receiver as presented by the player.
     * 
     * Indicates the size at which the visual portion of the item is presented by the player; can be scaled from this
     * size to fit within the bounds of an AVPlayerLayer via its videoGravity property. Can be scaled arbitrarily for
     * presentation
     * via the frame property of an AVPlayerLayer.
     * 
     * The value of this property will accord with the properties of the underlying media resource when the receiver
     * becomes ready to play.
     * Before the underlying media resource is sufficiently loaded, its value is CGSizeZero. Use key-value observation
     * to obtain a valid
     * presentationSize as soon as it becomes available. (Note that the value of presentationSize may remain CGSizeZero,
     * e.g. for audio-only items.)
     */
    @Generated
    @Selector("presentationSize")
    @ByValue
    public native CGSize presentationSize();

    /**
     * removeMediaDataCollector:
     * 
     * Removes the specified instance of AVPlayerItemMediaDataCollector from the receiver's collection of
     * mediaDataCollectors.
     * 
     * @param collector
     *                  An instance of AVPlayerItemMediaDataCollector
     * 
     *                  API-Since: 9.3
     */
    @Generated
    @Selector("removeMediaDataCollector:")
    public native void removeMediaDataCollector(@NotNull AVPlayerItemMediaDataCollector collector);

    /**
     * removeOutput:
     * 
     * Removes the specified instance of AVPlayerItemOutput from the receiver's collection of outputs.
     * 
     * @param output
     *               An instance of AVPlayerItemOutput
     * 
     *               API-Since: 6.0
     */
    @Generated
    @Selector("removeOutput:")
    public native void removeOutput(@NotNull AVPlayerItemOutput output);

    /**
     * [@property] reversePlaybackEndTime
     * 
     * The end time for reverse playback.
     * 
     * Specifies the time at which playback should end when the playback rate is negative (see AVPlayer's rate
     * property).
     * The default value is kCMTimeInvalid, which indicates that no end time for reverse playback is specified.
     * In this case, the effective end time for reverse playback is kCMTimeZero.
     * 
     * When the end time is reached, the receiver will post AVPlayerItemDidPlayToEndTimeNotification and the AVPlayer
     * will take
     * the action indicated by the value of its actionAtItemEnd property (see AVPlayerActionAtItemEnd in AVPlayer.h).
     * 
     * The value of this property has no effect on playback when the rate is positive.
     */
    @Generated
    @Selector("reversePlaybackEndTime")
    @ByValue
    public native CMTime reversePlaybackEndTime();

    /**
     * seekToDate
     * 
     * move playhead to a point corresponding to a particular date.
     * 
     * For playback content that is associated with a range of dates, move the
     * playhead to point within that range. Will fail if the supplied date is outside
     * the range or if the content is not associated with a range of dates.
     * 
     * @param date The new position for the playhead.
     * @return Returns true if the playhead was moved to the supplied date.
     * 
     *         API-Since: 4.0
     *         Deprecated-Since: 11.0
     *         Deprecated-Message: Use -seekToDate:completionHandler:, passing nil for the completionHandler if you
     *         don't require notification of completion
     */
    @Deprecated
    @Generated
    @Selector("seekToDate:")
    public native boolean seekToDate(@NotNull NSDate date);

    /**
     * seekToDate:completionHandler:
     * 
     * move playhead to a point corresponding to a particular date, and invokes the specified block when the seek
     * operation has either been completed or been interrupted.
     * 
     * For playback content that is associated with a range of dates, move the
     * playhead to point within that range and invokes the completion handler when the seek operation is complete.
     * Will fail if the supplied date is outside the range or if the content is not associated with a range of dates.
     * The completion handler for any prior seek request that is still in process will be invoked immediately with the
     * finished parameter
     * set to NO. If the new request completes without being interrupted by another seek request or by any other
     * operation, the specified
     * completion handler will be invoked with the finished parameter set to YES.
     * 
     * @param date              The new position for the playhead.
     * @param completionHandler The block to invoke when seek operation is complete
     * @return Returns true if the playhead was moved to the supplied date.
     * 
     *         API-Since: 6.0
     */
    @Generated
    @Selector("seekToDate:completionHandler:")
    public native boolean seekToDateCompletionHandler(@NotNull NSDate date,
            @Nullable @ObjCBlock(name = "call_seekToDateCompletionHandler") Block_seekToDateCompletionHandler completionHandler);

    /**
     * seekToTime:
     * 
     * Moves the playback cursor.
     * 
     * Use this method to seek to a specified time for the item.
     * The time seeked to may differ from the specified time for efficiency. For sample accurate seeking see
     * seekToTime:toleranceBefore:toleranceAfter:.
     * If the seek time is outside of seekable time ranges as indicated by seekableTimeRanges property, the seek request
     * will be cancelled.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use -seekToTime:completionHandler:, passing nil for the completionHandler if you don't
     * require notification of completion
     * 
     * @param time
     */
    @Deprecated
    @Generated
    @Selector("seekToTime:")
    public native void seekToTime(@ByValue CMTime time);

    /**
     * seekToTime:completionHandler:
     * 
     * Moves the playback cursor and invokes the specified block when the seek operation has either been completed or
     * been interrupted.
     * 
     * Use this method to seek to a specified time for the item and to be notified when the seek operation is complete.
     * The completion handler for any prior seek request that is still in process will be invoked immediately with the
     * finished parameter
     * set to NO. If the new request completes without being interrupted by another seek request or by any other
     * operation the specified
     * completion handler will be invoked with the finished parameter set to YES.
     * If the seek time is outside of seekable time ranges as indicated by seekableTimeRanges property, the seek request
     * will be cancelled and the completion handler will be invoked with the finished parameter set to NO.
     * 
     * This method throws an exception if time is invalid or indefinite.
     * 
     * API-Since: 5.0
     * 
     * @param time
     * @param completionHandler
     */
    @Generated
    @Selector("seekToTime:completionHandler:")
    public native void seekToTimeCompletionHandler(@ByValue CMTime time,
            @Nullable @ObjCBlock(name = "call_seekToTimeCompletionHandler") Block_seekToTimeCompletionHandler completionHandler);

    /**
     * seekToTime:toleranceBefore:toleranceAfter:
     * 
     * Moves the playback cursor within a specified time bound.
     * 
     * Use this method to seek to a specified time for the item.
     * The time seeked to will be within the range [time-toleranceBefore, time+toleranceAfter] and may differ from the
     * specified time for efficiency.
     * Pass kCMTimeZero for both toleranceBefore and toleranceAfter to request sample accurate seeking which may incur
     * additional decoding delay.
     * Messaging this method with beforeTolerance:kCMTimePositiveInfinity and afterTolerance:kCMTimePositiveInfinity is
     * the same as messaging seekToTime: directly.
     * Seeking is constrained by the collection of seekable time ranges. If you seek to a time outside all of the
     * seekable ranges the seek will result in a currentTime
     * within the seekable ranges.
     * If the seek time is outside of seekable time ranges as indicated by seekableTimeRanges property, the seek request
     * will be cancelled.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use -seekToTime:toleranceBefore:toleranceAfter:completionHandler:, passing nil for the
     * completionHandler if you don't require notification of completion
     * 
     * @param time
     * @param toleranceBefore
     * @param toleranceAfter
     */
    @Deprecated
    @Generated
    @Selector("seekToTime:toleranceBefore:toleranceAfter:")
    public native void seekToTimeToleranceBeforeToleranceAfter(@ByValue CMTime time, @ByValue CMTime toleranceBefore,
            @ByValue CMTime toleranceAfter);

    /**
     * seekToTime:toleranceBefore:toleranceAfter:completionHandler:
     * 
     * Moves the playback cursor within a specified time bound and invokes the specified block when the seek operation
     * has either been completed or been interrupted.
     * 
     * Use this method to seek to a specified time for the item and to be notified when the seek operation is complete.
     * The time seeked to will be within the range [time-toleranceBefore, time+toleranceAfter] and may differ from the
     * specified time for efficiency.
     * Pass kCMTimeZero for both toleranceBefore and toleranceAfter to request sample accurate seeking which may incur
     * additional decoding delay.
     * Messaging this method with beforeTolerance:kCMTimePositiveInfinity and afterTolerance:kCMTimePositiveInfinity is
     * the same as messaging seekToTime: directly.
     * The completion handler for any prior seek request that is still in process will be invoked immediately with the
     * finished parameter set to NO. If the new
     * request completes without being interrupted by another seek request or by any other operation the specified
     * completion handler will be invoked with the
     * finished parameter set to YES.
     * If the seek time is outside of seekable time ranges as indicated by seekableTimeRanges property, the seek request
     * will be cancelled and the completion handler will be invoked with the finished parameter set to NO.
     * 
     * This method throws an exception if time is invalid or indefinite or if tolerance before or tolerance after is
     * invalid or negative.
     * 
     * API-Since: 5.0
     * 
     * @param time
     * @param toleranceBefore
     * @param toleranceAfter
     * @param completionHandler
     */
    @Generated
    @Selector("seekToTime:toleranceBefore:toleranceAfter:completionHandler:")
    public native void seekToTimeToleranceBeforeToleranceAfterCompletionHandler(@ByValue CMTime time,
            @ByValue CMTime toleranceBefore, @ByValue CMTime toleranceAfter,
            @Nullable @ObjCBlock(name = "call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler") Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler completionHandler);

    /**
     * [@property] seekableTimeRanges
     * 
     * This property provides a collection of time ranges that the player item can seek to. The ranges provided might be
     * discontinous.
     * 
     * Returns an NSArray of NSValues containing CMTimeRanges.
     */
    @NotNull
    @Generated
    @Selector("seekableTimeRanges")
    public native NSArray<? extends NSValue> seekableTimeRanges();

    /**
     * [@property] seekingWaitsForVideoCompositionRendering
     * 
     * Indicates whether the item's timing follows the displayed video frame when seeking with a video composition
     * 
     * By default, item timing is updated as quickly as possible, not waiting for media at new times to be rendered when
     * seeking or
     * during normal playback. The latency that occurs, for example, between the completion of a seek operation and the
     * display of a
     * video frame at a new time is negligible in most situations. However, when video compositions are in use, the
     * processing of
     * video for any particular time may introduce noticeable latency. Therefore it may be desirable when a video
     * composition is in
     * use for the item's timing be updated only after the video frame for a time has been displayed. This allows, for
     * instance, an
     * AVSynchronizedLayer associated with an AVPlayerItem to remain in synchronization with the displayed video and for
     * the
     * currentTime property to return the time of the displayed video.
     * 
     * This property has no effect on items for which videoComposition is nil.
     * 
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("seekingWaitsForVideoCompositionRendering")
    public native boolean seekingWaitsForVideoCompositionRendering();

    /**
     * selectMediaOption:inMediaSelectionGroup:
     * 
     * Selects the media option described by the specified instance of AVMediaSelectionOption in the specified
     * AVMediaSelectionGroup and deselects all other options in that group.
     * 
     * If the specified media selection option isn't a member of the specified media selection group, no change in
     * presentation state will result.
     * If the value of the property allowsEmptySelection of the AVMediaSelectionGroup is YES, you can pass nil for
     * mediaSelectionOption to deselect
     * all media selection options in the group.
     * Note that if multiple options within a group meet your criteria for selection according to locale or other
     * considerations, and if these options are otherwise indistinguishable to you according to media characteristics
     * that are meaningful for your application, content is typically authored so that the first available option that
     * meets your criteria is appropriate for selection.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this method must be invoked on the main thread/queue.
     * 
     * API-Since: 5.0
     * 
     * @param mediaSelectionOption The option to select.
     * @param mediaSelectionGroup  The media selection group, obtained from the receiver's asset, that contains the
     *                             specified option.
     */
    @Generated
    @Selector("selectMediaOption:inMediaSelectionGroup:")
    public native void selectMediaOptionInMediaSelectionGroup(@Nullable AVMediaSelectionOption mediaSelectionOption,
            @NotNull AVMediaSelectionGroup mediaSelectionGroup);

    /**
     * selectMediaOptionAutomaticallyInMediaSelectionGroup:
     * 
     * Selects the media option in the specified media selection group that best matches the AVPlayer's current
     * automatic selection criteria. Also allows automatic selection to be re-applied to the specified group
     * subsequently if the relevant criteria are changed.
     * 
     * Has no effect unless the appliesMediaSelectionCriteriaAutomatically property of the associated AVPlayer is YES
     * and unless automatic media selection has previously been overridden via -[AVPlayerItem
     * selectMediaOption:inMediaSelectionGroup:].
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this method must be invoked on the main thread/queue.
     * 
     * API-Since: 7.0
     * 
     * @param mediaSelectionGroup The media selection group, obtained from the receiver's asset, that contains the
     *                            specified option.
     */
    @Generated
    @Selector("selectMediaOptionAutomaticallyInMediaSelectionGroup:")
    public native void selectMediaOptionAutomaticallyInMediaSelectionGroup(
            @NotNull AVMediaSelectionGroup mediaSelectionGroup);

    /**
     * selectedMediaOptionInMediaSelectionGroup:
     * 
     * Indicates the media selection option that's currently selected from the specified group. May be nil.
     * 
     * If the value of the property allowsEmptySelection of the AVMediaSelectionGroup is YES, the currently selected
     * option in the group may be nil.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use currentMediaSelection to obtain an instance of AVMediaSelection, which encompasses the
     * currently selected AVMediaSelectionOption in each of the available AVMediaSelectionGroups
     * 
     * @param mediaSelectionGroup A media selection group obtained from the receiver's asset.
     * @return An instance of AVMediaSelectionOption that describes the currently selection option in the group.
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("selectedMediaOptionInMediaSelectionGroup:")
    public native AVMediaSelectionOption selectedMediaOptionInMediaSelectionGroup(
            @NotNull AVMediaSelectionGroup mediaSelectionGroup);

    /**
     * [@property] audioMix
     * 
     * Indicates the audio mix parameters to be applied during playback
     * 
     * The inputParameters of the AVAudioMix must have trackIDs that correspond to a track of the receiver's asset.
     * Otherwise they will be ignored. (See AVAudioMix.h for the declaration of AVAudioMixInputParameters and
     * AVPlayerItem's asset property.)
     */
    @Generated
    @Selector("setAudioMix:")
    public native void setAudioMix(@Nullable AVAudioMix value);

    /**
     * [@property] audioTimePitchAlgorithm
     * 
     * Indicates the processing algorithm used to manage audio pitch at varying rates and for scaled audio edits.
     * 
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchSpectral, are defined in
     * AVAudioProcessingSettings.h.
     * The default value for applications linked on or after iOS 15.0 or macOS 12.0 is
     * AVAudioTimePitchAlgorithmTimeDomain. For iOS versions prior to 15.0 the default value is
     * AVAudioTimePitchAlgorithmLowQualityZeroLatency.
     * For macOS versions prior to 12.0 the default value is AVAudioTimePitchAlgorithmSpectral.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(@NotNull String value);

    /**
     * [@property] canUseNetworkResourcesForLiveStreamingWhilePaused
     * 
     * Indicates whether the player item can use network resources to keep playback state up to date while paused
     * 
     * For live streaming content, the player item may need to use extra networking and power resources to keep playback
     * state up to date when paused. For example, when this property is set to YES, the seekableTimeRanges property will
     * be periodically updated to reflect the current state of the live stream.
     * 
     * For clients linked on or after macOS 10.11 or iOS 9.0, the default value is NO. To minimize power usage, avoid
     * setting this property to YES when you do not need playback state to stay up to date while paused.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setCanUseNetworkResourcesForLiveStreamingWhilePaused:")
    public native void setCanUseNetworkResourcesForLiveStreamingWhilePaused(boolean value);

    /**
     * [@property] forwardPlaybackEndTime
     * 
     * The end time for forward playback.
     * 
     * Specifies the time at which playback should end when the playback rate is positive (see AVPlayer's rate
     * property).
     * The default value is kCMTimeInvalid, which indicates that no end time for forward playback is specified.
     * In this case, the effective end time for forward playback is the receiver's duration.
     * 
     * When the end time is reached, the receiver will post AVPlayerItemDidPlayToEndTimeNotification and the AVPlayer
     * will take
     * the action indicated by the value of its actionAtItemEnd property (see AVPlayerActionAtItemEnd in AVPlayer.h).
     * 
     * The value of this property has no effect on playback when the rate is negative.
     */
    @Generated
    @Selector("setForwardPlaybackEndTime:")
    public native void setForwardPlaybackEndTime(@ByValue CMTime value);

    /**
     * [@property] preferredForwardBufferDuration
     * 
     * Indicates the media duration the caller prefers the player to buffer from the network ahead of the playhead to
     * guard against playback disruption.
     * 
     * The value is in seconds. If it is set to 0, the player will choose an appropriate level of buffering for most use
     * cases.
     * Note that setting this property to a low value will increase the chance that playback will stall and re-buffer,
     * while setting it to a high value will increase demand on system resources.
     * Note that the system may buffer less than the value of this property in order to manage resource consumption.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setPreferredForwardBufferDuration:")
    public native void setPreferredForwardBufferDuration(double value);

    /**
     * [@property] preferredPeakBitRate
     * 
     * Indicates the desired limit of network bandwidth consumption for this item.
     * 
     * Set preferredPeakBitRate to non-zero to indicate that the player should attempt to limit item playback to that
     * bit rate, expressed in bits per second.
     * 
     * If network bandwidth consumption cannot be lowered to meet the preferredPeakBitRate, it will be reduced as much
     * as possible while continuing to play the item.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPreferredPeakBitRate:")
    public native void setPreferredPeakBitRate(double value);

    /**
     * [@property] reversePlaybackEndTime
     * 
     * The end time for reverse playback.
     * 
     * Specifies the time at which playback should end when the playback rate is negative (see AVPlayer's rate
     * property).
     * The default value is kCMTimeInvalid, which indicates that no end time for reverse playback is specified.
     * In this case, the effective end time for reverse playback is kCMTimeZero.
     * 
     * When the end time is reached, the receiver will post AVPlayerItemDidPlayToEndTimeNotification and the AVPlayer
     * will take
     * the action indicated by the value of its actionAtItemEnd property (see AVPlayerActionAtItemEnd in AVPlayer.h).
     * 
     * The value of this property has no effect on playback when the rate is positive.
     */
    @Generated
    @Selector("setReversePlaybackEndTime:")
    public native void setReversePlaybackEndTime(@ByValue CMTime value);

    /**
     * [@property] seekingWaitsForVideoCompositionRendering
     * 
     * Indicates whether the item's timing follows the displayed video frame when seeking with a video composition
     * 
     * By default, item timing is updated as quickly as possible, not waiting for media at new times to be rendered when
     * seeking or
     * during normal playback. The latency that occurs, for example, between the completion of a seek operation and the
     * display of a
     * video frame at a new time is negligible in most situations. However, when video compositions are in use, the
     * processing of
     * video for any particular time may introduce noticeable latency. Therefore it may be desirable when a video
     * composition is in
     * use for the item's timing be updated only after the video frame for a time has been displayed. This allows, for
     * instance, an
     * AVSynchronizedLayer associated with an AVPlayerItem to remain in synchronization with the displayed video and for
     * the
     * currentTime property to return the time of the displayed video.
     * 
     * This property has no effect on items for which videoComposition is nil.
     * 
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setSeekingWaitsForVideoCompositionRendering:")
    public native void setSeekingWaitsForVideoCompositionRendering(boolean value);

    /**
     * [@property] textStyleRules
     * 
     * An array of AVTextStyleRules representing text styling that can be applied to subtitles and other legible media.
     * 
     * The styling information contained in each AVTextStyleRule object in the array is used only when no equivalent
     * styling information is provided by the media resource being played. For example, if the text style rules specify
     * Courier font but the media resource specifies Helvetica font, the text will be drawn using Helvetica font.
     * 
     * This property has an effect only for tracks with media subtype kCMSubtitleFormatType_WebVTT.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setTextStyleRules:")
    public native void setTextStyleRules(@Nullable NSArray<? extends AVTextStyleRule> value);

    /**
     * [@property] videoComposition
     * 
     * Indicates the video composition settings to be applied during playback.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this property must be accessed on the main thread/queue.
     * 
     * This property throws an exception if a video composition is set with any of the following values:
     * - renderSize, renderScale, or frameDuration is less than or equal to zero
     * - sourceTrackIDForFrameTiming is less than or equal to zero
     * - uses AVVideoCompositionCoreAnimationTool (works for offline rendering only)
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setVideoComposition:")
    public native void setVideoComposition(@Nullable AVVideoComposition value);

    /**
     * [@property] status
     * 
     * The ability of the receiver to be used for playback.
     * 
     * The value of this property is an AVPlayerItemStatus that indicates whether the receiver can be used for playback.
     * When the value of this property is AVPlayerItemStatusFailed, the receiver can no longer be used for playback and
     * a new instance needs to be created in its place. When this happens, clients can check the value of the error
     * property to determine the nature of the failure. The value of this property will not be updated after the
     * receiver
     * is removed from an AVPlayer. This property is key value observable.
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    /**
     * stepByCount:
     * 
     * Moves player's current item's current time forward or backward by the specified number of steps.
     * 
     * The size of each step depends on the enabled AVPlayerItemTracks of the AVPlayerItem.
     * 
     * This method must be invoked on the main thread/queue.
     * 
     * @param stepCount
     *                  The number of steps by which to move. A positive number results in stepping forward, a negative
     *                  number in stepping backward.
     */
    @Generated
    @Selector("stepByCount:")
    public native void stepByCount(@NInt long stepCount);

    /**
     * [@property] textStyleRules
     * 
     * An array of AVTextStyleRules representing text styling that can be applied to subtitles and other legible media.
     * 
     * The styling information contained in each AVTextStyleRule object in the array is used only when no equivalent
     * styling information is provided by the media resource being played. For example, if the text style rules specify
     * Courier font but the media resource specifies Helvetica font, the text will be drawn using Helvetica font.
     * 
     * This property has an effect only for tracks with media subtype kCMSubtitleFormatType_WebVTT.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("textStyleRules")
    public native NSArray<? extends AVTextStyleRule> textStyleRules();

    /**
     * [@property] timebase
     * 
     * The item's timebase.
     * 
     * You can examine the timebase to discover the relationship between the item's time and the source clock used for
     * drift synchronization.
     * This timebase is read-only; you cannot set its time or rate to affect playback.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("timebase")
    public native CMTimebaseRef timebase();

    /**
     * [@property] timedMetadata
     * 
     * Provides an NSArray of AVMetadataItems representing the timed metadata encountered most recently within the media
     * as it plays. May be nil.
     * 
     * Notifications of changes are available via key-value observation.
     * As an optimization for playback, AVPlayerItem may omit the processing of timed metadata when no observer of this
     * property is registered. Therefore, when no such observer is registered, the value of the timedMetadata property
     * may remain nil regardless of the contents of the underlying media.
     * 
     * This property must be accessed on the main thread/queue.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use AVPlayerItemMetadataOutput to obtain timed metadata
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("timedMetadata")
    public native NSArray<? extends AVMetadataItem> timedMetadata();

    /**
     * [@property] tracks
     * 
     * Provides array of AVPlayerItem tracks. Observable (can change dynamically during playback).
     * 
     * The value of this property will accord with the properties of the underlying media resource when the receiver
     * becomes ready to play.
     * Before the underlying media resource has been sufficiently loaded, its value is an empty NSArray. Use key-value
     * observation to obtain
     * a valid array of tracks as soon as it becomes available.
     */
    @NotNull
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVPlayerItemTrack> tracks();

    /**
     * [@property] videoComposition
     * 
     * Indicates the video composition settings to be applied during playback.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this property must be accessed on the main thread/queue.
     * 
     * This property throws an exception if a video composition is set with any of the following values:
     * - renderSize, renderScale, or frameDuration is less than or equal to zero
     * - sourceTrackIDForFrameTiming is less than or equal to zero
     * - uses AVVideoCompositionCoreAnimationTool (works for offline rendering only)
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("videoComposition")
    public native AVVideoComposition videoComposition();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToDateCompletionHandler {
        @Generated
        void call_seekToDateCompletionHandler(boolean finished);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToTimeCompletionHandler {
        @Generated
        void call_seekToTimeCompletionHandler(boolean finished);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler {
        @Generated
        void call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler(boolean finished);
    }

    /**
     * [@property] preferredMaximumResolution
     * 
     * Indicates a preferred upper limit on the resolution of the video to be downloaded (or otherwise transferred) and
     * rendered by the player.
     * 
     * The default value is CGSizeZero, which indicates that the client enforces no limit on video resolution. Other
     * values indicate a preferred maximum video resolution.
     * It only applies to HTTP Live Streaming asset.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("preferredMaximumResolution")
    @ByValue
    public native CGSize preferredMaximumResolution();

    /**
     * [@property] preferredMaximumResolution
     * 
     * Indicates a preferred upper limit on the resolution of the video to be downloaded (or otherwise transferred) and
     * rendered by the player.
     * 
     * The default value is CGSizeZero, which indicates that the client enforces no limit on video resolution. Other
     * values indicate a preferred maximum video resolution.
     * It only applies to HTTP Live Streaming asset.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPreferredMaximumResolution:")
    public native void setPreferredMaximumResolution(@ByValue CGSize value);

    /**
     * [@property] videoApertureMode
     * 
     * Specifies the video aperture mode to apply during playback.
     * 
     * See AVVideoApertureMode constants defined in AVVideoSettings.h. Default is AVVideoApertureModeCleanAperture.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setVideoApertureMode:")
    public native void setVideoApertureMode(@NotNull String value);

    /**
     * [@property] videoApertureMode
     * 
     * Specifies the video aperture mode to apply during playback.
     * 
     * See AVVideoApertureMode constants defined in AVVideoSettings.h. Default is AVVideoApertureModeCleanAperture.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("videoApertureMode")
    public native String videoApertureMode();

    /**
     * [@property] automaticallyPreservesTimeOffsetFromLive
     * 
     * Indicates that after the player spends a period of time buffering media, it will skip forward if necessary to
     * restore the playhead's distance from the live edge of the presentation to what it was when buffering began.
     * 
     * If the value of this property is YES and the player must buffer media from the network in order to resume
     * playback, the player will seek forward if necessary before resuming playback to restore the position that the
     * playhead had when rebuffering began, relative to the end of the current AVPlayerItem's seekableTimeRange.
     * 
     * This behavior applies to media buffering that occurs as a consequence of starting playback, seeking, and
     * recovering from a playback stall.
     * 
     * Note that if the network cannot deliver media quickly enough to maintain the playback rate, playback may stall
     * interminably.
     * 
     * This property value has no effect if the asset is not a live stream. The default value of this property is NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("automaticallyPreservesTimeOffsetFromLive")
    public native boolean automaticallyPreservesTimeOffsetFromLive();

    /**
     * [@property] configuredTimeOffsetFromLive
     * 
     * Indicates how close to the latest content in a live stream playback will begin after a live start or a seek to
     * kCMTimePositiveInfinity.
     * 
     * For non-live assets this value is kCMTimeInvalid.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("configuredTimeOffsetFromLive")
    @ByValue
    public native CMTime configuredTimeOffsetFromLive();

    /**
     * [@property] audioSpatializationAllowed
     * 
     * Indicates whether audio spatialization is allowed
     * 
     * When audio spatialization is allowed for an AVPlayerItem, the AVPlayer may render multichannel audio if available
     * even if the output device doesn't support multichannel audio on its own, via use of a synthetic channel layout.
     * When audio spatialization is not allowed, the AVPlayer must render audio with a channel layout that best matches
     * the capabilities of the output device. This property is not observable. Defaults to YES.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("isAudioSpatializationAllowed")
    public native boolean isAudioSpatializationAllowed();

    /**
     * [@property] recommendedTimeOffsetFromLive
     * 
     * A recommended value for configuredTimeOffsetFromLive, based on observed network conditions.
     * 
     * For non-live assets this value is kCMTimeInvalid.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("recommendedTimeOffsetFromLive")
    @ByValue
    public native CMTime recommendedTimeOffsetFromLive();

    /**
     * [@property] audioSpatializationAllowed
     * 
     * Indicates whether audio spatialization is allowed
     * 
     * When audio spatialization is allowed for an AVPlayerItem, the AVPlayer may render multichannel audio if available
     * even if the output device doesn't support multichannel audio on its own, via use of a synthetic channel layout.
     * When audio spatialization is not allowed, the AVPlayer must render audio with a channel layout that best matches
     * the capabilities of the output device. This property is not observable. Defaults to YES.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("setAudioSpatializationAllowed:")
    public native void setAudioSpatializationAllowed(boolean value);

    /**
     * [@property] automaticallyPreservesTimeOffsetFromLive
     * 
     * Indicates that after the player spends a period of time buffering media, it will skip forward if necessary to
     * restore the playhead's distance from the live edge of the presentation to what it was when buffering began.
     * 
     * If the value of this property is YES and the player must buffer media from the network in order to resume
     * playback, the player will seek forward if necessary before resuming playback to restore the position that the
     * playhead had when rebuffering began, relative to the end of the current AVPlayerItem's seekableTimeRange.
     * 
     * This behavior applies to media buffering that occurs as a consequence of starting playback, seeking, and
     * recovering from a playback stall.
     * 
     * Note that if the network cannot deliver media quickly enough to maintain the playback rate, playback may stall
     * interminably.
     * 
     * This property value has no effect if the asset is not a live stream. The default value of this property is NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAutomaticallyPreservesTimeOffsetFromLive:")
    public native void setAutomaticallyPreservesTimeOffsetFromLive(boolean value);

    /**
     * [@property] configuredTimeOffsetFromLive
     * 
     * Indicates how close to the latest content in a live stream playback will begin after a live start or a seek to
     * kCMTimePositiveInfinity.
     * 
     * For non-live assets this value is kCMTimeInvalid.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setConfiguredTimeOffsetFromLive:")
    public native void setConfiguredTimeOffsetFromLive(@ByValue CMTime value);

    /**
     * [@property] externalMetadata
     * 
     * Supplements metadata contained in the asset.
     * 
     * AVPlayerViewController will publish this metadata as now playing info when
     * AVPlayerViewController.updatesNowPlayingInfoCenter is YES. In addition, some metadata items will be displayed in
     * the AVPlayerViewController UI.
     * 
     * - AVMetadataCommonIdentifierTitle
     * - AVMetadataIdentifieriTunesMetadataTrackSubTitle
     * - AVMetadataCommonIdentifierDescription
     * 
     * API-Since: 12.2
     */
    @NotNull
    @Generated
    @Selector("externalMetadata")
    public native NSArray<? extends AVMetadataItem> externalMetadata();

    /**
     * [@property] externalMetadata
     * 
     * Supplements metadata contained in the asset.
     * 
     * AVPlayerViewController will publish this metadata as now playing info when
     * AVPlayerViewController.updatesNowPlayingInfoCenter is YES. In addition, some metadata items will be displayed in
     * the AVPlayerViewController UI.
     * 
     * - AVMetadataCommonIdentifierTitle
     * - AVMetadataIdentifieriTunesMetadataTrackSubTitle
     * - AVMetadataCommonIdentifierDescription
     * 
     * API-Since: 12.2
     */
    @Generated
    @Selector("setExternalMetadata:")
    public native void setExternalMetadata(@NotNull NSArray<? extends AVMetadataItem> value);

    /**
     * [@property] allowedAudioSpatializationFormats
     * 
     * Indicates the source audio channel layouts allowed by the receiver for spatialization.
     * 
     * Spatialization uses psychoacoustic methods to create a more immersive audio rendering when the content is played
     * on specialized headphones and speaker arrangements. When an AVPlayerItem's allowedAudioSpatializationFormats
     * property is set to AVAudioSpatializationFormatMonoAndStereo the AVPlayer will attempt to spatialize content
     * tagged with a stereo channel layout, two-channel content with no layout specified as well as mono. It is
     * considered incorrect to render a binaural recording with spatialization. A binaural recording is captured using
     * two carefully placed microphones at each ear where the intent, when played on headphones, is to reproduce a
     * naturally occurring spatial effect. Content tagged with a binaural channel layout will ignore this property
     * value. When an AVPlayerItem's allowedAudioSpatializationFormats property is set to
     * AVAudioSpatializationFormatMultichannel the AVPlayer will attempt to spatialize any decodable multichannel
     * layout. Setting this property to AVAudioSpatializationFormatMonoStereoAndMultichannel indicates that the sender
     * allows the AVPlayer to spatialize any decodable mono, stereo or multichannel layout. This property is not
     * observable. The default value for this property with video content is
     * AVAudioSpatializationFormatMonoStereoAndMultichannel. Otherwise, audio only content default value is
     * AVAudioSpatializationFormatMultichannel.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowedAudioSpatializationFormats")
    @NUInt
    public native long allowedAudioSpatializationFormats();

    /**
     * [@property] allowedAudioSpatializationFormats
     * 
     * Indicates the source audio channel layouts allowed by the receiver for spatialization.
     * 
     * Spatialization uses psychoacoustic methods to create a more immersive audio rendering when the content is played
     * on specialized headphones and speaker arrangements. When an AVPlayerItem's allowedAudioSpatializationFormats
     * property is set to AVAudioSpatializationFormatMonoAndStereo the AVPlayer will attempt to spatialize content
     * tagged with a stereo channel layout, two-channel content with no layout specified as well as mono. It is
     * considered incorrect to render a binaural recording with spatialization. A binaural recording is captured using
     * two carefully placed microphones at each ear where the intent, when played on headphones, is to reproduce a
     * naturally occurring spatial effect. Content tagged with a binaural channel layout will ignore this property
     * value. When an AVPlayerItem's allowedAudioSpatializationFormats property is set to
     * AVAudioSpatializationFormatMultichannel the AVPlayer will attempt to spatialize any decodable multichannel
     * layout. Setting this property to AVAudioSpatializationFormatMonoStereoAndMultichannel indicates that the sender
     * allows the AVPlayer to spatialize any decodable mono, stereo or multichannel layout. This property is not
     * observable. The default value for this property with video content is
     * AVAudioSpatializationFormatMonoStereoAndMultichannel. Otherwise, audio only content default value is
     * AVAudioSpatializationFormatMultichannel.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowedAudioSpatializationFormats:")
    public native void setAllowedAudioSpatializationFormats(@NUInt long value);

    /**
     * [@property] startsOnFirstEligibleVariant
     * 
     * Directs the player to start playback with the first eligible variant that appears in the stream's master
     * playlist.
     * 
     * This property influences AVPlayer's algorithm for selecting which of the eligible variant streams in an HTTP Live
     * Streaming master playlist is selected when playback first begins.
     * In all cases, AVPlayer may switch to other variants during playback.
     * 
     * On releases prior to macOS 10.15, iOS 13, tvOS 13 and watchOS 6, AVPlayer starts HLS playback with the first
     * eligible variant in the master playlist.
     * On releases starting with macOS 10.15, iOS 13, tvOS 13 and watchOS 6, AVPlayer starts HLS playback by choosing an
     * initial variant that optimizes the startup experience.
     * On releases starting with macOS 11.0, iOS 14, tvOS 14 and watchOS 7, applications may set this property to YES to
     * request that AVPlayer use the previous behaviour of using the first eligible variant in the master playlist. This
     * would be appropriate, for example, for applications which wish to control initial variant selection by ordering
     * the variants in the master playlist.
     * 
     * Note that changing this property may impact stream startup performance and quality. In order to be effective this
     * property must be set before initial variant selection occurs.
     * This property only applies to HTTP Live Streaming assets. The default value of this property is NO.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setStartsOnFirstEligibleVariant:")
    public native void setStartsOnFirstEligibleVariant(boolean value);

    /**
     * [@property] startsOnFirstEligibleVariant
     * 
     * Directs the player to start playback with the first eligible variant that appears in the stream's master
     * playlist.
     * 
     * This property influences AVPlayer's algorithm for selecting which of the eligible variant streams in an HTTP Live
     * Streaming master playlist is selected when playback first begins.
     * In all cases, AVPlayer may switch to other variants during playback.
     * 
     * On releases prior to macOS 10.15, iOS 13, tvOS 13 and watchOS 6, AVPlayer starts HLS playback with the first
     * eligible variant in the master playlist.
     * On releases starting with macOS 10.15, iOS 13, tvOS 13 and watchOS 6, AVPlayer starts HLS playback by choosing an
     * initial variant that optimizes the startup experience.
     * On releases starting with macOS 11.0, iOS 14, tvOS 14 and watchOS 7, applications may set this property to YES to
     * request that AVPlayer use the previous behaviour of using the first eligible variant in the master playlist. This
     * would be appropriate, for example, for applications which wish to control initial variant selection by ordering
     * the variants in the master playlist.
     * 
     * Note that changing this property may impact stream startup performance and quality. In order to be effective this
     * property must be set before initial variant selection occurs.
     * This property only applies to HTTP Live Streaming assets. The default value of this property is NO.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("startsOnFirstEligibleVariant")
    public native boolean startsOnFirstEligibleVariant();

    /**
     * default is YES
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("appliesPerFrameHDRDisplayMetadata")
    public native boolean appliesPerFrameHDRDisplayMetadata();

    /**
     * default is YES
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAppliesPerFrameHDRDisplayMetadata:")
    public native void setAppliesPerFrameHDRDisplayMetadata(boolean value);

    /**
     * [@property] automaticallyHandlesInterstitialEvents
     * 
     * Allows interstitials to be played according to a schedule that's specified by server-side directives. The default
     * value is YES. A value of NO prevents automatic scheduling of future server-side interstitial events. Events
     * specified by an AVPlayerInterstitialEventController override server-side events, regardless of the value of this
     * property.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this property must be accessed on the main thread/queue.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("automaticallyHandlesInterstitialEvents")
    public native boolean automaticallyHandlesInterstitialEvents();

    @NotNull
    @Generated
    @Owned
    @Selector("copy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copy();

    /**
     * [@property] preferredMaximumResolutionForExpensiveNetworks
     * 
     * Indicates a preferred upper limit on the resolution of the video to be downloaded that applies only when the
     * download occurs over expensive networks.
     * 
     * The default value is CGSizeZero, which indicates that the client enforces no limit on video resolution. Other
     * values indicate a preferred maximum video resolution.
     * This limit applies only when streaming over an expensive network, such as when using a cellular data plan. (See
     * -[NWPath isExpensive])
     * 
     * It only applies to HTTP Live Streaming asset.
     * 
     * Note that preferredMaximumResolution still applies unconditionally. If
     * preferredMaximumResolutionForExpensiveNetworks is less restrictive (higher resolution)
     * than preferredMaximumResolution, preferredMaximumResolutionForExpensiveNetworks has no practical effect.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("preferredMaximumResolutionForExpensiveNetworks")
    @ByValue
    public native CGSize preferredMaximumResolutionForExpensiveNetworks();

    /**
     * [@property] preferredPeakBitRateForExpensiveNetworks
     * 
     * Indicates the desired limit of network bandwidth consumption for this item over expensive networks.
     * 
     * When preferredPeakBitRateForExpensiveNetworks is set to non-zero, the player will attempt to limit item playback
     * to that bit rate
     * when streaming over an expensive network, such as when using a cellular data plan. (See -[NWPath isExpensive])
     * 
     * If network bandwidth consumption cannot be lowered to meet the preferredPeakBitRateForExpensiveNetworks, it will
     * be reduced as much as possible while continuing to play the item.
     * 
     * Note that preferredPeakBitRate still applies unconditionally. If preferredPeakBitRateForExpensiveNetworks is less
     * restrictive (greater) than preferredPeakBitRate,
     * preferredPeakBitRateForExpensiveNetworks has no practical effect.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("preferredPeakBitRateForExpensiveNetworks")
    public native double preferredPeakBitRateForExpensiveNetworks();

    /**
     * [@property] automaticallyHandlesInterstitialEvents
     * 
     * Allows interstitials to be played according to a schedule that's specified by server-side directives. The default
     * value is YES. A value of NO prevents automatic scheduling of future server-side interstitial events. Events
     * specified by an AVPlayerInterstitialEventController override server-side events, regardless of the value of this
     * property.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this property must be accessed on the main thread/queue.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAutomaticallyHandlesInterstitialEvents:")
    public native void setAutomaticallyHandlesInterstitialEvents(boolean value);

    /**
     * [@property] preferredMaximumResolutionForExpensiveNetworks
     * 
     * Indicates a preferred upper limit on the resolution of the video to be downloaded that applies only when the
     * download occurs over expensive networks.
     * 
     * The default value is CGSizeZero, which indicates that the client enforces no limit on video resolution. Other
     * values indicate a preferred maximum video resolution.
     * This limit applies only when streaming over an expensive network, such as when using a cellular data plan. (See
     * -[NWPath isExpensive])
     * 
     * It only applies to HTTP Live Streaming asset.
     * 
     * Note that preferredMaximumResolution still applies unconditionally. If
     * preferredMaximumResolutionForExpensiveNetworks is less restrictive (higher resolution)
     * than preferredMaximumResolution, preferredMaximumResolutionForExpensiveNetworks has no practical effect.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPreferredMaximumResolutionForExpensiveNetworks:")
    public native void setPreferredMaximumResolutionForExpensiveNetworks(@ByValue CGSize value);

    /**
     * [@property] preferredPeakBitRateForExpensiveNetworks
     * 
     * Indicates the desired limit of network bandwidth consumption for this item over expensive networks.
     * 
     * When preferredPeakBitRateForExpensiveNetworks is set to non-zero, the player will attempt to limit item playback
     * to that bit rate
     * when streaming over an expensive network, such as when using a cellular data plan. (See -[NWPath isExpensive])
     * 
     * If network bandwidth consumption cannot be lowered to meet the preferredPeakBitRateForExpensiveNetworks, it will
     * be reduced as much as possible while continuing to play the item.
     * 
     * Note that preferredPeakBitRate still applies unconditionally. If preferredPeakBitRateForExpensiveNetworks is less
     * restrictive (greater) than preferredPeakBitRate,
     * preferredPeakBitRateForExpensiveNetworks has no practical effect.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPreferredPeakBitRateForExpensiveNetworks:")
    public native void setPreferredPeakBitRateForExpensiveNetworks(double value);

    /**
     * [@property] variantPreferences
     * 
     * Indicates preferences for variant switching.
     * 
     * Changing variant preferences during playback may result in a variant switch.
     * The default value is AVVariantPreferenceNone.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("setVariantPreferences:")
    public native void setVariantPreferences(@NUInt long value);

    /**
     * [@property] templatePlayerItem
     * 
     * If the item was created automatically according to a template item for looping, for interstitial playback, or for
     * other purposes, indicates the AVPlayerItem that was used as the template.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("templatePlayerItem")
    public native AVPlayerItem templatePlayerItem();

    /**
     * [@property] variantPreferences
     * 
     * Indicates preferences for variant switching.
     * 
     * Changing variant preferences during playback may result in a variant switch.
     * The default value is AVVariantPreferenceNone.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("variantPreferences")
    @NUInt
    public native long variantPreferences();

    /**
     * [@property] interstitialTimeRanges
     * 
     * An array of time ranges that identifies interstitial content. Each element specifies the time range of the media
     * occupied by the interstitials.
     * 
     * An interstitial time range identifies a range of an asset that is collapsed into a single dot on the timeline in
     * the user interface. Interstitial content is typically not related to the video being played (e.g.
     * advertisements). On iOS, interstitials must be defined by the stream, or by using an
     * AVPlayerInterstitialEventController.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("interstitialTimeRanges")
    public native NSArray<? extends AVInterstitialTimeRange> interstitialTimeRanges();

    /**
     * The current now playing info for the player item.
     * Setting the info to nil will clear it.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("nowPlayingInfo")
    public native NSDictionary<String, ?> nowPlayingInfo();

    /**
     * The current now playing info for the player item.
     * Setting the info to nil will clear it.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setNowPlayingInfo:")
    public native void setNowPlayingInfo(@Nullable NSDictionary<String, ?> value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
