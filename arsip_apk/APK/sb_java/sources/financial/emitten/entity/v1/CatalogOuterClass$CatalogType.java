package financial.emitten.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum CatalogOuterClass$CatalogType extends Enum<CatalogOuterClass$CatalogType> implements Internal.EnumLite {
    public static final CatalogOuterClass$CatalogType CATALOG_TYPE_KONGLO = null;
    public static final int CATALOG_TYPE_KONGLO_VALUE = 1;
    public static final CatalogOuterClass$CatalogType CATALOG_TYPE_UNSPECIFIED = null;
    public static final int CATALOG_TYPE_UNSPECIFIED_VALUE = 0;
    public static final CatalogOuterClass$CatalogType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174169a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CatalogOuterClass$CatalogType[] f174170b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174171a = null;

        static {
            f174171a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (CatalogOuterClass$CatalogType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        CATALOG_TYPE_UNSPECIFIED = new CatalogOuterClass$CatalogType("CATALOG_TYPE_UNSPECIFIED", 0, 0);
        CATALOG_TYPE_KONGLO = new CatalogOuterClass$CatalogType("CATALOG_TYPE_KONGLO", 1, 1);
        UNRECOGNIZED = new CatalogOuterClass$CatalogType("UNRECOGNIZED", 2, -1);
        f174170b = a();
        f174169a = new a();
    }

    CatalogOuterClass$CatalogType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ CatalogOuterClass$CatalogType[] a() {
        return new CatalogOuterClass$CatalogType[]{CATALOG_TYPE_UNSPECIFIED, CATALOG_TYPE_KONGLO, UNRECOGNIZED};
    }

    public static CatalogOuterClass$CatalogType forNumber(int r1) {
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L8;
        return null;
    L8:
        return CATALOG_TYPE_KONGLO;
    L10:
        return CATALOG_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<CatalogOuterClass$CatalogType> internalGetValueMap() {
        return f174169a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174171a;
    }

    public static CatalogOuterClass$CatalogType valueOf(String r1) {
        return (CatalogOuterClass$CatalogType) Enum.valueOf(CatalogOuterClass$CatalogType.class, r1);
    }

    public static CatalogOuterClass$CatalogType[] values() {
        return (CatalogOuterClass$CatalogType[]) f174170b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CatalogOuterClass$CatalogType valueOf(int r02) {
        return forNumber(r02);
    }
}
