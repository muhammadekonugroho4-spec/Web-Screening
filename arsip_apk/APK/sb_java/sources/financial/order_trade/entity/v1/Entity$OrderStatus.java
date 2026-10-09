package financial.order_trade.entity.v1;

import com.google.protobuf.Internal;
import com.stockbit.usecase.securities.model.order.SmartOrderStatusType;

/* loaded from: classes2.dex */
public enum Entity$OrderStatus extends Enum<Entity$OrderStatus> implements Internal.EnumLite {
    public static final Entity$OrderStatus ORDER_STATUS_ALL = null;
    public static final int ORDER_STATUS_ALL_VALUE = 6;
    public static final Entity$OrderStatus ORDER_STATUS_AMEND = null;
    public static final int ORDER_STATUS_AMEND_VALUE = 5;
    public static final Entity$OrderStatus ORDER_STATUS_FULL_MATCH = null;
    public static final int ORDER_STATUS_FULL_MATCH_VALUE = 2;
    public static final Entity$OrderStatus ORDER_STATUS_OPEN = null;
    public static final int ORDER_STATUS_OPEN_VALUE = 1;
    public static final Entity$OrderStatus ORDER_STATUS_PARTIAL_MATCH = null;
    public static final int ORDER_STATUS_PARTIAL_MATCH_VALUE = 4;
    public static final Entity$OrderStatus ORDER_STATUS_UNSPECIFIED = null;
    public static final int ORDER_STATUS_UNSPECIFIED_VALUE = 0;
    public static final Entity$OrderStatus ORDER_STATUS_WITHDRAWN = null;
    public static final int ORDER_STATUS_WITHDRAWN_VALUE = 3;
    public static final Entity$OrderStatus UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174192a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Entity$OrderStatus[] f174193b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174194a = null;

        static {
            f174194a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Entity$OrderStatus.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ORDER_STATUS_UNSPECIFIED = new Entity$OrderStatus("ORDER_STATUS_UNSPECIFIED", 0, 0);
        ORDER_STATUS_OPEN = new Entity$OrderStatus("ORDER_STATUS_OPEN", 1, 1);
        ORDER_STATUS_FULL_MATCH = new Entity$OrderStatus("ORDER_STATUS_FULL_MATCH", 2, 2);
        ORDER_STATUS_WITHDRAWN = new Entity$OrderStatus("ORDER_STATUS_WITHDRAWN", 3, 3);
        ORDER_STATUS_PARTIAL_MATCH = new Entity$OrderStatus(SmartOrderStatusType.PARENT_BULK_CANCEL_SELECTABLE_STATUS, 4, 4);
        ORDER_STATUS_AMEND = new Entity$OrderStatus("ORDER_STATUS_AMEND", 5, 5);
        ORDER_STATUS_ALL = new Entity$OrderStatus("ORDER_STATUS_ALL", 6, 6);
        UNRECOGNIZED = new Entity$OrderStatus("UNRECOGNIZED", 7, -1);
        f174193b = a();
        f174192a = new a();
    }

    Entity$OrderStatus(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Entity$OrderStatus[] a() {
        return new Entity$OrderStatus[]{ORDER_STATUS_UNSPECIFIED, ORDER_STATUS_OPEN, ORDER_STATUS_FULL_MATCH, ORDER_STATUS_WITHDRAWN, ORDER_STATUS_PARTIAL_MATCH, ORDER_STATUS_AMEND, ORDER_STATUS_ALL, UNRECOGNIZED};
    }

    public static Entity$OrderStatus forNumber(int r02) {
        switch(r02) {
            case 0: goto L18;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return ORDER_STATUS_ALL;
    L8:
        return ORDER_STATUS_AMEND;
    L10:
        return ORDER_STATUS_PARTIAL_MATCH;
    L12:
        return ORDER_STATUS_WITHDRAWN;
    L14:
        return ORDER_STATUS_FULL_MATCH;
    L16:
        return ORDER_STATUS_OPEN;
    L18:
        return ORDER_STATUS_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Entity$OrderStatus> internalGetValueMap() {
        return f174192a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174194a;
    }

    public static Entity$OrderStatus valueOf(String r1) {
        return (Entity$OrderStatus) Enum.valueOf(Entity$OrderStatus.class, r1);
    }

    public static Entity$OrderStatus[] values() {
        return (Entity$OrderStatus[]) f174193b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Entity$OrderStatus valueOf(int r02) {
        return forNumber(r02);
    }
}
