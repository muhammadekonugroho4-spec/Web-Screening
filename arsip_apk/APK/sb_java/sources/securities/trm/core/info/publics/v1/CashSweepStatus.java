package securities.trm.core.info.publics.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum CashSweepStatus extends Enum<CashSweepStatus> implements Internal.EnumLite {
    public static final CashSweepStatus CASH_SWEEP_STATUS_ACTIVATED = null;
    public static final int CASH_SWEEP_STATUS_ACTIVATED_VALUE = 3;
    public static final CashSweepStatus CASH_SWEEP_STATUS_ELIGIBLE = null;
    public static final int CASH_SWEEP_STATUS_ELIGIBLE_VALUE = 2;
    public static final CashSweepStatus CASH_SWEEP_STATUS_NOT_ELIGIBLE = null;
    public static final int CASH_SWEEP_STATUS_NOT_ELIGIBLE_VALUE = 1;
    public static final CashSweepStatus CASH_SWEEP_STATUS_UNSPECIFIED = null;
    public static final int CASH_SWEEP_STATUS_UNSPECIFIED_VALUE = 0;
    public static final CashSweepStatus UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183915a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CashSweepStatus[] f183916b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183917a = null;

        static {
            f183917a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (CashSweepStatus.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        CASH_SWEEP_STATUS_UNSPECIFIED = new CashSweepStatus("CASH_SWEEP_STATUS_UNSPECIFIED", 0, 0);
        CASH_SWEEP_STATUS_NOT_ELIGIBLE = new CashSweepStatus("CASH_SWEEP_STATUS_NOT_ELIGIBLE", 1, 1);
        CASH_SWEEP_STATUS_ELIGIBLE = new CashSweepStatus("CASH_SWEEP_STATUS_ELIGIBLE", 2, 2);
        CASH_SWEEP_STATUS_ACTIVATED = new CashSweepStatus("CASH_SWEEP_STATUS_ACTIVATED", 3, 3);
        UNRECOGNIZED = new CashSweepStatus("UNRECOGNIZED", 4, -1);
        f183916b = a();
        f183915a = new a();
    }

    CashSweepStatus(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ CashSweepStatus[] a() {
        return new CashSweepStatus[]{CASH_SWEEP_STATUS_UNSPECIFIED, CASH_SWEEP_STATUS_NOT_ELIGIBLE, CASH_SWEEP_STATUS_ELIGIBLE, CASH_SWEEP_STATUS_ACTIVATED, UNRECOGNIZED};
    }

    public static CashSweepStatus forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return CASH_SWEEP_STATUS_ACTIVATED;
    L14:
        return CASH_SWEEP_STATUS_ELIGIBLE;
    L16:
        return CASH_SWEEP_STATUS_NOT_ELIGIBLE;
    L18:
        return CASH_SWEEP_STATUS_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<CashSweepStatus> internalGetValueMap() {
        return f183915a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183917a;
    }

    public static CashSweepStatus valueOf(String r1) {
        return (CashSweepStatus) Enum.valueOf(CashSweepStatus.class, r1);
    }

    public static CashSweepStatus[] values() {
        return (CashSweepStatus[]) f183916b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CashSweepStatus valueOf(int r02) {
        return forNumber(r02);
    }
}
