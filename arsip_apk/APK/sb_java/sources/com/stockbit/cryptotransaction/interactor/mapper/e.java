package com.stockbit.cryptotransaction.interactor.mapper;

import com.stockbit.dto.cryptotransaction.CryptoBuyBalanceDTO;

/* loaded from: classes8.dex */
public final class e {
    public e() {
    }

    public final com.stockbit.usecase.cryptotransaction.contract.entity.e a(CryptoBuyBalanceDTO r10) {
        double r1 = 0.0d;
        if (r10 == null) goto L7;
        Double r3 = r10.a();
        if (r3 == null) goto L7;
        double r32 = r3.doubleValue();
    L8:
        if (r10 == null) goto L12;
        Double r5 = r10.b();
        if (r5 == null) goto L12;
        double r52 = r5.doubleValue();
    L13:
        if (r10 == null) goto L18;
        Double r102 = r10.c();
        if (r102 == null) goto L18;
        r1 = r102.doubleValue();
    L18:
        return new com.stockbit.usecase.cryptotransaction.contract.entity.e(r32, r52, r1);
    L12:
        r52 = 0.0d;
    L7:
        r32 = 0.0d;
        goto L8
    }
}
