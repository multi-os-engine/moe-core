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
import apple.avfoundation.protocol.AVVideoCompositionInstruction;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.struct.CMTime;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 7.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAsynchronousVideoCompositionRequest extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAsynchronousVideoCompositionRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAsynchronousVideoCompositionRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAsynchronousVideoCompositionRequest allocWithZone(VoidPtr zone);

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
    public static native AVAsynchronousVideoCompositionRequest new_objc();

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
     * The time for which the frame should be composed
     */
    @Generated
    @Selector("compositionTime")
    @ByValue
    public native CMTime compositionTime();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * callback the custom compositor should call for a request that has been cancelled.
     */
    @Generated
    @Selector("finishCancelledRequest")
    public native void finishCancelledRequest();

    /**
     * finishWithComposedVideoFrame:
     * 
     * The method that the custom compositor calls when composition succeeds.
     * 
     * @param composedVideoFrame
     *                           The video frame to finish with.
     */
    @Generated
    @Selector("finishWithComposedVideoFrame:")
    public native void finishWithComposedVideoFrame(@NotNull CVBufferRef composedVideoFrame);

    /**
     * callback the custom compositor should call when composition failed. The error parameter should describe the
     * actual error.
     */
    @Generated
    @Selector("finishWithError:")
    public native void finishWithError(@NotNull NSError error);

    @Generated
    @Selector("init")
    public native AVAsynchronousVideoCompositionRequest init();

    /**
     * The AVVideoCompositionRenderContext making the request
     */
    @NotNull
    @Generated
    @Selector("renderContext")
    public native AVVideoCompositionRenderContext renderContext();

    /**
     * sourceFrameByTrackID:
     * 
     * Returns the source CVPixelBufferRef for the given track ID
     * 
     * @param trackID
     *                The track ID for the requested source frame
     */
    @Nullable
    @Generated
    @Selector("sourceFrameByTrackID:")
    public native CVBufferRef sourceFrameByTrackID(int trackID);

    /**
     * Track IDs of all the source video buffers that are available to compose the frame.
     */
    @NotNull
    @Generated
    @Selector("sourceTrackIDs")
    public native NSArray<? extends NSNumber> sourceTrackIDs();

    /**
     * The AVVideoCompositionInstruction to use to compose the frame.
     */
    @NotNull
    @Generated
    @Selector("videoCompositionInstruction")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositionInstruction videoCompositionInstruction();

    /**
     * sourceSampleBufferByTrackID:
     * 
     * Returns the source CMSampleBufferRef for the given track ID
     * 
     * @param trackID
     *                The track ID for the requested source sample buffer
     * 
     *                API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("sourceSampleBufferByTrackID:")
    public native CMSampleBufferRef sourceSampleBufferByTrackID(int trackID);

    /**
     * Track IDs of all the source sample data buffers that are available to compose the frame.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("sourceSampleDataTrackIDs")
    public native NSArray<? extends NSNumber> sourceSampleDataTrackIDs();

    /**
     * sourceTimedMetadataByTrackID:
     * 
     * Returns the source AVTimedMetadataGroup * for the given track ID
     * 
     * @param trackID
     *                The track ID for the requested source timed metadata group.
     * 
     *                API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("sourceTimedMetadataByTrackID:")
    public native AVTimedMetadataGroup sourceTimedMetadataByTrackID(int trackID);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
