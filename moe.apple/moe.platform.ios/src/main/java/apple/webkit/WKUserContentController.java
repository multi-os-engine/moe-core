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

package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.webkit.protocol.WKScriptMessageHandler;
import apple.webkit.protocol.WKScriptMessageHandlerWithReply;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A WKUserContentController object provides a way for JavaScript to post
 * messages to a web view.
 * The user content controller associated with a web view is specified by its
 * web view configuration.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKUserContentController extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected WKUserContentController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKUserContentController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native WKUserContentController allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native WKUserContentController new_objc();

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
     * Adds a script message handler to the main world used by page content itself.
     * 
     * Calling this method is equivalent to calling addScriptMessageHandler:contentWorld:name:
     * with [WKContentWorld pageWorld] as the contentWorld argument.
     * 
     * @param scriptMessageHandler The script message handler to add.
     * @param name                 The name of the message handler.
     */
    @Generated
    @Selector("addScriptMessageHandler:name:")
    public native void addScriptMessageHandlerName(
            @NotNull @Mapped(ObjCObjectMapper.class) WKScriptMessageHandler scriptMessageHandler, @NotNull String name);

    /**
     * Adds a user script.
     * 
     * @param userScript The user script to add.
     */
    @Generated
    @Selector("addUserScript:")
    public native void addUserScript(@NotNull WKUserScript userScript);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native WKUserContentController init();

    @Generated
    @Selector("initWithCoder:")
    public native WKUserContentController initWithCoder(@NotNull NSCoder coder);

    /**
     * Removes all associated user scripts.
     */
    @Generated
    @Selector("removeAllUserScripts")
    public native void removeAllUserScripts();

    /**
     * Removes a script message handler.
     * 
     * Calling this method is equivalent to calling removeScriptMessageHandlerForName:contentWorld:
     * with [WKContentWorld pageWorld] as the contentWorld argument.
     * 
     * @param name The name of the message handler to remove.
     */
    @Generated
    @Selector("removeScriptMessageHandlerForName:")
    public native void removeScriptMessageHandlerForName(@NotNull String name);

    /**
     * The user scripts associated with this user content
     * controller.
     */
    @NotNull
    @Generated
    @Selector("userScripts")
    public native NSArray<? extends WKUserScript> userScripts();

    /**
     * Adds a content rule list.
     * 
     * @param contentRuleList The content rule list to add.
     * 
     *                        API-Since: 11.0
     */
    @Generated
    @Selector("addContentRuleList:")
    public native void addContentRuleList(@NotNull WKContentRuleList contentRuleList);

    /**
     * Removes all associated content rule lists.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("removeAllContentRuleLists")
    public native void removeAllContentRuleLists();

    /**
     * Removes a content rule list.
     * 
     * @param contentRuleList The content rule list to remove.
     * 
     *                        API-Since: 11.0
     */
    @Generated
    @Selector("removeContentRuleList:")
    public native void removeContentRuleList(@NotNull WKContentRuleList contentRuleList);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Adds a script message handler.
     * 
     * Adding a script message handler adds a function
     * window.webkit.messageHandlers.<name>.postMessage(<messageBody>) to all frames, available in the given
     * WKContentWorld.
     * 
     * The name argument must be a non-empty string.
     * 
     * Each WKContentWorld can have any number of script message handlers, but only one per unique name.
     * 
     * Once any script message handler has been added to a WKContentWorld for a given name, it is an error to add
     * another
     * script message handler to that WKContentWorld for that same name without first removing the previous script
     * message handler.
     * 
     * The above restriction applies to any type of script message handler - WKScriptMessageHandler and
     * WKScriptMessageHandlerWithReply
     * objects will conflict with each other if you try to add them to the same WKContentWorld with the same name.
     * 
     * API-Since: 14.0
     * 
     * @param scriptMessageHandler The script message handler to add.
     * @param contentWorld         The WKContentWorld in which to add the script message handler.
     * @param name                 The name of the message handler.
     */
    @Generated
    @Selector("addScriptMessageHandler:contentWorld:name:")
    public native void addScriptMessageHandlerContentWorldName(
            @NotNull @Mapped(ObjCObjectMapper.class) WKScriptMessageHandler scriptMessageHandler,
            @NotNull WKContentWorld world, @NotNull String name);

    /**
     * Adds a script message handler.
     * 
     * Adding a script message handler adds a function
     * window.webkit.messageHandlers.<name>.postMessage(<messageBody>) to all frames, available in the given
     * WKContentWorld.
     * 
     * The name argument must be a non-empty string.
     * 
     * Each WKContentWorld can have any number of script message handlers, but only one per unique name.
     * 
     * Once any script message handler has been added to a WKContentWorld for a given name, it is an error to add
     * another
     * script message handler to that WKContentWorld for that same name without first removing the previous script
     * message handler.
     * 
     * The above restriction applies to any type of script message handler - WKScriptMessageHandlerWithReply and
     * WKScriptMessageHandler
     * objects will conflict with each other if you try to add them to the same WKContentWorld with the same name.
     * 
     * Refer to the WKScriptMessageHandlerWithReply documentation for examples of how it is more flexible than
     * WKScriptMessageHandler.
     * 
     * API-Since: 14.0
     * 
     * @param scriptMessageHandlerWithReply The script message handler to add.
     * @param contentWorld                  The WKContentWorld in which to add the script message handler.
     * @param name                          The name of the message handler.
     */
    @Generated
    @Selector("addScriptMessageHandlerWithReply:contentWorld:name:")
    public native void addScriptMessageHandlerWithReplyContentWorldName(
            @NotNull @Mapped(ObjCObjectMapper.class) WKScriptMessageHandlerWithReply scriptMessageHandlerWithReply,
            @NotNull WKContentWorld contentWorld, @NotNull String name);

    /**
     * Removes all associated script message handlers.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("removeAllScriptMessageHandlers")
    public native void removeAllScriptMessageHandlers();

    /**
     * Removes all script message handlers from a given WKContentWorld.
     * 
     * @param contentWorld The WKContentWorld from which to remove all script message handlers.
     * 
     *                     API-Since: 14.0
     */
    @Generated
    @Selector("removeAllScriptMessageHandlersFromContentWorld:")
    public native void removeAllScriptMessageHandlersFromContentWorld(@NotNull WKContentWorld contentWorld);

    /**
     * Removes a script message handler.
     * 
     * @param name         The name of the message handler to remove.
     * @param contentWorld The WKContentWorld from which to remove the script message handler.
     * 
     *                     API-Since: 14.0
     */
    @Generated
    @Selector("removeScriptMessageHandlerForName:contentWorld:")
    public native void removeScriptMessageHandlerForNameContentWorld(@NotNull String name,
            @NotNull WKContentWorld contentWorld);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
