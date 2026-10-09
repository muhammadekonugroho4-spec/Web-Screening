package com.stockbit.repository.markettime;

import kotlin.coroutines.e;

/* loaded from: classes10.dex */
public interface a {
    static /* synthetic */ Object a(a r02, String r1, e r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r1 = null;
    L7:
        return r02.getMarketTimeSession(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketTimeSession");
    }

    Object getMarketTimeSession(String r1, e r2);
}
