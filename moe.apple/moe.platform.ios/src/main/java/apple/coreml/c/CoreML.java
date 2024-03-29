package apple.coreml.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;
import apple.foundation.NSArray;
import org.moe.natj.c.ann.CFunction;

@Generated
@Library("CoreML")
@Runtime(CRuntime.class)
public final class CoreML {
    static {
        NatJ.register();
    }

    @Generated
    private CoreML() {
    }

    /**
     * A short description of what the model does and/or its purpose
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelDescriptionKey();

    /**
     * A version number encoded as a string
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelVersionStringKey();

    /**
     * The author of this model
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelAuthorKey();

    /**
     * License information for the model
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelLicenseKey();

    /**
     * Any additional pertinent information specified by the model creator
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelCreatorDefinedKey();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelErrorDomain();

    /**
     * Key for CGRect describing a crop region of interest of image source in normalized coordinates
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLFeatureValueImageOptionCropRect();

    /**
     * Key for VNImageCropAndScaleOption describing how to crop and scale the image (or region of interest) to the
     * desired size
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLFeatureValueImageOptionCropAndScale();

    /**
     * Notification posted when the model collection has changed.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use Background Assets or NSURLSession instead.
     */
    @Deprecated
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLModelCollectionDidChangeNotification();

    /**
     * Returns an array containing all compute devices.
     * 
     * The returned array contains all compute devices that are accessible. If a compute
     * device becomes inaccessible for some reason (for e.g. if an external GPU is unplugged)
     * then the subsequent call to`MLAllComputeDevices` will return an array without the compute device.
     * 
     * 
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    @NotNull
    public static native NSArray<?> MLAllComputeDevices();
}