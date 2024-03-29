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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] NSURLRequestNetworkServiceType
 * 
 * The NSURLRequestNetworkServiceType enum defines constants that
 * can be used to specify the service type to associate with this request. The
 * service type is used to provide the networking layers a hint of the purpose
 * of the request.
 * 
 * [@constant] NSURLNetworkServiceTypeDefault Is the default value for an NSURLRequest
 * when created. This value should be left unchanged for the vast majority of requests.
 * 
 * [@constant] NSURLNetworkServiceTypeVoIP Specifies that the request is for voice over IP
 * control traffic.
 * 
 * [@constant] NSURLNetworkServiceTypeVideo Specifies that the request is for video
 * traffic.
 * 
 * [@constant] NSURLNetworkServiceTypeBackground Specifies that the request is for background
 * traffic (such as a file download).
 * 
 * [@constant] NSURLNetworkServiceTypeVoice Specifies that the request is for voice data.
 * 
 * [@constant] NSURLNetworkServiceTypeResponsiveData Specifies that the request is for responsive (time sensitive) data.
 * 
 * [@constant] NSURLNetworkServiceTypeAVStreaming Specifies that the request is streaming audio/video data.
 * 
 * [@constant] NSURLNetworkServiceTypeResponsiveAV Specifies that the request is for responsive (time sensitive)
 * audio/video data.
 * 
 * [@constant] NSURLNetworkServiceTypeCallSignaling Specifies that the request is for call signaling.
 */
@Generated
public final class NSURLRequestNetworkServiceType {
    /**
     * Standard internet traffic
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * Voice over IP control traffic
     * 
     * API-Since: 4.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use PushKit for VoIP control purposes
     */
    @Deprecated @Generated @NUInt public static final long VoIP = 0x0000000000000001L;
    /**
     * Video traffic
     */
    @Generated @NUInt public static final long Video = 0x0000000000000002L;
    /**
     * Background traffic
     */
    @Generated @NUInt public static final long Background = 0x0000000000000003L;
    /**
     * Voice data
     */
    @Generated @NUInt public static final long Voice = 0x0000000000000004L;
    /**
     * Call Signaling
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long CallSignaling = 0x000000000000000BL;

    @Generated
    private NSURLRequestNetworkServiceType() {
    }

    /**
     * Responsive data
     */
    @Generated @NUInt public static final long ResponsiveData = 0x0000000000000006L;
    /**
     * Multimedia Audio/Video Streaming
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long AVStreaming = 0x0000000000000008L;
    /**
     * Responsive Multimedia Audio/Video
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long ResponsiveAV = 0x0000000000000009L;
}
