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

package apple.security.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef] SecAccessControlCreateFlags
 * 
 * [@constant] kSecAccessControlUserPresence
 * User presence policy using biometry or Passcode. Biometry does not have to be available or enrolled. Item is still
 * accessible by Touch ID even if fingers are added or removed. Item is still accessible by Face ID if user is
 * re-enrolled.
 * 
 * [@constant] kSecAccessControlBiometryAny
 * Constraint: Touch ID (any finger) or Face ID. Touch ID or Face ID must be available. With Touch ID
 * at least one finger must be enrolled. With Face ID user has to be enrolled. Item is still accessible by Touch ID even
 * if fingers are added or removed. Item is still accessible by Face ID if user is re-enrolled.
 * 
 * [@constant] kSecAccessControlTouchIDAny
 * Deprecated, please use kSecAccessControlBiometryAny instead.
 * 
 * [@constant] kSecAccessControlBiometryCurrentSet
 * Constraint: Touch ID from the set of currently enrolled fingers. Touch ID must be available and at least one finger
 * must
 * be enrolled. When fingers are added or removed, the item is invalidated. When Face ID is re-enrolled this item is
 * invalidated.
 * 
 * [@constant] kSecAccessControlTouchIDCurrentSet
 * Deprecated, please use kSecAccessControlBiometryCurrentSet instead.
 * 
 * [@constant] kSecAccessControlDevicePasscode
 * Constraint: Device passcode
 * 
 * [@constant] kSecAccessControlWatch
 * Constraint: Watch
 * 
 * [@constant] kSecAccessControlOr
 * Constraint logic operation: when using more than one constraint, at least one of them must be satisfied.
 * 
 * [@constant] kSecAccessControlAnd
 * Constraint logic operation: when using more than one constraint, all must be satisfied.
 * 
 * [@constant] kSecAccessControlPrivateKeyUsage
 * Create access control for private key operations (i.e. sign operation)
 * 
 * [@constant] kSecAccessControlApplicationPassword
 * Security: Application provided password for data encryption key generation. This is not a constraint but additional
 * item
 * encryption mechanism.
 * 
 * API-Since: 8.0
 */
@Generated
public final class SecAccessControlCreateFlags {
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long UserPresence = 0x0000000000000001L;
    /**
     * API-Since: 9.0
     * Deprecated-Since: 11.3
     */
    @Deprecated @Generated @NUInt public static final long TouchIDAny = 0x0000000000000002L;
    /**
     * API-Since: 9.0
     * Deprecated-Since: 11.3
     */
    @Deprecated @Generated @NUInt public static final long TouchIDCurrentSet = 0x0000000000000008L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long DevicePasscode = 0x0000000000000010L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long Or = 0x0000000000004000L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long And = 0x0000000000008000L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long PrivateKeyUsage = 0x0000000040000000L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long ApplicationPassword = 0x0000000080000000L;

    @Generated
    private SecAccessControlCreateFlags() {
    }

    /**
     * API-Since: 11.3
     */
    @Generated @NUInt public static final long BiometryAny = 0x0000000000000002L;
    /**
     * API-Since: 11.3
     */
    @Generated @NUInt public static final long BiometryCurrentSet = 0x0000000000000008L;
}
