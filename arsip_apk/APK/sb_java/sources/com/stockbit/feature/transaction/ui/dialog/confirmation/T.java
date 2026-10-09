package com.stockbit.feature.transaction.ui.dialog.confirmation;

import java.util.HashMap;

/* loaded from: classes9.dex */
public interface T {
    static /* synthetic */ void D2(T r02, String r1, HashMap r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = null;
    L6:
        r02.r1(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerEventTracker");
    }

    void r1(String r1, HashMap r2);
}
