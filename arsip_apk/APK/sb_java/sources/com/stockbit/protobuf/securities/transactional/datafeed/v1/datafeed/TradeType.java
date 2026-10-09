package com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed;

import com.google.protobuf.Internal;

/* loaded from: classes10.dex */
public enum TradeType extends Enum<TradeType> implements Internal.EnumLite {
    private static final /* synthetic */ TradeType[] $VALUES = null;
    public static final TradeType TRADE_TYPE_BUY = null;
    public static final int TRADE_TYPE_BUY_VALUE = 1;
    public static final TradeType TRADE_TYPE_SELL = null;
    public static final int TRADE_TYPE_SELL_VALUE = 2;
    public static final TradeType TRADE_TYPE_UNSPECIFIED = null;
    public static final int TRADE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final TradeType UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<TradeType> internalValueMap = null;
    private final int value;

    public static final class TradeTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new TradeTypeVerifier();
        }

        private TradeTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (TradeType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    private static /* synthetic */ TradeType[] $values() {
        return new TradeType[]{TRADE_TYPE_UNSPECIFIED, TRADE_TYPE_BUY, TRADE_TYPE_SELL, UNRECOGNIZED};
    }

    static {
        TRADE_TYPE_UNSPECIFIED = new TradeType("TRADE_TYPE_UNSPECIFIED", 0, 0);
        TRADE_TYPE_BUY = new TradeType("TRADE_TYPE_BUY", 1, 1);
        TRADE_TYPE_SELL = new TradeType("TRADE_TYPE_SELL", 2, 2);
        UNRECOGNIZED = new TradeType("UNRECOGNIZED", 3, -1);
        $VALUES = $values();
        internalValueMap = new AnonymousClass1();
    }

    TradeType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static TradeType forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return TRADE_TYPE_SELL;
    L12:
        return TRADE_TYPE_BUY;
    L14:
        return TRADE_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<TradeType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TradeTypeVerifier.INSTANCE;
    }

    public static TradeType valueOf(String r1) {
        return (TradeType) Enum.valueOf(TradeType.class, r1);
    }

    public static TradeType[] values() {
        return (TradeType[]) $VALUES.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static TradeType valueOf(int r02) {
        return forNumber(r02);
    }
}
