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

package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("imageDescriptorWithChannelFormat:width:height:featureChannels:")
    public static native MPSImageDescriptor imageDescriptorWithChannelFormatWidthHeightFeatureChannels(
            @NUInt long channelFormat, @NUInt long width, @NUInt long height, @NUInt long featureChannels);

    @Generated
    @Selector("imageDescriptorWithChannelFormat:width:height:featureChannels:numberOfImages:usage:")
    public static native MPSImageDescriptor imageDescriptorWithChannelFormatWidthHeightFeatureChannelsNumberOfImagesUsage(
            @NUInt long channelFormat, @NUInt long width, @NUInt long height, @NUInt long featureChannels,
            @NUInt long numberOfImages, @NUInt long usage);

    @Generated
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
    @Selector("channelFormat")
    @NUInt
    public native long channelFormat();

    @Generated
    @Selector("cpuCacheMode")
    @NUInt
    public native long cpuCacheMode();

    @Generated
    @Selector("featureChannels")
    @NUInt
    public native long featureChannels();

    @Generated
    @Selector("height")
    @NUInt
    public native long height();

    @Generated
    @Selector("init")
    public native MPSImageDescriptor init();

    @Generated
    @Selector("numberOfImages")
    @NUInt
    public native long numberOfImages();

    @Generated
    @Selector("pixelFormat")
    @NUInt
    public native long pixelFormat();

    @Generated
    @Selector("setChannelFormat:")
    public native void setChannelFormat(@NUInt long value);

    @Generated
    @Selector("setCpuCacheMode:")
    public native void setCpuCacheMode(@NUInt long value);

    @Generated
    @Selector("setFeatureChannels:")
    public native void setFeatureChannels(@NUInt long value);

    @Generated
    @Selector("setHeight:")
    public native void setHeight(@NUInt long value);

    @Generated
    @Selector("setNumberOfImages:")
    public native void setNumberOfImages(@NUInt long value);

    @Generated
    @Selector("setStorageMode:")
    public native void setStorageMode(@NUInt long value);

    @Generated
    @Selector("setUsage:")
    public native void setUsage(@NUInt long value);

    @Generated
    @Selector("setWidth:")
    public native void setWidth(@NUInt long value);

    @Generated
    @Selector("storageMode")
    @NUInt
    public native long storageMode();

    @Generated
    @Selector("usage")
    @NUInt
    public native long usage();

    @Generated
    @Selector("width")
    @NUInt
    public native long width();
}