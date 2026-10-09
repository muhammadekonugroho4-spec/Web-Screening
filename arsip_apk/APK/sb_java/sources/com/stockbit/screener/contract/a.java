package com.stockbit.screener.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes11.dex */
public interface a {
    static /* synthetic */ ModularNavParam a(a r1, Long r2, String r3, Boolean r4, int r5, Object r6) {
        if (r6 != null) goto L15;
        if ((r5 & 1) == 0) goto L7;
        r2 = null;
    L7:
        if ((r5 & 2) == 0) goto L10;
        r3 = null;
    L10:
        if ((r5 & 4) == 0) goto L13;
        r4 = Boolean.FALSE;
    L13:
        return r1.getScreenerNavParam(r2, r3, r4);
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getScreenerNavParam");
    }

    ModularNavParam getScreenerNavParam(Long r1, String r2, Boolean r3);
}
