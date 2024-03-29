package apple.avkit;

import apple.NSObject;
import apple.avfoundation.AVPlayerLayer;
import apple.avfoundation.AVSampleBufferDisplayLayer;
import apple.avkit.protocol.AVPictureInPictureSampleBufferPlaybackDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIView;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVPictureInPictureControllerContentSource
 * 
 * A content source for AVPictureInPictureController.
 * 
 * Create a content source with an appropriate layer, and use it to initialize the AVPictureInPictureController.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPictureInPictureControllerContentSource extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPictureInPictureControllerContentSource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] activeVideoCallContentViewController
     * 
     * This view controller will appear in the system's Picture in Picture window when Picture in Picture is active.
     * 
     * This view controller may set a custom `preferredContentSize` which will influence both the aspect ratio and the
     * size of the Picture in Picture window.
     * When this view controller's appearance methods indicate that it has appeared on screen, content associated with
     * the video call should be placed in its view hierarchy.
     * Although apps can choose to move content from their source view to this view controller, it is also valid to show
     * different views, as long as they represent the same video call.
     * The content should always fill the view controller's view's bounds.
     * Note that this view controller's view is not interactive and will not receive touches or other user input.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("activeVideoCallContentViewController")
    public native AVPictureInPictureVideoCallViewController activeVideoCallContentViewController();

    /**
     * [@property] activeVideoCallSourceView
     * 
     * When a video call is active and the application is foreground, this view contains content associated with the
     * call.
     * 
     * `AVPictureInPictureController` uses this view's layout frame and visibility to determine whether or not Picture
     * in Picture should begin automatically when the app moves to background.
     * The layout frame also influences the animation when entering and exiting Picture in Picture.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("activeVideoCallSourceView")
    public native UIView activeVideoCallSourceView();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPictureInPictureControllerContentSource alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPictureInPictureControllerContentSource allocWithZone(VoidPtr zone);

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
    @Selector("init")
    public native AVPictureInPictureControllerContentSource init();

    /**
     * initWithActiveVideoCallSourceView:contentViewController:
     * 
     * Initializes a new `AVPictureInPictureControllerContentSource` suitable for supporting an active video call. This
     * object should only be used for the duration of the call.
     * 
     * API-Since: 15.0
     * 
     * @param sourceView
     *                              The view which contains content associated with the call.
     * @param contentViewController
     *                              The view controller that should appear in the system's Picture in Picture window.
     */
    @Generated
    @Selector("initWithActiveVideoCallSourceView:contentViewController:")
    public native AVPictureInPictureControllerContentSource initWithActiveVideoCallSourceViewContentViewController(
            @NotNull UIView sourceView, @NotNull AVPictureInPictureVideoCallViewController contentViewController);

    /**
     * initWithPlayerLayer:
     * 
     * Use this initializer for a content source with a player layer.
     * 
     * @param playerLayer
     *                    The player layer to be shown in Picture in Picture.
     */
    @Generated
    @Selector("initWithPlayerLayer:")
    public native AVPictureInPictureControllerContentSource initWithPlayerLayer(@NotNull AVPlayerLayer playerLayer);

    /**
     * initWithSampleBufferDisplayLayer:
     * 
     * Use this initializer for a content source with a sample buffer display layer and playback delegate.
     * 
     * @param sampleBufferDisplayLayer
     *                                 The sample buffer display layer to be shown in Picture in Picture.
     * @param playbackDelegate
     *                                 The playback delegate for controlling sample buffer display layer's playback in
     *                                 Picture in Picture.
     */
    @Generated
    @Selector("initWithSampleBufferDisplayLayer:playbackDelegate:")
    public native AVPictureInPictureControllerContentSource initWithSampleBufferDisplayLayerPlaybackDelegate(
            @NotNull AVSampleBufferDisplayLayer sampleBufferDisplayLayer,
            @NotNull @Mapped(ObjCObjectMapper.class) AVPictureInPictureSampleBufferPlaybackDelegate playbackDelegate);

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
    public static native AVPictureInPictureControllerContentSource new_objc();

    /**
     * [@property] playerLayer
     * 
     * The receiver's player layer.
     */
    @Nullable
    @Generated
    @Selector("playerLayer")
    public native AVPlayerLayer playerLayer();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] sampleBufferDisplayLayer
     * 
     * The receiver's sample buffer display layer.
     */
    @Nullable
    @Generated
    @Selector("sampleBufferDisplayLayer")
    public native AVSampleBufferDisplayLayer sampleBufferDisplayLayer();

    /**
     * [@property] sampleBufferPlaybackDelegate
     * 
     * The receiver's sample buffer playback delegate.
     */
    @Nullable
    @Generated
    @Selector("sampleBufferPlaybackDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVPictureInPictureSampleBufferPlaybackDelegate sampleBufferPlaybackDelegate();

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
