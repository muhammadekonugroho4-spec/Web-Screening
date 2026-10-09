package securities.trm.core.portfolio.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Portfolio$Side extends Enum<Portfolio$Side> implements Internal.EnumLite {
    public static final Portfolio$Side SIDE_BUY = null;
    public static final int SIDE_BUY_VALUE = 1;
    public static final Portfolio$Side SIDE_SELL = null;
    public static final int SIDE_SELL_VALUE = 2;
    public static final Portfolio$Side SIDE_UNSPECIFIED = null;
    public static final int SIDE_UNSPECIFIED_VALUE = 0;
    public static final Portfolio$Side UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183991a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Portfolio$Side[] f183992b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183993a = null;

        static {
            f183993a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Portfolio$Side.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        SIDE_UNSPECIFIED = new Portfolio$Side("SIDE_UNSPECIFIED", 0, 0);
        SIDE_BUY = new Portfolio$Side("SIDE_BUY", 1, 1);
        SIDE_SELL = new Portfolio$Side("SIDE_SELL", 2, 2);
        UNRECOGNIZED = new Portfolio$Side("UNRECOGNIZED", 3, -1);
        f183992b = a();
        f183991a = new a();
    }

    Portfolio$Side(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Portfolio$Side[] a() {
        return new Portfolio$Side[]{SIDE_UNSPECIFIED, SIDE_BUY, SIDE_SELL, UNRECOGNIZED};
    }

    public static Portfolio$Side forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return SIDE_SELL;
    L12:
        return SIDE_BUY;
    L14:
        return SIDE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Portfolio$Side> internalGetValueMap() {
        return f183991a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183993a;
    }

    public static Portfolio$Side valueOf(String r1) {
        return (Portfolio$Side) Enum.valueOf(Portfolio$Side.class, r1);
    }

    public static Portfolio$Side[] values() {
        return (Portfolio$Side[]) f183992b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Portfolio$Side valueOf(int r02) {
        return forNumber(r02);
    }
}
