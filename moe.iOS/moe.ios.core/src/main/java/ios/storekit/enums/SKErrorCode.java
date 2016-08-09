package ios.storekit.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class SKErrorCode {
	@Generated
	private SKErrorCode() {
	}

	@Generated
	@NInt
	public static final long Unknown = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long ClientInvalid = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long PaymentCancelled = 0x0000000000000002L;
	@Generated
	@NInt
	public static final long PaymentInvalid = 0x0000000000000003L;
	@Generated
	@NInt
	public static final long PaymentNotAllowed = 0x0000000000000004L;
	@Generated
	@NInt
	public static final long StoreProductNotAvailable = 0x0000000000000005L;
	@Generated
	@NInt
	public static final long CloudServicePermissionDenied = 0x0000000000000006L;
	@Generated
	@NInt
	public static final long CloudServiceNetworkConnectionFailed = 0x0000000000000007L;
}