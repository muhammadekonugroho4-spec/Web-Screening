package com.stockbit.feature.transaction.ui.fasttrade.delegate;

import java.math.BigDecimal;

/* loaded from: classes9.dex */
public interface a {
    static /* synthetic */ void X(a r02, BigDecimal r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = true;
    L6:
        r02.v(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateValuePriceCalculator");
    }

    static /* synthetic */ void Y2(a r02, BigDecimal r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = true;
    L6:
        r02.W0(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateValueLotCalculator");
    }

    void W0(BigDecimal r1, boolean r2);

    void v(BigDecimal r1, boolean r2);
}
