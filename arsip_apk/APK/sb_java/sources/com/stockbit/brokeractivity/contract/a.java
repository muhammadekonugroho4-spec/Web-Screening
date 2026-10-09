package com.stockbit.brokeractivity.contract;

import com.stockbit.navigation.container.ModularNavParam;
import java.util.List;

/* loaded from: classes.dex */
public interface a {
    static /* synthetic */ ModularNavParam a(a r1, String r2, String r3, String r4, String r5, String r6, boolean r7, String r8, int r9, Object r10) {
        if (r10 != null) goto L24;
        if ((r9 & 2) == 0) goto L7;
        r3 = null;
    L7:
        if ((r9 & 4) == 0) goto L10;
        r4 = null;
    L10:
        if ((r9 & 8) == 0) goto L13;
        r5 = null;
    L13:
        if ((r9 & 16) == 0) goto L16;
        r6 = null;
    L16:
        if ((r9 & 32) == 0) goto L19;
        r7 = false;
    L19:
        if ((r9 & 64) == 0) goto L22;
        r8 = null;
    L22:
        return r1.getBrokerActivityChartNavParam(r2, r3, r4, r5, r6, r7, r8);
    L24:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBrokerActivityChartNavParam");
    }

    ModularNavParam getBrokerActivityChartNavParam(String r1, String r2, String r3, String r4, String r5, boolean r6, String r7);

    ModularNavParam getSelectStockNavParam(List r1);

    ModularNavParam getTopBrokerDetailNavParam(String r1, String r2, String r3, String r4, String r5, String r6, boolean r7, String r8);

    ModularNavParam getTopBrokerNavParam();
}
