package com.stockbit.feature.transaction.ui.dialog.daytrade;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/feature/transaction/ui/dialog/daytrade/DayTradeUnavailableType;", "", "<init>", "(Ljava/lang/String;I)V", "BUY_OUTSIDE_MARKET_HOURS", "BUY_EXCEED_DEBT_RATIO", "SELL_OUTSIDE_MARKET_HOURS", "SELL_EXCEED_DEBT_RATIO", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum DayTradeUnavailableType extends Enum<DayTradeUnavailableType> {
    public static final DayTradeUnavailableType BUY_EXCEED_DEBT_RATIO = null;
    public static final DayTradeUnavailableType BUY_OUTSIDE_MARKET_HOURS = null;
    public static final DayTradeUnavailableType SELL_EXCEED_DEBT_RATIO = null;
    public static final DayTradeUnavailableType SELL_OUTSIDE_MARKET_HOURS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DayTradeUnavailableType[] f113432a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f113433b = null;

    static {
        BUY_OUTSIDE_MARKET_HOURS = new DayTradeUnavailableType("BUY_OUTSIDE_MARKET_HOURS", 0);
        BUY_EXCEED_DEBT_RATIO = new DayTradeUnavailableType("BUY_EXCEED_DEBT_RATIO", 1);
        SELL_OUTSIDE_MARKET_HOURS = new DayTradeUnavailableType("SELL_OUTSIDE_MARKET_HOURS", 2);
        SELL_EXCEED_DEBT_RATIO = new DayTradeUnavailableType("SELL_EXCEED_DEBT_RATIO", 3);
        DayTradeUnavailableType[] r02 = a();
        f113432a = r02;
        f113433b = kotlin.enums.b.a(r02);
    }

    DayTradeUnavailableType(String r1, int r2) {
    }

    public static final /* synthetic */ DayTradeUnavailableType[] a() {
        return new DayTradeUnavailableType[]{BUY_OUTSIDE_MARKET_HOURS, BUY_EXCEED_DEBT_RATIO, SELL_OUTSIDE_MARKET_HOURS, SELL_EXCEED_DEBT_RATIO};
    }

    public static kotlin.enums.a getEntries() {
        return f113433b;
    }

    public static DayTradeUnavailableType valueOf(String r1) {
        return (DayTradeUnavailableType) Enum.valueOf(DayTradeUnavailableType.class, r1);
    }

    public static DayTradeUnavailableType[] values() {
        return (DayTradeUnavailableType[]) f113432a.clone();
    }
}
