package com.stockbit.feature.portfolio.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes9.dex */
public interface a {
    static /* synthetic */ ModularNavParam b(a r02, String r1, String r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r1 = "";
    L7:
        return r02.g(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWebViewNavParam");
    }

    static /* synthetic */ ModularNavParam d(a r02, String r1, String r2, boolean r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = false;
    L7:
        return r02.c(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPortfolioDetailNavParam");
    }

    static /* synthetic */ ModularNavParam e(a r02, String r1, String r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r1 = "";
    L7:
        return r02.f(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPortfolioWebViewNavParam");
    }

    ModularNavParam a(String r1);

    ModularNavParam c(String r1, String r2, boolean r3);

    ModularNavParam f(String r1, String r2);

    ModularNavParam g(String r1, String r2);

    ModularNavParam h(boolean r1, boolean r2);

    ModularNavParam i(String r1, String r2, boolean r3, boolean r4);
}
