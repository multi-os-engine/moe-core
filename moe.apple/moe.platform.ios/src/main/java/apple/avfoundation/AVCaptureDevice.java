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
import apple.avfoundation.struct.AVCaptureWhiteBalanceChromaticityValues;
import apple.avfoundation.struct.AVCaptureWhiteBalanceGains;
import apple.avfoundation.struct.AVCaptureWhiteBalanceTemperatureAndTintValues;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.corefoundation.struct.CGRect;

/**
 * AVCaptureDevice
 * 
 * An AVCaptureDevice represents a physical device that provides realtime input media data, such as video and audio.
 * 
 * Each instance of AVCaptureDevice corresponds to a device, such as a camera or microphone. Instances of
 * AVCaptureDevice cannot be created directly. An array of all currently available devices can also be obtained using
 * the AVCaptureDeviceDiscoverySession. Devices can provide one or more streams of a given media type. Applications can
 * search for devices matching desired criteria by using AVCaptureDeviceDiscoverySession, or may obtain a reference to
 * the default device matching desired criteria by using +[AVCaptureDevice
 * defaultDeviceWithDeviceType:mediaType:position:].
 * 
 * Instances of AVCaptureDevice can be used to provide media data to an AVCaptureSession by creating an
 * AVCaptureDeviceInput with the device and adding that to the capture session.
 * 
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureDevice extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureDevice alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureDevice allocWithZone(VoidPtr zone);

    /**
     * authorizationStatusForMediaType:
     * 
     * Returns the client's authorization status for accessing the underlying hardware that supports a given media type.
     * 
     * This method returns the AVAuthorizationStatus of the client for accessing the underlying hardware supporting the
     * media type. Media type constants are defined in AVMediaFormat.h. If any media type other than AVMediaTypeVideo or
     * AVMediaTypeAudio is supplied, an NSInvalidArgumentException will be thrown. If the status is
     * AVAuthorizationStatusNotDetermined, you may use the +requestAccessForMediaType:completionHandler: method to
     * request access by prompting the user.
     * 
     * API-Since: 7.0
     * 
     * @param mediaType
     *                  The media type, either AVMediaTypeVideo or AVMediaTypeAudio
     * @return
     *         The authorization status of the client
     */
    @Generated
    @Selector("authorizationStatusForMediaType:")
    @NInt
    public static native long authorizationStatusForMediaType(@NotNull String mediaType);

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

    /**
     * defaultDeviceWithDeviceType:mediaType:position:
     * 
     * Returns an AVCaptureDevice instance for the default device of the given device type, media type, and position.
     * 
     * This method returns the default device of the given combination of device type, media type, and position
     * currently available on the system.
     * 
     * API-Since: 10.0
     * 
     * @param deviceType
     *                   The device type supported by the returned device. It must be a valid AVCaptureDeviceType.
     * @param mediaType
     *                   The media type, such as AVMediaTypeVideo, AVMediaTypeAudio, or AVMediaTypeMuxed, supported by
     *                   the returned device. Pass nil to consider devices with any media type.
     * @param position
     *                   The position supported by the returned device. Pass AVCaptureDevicePositionUnspecified to
     *                   consider devices with any position.
     * @return
     *         The default device with the given device type, media type and position or nil if no device with that
     *         media type exists and nil otherwise.
     */
    @Nullable
    @Generated
    @Selector("defaultDeviceWithDeviceType:mediaType:position:")
    public static native AVCaptureDevice defaultDeviceWithDeviceTypeMediaTypePosition(@NotNull String deviceType,
            @Nullable String mediaType, @NInt long position);

    /**
     * defaultDeviceWithMediaType:
     * 
     * Returns an AVCaptureDevice instance for the default device of the given media type.
     * 
     * This method returns the default device of the given media type currently available on the system. For example,
     * for AVMediaTypeVideo, this method will return the built in camera that is primarily used for capture and
     * recording. Media type constants are defined in AVMediaFormat.h.
     * 
     * @param mediaType
     *                  The media type, such as AVMediaTypeVideo, AVMediaTypeAudio, or AVMediaTypeMuxed, supported by
     *                  the returned device.
     * @return
     *         The default device with the given media type, or nil if no device with that media type exists.
     */
    @Nullable
    @Generated
    @Selector("defaultDeviceWithMediaType:")
    public static native AVCaptureDevice defaultDeviceWithMediaType(@NotNull String mediaType);

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * deviceWithUniqueID:
     * 
     * Returns an AVCaptureDevice instance with the given unique ID.
     * 
     * Every available capture device has a unique ID that persists on one system across device connections and
     * disconnections, application restarts, and reboots of the system itself. This method can be used to recall or
     * track the status of a specific device whose unique ID has previously been saved.
     * 
     * @param deviceUniqueID
     *                       The unique ID of the device instance to be returned.
     * @return
     *         An AVCaptureDevice instance with the given unique ID, or nil if no device with that unique ID is
     *         available.
     */
    @Nullable
    @Generated
    @Selector("deviceWithUniqueID:")
    public static native AVCaptureDevice deviceWithUniqueID(@NotNull String deviceUniqueID);

    /**
     * devices
     * 
     * Returns an array of devices currently available for use as media input sources.
     * 
     * This method returns an array of AVCaptureDevice instances for input devices currently connected and available for
     * capture. The returned array contains all devices that are available at the time the method is called.
     * Applications should observe AVCaptureDeviceWasConnectedNotification and
     * AVCaptureDeviceWasDisconnectedNotification to be notified when the list of available devices has changed.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCaptureDeviceDiscoverySession instead.
     * 
     * @return
     *         An NSArray of AVCaptureDevice instances for each available device.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("devices")
    public static native NSArray<? extends AVCaptureDevice> devices();

    /**
     * devicesWithMediaType:
     * 
     * Returns an array of devices currently available for use as sources of media with the given media type.
     * 
     * This method returns an array of AVCaptureDevice instances for input devices currently connected and available for
     * capture that provide media of the given type. Media type constants are defined in AVMediaFormat.h. The returned
     * array contains all devices that are available at the time the method is called. Applications should observe
     * AVCaptureDeviceWasConnectedNotification and AVCaptureDeviceWasDisconnectedNotification to be notified when the
     * list of available devices has changed.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCaptureDeviceDiscoverySession instead.
     * 
     * @param mediaType
     *                  The media type, such as AVMediaTypeVideo, AVMediaTypeAudio, or AVMediaTypeMuxed, supported by
     *                  each returned device.
     * @return
     *         An NSArray of AVCaptureDevice instances for each available device.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("devicesWithMediaType:")
    public static native NSArray<? extends AVCaptureDevice> devicesWithMediaType(@NotNull String mediaType);

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
    public static native AVCaptureDevice new_objc();

    /**
     * requestAccessForMediaType:completionHandler:
     * 
     * Requests access to the underlying hardware for the media type, showing a dialog to the user if necessary.
     * 
     * Use this function to request access to the hardware for a given media type. Media type constants are defined in
     * AVMediaFormat.h. If any media type other than AVMediaTypeVideo or AVMediaTypeAudio is supplied, an
     * NSInvalidArgumentException will be thrown.
     * 
     * This call will not block while the user is being asked for access, allowing the client to continue running. Until
     * access has been granted, any AVCaptureDevices for the media type will vend silent audio samples or black video
     * frames. The user is only asked for permission the first time the client requests access. Later calls use the
     * permission granted by the user.
     * 
     * Note that the authorization dialog will automatically be shown if the status is
     * AVAuthorizationStatusNotDetermined when creating an AVCaptureDeviceInput.
     * 
     * Invoking this method with AVMediaTypeAudio is equivalent to calling -[AVAudioSession requestRecordPermission:].
     * 
     * The completion handler is called on an arbitrary dispatch queue. It is the client's responsibility to ensure that
     * any UIKit-related updates are called on the main queue or main thread as a result.
     * 
     * API-Since: 7.0
     * 
     * @param mediaType
     *                  The media type, either AVMediaTypeVideo or AVMediaTypeAudio
     * @param handler
     *                  A block called with the result of requesting access
     */
    @Generated
    @Selector("requestAccessForMediaType:completionHandler:")
    public static native void requestAccessForMediaTypeCompletionHandler(@NotNull String mediaType,
            @NotNull @ObjCBlock(name = "call_requestAccessForMediaTypeCompletionHandler") Block_requestAccessForMediaTypeCompletionHandler handler);

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
     * [@property] ISO
     * 
     * The current exposure ISO value.
     * 
     * This property controls the sensor's sensitivity to light by means of a gain value applied to the signal. Only ISO
     * values between activeFormat.minISO and activeFormat.maxISO are supported. Higher values will result in noisier
     * images. This property is key-value observable. It can be read at any time, regardless of exposure mode, but can
     * only be set via setExposureModeCustomWithDuration:ISO:completionHandler:.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("ISO")
    public native float ISO();

    /**
     * [@property] activeColorSpace
     * 
     * Indicates the receiver's current active color space.
     * 
     * By default, an AVCaptureDevice attached to an AVCaptureSession is automatically configured for wide color by the
     * AVCaptureSession (see AVCaptureSession automaticallyConfiguresCaptureDeviceForWideColor). You may also set the
     * activeColorSpace manually. To prevent the AVCaptureSession from undoing your work, remember to set
     * AVCaptureSession's automaticallyConfiguresCaptureDeviceForWideColor property to NO. Changing the receiver's
     * activeColorSpace while the session is running requires a disruptive reconfiguration of the capture render
     * pipeline. Movie captures in progress will be ended immediately; unfulfilled photo requests will be aborted; video
     * preview will temporarily freeze. -setActiveColorSpace: throws an NSGenericException if called without first
     * obtaining exclusive access to the receiver using -lockForConfiguration:.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("activeColorSpace")
    @NInt
    public native long activeColorSpace();

    /**
     * [@property] activeFormat
     * 
     * The currently active format of the receiver.
     * 
     * This property can be used to get or set the currently active device format.
     * 
     * -setActiveFormat: throws an NSInvalidArgumentException if set to a format not present in the formats array.
     * 
     * -setActiveFormat: throws an NSGenericException if called without first obtaining exclusive access to the receiver
     * using lockForConfiguration:.
     * 
     * Clients can observe automatic changes to the receiver's activeFormat by key value observing this property.
     * 
     * On iOS, use of AVCaptureDevice's setActiveFormat: and AVCaptureSession's setSessionPreset: are mutually
     * exclusive. If you set a capture device's active format, the session to which it is attached changes its preset to
     * AVCaptureSessionPresetInputPriority. Likewise if you set the AVCaptureSession's sessionPreset property, the
     * session assumes control of its input devices, and configures their activeFormat appropriately. Note that audio
     * devices do not expose any user-configurable formats on iOS. To configure audio input on iOS, you should use the
     * AVAudioSession APIs instead (see AVAudioSession.h).
     * 
     * The activeFormat, activeVideoMinFrameDuration, and activeVideoMaxFrameDuration properties may be set
     * simultaneously by using AVCaptureSession's begin/commitConfiguration methods:
     * 
     * [session beginConfiguration]; // the session to which the receiver's AVCaptureDeviceInput is added.
     * if ( [device lockForConfiguration:&error] ) {
     * [device setActiveFormat:newFormat];
     * [device setActiveVideoMinFrameDuration:newMinDuration];
     * [device setActiveVideoMaxFrameDuration:newMaxDuration];
     * [device unlockForConfiguration];
     * }
     * [session commitConfiguration]; // The new format and frame rates are applied together in commitConfiguration
     * 
     * Note that when configuring a session to use an active format intended for high resolution still photography and
     * applying one or more of the following operations to an AVCaptureVideoDataOutput, the system may not meet the
     * target framerate: zoom, orientation changes, format conversion.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("activeFormat")
    public native AVCaptureDeviceFormat activeFormat();

    /**
     * [@property] activeVideoMaxFrameDuration
     * 
     * A property indicating the receiver's current active maximum frame duration (the reciprocal of its min frame
     * rate).
     * 
     * An AVCaptureDevice's activeVideoMaxFrameDuration property is the reciprocal of its active minimum frame rate. To
     * limit the min frame rate of the capture device, clients may set this property to a value supported by the
     * receiver's activeFormat (see AVCaptureDeviceFormat's videoSupportedFrameRateRanges property). Clients may set
     * this property's value to kCMTimeInvalid to return activeVideoMaxFrameDuration to its default value for the given
     * activeFormat.
     * 
     * -setActiveVideoMaxFrameDuration: throws an NSInvalidArgumentException if set to an unsupported value.
     * 
     * -setActiveVideoMaxFrameDuration: throws an NSGenericException if called without first obtaining exclusive access
     * to the receiver using lockForConfiguration:.
     * 
     * Clients can observe automatic changes to the receiver's activeVideoMaxFrameDuration by key value observing this
     * property.
     * 
     * On iOS, the receiver's activeVideoMaxFrameDuration resets to its default value under the following conditions:
     * - The receiver's activeFormat changes
     * - The receiver's AVCaptureDeviceInput's session's sessionPreset changes
     * - The receiver's AVCaptureDeviceInput is added to a session
     * 
     * When exposureMode is AVCaptureExposureModeCustom, frame rate and exposure duration are interrelated. If you call
     * setExposureModeCustomWithDuration:ISO:completionHandler: with an exposureDuration longer than the current
     * activeVideoMaxFrameDuration, the activeVideoMaxFrameDuration will be lengthened to accommodate the longer
     * exposure time. Setting a shorter exposure duration does not automatically change the activeVideoMinFrameDuration
     * or activeVideoMaxFrameDuration. To explicitly increase the frame rate in custom exposure mode, you must set the
     * activeVideoMaxFrameDuration to a shorter value. If your new max frame duration is shorter than the current
     * exposureDuration, the exposureDuration will shorten as well to accommodate the new frame rate.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("activeVideoMaxFrameDuration")
    @ByValue
    public native CMTime activeVideoMaxFrameDuration();

    /**
     * [@property] activeVideoMinFrameDuration
     * 
     * A property indicating the receiver's current active minimum frame duration (the reciprocal of its max frame
     * rate).
     * 
     * An AVCaptureDevice's activeVideoMinFrameDuration property is the reciprocal of its active maximum frame rate. To
     * limit the max frame rate of the capture device, clients may set this property to a value supported by the
     * receiver's activeFormat (see AVCaptureDeviceFormat's videoSupportedFrameRateRanges property). Clients may set
     * this property's value to kCMTimeInvalid to return activeVideoMinFrameDuration to its default value for the given
     * activeFormat.
     * 
     * -setActiveVideoMinFrameDuration: throws an NSInvalidArgumentException if set to an unsupported value.
     * 
     * -setActiveVideoMinFrameDuration: throws an NSGenericException if called without first obtaining exclusive access
     * to the receiver using lockForConfiguration:.
     * 
     * Clients can observe automatic changes to the receiver's activeVideoMinFrameDuration by key value observing this
     * property.
     * 
     * On iOS, the receiver's activeVideoMinFrameDuration resets to its default value under the following conditions:
     * - The receiver's activeFormat changes
     * - The receiver's AVCaptureDeviceInput's session's sessionPreset changes
     * - The receiver's AVCaptureDeviceInput is added to a session
     * 
     * When exposureMode is AVCaptureExposureModeCustom, setting the activeVideoMinFrameDuration affects max frame rate,
     * but not exposureDuration. You may use setExposureModeCustomWithDuration:ISO:completionHandler: to set a shorter
     * exposureDuration than your activeVideoMinFrameDuration, if desired.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("activeVideoMinFrameDuration")
    @ByValue
    public native CMTime activeVideoMinFrameDuration();

    /**
     * [@property] autoFocusRangeRestriction
     * 
     * Indicates current restriction of the receiver's autofocus system to a particular range of focus scan, if it
     * supports range restrictions.
     * 
     * The value of this property is an AVCaptureAutoFocusRangeRestriction indicating how the autofocus system should
     * limit its focus scan. The default value is AVCaptureAutoFocusRangeRestrictionNone. -setAutoFocusRangeRestriction:
     * throws an NSInvalidArgumentException if isAutoFocusRangeRestrictionSupported returns NO.
     * -setAutoFocusRangeRestriction: throws an NSGenericException if called without first obtaining exclusive access to
     * the receiver using lockForConfiguration:. This property only has an effect when the focusMode property is set to
     * AVCaptureFocusModeAutoFocus or AVCaptureFocusModeContinuousAutoFocus. Note that setting autoFocusRangeRestriction
     * alone does not initiate a focus operation. After setting autoFocusRangeRestriction, call -setFocusMode: to apply
     * the new restriction.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("autoFocusRangeRestriction")
    @NInt
    public native long autoFocusRangeRestriction();

    /**
     * [@property] automaticallyAdjustsVideoHDREnabled
     * 
     * Indicates whether the receiver is allowed to turn high dynamic range streaming on or off.
     * 
     * The value of this property is a BOOL indicating whether the receiver is free to turn high dynamic range streaming
     * on or off. This property defaults to YES. When automaticallyAdjustsVideoHDREnabled, the AVCaptureDevice turns
     * videoHDR on automatically if it's a good fit for the activeFormat. -setAutomaticallyAdjustsVideoHDREnabled:
     * throws an NSGenericException if called without first obtaining exclusive access to the receiver using
     * -lockForConfiguration:. Clients can key-value observe videoHDREnabled to know when the receiver has automatically
     * changed the value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("automaticallyAdjustsVideoHDREnabled")
    public native boolean automaticallyAdjustsVideoHDREnabled();

    /**
     * [@property] automaticallyEnablesLowLightBoostWhenAvailable
     * 
     * Indicates whether the receiver should automatically switch to low light boost mode when necessary.
     * 
     * On a receiver where -isLowLightBoostSupported returns YES, a special low light boost mode may be engaged to
     * improve image quality. When the automaticallyEnablesLowLightBoostWhenAvailable property is set to YES, the
     * receiver switches at its discretion to a special boost mode under low light, and back to normal operation when
     * the scene becomes sufficiently lit. An AVCaptureDevice that supports this feature may only engage boost mode for
     * certain source formats or resolutions. Clients may observe changes to the lowLightBoostEnabled property to know
     * when the mode has engaged. The switch between normal operation and low light boost mode may drop one or more
     * video frames. The default value is NO. Setting this property throws an NSInvalidArgumentException if
     * -isLowLightBoostSupported returns NO. The receiver must be locked for configuration using lockForConfiguration:
     * before clients can set this method, otherwise an NSGenericException is thrown.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("automaticallyEnablesLowLightBoostWhenAvailable")
    public native boolean automaticallyEnablesLowLightBoostWhenAvailable();

    /**
     * cancelVideoZoomRamp
     * 
     * Eases out of any video zoom transitions initiated by rampToVideoZoomFactor:withRate:
     * 
     * This method is equivalent to calling rampToVideoZoomFactor:withRate: using the current zoom factor target and a
     * rate of 0. This allows a smooth stop to any changes in zoom which were in progress.
     * 
     * -cancelVideoZoomRamp: throws an NSGenericException if called without first obtaining exclusive access to the
     * receiver using lockForConfiguration:.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("cancelVideoZoomRamp")
    public native void cancelVideoZoomRamp();

    /**
     * chromaticityValuesForDeviceWhiteBalanceGains:
     * 
     * Converts device-specific white balance RGB gain values to device-independent chromaticity values.
     * 
     * This method may be called on the receiver to convert device-specific white balance RGB gain values to
     * device-independent chromaticity (little x, little y) values. For each channel in the whiteBalanceGains struct,
     * only values between 1.0 and -maxWhiteBalanceGain are supported. This method throws an NSRangeException if any of
     * the whiteBalanceGains are set to unsupported values.
     * 
     * API-Since: 8.0
     * 
     * @param whiteBalanceGains
     *                          White balance gain values, as described in the documentation for the
     *                          deviceWhiteBalanceGains property. A value of AVCaptureWhiteBalanceGainsCurrent may not
     *                          be used in this function.
     * @return
     *         A fully populated AVCaptureWhiteBalanceChromaticityValues structure containing device-independent values.
     */
    @Generated
    @Selector("chromaticityValuesForDeviceWhiteBalanceGains:")
    @ByValue
    public native AVCaptureWhiteBalanceChromaticityValues chromaticityValuesForDeviceWhiteBalanceGains(
            @ByValue AVCaptureWhiteBalanceGains whiteBalanceGains);

    /**
     * [@property] deviceType
     * 
     * The type of the capture device.
     * 
     * A capture device's type never changes.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("deviceType")
    public native String deviceType();

    /**
     * [@property] deviceWhiteBalanceGains
     * 
     * Indicates the current device-specific RGB white balance gain values in use.
     * 
     * This property specifies the current red, green, and blue gain values used for white balance. The values can be
     * used to adjust color casts for a given scene. For each channel, only values between 1.0 and -maxWhiteBalanceGain
     * are supported. This property is key-value observable. It can be read at any time, regardless of white balance
     * mode, but can only be set via setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("deviceWhiteBalanceGains")
    @ByValue
    public native AVCaptureWhiteBalanceGains deviceWhiteBalanceGains();

    /**
     * deviceWhiteBalanceGainsForChromaticityValues:
     * 
     * Converts device-independent chromaticity values to device-specific white balance RGB gain values.
     * 
     * This method may be called on the receiver to convert device-independent chromaticity values to device-specific
     * RGB white balance gain values. This method throws an NSRangeException if any of the chromaticityValues are set
     * outside the range [0,1]. Note that some x,y combinations yield out-of-range device RGB values that will cause an
     * exception to be thrown if passed directly to
     * -setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:. Be sure to check that red, green, and
     * blue gain values are within the range of [1.0 - maxWhiteBalanceGain].
     * 
     * API-Since: 8.0
     * 
     * @param chromaticityValues
     *                           Little x, little y chromaticity values as described in the documentation for
     *                           AVCaptureWhiteBalanceChromaticityValues.
     * @return
     *         A fully populated AVCaptureWhiteBalanceGains structure containing device-specific RGB gain values.
     */
    @Generated
    @Selector("deviceWhiteBalanceGainsForChromaticityValues:")
    @ByValue
    public native AVCaptureWhiteBalanceGains deviceWhiteBalanceGainsForChromaticityValues(
            @ByValue AVCaptureWhiteBalanceChromaticityValues chromaticityValues);

    /**
     * deviceWhiteBalanceGainsForTemperatureAndTintValues:
     * 
     * Converts device-independent temperature and tint values to device-specific white balance RGB gain values.
     * 
     * This method may be called on the receiver to convert device-independent temperature and tint values to
     * device-specific RGB white balance gain values. You may pass any temperature and tint values and corresponding
     * white balance gains will be produced. Note though that some temperature and tint combinations yield out-of-range
     * device RGB values that will cause an exception to be thrown if passed directly to
     * -setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:. Be sure to check that red, green, and
     * blue gain values are within the range of [1.0 - maxWhiteBalanceGain].
     * 
     * API-Since: 8.0
     * 
     * @param tempAndTintValues
     *                          Temperature and tint values as described in the documentation for
     *                          AVCaptureWhiteBalanceTemperatureAndTintValues.
     * @return
     *         A fully populated AVCaptureWhiteBalanceGains structure containing device-specific RGB gain values.
     */
    @Generated
    @Selector("deviceWhiteBalanceGainsForTemperatureAndTintValues:")
    @ByValue
    public native AVCaptureWhiteBalanceGains deviceWhiteBalanceGainsForTemperatureAndTintValues(
            @ByValue AVCaptureWhiteBalanceTemperatureAndTintValues tempAndTintValues);

    /**
     * [@property] exposureDuration
     * 
     * The length of time over which exposure takes place.
     * 
     * Only exposure duration values between activeFormat.minExposureDuration and activeFormat.maxExposureDuration are
     * supported. This property is key-value observable. It can be read at any time, regardless of exposure mode, but
     * can only be set via setExposureModeCustomWithDuration:ISO:completionHandler:.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("exposureDuration")
    @ByValue
    public native CMTime exposureDuration();

    /**
     * [@property] exposureMode
     * 
     * Indicates current exposure mode of the receiver, if it has adjustable exposure.
     * 
     * The value of this property is an AVCaptureExposureMode that determines the receiver's exposure mode, if it has
     * adjustable exposure. -setExposureMode: throws an NSInvalidArgumentException if set to an unsupported value (see
     * -isExposureModeSupported:). -setExposureMode: throws an NSGenericException if called without first obtaining
     * exclusive access to the receiver using lockForConfiguration:. When using AVCapturePhotoOutput and capturing
     * photos with AVCapturePhotoSettings' photoQualityPrioritization property set to
     * AVCapturePhotoQualityPrioritizationBalanced or higher, the receiver's ISO and exposureDuration values may be
     * overridden when exposing the photo if the scene is dark enough to warrant some form of multi-image fusion to
     * improve quality. To ensure that the receiver's ISO and exposureDuration values are honored while in
     * AVCaptureExposureModeCustom or AVCaptureExposureModeLocked, you must set your
     * AVCapturePhotoSettings.photoQualityPrioritization property to AVCapturePhotoQualityPrioritizationSpeed. The same
     * rule applies if you are using the deprecated AVCapturePhotoSettings.autoStillImageStabilizationEnabled property;
     * you must set it to NO to preserve your custom exposure values in the photo capture. Likewise if you're using
     * AVCaptureStillImageOutput, automaticallyEnablesStillImageStabilizationWhenAvailable must be set to NO to preserve
     * your custom exposure values in a still image capture. Clients can observe automatic changes to the receiver's
     * exposureMode by key value observing this property.
     */
    @Generated
    @Selector("exposureMode")
    @NInt
    public native long exposureMode();

    /**
     * [@property] exposurePointOfInterest
     * 
     * Indicates current exposure point of interest of the receiver, if it has one.
     * 
     * The value of this property is a CGPoint that determines the receiver's exposure point of interest, if it has
     * adjustable exposure. A value of (0,0) indicates that the camera should adjust exposure based on the top left
     * corner of the image, while a value of (1,1) indicates that it should adjust exposure based on the bottom right
     * corner. The default value is (0.5,0.5). -setExposurePointOfInterest: throws an NSInvalidArgumentException if
     * isExposurePointOfInterestSupported returns NO. -setExposurePointOfInterest: throws an NSGenericException if
     * called without first obtaining exclusive access to the receiver using lockForConfiguration:. Note that setting
     * exposurePointOfInterest alone does not initiate an exposure operation. After setting exposurePointOfInterest,
     * call -setExposureMode: to apply the new point of interest.
     */
    @Generated
    @Selector("exposurePointOfInterest")
    @ByValue
    public native CGPoint exposurePointOfInterest();

    /**
     * [@property] exposureTargetBias
     * 
     * Bias applied to the target exposure value, in EV units.
     * 
     * When exposureMode is AVCaptureExposureModeContinuousAutoExposure or AVCaptureExposureModeLocked, the bias will
     * affect both metering (exposureTargetOffset), and the actual exposure level (exposureDuration and ISO). When the
     * exposure mode is AVCaptureExposureModeCustom, it will only affect metering. This property is key-value
     * observable. It can be read at any time, but can only be set via setExposureTargetBias:completionHandler:.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("exposureTargetBias")
    public native float exposureTargetBias();

    /**
     * [@property] exposureTargetOffset
     * 
     * Indicates the metered exposure level's offset from the target exposure value, in EV units.
     * 
     * The value of this read-only property indicates the difference between the metered exposure level of the current
     * scene and the target exposure value. This property is key-value observable.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("exposureTargetOffset")
    public native float exposureTargetOffset();

    /**
     * [@property] flashMode
     * 
     * Indicates current mode of the receiver's flash, if it has one.
     * 
     * The value of this property is an AVCaptureFlashMode that determines the mode of the receiver's flash, if it has
     * one. -setFlashMode: throws an NSInvalidArgumentException if set to an unsupported value (see
     * -isFlashModeSupported:). -setFlashMode: throws an NSGenericException if called without first obtaining exclusive
     * access to the receiver using lockForConfiguration:. Clients can observe automatic changes to the receiver's
     * flashMode by key value observing this property.
     * 
     * When using AVCapturePhotoOutput, AVCaptureDevice's flashMode property is ignored. You specify flashMode on a per
     * photo basis by setting the AVCapturePhotoSettings.flashMode property.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCapturePhotoSettings.flashMode instead.
     */
    @Deprecated
    @Generated
    @Selector("flashMode")
    @NInt
    public native long flashMode();

    /**
     * [@property] focusMode
     * 
     * Indicates current focus mode of the receiver, if it has one.
     * 
     * The value of this property is an AVCaptureFocusMode that determines the receiver's focus mode, if it has one.
     * -setFocusMode: throws an NSInvalidArgumentException if set to an unsupported value (see -isFocusModeSupported:).
     * -setFocusMode: throws an NSGenericException if called without first obtaining exclusive access to the receiver
     * using lockForConfiguration:. Clients can observe automatic changes to the receiver's focusMode by key value
     * observing this property.
     */
    @Generated
    @Selector("focusMode")
    @NInt
    public native long focusMode();

    /**
     * [@property] focusPointOfInterest
     * 
     * Indicates current focus point of interest of the receiver, if it has one.
     * 
     * The value of this property is a CGPoint that determines the receiver's focus point of interest, if it has one. A
     * value of (0,0) indicates that the camera should focus on the top left corner of the image, while a value of (1,1)
     * indicates that it should focus on the bottom right. The default value is (0.5,0.5). -setFocusPointOfInterest:
     * throws an NSInvalidArgumentException if isFocusPointOfInterestSupported returns NO. -setFocusPointOfInterest:
     * throws an NSGenericException if called without first obtaining exclusive access to the receiver using
     * lockForConfiguration:. Clients can observe automatic changes to the receiver's focusPointOfInterest by key value
     * observing this property. Note that setting focusPointOfInterest alone does not initiate a focus operation. After
     * setting focusPointOfInterest, call -setFocusMode: to apply the new point of interest.
     */
    @Generated
    @Selector("focusPointOfInterest")
    @ByValue
    public native CGPoint focusPointOfInterest();

    /**
     * [@property] formats
     * 
     * An array of AVCaptureDeviceFormat objects supported by the receiver.
     * 
     * This property can be used to enumerate the formats natively supported by the receiver. The capture device's
     * activeFormat property may be set to one of the formats in this array. Clients can observe automatic changes to
     * the receiver's formats by key value observing this property.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("formats")
    public native NSArray<? extends AVCaptureDeviceFormat> formats();

    /**
     * [@property] grayWorldDeviceWhiteBalanceGains
     * 
     * Indicates the current device-specific Gray World RGB white balance gain values in use.
     * 
     * This property specifies the current red, green, and blue gain values derived from the current scene to deliver a
     * neutral (or "Gray World") white point for white balance. Gray World values assume a neutral subject (e.g. a gray
     * card) has been placed in the middle of the subject area and fills the center 50% of the frame. Clients can read
     * these values and apply them to the device using
     * setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:. For each channel, only values between
     * 1.0 and -maxWhiteBalanceGain are supported. This property is key-value observable. It can be read at any time,
     * regardless of white balance mode.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("grayWorldDeviceWhiteBalanceGains")
    @ByValue
    public native AVCaptureWhiteBalanceGains grayWorldDeviceWhiteBalanceGains();

    /**
     * [@property] hasFlash
     * 
     * Indicates whether the receiver has a flash.
     * 
     * The value of this property is a BOOL indicating whether the receiver has a flash. The receiver's flashMode
     * property can only be set when this property returns YES.
     */
    @Generated
    @Selector("hasFlash")
    public native boolean hasFlash();

    /**
     * hasMediaType:
     * 
     * Returns whether the receiver provides media with the given media type.
     * 
     * Media type constants are defined in AVMediaFormat.h.
     * 
     * @param mediaType
     *                  A media type, such as AVMediaTypeVideo, AVMediaTypeAudio, or AVMediaTypeMuxed.
     * @return
     *         YES if the device outputs the given media type, NO otherwise.
     */
    @Generated
    @Selector("hasMediaType:")
    public native boolean hasMediaType(@NotNull String mediaType);

    /**
     * [@property] hasTorch
     * 
     * Indicates whether the receiver has a torch.
     * 
     * The value of this property is a BOOL indicating whether the receiver has a torch. The receiver's torchMode
     * property can only be set when this property returns YES.
     */
    @Generated
    @Selector("hasTorch")
    public native boolean hasTorch();

    @Generated
    @Selector("init")
    public native AVCaptureDevice init();

    /**
     * [@property] adjustingExposure
     * 
     * Indicates whether the receiver is currently adjusting camera exposure.
     * 
     * The value of this property is a BOOL indicating whether the receiver's camera exposure is being automatically
     * adjusted because its exposure mode is AVCaptureExposureModeAutoExpose or
     * AVCaptureExposureModeContinuousAutoExposure. Clients can observe the value of this property to determine whether
     * the camera exposure is stable or is being automatically adjusted.
     */
    @Generated
    @Selector("isAdjustingExposure")
    public native boolean isAdjustingExposure();

    /**
     * [@property] adjustingFocus
     * 
     * Indicates whether the receiver is currently performing a focus scan to adjust focus.
     * 
     * The value of this property is a BOOL indicating whether the receiver's camera focus is being automatically
     * adjusted by means of a focus scan, because its focus mode is AVCaptureFocusModeAutoFocus or
     * AVCaptureFocusModeContinuousAutoFocus. Clients can observe the value of this property to determine whether the
     * camera's focus is stable.
     * 
     * @see lensPosition
     * @see AVCaptureAutoFocusSystem
     */
    @Generated
    @Selector("isAdjustingFocus")
    public native boolean isAdjustingFocus();

    /**
     * [@property] adjustingWhiteBalance
     * 
     * Indicates whether the receiver is currently adjusting camera white balance.
     * 
     * The value of this property is a BOOL indicating whether the receiver's camera white balance is being
     * automatically adjusted because its white balance mode is AVCaptureWhiteBalanceModeAutoWhiteBalance or
     * AVCaptureWhiteBalanceModeContinuousAutoWhiteBalance. Clients can observe the value of this property to determine
     * whether the camera white balance is stable or is being automatically adjusted.
     */
    @Generated
    @Selector("isAdjustingWhiteBalance")
    public native boolean isAdjustingWhiteBalance();

    /**
     * [@property] autoFocusRangeRestrictionSupported
     * 
     * Indicates whether the receiver supports autofocus range restrictions.
     * 
     * The receiver's autoFocusRangeRestriction property can only be set if this property returns YES.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isAutoFocusRangeRestrictionSupported")
    public native boolean isAutoFocusRangeRestrictionSupported();

    /**
     * [@property] connected
     * 
     * Indicates whether the device is connected and available to the system.
     * 
     * The value of this property is a BOOL indicating whether the device represented by the receiver is connected and
     * available for use as a capture device. Clients can key value observe the value of this property to be notified
     * when a device is no longer available. When the value of this property becomes NO for a given instance, it will
     * not become YES again. If the same physical device again becomes available to the system, it will be represented
     * using a new instance of AVCaptureDevice.
     */
    @Generated
    @Selector("isConnected")
    public native boolean isConnected();

    /**
     * isExposureModeSupported:
     * 
     * Returns whether the receiver supports the given exposure mode.
     * 
     * The receiver's exposureMode property can only be set to a certain mode if this method returns YES for that mode.
     * 
     * @param exposureMode
     *                     An AVCaptureExposureMode to be checked.
     * @return
     *         YES if the receiver supports the given exposure mode, NO otherwise.
     */
    @Generated
    @Selector("isExposureModeSupported:")
    public native boolean isExposureModeSupported(@NInt long exposureMode);

    /**
     * [@property] exposurePointOfInterestSupported:
     * 
     * Indicates whether the receiver supports exposure points of interest.
     * 
     * The receiver's exposurePointOfInterest property can only be set if this property returns YES.
     */
    @Generated
    @Selector("isExposurePointOfInterestSupported")
    public native boolean isExposurePointOfInterestSupported();

    /**
     * [@property] flashActive
     * 
     * Indicates whether the receiver's flash is currently active.
     * 
     * The value of this property is a BOOL indicating whether the receiver's flash is currently active. When the flash
     * is active, it will flash if a still image is captured. When a still image is captured with the flash active,
     * exposure and white balance settings are overridden for the still. This is true even when using
     * AVCaptureExposureModeCustom and/or AVCaptureWhiteBalanceModeLocked. This property is key-value observable.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCapturePhotoOutput's -isFlashScene instead.
     */
    @Deprecated
    @Generated
    @Selector("isFlashActive")
    public native boolean isFlashActive();

    /**
     * [@property] flashAvailable
     * 
     * Indicates whether the receiver's flash is currently available for use.
     * 
     * The value of this property is a BOOL indicating whether the receiver's flash is currently available. The flash
     * may become unavailable if, for example, the device overheats and needs to cool off. This property is key-value
     * observable.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("isFlashAvailable")
    public native boolean isFlashAvailable();

    /**
     * isFlashModeSupported:
     * 
     * Returns whether the receiver supports the given flash mode.
     * 
     * The receiver's flashMode property can only be set to a certain mode if this method returns YES for that mode.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCapturePhotoOutput's -supportedFlashModes instead.
     * 
     * @param flashMode
     *                  An AVCaptureFlashMode to be checked.
     * @return
     *         YES if the receiver supports the given flash mode, NO otherwise.
     */
    @Deprecated
    @Generated
    @Selector("isFlashModeSupported:")
    public native boolean isFlashModeSupported(@NInt long flashMode);

    /**
     * isFocusModeSupported:
     * 
     * Returns whether the receiver supports the given focus mode.
     * 
     * The receiver's focusMode property can only be set to a certain mode if this method returns YES for that mode.
     * 
     * @param focusMode
     *                  An AVCaptureFocusMode to be checked.
     * @return
     *         YES if the receiver supports the given focus mode, NO otherwise.
     */
    @Generated
    @Selector("isFocusModeSupported:")
    public native boolean isFocusModeSupported(@NInt long focusMode);

    /**
     * [@property] focusPointOfInterestSupported
     * 
     * Indicates whether the receiver supports focus points of interest.
     * 
     * The receiver's focusPointOfInterest property can only be set if this property returns YES.
     */
    @Generated
    @Selector("isFocusPointOfInterestSupported")
    public native boolean isFocusPointOfInterestSupported();

    /**
     * [@property] lockingFocusWithCustomLensPositionSupported
     * 
     * Indicates whether the receiver supports a lens position other than AVCaptureLensPositionCurrent.
     * 
     * If lockingFocusWithCustomLensPositionSupported returns NO, setFocusModeLockedWithLensPosition: may only be called
     * with AVCaptureLensPositionCurrent. Passing any other lens position will result in an exception.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("isLockingFocusWithCustomLensPositionSupported")
    public native boolean isLockingFocusWithCustomLensPositionSupported();

    /**
     * [@property] lockingWhiteBalanceWithCustomDeviceGainsSupported
     * 
     * Indicates whether the receiver supports white balance gains other than AVCaptureWhiteBalanceGainsCurrent.
     * 
     * If lockingWhiteBalanceWithCustomDeviceGainsSupported returns NO,
     * setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains: may only be called with AVCaptureWhiteBalanceGainsCurrent.
     * Passing any other white balance gains will result in an exception.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("isLockingWhiteBalanceWithCustomDeviceGainsSupported")
    public native boolean isLockingWhiteBalanceWithCustomDeviceGainsSupported();

    /**
     * [@property] lowLightBoostEnabled
     * 
     * Indicates whether the receiver's low light boost feature is enabled.
     * 
     * The value of this property is a BOOL indicating whether the receiver is currently enhancing images to improve
     * quality due to low light conditions. When -isLowLightBoostEnabled returns YES, the receiver has switched into a
     * special mode in which more light can be perceived in images. This property is key-value observable.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("isLowLightBoostEnabled")
    public native boolean isLowLightBoostEnabled();

    /**
     * [@property] lowLightBoostSupported
     * 
     * Indicates whether the receiver supports boosting images in low light conditions.
     * 
     * The receiver's automaticallyEnablesLowLightBoostWhenAvailable property can only be set if this property returns
     * YES.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("isLowLightBoostSupported")
    public native boolean isLowLightBoostSupported();

    /**
     * [@property] rampingVideoZoom
     * 
     * Indicates if the zoom factor is transitioning to a value set by rampToVideoZoomFactor:withRate:
     * 
     * Clients can observe this value to determine when a ramp begins or completes.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isRampingVideoZoom")
    public native boolean isRampingVideoZoom();

    /**
     * [@property] smoothAutoFocusEnabled
     * 
     * Indicates whether the receiver should use smooth autofocus.
     * 
     * On a receiver where -isSmoothAutoFocusSupported returns YES and smoothAutoFocusEnabled is set to YES, a smooth
     * autofocus will be engaged when the focus mode is set to AVCaptureFocusModeAutoFocus or
     * AVCaptureFocusModeContinuousAutoFocus. Enabling smooth autofocus is appropriate for movie recording. Smooth
     * autofocus is slower and less visually invasive. Disabling smooth autofocus is more appropriate for video
     * processing where a fast autofocus is necessary. The default value is NO. Setting this property throws an
     * NSInvalidArgumentException if -isSmoothAutoFocusSupported returns NO. The receiver must be locked for
     * configuration using lockForConfiguration: before clients can set this method, otherwise an NSGenericException is
     * thrown. Note that setting smoothAutoFocusEnabled alone does not initiate a focus operation. After setting
     * smoothAutoFocusEnabled, call -setFocusMode: to apply the new smooth autofocus mode.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isSmoothAutoFocusEnabled")
    public native boolean isSmoothAutoFocusEnabled();

    /**
     * [@property] smoothAutoFocusEnabled
     * 
     * Indicates whether the receiver should use smooth autofocus.
     * 
     * On a receiver where -isSmoothAutoFocusSupported returns YES and smoothAutoFocusEnabled is set to YES, a smooth
     * autofocus will be engaged when the focus mode is set to AVCaptureFocusModeAutoFocus or
     * AVCaptureFocusModeContinuousAutoFocus. Enabling smooth autofocus is appropriate for movie recording. Smooth
     * autofocus is slower and less visually invasive. Disabling smooth autofocus is more appropriate for video
     * processing where a fast autofocus is necessary. The default value is NO. Setting this property throws an
     * NSInvalidArgumentException if -isSmoothAutoFocusSupported returns NO. The receiver must be locked for
     * configuration using lockForConfiguration: before clients can set this method, otherwise an NSGenericException is
     * thrown. Note that setting smoothAutoFocusEnabled alone does not initiate a focus operation. After setting
     * smoothAutoFocusEnabled, call -setFocusMode: to apply the new smooth autofocus mode.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setSmoothAutoFocusEnabled:")
    public native void setSmoothAutoFocusEnabled(boolean value);

    /**
     * [@property] smoothAutoFocusSupported
     * 
     * Indicates whether the receiver supports smooth autofocus.
     * 
     * The receiver's smoothAutoFocusEnabled property can only be set if this property returns YES.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isSmoothAutoFocusSupported")
    public native boolean isSmoothAutoFocusSupported();

    /**
     * [@property] subjectAreaChangeMonitoringEnabled
     * 
     * Indicates whether the receiver should monitor the subject area for changes.
     * 
     * The value of this property is a BOOL indicating whether the receiver should monitor the video subject area for
     * changes, such as lighting changes, substantial movement, etc. If subject area change monitoring is enabled, the
     * receiver sends an AVCaptureDeviceSubjectAreaDidChangeNotification whenever it detects a change to the subject
     * area, at which time an interested client may wish to re-focus, adjust exposure, white balance, etc. The receiver
     * must be locked for configuration using lockForConfiguration: before clients can set the value of this property.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("isSubjectAreaChangeMonitoringEnabled")
    public native boolean isSubjectAreaChangeMonitoringEnabled();

    /**
     * [@property] subjectAreaChangeMonitoringEnabled
     * 
     * Indicates whether the receiver should monitor the subject area for changes.
     * 
     * The value of this property is a BOOL indicating whether the receiver should monitor the video subject area for
     * changes, such as lighting changes, substantial movement, etc. If subject area change monitoring is enabled, the
     * receiver sends an AVCaptureDeviceSubjectAreaDidChangeNotification whenever it detects a change to the subject
     * area, at which time an interested client may wish to re-focus, adjust exposure, white balance, etc. The receiver
     * must be locked for configuration using lockForConfiguration: before clients can set the value of this property.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setSubjectAreaChangeMonitoringEnabled:")
    public native void setSubjectAreaChangeMonitoringEnabled(boolean value);

    /**
     * [@property] torchActive
     * 
     * Indicates whether the receiver's torch is currently active.
     * 
     * The value of this property is a BOOL indicating whether the receiver's torch is currently active. If the current
     * torchMode is AVCaptureTorchModeAuto and isTorchActive is YES, the torch will illuminate once a recording starts
     * (see AVCaptureOutput.h -startRecordingToOutputFileURL:recordingDelegate:). This property is key-value observable.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("isTorchActive")
    public native boolean isTorchActive();

    /**
     * [@property] torchAvailable
     * 
     * Indicates whether the receiver's torch is currently available for use.
     * 
     * The value of this property is a BOOL indicating whether the receiver's torch is currently available. The torch
     * may become unavailable if, for example, the device overheats and needs to cool off. This property is key-value
     * observable.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("isTorchAvailable")
    public native boolean isTorchAvailable();

    /**
     * isTorchModeSupported:
     * 
     * Returns whether the receiver supports the given torch mode.
     * 
     * The receiver's torchMode property can only be set to a certain mode if this method returns YES for that mode.
     * 
     * @param torchMode
     *                  An AVCaptureTorchMode to be checked.
     * @return
     *         YES if the receiver supports the given torch mode, NO otherwise.
     */
    @Generated
    @Selector("isTorchModeSupported:")
    public native boolean isTorchModeSupported(@NInt long torchMode);

    /**
     * [@property] videoHDREnabled
     * 
     * Indicates whether the receiver's streaming high dynamic range feature is enabled. See
     * AVCaptureDeviceFormat.isVideoHDRSupported.
     * 
     * The value of this property is a BOOL indicating whether the receiver is currently streaming high dynamic range
     * video buffers, also known as Extended Dynamic Range (EDR). The value of this property is ignored when
     * device.activeColorSpace is HLG BT2020 color space since HDR is effectively always on and can't be disabled. The
     * property may only be set if you first set automaticallyAdjustsVideoHDREnabled to NO, otherwise an
     * NSGenericException is thrown. videoHDREnabled may only be set to YES if the receiver's
     * activeFormat.isVideoHDRSupported property returns YES, otherwise an NSGenericException is thrown. This property
     * may be key-value observed.
     * 
     * Note that setting this property may cause a lengthy reconfiguration of the receiver, similar to setting a new
     * active format or AVCaptureSession sessionPreset. If you are setting either the active format or the
     * AVCaptureSession's sessionPreset AND this property, you should bracket these operations with [session
     * beginConfiguration] and [session commitConfiguration] to minimize reconfiguration time.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isVideoHDREnabled")
    public native boolean isVideoHDREnabled();

    /**
     * [@property] videoHDREnabled
     * 
     * Indicates whether the receiver's streaming high dynamic range feature is enabled. See
     * AVCaptureDeviceFormat.isVideoHDRSupported.
     * 
     * The value of this property is a BOOL indicating whether the receiver is currently streaming high dynamic range
     * video buffers, also known as Extended Dynamic Range (EDR). The value of this property is ignored when
     * device.activeColorSpace is HLG BT2020 color space since HDR is effectively always on and can't be disabled. The
     * property may only be set if you first set automaticallyAdjustsVideoHDREnabled to NO, otherwise an
     * NSGenericException is thrown. videoHDREnabled may only be set to YES if the receiver's
     * activeFormat.isVideoHDRSupported property returns YES, otherwise an NSGenericException is thrown. This property
     * may be key-value observed.
     * 
     * Note that setting this property may cause a lengthy reconfiguration of the receiver, similar to setting a new
     * active format or AVCaptureSession sessionPreset. If you are setting either the active format or the
     * AVCaptureSession's sessionPreset AND this property, you should bracket these operations with [session
     * beginConfiguration] and [session commitConfiguration] to minimize reconfiguration time.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setVideoHDREnabled:")
    public native void setVideoHDREnabled(boolean value);

    /**
     * isWhiteBalanceModeSupported:
     * 
     * Returns whether the receiver supports the given white balance mode.
     * 
     * The receiver's whiteBalanceMode property can only be set to a certain mode if this method returns YES for that
     * mode.
     * 
     * @param whiteBalanceMode
     *                         An AVCaptureWhiteBalanceMode to be checked.
     * @return
     *         YES if the receiver supports the given white balance mode, NO otherwise.
     */
    @Generated
    @Selector("isWhiteBalanceModeSupported:")
    public native boolean isWhiteBalanceModeSupported(@NInt long whiteBalanceMode);

    /**
     * [@property] lensAperture
     * 
     * The size of the lens diaphragm.
     * 
     * The value of this property is a float indicating the size (f number) of the lens diaphragm. This property does
     * not change.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("lensAperture")
    public native float lensAperture();

    /**
     * [@property] lensPosition
     * 
     * Indicates the focus position of the lens.
     * 
     * The range of possible positions is 0.0 to 1.0, with 0.0 being the shortest distance at which the lens can focus
     * and 1.0 the furthest. Note that 1.0 does not represent focus at infinity. The default value is 1.0. Note that a
     * given lens position value does not correspond to an exact physical distance, nor does it represent a consistent
     * focus distance from device to device. This property is key-value observable. It can be read at any time,
     * regardless of focus mode, but can only be set via setFocusModeLockedWithLensPosition:completionHandler:.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("lensPosition")
    public native float lensPosition();

    /**
     * [@property] localizedName
     * 
     * A localized human-readable name for the receiver.
     * 
     * This property can be used for displaying the name of a capture device in a user interface.
     */
    @NotNull
    @Generated
    @Selector("localizedName")
    public native String localizedName();

    /**
     * lockForConfiguration:
     * 
     * Requests exclusive access to configure device hardware properties.
     * 
     * In order to set hardware properties on an AVCaptureDevice, such as focusMode and exposureMode, clients must first
     * acquire a lock on the device. Clients should only hold the device lock if they require settable device properties
     * to remain unchanged. Holding the device lock unnecessarily may degrade capture quality in other applications
     * sharing the device.
     * 
     * @param outError
     *                 On return, if the device could not be locked, points to an NSError describing why the failure
     *                 occurred.
     * @return
     *         A BOOL indicating whether the device was successfully locked for configuration.
     */
    @Generated
    @Selector("lockForConfiguration:")
    public native boolean lockForConfiguration(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] maxExposureTargetBias
     * 
     * A float indicating the maximum supported exposure bias, in EV units.
     * 
     * This read-only property indicates the maximum supported exposure bias.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("maxExposureTargetBias")
    public native float maxExposureTargetBias();

    /**
     * [@property] maxWhiteBalanceGain
     * 
     * Indicates the maximum supported value to which a channel in the AVCaptureWhiteBalanceGains may be set.
     * 
     * This property does not change for the life of the receiver.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("maxWhiteBalanceGain")
    public native float maxWhiteBalanceGain();

    /**
     * [@property] minExposureTargetBias
     * 
     * A float indicating the minimum supported exposure bias, in EV units.
     * 
     * This read-only property indicates the minimum supported exposure bias.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("minExposureTargetBias")
    public native float minExposureTargetBias();

    /**
     * [@property] modelID
     * 
     * The model ID of the receiver.
     * 
     * The value of this property is an identifier unique to all devices of the same model. The value is persistent
     * across device connections and disconnections, and across different systems. For example, the model ID of the
     * camera built in to two identical iPhone models will be the same even though they are different physical devices.
     */
    @NotNull
    @Generated
    @Selector("modelID")
    public native String modelID();

    /**
     * [@property] position
     * 
     * Indicates the physical position of an AVCaptureDevice's hardware on the system.
     * 
     * The value of this property is an AVCaptureDevicePosition indicating where the receiver's device is physically
     * located on the system hardware.
     */
    @Generated
    @Selector("position")
    @NInt
    public native long position();

    /**
     * rampToVideoZoomFactor:withRate:
     * 
     * Provides smooth changes in zoom factor.
     * 
     * This method provides a change in zoom by compounding magnification at the specified rate over time. Although the
     * zoom factor will grow exponentially, this yields a visually linear zoom in the image over time.
     * 
     * The zoom transition will stop at the specified factor, which must be in the valid range for videoZoomFactor.
     * Assignments to videoZoomFactor while a ramp is in progress will cancel the ramp and snap to the assigned value.
     * 
     * The zoom factor is continuously scaled by pow(2,rate * time). A rate of 0 causes no change in zoom factor,
     * equivalent to calling cancelVideoZoomRamp. A rate of 1 will cause the magnification to double every second (or
     * halve every second if zooming out), and similarly larger or smaller values will zoom faster or slower
     * respectively. Only the absolute value of the rate is significant--sign is corrected for the direction of the
     * target. Changes in rate will be smoothed by an internal acceleration limit.
     * 
     * When depth data delivery is enabled, -rampToVideoZoomFactor:withRate: sets the videoZoomFactor to the nearest
     * supportedVideoZoomFactor from -[AVCaptureDeviceFormat supportedVideoZoomFactorsForDepthDataDelivery] with a
     * disruptive reconfiguration of the capture render pipeline.
     * 
     * -rampToVideoZoomFactor:withRate: throws an NSGenericException if called without first obtaining exclusive access
     * to the receiver using lockForConfiguration:.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("rampToVideoZoomFactor:withRate:")
    public native void rampToVideoZoomFactorWithRate(@NFloat double factor, float rate);

    /**
     * [@property] activeColorSpace
     * 
     * Indicates the receiver's current active color space.
     * 
     * By default, an AVCaptureDevice attached to an AVCaptureSession is automatically configured for wide color by the
     * AVCaptureSession (see AVCaptureSession automaticallyConfiguresCaptureDeviceForWideColor). You may also set the
     * activeColorSpace manually. To prevent the AVCaptureSession from undoing your work, remember to set
     * AVCaptureSession's automaticallyConfiguresCaptureDeviceForWideColor property to NO. Changing the receiver's
     * activeColorSpace while the session is running requires a disruptive reconfiguration of the capture render
     * pipeline. Movie captures in progress will be ended immediately; unfulfilled photo requests will be aborted; video
     * preview will temporarily freeze. -setActiveColorSpace: throws an NSGenericException if called without first
     * obtaining exclusive access to the receiver using -lockForConfiguration:.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setActiveColorSpace:")
    public native void setActiveColorSpace(@NInt long value);

    /**
     * [@property] activeFormat
     * 
     * The currently active format of the receiver.
     * 
     * This property can be used to get or set the currently active device format.
     * 
     * -setActiveFormat: throws an NSInvalidArgumentException if set to a format not present in the formats array.
     * 
     * -setActiveFormat: throws an NSGenericException if called without first obtaining exclusive access to the receiver
     * using lockForConfiguration:.
     * 
     * Clients can observe automatic changes to the receiver's activeFormat by key value observing this property.
     * 
     * On iOS, use of AVCaptureDevice's setActiveFormat: and AVCaptureSession's setSessionPreset: are mutually
     * exclusive. If you set a capture device's active format, the session to which it is attached changes its preset to
     * AVCaptureSessionPresetInputPriority. Likewise if you set the AVCaptureSession's sessionPreset property, the
     * session assumes control of its input devices, and configures their activeFormat appropriately. Note that audio
     * devices do not expose any user-configurable formats on iOS. To configure audio input on iOS, you should use the
     * AVAudioSession APIs instead (see AVAudioSession.h).
     * 
     * The activeFormat, activeVideoMinFrameDuration, and activeVideoMaxFrameDuration properties may be set
     * simultaneously by using AVCaptureSession's begin/commitConfiguration methods:
     * 
     * [session beginConfiguration]; // the session to which the receiver's AVCaptureDeviceInput is added.
     * if ( [device lockForConfiguration:&error] ) {
     * [device setActiveFormat:newFormat];
     * [device setActiveVideoMinFrameDuration:newMinDuration];
     * [device setActiveVideoMaxFrameDuration:newMaxDuration];
     * [device unlockForConfiguration];
     * }
     * [session commitConfiguration]; // The new format and frame rates are applied together in commitConfiguration
     * 
     * Note that when configuring a session to use an active format intended for high resolution still photography and
     * applying one or more of the following operations to an AVCaptureVideoDataOutput, the system may not meet the
     * target framerate: zoom, orientation changes, format conversion.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setActiveFormat:")
    public native void setActiveFormat(@NotNull AVCaptureDeviceFormat value);

    /**
     * [@property] activeVideoMaxFrameDuration
     * 
     * A property indicating the receiver's current active maximum frame duration (the reciprocal of its min frame
     * rate).
     * 
     * An AVCaptureDevice's activeVideoMaxFrameDuration property is the reciprocal of its active minimum frame rate. To
     * limit the min frame rate of the capture device, clients may set this property to a value supported by the
     * receiver's activeFormat (see AVCaptureDeviceFormat's videoSupportedFrameRateRanges property). Clients may set
     * this property's value to kCMTimeInvalid to return activeVideoMaxFrameDuration to its default value for the given
     * activeFormat.
     * 
     * -setActiveVideoMaxFrameDuration: throws an NSInvalidArgumentException if set to an unsupported value.
     * 
     * -setActiveVideoMaxFrameDuration: throws an NSGenericException if called without first obtaining exclusive access
     * to the receiver using lockForConfiguration:.
     * 
     * Clients can observe automatic changes to the receiver's activeVideoMaxFrameDuration by key value observing this
     * property.
     * 
     * On iOS, the receiver's activeVideoMaxFrameDuration resets to its default value under the following conditions:
     * - The receiver's activeFormat changes
     * - The receiver's AVCaptureDeviceInput's session's sessionPreset changes
     * - The receiver's AVCaptureDeviceInput is added to a session
     * 
     * When exposureMode is AVCaptureExposureModeCustom, frame rate and exposure duration are interrelated. If you call
     * setExposureModeCustomWithDuration:ISO:completionHandler: with an exposureDuration longer than the current
     * activeVideoMaxFrameDuration, the activeVideoMaxFrameDuration will be lengthened to accommodate the longer
     * exposure time. Setting a shorter exposure duration does not automatically change the activeVideoMinFrameDuration
     * or activeVideoMaxFrameDuration. To explicitly increase the frame rate in custom exposure mode, you must set the
     * activeVideoMaxFrameDuration to a shorter value. If your new max frame duration is shorter than the current
     * exposureDuration, the exposureDuration will shorten as well to accommodate the new frame rate.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setActiveVideoMaxFrameDuration:")
    public native void setActiveVideoMaxFrameDuration(@ByValue CMTime value);

    /**
     * [@property] activeVideoMinFrameDuration
     * 
     * A property indicating the receiver's current active minimum frame duration (the reciprocal of its max frame
     * rate).
     * 
     * An AVCaptureDevice's activeVideoMinFrameDuration property is the reciprocal of its active maximum frame rate. To
     * limit the max frame rate of the capture device, clients may set this property to a value supported by the
     * receiver's activeFormat (see AVCaptureDeviceFormat's videoSupportedFrameRateRanges property). Clients may set
     * this property's value to kCMTimeInvalid to return activeVideoMinFrameDuration to its default value for the given
     * activeFormat.
     * 
     * -setActiveVideoMinFrameDuration: throws an NSInvalidArgumentException if set to an unsupported value.
     * 
     * -setActiveVideoMinFrameDuration: throws an NSGenericException if called without first obtaining exclusive access
     * to the receiver using lockForConfiguration:.
     * 
     * Clients can observe automatic changes to the receiver's activeVideoMinFrameDuration by key value observing this
     * property.
     * 
     * On iOS, the receiver's activeVideoMinFrameDuration resets to its default value under the following conditions:
     * - The receiver's activeFormat changes
     * - The receiver's AVCaptureDeviceInput's session's sessionPreset changes
     * - The receiver's AVCaptureDeviceInput is added to a session
     * 
     * When exposureMode is AVCaptureExposureModeCustom, setting the activeVideoMinFrameDuration affects max frame rate,
     * but not exposureDuration. You may use setExposureModeCustomWithDuration:ISO:completionHandler: to set a shorter
     * exposureDuration than your activeVideoMinFrameDuration, if desired.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setActiveVideoMinFrameDuration:")
    public native void setActiveVideoMinFrameDuration(@ByValue CMTime value);

    /**
     * [@property] autoFocusRangeRestriction
     * 
     * Indicates current restriction of the receiver's autofocus system to a particular range of focus scan, if it
     * supports range restrictions.
     * 
     * The value of this property is an AVCaptureAutoFocusRangeRestriction indicating how the autofocus system should
     * limit its focus scan. The default value is AVCaptureAutoFocusRangeRestrictionNone. -setAutoFocusRangeRestriction:
     * throws an NSInvalidArgumentException if isAutoFocusRangeRestrictionSupported returns NO.
     * -setAutoFocusRangeRestriction: throws an NSGenericException if called without first obtaining exclusive access to
     * the receiver using lockForConfiguration:. This property only has an effect when the focusMode property is set to
     * AVCaptureFocusModeAutoFocus or AVCaptureFocusModeContinuousAutoFocus. Note that setting autoFocusRangeRestriction
     * alone does not initiate a focus operation. After setting autoFocusRangeRestriction, call -setFocusMode: to apply
     * the new restriction.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setAutoFocusRangeRestriction:")
    public native void setAutoFocusRangeRestriction(@NInt long value);

    /**
     * [@property] automaticallyAdjustsVideoHDREnabled
     * 
     * Indicates whether the receiver is allowed to turn high dynamic range streaming on or off.
     * 
     * The value of this property is a BOOL indicating whether the receiver is free to turn high dynamic range streaming
     * on or off. This property defaults to YES. When automaticallyAdjustsVideoHDREnabled, the AVCaptureDevice turns
     * videoHDR on automatically if it's a good fit for the activeFormat. -setAutomaticallyAdjustsVideoHDREnabled:
     * throws an NSGenericException if called without first obtaining exclusive access to the receiver using
     * -lockForConfiguration:. Clients can key-value observe videoHDREnabled to know when the receiver has automatically
     * changed the value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setAutomaticallyAdjustsVideoHDREnabled:")
    public native void setAutomaticallyAdjustsVideoHDREnabled(boolean value);

    /**
     * [@property] automaticallyEnablesLowLightBoostWhenAvailable
     * 
     * Indicates whether the receiver should automatically switch to low light boost mode when necessary.
     * 
     * On a receiver where -isLowLightBoostSupported returns YES, a special low light boost mode may be engaged to
     * improve image quality. When the automaticallyEnablesLowLightBoostWhenAvailable property is set to YES, the
     * receiver switches at its discretion to a special boost mode under low light, and back to normal operation when
     * the scene becomes sufficiently lit. An AVCaptureDevice that supports this feature may only engage boost mode for
     * certain source formats or resolutions. Clients may observe changes to the lowLightBoostEnabled property to know
     * when the mode has engaged. The switch between normal operation and low light boost mode may drop one or more
     * video frames. The default value is NO. Setting this property throws an NSInvalidArgumentException if
     * -isLowLightBoostSupported returns NO. The receiver must be locked for configuration using lockForConfiguration:
     * before clients can set this method, otherwise an NSGenericException is thrown.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setAutomaticallyEnablesLowLightBoostWhenAvailable:")
    public native void setAutomaticallyEnablesLowLightBoostWhenAvailable(boolean value);

    /**
     * [@property] exposureMode
     * 
     * Indicates current exposure mode of the receiver, if it has adjustable exposure.
     * 
     * The value of this property is an AVCaptureExposureMode that determines the receiver's exposure mode, if it has
     * adjustable exposure. -setExposureMode: throws an NSInvalidArgumentException if set to an unsupported value (see
     * -isExposureModeSupported:). -setExposureMode: throws an NSGenericException if called without first obtaining
     * exclusive access to the receiver using lockForConfiguration:. When using AVCapturePhotoOutput and capturing
     * photos with AVCapturePhotoSettings' photoQualityPrioritization property set to
     * AVCapturePhotoQualityPrioritizationBalanced or higher, the receiver's ISO and exposureDuration values may be
     * overridden when exposing the photo if the scene is dark enough to warrant some form of multi-image fusion to
     * improve quality. To ensure that the receiver's ISO and exposureDuration values are honored while in
     * AVCaptureExposureModeCustom or AVCaptureExposureModeLocked, you must set your
     * AVCapturePhotoSettings.photoQualityPrioritization property to AVCapturePhotoQualityPrioritizationSpeed. The same
     * rule applies if you are using the deprecated AVCapturePhotoSettings.autoStillImageStabilizationEnabled property;
     * you must set it to NO to preserve your custom exposure values in the photo capture. Likewise if you're using
     * AVCaptureStillImageOutput, automaticallyEnablesStillImageStabilizationWhenAvailable must be set to NO to preserve
     * your custom exposure values in a still image capture. Clients can observe automatic changes to the receiver's
     * exposureMode by key value observing this property.
     */
    @Generated
    @Selector("setExposureMode:")
    public native void setExposureMode(@NInt long value);

    /**
     * setExposureModeCustomWithDuration:ISO:completionHandler:
     * 
     * Sets exposureMode to AVCaptureExposureModeCustom and locks exposureDuration and ISO at explicit values.
     * 
     * This is the only way of setting exposureDuration and ISO. This method throws an NSRangeException if either
     * exposureDuration or ISO is set to an unsupported level. This method throws an NSGenericException if called
     * without first obtaining exclusive access to the receiver using lockForConfiguration:. When using
     * AVCapturePhotoOutput to capture photos, note that the photoQualityPrioritization property of
     * AVCapturePhotoSettings defaults to AVCapturePhotoQualityPrioritizationBalanced, which allows photo capture to
     * temporarily override the capture device's ISO and exposureDuration values if the scene is dark enough to warrant
     * some form of multi-image fusion to improve quality. To ensure that the receiver's ISO and exposureDuration values
     * are honored while in AVCaptureExposureModeCustom or AVCaptureExposureModeLocked, you must set your
     * AVCapturePhotoSettings.photoQualityPrioritization property to AVCapturePhotoQualityPrioritizationSpeed. The same
     * rule applies if you use the deprecated AVCapturePhotoSettings.autoStillImageStabilizationEnabled property or
     * AVCaptureStillImageOutput.automaticallyEnablesStillImageStabilizationWhenAvailable property. You must set them to
     * NO to preserve your custom or locked exposure settings.
     * 
     * API-Since: 8.0
     * 
     * @param duration
     *                 The exposure duration, as described in the documentation for the exposureDuration property. A
     *                 value of AVCaptureExposureDurationCurrent can be used to indicate that the caller does not wish
     *                 to specify a value for exposureDuration. Note that changes to this property may result in changes
     *                 to activeVideoMinFrameDuration and/or activeVideoMaxFrameDuration.
     * @param ISO
     *                 The exposure ISO value, as described in the documentation for the ISO property. A value of
     *                 AVCaptureISOCurrent can be used to indicate that the caller does not wish to specify a value for
     *                 ISO.
     * @param handler
     *                 A block to be called when both exposureDuration and ISO have been set to the values specified and
     *                 exposureMode is set to AVCaptureExposureModeCustom. If
     *                 setExposureModeCustomWithDuration:ISO:completionHandler: is called multiple times, the completion
     *                 handlers will be called in FIFO order. The block receives a timestamp which matches that of the
     *                 first buffer to which all settings have been applied. Note that the timestamp is synchronized to
     *                 the device clock, and thus must be converted to the master clock prior to comparison with the
     *                 timestamps of buffers delivered via an AVCaptureVideoDataOutput. The client may pass nil for the
     *                 handler parameter if knowledge of the operation's completion is not required.
     */
    @Generated
    @Selector("setExposureModeCustomWithDuration:ISO:completionHandler:")
    public native void setExposureModeCustomWithDurationISOCompletionHandler(@ByValue CMTime duration, float ISO,
            @Nullable @ObjCBlock(name = "call_setExposureModeCustomWithDurationISOCompletionHandler") Block_setExposureModeCustomWithDurationISOCompletionHandler handler);

    /**
     * [@property] exposurePointOfInterest
     * 
     * Indicates current exposure point of interest of the receiver, if it has one.
     * 
     * The value of this property is a CGPoint that determines the receiver's exposure point of interest, if it has
     * adjustable exposure. A value of (0,0) indicates that the camera should adjust exposure based on the top left
     * corner of the image, while a value of (1,1) indicates that it should adjust exposure based on the bottom right
     * corner. The default value is (0.5,0.5). -setExposurePointOfInterest: throws an NSInvalidArgumentException if
     * isExposurePointOfInterestSupported returns NO. -setExposurePointOfInterest: throws an NSGenericException if
     * called without first obtaining exclusive access to the receiver using lockForConfiguration:. Note that setting
     * exposurePointOfInterest alone does not initiate an exposure operation. After setting exposurePointOfInterest,
     * call -setExposureMode: to apply the new point of interest.
     */
    @Generated
    @Selector("setExposurePointOfInterest:")
    public native void setExposurePointOfInterest(@ByValue CGPoint value);

    /**
     * setExposureTargetBias:completionHandler:
     * 
     * Sets the bias to be applied to the target exposure value.
     * 
     * This is the only way of setting exposureTargetBias. This method throws an NSRangeException if exposureTargetBias
     * is set to an unsupported level. This method throws an NSGenericException if called without first obtaining
     * exclusive access to the receiver using lockForConfiguration:.
     * 
     * API-Since: 8.0
     * 
     * @param bias
     *                The bias to be applied to the exposure target value, as described in the documentation for the
     *                exposureTargetBias property.
     * @param handler
     *                A block to be called when exposureTargetBias has been set to the value specified. If
     *                setExposureTargetBias:completionHandler: is called multiple times, the completion handlers will be
     *                called in FIFO order. The block receives a timestamp which matches that of the first buffer to
     *                which the setting has been applied. Note that the timestamp is synchronized to the device clock,
     *                and thus must be converted to the master clock prior to comparison with the timestamps of buffers
     *                delivered via an AVCaptureVideoDataOutput. The client may pass nil for the handler parameter if
     *                knowledge of the operation's completion is not required.
     */
    @Generated
    @Selector("setExposureTargetBias:completionHandler:")
    public native void setExposureTargetBiasCompletionHandler(float bias,
            @Nullable @ObjCBlock(name = "call_setExposureTargetBiasCompletionHandler") Block_setExposureTargetBiasCompletionHandler handler);

    /**
     * [@property] flashMode
     * 
     * Indicates current mode of the receiver's flash, if it has one.
     * 
     * The value of this property is an AVCaptureFlashMode that determines the mode of the receiver's flash, if it has
     * one. -setFlashMode: throws an NSInvalidArgumentException if set to an unsupported value (see
     * -isFlashModeSupported:). -setFlashMode: throws an NSGenericException if called without first obtaining exclusive
     * access to the receiver using lockForConfiguration:. Clients can observe automatic changes to the receiver's
     * flashMode by key value observing this property.
     * 
     * When using AVCapturePhotoOutput, AVCaptureDevice's flashMode property is ignored. You specify flashMode on a per
     * photo basis by setting the AVCapturePhotoSettings.flashMode property.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCapturePhotoSettings.flashMode instead.
     */
    @Deprecated
    @Generated
    @Selector("setFlashMode:")
    public native void setFlashMode(@NInt long value);

    /**
     * [@property] focusMode
     * 
     * Indicates current focus mode of the receiver, if it has one.
     * 
     * The value of this property is an AVCaptureFocusMode that determines the receiver's focus mode, if it has one.
     * -setFocusMode: throws an NSInvalidArgumentException if set to an unsupported value (see -isFocusModeSupported:).
     * -setFocusMode: throws an NSGenericException if called without first obtaining exclusive access to the receiver
     * using lockForConfiguration:. Clients can observe automatic changes to the receiver's focusMode by key value
     * observing this property.
     */
    @Generated
    @Selector("setFocusMode:")
    public native void setFocusMode(@NInt long value);

    /**
     * setFocusModeLockedWithLensPosition:completionHandler:
     * 
     * Sets focusMode to AVCaptureFocusModeLocked and locks lensPosition at an explicit value.
     * 
     * This is the only way of setting lensPosition. This method throws an NSRangeException if lensPosition is set to an
     * unsupported level. This method throws an NSGenericException if called without first obtaining exclusive access to
     * the receiver using lockForConfiguration:.
     * 
     * API-Since: 8.0
     * 
     * @param lensPosition
     *                     The lens position, as described in the documentation for the lensPosition property. A value
     *                     of AVCaptureLensPositionCurrent can be used to indicate that the caller does not wish to
     *                     specify a value for lensPosition.
     * @param handler
     *                     A block to be called when lensPosition has been set to the value specified and focusMode is
     *                     set to AVCaptureFocusModeLocked. If setFocusModeLockedWithLensPosition:completionHandler: is
     *                     called multiple times, the completion handlers will be called in FIFO order. The block
     *                     receives a timestamp which matches that of the first buffer to which all settings have been
     *                     applied. Note that the timestamp is synchronized to the device clock, and thus must be
     *                     converted to the master clock prior to comparison with the timestamps of buffers delivered
     *                     via an AVCaptureVideoDataOutput. The client may pass nil for the handler parameter if
     *                     knowledge of the operation's completion is not required.
     */
    @Generated
    @Selector("setFocusModeLockedWithLensPosition:completionHandler:")
    public native void setFocusModeLockedWithLensPositionCompletionHandler(float lensPosition,
            @Nullable @ObjCBlock(name = "call_setFocusModeLockedWithLensPositionCompletionHandler") Block_setFocusModeLockedWithLensPositionCompletionHandler handler);

    /**
     * [@property] focusPointOfInterest
     * 
     * Indicates current focus point of interest of the receiver, if it has one.
     * 
     * The value of this property is a CGPoint that determines the receiver's focus point of interest, if it has one. A
     * value of (0,0) indicates that the camera should focus on the top left corner of the image, while a value of (1,1)
     * indicates that it should focus on the bottom right. The default value is (0.5,0.5). -setFocusPointOfInterest:
     * throws an NSInvalidArgumentException if isFocusPointOfInterestSupported returns NO. -setFocusPointOfInterest:
     * throws an NSGenericException if called without first obtaining exclusive access to the receiver using
     * lockForConfiguration:. Clients can observe automatic changes to the receiver's focusPointOfInterest by key value
     * observing this property. Note that setting focusPointOfInterest alone does not initiate a focus operation. After
     * setting focusPointOfInterest, call -setFocusMode: to apply the new point of interest.
     */
    @Generated
    @Selector("setFocusPointOfInterest:")
    public native void setFocusPointOfInterest(@ByValue CGPoint value);

    /**
     * [@property] torchMode
     * 
     * Indicates current mode of the receiver's torch, if it has one.
     * 
     * The value of this property is an AVCaptureTorchMode that determines the mode of the receiver's torch, if it has
     * one. -setTorchMode: throws an NSInvalidArgumentException if set to an unsupported value (see
     * -isTorchModeSupported:). -setTorchMode: throws an NSGenericException if called without first obtaining exclusive
     * access to the receiver using lockForConfiguration:. Clients can observe automatic changes to the receiver's
     * torchMode by key value observing this property.
     */
    @Generated
    @Selector("setTorchMode:")
    public native void setTorchMode(@NInt long value);

    /**
     * setTorchModeOnWithLevel:error:
     * 
     * Sets the current mode of the receiver's torch to AVCaptureTorchModeOn at the specified level.
     * 
     * This method sets the torch mode to AVCaptureTorchModeOn at a specified level. torchLevel must be a value between
     * 0 and 1, or the special value AVCaptureMaxAvailableTorchLevel. The specified value may not be available if the
     * iOS device is too hot. This method throws an NSInvalidArgumentException if set to an unsupported level. If the
     * specified level is valid, but unavailable, the method returns NO with AVErrorTorchLevelUnavailable.
     * -setTorchModeOnWithLevel:error: throws an NSGenericException if called without first obtaining exclusive access
     * to the receiver using lockForConfiguration:. Clients can observe automatic changes to the receiver's torchMode by
     * key value observing the torchMode property.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setTorchModeOnWithLevel:error:")
    public native boolean setTorchModeOnWithLevelError(float torchLevel,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] videoZoomFactor
     * 
     * Controls zoom level of image outputs
     * 
     * Applies a centered crop for all image outputs, scaling as necessary to maintain output dimensions. Minimum value
     * of 1.0 yields full field of view, increasing values will increase magnification, up to a maximum value specified
     * in the activeFormat's videoMaxZoomFactor property. Modifying the zoom factor will cancel any active
     * rampToVideoZoomFactor:withRate:, and snap directly to the assigned value. Assigning values outside the acceptable
     * range will generate an NSRangeException. Clients can key value observe the value of this property. When depth
     * data delivery is enabled, changing the zoom factor sets the videoZoomFactor to the nearest
     * supportedVideoZoomFactor from -[AVCaptureDeviceFormat supportedVideoZoomFactorsForDepthDataDelivery] with a
     * disruptive reconfiguration of the capture render pipeline.
     * 
     * -setVideoZoomFactor: throws an NSGenericException if called without first obtaining exclusive access to the
     * receiver using lockForConfiguration:.
     * 
     * @see -[AVCaptureDeviceFormat videoMaxZoomFactor], -[AVCaptureDeviceFormat videoZoomFactorUpscaleThreshold],
     *      -[AVCaptureDevice minAvailableVideoZoomFactor], -[AVCaptureDevice maxAvailableVideoZoomFactor],
     *      -[AVCaptureDeviceFormat supportedVideoZoomFactorsForDepthDataDelivery], -[AVCaptureDeviceFormat
     *      videoMinZoomFactorForCenterStage] and -[AVCaptureDeviceFormat videoMaxZoomFactorForCenterStage]
     * 
     *      API-Since: 7.0
     */
    @Generated
    @Selector("setVideoZoomFactor:")
    public native void setVideoZoomFactor(@NFloat double value);

    /**
     * [@property] whiteBalanceMode
     * 
     * Indicates current white balance mode of the receiver, if it has adjustable white balance.
     * 
     * The value of this property is an AVCaptureWhiteBalanceMode that determines the receiver's white balance mode, if
     * it has adjustable white balance. -setWhiteBalanceMode: throws an NSInvalidArgumentException if set to an
     * unsupported value (see -isWhiteBalanceModeSupported:). -setWhiteBalanceMode: throws an NSGenericException if
     * called without first obtaining exclusive access to the receiver using lockForConfiguration:. Clients can observe
     * automatic changes to the receiver's whiteBalanceMode by key value observing this property.
     */
    @Generated
    @Selector("setWhiteBalanceMode:")
    public native void setWhiteBalanceMode(@NInt long value);

    /**
     * setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:
     * 
     * Sets white balance to locked mode with explicit deviceWhiteBalanceGains values.
     * 
     * For each channel in the whiteBalanceGains struct, only values between 1.0 and -maxWhiteBalanceGain are supported.
     * Gain values are normalized to the minimum channel value to avoid brightness changes (e.g. R:2 G:2 B:4 will be
     * normalized to R:1 G:1 B:2). This method throws an NSRangeException if any of the whiteBalanceGains are set to an
     * unsupported level. This method throws an NSGenericException if called without first obtaining exclusive access to
     * the receiver using lockForConfiguration:.
     * 
     * API-Since: 8.0
     * 
     * @param whiteBalanceGains
     *                          The white balance gain values, as described in the documentation for the
     *                          deviceWhiteBalanceGains property. A value of AVCaptureWhiteBalanceGainsCurrent can be
     *                          used to indicate that the caller does not wish to specify a value for
     *                          deviceWhiteBalanceGains.
     * @param handler
     *                          A block to be called when white balance gains have been set to the values specified and
     *                          whiteBalanceMode is set to AVCaptureWhiteBalanceModeLocked. If
     *                          setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler: is called
     *                          multiple times, the completion handlers will be called in FIFO order. The block receives
     *                          a timestamp which matches that of the first buffer to which all settings have been
     *                          applied. Note that the timestamp is synchronized to the device clock, and thus must be
     *                          converted to the master clock prior to comparison with the timestamps of buffers
     *                          delivered via an AVCaptureVideoDataOutput. This parameter may be nil if synchronization
     *                          is not required.
     */
    @Generated
    @Selector("setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:")
    public native void setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler(
            @ByValue AVCaptureWhiteBalanceGains whiteBalanceGains,
            @Nullable @ObjCBlock(name = "call_setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler") Block_setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler handler);

    /**
     * supportsAVCaptureSessionPreset:
     * 
     * Returns whether the receiver can be used in an AVCaptureSession configured with the given preset.
     * 
     * An AVCaptureSession instance can be associated with a preset that configures its inputs and outputs to fulfill
     * common use cases. This method can be used to determine if the receiver can be used in a capture session with the
     * given preset. Presets are defined in AVCaptureSession.h.
     * 
     * @param preset
     *               An AVCaptureSession preset.
     * @return
     *         YES if the receiver can be used with the given preset, NO otherwise.
     */
    @Generated
    @Selector("supportsAVCaptureSessionPreset:")
    public native boolean supportsAVCaptureSessionPreset(@NotNull String preset);

    /**
     * temperatureAndTintValuesForDeviceWhiteBalanceGains:
     * 
     * Converts device-specific white balance RGB gain values to device-independent temperature and tint values.
     * 
     * This method may be called on the receiver to convert device-specific white balance RGB gain values to
     * device-independent temperature (in kelvin) and tint values. For each channel in the whiteBalanceGains struct,
     * only values between 1.0 and -maxWhiteBalanceGain are supported. This method throws an NSRangeException if any of
     * the whiteBalanceGains are set to unsupported values.
     * 
     * API-Since: 8.0
     * 
     * @param whiteBalanceGains
     *                          White balance gain values, as described in the documentation for the
     *                          deviceWhiteBalanceGains property. A value of AVCaptureWhiteBalanceGainsCurrent may not
     *                          be used in this function.
     * @return
     *         A fully populated AVCaptureWhiteBalanceTemperatureAndTintValues structure containing device-independent
     *         values.
     */
    @Generated
    @Selector("temperatureAndTintValuesForDeviceWhiteBalanceGains:")
    @ByValue
    public native AVCaptureWhiteBalanceTemperatureAndTintValues temperatureAndTintValuesForDeviceWhiteBalanceGains(
            @ByValue AVCaptureWhiteBalanceGains whiteBalanceGains);

    /**
     * [@property] torchLevel
     * 
     * Indicates the receiver's current torch brightness level as a floating point value.
     * 
     * The value of this property is a float indicating the receiver's torch level from 0.0 (off) -> 1.0 (full). This
     * property is key-value observable.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("torchLevel")
    public native float torchLevel();

    /**
     * [@property] torchMode
     * 
     * Indicates current mode of the receiver's torch, if it has one.
     * 
     * The value of this property is an AVCaptureTorchMode that determines the mode of the receiver's torch, if it has
     * one. -setTorchMode: throws an NSInvalidArgumentException if set to an unsupported value (see
     * -isTorchModeSupported:). -setTorchMode: throws an NSGenericException if called without first obtaining exclusive
     * access to the receiver using lockForConfiguration:. Clients can observe automatic changes to the receiver's
     * torchMode by key value observing this property.
     */
    @Generated
    @Selector("torchMode")
    @NInt
    public native long torchMode();

    /**
     * [@property] uniqueID
     * 
     * An ID unique to the model of device corresponding to the receiver.
     * 
     * Every available capture device has a unique ID that persists on one system across device connections and
     * disconnections, application restarts, and reboots of the system itself. Applications can store the value returned
     * by this property to recall or track the status of a specific device in the future.
     */
    @NotNull
    @Generated
    @Selector("uniqueID")
    public native String uniqueID();

    /**
     * unlockForConfiguration
     * 
     * Release exclusive control over device hardware properties.
     * 
     * This method should be called to match an invocation of lockForConfiguration: when an application no longer needs
     * to keep device hardware properties from changing automatically.
     */
    @Generated
    @Selector("unlockForConfiguration")
    public native void unlockForConfiguration();

    /**
     * [@property] videoZoomFactor
     * 
     * Controls zoom level of image outputs
     * 
     * Applies a centered crop for all image outputs, scaling as necessary to maintain output dimensions. Minimum value
     * of 1.0 yields full field of view, increasing values will increase magnification, up to a maximum value specified
     * in the activeFormat's videoMaxZoomFactor property. Modifying the zoom factor will cancel any active
     * rampToVideoZoomFactor:withRate:, and snap directly to the assigned value. Assigning values outside the acceptable
     * range will generate an NSRangeException. Clients can key value observe the value of this property. When depth
     * data delivery is enabled, changing the zoom factor sets the videoZoomFactor to the nearest
     * supportedVideoZoomFactor from -[AVCaptureDeviceFormat supportedVideoZoomFactorsForDepthDataDelivery] with a
     * disruptive reconfiguration of the capture render pipeline.
     * 
     * -setVideoZoomFactor: throws an NSGenericException if called without first obtaining exclusive access to the
     * receiver using lockForConfiguration:.
     * 
     * @see -[AVCaptureDeviceFormat videoMaxZoomFactor], -[AVCaptureDeviceFormat videoZoomFactorUpscaleThreshold],
     *      -[AVCaptureDevice minAvailableVideoZoomFactor], -[AVCaptureDevice maxAvailableVideoZoomFactor],
     *      -[AVCaptureDeviceFormat supportedVideoZoomFactorsForDepthDataDelivery], -[AVCaptureDeviceFormat
     *      videoMinZoomFactorForCenterStage] and -[AVCaptureDeviceFormat videoMaxZoomFactorForCenterStage]
     * 
     *      API-Since: 7.0
     */
    @Generated
    @Selector("videoZoomFactor")
    @NFloat
    public native double videoZoomFactor();

    /**
     * [@property] whiteBalanceMode
     * 
     * Indicates current white balance mode of the receiver, if it has adjustable white balance.
     * 
     * The value of this property is an AVCaptureWhiteBalanceMode that determines the receiver's white balance mode, if
     * it has adjustable white balance. -setWhiteBalanceMode: throws an NSInvalidArgumentException if set to an
     * unsupported value (see -isWhiteBalanceModeSupported:). -setWhiteBalanceMode: throws an NSGenericException if
     * called without first obtaining exclusive access to the receiver using lockForConfiguration:. Clients can observe
     * automatic changes to the receiver's whiteBalanceMode by key value observing this property.
     */
    @Generated
    @Selector("whiteBalanceMode")
    @NInt
    public native long whiteBalanceMode();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAccessForMediaTypeCompletionHandler {
        @Generated
        void call_requestAccessForMediaTypeCompletionHandler(boolean granted);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setExposureModeCustomWithDurationISOCompletionHandler {
        @Generated
        void call_setExposureModeCustomWithDurationISOCompletionHandler(@ByValue CMTime syncTime);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setExposureTargetBiasCompletionHandler {
        @Generated
        void call_setExposureTargetBiasCompletionHandler(@ByValue CMTime syncTime);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFocusModeLockedWithLensPositionCompletionHandler {
        @Generated
        void call_setFocusModeLockedWithLensPositionCompletionHandler(@ByValue CMTime syncTime);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler {
        @Generated
        void call_setWhiteBalanceModeLockedWithDeviceWhiteBalanceGainsCompletionHandler(@ByValue CMTime syncTime);
    }

    /**
     * [@property] activeDepthDataFormat
     * 
     * The currently active depth data format of the receiver.
     * 
     * This property can be used to get or set the device's currently active depth data format.
     * -setActiveDepthDataFormat: throws an NSInvalidArgumentException if set to a format not present in the
     * activeFormat's -supportedDepthDataFormats array. -setActiveDepthDataFormat: throws an NSGenericException if
     * called without first obtaining exclusive access to the receiver using lockForConfiguration:. Clients can observe
     * automatic changes to the receiver's activeDepthDataFormat by key value observing this property. On devices where
     * depth data is not supported, this property returns nil.
     * 
     * The frame rate of depth data may not be set directly. Depth data frame rate is synchronized to the device's
     * activeMin/MaxFrameDurations. It may match the device's current frame rate, or lower, if depth data cannot be
     * produced fast enough for the active video frame rate.
     * 
     * Delivery of depth data to a AVCaptureDepthDataOutput may increase the system load, resulting in a reduced video
     * frame rate for thermal sustainability.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("activeDepthDataFormat")
    public native AVCaptureDeviceFormat activeDepthDataFormat();

    /**
     * [@property] dualCameraSwitchOverVideoZoomFactor
     * 
     * The video zoom factor at or above which a DualCamera can select between its wide angle camera and its telephoto
     * camera.
     * 
     * This is the zoom factor at which the wide angle camera's field of view matches telephoto camera's full field of
     * view. On non-DualCamera devices this will return 1.0. As of iOS 13.0, this API has been deprecated in favor of
     * virtualDeviceSwitchOverVideoZoomFactors.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("dualCameraSwitchOverVideoZoomFactor")
    @NFloat
    public native double dualCameraSwitchOverVideoZoomFactor();

    /**
     * [@property] maxAvailableVideoZoomFactor
     * 
     * Indicates the maximum zoom factor available for the AVCaptureDevice's videoZoomFactor property.
     * 
     * On non-virtual devices the maxAvailableVideoZoomFactor is always equal to the activeFormat.videoMaxZoomFactor. If
     * the device's videoZoomFactor property is assigned a value greater than activeFormat.videoMaxZoomFactor, an
     * NSRangeException is thrown.
     * On a virtual device the maxAvailableVideoZoomFactor can change when the device is delivering depth data to one or
     * more outputs (see -[AVCaptureDeviceFormat supportedVideoZoomFactorsForDepthDataDelivery]). When depth data
     * delivery is enabled, allowed zoom factor values are governed by -[AVCaptureDeviceFormat
     * supportedVideoZoomFactorsForDepthDataDelivery] and this contains the absolute maximum zoom of all allowed zoom
     * factors.
     * Setting the videoZoomFactor to a value less than or equal to activeFormat.videoMaxZoomFactor, but greater than
     * maxAvailableVideoZoomFactor results in the value being clamped to the maxAvailableVideoZoomFactor. Clients can
     * key value observe the value of this property.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("maxAvailableVideoZoomFactor")
    @NFloat
    public native double maxAvailableVideoZoomFactor();

    /**
     * [@property] minAvailableVideoZoomFactor
     * 
     * Indicates the minimum zoom factor available for the AVCaptureDevice's videoZoomFactor property.
     * 
     * On non-virtual devices the minAvailableVideoZoomFactor is always 1.0. If the device's videoZoomFactor property is
     * assigned a value smaller than 1.0, an NSRangeException is thrown.
     * On a virtual device the minAvailableVideoZoomFactor can change when the device is delivering depth data to one or
     * more outputs (see -[AVCaptureDeviceFormat supportedVideoZoomFactorsForDepthDataDelivery]). When depth data
     * delivery is enabled, allowed zoom factor values are governed by -[AVCaptureDeviceFormat
     * supportedVideoZoomFactorsForDepthDataDelivery] and this contains the absolute minimum zoom of all allowed zoom
     * factors.
     * Setting the videoZoomFactor to a value greater than or equal to 1.0, but lower than minAvailableVideoZoomFactor
     * results in the value being clamped to the minAvailableVideoZoomFactor. Clients can key value observe the value of
     * this property.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("minAvailableVideoZoomFactor")
    @NFloat
    public native double minAvailableVideoZoomFactor();

    /**
     * [@property] activeDepthDataFormat
     * 
     * The currently active depth data format of the receiver.
     * 
     * This property can be used to get or set the device's currently active depth data format.
     * -setActiveDepthDataFormat: throws an NSInvalidArgumentException if set to a format not present in the
     * activeFormat's -supportedDepthDataFormats array. -setActiveDepthDataFormat: throws an NSGenericException if
     * called without first obtaining exclusive access to the receiver using lockForConfiguration:. Clients can observe
     * automatic changes to the receiver's activeDepthDataFormat by key value observing this property. On devices where
     * depth data is not supported, this property returns nil.
     * 
     * The frame rate of depth data may not be set directly. Depth data frame rate is synchronized to the device's
     * activeMin/MaxFrameDurations. It may match the device's current frame rate, or lower, if depth data cannot be
     * produced fast enough for the active video frame rate.
     * 
     * Delivery of depth data to a AVCaptureDepthDataOutput may increase the system load, resulting in a reduced video
     * frame rate for thermal sustainability.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setActiveDepthDataFormat:")
    public native void setActiveDepthDataFormat(@Nullable AVCaptureDeviceFormat value);

    /**
     * [@property] activeDepthDataMinFrameDuration
     * 
     * A property indicating the receiver's current active minimum depth data frame duration (the reciprocal of its
     * maximum depth data frame rate).
     * 
     * This property may be used to set an upper limit to the frame rate at which depth data is produced. Lowering the
     * depth data frame rate typically lowers power consumption which will increase the time the camera can run before
     * an elevated system pressure state is reached.
     * 
     * Setting this property to kCMTimeInvalid resets it to the active depth data format's default min frame duration.
     * Setting this property to kCMTimePositiveInfinity results in a depth data frame rate of 0.
     * 
     * The activeDepthDataMinFrameDuration gets reset whenever either the active video format or the active depth data
     * format changes.
     * 
     * -setActiveDepthDataMinFrameDuration: throws an NSRangeException if set to a value that is outside of the active
     * depth data format's supported frame rate range.
     * -setActiveDepthDataMinFrameDuration: throws an NSGenericException if called without first obtaining exclusive
     * access to the receiver using lockForConfiguration:.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("activeDepthDataMinFrameDuration")
    @ByValue
    public native CMTime activeDepthDataMinFrameDuration();

    /**
     * [@constant] activeMaxExposureDuration
     * 
     * The maximum exposure (integration) time that may be used by the auto exposure algorithm.
     * 
     * When an AVCaptureDevice's exposureMode is set to AVCaptureExposureModeAutoExpose or
     * AVCaptureExposureModeContinuousAutoExposure, the auto exposure algorithm picks a default max exposure duration
     * that is tuned for the current configuration, balancing low light image quality with motion preservation. By
     * querying or key-value observing this property, you may find out the current max exposure duration in use. You may
     * also override the default value by setting this property to a value between activeFormat.maxExposureDuration and
     * activeFormat.minExposureDuration. An NSRangeException is thrown if you pass an out-of-bounds exposure duration.
     * Setting the property to the special value of kCMTimeInvalid resets the auto exposure max duration to the device's
     * default for your current configuration. When the device's activeFormat or the AVCaptureSession's sessionPreset
     * changes, this property resets to the default max exposure duration for the new format or session preset.
     * 
     * On some devices, the auto exposure algorithm picks a different max exposure duration for a given format depending
     * whether you used the -[AVCaptureSession setSessionPreset:] API or the -[AVCaptureDevice setActiveFormat:] API to
     * set the format. To ensure uniform default handling of max exposure duration, you can set your
     * AVCaptureDeviceInput's unifiedAutoExposureDefaultsEnabled property to YES.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("activeMaxExposureDuration")
    @ByValue
    public native CMTime activeMaxExposureDuration();

    /**
     * [@property] constituentDevices
     * 
     * An array of constituent physical devices comprising a virtual device.
     * 
     * When called on a device for which virtualDevice == NO, an empty array is returned.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("constituentDevices")
    public native NSArray<? extends AVCaptureDevice> constituentDevices();

    /**
     * extrinsicMatrixFromDevice:toDevice:
     * 
     * An NSData containing the relative extrinsic matrix from one AVCaptureDevice to another.
     * 
     * The extrinsic matrix consists of a unitless 3x3 rotation matrix (R) on the left and a translation (t) 3x1 column
     * vector on the right. The translation vector's units are millimeters. The extrinsics of the "toDevice" camera are
     * expressed with respect to a reference camera "fromDevice". If X_from is a 3D point in "fromCamera"'s coordinate
     * system, then it can be projected into "toCamera"'s coordinate system with X_to = [R | t] * X_from. Note that a
     * matrix_float4x3 matrix is column major with 3 rows and 4 columns. The extrinsicMatrix is only provided for
     * physical cameras for which factory calibrations exist. Virtual device cameras return nil.
     * / \
     * / \ | r1,1 r1,2 r1,3 | t1 |
     * |R|t| = | r2,1 r2,2 r2,3 | t2 |
     * \ / | r3,1 r3,2 r3,3 | t3 |
     * \ /
     * 
     * Note that if you enable video stabilization (see AVCaptureConnection.preferredVideoStabilizationMode), the pixels
     * in stabilized video frames no longer match the relative extrinsicMatrix from one device to another due to
     * warping. The extrinsicMatrix and camera intrinsics should only be used when video stabilization is disabled.
     * 
     * API-Since: 13.0
     * 
     * @param fromDevice
     *                   The AVCaptureDevice to use as the source. Must be non nil or an NSInvalidArgumentException is
     *                   thrown.
     * @param toDevice
     *                   The AVCaptureDevice to use as the destination. Must be non nil or an NSInvalidArgumentException
     *                   is thrown.
     */
    @Nullable
    @Generated
    @Selector("extrinsicMatrixFromDevice:toDevice:")
    public static native NSData extrinsicMatrixFromDeviceToDevice(@NotNull AVCaptureDevice fromDevice,
            @NotNull AVCaptureDevice toDevice);

    /**
     * [@property] geometricDistortionCorrectionEnabled
     * 
     * Indicates whether geometric distortion correction is enabled by the receiver.
     * 
     * Where supported, the default value is YES. The receiver must be locked for configuration using
     * lockForConfiguration: before clients can set this method, otherwise an NSGenericException is thrown.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isGeometricDistortionCorrectionEnabled")
    public native boolean isGeometricDistortionCorrectionEnabled();

    /**
     * [@property] geometricDistortionCorrectionSupported
     * 
     * Indicates that geometric distortion correction is supported by the receiver.
     * 
     * Some AVCaptureDevices benefit from geometric distortion correction (GDC), such as devices with a very wide field
     * of view. GDC lessens the fisheye effect at the outer edge of the frame at the cost of losing a small amount of
     * vertical and horizontal field of view. When GDC is enabled on the AVCaptureDevice (see
     * geometricDistortionEnabled), the corrected image is upscaled to the original image size when needed. With respect
     * to the AVCaptureDevice.videoZoomFactor API, the full viewable field of view is always represented with a
     * videoZoomFactor of 1.0. Thus, when GDC is enabled, the AVCaptureDevice.activeFormat's field of view at
     * videoZoomFactor = 1.0 will be different than when GDC is disabled. The smaller field of view is reported through
     * the activeFormat's geometricDistortionCorrectedVideoFieldOfView property. Beware though that RAW photo captures
     * never have GDC applied, regardless of the value of AVCaptureDevice.geometricDistortionCorrectionEnabled.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isGeometricDistortionCorrectionSupported")
    public native boolean isGeometricDistortionCorrectionSupported();

    /**
     * [@property] globalToneMappingEnabled
     * 
     * Indicates whether the receiver should use global tone mapping.
     * 
     * Tone mapping is a technique used by the device to map the pixel levels in high dynamic range images to a more
     * limited dynamic range (such as 16 bit to 8 bit), while still retaining as close an appearance as possible.
     * Normally the device employs adaptive, local tone curves to preserve highest image quality and adapt quickly to
     * changing lighting conditions.
     * 
     * This property indicates to the receiver to use a global tone map. If set to YES, the tone map is adjusted
     * dynamically depending on the current scene and the same tone map is applied to all pixels in an image. If set to
     * its default value of NO, different tone maps may be applied to different pixels in an image.
     * 
     * globalToneMappingEnabled may only be set to YES if the receiver's activeFormat.isGlobalToneMappingSupported
     * property returns YES, otherwise an NSGenericException is thrown. Setting globalToneMappingEnabled throws an
     * NSGenericException if called without first obtaining exclusive access to the receiver using
     * lockForConfiguration:.
     * 
     * When global tone mapping is enabled, an AVCapturePhotoOutput connected to the AVCaptureDeviceInput’s session
     * disables all forms of still image fusion, resulting in still images with no automatic stabilization applied.
     * 
     * The receiver’s globalToneMappingEnabled resets to its default value of NO under the following conditions:
     * - The receiver’s activeFormat changes
     * - The receiver’s AVCaptureDeviceInput’s session’s sessionPreset changes
     * - The receiver’s AVCaptureDeviceInput is added to a session
     * 
     * Clients can observe automatic changes to the receiver's globalToneMappingEnabled by key value observing this
     * property.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isGlobalToneMappingEnabled")
    public native boolean isGlobalToneMappingEnabled();

    /**
     * [@property] virtualDevice
     * 
     * A property indicating whether the receiver is a virtual device consisting of constituent physical devices.
     * 
     * Two examples of virtual devices are:
     * The Dual Camera, which supports seamlessly switching between a wide and telephoto camera while zooming and
     * generating depth data from the disparities between the different points of view of the physical cameras.
     * The TrueDepth Camera, which generates depth data from disparities between a YUV camera and an Infrared camera
     * pointed in the same direction.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isVirtualDevice")
    public native boolean isVirtualDevice();

    /**
     * [@property] activeDepthDataMinFrameDuration
     * 
     * A property indicating the receiver's current active minimum depth data frame duration (the reciprocal of its
     * maximum depth data frame rate).
     * 
     * This property may be used to set an upper limit to the frame rate at which depth data is produced. Lowering the
     * depth data frame rate typically lowers power consumption which will increase the time the camera can run before
     * an elevated system pressure state is reached.
     * 
     * Setting this property to kCMTimeInvalid resets it to the active depth data format's default min frame duration.
     * Setting this property to kCMTimePositiveInfinity results in a depth data frame rate of 0.
     * 
     * The activeDepthDataMinFrameDuration gets reset whenever either the active video format or the active depth data
     * format changes.
     * 
     * -setActiveDepthDataMinFrameDuration: throws an NSRangeException if set to a value that is outside of the active
     * depth data format's supported frame rate range.
     * -setActiveDepthDataMinFrameDuration: throws an NSGenericException if called without first obtaining exclusive
     * access to the receiver using lockForConfiguration:.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setActiveDepthDataMinFrameDuration:")
    public native void setActiveDepthDataMinFrameDuration(@ByValue CMTime value);

    /**
     * [@constant] activeMaxExposureDuration
     * 
     * The maximum exposure (integration) time that may be used by the auto exposure algorithm.
     * 
     * When an AVCaptureDevice's exposureMode is set to AVCaptureExposureModeAutoExpose or
     * AVCaptureExposureModeContinuousAutoExposure, the auto exposure algorithm picks a default max exposure duration
     * that is tuned for the current configuration, balancing low light image quality with motion preservation. By
     * querying or key-value observing this property, you may find out the current max exposure duration in use. You may
     * also override the default value by setting this property to a value between activeFormat.maxExposureDuration and
     * activeFormat.minExposureDuration. An NSRangeException is thrown if you pass an out-of-bounds exposure duration.
     * Setting the property to the special value of kCMTimeInvalid resets the auto exposure max duration to the device's
     * default for your current configuration. When the device's activeFormat or the AVCaptureSession's sessionPreset
     * changes, this property resets to the default max exposure duration for the new format or session preset.
     * 
     * On some devices, the auto exposure algorithm picks a different max exposure duration for a given format depending
     * whether you used the -[AVCaptureSession setSessionPreset:] API or the -[AVCaptureDevice setActiveFormat:] API to
     * set the format. To ensure uniform default handling of max exposure duration, you can set your
     * AVCaptureDeviceInput's unifiedAutoExposureDefaultsEnabled property to YES.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setActiveMaxExposureDuration:")
    public native void setActiveMaxExposureDuration(@ByValue CMTime value);

    /**
     * [@property] geometricDistortionCorrectionEnabled
     * 
     * Indicates whether geometric distortion correction is enabled by the receiver.
     * 
     * Where supported, the default value is YES. The receiver must be locked for configuration using
     * lockForConfiguration: before clients can set this method, otherwise an NSGenericException is thrown.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setGeometricDistortionCorrectionEnabled:")
    public native void setGeometricDistortionCorrectionEnabled(boolean value);

    /**
     * [@property] globalToneMappingEnabled
     * 
     * Indicates whether the receiver should use global tone mapping.
     * 
     * Tone mapping is a technique used by the device to map the pixel levels in high dynamic range images to a more
     * limited dynamic range (such as 16 bit to 8 bit), while still retaining as close an appearance as possible.
     * Normally the device employs adaptive, local tone curves to preserve highest image quality and adapt quickly to
     * changing lighting conditions.
     * 
     * This property indicates to the receiver to use a global tone map. If set to YES, the tone map is adjusted
     * dynamically depending on the current scene and the same tone map is applied to all pixels in an image. If set to
     * its default value of NO, different tone maps may be applied to different pixels in an image.
     * 
     * globalToneMappingEnabled may only be set to YES if the receiver's activeFormat.isGlobalToneMappingSupported
     * property returns YES, otherwise an NSGenericException is thrown. Setting globalToneMappingEnabled throws an
     * NSGenericException if called without first obtaining exclusive access to the receiver using
     * lockForConfiguration:.
     * 
     * When global tone mapping is enabled, an AVCapturePhotoOutput connected to the AVCaptureDeviceInput’s session
     * disables all forms of still image fusion, resulting in still images with no automatic stabilization applied.
     * 
     * The receiver’s globalToneMappingEnabled resets to its default value of NO under the following conditions:
     * - The receiver’s activeFormat changes
     * - The receiver’s AVCaptureDeviceInput’s session’s sessionPreset changes
     * - The receiver’s AVCaptureDeviceInput is added to a session
     * 
     * Clients can observe automatic changes to the receiver's globalToneMappingEnabled by key value observing this
     * property.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setGlobalToneMappingEnabled:")
    public native void setGlobalToneMappingEnabled(boolean value);

    /**
     * [@property] systemPressureState
     * 
     * A key-value observable property indicating the capture device's current system pressure state.
     * 
     * This property indicates whether the capture device is currently subject to an elevated system pressure condition.
     * When system pressure reaches AVCaptureSystemPressureLevelShutdown, the capture device cannot continue to provide
     * input, so the AVCaptureSession becomes interrupted until the pressured state abates. System pressure can be
     * effectively mitigated by lowering the device's activeVideoMinFrameDuration in response to changes in the
     * systemPressureState. Clients are encouraged to implement frame rate throttling to bring system pressure down if
     * their capture use case can tolerate a reduced frame rate.
     * 
     * API-Since: 11.1
     */
    @NotNull
    @Generated
    @Selector("systemPressureState")
    public native AVCaptureSystemPressureState systemPressureState();

    /**
     * [@property] virtualDeviceSwitchOverVideoZoomFactors
     * 
     * An array of video zoom factors at or above which a virtual device (such as the Dual Camera) may switch to its
     * next constituent device.
     * 
     * This array contains zoom factors at which one of the constituent device's field of view matches the next
     * constituent device's full field of view. The number of switch over video zoom factors is always one less than the
     * count of the constituentDevices property, and the factors progress in the same order as the devices listed in
     * that property. On non-virtual devices this property returns an empty array.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("virtualDeviceSwitchOverVideoZoomFactors")
    public native NSArray<? extends NSNumber> virtualDeviceSwitchOverVideoZoomFactors();

    /**
     * [@property] suspended
     * 
     * Indicates whether the device is suspended.
     * 
     * The value of this property is a BOOL indicating whether the device represented by the receiver is currently
     * suspended. Some devices disallow data capture due to a feature on the device. For example, isSuspended returns
     * YES for the external iSight when its privacy iris is closed, or for the internal iSight on a notebook when the
     * notebook's display is closed. Clients can key value observe the value of this property to be notified when the
     * device becomes suspended or unsuspended.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("isSuspended")
    public native boolean isSuspended();

    /**
     * [@property] manufacturer
     * 
     * The human-readable manufacturer name for the receiver.
     * 
     * This property can be used to identify capture devices from a particular manufacturer. All Apple devices return
     * "Apple Inc.". Devices from third party manufacturers may return an empty string.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("manufacturer")
    public native String manufacturer();

    /**
     * [@property] activeMicrophoneMode
     * 
     * Indicates the currently active microphone mode.
     * 
     * This readonly property returns the currently active microphone mode, which may differ from the
     * preferredMicrophoneMode if the application's active audio route does not support the preferred microphone mode.
     * This property is key-value observable.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("activeMicrophoneMode")
    @NInt
    public static native long activeMicrophoneMode();

    /**
     * [@property] activePrimaryConstituentDevice
     * 
     * For virtual devices, this property indicates which constituent device is currently the primary constituent
     * device. The primary constituent device may change when zoom, exposure, or focus changes.
     * 
     * This property returns nil for non-virtual devices. On virtual devices this property returns nil until the device
     * is used in a running AVCaptureSession. This property is key-value observable.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("activePrimaryConstituentDevice")
    public native AVCaptureDevice activePrimaryConstituentDevice();

    /**
     * [@property] activePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditions
     * 
     * The active constituent device restricted switching behavior.
     * 
     * For virtual devices with multiple constituent devices, this property returns the active restricted switching
     * behavior conditions. This is equal to primaryConstituentDeviceRestrictedSwitchingBehaviorConditions except while
     * recording using an AVCaptureMovieFileOutput configured with different retricted switching behavior conditions
     * (see -[AVCaptureMovieFileOutput
     * setPrimaryConstituentDeviceSwitchingBehaviorForRecording:restrictedSwitchingBehaviorConditions]). Devices that do
     * not support constituent device switching return
     * AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditionNone. This property is key-value observable.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("activePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditions")
    @NUInt
    public native long activePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditions();

    /**
     * [@property] activePrimaryConstituentDeviceSwitchingBehavior
     * 
     * The active constituent device switching behavior.
     * 
     * For virtual devices with multiple constituent devices, this property returns the active switching behavior. This
     * is equal to primaryConstituentDeviceSwitchingBehavior except while recording using an AVCaptureMovieFileOutput
     * configured with a different switching behavior (see -[AVCaptureMovieFileOutput
     * setPrimaryConstituentDeviceSwitchingBehavior:restrictedSwitchingBehaviorConditions]). Devices that do not support
     * constituent device switching return AVCapturePrimaryConstituentDeviceSwitchingBehaviorUnsupported. This property
     * is key-value observable.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("activePrimaryConstituentDeviceSwitchingBehavior")
    @NInt
    public native long activePrimaryConstituentDeviceSwitchingBehavior();

    /**
     * [@property] centerStageControlMode
     * 
     * A class property indicating the current mode of Center Stage control (user, app, or cooperative).
     * 
     * This class property determines how the Center Stage feature is controlled. When set to the default value of
     * AVCaptureCenterStageControlModeUser, centerStageEnabled may not be set programmatically and throws an
     * NSInvalidArgumentException. In User mode, the feature may only be set by the user in Control Center. If you wish
     * to take Center Stage control away from the user and exclusively enable / disable it programmatically, set this
     * property to AVCaptureCenterStageControlModeApp. When under exclusive app control, Center Stage user control is
     * disallowed (for instance, the toggle is grayed out in Control Center). If you wish to take control of Center
     * Stage, but also cooperate with the user by listening for and appropriately reacting to their changes to the
     * centerStageEnabled property, set this property to AVCaptureCenterStageControlModeCooperative. Note that in this
     * mode, the onus is on you, the app developer, to honor user intent and conform your AVCaptureSession configuration
     * to make Center Stage active (see the AVCaptureDevice instance property centerStageActive). In cooperative mode,
     * the centerStageEnabled property may change at any time (such as when the user enables / disables the feature in
     * Control Center).
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("centerStageControlMode")
    @NInt
    public static native long centerStageControlMode();

    /**
     * [@property] fallbackPrimaryConstituentDevices
     * 
     * The constituent devices that may be used as a fallback device when a constituent device with a longer focal
     * length becomes limited by its light sensitivity or minimum focus distance.
     * 
     * This may only be set to the supportedFallbackPrimaryConstituentDevices or a subset thereof. By default this is
     * set to all supportedFallbackPrimaryConstituentDevices. This property will throw an NSInvalidArgumentException if
     * the array includes any device not reported in supportedFallbackPrimaryConstituentDevices. This property is
     * key-value observable.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("fallbackPrimaryConstituentDevices")
    public native NSArray<? extends AVCaptureDevice> fallbackPrimaryConstituentDevices();

    /**
     * [@property] centerStageActive
     * 
     * Indicates whether Center Stage is currently active on a particular AVCaptureDevice.
     * 
     * This readonly property returns YES when Center Stage is currently active on the receiver. When active, the camera
     * automatically adjusts to keep people optimally framed within the field of view. The field of view may pan,
     * tighten or widen as needed. Certain restrictions come into play when Center Stage is active:
     * - The device's minAvailableVideoZoomFactor and maxAvailableVideoZoomFactor become restricted (see
     * AVCaptureDeviceFormat's videoMinZoomFactorForCenterStage and videoMaxZoomFactorForCenterStage).
     * - The device's activeVideoMinFrameDuration and activeVideoMaxFrameDuration are limited (see
     * AVCaptureDeviceFormat's videoFrameRateRangeForCenterStage).
     * Center Stage may be enabled via user control or application control, depending on the current
     * +AVCaptureDevice.centerStageControlMode. When +AVCaptureDevice.centerStageEnabled is YES, a particular
     * AVCaptureDevice instance may return YES for this property, depending whether it supports the feature in its
     * current configuration. Some device features are mutually exclusive to Center Stage:
     * - If depth data delivery is enabled on any output, such as AVCaptureDepthDataOutput, or
     * -AVCapturePhotoOutput.depthDataDeliveryEnabled, Center Stage is deactivated.
     * - If geometricDistortionCorrectionSupported is YES, geometricDistortionCorrectionEnabled must also be YES, or
     * Center Stage is deactivated.
     * This property is key-value observable.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("isCenterStageActive")
    public native boolean isCenterStageActive();

    /**
     * [@property] centerStageEnabled
     * 
     * A class property indicating whether the Center Stage feature is currently enabled or disabled (such as in Control
     * Center or programmatically via your app).
     * 
     * This property may only be set if centerStageControlMode is AVCaptureCenterStageControlModeApp or
     * AVCaptureCenterStageControlModeCooperative, and otherwise throws an NSInvalidArgumentException. When
     * centerStageControlMode is AVCaptureCenterStageControlModeUser or AVCaptureCenterStageControlModeCooperative, this
     * property may change according to user desire (such as enabling / disabling the feature in Control Center), so you
     * should key-value observe it.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("isCenterStageEnabled")
    public static native boolean isCenterStageEnabled();

    /**
     * [@property] portraitEffectActive
     * 
     * Indicates whether Portrait Effect is currently active for a particular AVCaptureDevice.
     * 
     * This readonly property returns YES when Portrait Effect is currently active on the receiver. When active, the
     * device blurs the background, simulating a shallow depth of field effect. Certain restrictions come into play when
     * Portrait Effect is active:
     * - The device's activeVideoMinFrameDuration and activeVideoMaxFrameDuration are limited (see
     * AVCaptureDeviceFormat's videoFrameRateRangeForPortraitEffect).
     * Note that when +AVCaptureDevice.portraitEffectEnabled is YES, a particular AVCaptureDevice instance may return
     * YES for this property, depending whether it supports the feature in its current configuration.
     * This property is key-value observable.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isPortraitEffectActive")
    public native boolean isPortraitEffectActive();

    /**
     * [@property] portraitEffectEnabled
     * 
     * A class property indicating whether the Portrait Effect feature is currently enabled in Control Center.
     * 
     * This property changes to reflect the Portrait Effect state in Control Center. It is key-value observable. On iOS,
     * Portrait Effect only applies to video conferencing apps by default (apps that use "voip" as one of their
     * UIBackgroundModes). Non video conferencing apps may opt in for the Portrait Effect by adding the following key to
     * their Info.plist:
     * <key>NSCameraPortraitEffectEnabled</key>
     * <true/>
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isPortraitEffectEnabled")
    public static native boolean isPortraitEffectEnabled();

    /**
     * [@property] minimumFocusDistance
     * 
     * A property indicating the minimum focus distance.
     * 
     * The minimum focus distance is given in millimeters, -1 if unknown. For virtual cameras
     * (AVCaptureDeviceTypeBuiltInDualCamera, AVCaptureDeviceTypeBuiltInTripleCamera, etc.), the value reported is the
     * smallest minimum focus distance of the auto-focus-capable cameras that it sources.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("minimumFocusDistance")
    @NInt
    public native long minimumFocusDistance();

    /**
     * [@property] preferredMicrophoneMode
     * 
     * Indicates the microphone mode that has been selected by the user in Control Center.
     * 
     * This readonly property returns the microphone mode selected by the user in Control Center. It is key-value
     * observable.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("preferredMicrophoneMode")
    @NInt
    public static native long preferredMicrophoneMode();

    /**
     * [@property] primaryConstituentDeviceRestrictedSwitchingBehaviorConditions
     * 
     * The primaryConstituentDeviceRestrictedSwitchingBehaviorConditions as set by -[AVCaptureDevice
     * setPrimaryConstituentDeviceSwitchingBehavior:restrictedSwitchingBehaviorConditions:].
     * 
     * By default, this propety is set to AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditionNone.
     * This property is key-value observable.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("primaryConstituentDeviceRestrictedSwitchingBehaviorConditions")
    @NUInt
    public native long primaryConstituentDeviceRestrictedSwitchingBehaviorConditions();

    /**
     * [@property] primaryConstituentDeviceSwitchingBehavior
     * 
     * The primaryConstituentDeviceSwitchingBehavior as set by -[AVCaptureDevice
     * setPrimaryConstituentDeviceSwitchingBehavior:restrictedSwitchingBehaviorConditions:].
     * 
     * By default, this property is set to AVCapturePrimaryConstituentDeviceSwitchingBehaviorAuto for AVCaptureDevices
     * that support it. This property is key-value observable.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("primaryConstituentDeviceSwitchingBehavior")
    @NInt
    public native long primaryConstituentDeviceSwitchingBehavior();

    /**
     * [@property] centerStageControlMode
     * 
     * A class property indicating the current mode of Center Stage control (user, app, or cooperative).
     * 
     * This class property determines how the Center Stage feature is controlled. When set to the default value of
     * AVCaptureCenterStageControlModeUser, centerStageEnabled may not be set programmatically and throws an
     * NSInvalidArgumentException. In User mode, the feature may only be set by the user in Control Center. If you wish
     * to take Center Stage control away from the user and exclusively enable / disable it programmatically, set this
     * property to AVCaptureCenterStageControlModeApp. When under exclusive app control, Center Stage user control is
     * disallowed (for instance, the toggle is grayed out in Control Center). If you wish to take control of Center
     * Stage, but also cooperate with the user by listening for and appropriately reacting to their changes to the
     * centerStageEnabled property, set this property to AVCaptureCenterStageControlModeCooperative. Note that in this
     * mode, the onus is on you, the app developer, to honor user intent and conform your AVCaptureSession configuration
     * to make Center Stage active (see the AVCaptureDevice instance property centerStageActive). In cooperative mode,
     * the centerStageEnabled property may change at any time (such as when the user enables / disables the feature in
     * Control Center).
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("setCenterStageControlMode:")
    public static native void setCenterStageControlMode(@NInt long value);

    /**
     * [@property] centerStageEnabled
     * 
     * A class property indicating whether the Center Stage feature is currently enabled or disabled (such as in Control
     * Center or programmatically via your app).
     * 
     * This property may only be set if centerStageControlMode is AVCaptureCenterStageControlModeApp or
     * AVCaptureCenterStageControlModeCooperative, and otherwise throws an NSInvalidArgumentException. When
     * centerStageControlMode is AVCaptureCenterStageControlModeUser or AVCaptureCenterStageControlModeCooperative, this
     * property may change according to user desire (such as enabling / disabling the feature in Control Center), so you
     * should key-value observe it.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("setCenterStageEnabled:")
    public static native void setCenterStageEnabled(boolean value);

    /**
     * [@property] fallbackPrimaryConstituentDevices
     * 
     * The constituent devices that may be used as a fallback device when a constituent device with a longer focal
     * length becomes limited by its light sensitivity or minimum focus distance.
     * 
     * This may only be set to the supportedFallbackPrimaryConstituentDevices or a subset thereof. By default this is
     * set to all supportedFallbackPrimaryConstituentDevices. This property will throw an NSInvalidArgumentException if
     * the array includes any device not reported in supportedFallbackPrimaryConstituentDevices. This property is
     * key-value observable.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setFallbackPrimaryConstituentDevices:")
    public native void setFallbackPrimaryConstituentDevices(@NotNull NSArray<? extends AVCaptureDevice> value);

    /**
     * setPrimaryConstituentDeviceSwitchingBehavior:restrictedSwitchingBehaviorConditions:
     * 
     * The switching behavior and conditions, unless overwritten via -[AVCaptureMovieFileOutput
     * setPrimaryConstituentDeviceSwitchingBehavior:restrictedSwitchingBehaviorConditions].
     * 
     * The switching behavior may be overridden on the AVCaptureMovieFileOutput while recording (see
     * -[AVCaptureMovieFileOutput setPrimaryConstituentDeviceSwitchingBehavior:restrictedSwitchingBehaviorConditions]).
     * This method throws an NSInvalidArgumentException if constituent device switching is not supported by the receiver
     * or if restrictedSwitchingBehaviorConditions is not equal to
     * AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditionNone and switchingBehavior is not equal to
     * AVCapturePrimaryConstituentDeviceSwitchingBehaviorRestricted.
     * 
     * API-Since: 15.0
     * 
     * @param switchingBehavior
     *                                              The desired switching behavior.
     * @param restrictedSwitchingBehaviorConditions
     *                                              The desired conditions for restricting camera switching. This must
     *                                              be set to
     *                                              AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditionNone
     *                                              whenever switchingBehavior is not equal to
     *                                              AVCapturePrimaryConstituentDeviceSwitchingBehaviorRestricted.
     */
    @Generated
    @Selector("setPrimaryConstituentDeviceSwitchingBehavior:restrictedSwitchingBehaviorConditions:")
    public native void setPrimaryConstituentDeviceSwitchingBehaviorRestrictedSwitchingBehaviorConditions(
            @NInt long switchingBehavior, @NUInt long restrictedSwitchingBehaviorConditions);

    /**
     * showSystemUserInterface:
     * 
     * Displays the system's user interface for video effects or microphone modes.
     * 
     * This method allows the calling application to prompt the user to make changes to Video Effects (such as Center
     * Stage or the Portrait Effect) or Microphone Modes. It brings up the system user interface and deep links to the
     * appropriate module. This method is non-blocking. After presenting the desired system user interface, control
     * returns immediately to the application.
     * 
     * API-Since: 15.0
     * 
     * @param systemUserInterface
     *                            The system UI to show.
     */
    @Generated
    @Selector("showSystemUserInterface:")
    public static native void showSystemUserInterface(@NInt long systemUserInterface);

    /**
     * [@property] supportedFallbackPrimaryConstituentDevices
     * 
     * The constituent devices that may be selected as a fallback for a longer focal length primary constituent device.
     * 
     * This property returns an empty array for non-virtual devices. This property never changes for a given virtual
     * device.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("supportedFallbackPrimaryConstituentDevices")
    public native NSArray<? extends AVCaptureDevice> supportedFallbackPrimaryConstituentDevices();

    /**
     * [@property] automaticallyAdjustsFaceDrivenAutoExposureEnabled
     * 
     * Indicates whether the receiver should automatically adjust face-driven auto exposure.
     * 
     * The value of this property is a BOOL that determines the receiver's automatic adjustment of face-driven auto
     * exposure. Default is YES on all platforms, if the receiver supports auto exposure. This property must be set to
     * NO before manually setting faceDrivenAutoExposureEnabled to YES/NO.
     * -setAutomaticallyAdjustsFaceDrivenAutoExposureEnabled: throws an NSInvalidArgumentException if the receiver
     * doesn't support auto exposure. -setAutomaticallyAdjustsFaceDrivenAutoExposureEnabled: throws an
     * NSGenericException if called without first obtaining exclusive access to the receiver using
     * -lockForConfiguration:. After setting automaticallyAdjustsFaceDrivenAutoExposureEnabled, call -setExposureMode:
     * to apply the change.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("automaticallyAdjustsFaceDrivenAutoExposureEnabled")
    public native boolean automaticallyAdjustsFaceDrivenAutoExposureEnabled();

    /**
     * [@property] automaticallyAdjustsFaceDrivenAutoFocusEnabled
     * 
     * Indicates whether the receiver should automatically adjust face-driven autofocus.
     * 
     * The value of this property is a BOOL that determines the receiver's automatic adjustment of face-driven
     * autofocus. Default is YES on all platforms, if the receiver supports autofocus. This property must be set to NO
     * before manually setting faceDrivenAutoFocusEnabled to YES/NO. -setAutomaticallyAdjustsFaceDrivenAutoFocusEnabled:
     * throws an NSInvalidArgumentException if the receiver doesn't support autofocus.
     * -setAutomaticallyAdjustsFaceDrivenAutoFocusEnabled: throws an NSGenericException if called without first
     * obtaining exclusive access to the receiver using -lockForConfiguration:. After setting
     * automaticallyAdjustsFaceDrivenAutoFocusEnabled, call -setFocusMode: to apply the change.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("automaticallyAdjustsFaceDrivenAutoFocusEnabled")
    public native boolean automaticallyAdjustsFaceDrivenAutoFocusEnabled();

    /**
     * [@property] companionDeskViewCamera
     * 
     * A reference to the Desk View Camera that is associated with and derived from this camera.
     * 
     * The companionDeskViewCamera property allows you to discover if the receiver has a paired Desk View Camera which
     * derives its desk framing from the receiver's ultra wide frame. In the presence of multiple Continuity Cameras,
     * this property allows you to pair a particular Continuity Camera with its associated Desk View Camera.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("companionDeskViewCamera")
    public native AVCaptureDevice companionDeskViewCamera();

    /**
     * [@property] continuityCamera
     * 
     * A property that reports YES if the receiver is a Continuity Camera.
     * 
     * Access this property to discover if the receiver is a Continuity Camera (external iPhone webcam).
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isContinuityCamera")
    public native boolean isContinuityCamera();

    /**
     * [@property] faceDrivenAutoExposureEnabled
     * 
     * Indicates whether face-driven auto exposure is enabled on the receiver.
     * 
     * Default is YES for all apps linked on or after iOS 15.4 when the receiver supports auto exposure.
     * -setFaceDrivenAutoExposureEnabled: throws an NSInvalidArgumentException if
     * automaticallyAdjustsFaceDrivenAutoExposureEnabled returns YES. -setFaceDrivenAutoExposureEnabled: throws an
     * NSInvalidArgumentException if the receiver doesn't support auto exposure. -setFaceDrivenAutoExposureEnabled:
     * throws an NSGenericException if called without first obtaining exclusive access to the receiver using
     * -lockForConfiguration:. Note that setting faceDrivenAutoExposureEnabled alone does not initiate this exposure
     * change operation. After setting faceDrivenAutoExposureEnabled, call -setExposureMode: to apply the change.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("isFaceDrivenAutoExposureEnabled")
    public native boolean isFaceDrivenAutoExposureEnabled();

    /**
     * [@property] faceDrivenAutoFocusEnabled
     * 
     * Indicates whether face-driven autofocus is enabled on the receiver.
     * 
     * Default is YES for all apps linked on or after iOS 15.4 when the receiver supports autofocus.
     * -setFaceDrivenAutoFocusEnabled: throws an NSInvalidArgumentException if
     * automaticallyAdjustsFaceDrivenAutoFocusEnabled returns YES. -setFaceDrivenAutoFocusEnabled: throws an
     * NSInvalidArgumentException if the receiver doesn't support autofocus. -setFaceDrivenAutoFocusEnabled: throws an
     * NSGenericException if called without first obtaining exclusive access to the receiver using
     * -lockForConfiguration:. Note that setting faceDrivenAutoFocusEnabled alone does not initiate this focus change
     * operation. After setting faceDrivenAutoFocusEnabled, call -setFocusMode: to apply the change.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("isFaceDrivenAutoFocusEnabled")
    public native boolean isFaceDrivenAutoFocusEnabled();

    /**
     * [@property] studioLightActive
     * 
     * Indicates whether Studio Light is currently active on a particular AVCaptureDevice.
     * 
     * This readonly property returns YES when Studio Light is currently active on the receiver. When active, the
     * subject's face is artificially lit to simulate the presence of a studio light near the camera.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isStudioLightActive")
    public native boolean isStudioLightActive();

    /**
     * [@property] studioLightEnabled
     * 
     * A class property indicating whether the Studio Light feature is currently enabled in Control Center.
     * 
     * This property changes to reflect the Studio Light state in Control Center. It is key-value observable. On iOS,
     * Studio Light only applies to video conferencing apps by default (apps that use "voip" as one of their
     * UIBackgroundModes). Non video conferencing apps may opt in for Studio Light by adding the following key to their
     * Info.plist:
     * <key>NSCameraStudioLightEnabled</key>
     * <true/>
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isStudioLightEnabled")
    public static native boolean isStudioLightEnabled();

    /**
     * [@property] automaticallyAdjustsFaceDrivenAutoExposureEnabled
     * 
     * Indicates whether the receiver should automatically adjust face-driven auto exposure.
     * 
     * The value of this property is a BOOL that determines the receiver's automatic adjustment of face-driven auto
     * exposure. Default is YES on all platforms, if the receiver supports auto exposure. This property must be set to
     * NO before manually setting faceDrivenAutoExposureEnabled to YES/NO.
     * -setAutomaticallyAdjustsFaceDrivenAutoExposureEnabled: throws an NSInvalidArgumentException if the receiver
     * doesn't support auto exposure. -setAutomaticallyAdjustsFaceDrivenAutoExposureEnabled: throws an
     * NSGenericException if called without first obtaining exclusive access to the receiver using
     * -lockForConfiguration:. After setting automaticallyAdjustsFaceDrivenAutoExposureEnabled, call -setExposureMode:
     * to apply the change.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("setAutomaticallyAdjustsFaceDrivenAutoExposureEnabled:")
    public native void setAutomaticallyAdjustsFaceDrivenAutoExposureEnabled(boolean value);

    /**
     * [@property] automaticallyAdjustsFaceDrivenAutoFocusEnabled
     * 
     * Indicates whether the receiver should automatically adjust face-driven autofocus.
     * 
     * The value of this property is a BOOL that determines the receiver's automatic adjustment of face-driven
     * autofocus. Default is YES on all platforms, if the receiver supports autofocus. This property must be set to NO
     * before manually setting faceDrivenAutoFocusEnabled to YES/NO. -setAutomaticallyAdjustsFaceDrivenAutoFocusEnabled:
     * throws an NSInvalidArgumentException if the receiver doesn't support autofocus.
     * -setAutomaticallyAdjustsFaceDrivenAutoFocusEnabled: throws an NSGenericException if called without first
     * obtaining exclusive access to the receiver using -lockForConfiguration:. After setting
     * automaticallyAdjustsFaceDrivenAutoFocusEnabled, call -setFocusMode: to apply the change.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("setAutomaticallyAdjustsFaceDrivenAutoFocusEnabled:")
    public native void setAutomaticallyAdjustsFaceDrivenAutoFocusEnabled(boolean value);

    /**
     * [@property] faceDrivenAutoExposureEnabled
     * 
     * Indicates whether face-driven auto exposure is enabled on the receiver.
     * 
     * Default is YES for all apps linked on or after iOS 15.4 when the receiver supports auto exposure.
     * -setFaceDrivenAutoExposureEnabled: throws an NSInvalidArgumentException if
     * automaticallyAdjustsFaceDrivenAutoExposureEnabled returns YES. -setFaceDrivenAutoExposureEnabled: throws an
     * NSInvalidArgumentException if the receiver doesn't support auto exposure. -setFaceDrivenAutoExposureEnabled:
     * throws an NSGenericException if called without first obtaining exclusive access to the receiver using
     * -lockForConfiguration:. Note that setting faceDrivenAutoExposureEnabled alone does not initiate this exposure
     * change operation. After setting faceDrivenAutoExposureEnabled, call -setExposureMode: to apply the change.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("setFaceDrivenAutoExposureEnabled:")
    public native void setFaceDrivenAutoExposureEnabled(boolean value);

    /**
     * [@property] faceDrivenAutoFocusEnabled
     * 
     * Indicates whether face-driven autofocus is enabled on the receiver.
     * 
     * Default is YES for all apps linked on or after iOS 15.4 when the receiver supports autofocus.
     * -setFaceDrivenAutoFocusEnabled: throws an NSInvalidArgumentException if
     * automaticallyAdjustsFaceDrivenAutoFocusEnabled returns YES. -setFaceDrivenAutoFocusEnabled: throws an
     * NSInvalidArgumentException if the receiver doesn't support autofocus. -setFaceDrivenAutoFocusEnabled: throws an
     * NSGenericException if called without first obtaining exclusive access to the receiver using
     * -lockForConfiguration:. Note that setting faceDrivenAutoFocusEnabled alone does not initiate this focus change
     * operation. After setting faceDrivenAutoFocusEnabled, call -setFocusMode: to apply the change.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("setFaceDrivenAutoFocusEnabled:")
    public native void setFaceDrivenAutoFocusEnabled(boolean value);

    /**
     * [@property] availableReactionTypes
     * 
     * Returns a list of reaction types which can be passed to performEffectForReaction.
     * 
     * The list may differ between devices, or be affected by changes to active format, and can be key-value observed.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("availableReactionTypes")
    @NotNull
    public native NSSet<String> availableReactionTypes();

    /**
     * [@property] canPerformReactionEffects
     * 
     * Indicates whether reactions can be performed on a particular AVCaptureDevice. This requires
     * reactionEffectsEnabled to be YES, as well as using a AVCaptureDeviceFormat with reactionEffectsSupported.
     * 
     * This readonly property returns YES when resources for reactions are available on the device instance. When YES,
     * calls to performEffectForReaction: will render on the video feed, otherwise those calls are ignored. It is
     * key-value observable.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("canPerformReactionEffects")
    public native boolean canPerformReactionEffects();

    /**
     * [@property] centerStageRectOfInterest
     * 
     * Specifies the effective region within the output pixel buffer that will be used to perform Center Stage framing.
     * 
     * Applications that wish to apply additional processing (such as cropping) on top of Center Stage's output can use
     * this property to guide Center Stage's framing.
     * 
     * The rectangle's origin is top left and is relative to the coordinate space of the output pixel buffer. The
     * default value of this property is the value CGRectMake(0, 0, 1, 1), where {0,0} represents the top left of the
     * picture area, and {1,1} represents the bottom right on an unrotated picture. This rectangle of interest is
     * applied prior to rotation, mirroring or scaling.
     * 
     * Pixels outside of this rectangle of interest will be blackened out.
     * 
     * Setting this property has no impact on objects specified in the metadata output.
     * 
     * -setCenterStageRectOfInterest: throws an NSGenericException if called without first obtaining exclusive access to
     * the receiver using -lockForConfiguration:. -setCenterStageRectOfInterest: throws an NSInvalidArgumentException if
     * none of the AVCaptureDeviceFormats supported by the receiver support CenterStage. -setCenterStageRectOfInterest:
     * throws an NSInvalidArgumentException if +centerStageEnabled is NO on the AVCaptureDevice class.
     * -setCenterStageRectOfInterest: throws an NSInvalidArgumentException if the provided rectOfInterest goes outside
     * the normalized (0-1) coordinate space.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("centerStageRectOfInterest")
    @ByValue
    public native CGRect centerStageRectOfInterest();

    /**
     * performEffectForReaction:
     * 
     * Triggers a specified reaction on the video stream.
     * 
     * The entries in reactionEffectsInProgress may not reflect one-to-one against calls to this method. Depending on
     * reaction style or resource limits, triggering multiple overlapping reactions of the same type may be coalesced
     * into extending an existing reaction rather than overlaying a new one.
     * 
     * The reactionType requested must be one of those listed in availableReactionTypes or an exception will be thrown.
     * Performing a reaction when canPerformReactionEffects is NO is ignored, and VoIP applications are encouraged to
     * transmit and display such reactions outside of the video feed.
     * 
     * API-Since: 17.0
     * 
     * @param reactionType
     *                     Indicates which reaction to perform.
     */
    @Generated
    @Selector("performEffectForReaction:")
    public native void performEffectForReaction(@NotNull String reactionType);

    /**
     * [@property] reactionEffectGesturesEnabled
     * 
     * A class property indicating whether gesture detection will trigger reaction effects on the video stream. Gesture
     * detection will only run when the device's activeFormat.reactionEffectsSupported is also YES, which will be
     * reflected by canPerformReactionEffects.
     * 
     * This property changes to reflect the Gestures state in Control Center. It is key-value observable. Clients can
     * call performEffectForReaction: independently of whether gesture detection is enabled, reaction effects from
     * either source will be intermixed.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("reactionEffectGesturesEnabled")
    public static native boolean reactionEffectGesturesEnabled();

    /**
     * [@property] reactionEffectsEnabled
     * 
     * A class property indicating whether the application is suitable for reaction effects, either by automatic gesture
     * detection, or by calls to -[AVCaptureDevice performEffectForReaction:]. Reactions are only rendered when the
     * device's activeFormat.reactionEffectsSupported is also YES, which will be reflected by canPerformReactionEffects
     * when the feature is both enabled and supported.
     * 
     * On macOS, Reaction Effects are enabled by default for all applications. On iOS, Reaction Effects are enabled by
     * default for video conferencing applications (apps that use "voip" as one of their UIBackgroundModes). Non video
     * conferencing applications may opt in for Reaction Effects by adding the following key to their Info.plist:
     * <key>NSCameraReactionEffectsEnabled</key>
     * <true/>
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("reactionEffectsEnabled")
    public static native boolean reactionEffectsEnabled();

    /**
     * [@property] reactionEffectsInProgress
     * 
     * Contains an array of reaction effects that are currently being performed by the device, sorted by timestamp. If
     * observing old and new values in the KVO callback, the reaction effects which are still running in the new array
     * will have kCMTimeInvalid as their endTime property. Reaction effects which have ended will only be in the old
     * array, and will have their endTime property set to the presentation time of the first frame where the reaction
     * effect was no longer present.
     * 
     * Reaction effects which are triggered by either a call to performEffectForReaction: or by the automatic gesture
     * detection will be reflected in this array. It is key-value observable to be notified when reaction effects begin
     * or end.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("reactionEffectsInProgress")
    @NotNull
    public native NSArray<? extends AVCaptureReactionEffectState> reactionEffectsInProgress();

    /**
     * [@property] centerStageRectOfInterest
     * 
     * Specifies the effective region within the output pixel buffer that will be used to perform Center Stage framing.
     * 
     * Applications that wish to apply additional processing (such as cropping) on top of Center Stage's output can use
     * this property to guide Center Stage's framing.
     * 
     * The rectangle's origin is top left and is relative to the coordinate space of the output pixel buffer. The
     * default value of this property is the value CGRectMake(0, 0, 1, 1), where {0,0} represents the top left of the
     * picture area, and {1,1} represents the bottom right on an unrotated picture. This rectangle of interest is
     * applied prior to rotation, mirroring or scaling.
     * 
     * Pixels outside of this rectangle of interest will be blackened out.
     * 
     * Setting this property has no impact on objects specified in the metadata output.
     * 
     * -setCenterStageRectOfInterest: throws an NSGenericException if called without first obtaining exclusive access to
     * the receiver using -lockForConfiguration:. -setCenterStageRectOfInterest: throws an NSInvalidArgumentException if
     * none of the AVCaptureDeviceFormats supported by the receiver support CenterStage. -setCenterStageRectOfInterest:
     * throws an NSInvalidArgumentException if +centerStageEnabled is NO on the AVCaptureDevice class.
     * -setCenterStageRectOfInterest: throws an NSInvalidArgumentException if the provided rectOfInterest goes outside
     * the normalized (0-1) coordinate space.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setCenterStageRectOfInterest:")
    public native void setCenterStageRectOfInterest(@ByValue CGRect value);

    /**
     * [@property] userPreferredCamera
     * 
     * Settable property that specifies a user preferred camera.
     * 
     * Setting this property allows an application to persist its user’s preferred camera across app launches and
     * reboots. The property internally maintains a short history, so if your user’s most recent preferred camera is not
     * currently connected, it still reports the next best choice. This property always returns a device that is
     * present. If no camera is available nil is returned. Setting the property to nil has no effect.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setUserPreferredCamera:")
    public static native void setUserPreferredCamera(@Nullable AVCaptureDevice value);

    /**
     * [@property] systemPreferredCamera
     * 
     * Specifies the best camera to use as determined by the system.
     * 
     * Apple chooses the default value. This property incorporates userPreferredCamera as well as other factors, such as
     * camera suspension and Apple cameras appearing that should be automatically chosen. The property may change
     * spontaneously, such as when the preferred camera goes away. This property always returns a device that is
     * present. If no camera is available nil is returned.
     * 
     * Applications that adopt this API should always key-value observe this property and update their
     * AVCaptureSession’s input device to reflect changes to the systemPreferredCamera. The application can still offer
     * users the ability to pick a camera by setting userPreferredCamera, which will cause the systemPreferredCamera API
     * to put the user’s choice first until either another Apple-preferred device becomes available or the machine is
     * rebooted (after which it reverts to its original behavior of returning the internally determined best camera to
     * use).
     * 
     * If the application wishes to offer users a fully manual camera selection mode in addition to automatic camera
     * selection, it is recommended to call setUserPreferredCamera: each time the user makes a camera selection, but
     * ignore key-value observer updates to systemPreferredCamera while in manual selection mode.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("systemPreferredCamera")
    @Nullable
    public static native AVCaptureDevice systemPreferredCamera();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * [@property] userPreferredCamera
     * 
     * Settable property that specifies a user preferred camera.
     * 
     * Setting this property allows an application to persist its user’s preferred camera across app launches and
     * reboots. The property internally maintains a short history, so if your user’s most recent preferred camera is not
     * currently connected, it still reports the next best choice. This property always returns a device that is
     * present. If no camera is available nil is returned. Setting the property to nil has no effect.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("userPreferredCamera")
    @Nullable
    public static native AVCaptureDevice userPreferredCamera();
}
