package apple.accelerate.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class _SparseIterativeMethodBaseOptions extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public _SparseIterativeMethodBaseOptions() {
        super(_SparseIterativeMethodBaseOptions.class);
    }

    @Generated
    protected _SparseIterativeMethodBaseOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    public _SparseIterativeMethodBaseOptions(
            @FunctionPtr(name = "call_reportError") @Nullable Function_reportError reportError) {
        super(_SparseIterativeMethodBaseOptions.class);
        setReportError(reportError);
    }

    /**
     * reportError should always be FIRST member in below structs
     */
    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_reportError")
    public native Function_reportError reportError();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_reportError {
        @Generated
        void call_reportError(
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg0);
    }

    /**
     * reportError should always be FIRST member in below structs
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setReportError(@Nullable @FunctionPtr(name = "call_reportError") Function_reportError value);
}