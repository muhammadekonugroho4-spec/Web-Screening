package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESSFUL", "REREGISTER", "CANCELLED", "ALREADY_SELECTED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum TrySelectDetailedResult extends Enum<TrySelectDetailedResult> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ TrySelectDetailedResult[] $VALUES = null;
    public static final TrySelectDetailedResult ALREADY_SELECTED = null;
    public static final TrySelectDetailedResult CANCELLED = null;
    public static final TrySelectDetailedResult REREGISTER = null;
    public static final TrySelectDetailedResult SUCCESSFUL = null;

    private static final /* synthetic */ TrySelectDetailedResult[] $values() {
        return new TrySelectDetailedResult[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    static {
        SUCCESSFUL = new TrySelectDetailedResult("SUCCESSFUL", 0);
        REREGISTER = new TrySelectDetailedResult("REREGISTER", 1);
        CANCELLED = new TrySelectDetailedResult("CANCELLED", 2);
        ALREADY_SELECTED = new TrySelectDetailedResult("ALREADY_SELECTED", 3);
        TrySelectDetailedResult[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
    }

    TrySelectDetailedResult(String r1, int r2) {
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    public static TrySelectDetailedResult valueOf(String r1) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, r1);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) $VALUES.clone();
    }
}
