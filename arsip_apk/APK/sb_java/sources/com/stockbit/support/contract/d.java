package com.stockbit.support.contract;

import com.stockbit.navigation.event.j;

/* loaded from: classes11.dex */
public interface d {
    static /* synthetic */ j a(d r02, String r1, String r2, String r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = null;
    L7:
        return r02.getCrispNavParam(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCrispNavParam");
    }

    j getCrispNavParam(String r1, String r2, String r3);
}
