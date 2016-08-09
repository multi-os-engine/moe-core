package ios.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_port_options extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public mach_port_options() {
		super(mach_port_options.class);
	}

	@Generated
	protected mach_port_options(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int flags();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setFlags(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@ByValue
	public native mach_port_limits mpl();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setMpl(@ByValue mach_port_limits value);

	@Generated
	@StructureField(order = 2, isGetter = true, count = 2)
	public native long reserved(int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = false, count = 2)
	public native void setReserved(long value, int field_idx);
}