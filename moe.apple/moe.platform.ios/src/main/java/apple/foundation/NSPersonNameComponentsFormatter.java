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

package apple.foundation;

import apple.NSObject;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPersonNameComponentsFormatter extends NSFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPersonNameComponentsFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersonNameComponentsFormatter alloc();

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

    /**
     * Shortcut for converting an NSPersonNameComponents object into a string without explicitly creating an instance.
     * Create an instance for greater customizability.
     */
    @Generated
    @Selector("localizedStringFromPersonNameComponents:style:options:")
    public static native String localizedStringFromPersonNameComponentsStyleOptions(NSPersonNameComponents components,
            @NInt long nameFormatStyle, @NUInt long nameOptions);

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

    /**
     * Returns attributed string with annotations for each component. For each range, attributes can be obtained by querying
     * dictionary key NSPersonNameComponentKey , using NSPersonNameComponent constant values.
     */
    @Generated
    @Selector("annotatedStringFromPersonNameComponents:")
    public native NSAttributedString annotatedStringFromPersonNameComponents(NSPersonNameComponents components);

    @Generated
    @Selector("getObjectValue:forString:errorDescription:")
    public native boolean getObjectValueForStringErrorDescription(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> obj, String string,
            @ReferenceInfo(type = NSString.class) Ptr<NSString> error);

    @Generated
    @Selector("init")
    public native NSPersonNameComponentsFormatter init();

    @Generated
    @Selector("initWithCoder:")
    public native NSPersonNameComponentsFormatter initWithCoder(NSCoder coder);

    /**
     * Specify that the formatter should only format the components object's phoneticRepresentation
     */
    @Generated
    @Selector("isPhonetic")
    public native boolean isPhonetic();

    /**
     * Specify that the formatter should only format the components object's phoneticRepresentation
     */
    @Generated
    @Selector("setPhonetic:")
    public native void setPhonetic(boolean value);

    /**
     * Convenience method on getObjectValue:forString:error:. Returns an NSPersonNameComponents object representing the name components found in the provided string.
     */
    @Generated
    @Selector("personNameComponentsFromString:")
    public native NSPersonNameComponents personNameComponentsFromString(String string);

    /**
     * Specify the formatting style for the formatted string on an instance. ShortStyle will fall back to user preferences and language-specific defaults
     */
    @Generated
    @Selector("setStyle:")
    public native void setStyle(@NInt long value);

    /**
     * Convenience method on stringForObjectValue:. Returns a string containing the formatted value of the provided components object.
     */
    @Generated
    @Selector("stringFromPersonNameComponents:")
    public native String stringFromPersonNameComponents(NSPersonNameComponents components);

    /**
     * Specify the formatting style for the formatted string on an instance. ShortStyle will fall back to user preferences and language-specific defaults
     */
    @Generated
    @Selector("style")
    @NInt
    public native long style();

    /**
     * Specifies the locale to format names. Defaults to autoupdatingCurrentLocale. Also resets to autoupdatingCurrentLocale on assignment of nil.
     */
    @Generated
    @Selector("locale")
    public native NSLocale locale();

    /**
     * Specifies the locale to format names. Defaults to autoupdatingCurrentLocale. Also resets to autoupdatingCurrentLocale on assignment of nil.
     */
    @Generated
    @Selector("setLocale:")
    public native void setLocale(NSLocale value);
}
