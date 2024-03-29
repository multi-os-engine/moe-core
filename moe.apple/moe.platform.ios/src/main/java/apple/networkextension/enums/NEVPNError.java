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

package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEVPNError
 * 
 * VPN error codes
 * 
 * API-Since: 8.0
 */
@Generated
public final class NEVPNError {
    /**
     * [@const] NEVPNErrorConfigurationInvalid The VPN configuration is invalid
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ConfigurationInvalid = 0x0000000000000001L;
    /**
     * [@const] NEVPNErrorConfigurationDisabled The VPN configuration is not enabled.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ConfigurationDisabled = 0x0000000000000002L;
    /**
     * [@const] NEVPNErrorConnectionFailed The connection to the VPN server failed.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ConnectionFailed = 0x0000000000000003L;
    /**
     * [@const] NEVPNErrorConfigurationStale The VPN configuration is stale and needs to be loaded.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ConfigurationStale = 0x0000000000000004L;
    /**
     * [@const] NEVPNErrorConfigurationReadWriteFailed The VPN configuration cannot be read from or written to disk.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ConfigurationReadWriteFailed = 0x0000000000000005L;
    /**
     * [@const] NEVPNErrorConfigurationUnknown An unknown configuration error occurred.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ConfigurationUnknown = 0x0000000000000006L;

    @Generated
    private NEVPNError() {
    }
}
