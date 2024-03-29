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
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import apple.foundation.NSDictionary;

/**
 * AVPlayerItemErrorLogEvent
 * 
 * An AVPlayerItemErrorLogEvent represents a single log entry.
 * 
 * An AVPlayerItemErrorLogEvent provides named properties for accessing the data
 * fields of each log event. None of the properties of this class are observable.
 * 
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 4.3
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemErrorLogEvent extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemErrorLogEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemErrorLogEvent alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerItemErrorLogEvent allocWithZone(VoidPtr zone);

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
    public static native AVPlayerItemErrorLogEvent new_objc();

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
     * [@property] URI
     * 
     * The URI of the playback item. Can be nil.
     * 
     * If nil is returned the URI is unknown. Corresponds to "uri".
     * This property is not observable.
     */
    @Nullable
    @Generated
    @Selector("URI")
    public native String URI();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] date
     * 
     * The date and time when the error occured. Can be nil.
     * 
     * If nil is returned the date is unknown. Corresponds to "date".
     * This property is not observable.
     */
    @Nullable
    @Generated
    @Selector("date")
    public native NSDate date();

    /**
     * [@property] errorComment
     * 
     * A description of the error encountered. Can be nil.
     * 
     * If nil is returned further information is not available. Corresponds to "comment".
     * This property is not observable.
     */
    @Nullable
    @Generated
    @Selector("errorComment")
    public native String errorComment();

    /**
     * [@property] errorDomain
     * 
     * The domain of the error.
     * 
     * Corresponds to "domain".
     * This property is not observable.
     */
    @NotNull
    @Generated
    @Selector("errorDomain")
    public native String errorDomain();

    /**
     * [@property] errorStatusCode
     * 
     * A unique error code identifier.
     * 
     * Corresponds to "status".
     * This property is not observable.
     */
    @Generated
    @Selector("errorStatusCode")
    @NInt
    public native long errorStatusCode();

    @Generated
    @Selector("init")
    public native AVPlayerItemErrorLogEvent init();

    /**
     * [@property] playbackSessionID
     * 
     * A GUID that identifies the playback session. This value is used in HTTP requests. Can be nil.
     * 
     * If nil is returned the GUID is unknown. Corresponds to "cs-guid".
     * This property is not observable.
     */
    @Nullable
    @Generated
    @Selector("playbackSessionID")
    public native String playbackSessionID();

    /**
     * [@property] serverAddress
     * 
     * The IP address of the server that was the source of the error. Can be nil.
     * 
     * If nil is returned the address is unknown. Can be either an IPv4 or IPv6 address. Corresponds to "s-ip".
     * This property is not observable.
     */
    @Nullable
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();

    /**
     * [@property] allHTTPResponseHeaderFields
     * 
     * The HTTP header fields returned by the server, if an HTTP response was received as part of this error.
     * 
     * See -[NSHTTPURLResponse allHeaderFields] for more information.
     * 
     * API-Since: 17.2
     */
    @Generated
    @Selector("allHTTPResponseHeaderFields")
    @Nullable
    public native NSDictionary<String, String> allHTTPResponseHeaderFields();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
