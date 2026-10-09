package com.stockbit.profiletrading.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes10.dex */
public interface a {
    static /* synthetic */ ModularNavParam a(a r02, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = false;
    L7:
        return r02.getTradingProfileWebViewNavParam(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradingProfileWebViewNavParam");
    }

    ModularNavParam getTradingProfileNavParam();

    ModularNavParam getTradingProfileWebViewNavParam(boolean r1);
}
