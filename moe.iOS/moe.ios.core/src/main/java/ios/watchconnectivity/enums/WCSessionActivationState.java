package ios.watchconnectivity.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class WCSessionActivationState {
	@Generated
	private WCSessionActivationState() {
	}

	@Generated
	@NInt
	public static final long NotActivated = 0x0000000000000000L;
	@Generated
	@NInt
	public static final long Inactive = 0x0000000000000001L;
	@Generated
	@NInt
	public static final long Activated = 0x0000000000000002L;
}