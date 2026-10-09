package securities.trm.core.smart_order.trailing_stop.order.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Order$OrderStatus extends Enum<Order$OrderStatus> implements Internal.EnumLite {
    public static final Order$OrderStatus ORDER_STATUS_AMENDED = null;
    public static final int ORDER_STATUS_AMENDED_VALUE = 2;
    public static final Order$OrderStatus ORDER_STATUS_CORP_ACT_DELETED = null;
    public static final int ORDER_STATUS_CORP_ACT_DELETED_VALUE = 6;
    public static final Order$OrderStatus ORDER_STATUS_EXECUTED = null;
    public static final int ORDER_STATUS_EXECUTED_VALUE = 3;
    public static final Order$OrderStatus ORDER_STATUS_EXPIRED = null;
    public static final int ORDER_STATUS_EXPIRED_VALUE = 7;
    public static final Order$OrderStatus ORDER_STATUS_FORCE_DELETED = null;
    public static final int ORDER_STATUS_FORCE_DELETED_VALUE = 5;
    public static final Order$OrderStatus ORDER_STATUS_READY = null;
    public static final int ORDER_STATUS_READY_VALUE = 1;
    public static final Order$OrderStatus ORDER_STATUS_UNSPECIFIED = null;
    public static final int ORDER_STATUS_UNSPECIFIED_VALUE = 0;
    public static final Order$OrderStatus ORDER_STATUS_WITHDRAWN = null;
    public static final int ORDER_STATUS_WITHDRAWN_VALUE = 4;
    public static final Order$OrderStatus UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184011a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Order$OrderStatus[] f184012b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184013a = null;

        static {
            f184013a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Order$OrderStatus.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ORDER_STATUS_UNSPECIFIED = new Order$OrderStatus("ORDER_STATUS_UNSPECIFIED", 0, 0);
        ORDER_STATUS_READY = new Order$OrderStatus("ORDER_STATUS_READY", 1, 1);
        ORDER_STATUS_AMENDED = new Order$OrderStatus("ORDER_STATUS_AMENDED", 2, 2);
        ORDER_STATUS_EXECUTED = new Order$OrderStatus("ORDER_STATUS_EXECUTED", 3, 3);
        ORDER_STATUS_WITHDRAWN = new Order$OrderStatus("ORDER_STATUS_WITHDRAWN", 4, 4);
        ORDER_STATUS_FORCE_DELETED = new Order$OrderStatus("ORDER_STATUS_FORCE_DELETED", 5, 5);
        ORDER_STATUS_CORP_ACT_DELETED = new Order$OrderStatus("ORDER_STATUS_CORP_ACT_DELETED", 6, 6);
        ORDER_STATUS_EXPIRED = new Order$OrderStatus("ORDER_STATUS_EXPIRED", 7, 7);
        UNRECOGNIZED = new Order$OrderStatus("UNRECOGNIZED", 8, -1);
        f184012b = a();
        f184011a = new a();
    }

    Order$OrderStatus(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Order$OrderStatus[] a() {
        return new Order$OrderStatus[]{ORDER_STATUS_UNSPECIFIED, ORDER_STATUS_READY, ORDER_STATUS_AMENDED, ORDER_STATUS_EXECUTED, ORDER_STATUS_WITHDRAWN, ORDER_STATUS_FORCE_DELETED, ORDER_STATUS_CORP_ACT_DELETED, ORDER_STATUS_EXPIRED, UNRECOGNIZED};
    }

    public static Order$OrderStatus forNumber(int r02) {
        switch(r02) {
            case 0: goto L20;
            case 1: goto L18;
            case 2: goto L16;
            case 3: goto L14;
            case 4: goto L12;
            case 5: goto L10;
            case 6: goto L8;
            case 7: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return ORDER_STATUS_EXPIRED;
    L8:
        return ORDER_STATUS_CORP_ACT_DELETED;
    L10:
        return ORDER_STATUS_FORCE_DELETED;
    L12:
        return ORDER_STATUS_WITHDRAWN;
    L14:
        return ORDER_STATUS_EXECUTED;
    L16:
        return ORDER_STATUS_AMENDED;
    L18:
        return ORDER_STATUS_READY;
    L20:
        return ORDER_STATUS_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Order$OrderStatus> internalGetValueMap() {
        return f184011a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184013a;
    }

    public static Order$OrderStatus valueOf(String r1) {
        return (Order$OrderStatus) Enum.valueOf(Order$OrderStatus.class, r1);
    }

    public static Order$OrderStatus[] values() {
        return (Order$OrderStatus[]) f184012b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Order$OrderStatus valueOf(int r02) {
        return forNumber(r02);
    }
}
