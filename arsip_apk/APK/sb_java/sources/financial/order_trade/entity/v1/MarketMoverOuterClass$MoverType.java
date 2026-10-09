package financial.order_trade.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum MarketMoverOuterClass$MoverType extends Enum<MarketMoverOuterClass$MoverType> implements Internal.EnumLite {
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_BIG_MONEY_NET_SELL = null;
    public static final int MOVER_TYPE_BIG_MONEY_NET_SELL_VALUE = 18;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_BIG_MONEY_NET_VALUE = null;
    public static final int MOVER_TYPE_BIG_MONEY_NET_VALUE_VALUE = 16;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_CATALOG = null;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_CATALOG_KONGLO_MCAP_CHANGE = null;
    public static final int MOVER_TYPE_CATALOG_KONGLO_MCAP_CHANGE_VALUE = 19;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_CATALOG_KONGLO_MCAP_PCHANGE = null;
    public static final int MOVER_TYPE_CATALOG_KONGLO_MCAP_PCHANGE_VALUE = 20;
    public static final int MOVER_TYPE_CATALOG_VALUE = 17;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_IEP_CURRENT_TOP_GAINER = null;
    public static final int MOVER_TYPE_IEP_CURRENT_TOP_GAINER_VALUE = 8;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_IEP_CURRENT_TOP_LOSER = null;
    public static final int MOVER_TYPE_IEP_CURRENT_TOP_LOSER_VALUE = 9;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_IEP_PREV_TOP_GAINER = null;
    public static final int MOVER_TYPE_IEP_PREV_TOP_GAINER_VALUE = 14;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_IEP_PREV_TOP_LOSER = null;
    public static final int MOVER_TYPE_IEP_PREV_TOP_LOSER_VALUE = 15;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_IEVAL_TOP_GAINER = null;
    public static final int MOVER_TYPE_IEVAL_TOP_GAINER_VALUE = 12;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_IEVAL_TOP_LOSER = null;
    public static final int MOVER_TYPE_IEVAL_TOP_LOSER_VALUE = 13;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_IEV_TOP_GAINER = null;
    public static final int MOVER_TYPE_IEV_TOP_GAINER_VALUE = 10;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_IEV_TOP_LOSER = null;
    public static final int MOVER_TYPE_IEV_TOP_LOSER_VALUE = 11;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_NET_FOREIGN_BUY = null;
    public static final int MOVER_TYPE_NET_FOREIGN_BUY_VALUE = 6;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_NET_FOREIGN_SELL = null;
    public static final int MOVER_TYPE_NET_FOREIGN_SELL_VALUE = 7;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_TOP_FREQUENCY = null;
    public static final int MOVER_TYPE_TOP_FREQUENCY_VALUE = 3;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_TOP_GAINER = null;
    public static final int MOVER_TYPE_TOP_GAINER_VALUE = 4;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_TOP_LOSER = null;
    public static final int MOVER_TYPE_TOP_LOSER_VALUE = 5;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_TOP_VALUE = null;
    public static final int MOVER_TYPE_TOP_VALUE_VALUE = 1;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_TOP_VOLUME = null;
    public static final int MOVER_TYPE_TOP_VOLUME_VALUE = 2;
    public static final MarketMoverOuterClass$MoverType MOVER_TYPE_UNSPECIFIED = null;
    public static final int MOVER_TYPE_UNSPECIFIED_VALUE = 0;
    public static final MarketMoverOuterClass$MoverType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174201a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MarketMoverOuterClass$MoverType[] f174202b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174203a = null;

        static {
            f174203a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (MarketMoverOuterClass$MoverType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        MOVER_TYPE_UNSPECIFIED = new MarketMoverOuterClass$MoverType("MOVER_TYPE_UNSPECIFIED", 0, 0);
        MOVER_TYPE_TOP_VALUE = new MarketMoverOuterClass$MoverType("MOVER_TYPE_TOP_VALUE", 1, 1);
        MOVER_TYPE_TOP_VOLUME = new MarketMoverOuterClass$MoverType("MOVER_TYPE_TOP_VOLUME", 2, 2);
        MOVER_TYPE_TOP_FREQUENCY = new MarketMoverOuterClass$MoverType("MOVER_TYPE_TOP_FREQUENCY", 3, 3);
        MOVER_TYPE_TOP_GAINER = new MarketMoverOuterClass$MoverType("MOVER_TYPE_TOP_GAINER", 4, 4);
        MOVER_TYPE_TOP_LOSER = new MarketMoverOuterClass$MoverType("MOVER_TYPE_TOP_LOSER", 5, 5);
        MOVER_TYPE_NET_FOREIGN_BUY = new MarketMoverOuterClass$MoverType("MOVER_TYPE_NET_FOREIGN_BUY", 6, 6);
        MOVER_TYPE_NET_FOREIGN_SELL = new MarketMoverOuterClass$MoverType("MOVER_TYPE_NET_FOREIGN_SELL", 7, 7);
        MOVER_TYPE_IEP_CURRENT_TOP_GAINER = new MarketMoverOuterClass$MoverType("MOVER_TYPE_IEP_CURRENT_TOP_GAINER", 8, 8);
        MOVER_TYPE_IEP_CURRENT_TOP_LOSER = new MarketMoverOuterClass$MoverType("MOVER_TYPE_IEP_CURRENT_TOP_LOSER", 9, 9);
        MOVER_TYPE_IEV_TOP_GAINER = new MarketMoverOuterClass$MoverType("MOVER_TYPE_IEV_TOP_GAINER", 10, 10);
        MOVER_TYPE_IEV_TOP_LOSER = new MarketMoverOuterClass$MoverType("MOVER_TYPE_IEV_TOP_LOSER", 11, 11);
        MOVER_TYPE_IEVAL_TOP_GAINER = new MarketMoverOuterClass$MoverType("MOVER_TYPE_IEVAL_TOP_GAINER", 12, 12);
        MOVER_TYPE_IEVAL_TOP_LOSER = new MarketMoverOuterClass$MoverType("MOVER_TYPE_IEVAL_TOP_LOSER", 13, 13);
        MOVER_TYPE_IEP_PREV_TOP_GAINER = new MarketMoverOuterClass$MoverType("MOVER_TYPE_IEP_PREV_TOP_GAINER", 14, 14);
        MOVER_TYPE_IEP_PREV_TOP_LOSER = new MarketMoverOuterClass$MoverType("MOVER_TYPE_IEP_PREV_TOP_LOSER", 15, 15);
        MOVER_TYPE_BIG_MONEY_NET_VALUE = new MarketMoverOuterClass$MoverType("MOVER_TYPE_BIG_MONEY_NET_VALUE", 16, 16);
        MOVER_TYPE_CATALOG = new MarketMoverOuterClass$MoverType("MOVER_TYPE_CATALOG", 17, 17);
        MOVER_TYPE_BIG_MONEY_NET_SELL = new MarketMoverOuterClass$MoverType("MOVER_TYPE_BIG_MONEY_NET_SELL", 18, 18);
        MOVER_TYPE_CATALOG_KONGLO_MCAP_CHANGE = new MarketMoverOuterClass$MoverType("MOVER_TYPE_CATALOG_KONGLO_MCAP_CHANGE", 19, 19);
        MOVER_TYPE_CATALOG_KONGLO_MCAP_PCHANGE = new MarketMoverOuterClass$MoverType("MOVER_TYPE_CATALOG_KONGLO_MCAP_PCHANGE", 20, 20);
        UNRECOGNIZED = new MarketMoverOuterClass$MoverType("UNRECOGNIZED", 21, -1);
        f174202b = a();
        f174201a = new a();
    }

    MarketMoverOuterClass$MoverType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ MarketMoverOuterClass$MoverType[] a() {
        return new MarketMoverOuterClass$MoverType[]{MOVER_TYPE_UNSPECIFIED, MOVER_TYPE_TOP_VALUE, MOVER_TYPE_TOP_VOLUME, MOVER_TYPE_TOP_FREQUENCY, MOVER_TYPE_TOP_GAINER, MOVER_TYPE_TOP_LOSER, MOVER_TYPE_NET_FOREIGN_BUY, MOVER_TYPE_NET_FOREIGN_SELL, MOVER_TYPE_IEP_CURRENT_TOP_GAINER, MOVER_TYPE_IEP_CURRENT_TOP_LOSER, MOVER_TYPE_IEV_TOP_GAINER, MOVER_TYPE_IEV_TOP_LOSER, MOVER_TYPE_IEVAL_TOP_GAINER, MOVER_TYPE_IEVAL_TOP_LOSER, MOVER_TYPE_IEP_PREV_TOP_GAINER, MOVER_TYPE_IEP_PREV_TOP_LOSER, MOVER_TYPE_BIG_MONEY_NET_VALUE, MOVER_TYPE_CATALOG, MOVER_TYPE_BIG_MONEY_NET_SELL, MOVER_TYPE_CATALOG_KONGLO_MCAP_CHANGE, MOVER_TYPE_CATALOG_KONGLO_MCAP_PCHANGE, UNRECOGNIZED};
    }

    public static MarketMoverOuterClass$MoverType forNumber(int r02) {
        switch(r02) {
            case 0: goto L46;
            case 1: goto L44;
            case 2: goto L42;
            case 3: goto L40;
            case 4: goto L38;
            case 5: goto L36;
            case 6: goto L34;
            case 7: goto L32;
            case 8: goto L30;
            case 9: goto L28;
            case 10: goto L26;
            case 11: goto L24;
            case 12: goto L22;
            case 13: goto L20;
            case 14: goto L18;
            case 15: goto L16;
            case 16: goto L14;
            case 17: goto L12;
            case 18: goto L10;
            case 19: goto L8;
            case 20: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return MOVER_TYPE_CATALOG_KONGLO_MCAP_PCHANGE;
    L8:
        return MOVER_TYPE_CATALOG_KONGLO_MCAP_CHANGE;
    L10:
        return MOVER_TYPE_BIG_MONEY_NET_SELL;
    L12:
        return MOVER_TYPE_CATALOG;
    L14:
        return MOVER_TYPE_BIG_MONEY_NET_VALUE;
    L16:
        return MOVER_TYPE_IEP_PREV_TOP_LOSER;
    L18:
        return MOVER_TYPE_IEP_PREV_TOP_GAINER;
    L20:
        return MOVER_TYPE_IEVAL_TOP_LOSER;
    L22:
        return MOVER_TYPE_IEVAL_TOP_GAINER;
    L24:
        return MOVER_TYPE_IEV_TOP_LOSER;
    L26:
        return MOVER_TYPE_IEV_TOP_GAINER;
    L28:
        return MOVER_TYPE_IEP_CURRENT_TOP_LOSER;
    L30:
        return MOVER_TYPE_IEP_CURRENT_TOP_GAINER;
    L32:
        return MOVER_TYPE_NET_FOREIGN_SELL;
    L34:
        return MOVER_TYPE_NET_FOREIGN_BUY;
    L36:
        return MOVER_TYPE_TOP_LOSER;
    L38:
        return MOVER_TYPE_TOP_GAINER;
    L40:
        return MOVER_TYPE_TOP_FREQUENCY;
    L42:
        return MOVER_TYPE_TOP_VOLUME;
    L44:
        return MOVER_TYPE_TOP_VALUE;
    L46:
        return MOVER_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<MarketMoverOuterClass$MoverType> internalGetValueMap() {
        return f174201a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174203a;
    }

    public static MarketMoverOuterClass$MoverType valueOf(String r1) {
        return (MarketMoverOuterClass$MoverType) Enum.valueOf(MarketMoverOuterClass$MoverType.class, r1);
    }

    public static MarketMoverOuterClass$MoverType[] values() {
        return (MarketMoverOuterClass$MoverType[]) f174202b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static MarketMoverOuterClass$MoverType valueOf(int r02) {
        return forNumber(r02);
    }
}
