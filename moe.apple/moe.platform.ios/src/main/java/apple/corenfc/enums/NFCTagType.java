package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] NFCTagType
 * <p>
 * [@constant] NFCTagTypeISO15693             ISO15693 tag.
 * [@constant] NFCTagTypeFeliCa               FeliCa tag.
 * [@constant] NFCTagTypeISO7816Compatible    ISO14443-4 type A / B tag with ISO7816 communication.
 * [@constant] NFCTagTypeMiFare               MiFare technology tag (MIFARE Plus, UltraLight, DESFire) base on ISO14443.
 */
@Generated
public final class NFCTagType {
    @Generated
    private NFCTagType() {
    }

    @Generated @NUInt public static final long ISO15693 = 0x0000000000000001L;
    @Generated @NUInt public static final long FeliCa = 0x0000000000000002L;
    @Generated @NUInt public static final long ISO7816Compatible = 0x0000000000000003L;
    @Generated @NUInt public static final long MiFare = 0x0000000000000004L;
}
