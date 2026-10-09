package securities.transactional.negoengine.order.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum OrderOuterClass$SettlementMethod extends Enum<OrderOuterClass$SettlementMethod> implements Internal.EnumLite {
    public static final OrderOuterClass$SettlementMethod SETTLEMENT_METHOD_UNSPECIFIED = null;
    public static final int SETTLEMENT_METHOD_UNSPECIFIED_VALUE = 0;
    public static final OrderOuterClass$SettlementMethod SETTLEMENT_METHOD_VERSUS_PAYMENT = null;
    public static final int SETTLEMENT_METHOD_VERSUS_PAYMENT_VALUE = 1;
    public static final OrderOuterClass$SettlementMethod UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183903a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ OrderOuterClass$SettlementMethod[] f183904b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183905a = null;

        static {
            f183905a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (OrderOuterClass$SettlementMethod.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        SETTLEMENT_METHOD_UNSPECIFIED = new OrderOuterClass$SettlementMethod("SETTLEMENT_METHOD_UNSPECIFIED", 0, 0);
        SETTLEMENT_METHOD_VERSUS_PAYMENT = new OrderOuterClass$SettlementMethod("SETTLEMENT_METHOD_VERSUS_PAYMENT", 1, 1);
        UNRECOGNIZED = new OrderOuterClass$SettlementMethod("UNRECOGNIZED", 2, -1);
        f183904b = a();
        f183903a = new a();
    }

    OrderOuterClass$SettlementMethod(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ OrderOuterClass$SettlementMethod[] a() {
        return new OrderOuterClass$SettlementMethod[]{SETTLEMENT_METHOD_UNSPECIFIED, SETTLEMENT_METHOD_VERSUS_PAYMENT, UNRECOGNIZED};
    }

    public static OrderOuterClass$SettlementMethod forNumber(int r1) {
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L8;
        return null;
    L8:
        return SETTLEMENT_METHOD_VERSUS_PAYMENT;
    L10:
        return SETTLEMENT_METHOD_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<OrderOuterClass$SettlementMethod> internalGetValueMap() {
        return f183903a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183905a;
    }

    public static OrderOuterClass$SettlementMethod valueOf(String r1) {
        return (OrderOuterClass$SettlementMethod) Enum.valueOf(OrderOuterClass$SettlementMethod.class, r1);
    }

    public static OrderOuterClass$SettlementMethod[] values() {
        return (OrderOuterClass$SettlementMethod[]) f183904b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OrderOuterClass$SettlementMethod valueOf(int r02) {
        return forNumber(r02);
    }
}
