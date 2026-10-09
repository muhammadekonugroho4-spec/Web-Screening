package securities.transactional.negoengine.order.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum OrderOuterClass$OrderSide extends Enum<OrderOuterClass$OrderSide> implements Internal.EnumLite {
    public static final OrderOuterClass$OrderSide ORDER_SIDE_BUY = null;
    public static final int ORDER_SIDE_BUY_VALUE = 1;
    public static final OrderOuterClass$OrderSide ORDER_SIDE_SELL = null;
    public static final int ORDER_SIDE_SELL_VALUE = 2;
    public static final OrderOuterClass$OrderSide ORDER_SIDE_UNSPECIFIED = null;
    public static final int ORDER_SIDE_UNSPECIFIED_VALUE = 0;
    public static final OrderOuterClass$OrderSide UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183897a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ OrderOuterClass$OrderSide[] f183898b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183899a = null;

        static {
            f183899a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (OrderOuterClass$OrderSide.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ORDER_SIDE_UNSPECIFIED = new OrderOuterClass$OrderSide("ORDER_SIDE_UNSPECIFIED", 0, 0);
        ORDER_SIDE_BUY = new OrderOuterClass$OrderSide("ORDER_SIDE_BUY", 1, 1);
        ORDER_SIDE_SELL = new OrderOuterClass$OrderSide("ORDER_SIDE_SELL", 2, 2);
        UNRECOGNIZED = new OrderOuterClass$OrderSide("UNRECOGNIZED", 3, -1);
        f183898b = a();
        f183897a = new a();
    }

    OrderOuterClass$OrderSide(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ OrderOuterClass$OrderSide[] a() {
        return new OrderOuterClass$OrderSide[]{ORDER_SIDE_UNSPECIFIED, ORDER_SIDE_BUY, ORDER_SIDE_SELL, UNRECOGNIZED};
    }

    public static OrderOuterClass$OrderSide forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return ORDER_SIDE_SELL;
    L12:
        return ORDER_SIDE_BUY;
    L14:
        return ORDER_SIDE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<OrderOuterClass$OrderSide> internalGetValueMap() {
        return f183897a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183899a;
    }

    public static OrderOuterClass$OrderSide valueOf(String r1) {
        return (OrderOuterClass$OrderSide) Enum.valueOf(OrderOuterClass$OrderSide.class, r1);
    }

    public static OrderOuterClass$OrderSide[] values() {
        return (OrderOuterClass$OrderSide[]) f183898b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OrderOuterClass$OrderSide valueOf(int r02) {
        return forNumber(r02);
    }
}
