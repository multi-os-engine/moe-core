package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIImage;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.uikit.UIColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@c] CPManeuver describes a navigation instruction.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPManeuver extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPManeuver(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPManeuver alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPManeuver allocWithZone(VoidPtr zone);

    /**
     * attributedInstructionVariants is an array of @c NSAttributedString representing the instruction for this
     * maneuver,
     * arranged from most to least preferred.
     * 
     * [@c] attributedInstructionVariants will be preferred over instructionVariants. You must provide at least one
     * variant for each maneuver.
     * 
     * Only one type of attribute is presently supported: text attachments. You may annotate a maneuver instruction with
     * images
     * by including one or more text attachments. The maximum text attachment image size is 64x25 points.
     * 
     * [@warning] All attributes other than text attachment attributes will be removed from your attributed string.
     * 
     * @see +[NSAttributedString attributedStringWithAttachment:], -[NSTextAttachment image]
     */
    @NotNull
    @Generated
    @Selector("attributedInstructionVariants")
    public native NSArray<? extends NSAttributedString> attributedInstructionVariants();

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPManeuver init();

    @Generated
    @Selector("initWithCoder:")
    public native CPManeuver initWithCoder(@NotNull NSCoder coder);

    /**
     * initialTravelEstimates represents the estimates beginning from the end of the preceding maneuver.
     */
    @Nullable
    @Generated
    @Selector("initialTravelEstimates")
    public native CPTravelEstimates initialTravelEstimates();

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

    /**
     * instructionVariants is an array of @c NSString representing the instruction for this maneuver, arranged from most
     * to least preferred. You must provide at least one variant.
     * The variant strings should be provided as localized, displayable content.
     */
    @NotNull
    @Generated
    @Selector("instructionVariants")
    public native NSArray<String> instructionVariants();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * junctionImage is a @c UIImage used to display a junction for the maneuver.
     * 
     * [@note] The maximum image size is 140 points by 100 points. If necessary, images will be scaled down to fit while
     * maintaining the aspect ratio.
     */
    @Nullable
    @Generated
    @Selector("junctionImage")
    public native UIImage junctionImage();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CPManeuver new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * attributedInstructionVariants is an array of @c NSAttributedString representing the instruction for this
     * maneuver,
     * arranged from most to least preferred.
     * 
     * [@c] attributedInstructionVariants will be preferred over instructionVariants. You must provide at least one
     * variant for each maneuver.
     * 
     * Only one type of attribute is presently supported: text attachments. You may annotate a maneuver instruction with
     * images
     * by including one or more text attachments. The maximum text attachment image size is 64x25 points.
     * 
     * [@warning] All attributes other than text attachment attributes will be removed from your attributed string.
     * 
     * @see +[NSAttributedString attributedStringWithAttachment:], -[NSTextAttachment image]
     */
    @Generated
    @Selector("setAttributedInstructionVariants:")
    public native void setAttributedInstructionVariants(@NotNull NSArray<? extends NSAttributedString> value);

    /**
     * initialTravelEstimates represents the estimates beginning from the end of the preceding maneuver.
     */
    @Generated
    @Selector("setInitialTravelEstimates:")
    public native void setInitialTravelEstimates(@Nullable CPTravelEstimates value);

    /**
     * instructionVariants is an array of @c NSString representing the instruction for this maneuver, arranged from most
     * to least preferred. You must provide at least one variant.
     * The variant strings should be provided as localized, displayable content.
     */
    @Generated
    @Selector("setInstructionVariants:")
    public native void setInstructionVariants(@NotNull NSArray<String> value);

    /**
     * junctionImage is a @c UIImage used to display a junction for the maneuver.
     * 
     * [@note] The maximum image size is 140 points by 100 points. If necessary, images will be scaled down to fit while
     * maintaining the aspect ratio.
     */
    @Generated
    @Selector("setJunctionImage:")
    public native void setJunctionImage(@Nullable UIImage value);

    /**
     * symbolImage is a @c UIImage representing the maneuver. Provide variants for UIUserInterfaceStyleLight and
     * UIUserInterfaceStyleDark that will be used against light backgrounds and dark backgrounds.
     */
    @Generated
    @Selector("setSymbolImage:")
    public native void setSymbolImage(@Nullable UIImage value);

    /**
     * symbolSet is a @c CPImageSet representing the maneuver.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("setSymbolSet:")
    public native void setSymbolSet(@Nullable CPImageSet value);

    /**
     * Any custom user info related to this maneuver.
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

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
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * symbolImage is a @c UIImage representing the maneuver. Provide variants for UIUserInterfaceStyleLight and
     * UIUserInterfaceStyleDark that will be used against light backgrounds and dark backgrounds.
     */
    @Nullable
    @Generated
    @Selector("symbolImage")
    public native UIImage symbolImage();

    /**
     * symbolSet is a @c CPImageSet representing the maneuver.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 13.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("symbolSet")
    public native CPImageSet symbolSet();

    /**
     * Any custom user info related to this maneuver.
     */
    @Nullable
    @Generated
    @Selector("userInfo")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object userInfo();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * dashboardAttributedInstructionVariants is an array of @c NSAttributedString representing the instruction for this
     * maneuver on the dashboard,
     * arranged from most to least preferred.
     * 
     * [@c] dashboardAttributedInstructionVariants will be preferred over dashboardInstructionVariants. If no dashboard
     * attributed variants are provided, dashboardInstructionVariants will be used.
     * 
     * Only one type of attribute is presently supported: text attachments. You may annotate a maneuver instruction with
     * images
     * by including one or more text attachments. The maximum text attachment image size is 64x25 points.
     * 
     * [@warning] All attributes other than text attachment attributes will be removed from your attributed string.
     * 
     * @see +[NSAttributedString attributedStringWithAttachment:], -[NSTextAttachment image]
     * 
     *      API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("dashboardAttributedInstructionVariants")
    public native NSArray<? extends NSAttributedString> dashboardAttributedInstructionVariants();

    /**
     * dashboardInstructionVariants is an array of @c NSString representing the instruction for this maneuver on the
     * dashboard, arranged from most to least preferred. If no dashboard variants are provided, the system will check
     * for attributedInstructionVariants, then instructionVariants.
     * The variant strings should be provided as localized, displayable content.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("dashboardInstructionVariants")
    public native NSArray<String> dashboardInstructionVariants();

    /**
     * dashboardJunctionImage is a @c UIImage used to display a junction for the maneuver on the dashboard. If no
     * dashboard junction image is provided, junctionImage will be used.
     * 
     * [@note] The maximum image size is 140 points by 100 points. If necessary, images will be scaled down to fit while
     * maintaining the aspect ratio.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("dashboardJunctionImage")
    public native UIImage dashboardJunctionImage();

    /**
     * dashboardSymbolImage is a @c UIImage representing the maneuver that will be used on the dashboard. Provide
     * variants for UIUserInterfaceStyleLight and UIUserInterfaceStyleDark that will be used against light backgrounds
     * and dark backgrounds. If no dashboard image
     * is provided, symbolImage will be used.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("dashboardSymbolImage")
    public native UIImage dashboardSymbolImage();

    /**
     * notificationAttributedInstructionVariants is an array of @c NSAttributedString representing the instruction for
     * this maneuver in a notification banner,
     * arranged from most to least preferred.
     * 
     * [@c] notificationAttributedInstructionVariants will be preferred over instructionVariants. If no notification
     * attributed variants are provided, notificationInstructionVariants will be used.
     * 
     * Only one type of attribute is presently supported: text attachments. You may annotate a maneuver instruction with
     * images
     * by including one or more text attachments. The maximum text attachment image size is 64x25 points.
     * 
     * [@warning] All attributes other than text attachment attributes will be removed from your attributed string.
     * 
     * @see +[NSAttributedString attributedStringWithAttachment:], -[NSTextAttachment image]
     * 
     *      API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("notificationAttributedInstructionVariants")
    public native NSArray<? extends NSAttributedString> notificationAttributedInstructionVariants();

    /**
     * notificationInstructionVariants is an array of @c NSString representing the instruction for this maneuver in a
     * notification banner, arranged from most to least preferred. If no notification instruction variants are provided,
     * the system will check for attributedInstructionVariants, then instructionVariants.
     * The variant strings should be provided as localized, displayable content.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("notificationInstructionVariants")
    public native NSArray<String> notificationInstructionVariants();

    /**
     * notificationSymbolImage is a @c UIImage representing the maneuver that will be used in a notification banner.
     * Provide variants for UIUserInterfaceStyleLight and UIUserInterfaceStyleDark that will be used against light
     * backgrounds and dark backgrounds. If no
     * notification symbol image is provided, symbolImage will be used.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("notificationSymbolImage")
    public native UIImage notificationSymbolImage();

    /**
     * dashboardAttributedInstructionVariants is an array of @c NSAttributedString representing the instruction for this
     * maneuver on the dashboard,
     * arranged from most to least preferred.
     * 
     * [@c] dashboardAttributedInstructionVariants will be preferred over dashboardInstructionVariants. If no dashboard
     * attributed variants are provided, dashboardInstructionVariants will be used.
     * 
     * Only one type of attribute is presently supported: text attachments. You may annotate a maneuver instruction with
     * images
     * by including one or more text attachments. The maximum text attachment image size is 64x25 points.
     * 
     * [@warning] All attributes other than text attachment attributes will be removed from your attributed string.
     * 
     * @see +[NSAttributedString attributedStringWithAttachment:], -[NSTextAttachment image]
     * 
     *      API-Since: 14.0
     */
    @Generated
    @Selector("setDashboardAttributedInstructionVariants:")
    public native void setDashboardAttributedInstructionVariants(@NotNull NSArray<? extends NSAttributedString> value);

    /**
     * dashboardInstructionVariants is an array of @c NSString representing the instruction for this maneuver on the
     * dashboard, arranged from most to least preferred. If no dashboard variants are provided, the system will check
     * for attributedInstructionVariants, then instructionVariants.
     * The variant strings should be provided as localized, displayable content.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDashboardInstructionVariants:")
    public native void setDashboardInstructionVariants(@NotNull NSArray<String> value);

    /**
     * dashboardJunctionImage is a @c UIImage used to display a junction for the maneuver on the dashboard. If no
     * dashboard junction image is provided, junctionImage will be used.
     * 
     * [@note] The maximum image size is 140 points by 100 points. If necessary, images will be scaled down to fit while
     * maintaining the aspect ratio.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDashboardJunctionImage:")
    public native void setDashboardJunctionImage(@Nullable UIImage value);

    /**
     * dashboardSymbolImage is a @c UIImage representing the maneuver that will be used on the dashboard. Provide
     * variants for UIUserInterfaceStyleLight and UIUserInterfaceStyleDark that will be used against light backgrounds
     * and dark backgrounds. If no dashboard image
     * is provided, symbolImage will be used.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDashboardSymbolImage:")
    public native void setDashboardSymbolImage(@Nullable UIImage value);

    /**
     * notificationAttributedInstructionVariants is an array of @c NSAttributedString representing the instruction for
     * this maneuver in a notification banner,
     * arranged from most to least preferred.
     * 
     * [@c] notificationAttributedInstructionVariants will be preferred over instructionVariants. If no notification
     * attributed variants are provided, notificationInstructionVariants will be used.
     * 
     * Only one type of attribute is presently supported: text attachments. You may annotate a maneuver instruction with
     * images
     * by including one or more text attachments. The maximum text attachment image size is 64x25 points.
     * 
     * [@warning] All attributes other than text attachment attributes will be removed from your attributed string.
     * 
     * @see +[NSAttributedString attributedStringWithAttachment:], -[NSTextAttachment image]
     * 
     *      API-Since: 14.0
     */
    @Generated
    @Selector("setNotificationAttributedInstructionVariants:")
    public native void setNotificationAttributedInstructionVariants(
            @NotNull NSArray<? extends NSAttributedString> value);

    /**
     * notificationInstructionVariants is an array of @c NSString representing the instruction for this maneuver in a
     * notification banner, arranged from most to least preferred. If no notification instruction variants are provided,
     * the system will check for attributedInstructionVariants, then instructionVariants.
     * The variant strings should be provided as localized, displayable content.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setNotificationInstructionVariants:")
    public native void setNotificationInstructionVariants(@NotNull NSArray<String> value);

    /**
     * notificationSymbolImage is a @c UIImage representing the maneuver that will be used in a notification banner.
     * Provide variants for UIUserInterfaceStyleLight and UIUserInterfaceStyleDark that will be used against light
     * backgrounds and dark backgrounds. If no
     * notification symbol image is provided, symbolImage will be used.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setNotificationSymbolImage:")
    public native void setNotificationSymbolImage(@Nullable UIImage value);

    /**
     * Takes precedence over @c guidanceBackgroundColor set in @c CPMapTemplate.
     * 
     * API-Since: 15.4
     */
    @Nullable
    @Generated
    @Selector("cardBackgroundColor")
    public native UIColor cardBackgroundColor();

    /**
     * Takes precedence over @c guidanceBackgroundColor set in @c CPMapTemplate.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("setCardBackgroundColor:")
    public native void setCardBackgroundColor(@Nullable UIColor value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
