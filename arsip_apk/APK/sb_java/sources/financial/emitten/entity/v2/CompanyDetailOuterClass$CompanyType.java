package financial.emitten.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum CompanyDetailOuterClass$CompanyType extends Enum<CompanyDetailOuterClass$CompanyType> implements Internal.EnumLite {
    public static final CompanyDetailOuterClass$CompanyType COMPANY_TYPE_COMMODITIES = null;
    public static final int COMPANY_TYPE_COMMODITIES_VALUE = 6;
    public static final CompanyDetailOuterClass$CompanyType COMPANY_TYPE_CRYPTO = null;
    public static final int COMPANY_TYPE_CRYPTO_VALUE = 7;
    public static final CompanyDetailOuterClass$CompanyType COMPANY_TYPE_ETF = null;
    public static final int COMPANY_TYPE_ETF_VALUE = 4;
    public static final CompanyDetailOuterClass$CompanyType COMPANY_TYPE_FX = null;
    public static final int COMPANY_TYPE_FX_VALUE = 3;
    public static final CompanyDetailOuterClass$CompanyType COMPANY_TYPE_INDEX = null;
    public static final CompanyDetailOuterClass$CompanyType COMPANY_TYPE_INDEX_ASING = null;
    public static final int COMPANY_TYPE_INDEX_ASING_VALUE = 5;
    public static final int COMPANY_TYPE_INDEX_VALUE = 2;
    public static final CompanyDetailOuterClass$CompanyType COMPANY_TYPE_REKSADANA = null;
    public static final int COMPANY_TYPE_REKSADANA_VALUE = 10;
    public static final CompanyDetailOuterClass$CompanyType COMPANY_TYPE_RIGHT = null;
    public static final int COMPANY_TYPE_RIGHT_VALUE = 9;
    public static final CompanyDetailOuterClass$CompanyType COMPANY_TYPE_SAHAM = null;
    public static final int COMPANY_TYPE_SAHAM_VALUE = 1;
    public static final CompanyDetailOuterClass$CompanyType COMPANY_TYPE_UNSPECIFIED = null;
    public static final int COMPANY_TYPE_UNSPECIFIED_VALUE = 0;
    public static final CompanyDetailOuterClass$CompanyType COMPANY_TYPE_WARAN = null;
    public static final int COMPANY_TYPE_WARAN_VALUE = 8;
    public static final CompanyDetailOuterClass$CompanyType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174173a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CompanyDetailOuterClass$CompanyType[] f174174b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174175a = null;

        static {
            f174175a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (CompanyDetailOuterClass$CompanyType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        COMPANY_TYPE_UNSPECIFIED = new CompanyDetailOuterClass$CompanyType("COMPANY_TYPE_UNSPECIFIED", 0, 0);
        COMPANY_TYPE_SAHAM = new CompanyDetailOuterClass$CompanyType("COMPANY_TYPE_SAHAM", 1, 1);
        COMPANY_TYPE_INDEX = new CompanyDetailOuterClass$CompanyType("COMPANY_TYPE_INDEX", 2, 2);
        COMPANY_TYPE_FX = new CompanyDetailOuterClass$CompanyType("COMPANY_TYPE_FX", 3, 3);
        COMPANY_TYPE_ETF = new CompanyDetailOuterClass$CompanyType("COMPANY_TYPE_ETF", 4, 4);
        COMPANY_TYPE_INDEX_ASING = new CompanyDetailOuterClass$CompanyType("COMPANY_TYPE_INDEX_ASING", 5, 5);
        COMPANY_TYPE_COMMODITIES = new CompanyDetailOuterClass$CompanyType("COMPANY_TYPE_COMMODITIES", 6, 6);
        COMPANY_TYPE_CRYPTO = new CompanyDetailOuterClass$CompanyType("COMPANY_TYPE_CRYPTO", 7, 7);
        COMPANY_TYPE_WARAN = new CompanyDetailOuterClass$CompanyType("COMPANY_TYPE_WARAN", 8, 8);
        COMPANY_TYPE_RIGHT = new CompanyDetailOuterClass$CompanyType("COMPANY_TYPE_RIGHT", 9, 9);
        COMPANY_TYPE_REKSADANA = new CompanyDetailOuterClass$CompanyType("COMPANY_TYPE_REKSADANA", 10, 10);
        UNRECOGNIZED = new CompanyDetailOuterClass$CompanyType("UNRECOGNIZED", 11, -1);
        f174174b = a();
        f174173a = new a();
    }

    CompanyDetailOuterClass$CompanyType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ CompanyDetailOuterClass$CompanyType[] a() {
        return new CompanyDetailOuterClass$CompanyType[]{COMPANY_TYPE_UNSPECIFIED, COMPANY_TYPE_SAHAM, COMPANY_TYPE_INDEX, COMPANY_TYPE_FX, COMPANY_TYPE_ETF, COMPANY_TYPE_INDEX_ASING, COMPANY_TYPE_COMMODITIES, COMPANY_TYPE_CRYPTO, COMPANY_TYPE_WARAN, COMPANY_TYPE_RIGHT, COMPANY_TYPE_REKSADANA, UNRECOGNIZED};
    }

    public static CompanyDetailOuterClass$CompanyType forNumber(int r02) {
        switch(r02) {
            case 0: goto L26;
            case 1: goto L24;
            case 2: goto L22;
            case 3: goto L20;
            case 4: goto L18;
            case 5: goto L16;
            case 6: goto L14;
            case 7: goto L12;
            case 8: goto L10;
            case 9: goto L8;
            case 10: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return COMPANY_TYPE_REKSADANA;
    L8:
        return COMPANY_TYPE_RIGHT;
    L10:
        return COMPANY_TYPE_WARAN;
    L12:
        return COMPANY_TYPE_CRYPTO;
    L14:
        return COMPANY_TYPE_COMMODITIES;
    L16:
        return COMPANY_TYPE_INDEX_ASING;
    L18:
        return COMPANY_TYPE_ETF;
    L20:
        return COMPANY_TYPE_FX;
    L22:
        return COMPANY_TYPE_INDEX;
    L24:
        return COMPANY_TYPE_SAHAM;
    L26:
        return COMPANY_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<CompanyDetailOuterClass$CompanyType> internalGetValueMap() {
        return f174173a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174175a;
    }

    public static CompanyDetailOuterClass$CompanyType valueOf(String r1) {
        return (CompanyDetailOuterClass$CompanyType) Enum.valueOf(CompanyDetailOuterClass$CompanyType.class, r1);
    }

    public static CompanyDetailOuterClass$CompanyType[] values() {
        return (CompanyDetailOuterClass$CompanyType[]) f174174b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CompanyDetailOuterClass$CompanyType valueOf(int r02) {
        return forNumber(r02);
    }
}
