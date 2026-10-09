package com.stockbit.company.ui.orderbook;

import com.stockbit.domain.model.type.CompanyType;

/* renamed from: com.stockbit.company.ui.orderbook.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC6097b {
    static /* synthetic */ void Q2(InterfaceC6097b r02, String r1, CompanyType r2, boolean r3, boolean r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 8) == 0) goto L6;
        r4 = false;
    L6:
        r02.C2(r1, r2, r3, r4);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderBook");
    }

    void C2(String r1, CompanyType r2, boolean r3, boolean r4);
}
