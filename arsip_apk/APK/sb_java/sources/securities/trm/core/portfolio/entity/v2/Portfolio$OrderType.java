package securities.trm.core.portfolio.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Portfolio$OrderType extends Enum<Portfolio$OrderType> implements Internal.EnumLite {
    public static final Portfolio$OrderType ORDER_TYPE_LIMIT = null;
    public static final int ORDER_TYPE_LIMIT_VALUE = 1;
    public static final Portfolio$OrderType ORDER_TYPE_MARKET = null;
    public static final int ORDER_TYPE_MARKET_VALUE = 2;
    public static final Portfolio$OrderType ORDER_TYPE_UNSPECIFIED = null;
    public static final int ORDER_TYPE_UNSPECIFIED_VALUE = 0;
    public static final Portfolio$OrderType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183982a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Portfolio$OrderType[] f183983b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183984a = null;

        static {
            f183984a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Portfolio$OrderType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ORDER_TYPE_UNSPECIFIED = new Portfolio$OrderType("ORDER_TYPE_UNSPECIFIED", 0, 0);
        ORDER_TYPE_LIMIT = new Portfolio$OrderType("ORDER_TYPE_LIMIT", 1, 1);
        ORDER_TYPE_MARKET = new Portfolio$OrderType("ORDER_TYPE_MARKET", 2, 2);
        UNRECOGNIZED = new Portfolio$OrderType("UNRECOGNIZED", 3, -1);
        f183983b = a();
        f183982a = new a();
    }

    Portfolio$OrderType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Portfolio$OrderType[] a() {
        return new Portfolio$OrderType[]{ORDER_TYPE_UNSPECIFIED, ORDER_TYPE_LIMIT, ORDER_TYPE_MARKET, UNRECOGNIZED};
    }

    public static Portfolio$OrderType forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return ORDER_TYPE_MARKET;
    L12:
        return ORDER_TYPE_LIMIT;
    L14:
        return ORDER_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Portfolio$OrderType> internalGetValueMap() {
        return f183982a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183984a;
    }

    public static Portfolio$OrderType valueOf(String r1) {
        return (Portfolio$OrderType) Enum.valueOf(Portfolio$OrderType.class, r1);
    }

    public static Portfolio$OrderType[] values() {
        return (Portfolio$OrderType[]) f183983b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Portfolio$OrderType valueOf(int r02) {
        return forNumber(r02);
    }
}
