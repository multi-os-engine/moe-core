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

package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] WKNavigationType
 * 
 * The type of action triggering a navigation.
 * [@constant] WKNavigationTypeLinkActivated A link with an href attribute was activated by the user.
 * [@constant] WKNavigationTypeFormSubmitted A form was submitted.
 * [@constant] WKNavigationTypeBackForward An item from the back-forward list was requested.
 * [@constant] WKNavigationTypeReload The webpage was reloaded.
 * [@constant] WKNavigationTypeFormResubmitted A form was resubmitted (for example by going back, going forward, or
 * reloading).
 * [@constant] WKNavigationTypeOther Navigation is taking place for some other reason.
 * 
 * API-Since: 8.0
 */
@Generated
public final class WKNavigationType {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long LinkActivated = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long FormSubmitted = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long BackForward = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Reload = 0x0000000000000003L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long FormResubmitted = 0x0000000000000004L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Other = 0xFFFFFFFFFFFFFFFFL;

    @Generated
    private WKNavigationType() {
    }
}
