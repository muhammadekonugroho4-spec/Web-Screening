package com.stockbit.features.tradingperformance.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes10.dex */
public interface a {
    static /* synthetic */ ModularNavParam b(a r02, String r1, TradingPerformanceTab r2, int r3, Object r4) {
        if (r4 != null) goto L12;
        if ((r3 & 1) == 0) goto L7;
        r1 = "";
    L7:
        if ((r3 & 2) == 0) goto L10;
        r2 = TradingPerformanceTab.TAB_PORTFOLIO;
    L10:
        return r02.a(r1, r2);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradingPerformanceNavParam");
    }

    ModularNavParam a(String r1, TradingPerformanceTab r2);
}
