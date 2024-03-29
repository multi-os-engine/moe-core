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

package apple.webkit.protocol;

import apple.webkit.WKScriptMessage;
import apple.webkit.WKUserContentController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * A class conforming to the WKScriptMessageHandler protocol provides a
 * method for receiving messages from JavaScript running in a webpage.
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKScriptMessageHandler")
public interface WKScriptMessageHandler {
    /**
     * Invoked when a script message is received from a webpage.
     * 
     * @param userContentController The user content controller invoking the
     *                              delegate method.
     * @param message               The script message received.
     */
    @Generated
    @Selector("userContentController:didReceiveScriptMessage:")
    void userContentControllerDidReceiveScriptMessage(@NotNull WKUserContentController userContentController,
            @NotNull WKScriptMessage message);
}
