package securities.trm.core.portfolio.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Portfolio$LeverageType extends Enum<Portfolio$LeverageType> implements Internal.EnumLite {
    public static final Portfolio$LeverageType LEVERAGE_TYPE_BASIC_LIMIT = null;
    public static final int LEVERAGE_TYPE_BASIC_LIMIT_VALUE = 3;
    public static final Portfolio$LeverageType LEVERAGE_TYPE_DAY_TRADE = null;
    public static final int LEVERAGE_TYPE_DAY_TRADE_VALUE = 5;
    public static final Portfolio$LeverageType LEVERAGE_TYPE_MARGIN_TRADING = null;
    public static final int LEVERAGE_TYPE_MARGIN_TRADING_VALUE = 6;
    public static final Portfolio$LeverageType LEVERAGE_TYPE_TEMP_LIMIT = null;
    public static final int LEVERAGE_TYPE_TEMP_LIMIT_VALUE = 4;
    public static final Portfolio$LeverageType LEVERAGE_TYPE_TRADING_BALANCE = null;
    public static final int LEVERAGE_TYPE_TRADING_BALANCE_VALUE = 1;
    public static final Portfolio$LeverageType LEVERAGE_TYPE_TRADING_LIMIT = null;
    public static final int LEVERAGE_TYPE_TRADING_LIMIT_VALUE = 2;
    public static final Portfolio$LeverageType LEVERAGE_TYPE_TRADING_UNSPECIFIED = null;
    public static final int LEVERAGE_TYPE_TRADING_UNSPECIFIED_VALUE = 0;
    public static final Portfolio$LeverageType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183954a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Portfolio$LeverageType[] f183955b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183956a = null;

        static {
            f183956a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Portfolio$LeverageType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        LEVERAGE_TYPE_TRADING_UNSPECIFIED = new Portfolio$LeverageType("LEVERAGE_TYPE_TRADING_UNSPECIFIED", 0, 0);
        LEVERAGE_TYPE_TRADING_BALANCE = new Portfolio$LeverageType("LEVERAGE_TYPE_TRADING_BALANCE", 1, 1);
        LEVERAGE_TYPE_TRADING_LIMIT = new Portfolio$LeverageType("LEVERAGE_TYPE_TRADING_LIMIT", 2, 2);
        LEVERAGE_TYPE_BASIC_LIMIT = new Portfolio$LeverageType("LEVERAGE_TYPE_BASIC_LIMIT", 3, 3);
        LEVERAGE_TYPE_TEMP_LIMIT = new Portfolio$LeverageType("LEVERAGE_TYPE_TEMP_LIMIT", 4, 4);
        LEVERAGE_TYPE_DAY_TRADE = new Portfolio$LeverageType("LEVERAGE_TYPE_DAY_TRADE", 5, 5);
        LEVERAGE_TYPE_MARGIN_TRADING = new Portfolio$LeverageType("LEVERAGE_TYPE_MARGIN_TRADING", 6, 6);
        UNRECOGNIZED = new Portfolio$LeverageType("UNRECOGNIZED", 7, -1);
        f183955b = a();
        f183954a = new a();
    }

    Portfolio$LeverageType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Portfolio$LeverageType[] a() {
        return new Portfolio$LeverageType[]{LEVERAGE_TYPE_TRADING_UNSPECIFIED, LEVERAGE_TYPE_TRADING_BALANCE, LEVERAGE_TYPE_TRADING_LIMIT, LEVERAGE_TYPE_BASIC_LIMIT, LEVERAGE_TYPE_TEMP_LIMIT, LEVERAGE_TYPE_DAY_TRADE, LEVERAGE_TYPE_MARGIN_TRADING, UNRECOGNIZED};
    }

    public static Portfolio$LeverageType forNumber(int r02) {
        switch(r02) {
            case 0: goto L18;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return LEVERAGE_TYPE_MARGIN_TRADING;
    L8:
        return LEVERAGE_TYPE_DAY_TRADE;
    L10:
        return LEVERAGE_TYPE_TEMP_LIMIT;
    L12:
        return LEVERAGE_TYPE_BASIC_LIMIT;
    L14:
        return LEVERAGE_TYPE_TRADING_LIMIT;
    L16:
        return LEVERAGE_TYPE_TRADING_BALANCE;
    L18:
        return LEVERAGE_TYPE_TRADING_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Portfolio$LeverageType> internalGetValueMap() {
        return f183954a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183956a;
    }

    public static Portfolio$LeverageType valueOf(String r1) {
        return (Portfolio$LeverageType) Enum.valueOf(Portfolio$LeverageType.class, r1);
    }

    public static Portfolio$LeverageType[] values() {
        return (Portfolio$LeverageType[]) f183955b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Portfolio$LeverageType valueOf(int r02) {
        return forNumber(r02);
    }
}
