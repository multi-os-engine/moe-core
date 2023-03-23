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
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Comparison predicates are predicates which do some form of comparison between the results of two expressions and
 * return a BOOL. They take an operator, a left expression, and a right expression, and return the result of invoking
 * the operator with the results of evaluating the expressions.
 * 
 * API-Since: 3.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSComparisonPredicate extends NSPredicate {
    static {
        NatJ.register();
    }

    @Generated
    protected NSComparisonPredicate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSComparisonPredicate alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSComparisonPredicate allocWithZone(VoidPtr zone);

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
    public static native NSComparisonPredicate new_objc();

    @Generated
    @Selector("predicateWithBlock:")
    public static native NSPredicate predicateWithBlock(
            @ObjCBlock(name = "call_predicateWithBlock") NSPredicate.Block_predicateWithBlock block);

    @Generated
    @Variadic()
    @Selector("predicateWithFormat:")
    public static native NSPredicate predicateWithFormat(String predicateFormat, Object... varargs);

    @Generated
    @Selector("predicateWithFormat:argumentArray:")
    public static native NSPredicate predicateWithFormatArgumentArray(String predicateFormat, NSArray<?> arguments);

    @Generated
    @Selector("predicateWithFormat:arguments:")
    public static native NSPredicate predicateWithFormatArguments(String predicateFormat, BytePtr argList);

    @Generated
    @Selector("predicateWithLeftExpression:rightExpression:customSelector:")
    public static native NSComparisonPredicate predicateWithLeftExpressionRightExpressionCustomSelector(
            NSExpression lhs, NSExpression rhs, SEL selector);

    @Generated
    @Selector("predicateWithLeftExpression:rightExpression:modifier:type:options:")
    public static native NSComparisonPredicate predicateWithLeftExpressionRightExpressionModifierTypeOptions(
            NSExpression lhs, NSExpression rhs, @NUInt long modifier, @NUInt long type, @NUInt long options);

    @Generated
    @Selector("predicateWithValue:")
    public static native NSPredicate predicateWithValue(boolean value);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("comparisonPredicateModifier")
    @NUInt
    public native long comparisonPredicateModifier();

    @Generated
    @Selector("customSelector")
    public native SEL customSelector();

    @Generated
    @Selector("init")
    public native NSComparisonPredicate init();

    @Generated
    @Selector("initWithCoder:")
    public native NSComparisonPredicate initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithLeftExpression:rightExpression:customSelector:")
    public native NSComparisonPredicate initWithLeftExpressionRightExpressionCustomSelector(NSExpression lhs,
            NSExpression rhs, SEL selector);

    @Generated
    @Selector("initWithLeftExpression:rightExpression:modifier:type:options:")
    public native NSComparisonPredicate initWithLeftExpressionRightExpressionModifierTypeOptions(NSExpression lhs,
            NSExpression rhs, @NUInt long modifier, @NUInt long type, @NUInt long options);

    @Generated
    @Selector("leftExpression")
    public native NSExpression leftExpression();

    @Generated
    @Selector("options")
    @NUInt
    public native long options();

    @Generated
    @Selector("predicateOperatorType")
    @NUInt
    public native long predicateOperatorType();

    @Generated
    @Selector("rightExpression")
    public native NSExpression rightExpression();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
