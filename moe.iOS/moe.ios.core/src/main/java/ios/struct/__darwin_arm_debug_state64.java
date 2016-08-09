package ios.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __darwin_arm_debug_state64 extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public __darwin_arm_debug_state64() {
		super(__darwin_arm_debug_state64.class);
	}

	@Generated
	protected __darwin_arm_debug_state64(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true, count = 16)
	public native long __bvr(int field_idx);

	@Generated
	@StructureField(order = 0, isGetter = false, count = 16)
	public native void set__bvr(long value, int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = true, count = 16)
	public native long __bcr(int field_idx);

	@Generated
	@StructureField(order = 1, isGetter = false, count = 16)
	public native void set__bcr(long value, int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = true, count = 16)
	public native long __wvr(int field_idx);

	@Generated
	@StructureField(order = 2, isGetter = false, count = 16)
	public native void set__wvr(long value, int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = true, count = 16)
	public native long __wcr(int field_idx);

	@Generated
	@StructureField(order = 3, isGetter = false, count = 16)
	public native void set__wcr(long value, int field_idx);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native long __mdscr_el1();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void set__mdscr_el1(long value);
}