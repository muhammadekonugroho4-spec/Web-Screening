package com.stockbit.repositories.securities;

import kotlin.coroutines.e;

/* loaded from: classes10.dex */
public interface a {
    static /* synthetic */ Object e(a r02, String r1, e r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r1 = null;
    L7:
        return r02.b(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSubAccountList");
    }

    Object a(String r1, String r2, String r3, String r4, String r5, e r6);

    Object b(String r1, e r2);

    Object c(String r1, e r2);

    Object d(String r1, String r2, e r3);

    Object getPortfolioPurposeList(e r1);
}
