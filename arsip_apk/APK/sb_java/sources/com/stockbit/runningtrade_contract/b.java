package com.stockbit.runningtrade_contract;

import com.stockbit.navigation.container.ModularNavParam;
import com.stockbit.navigation.y;

/* loaded from: classes11.dex */
public interface b {
    static /* synthetic */ ModularNavParam a(b r1, String r2, String r3, String r4, String r5, int r6, Object r7) {
        if (r7 != null) goto L18;
        if ((r6 & 1) == 0) goto L7;
        r2 = "*";
    L7:
        if ((r6 & 2) == 0) goto L10;
        r3 = "";
    L10:
        if ((r6 & 4) == 0) goto L13;
        r4 = "";
    L13:
        if ((r6 & 8) == 0) goto L16;
        r5 = "";
    L16:
        return r1.getRunningTradeNavParam(r2, r3, r4, r5);
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRunningTradeNavParam");
    }

    static /* synthetic */ ModularNavParam b(b r02, String r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = "";
    L7:
        return r02.getChartStockFilterNavParam(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChartStockFilterNavParam");
    }

    ModularNavParam getBrokerFlowNavParam(String r1, String r2, a r3);

    ModularNavParam getChartStockFilterNavParam(String r1);

    ModularNavParam getRunningTradeNavParam(String r1, String r2, String r3, String r4);

    y openBrokerFlowInfo();
}
