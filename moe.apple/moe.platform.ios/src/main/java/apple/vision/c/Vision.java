package apple.vision.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("Vision")
@Runtime(CRuntime.class)
public final class Vision {
    static {
        NatJ.register();
    }

    @Generated
    private Vision() {
    }

    /**
     * Determines whether or not the normalized rect describes the identity rect of { {0, 0}, {1, 1} }.
     * 
     * @param normalizedRect The rectangle in the normalized coordinate space of [0..1].
     * 
     * @return YES if the rect is the identity rect; otherwise, NO.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native boolean VNNormalizedRectIsIdentityRect(@ByValue CGRect normalizedRect);

    /**
     * Returns a point in (possibly non-integral) image coordinates that is projected from a point in a normalized
     * coordinate space.
     * 
     * @param normalizedPoint The point in the normalized coordinate space of [0..1].
     * 
     * @param imageWidth      The pixel width of the image.
     * 
     * @param imageHeight     The pixel height of the image.
     * 
     * @return the point in image coordinates.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint VNImagePointForNormalizedPoint(@ByValue CGPoint normalizedPoint,
            @NUInt long imageWidth, @NUInt long imageHeight);

    /**
     * Returns a rectangle in (possibly non-integral) image coordinates that is projected from a rectangle in a
     * normalized coordinate space.
     * 
     * @param normalizedRect The rectangle in the normalized coordinate space of [0..1].
     * 
     * @param imageWidth     The pixel width of the image.
     * 
     * @param imageHeight    The pixel height of the image.
     * 
     * @return the rectangle in pixel coordinates.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect VNImageRectForNormalizedRect(@ByValue CGRect normalizedRect, @NUInt long imageWidth,
            @NUInt long imageHeight);

    /**
     * Returns an image rectangle in normalized coordinates.
     * 
     * @param imageRect   The rectangle in image coordinate space.
     * 
     * @param imageWidth  The pixel width of the image.
     * 
     * @param imageHeight The pixel height of the image.
     * 
     * @return the normalized rectangle.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect VNNormalizedRectForImageRect(@ByValue CGRect imageRect, @NUInt long imageWidth,
            @NUInt long imageHeight);

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyAztec();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode39();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode39Checksum();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode39FullASCII();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode39FullASCIIChecksum();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode93();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode93i();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode128();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyDataMatrix();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyEAN8();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyEAN13();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyI2of5();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyI2of5Checksum();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyITF14();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyPDF417();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyQR();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyUPCE();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNErrorDomain();

    /**
     * The normalized identity rect of { {0, 0}, {1, 1} }.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGRect VNNormalizedIdentityRect();

    /**
     * [@const] VNImageOptionProperties
     * 
     * VNImageOptionProperties is the dictionary from CGImageSourceCopyPropertiesAtIndex. This contains metadata that
     * can be used by some algorithms like horizon detection.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNImageOptionProperties();

    /**
     * VNImageOptionCameraIntrinsics Specifies the camera intrinsics as an NSData or CFData representing a
     * matrix_float3x3. See kCMSampleBufferAttachmentKey_CameraIntrinsicMatrix for details
     * 
     * Camera intrinsic matrix is a CFData containing a matrix_float3x3, which is column-major. It has the following
     * contents:
     * fx 0 ox
     * 0 fy oy
     * 0 0 1
     * fx and fy are the focal length in pixels. For square pixels, they will have the same value.
     * ox and oy are the coordinates of the principal point. The origin is the upper left of the frame.
     * [@note] When using a CMSampleBuffer as an input and that sample buffer has camera intrinsics attached to it,
     * Vision will use the camera intrinsic from there unless overwritten by passing in as an explicit option which will
     * take precedence.
     * 
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNImageOptionCameraIntrinsics();

    /**
     * VNImageOptionCIContext Specifies the CIContext to be used in Core Image operations of request handler. If this is
     * not specified, Vision will create its own CIContext. This option is helpful when the passed in CIImage is the
     * result of a CIFilter chain that has been executed on a CIContext or uses outputs of a CIImage on a given
     * CIContext as they don't have to transfer to other contexts.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNImageOptionCIContext();

    /**
     * The version of the Vision framework
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native double VNVisionVersionNumber();

    /**
     * Obtain the size, in bytes, of a given element type.
     * 
     * @param elementType The element type.
     * 
     * @return a byte count, or 0 if the element type is unknown.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long VNElementTypeSize(@NUInt long elementType);

    /**
     * A value that indicates that the request revision is either unknown or not applicable.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long VNRequestRevisionUnspecified = 0x0000000000000000L;
    /**
     * Classification with a taxonomy of 1,303 possible identifiers.
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long VNClassifyImageRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long VNDetectBarcodesRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     * Deprecated-Since: 16.0
     */
    @Deprecated @Generated @NUInt public static final long VNDetectFaceRectanglesRequestRevision1 = 0x0000000000000001L;
    /**
     * This request revsion can calculate face roll and yaw properties. See [VNFaceObservation -roll] and
     * [VNFaceObservation -yaw] respectively.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long VNDetectFaceRectanglesRequestRevision2 = 0x0000000000000002L;
    /**
     * API-Since: 12.0
     * Deprecated-Since: 16.0
     */
    @Deprecated @Generated @NUInt public static final long VNDetectFaceLandmarksRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long VNDetectFaceLandmarksRequestRevision2 = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long VNDetectFaceLandmarksRequestRevision3 = 0x0000000000000003L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long VNDetectFaceCaptureQualityRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long VNDetectHorizonRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long VNDetectRectanglesRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long VNDetectTextRectanglesRequestRevision1 = 0x0000000000000001L;
    /**
     * VNRecognizeTextRequestRevision1 only supports English
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long VNRecognizeTextRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long VNGenerateAttentionBasedSaliencyImageRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long VNGenerateObjectnessBasedSaliencyImageRequestRevision1 = 0x0000000000000001L;
    /**
     * The feature print produced by the `VNClassifyImageRequestRevision1` classifier.
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long VNGenerateImageFeaturePrintRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long VNCoreMLRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long VNTranslationalImageRegistrationRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long VNHomographicImageRegistrationRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long VNTrackObjectRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long VNTrackObjectRequestRevision2 = 0x0000000000000002L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long VNTrackRectangleRequestRevision1 = 0x0000000000000001L;
    /**
     * This request revsion can detect human upper body only
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long VNDetectHumanRectanglesRequestRevision1 = 0x0000000000000001L;

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalIdentifierDog();

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalIdentifierCat();

    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long VNRecognizeAnimalsRequestRevision1 = 0x0000000000000001L;

    /**
     * Returns a point in normalized coordinate space that is projected from a point in a image coordinates
     * 
     * @param imagePoint  The point in image coordinate space.
     * 
     * @param imageWidth  The pixel width of the image.
     * 
     * @param imageHeight The pixel height of the image.
     * 
     * @return the point in normalized coordinates.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint VNNormalizedPointForImagePoint(@ByValue CGPoint imagePoint, @NUInt long imageWidth,
            @NUInt long imageHeight);

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNVideoProcessingOptionFrameCadence();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNVideoProcessingOptionTimeInterval();

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long VNDetectFaceCaptureQualityRequestRevision2 = 0x0000000000000002L;
    /**
     * VNRecognizeTextRequestRevision2 supports English, Chinese, Portuguese, French, Italian, German and Spanish in the
     * accurate recognition level. The fast recognition level supports English, Portuguese, French, Italian, German and
     * Spanish. Best practice is to use supportedRecognitionLanguagesForTextRecognitionLevel to check for supported
     * languages. As the underlying engine has changed from VNRecognizeTextRequestRevision1, results can differ but are
     * generally more accurate.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long VNRecognizeTextRequestRevision2 = 0x0000000000000002L;

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNRecognizedPointGroupKeyAll();

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long VNGenerateOpticalFlowRequestRevision1 = 0x0000000000000001L;

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyNose();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftEye();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightEye();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftEar();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightEar();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftShoulder();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightShoulder();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyNeck();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftElbow();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightElbow();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftWrist();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightWrist();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftHip();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightHip();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRoot();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftKnee();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightKnee();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftAnkle();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightAnkle();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyFace();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyTorso();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyLeftArm();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyRightArm();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyLeftLeg();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyRightLeg();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameNose();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftEye();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightEye();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftEar();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightEar();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftShoulder();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightShoulder();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameNeck();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftElbow();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightElbow();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftWrist();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightWrist();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftHip();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightHip();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRoot();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftKnee();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightKnee();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftAnkle();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightAnkle();

    /**
     * nose, eyes, and ears
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameFace();

    /**
     * shoulders, neck and hips
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameTorso();

    /**
     * left shoulder, left elbow, and left wrist
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameLeftArm();

    /**
     * right shoulder, right elbow, and right wrist
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameRightArm();

    /**
     * left ankle, left knee, and left hip
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameLeftLeg();

    /**
     * right ankle, right knee, and right hip
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameRightLeg();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameAll();

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long VNDetectHumanBodyPoseRequestRevision1 = 0x0000000000000001L;

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameWrist();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameThumbCMC();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameThumbMP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameThumbIP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameThumbTip();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameIndexMCP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameIndexPIP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameIndexDIP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameIndexTip();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameMiddleMCP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameMiddlePIP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameMiddleDIP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameMiddleTip();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameRingMCP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameRingPIP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameRingDIP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameRingTip();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameLittleMCP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameLittlePIP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameLittleDIP();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameLittleTip();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameThumb();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameIndexFinger();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameMiddleFinger();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameRingFinger();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameLittleFinger();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameAll();

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long VNDetectHumanHandPoseRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long VNDetectContourRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long VNDetectTrajectoriesRequestRevision1 = 0x0000000000000001L;

    /**
     * Returns a point in (possibly non-integral) image coordinates that is projected from a point in a normalized
     * coordinate space taking the region of interest (roi) into account.
     * 
     * @param normalizedPoint The point in the normalized coordinate space of [0..1].
     * 
     * @param imageWidth      The pixel width of the image.
     * 
     * @param imageHeight     The pixel height of the image.
     * 
     * @param roi             The region of interest on which the normalized point was based on.
     * 
     * @return the point in image coordinates from a normalized point that was reported in relation to a region of
     *         interest.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint VNImagePointForNormalizedPointUsingRegionOfInterest(@ByValue CGPoint normalizedPoint,
            @NUInt long imageWidth, @NUInt long imageHeight, @ByValue CGRect roi);

    /**
     * Returns a point in normalized coordinate space within a spedified regioin of interest (roi) that is projected
     * from a point in a image coordinates
     * 
     * @param imagePoint  The point in image coordinate space.
     * 
     * @param imageWidth  The pixel width of the image.
     * 
     * @param imageHeight The pixel height of the image.
     * 
     * @param roi         The region of interest on which the normalized point will based on.
     * 
     * @return the point in normalized coordinates in relation to the region of interest.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint VNNormalizedPointForImagePointUsingRegionOfInterest(@ByValue CGPoint imagePoint,
            @NUInt long imageWidth, @NUInt long imageHeight, @ByValue CGRect roi);

    /**
     * Returns a rectangle in (possibly non-integral) image coordinates that is projected from a rectangle in a
     * normalized coordinate space taking the region of interest (roi) into account.
     * 
     * @param normalizedRect The rectangle in the normalized coordinate space of [0..1].
     * 
     * @param imageWidth     The pixel width of the image.
     * 
     * @param imageHeight    The pixel height of the image.
     * 
     * @param roi            The region of interest on which the normalized point was based on.
     * 
     * @return the rectangle in pixel coordinates from a normalized rectangle that was reported in relation to a region
     *         of interest.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect VNImageRectForNormalizedRectUsingRegionOfInterest(@ByValue CGRect normalizedRect,
            @NUInt long imageWidth, @NUInt long imageHeight, @ByValue CGRect roi);

    /**
     * Returns an image rectangle in normalized coordinates in relation to the region of interest.
     * 
     * @param imageRect   The rectangle in image coordinate space.
     * 
     * @param imageWidth  The pixel width of the image.
     * 
     * @param imageHeight The pixel height of the image.
     * 
     * @param roi         The region of interest on which the normalized rect will be based on.
     * 
     * @return the normalized rectangle in relation to the region of interest.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect VNNormalizedRectForImageRectUsingRegionOfInterest(@ByValue CGRect imageRect,
            @NUInt long imageWidth, @NUInt long imageHeight, @ByValue CGRect roi);

    /**
     * Revision 2
     * 
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCodabar();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyGS1DataBar();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyGS1DataBarExpanded();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyGS1DataBarLimited();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyMicroPDF417();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyMicroQR();

    /**
     * expands the set of detected symbologies and uses updated detection methods in comparison to revision 1
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long VNDetectBarcodesRequestRevision2 = 0x0000000000000002L;
    /**
     * This request revsion can calculate face pitch, in addition to roll and yaw, see [VNFaceObservation -pitch]
     * property. In addition, all three properties - roll, yaw, and pitch are now reported in contiguous manner.
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long VNDetectFaceRectanglesRequestRevision3 = 0x0000000000000003L;
    /**
     * This request revsion can detect human full body in addition to upper body only in the previous revision. The
     * choice is controlled by [VNDetectHumanRectanglesRequest -upperBodyOnly] property, which is by default set to YES
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long VNDetectHumanRectanglesRequestRevision2 = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long VNRecognizeAnimalsRequestRevision2 = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long VNGeneratePersonSegmentationRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long VNDetectDocumentSegmentationRequestRevision1 = 0x0000000000000001L;
    /**
     * uses updated detection methods in comparison to revision 1 and 2
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long VNDetectBarcodesRequestRevision3 = 0x0000000000000003L;
    /**
     * VNRecognizeTextRequestRevision3 supports all languages from previous revisions plus some new languages in the
     * accurate recognition level. It also improves recognition capbilities for rotation and handwriting as well as
     * support for the automatic language detection property. Best practice is to use
     * supportedRecognitionLanguagesForTextRecognitionLevel to check for supported languages. As the underlying engine
     * has changed from previous revsions, results can differ but are generally more accurate.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long VNRecognizeTextRequestRevision3 = 0x0000000000000003L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long VNGenerateOpticalFlowRequestRevision2 = 0x0000000000000002L;

    /**
     * The stage of a request where the main functionality is being performed.
     * 
     * All requests will have this compute stage.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNComputeStageMain();

    /**
     * A compute stage for additional analysis and/or conversion of the data produced by the `VNComputeStageMain`.
     * 
     * This is an optional compute stage that some requests may expose.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNComputeStagePostProcessing();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyMSIPlessey();

    /**
     * Head
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameLeftEarTop();

    /**
     * Head
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameRightEarTop();

    /**
     * Head
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameLeftEarMiddle();

    /**
     * Head
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameRightEarMiddle();

    /**
     * Head
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameLeftEarBottom();

    /**
     * Head
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameRightEarBottom();

    /**
     * Head
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameLeftEye();

    /**
     * Head
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameRightEye();

    /**
     * Head
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameNose();

    /**
     * Trunk
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameNeck();

    /**
     * Forelegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameLeftFrontElbow();

    /**
     * Forelegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameRightFrontElbow();

    /**
     * Forelegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameLeftFrontKnee();

    /**
     * Forelegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameRightFrontKnee();

    /**
     * Forelegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameLeftFrontPaw();

    /**
     * Forelegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameRightFrontPaw();

    /**
     * Hindlegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameLeftBackElbow();

    /**
     * Hindlegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameRightBackElbow();

    /**
     * Hindlegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameLeftBackKnee();

    /**
     * Hindlegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameRightBackKnee();

    /**
     * Hindlegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameLeftBackPaw();

    /**
     * Hindlegs
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameRightBackPaw();

    /**
     * Tail
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameTailTop();

    /**
     * Tail
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameTailMiddle();

    /**
     * Tail
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointNameTailBottom();

    /**
     * Nose, eyes and ears
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointsGroupNameHead();

    /**
     * Neck
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointsGroupNameTrunk();

    /**
     * Front left/right elbows, knees and paws
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointsGroupNameForelegs();

    /**
     * Back left/right elbows, knees and paws
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointsGroupNameHindlegs();

    /**
     * Top, middle, bottom parts of tail
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointsGroupNameTail();

    /**
     * All
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalBodyPoseObservationJointsGroupNameAll();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameRoot();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameRightHip();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameRightKnee();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameRightAnkle();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameLeftHip();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameLeftKnee();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameLeftAnkle();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameSpine();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameCenterShoulder();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameCenterHead();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameTopHead();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameLeftShoulder();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameLeftElbow();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameLeftWrist();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameRightShoulder();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameRightElbow();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointNameRightWrist();

    /**
     * center head, and top of head
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointsGroupNameHead();

    /**
     * shoulders, spine, and hips
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointsGroupNameTorso();

    /**
     * left shoulder, left elbow, and left wrist
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointsGroupNameLeftArm();

    /**
     * right shoulder, right elbow, and right wrist
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointsGroupNameRightArm();

    /**
     * left ankle, left knee, and left hip
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointsGroupNameLeftLeg();

    /**
     * right ankle, right knee, and right hip
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointsGroupNameRightLeg();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPose3DObservationJointsGroupNameAll();

    /**
     * API-Since: 14.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String VNRecognizedPoint3DGroupKeyAll();

    /**
     * The same taxonomy as `VNClassifyImageRequestRevision1` but with improved accuracy, reduced latency and memory
     * utilization.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNClassifyImageRequestRevision2 = 0x0000000000000002L;
    /**
     * expands set of detected symbologies, improves accuracy, offers supplemental payloads,
     * adds inverted color support, and may produce observations outside image bounds in comparision to prior revisions
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNDetectBarcodesRequestRevision4 = 0x0000000000000004L;
    /**
     * The revision shows better correlation with human judgement on a larger and more diverse dataset. It is also more
     * stable with respect to minor image variations.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNDetectFaceCaptureQualityRequestRevision3 = 0x0000000000000003L;
    /**
     * Improved accuracy, reduced latency and memory utilization.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNGenerateAttentionBasedSaliencyImageRequestRevision2 = 0x0000000000000002L;
    /**
     * Improved accuracy, reduced latency and memory utilization.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNGenerateObjectnessBasedSaliencyImageRequestRevision2 = 0x0000000000000002L;
    /**
     * The feature print produced by the `VNClassifyImageRequestRevision2` classifier.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNGenerateImageFeaturePrintRequestRevision2 = 0x0000000000000002L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNGenerateForegroundInstanceMaskRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNGeneratePersonInstanceMaskRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNTrackTranslationalImageRegistrationRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNTrackHomographicImageRegistrationRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNTrackOpticalFlowRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNDetectAnimalBodyPoseRequestRevision1 = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long VNDetectHumanBodyPose3DRequestRevision1 = 0x0000000000000001L;
}
