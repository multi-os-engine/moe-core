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
 * [@typedef] NEVPNIKEAuthenticationMethod
 * 
 * Internet Key Exchange (IKE) authentication methods used to authenticate with the IPSec server.
 * 
 * API-Since: 8.0
 */
@Generated
public final class NEVPNIKEAuthenticationMethod {
    /**
     * [@const] NEVPNIKEAuthenticationMethodNone Do not authenticate with the IPSec server
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * [@const] NEVPNIKEAuthenticationMethodCertificate Use a certificate and private key as the authentication
     * credential
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Certificate = 0x0000000000000001L;
    /**
     * [@const] NEVPNIKEAuthenticationMethodSharedSecret Use a shared secret as the authentication credential
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SharedSecret = 0x0000000000000002L;

    @Generated
    private NEVPNIKEAuthenticationMethod() {
    }
}
