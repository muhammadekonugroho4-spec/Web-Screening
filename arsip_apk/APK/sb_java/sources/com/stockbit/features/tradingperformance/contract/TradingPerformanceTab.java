package com.stockbit.features.tradingperformance.contract;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/features/tradingperformance/contract/TradingPerformanceTab;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TAB_PORTFOLIO", "TAB_TRADE", "tradingperformance-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum TradingPerformanceTab extends Enum<TradingPerformanceTab> {
    public static final TradingPerformanceTab TAB_PORTFOLIO = null;
    public static final TradingPerformanceTab TAB_TRADE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingPerformanceTab[] f119133a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f119134b = null;
    private final int value;

    static {
        TAB_PORTFOLIO = new TradingPerformanceTab("TAB_PORTFOLIO", 0, 0);
        TAB_TRADE = new TradingPerformanceTab("TAB_TRADE", 1, 1);
        TradingPerformanceTab[] r02 = a();
        f119133a = r02;
        f119134b = b.a(r02);
    }

    TradingPerformanceTab(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ TradingPerformanceTab[] a() {
        return new TradingPerformanceTab[]{TAB_PORTFOLIO, TAB_TRADE};
    }

    public static kotlin.enums.a getEntries() {
        return f119134b;
    }

    public static TradingPerformanceTab valueOf(String r1) {
        return (TradingPerformanceTab) Enum.valueOf(TradingPerformanceTab.class, r1);
    }

    public static TradingPerformanceTab[] values() {
        return (TradingPerformanceTab[]) f119133a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
