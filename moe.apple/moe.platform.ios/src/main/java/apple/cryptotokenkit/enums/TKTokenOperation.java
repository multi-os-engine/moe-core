package apple.cryptotokenkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] TKTokenOperation enumerates operations which can be performed with objects (keys and certificates) on the
 * token.
 * 
 * API-Since: 10.0
 */
@Generated
public final class TKTokenOperation {
    @Generated
    private TKTokenOperation() {
    }

    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Reading of raw data of certificate.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ReadData = 0x0000000000000001L;
    /**
     * Cryptographic signature using private key.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long SignData = 0x0000000000000002L;
    /**
     * Decrypting data using private key.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long DecryptData = 0x0000000000000003L;
    /**
     * Performing Diffie-Hellman style of cryptographic key exchange using private key.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long PerformKeyExchange = 0x0000000000000004L;
}