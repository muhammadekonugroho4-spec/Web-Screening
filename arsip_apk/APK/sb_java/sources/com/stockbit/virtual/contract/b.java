package com.stockbit.virtual.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes2.dex */
public interface b {
    static /* synthetic */ ModularNavParam e(b r1, String r2, String r3, String r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 2) == 0) goto L7;
        r3 = null;
    L7:
        if ((r5 & 4) == 0) goto L10;
        r4 = null;
    L10:
        return r1.f(r2, r3, r4);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVirtualSellFragmentNavParam");
    }

    ModularNavParam a(String r1, String r2);

    ModularNavParam b();

    ModularNavParam c(String r1, String r2, String r3, String r4, String r5);

    ModularNavParam d(String r1, String r2, String r3, String r4, String r5, String r6);

    ModularNavParam f(String r1, String r2, String r3);
}
