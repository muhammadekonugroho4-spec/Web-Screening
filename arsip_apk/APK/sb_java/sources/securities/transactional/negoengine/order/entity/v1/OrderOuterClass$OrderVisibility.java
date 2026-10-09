package securities.transactional.negoengine.order.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum OrderOuterClass$OrderVisibility extends Enum<OrderOuterClass$OrderVisibility> implements Internal.EnumLite {
    public static final OrderOuterClass$OrderVisibility ORDER_VISIBILITY_PRIVATE = null;
    public static final int ORDER_VISIBILITY_PRIVATE_VALUE = 1;
    public static final OrderOuterClass$OrderVisibility ORDER_VISIBILITY_PUBLIC = null;
    public static final int ORDER_VISIBILITY_PUBLIC_VALUE = 2;
    public static final OrderOuterClass$OrderVisibility ORDER_VISIBILITY_UNSPECIFIED = null;
    public static final int ORDER_VISIBILITY_UNSPECIFIED_VALUE = 0;
    public static final OrderOuterClass$OrderVisibility UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183900a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ OrderOuterClass$OrderVisibility[] f183901b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183902a = null;

        static {
            f183902a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (OrderOuterClass$OrderVisibility.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ORDER_VISIBILITY_UNSPECIFIED = new OrderOuterClass$OrderVisibility("ORDER_VISIBILITY_UNSPECIFIED", 0, 0);
        ORDER_VISIBILITY_PRIVATE = new OrderOuterClass$OrderVisibility("ORDER_VISIBILITY_PRIVATE", 1, 1);
        ORDER_VISIBILITY_PUBLIC = new OrderOuterClass$OrderVisibility("ORDER_VISIBILITY_PUBLIC", 2, 2);
        UNRECOGNIZED = new OrderOuterClass$OrderVisibility("UNRECOGNIZED", 3, -1);
        f183901b = a();
        f183900a = new a();
    }

    OrderOuterClass$OrderVisibility(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ OrderOuterClass$OrderVisibility[] a() {
        return new OrderOuterClass$OrderVisibility[]{ORDER_VISIBILITY_UNSPECIFIED, ORDER_VISIBILITY_PRIVATE, ORDER_VISIBILITY_PUBLIC, UNRECOGNIZED};
    }

    public static OrderOuterClass$OrderVisibility forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return ORDER_VISIBILITY_PUBLIC;
    L12:
        return ORDER_VISIBILITY_PRIVATE;
    L14:
        return ORDER_VISIBILITY_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<OrderOuterClass$OrderVisibility> internalGetValueMap() {
        return f183900a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183902a;
    }

    public static OrderOuterClass$OrderVisibility valueOf(String r1) {
        return (OrderOuterClass$OrderVisibility) Enum.valueOf(OrderOuterClass$OrderVisibility.class, r1);
    }

    public static OrderOuterClass$OrderVisibility[] values() {
        return (OrderOuterClass$OrderVisibility[]) f183901b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OrderOuterClass$OrderVisibility valueOf(int r02) {
        return forNumber(r02);
    }
}
