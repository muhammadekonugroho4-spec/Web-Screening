package com.stockbit.feature.transaction.ui.fasttrade.delegate;

import com.stockbit.feature.transaction.ui.fasttrade.model.FTOrderBookType;
import kotlin.jvm.functions.l;

/* loaded from: classes9.dex */
public interface b {
    static /* synthetic */ void G0(b r02, String r1, FTOrderBookType r2, l r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        r02.X0(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateOrderbookItemByPrice");
    }

    void X0(String r1, FTOrderBookType r2, l r3);
}
