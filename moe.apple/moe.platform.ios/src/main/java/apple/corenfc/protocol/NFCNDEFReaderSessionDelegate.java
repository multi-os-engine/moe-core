package apple.corenfc.protocol;

import apple.corenfc.NFCNDEFMessage;
import apple.corenfc.NFCNDEFReaderSession;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * [@protocol] NFCNDEFReaderSessionDelegate
 * 
 * NDEF reader session callbacks. Presence of the -readerSession:didDetectTags: optional method will change the session
 * behaviour
 * into a read-write session where @link NFCNDEFTag @link/ objects are returned.
 * 
 * [@note] A read-write session does not trigger the -readerSession:didDetectNDEFs: method.
 * [@note] A read-write session does not get invalidate automatically after a successful tag detection. Invalidation
 * occurs when
 * the invalidation method is called explicitly or the 60 seconds session time limit is reached.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCNDEFReaderSessionDelegate")
public interface NFCNDEFReaderSessionDelegate {
    /**
     * readerSession:didDetectNDEFs:
     * 
     * Gets called when the reader detects NFC tag(s) with NDEF messages in the polling sequence. Polling
     * is automatically restarted once the detected tag is removed from the reader's read range. This method
     * is only get call if the optional -readerSession:didDetectTags: method is not
     * implemented.
     * 
     * API-Since: 11.0
     * 
     * @param session  The session object used for tag detection.
     * @param messages Array of @link NFCNDEFMessage @link/ objects.
     */
    @Generated
    @Selector("readerSession:didDetectNDEFs:")
    void readerSessionDidDetectNDEFs(@NotNull NFCNDEFReaderSession session,
            @NotNull NSArray<? extends NFCNDEFMessage> messages);

    /**
     * readerSession:didDetectTags:
     * 
     * Gets called when the reader detects NDEF tag(s) in the RF field. Presence of this method overrides
     * -readerSession:didDetectNDEFs: and enables
     * read-write capability for the session.
     * 
     * API-Since: 13.0
     * 
     * @param session The session object used for NDEF tag detection.
     * @param tags    Array of @link NFCNDEFTag @link/ objects.
     */
    @Generated
    @IsOptional
    @Selector("readerSession:didDetectTags:")
    default void readerSessionDidDetectTags(@NotNull NFCNDEFReaderSession session, @NotNull NSArray<?> tags) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * readerSession:didInvalidateWithError:
     * 
     * Gets called when a session becomes invalid. At this point the client is expected to discard
     * the returned session object.
     * 
     * API-Since: 11.0
     * 
     * @param session The session object that is invalidated.
     * @param error   The error indicates the invalidation reason.
     */
    @Generated
    @Selector("readerSession:didInvalidateWithError:")
    void readerSessionDidInvalidateWithError(@NotNull NFCNDEFReaderSession session, @NotNull NSError error);

    /**
     * readerSessionDidBecomeActive:
     * 
     * Gets called when the NFC reader session has become active. RF is enabled and reader is scanning for tags.
     * 
     * API-Since: 13.0
     * 
     * @param session The session object in the active state.
     */
    @Generated
    @IsOptional
    @Selector("readerSessionDidBecomeActive:")
    default void readerSessionDidBecomeActive(@NotNull NFCNDEFReaderSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}
