package financial.order_trade.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum InvestorTypeOuterClass$InvestorType extends Enum<InvestorTypeOuterClass$InvestorType> implements Internal.EnumLite {
    public static final InvestorTypeOuterClass$InvestorType INVESTOR_TYPE_ALL = null;
    public static final int INVESTOR_TYPE_ALL_VALUE = 1;
    public static final InvestorTypeOuterClass$InvestorType INVESTOR_TYPE_DOMESTIC = null;
    public static final int INVESTOR_TYPE_DOMESTIC_VALUE = 2;
    public static final InvestorTypeOuterClass$InvestorType INVESTOR_TYPE_FOREIGN = null;
    public static final int INVESTOR_TYPE_FOREIGN_VALUE = 3;
    public static final InvestorTypeOuterClass$InvestorType INVESTOR_TYPE_UNSPECIFIED = null;
    public static final int INVESTOR_TYPE_UNSPECIFIED_VALUE = 0;
    public static final InvestorTypeOuterClass$InvestorType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174195a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ InvestorTypeOuterClass$InvestorType[] f174196b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174197a = null;

        static {
            f174197a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (InvestorTypeOuterClass$InvestorType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        INVESTOR_TYPE_UNSPECIFIED = new InvestorTypeOuterClass$InvestorType("INVESTOR_TYPE_UNSPECIFIED", 0, 0);
        INVESTOR_TYPE_ALL = new InvestorTypeOuterClass$InvestorType("INVESTOR_TYPE_ALL", 1, 1);
        INVESTOR_TYPE_DOMESTIC = new InvestorTypeOuterClass$InvestorType("INVESTOR_TYPE_DOMESTIC", 2, 2);
        INVESTOR_TYPE_FOREIGN = new InvestorTypeOuterClass$InvestorType("INVESTOR_TYPE_FOREIGN", 3, 3);
        UNRECOGNIZED = new InvestorTypeOuterClass$InvestorType("UNRECOGNIZED", 4, -1);
        f174196b = a();
        f174195a = new a();
    }

    InvestorTypeOuterClass$InvestorType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ InvestorTypeOuterClass$InvestorType[] a() {
        return new InvestorTypeOuterClass$InvestorType[]{INVESTOR_TYPE_UNSPECIFIED, INVESTOR_TYPE_ALL, INVESTOR_TYPE_DOMESTIC, INVESTOR_TYPE_FOREIGN, UNRECOGNIZED};
    }

    public static InvestorTypeOuterClass$InvestorType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return INVESTOR_TYPE_FOREIGN;
    L14:
        return INVESTOR_TYPE_DOMESTIC;
    L16:
        return INVESTOR_TYPE_ALL;
    L18:
        return INVESTOR_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<InvestorTypeOuterClass$InvestorType> internalGetValueMap() {
        return f174195a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174197a;
    }

    public static InvestorTypeOuterClass$InvestorType valueOf(String r1) {
        return (InvestorTypeOuterClass$InvestorType) Enum.valueOf(InvestorTypeOuterClass$InvestorType.class, r1);
    }

    public static InvestorTypeOuterClass$InvestorType[] values() {
        return (InvestorTypeOuterClass$InvestorType[]) f174196b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static InvestorTypeOuterClass$InvestorType valueOf(int r02) {
        return forNumber(r02);
    }
}
