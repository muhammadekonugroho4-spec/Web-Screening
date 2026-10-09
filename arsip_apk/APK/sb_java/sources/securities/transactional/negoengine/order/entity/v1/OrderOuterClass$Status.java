package securities.transactional.negoengine.order.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum OrderOuterClass$Status extends Enum<OrderOuterClass$Status> implements Internal.EnumLite {
    public static final OrderOuterClass$Status STATUS_ACTIVE = null;
    public static final int STATUS_ACTIVE_VALUE = 3;
    public static final OrderOuterClass$Status STATUS_EXPIRED = null;
    public static final int STATUS_EXPIRED_VALUE = 8;
    public static final OrderOuterClass$Status STATUS_MATCHED = null;
    public static final int STATUS_MATCHED_VALUE = 5;
    public static final OrderOuterClass$Status STATUS_MATCHING = null;
    public static final int STATUS_MATCHING_VALUE = 4;
    public static final OrderOuterClass$Status STATUS_REJECTED = null;
    public static final int STATUS_REJECTED_VALUE = 6;
    public static final OrderOuterClass$Status STATUS_UNSPECIFIED = null;
    public static final int STATUS_UNSPECIFIED_VALUE = 0;
    public static final OrderOuterClass$Status STATUS_WAITING_APPROVAL = null;
    public static final int STATUS_WAITING_APPROVAL_VALUE = 2;
    public static final OrderOuterClass$Status STATUS_WAITING_LOCK = null;
    public static final int STATUS_WAITING_LOCK_VALUE = 1;
    public static final OrderOuterClass$Status STATUS_WITHDRAWN = null;
    public static final int STATUS_WITHDRAWN_VALUE = 7;
    public static final OrderOuterClass$Status UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183909a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ OrderOuterClass$Status[] f183910b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183911a = null;

        static {
            f183911a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (OrderOuterClass$Status.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        STATUS_UNSPECIFIED = new OrderOuterClass$Status("STATUS_UNSPECIFIED", 0, 0);
        STATUS_WAITING_LOCK = new OrderOuterClass$Status("STATUS_WAITING_LOCK", 1, 1);
        STATUS_WAITING_APPROVAL = new OrderOuterClass$Status("STATUS_WAITING_APPROVAL", 2, 2);
        STATUS_ACTIVE = new OrderOuterClass$Status("STATUS_ACTIVE", 3, 3);
        STATUS_MATCHING = new OrderOuterClass$Status("STATUS_MATCHING", 4, 4);
        STATUS_MATCHED = new OrderOuterClass$Status("STATUS_MATCHED", 5, 5);
        STATUS_REJECTED = new OrderOuterClass$Status("STATUS_REJECTED", 6, 6);
        STATUS_WITHDRAWN = new OrderOuterClass$Status("STATUS_WITHDRAWN", 7, 7);
        STATUS_EXPIRED = new OrderOuterClass$Status("STATUS_EXPIRED", 8, 8);
        UNRECOGNIZED = new OrderOuterClass$Status("UNRECOGNIZED", 9, -1);
        f183910b = a();
        f183909a = new a();
    }

    OrderOuterClass$Status(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ OrderOuterClass$Status[] a() {
        return new OrderOuterClass$Status[]{STATUS_UNSPECIFIED, STATUS_WAITING_LOCK, STATUS_WAITING_APPROVAL, STATUS_ACTIVE, STATUS_MATCHING, STATUS_MATCHED, STATUS_REJECTED, STATUS_WITHDRAWN, STATUS_EXPIRED, UNRECOGNIZED};
    }

    public static OrderOuterClass$Status forNumber(int r02) {
        switch(r02) {
            case 0: goto L22;
            case 1: goto L20;
            case 2: goto L18;
            case 3: goto L16;
            case 4: goto L14;
            case 5: goto L12;
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return STATUS_EXPIRED;
    L8:
        return STATUS_WITHDRAWN;
    L10:
        return STATUS_REJECTED;
    L12:
        return STATUS_MATCHED;
    L14:
        return STATUS_MATCHING;
    L16:
        return STATUS_ACTIVE;
    L18:
        return STATUS_WAITING_APPROVAL;
    L20:
        return STATUS_WAITING_LOCK;
    L22:
        return STATUS_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<OrderOuterClass$Status> internalGetValueMap() {
        return f183909a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183911a;
    }

    public static OrderOuterClass$Status valueOf(String r1) {
        return (OrderOuterClass$Status) Enum.valueOf(OrderOuterClass$Status.class, r1);
    }

    public static OrderOuterClass$Status[] values() {
        return (OrderOuterClass$Status[]) f183910b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OrderOuterClass$Status valueOf(int r02) {
        return forNumber(r02);
    }
}
