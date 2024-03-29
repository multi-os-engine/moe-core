package apple.classkit.protocol;

import apple.classkit.CLSContext;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The CLSContext provider protocol.
 * 
 * The app extension that provides CLSContexts should adopt this protocol.
 * 
 * API-Since: 12.2
 */
@Generated
@Library("ClassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CLSContextProvider")
public interface CLSContextProvider {
    /**
     * This method asks the app extension to update CLSContexts that are descendants of a given context.
     * 
     * The extension may choose to modify, delete, or create some or all descendants of the given context. The host app
     * may call this method as the user selects a context.
     * 
     * @param context    A CLSContext whose descendants are to be updated
     * @param completion A completion block the extension should call with an optional error to indicate success or
     *                   failure.
     */
    @Generated
    @Selector("updateDescendantsOfContext:completion:")
    void updateDescendantsOfContextCompletion(@NotNull CLSContext context,
            @NotNull @ObjCBlock(name = "call_updateDescendantsOfContextCompletion") Block_updateDescendantsOfContextCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateDescendantsOfContextCompletion {
        @Generated
        void call_updateDescendantsOfContextCompletion(@Nullable NSError error);
    }
}
