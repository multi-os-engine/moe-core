package apple.accessibility;

import apple.NSObject;
import apple.accessibility.protocol.AXDataAxisDescriptor;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSMethodSignature;
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
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The top-level descriptor object for an accessible chart.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("Accessibility")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AXChartDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AXChartDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Descriptors for additional categorical or numerical axes beyond x and y.
     * For example, in a visual chart, these values might be represented by the size
     * or color of data points.
     */
    @Nullable
    @Generated
    @Selector("additionalAxes")
    public native NSArray<?> additionalAxes();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AXChartDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AXChartDescriptor allocWithZone(VoidPtr zone);

    /**
     * An attributed version of the title of the chart.
     * When set, this will be used instead of `title`.
     */
    @Nullable
    @Generated
    @Selector("attributedTitle")
    public native NSAttributedString attributedTitle();

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

    /**
     * The direction of the chart's X axis.
     */
    @Generated
    @Selector("contentDirection")
    @NInt
    public native long contentDirection();

    /**
     * The bounds of the view area for visually rendering data values if applicable, provided in superview coordinates.
     */
    @Generated
    @Selector("contentFrame")
    @ByValue
    public native CGRect contentFrame();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    public native AXChartDescriptor init();

    @Generated
    @Selector("initWithAttributedTitle:summary:xAxisDescriptor:yAxisDescriptor:additionalAxes:series:")
    public native AXChartDescriptor initWithAttributedTitleSummaryXAxisDescriptorYAxisDescriptorAdditionalAxesSeries(
            @Nullable NSAttributedString attributedTitle, @Nullable String summary,
            @NotNull @Mapped(ObjCObjectMapper.class) AXDataAxisDescriptor xAxis,
            @Nullable AXNumericDataAxisDescriptor yAxis, @Nullable NSArray<?> additionalAxes,
            @NotNull NSArray<? extends AXDataSeriesDescriptor> series);

    @Generated
    @Selector("initWithAttributedTitle:summary:xAxisDescriptor:yAxisDescriptor:series:")
    public native AXChartDescriptor initWithAttributedTitleSummaryXAxisDescriptorYAxisDescriptorSeries(
            @Nullable NSAttributedString attributedTitle, @Nullable String summary,
            @NotNull @Mapped(ObjCObjectMapper.class) AXDataAxisDescriptor xAxis,
            @NotNull AXNumericDataAxisDescriptor yAxis, @NotNull NSArray<? extends AXDataSeriesDescriptor> series);

    @Generated
    @Selector("initWithTitle:summary:xAxisDescriptor:yAxisDescriptor:additionalAxes:series:")
    public native AXChartDescriptor initWithTitleSummaryXAxisDescriptorYAxisDescriptorAdditionalAxesSeries(
            @Nullable String title, @Nullable String summary,
            @NotNull @Mapped(ObjCObjectMapper.class) AXDataAxisDescriptor xAxis,
            @Nullable AXNumericDataAxisDescriptor yAxis, @Nullable NSArray<?> additionalAxes,
            @NotNull NSArray<? extends AXDataSeriesDescriptor> series);

    @Generated
    @Selector("initWithTitle:summary:xAxisDescriptor:yAxisDescriptor:series:")
    public native AXChartDescriptor initWithTitleSummaryXAxisDescriptorYAxisDescriptorSeries(@Nullable String title,
            @Nullable String summary, @NotNull @Mapped(ObjCObjectMapper.class) AXDataAxisDescriptor xAxis,
            @Nullable AXNumericDataAxisDescriptor yAxis, @NotNull NSArray<? extends AXDataSeriesDescriptor> series);

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
    public static native AXChartDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A set of data series descriptors describing each series in the chart.
     */
    @NotNull
    @Generated
    @Selector("series")
    public native NSArray<? extends AXDataSeriesDescriptor> series();

    /**
     * Descriptors for additional categorical or numerical axes beyond x and y.
     * For example, in a visual chart, these values might be represented by the size
     * or color of data points.
     */
    @Generated
    @Selector("setAdditionalAxes:")
    public native void setAdditionalAxes(@Nullable NSArray<?> value);

    /**
     * An attributed version of the title of the chart.
     * When set, this will be used instead of `title`.
     */
    @Generated
    @Selector("setAttributedTitle:")
    public native void setAttributedTitle(@Nullable NSAttributedString value);

    /**
     * The direction of the chart's X axis.
     */
    @Generated
    @Selector("setContentDirection:")
    public native void setContentDirection(@NInt long value);

    /**
     * The bounds of the view area for visually rendering data values if applicable, provided in superview coordinates.
     */
    @Generated
    @Selector("setContentFrame:")
    public native void setContentFrame(@ByValue CGRect value);

    /**
     * A set of data series descriptors describing each series in the chart.
     */
    @Generated
    @Selector("setSeries:")
    public native void setSeries(@NotNull NSArray<? extends AXDataSeriesDescriptor> value);

    /**
     * A natural language summary of the key message or features of the chart.
     * e.g. "The chart shows that fuel efficiency decreases as vehicle weight increases."
     */
    @Generated
    @Selector("setSummary:")
    public native void setSummary(@Nullable String value);

    /**
     * The title of the chart.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The axis descriptor for the chart's X axis.
     */
    @Generated
    @Selector("setXAxis:")
    public native void setXAxis(@NotNull @Mapped(ObjCObjectMapper.class) AXDataAxisDescriptor value);

    /**
     * The axis descriptor for the chart's Y axis.
     */
    @Generated
    @Selector("setYAxis:")
    public native void setYAxis(@Nullable AXNumericDataAxisDescriptor value);

    /**
     * A natural language summary of the key message or features of the chart.
     * e.g. "The chart shows that fuel efficiency decreases as vehicle weight increases."
     */
    @Nullable
    @Generated
    @Selector("summary")
    public native String summary();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The title of the chart.
     */
    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The axis descriptor for the chart's X axis.
     */
    @NotNull
    @Generated
    @Selector("xAxis")
    @MappedReturn(ObjCObjectMapper.class)
    public native AXDataAxisDescriptor xAxis();

    /**
     * The axis descriptor for the chart's Y axis.
     */
    @Nullable
    @Generated
    @Selector("yAxis")
    public native AXNumericDataAxisDescriptor yAxis();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
