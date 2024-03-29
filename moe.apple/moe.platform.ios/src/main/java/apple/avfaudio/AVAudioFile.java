package apple.avfaudio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * AVAudioFile
 * 
 * An audio file opened for reading or writing.
 * 
 * Regardless of the file's actual format, reading and writing the file is done via
 * `AVAudioPCMBuffer` objects, containing samples in an `AVAudioCommonFormat`,
 * referred to as the file's "processing format." Conversions are performed to and from
 * the file's actual format.
 * 
 * Reads and writes are always sequential, but random access is possible by setting the
 * framePosition property.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioFile extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioFile(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioFile alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioFile allocWithZone(VoidPtr zone);

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

    /**
     * [@property] fileFormat
     * 
     * The on-disk format of the file.
     */
    @NotNull
    @Generated
    @Selector("fileFormat")
    public native AVAudioFormat fileFormat();

    /**
     * [@property] framePosition
     * 
     * The position in the file at which the next read or write will occur.
     * 
     * Set framePosition to perform a seek before a read or write. A read or write operation advances the frame position
     * by the number of frames read or written.
     */
    @Generated
    @Selector("framePosition")
    public native long framePosition();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioFile init();

    /**
     * initForReading:commonFormat:interleaved:error:
     * 
     * Open a file for reading, using a specified processing format.
     * 
     * @param fileURL
     *                    the file to open
     * @param format
     *                    the processing format to use when reading from the file
     * @param interleaved
     *                    whether to use an interleaved processing format
     * @param outError
     *                    on exit, if an error occurs, a description of the error
     */
    @Generated
    @Selector("initForReading:commonFormat:interleaved:error:")
    public native AVAudioFile initForReadingCommonFormatInterleavedError(@NotNull NSURL fileURL, @NUInt long format,
            boolean interleaved, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * initForReading:error:
     * 
     * Open a file for reading.
     * 
     * This opens the file for reading using the standard format (deinterleaved floating point).
     * 
     * @param fileURL
     *                 the file to open
     * @param outError
     *                 on exit, if an error occurs, a description of the error
     */
    @Generated
    @Selector("initForReading:error:")
    public native AVAudioFile initForReadingError(@NotNull NSURL fileURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * initForWriting:settings:commonFormat:interleaved:error:
     * 
     * Open a file for writing.
     * 
     * The file type to create can be set through the corresponding settings key. If not set, it will be
     * inferred from the file extension. Will overwrite a file at the specified URL if a file exists.
     * 
     * @param fileURL
     *                    the path at which to create the file
     * @param settings
     *                    the format of the file to create (See `AVAudioRecorder`.) For linear PCM,
     *                    only interleaved formats are supported for the saved file, non interleaved setting will be
     *                    ignored and a warning is shown.
     * @param format
     *                    the processing format to use when writing to the file.
     * @param interleaved
     *                    whether to use an interleaved processing format
     * @param outError
     *                    on exit, if an error occurs, a description of the error
     */
    @Generated
    @Selector("initForWriting:settings:commonFormat:interleaved:error:")
    public native AVAudioFile initForWritingSettingsCommonFormatInterleavedError(@NotNull NSURL fileURL,
            @NotNull NSDictionary<String, ?> settings, @NUInt long format, boolean interleaved,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * initForWriting:settings:error:
     * 
     * Open a file for writing.
     * 
     * The file type to create can be set through the corresponding settings key. If not set, it will be
     * inferred from the file extension. Will overwrite a file at the specified URL if a file exists.
     * 
     * This opens the file for writing using the standard format (deinterleaved floating point).
     * 
     * @param fileURL
     *                 the path at which to create the file
     * @param settings
     *                 the format of the file to create (See `AVAudioRecorder`.) For linear PCM,
     *                 only interleaved formats are supported for the saved file, non interleaved setting will be
     *                 ignored and a warning is shown.
     * @param outError
     *                 on exit, if an error occurs, a description of the error
     */
    @Generated
    @Selector("initForWriting:settings:error:")
    public native AVAudioFile initForWritingSettingsError(@NotNull NSURL fileURL,
            @NotNull NSDictionary<String, ?> settings,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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

    /**
     * [@property] length
     * 
     * The number of sample frames in the file.
     * 
     * Note: this can be expensive to compute for the first time.
     */
    @Generated
    @Selector("length")
    public native long length();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioFile new_objc();

    /**
     * [@property] processingFormat
     * 
     * The processing format of the file.
     */
    @NotNull
    @Generated
    @Selector("processingFormat")
    public native AVAudioFormat processingFormat();

    /**
     * readIntoBuffer:error:
     * 
     * Read an entire buffer.
     * 
     * Reading sequentially from framePosition, attempts to fill the buffer to its capacity. On
     * return, the buffer's length indicates the number of sample frames successfully read.
     * 
     * @param buffer
     *                 The buffer into which to read from the file. Its format must match the file's
     *                 processing format.
     * @param outError
     *                 on exit, if an error occurs, a description of the error
     * @return
     *         YES for success.
     */
    @Generated
    @Selector("readIntoBuffer:error:")
    public native boolean readIntoBufferError(@NotNull AVAudioPCMBuffer buffer,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * readIntoBuffer:frameCount:error:
     * 
     * Read a portion of a buffer.
     * 
     * Like `readIntoBuffer:error:`, but can be used to read fewer frames than buffer.frameCapacity.
     * 
     * @param frames
     *                 The number of frames to read.
     * @param buffer
     *                 The buffer into which to read from the file. Its format must match the file's
     *                 processing format.
     * @param outError
     *                 on exit, if an error occurs, a description of the error
     * @return
     *         YES for success.
     */
    @Generated
    @Selector("readIntoBuffer:frameCount:error:")
    public native boolean readIntoBufferFrameCountError(@NotNull AVAudioPCMBuffer buffer, int frames,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] framePosition
     * 
     * The position in the file at which the next read or write will occur.
     * 
     * Set framePosition to perform a seek before a read or write. A read or write operation advances the frame position
     * by the number of frames read or written.
     */
    @Generated
    @Selector("setFramePosition:")
    public native void setFramePosition(long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] url
     * 
     * The URL the file is reading or writing.
     */
    @NotNull
    @Generated
    @Selector("url")
    public native NSURL url();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * writeFromBuffer:error:
     * 
     * Write a buffer.
     * 
     * Writes sequentially. The buffer's frameLength signifies how much of the buffer is to be written.
     * 
     * @param buffer
     *                 The buffer from which to write to the file. Its format must match the file's
     *                 processing format.
     * @param outError
     *                 on exit, if an error occurs, a description of the error
     * @return
     *         YES for success.
     */
    @Generated
    @Selector("writeFromBuffer:error:")
    public native boolean writeFromBufferError(@NotNull AVAudioPCMBuffer buffer,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
