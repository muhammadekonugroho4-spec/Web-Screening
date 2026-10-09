package com.stockbit.domains.usecase.stockgroups.contract.repository;

import kotlin.coroutines.e;

/* loaded from: classes8.dex */
public interface a {
    static /* synthetic */ Object d(a r02, int r1, int r2, e r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L7;
        r2 = 100;
    L7:
        return r02.c(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStockGroupList");
    }

    Object a(String r1, int r2, e r3);

    Object b(int r1, e r2);

    Object c(int r1, int r2, e r3);

    Object e(e r1);
}
