package securities.transactional.negoengine.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum AssetOuterClass$AssetType extends Enum<AssetOuterClass$AssetType> implements Internal.EnumLite {
    public static final AssetOuterClass$AssetType ASSET_TYPE_MUTUAL_FUND = null;
    public static final int ASSET_TYPE_MUTUAL_FUND_VALUE = 7;
    public static final AssetOuterClass$AssetType ASSET_TYPE_STOCK_ACCELERATION = null;
    public static final int ASSET_TYPE_STOCK_ACCELERATION_VALUE = 3;
    public static final AssetOuterClass$AssetType ASSET_TYPE_STOCK_REGULAR = null;
    public static final int ASSET_TYPE_STOCK_REGULAR_VALUE = 1;
    public static final AssetOuterClass$AssetType ASSET_TYPE_STOCK_RIGHT = null;
    public static final int ASSET_TYPE_STOCK_RIGHT_VALUE = 4;
    public static final AssetOuterClass$AssetType ASSET_TYPE_STOCK_STRUCTURED_WARRANT = null;
    public static final int ASSET_TYPE_STOCK_STRUCTURED_WARRANT_VALUE = 6;
    public static final AssetOuterClass$AssetType ASSET_TYPE_STOCK_WARRANT = null;
    public static final int ASSET_TYPE_STOCK_WARRANT_VALUE = 5;
    public static final AssetOuterClass$AssetType ASSET_TYPE_STOCK_WATCHLIST = null;
    public static final int ASSET_TYPE_STOCK_WATCHLIST_VALUE = 2;
    public static final AssetOuterClass$AssetType ASSET_TYPE_UNSPECIFIED = null;
    public static final int ASSET_TYPE_UNSPECIFIED_VALUE = 0;
    public static final AssetOuterClass$AssetType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183882a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AssetOuterClass$AssetType[] f183883b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183884a = null;

        static {
            f183884a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (AssetOuterClass$AssetType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ASSET_TYPE_UNSPECIFIED = new AssetOuterClass$AssetType("ASSET_TYPE_UNSPECIFIED", 0, 0);
        ASSET_TYPE_STOCK_REGULAR = new AssetOuterClass$AssetType("ASSET_TYPE_STOCK_REGULAR", 1, 1);
        ASSET_TYPE_STOCK_WATCHLIST = new AssetOuterClass$AssetType("ASSET_TYPE_STOCK_WATCHLIST", 2, 2);
        ASSET_TYPE_STOCK_ACCELERATION = new AssetOuterClass$AssetType("ASSET_TYPE_STOCK_ACCELERATION", 3, 3);
        ASSET_TYPE_STOCK_RIGHT = new AssetOuterClass$AssetType("ASSET_TYPE_STOCK_RIGHT", 4, 4);
        ASSET_TYPE_STOCK_WARRANT = new AssetOuterClass$AssetType("ASSET_TYPE_STOCK_WARRANT", 5, 5);
        ASSET_TYPE_STOCK_STRUCTURED_WARRANT = new AssetOuterClass$AssetType("ASSET_TYPE_STOCK_STRUCTURED_WARRANT", 6, 6);
        ASSET_TYPE_MUTUAL_FUND = new AssetOuterClass$AssetType("ASSET_TYPE_MUTUAL_FUND", 7, 7);
        UNRECOGNIZED = new AssetOuterClass$AssetType("UNRECOGNIZED", 8, -1);
        f183883b = a();
        f183882a = new a();
    }

    AssetOuterClass$AssetType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ AssetOuterClass$AssetType[] a() {
        return new AssetOuterClass$AssetType[]{ASSET_TYPE_UNSPECIFIED, ASSET_TYPE_STOCK_REGULAR, ASSET_TYPE_STOCK_WATCHLIST, ASSET_TYPE_STOCK_ACCELERATION, ASSET_TYPE_STOCK_RIGHT, ASSET_TYPE_STOCK_WARRANT, ASSET_TYPE_STOCK_STRUCTURED_WARRANT, ASSET_TYPE_MUTUAL_FUND, UNRECOGNIZED};
    }

    public static AssetOuterClass$AssetType forNumber(int r02) {
        switch(r02) {
            case 0: goto L20;
            case 1: goto L18;
            case 2: goto L16;
            case 3: goto L14;
            case 4: goto L12;
            case 5: goto L10;
            case 6: goto L8;
            case 7: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return ASSET_TYPE_MUTUAL_FUND;
    L8:
        return ASSET_TYPE_STOCK_STRUCTURED_WARRANT;
    L10:
        return ASSET_TYPE_STOCK_WARRANT;
    L12:
        return ASSET_TYPE_STOCK_RIGHT;
    L14:
        return ASSET_TYPE_STOCK_ACCELERATION;
    L16:
        return ASSET_TYPE_STOCK_WATCHLIST;
    L18:
        return ASSET_TYPE_STOCK_REGULAR;
    L20:
        return ASSET_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<AssetOuterClass$AssetType> internalGetValueMap() {
        return f183882a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183884a;
    }

    public static AssetOuterClass$AssetType valueOf(String r1) {
        return (AssetOuterClass$AssetType) Enum.valueOf(AssetOuterClass$AssetType.class, r1);
    }

    public static AssetOuterClass$AssetType[] values() {
        return (AssetOuterClass$AssetType[]) f183883b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static AssetOuterClass$AssetType valueOf(int r02) {
        return forNumber(r02);
    }
}
