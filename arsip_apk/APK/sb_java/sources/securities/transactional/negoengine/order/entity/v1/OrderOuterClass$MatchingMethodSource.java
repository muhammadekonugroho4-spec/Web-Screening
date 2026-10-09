package securities.transactional.negoengine.order.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum OrderOuterClass$MatchingMethodSource extends Enum<OrderOuterClass$MatchingMethodSource> implements Internal.EnumLite {
    public static final OrderOuterClass$MatchingMethodSource MATCHING_METHOD_SOURCE_SYSTEM = null;
    public static final int MATCHING_METHOD_SOURCE_SYSTEM_VALUE = 1;
    public static final OrderOuterClass$MatchingMethodSource MATCHING_METHOD_SOURCE_UNSPECIFIED = null;
    public static final int MATCHING_METHOD_SOURCE_UNSPECIFIED_VALUE = 0;
    public static final OrderOuterClass$MatchingMethodSource MATCHING_METHOD_SOURCE_USER = null;
    public static final int MATCHING_METHOD_SOURCE_USER_VALUE = 2;
    public static final OrderOuterClass$MatchingMethodSource UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183891a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ OrderOuterClass$MatchingMethodSource[] f183892b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183893a = null;

        static {
            f183893a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (OrderOuterClass$MatchingMethodSource.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        MATCHING_METHOD_SOURCE_UNSPECIFIED = new OrderOuterClass$MatchingMethodSource("MATCHING_METHOD_SOURCE_UNSPECIFIED", 0, 0);
        MATCHING_METHOD_SOURCE_SYSTEM = new OrderOuterClass$MatchingMethodSource("MATCHING_METHOD_SOURCE_SYSTEM", 1, 1);
        MATCHING_METHOD_SOURCE_USER = new OrderOuterClass$MatchingMethodSource("MATCHING_METHOD_SOURCE_USER", 2, 2);
        UNRECOGNIZED = new OrderOuterClass$MatchingMethodSource("UNRECOGNIZED", 3, -1);
        f183892b = a();
        f183891a = new a();
    }

    OrderOuterClass$MatchingMethodSource(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ OrderOuterClass$MatchingMethodSource[] a() {
        return new OrderOuterClass$MatchingMethodSource[]{MATCHING_METHOD_SOURCE_UNSPECIFIED, MATCHING_METHOD_SOURCE_SYSTEM, MATCHING_METHOD_SOURCE_USER, UNRECOGNIZED};
    }

    public static OrderOuterClass$MatchingMethodSource forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return MATCHING_METHOD_SOURCE_USER;
    L12:
        return MATCHING_METHOD_SOURCE_SYSTEM;
    L14:
        return MATCHING_METHOD_SOURCE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<OrderOuterClass$MatchingMethodSource> internalGetValueMap() {
        return f183891a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183893a;
    }

    public static OrderOuterClass$MatchingMethodSource valueOf(String r1) {
        return (OrderOuterClass$MatchingMethodSource) Enum.valueOf(OrderOuterClass$MatchingMethodSource.class, r1);
    }

    public static OrderOuterClass$MatchingMethodSource[] values() {
        return (OrderOuterClass$MatchingMethodSource[]) f183892b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OrderOuterClass$MatchingMethodSource valueOf(int r02) {
        return forNumber(r02);
    }
}
