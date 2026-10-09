package securities.transactional.negoengine.order.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum OrderOuterClass$CancelationState extends Enum<OrderOuterClass$CancelationState> implements Internal.EnumLite {
    public static final OrderOuterClass$CancelationState CANCELATION_STATE_ACCEPTED = null;
    public static final int CANCELATION_STATE_ACCEPTED_VALUE = 3;
    public static final OrderOuterClass$CancelationState CANCELATION_STATE_REQUESTED = null;
    public static final int CANCELATION_STATE_REQUESTED_VALUE = 1;
    public static final OrderOuterClass$CancelationState CANCELATION_STATE_UNSPECIFIED = null;
    public static final int CANCELATION_STATE_UNSPECIFIED_VALUE = 0;
    public static final OrderOuterClass$CancelationState CANCELATION_STATE_WAITING_CONFIRMATION = null;
    public static final int CANCELATION_STATE_WAITING_CONFIRMATION_VALUE = 2;
    public static final OrderOuterClass$CancelationState UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183888a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ OrderOuterClass$CancelationState[] f183889b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183890a = null;

        static {
            f183890a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (OrderOuterClass$CancelationState.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        CANCELATION_STATE_UNSPECIFIED = new OrderOuterClass$CancelationState("CANCELATION_STATE_UNSPECIFIED", 0, 0);
        CANCELATION_STATE_REQUESTED = new OrderOuterClass$CancelationState("CANCELATION_STATE_REQUESTED", 1, 1);
        CANCELATION_STATE_WAITING_CONFIRMATION = new OrderOuterClass$CancelationState("CANCELATION_STATE_WAITING_CONFIRMATION", 2, 2);
        CANCELATION_STATE_ACCEPTED = new OrderOuterClass$CancelationState("CANCELATION_STATE_ACCEPTED", 3, 3);
        UNRECOGNIZED = new OrderOuterClass$CancelationState("UNRECOGNIZED", 4, -1);
        f183889b = a();
        f183888a = new a();
    }

    OrderOuterClass$CancelationState(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ OrderOuterClass$CancelationState[] a() {
        return new OrderOuterClass$CancelationState[]{CANCELATION_STATE_UNSPECIFIED, CANCELATION_STATE_REQUESTED, CANCELATION_STATE_WAITING_CONFIRMATION, CANCELATION_STATE_ACCEPTED, UNRECOGNIZED};
    }

    public static OrderOuterClass$CancelationState forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return CANCELATION_STATE_ACCEPTED;
    L14:
        return CANCELATION_STATE_WAITING_CONFIRMATION;
    L16:
        return CANCELATION_STATE_REQUESTED;
    L18:
        return CANCELATION_STATE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<OrderOuterClass$CancelationState> internalGetValueMap() {
        return f183888a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183890a;
    }

    public static OrderOuterClass$CancelationState valueOf(String r1) {
        return (OrderOuterClass$CancelationState) Enum.valueOf(OrderOuterClass$CancelationState.class, r1);
    }

    public static OrderOuterClass$CancelationState[] values() {
        return (OrderOuterClass$CancelationState[]) f183889b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OrderOuterClass$CancelationState valueOf(int r02) {
        return forNumber(r02);
    }
}
