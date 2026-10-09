package financial.order_trade.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum MarketMoverOuterClass$FilterStocksType extends Enum<MarketMoverOuterClass$FilterStocksType> implements Internal.EnumLite {
    public static final MarketMoverOuterClass$FilterStocksType FILTER_STOCKS_TYPE_ACCELERATION_BOARD = null;
    public static final int FILTER_STOCKS_TYPE_ACCELERATION_BOARD_VALUE = 3;
    public static final MarketMoverOuterClass$FilterStocksType FILTER_STOCKS_TYPE_DEVELOPMENT_BOARD = null;
    public static final int FILTER_STOCKS_TYPE_DEVELOPMENT_BOARD_VALUE = 2;
    public static final MarketMoverOuterClass$FilterStocksType FILTER_STOCKS_TYPE_MAIN_BOARD = null;
    public static final int FILTER_STOCKS_TYPE_MAIN_BOARD_VALUE = 1;
    public static final MarketMoverOuterClass$FilterStocksType FILTER_STOCKS_TYPE_NEW_ECONOMY_BOARD = null;
    public static final int FILTER_STOCKS_TYPE_NEW_ECONOMY_BOARD_VALUE = 4;
    public static final MarketMoverOuterClass$FilterStocksType FILTER_STOCKS_TYPE_SHARIA = null;
    public static final int FILTER_STOCKS_TYPE_SHARIA_VALUE = 7;
    public static final MarketMoverOuterClass$FilterStocksType FILTER_STOCKS_TYPE_SPECIAL_MONITORING_BOARD = null;
    public static final int FILTER_STOCKS_TYPE_SPECIAL_MONITORING_BOARD_VALUE = 5;
    public static final MarketMoverOuterClass$FilterStocksType FILTER_STOCKS_TYPE_UNSPECIFIED = null;
    public static final int FILTER_STOCKS_TYPE_UNSPECIFIED_VALUE = 0;
    public static final MarketMoverOuterClass$FilterStocksType FILTER_STOCKS_TYPE_WARRANT_AND_RIGHT = null;
    public static final int FILTER_STOCKS_TYPE_WARRANT_AND_RIGHT_VALUE = 6;
    public static final MarketMoverOuterClass$FilterStocksType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174198a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MarketMoverOuterClass$FilterStocksType[] f174199b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174200a = null;

        static {
            f174200a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (MarketMoverOuterClass$FilterStocksType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        FILTER_STOCKS_TYPE_UNSPECIFIED = new MarketMoverOuterClass$FilterStocksType("FILTER_STOCKS_TYPE_UNSPECIFIED", 0, 0);
        FILTER_STOCKS_TYPE_MAIN_BOARD = new MarketMoverOuterClass$FilterStocksType("FILTER_STOCKS_TYPE_MAIN_BOARD", 1, 1);
        FILTER_STOCKS_TYPE_DEVELOPMENT_BOARD = new MarketMoverOuterClass$FilterStocksType("FILTER_STOCKS_TYPE_DEVELOPMENT_BOARD", 2, 2);
        FILTER_STOCKS_TYPE_ACCELERATION_BOARD = new MarketMoverOuterClass$FilterStocksType("FILTER_STOCKS_TYPE_ACCELERATION_BOARD", 3, 3);
        FILTER_STOCKS_TYPE_NEW_ECONOMY_BOARD = new MarketMoverOuterClass$FilterStocksType("FILTER_STOCKS_TYPE_NEW_ECONOMY_BOARD", 4, 4);
        FILTER_STOCKS_TYPE_SPECIAL_MONITORING_BOARD = new MarketMoverOuterClass$FilterStocksType("FILTER_STOCKS_TYPE_SPECIAL_MONITORING_BOARD", 5, 5);
        FILTER_STOCKS_TYPE_WARRANT_AND_RIGHT = new MarketMoverOuterClass$FilterStocksType("FILTER_STOCKS_TYPE_WARRANT_AND_RIGHT", 6, 6);
        FILTER_STOCKS_TYPE_SHARIA = new MarketMoverOuterClass$FilterStocksType("FILTER_STOCKS_TYPE_SHARIA", 7, 7);
        UNRECOGNIZED = new MarketMoverOuterClass$FilterStocksType("UNRECOGNIZED", 8, -1);
        f174199b = a();
        f174198a = new a();
    }

    MarketMoverOuterClass$FilterStocksType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ MarketMoverOuterClass$FilterStocksType[] a() {
        return new MarketMoverOuterClass$FilterStocksType[]{FILTER_STOCKS_TYPE_UNSPECIFIED, FILTER_STOCKS_TYPE_MAIN_BOARD, FILTER_STOCKS_TYPE_DEVELOPMENT_BOARD, FILTER_STOCKS_TYPE_ACCELERATION_BOARD, FILTER_STOCKS_TYPE_NEW_ECONOMY_BOARD, FILTER_STOCKS_TYPE_SPECIAL_MONITORING_BOARD, FILTER_STOCKS_TYPE_WARRANT_AND_RIGHT, FILTER_STOCKS_TYPE_SHARIA, UNRECOGNIZED};
    }

    public static MarketMoverOuterClass$FilterStocksType forNumber(int r02) {
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
        return FILTER_STOCKS_TYPE_SHARIA;
    L8:
        return FILTER_STOCKS_TYPE_WARRANT_AND_RIGHT;
    L10:
        return FILTER_STOCKS_TYPE_SPECIAL_MONITORING_BOARD;
    L12:
        return FILTER_STOCKS_TYPE_NEW_ECONOMY_BOARD;
    L14:
        return FILTER_STOCKS_TYPE_ACCELERATION_BOARD;
    L16:
        return FILTER_STOCKS_TYPE_DEVELOPMENT_BOARD;
    L18:
        return FILTER_STOCKS_TYPE_MAIN_BOARD;
    L20:
        return FILTER_STOCKS_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<MarketMoverOuterClass$FilterStocksType> internalGetValueMap() {
        return f174198a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174200a;
    }

    public static MarketMoverOuterClass$FilterStocksType valueOf(String r1) {
        return (MarketMoverOuterClass$FilterStocksType) Enum.valueOf(MarketMoverOuterClass$FilterStocksType.class, r1);
    }

    public static MarketMoverOuterClass$FilterStocksType[] values() {
        return (MarketMoverOuterClass$FilterStocksType[]) f174199b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static MarketMoverOuterClass$FilterStocksType valueOf(int r02) {
        return forNumber(r02);
    }
}
