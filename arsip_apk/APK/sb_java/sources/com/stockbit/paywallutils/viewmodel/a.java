package com.stockbit.paywallutils.viewmodel;

import androidx.lifecycle.A;

/* loaded from: classes10.dex */
public interface a {
    static /* synthetic */ void P0(a r1, String r2, String r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 1) == 0) goto L7;
        r2 = null;
    L7:
        if ((r4 & 2) == 0) goto L9;
        r3 = null;
    L9:
        r1.e1(r2, r3);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkEligibility");
    }

    A K1();

    void M0(boolean r1);

    void e1(String r1, String r2);
}
