package securities.trm.core.portfolio.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Portfolio$OrderBookSide extends Enum<Portfolio$OrderBookSide> implements Internal.EnumLite {
    public static final Portfolio$OrderBookSide ORDER_BOOK_SIDE_ASK = null;
    public static final int ORDER_BOOK_SIDE_ASK_VALUE = 2;
    public static final Portfolio$OrderBookSide ORDER_BOOK_SIDE_BID = null;
    public static final int ORDER_BOOK_SIDE_BID_VALUE = 1;
    public static final Portfolio$OrderBookSide ORDER_BOOK_SIDE_UNSPECIFIED = null;
    public static final int ORDER_BOOK_SIDE_UNSPECIFIED_VALUE = 0;
    public static final Portfolio$OrderBookSide UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183973a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Portfolio$OrderBookSide[] f183974b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183975a = null;

        static {
            f183975a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Portfolio$OrderBookSide.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ORDER_BOOK_SIDE_UNSPECIFIED = new Portfolio$OrderBookSide("ORDER_BOOK_SIDE_UNSPECIFIED", 0, 0);
        ORDER_BOOK_SIDE_BID = new Portfolio$OrderBookSide("ORDER_BOOK_SIDE_BID", 1, 1);
        ORDER_BOOK_SIDE_ASK = new Portfolio$OrderBookSide("ORDER_BOOK_SIDE_ASK", 2, 2);
        UNRECOGNIZED = new Portfolio$OrderBookSide("UNRECOGNIZED", 3, -1);
        f183974b = a();
        f183973a = new a();
    }

    Portfolio$OrderBookSide(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Portfolio$OrderBookSide[] a() {
        return new Portfolio$OrderBookSide[]{ORDER_BOOK_SIDE_UNSPECIFIED, ORDER_BOOK_SIDE_BID, ORDER_BOOK_SIDE_ASK, UNRECOGNIZED};
    }

    public static Portfolio$OrderBookSide forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return ORDER_BOOK_SIDE_ASK;
    L12:
        return ORDER_BOOK_SIDE_BID;
    L14:
        return ORDER_BOOK_SIDE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Portfolio$OrderBookSide> internalGetValueMap() {
        return f183973a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183975a;
    }

    public static Portfolio$OrderBookSide valueOf(String r1) {
        return (Portfolio$OrderBookSide) Enum.valueOf(Portfolio$OrderBookSide.class, r1);
    }

    public static Portfolio$OrderBookSide[] values() {
        return (Portfolio$OrderBookSide[]) f183974b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Portfolio$OrderBookSide valueOf(int r02) {
        return forNumber(r02);
    }
}
