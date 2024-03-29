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

package apple.replaykit;

import apple.NSObject;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * RPBroadcastSampleHandler
 * 
 * Subclass this class to handle CMSampleBuffer objects as they are captured by ReplayKit. To enable this mode of
 * handling, set the RPBroadcastProcessMode in the extension's info.plist to RPBroadcastProcessModeSampleBuffer.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("ReplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class RPBroadcastSampleHandler extends RPBroadcastHandler {
    static {
        NatJ.register();
    }

    @Generated
    protected RPBroadcastSampleHandler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native RPBroadcastSampleHandler alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native RPBroadcastSampleHandler allocWithZone(VoidPtr zone);

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
    public static native RPBroadcastSampleHandler new_objc();

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
     * Method is called when the RPBroadcastController finishBroadcast method is called from the broadcasting
     * application.
     */
    @Generated
    @Selector("broadcastFinished")
    public native void broadcastFinished();

    /**
     * Method is called when the RPBroadcastController pauseBroadcast method is called from the broadcasting
     * application.
     */
    @Generated
    @Selector("broadcastPaused")
    public native void broadcastPaused();

    /**
     * Method is called when the RPBroadcastController resumeBroadcast method is called from the broadcasting
     * application.
     */
    @Generated
    @Selector("broadcastResumed")
    public native void broadcastResumed();

    /**
     * Method is called when the RPBroadcastController startBroadcast method is called from the broadcasting
     * application.
     * 
     * @param setupInfo Dictionary that can be supplied by the UI extension to the sample handler.
     */
    @Generated
    @Selector("broadcastStartedWithSetupInfo:")
    public native void broadcastStartedWithSetupInfo(@Nullable NSDictionary<String, ? extends NSObject> setupInfo);

    /**
     * Method that should be called when broadcasting can not proceed due to an error. Calling this method will stop the
     * broadcast and deliver the error back to the broadcasting app through RPBroadcastController's delegate.
     * 
     * @param error NSError object that will be passed back to the broadcasting app through
     *              RPBroadcastControllerDelegate's broadcastController:didFinishWithError: method.
     */
    @Generated
    @Selector("finishBroadcastWithError:")
    public native void finishBroadcastWithError(@NotNull NSError error);

    @Generated
    @Selector("init")
    public native RPBroadcastSampleHandler init();

    /**
     * Method is called as video and audio data become available during a broadcast session and is delivered as
     * CMSampleBuffer objects.
     * 
     * @param sampleBuffer     CMSampleBuffer object which contains either video or audio data.
     * @param sampleBufferType Determine's the type of the sample buffer defined by the RPSampleBufferType enum.
     */
    @Generated
    @Selector("processSampleBuffer:withType:")
    public native void processSampleBufferWithType(@NotNull CMSampleBufferRef sampleBuffer,
            @NInt long sampleBufferType);

    /**
     * Method is called when broadcast is started from Control Center and provides extension information about the first
     * application opened or used during the broadcast.
     * 
     * @param applicationInfo Dictionary that contains information about the first application opened or used buring the
     *                        broadcast.
     * 
     *                        API-Since: 11.2
     */
    @Generated
    @Selector("broadcastAnnotatedWithApplicationInfo:")
    public native void broadcastAnnotatedWithApplicationInfo(@NotNull NSDictionary<?, ?> applicationInfo);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
