package com.stockbit.cryptotransaction.interactor.mapper;

import com.stockbit.dto.cryptotransaction.CryptoCoinDTO;

/* loaded from: classes8.dex */
public final class g {
    public g() {
    }

    public final com.stockbit.usecase.cryptotransaction.contract.entity.h a(CryptoCoinDTO r17) {
        String r1 = null;
        if (r17 == null) goto L5;
        String r2 = r17.f();
    L6:
        String r3 = "";
        if (r2 != null) goto L9;
        r2 = "";
    L9:
        if (r17 == null) goto L11;
        String r4 = r17.d();
    L12:
        if (r4 != null) goto L14;
        r4 = "";
    L14:
        if (r17 == null) goto L16;
        String r5 = r17.a();
    L17:
        if (r5 != null) goto L19;
        r5 = "";
    L19:
        if (r17 == null) goto L21;
        r1 = r17.e();
    L21:
        if (r1 == null) goto L24;
        r3 = r1;
    L24:
        double r6 = 0.0d;
        if (r17 == null) goto L29;
        Double r12 = r17.g();
        if (r12 == null) goto L29;
        double r8 = r12.doubleValue();
    L30:
        if (r17 == null) goto L34;
        Double r13 = r17.b();
        if (r13 == null) goto L34;
        double r10 = r13.doubleValue();
    L35:
        if (r17 == null) goto L40;
        Double r14 = r17.c();
        if (r14 == null) goto L40;
        r6 = r14.doubleValue();
    L40:
        return new com.stockbit.usecase.cryptotransaction.contract.entity.h(r2, r4, r5, r3, r8, r10, r6);
    L34:
        r10 = 0.0d;
    L29:
        r8 = 0.0d;
        goto L30
    L16:
        r5 = null;
        goto L17
    L11:
        r4 = null;
        goto L12
    L5:
        r2 = null;
        goto L6
    }
}
