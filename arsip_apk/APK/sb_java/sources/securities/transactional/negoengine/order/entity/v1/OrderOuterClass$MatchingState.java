package securities.transactional.negoengine.order.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum OrderOuterClass$MatchingState extends Enum<OrderOuterClass$MatchingState> implements Internal.EnumLite {
    public static final OrderOuterClass$MatchingState MATCHING_STATE_APPROVED = null;
    public static final int MATCHING_STATE_APPROVED_VALUE = 3;
    public static final OrderOuterClass$MatchingState MATCHING_STATE_OFFERED = null;
    public static final int MATCHING_STATE_OFFERED_VALUE = 1;
    public static final OrderOuterClass$MatchingState MATCHING_STATE_REJECTED = null;
    public static final int MATCHING_STATE_REJECTED_VALUE = 4;
    public static final OrderOuterClass$MatchingState MATCHING_STATE_UNSPECIFIED = null;
    public static final int MATCHING_STATE_UNSPECIFIED_VALUE = 0;
    public static final OrderOuterClass$MatchingState MATCHING_STATE_WAITING_CONFIRMATION = null;
    public static final int MATCHING_STATE_WAITING_CONFIRMATION_VALUE = 2;
    public static final OrderOuterClass$MatchingState UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183894a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ OrderOuterClass$MatchingState[] f183895b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183896a = null;

        static {
            f183896a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (OrderOuterClass$MatchingState.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        MATCHING_STATE_UNSPECIFIED = new OrderOuterClass$MatchingState("MATCHING_STATE_UNSPECIFIED", 0, 0);
        MATCHING_STATE_OFFERED = new OrderOuterClass$MatchingState("MATCHING_STATE_OFFERED", 1, 1);
        MATCHING_STATE_WAITING_CONFIRMATION = new OrderOuterClass$MatchingState("MATCHING_STATE_WAITING_CONFIRMATION", 2, 2);
        MATCHING_STATE_APPROVED = new OrderOuterClass$MatchingState("MATCHING_STATE_APPROVED", 3, 3);
        MATCHING_STATE_REJECTED = new OrderOuterClass$MatchingState("MATCHING_STATE_REJECTED", 4, 4);
        UNRECOGNIZED = new OrderOuterClass$MatchingState("UNRECOGNIZED", 5, -1);
        f183895b = a();
        f183894a = new a();
    }

    OrderOuterClass$MatchingState(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ OrderOuterClass$MatchingState[] a() {
        return new OrderOuterClass$MatchingState[]{MATCHING_STATE_UNSPECIFIED, MATCHING_STATE_OFFERED, MATCHING_STATE_WAITING_CONFIRMATION, MATCHING_STATE_APPROVED, MATCHING_STATE_REJECTED, UNRECOGNIZED};
    }

    public static OrderOuterClass$MatchingState forNumber(int r1) {
        if (r1 == 0) goto L22;
        if (r1 == 1) goto L20;
        if (r1 == 2) goto L18;
        if (r1 == 3) goto L16;
        if (r1 == 4) goto L14;
        return null;
    L14:
        return MATCHING_STATE_REJECTED;
    L16:
        return MATCHING_STATE_APPROVED;
    L18:
        return MATCHING_STATE_WAITING_CONFIRMATION;
    L20:
        return MATCHING_STATE_OFFERED;
    L22:
        return MATCHING_STATE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<OrderOuterClass$MatchingState> internalGetValueMap() {
        return f183894a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183896a;
    }

    public static OrderOuterClass$MatchingState valueOf(String r1) {
        return (OrderOuterClass$MatchingState) Enum.valueOf(OrderOuterClass$MatchingState.class, r1);
    }

    public static OrderOuterClass$MatchingState[] values() {
        return (OrderOuterClass$MatchingState[]) f183895b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OrderOuterClass$MatchingState valueOf(int r02) {
        return forNumber(r02);
    }
}
