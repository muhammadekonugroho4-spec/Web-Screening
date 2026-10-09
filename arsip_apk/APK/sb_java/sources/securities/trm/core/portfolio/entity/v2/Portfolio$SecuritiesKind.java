package securities.trm.core.portfolio.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Portfolio$SecuritiesKind extends Enum<Portfolio$SecuritiesKind> implements Internal.EnumLite {
    public static final Portfolio$SecuritiesKind SECURITIES_KIND_BOND = null;
    public static final int SECURITIES_KIND_BOND_VALUE = 2;
    public static final Portfolio$SecuritiesKind SECURITIES_KIND_STOCK = null;
    public static final int SECURITIES_KIND_STOCK_VALUE = 1;
    public static final Portfolio$SecuritiesKind SECURITIES_KIND_UNSPECIFIED = null;
    public static final int SECURITIES_KIND_UNSPECIFIED_VALUE = 0;
    public static final Portfolio$SecuritiesKind UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183988a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Portfolio$SecuritiesKind[] f183989b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183990a = null;

        static {
            f183990a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Portfolio$SecuritiesKind.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        SECURITIES_KIND_UNSPECIFIED = new Portfolio$SecuritiesKind("SECURITIES_KIND_UNSPECIFIED", 0, 0);
        SECURITIES_KIND_STOCK = new Portfolio$SecuritiesKind("SECURITIES_KIND_STOCK", 1, 1);
        SECURITIES_KIND_BOND = new Portfolio$SecuritiesKind("SECURITIES_KIND_BOND", 2, 2);
        UNRECOGNIZED = new Portfolio$SecuritiesKind("UNRECOGNIZED", 3, -1);
        f183989b = a();
        f183988a = new a();
    }

    Portfolio$SecuritiesKind(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Portfolio$SecuritiesKind[] a() {
        return new Portfolio$SecuritiesKind[]{SECURITIES_KIND_UNSPECIFIED, SECURITIES_KIND_STOCK, SECURITIES_KIND_BOND, UNRECOGNIZED};
    }

    public static Portfolio$SecuritiesKind forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return SECURITIES_KIND_BOND;
    L12:
        return SECURITIES_KIND_STOCK;
    L14:
        return SECURITIES_KIND_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Portfolio$SecuritiesKind> internalGetValueMap() {
        return f183988a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183990a;
    }

    public static Portfolio$SecuritiesKind valueOf(String r1) {
        return (Portfolio$SecuritiesKind) Enum.valueOf(Portfolio$SecuritiesKind.class, r1);
    }

    public static Portfolio$SecuritiesKind[] values() {
        return (Portfolio$SecuritiesKind[]) f183989b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Portfolio$SecuritiesKind valueOf(int r02) {
        return forNumber(r02);
    }
}
