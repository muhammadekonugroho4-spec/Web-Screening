package securities.transactional.negoengine.order.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum OrderOuterClass$SettlementSchedule extends Enum<OrderOuterClass$SettlementSchedule> implements Internal.EnumLite {
    public static final OrderOuterClass$SettlementSchedule SETTLEMENT_SCHEDULE_T_PLUS_2 = null;
    public static final int SETTLEMENT_SCHEDULE_T_PLUS_2_VALUE = 3;
    public static final OrderOuterClass$SettlementSchedule SETTLEMENT_SCHEDULE_UNSPECIFIED = null;
    public static final int SETTLEMENT_SCHEDULE_UNSPECIFIED_VALUE = 0;
    public static final OrderOuterClass$SettlementSchedule UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183906a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ OrderOuterClass$SettlementSchedule[] f183907b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183908a = null;

        static {
            f183908a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (OrderOuterClass$SettlementSchedule.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        SETTLEMENT_SCHEDULE_UNSPECIFIED = new OrderOuterClass$SettlementSchedule("SETTLEMENT_SCHEDULE_UNSPECIFIED", 0, 0);
        SETTLEMENT_SCHEDULE_T_PLUS_2 = new OrderOuterClass$SettlementSchedule("SETTLEMENT_SCHEDULE_T_PLUS_2", 1, 3);
        UNRECOGNIZED = new OrderOuterClass$SettlementSchedule("UNRECOGNIZED", 2, -1);
        f183907b = a();
        f183906a = new a();
    }

    OrderOuterClass$SettlementSchedule(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ OrderOuterClass$SettlementSchedule[] a() {
        return new OrderOuterClass$SettlementSchedule[]{SETTLEMENT_SCHEDULE_UNSPECIFIED, SETTLEMENT_SCHEDULE_T_PLUS_2, UNRECOGNIZED};
    }

    public static OrderOuterClass$SettlementSchedule forNumber(int r1) {
        if (r1 == 0) goto L10;
        if (r1 == 3) goto L8;
        return null;
    L8:
        return SETTLEMENT_SCHEDULE_T_PLUS_2;
    L10:
        return SETTLEMENT_SCHEDULE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<OrderOuterClass$SettlementSchedule> internalGetValueMap() {
        return f183906a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183908a;
    }

    public static OrderOuterClass$SettlementSchedule valueOf(String r1) {
        return (OrderOuterClass$SettlementSchedule) Enum.valueOf(OrderOuterClass$SettlementSchedule.class, r1);
    }

    public static OrderOuterClass$SettlementSchedule[] values() {
        return (OrderOuterClass$SettlementSchedule[]) f183907b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OrderOuterClass$SettlementSchedule valueOf(int r02) {
        return forNumber(r02);
    }
}
