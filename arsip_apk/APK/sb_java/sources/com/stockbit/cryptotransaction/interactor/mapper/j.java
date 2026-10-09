package com.stockbit.cryptotransaction.interactor.mapper;

import com.stockbit.dto.cryptotransaction.CryptoWalletBalanceDTO;
import com.stockbit.usecase.cryptotransaction.contract.entity.l;

/* loaded from: classes8.dex */
public final class j {
    public j() {
    }

    public final l a(CryptoWalletBalanceDTO r11) {
        if (r11 == null) goto L5;
        String r1 = r11.c();
    L6:
        if (r1 != null) goto L8;
        r1 = "";
    L8:
        double r2 = 0.0d;
        if (r11 == null) goto L13;
        Double r4 = r11.a();
        if (r4 == null) goto L13;
        double r42 = r4.doubleValue();
    L14:
        if (r11 == null) goto L18;
        Double r6 = r11.d();
        if (r6 == null) goto L18;
        double r62 = r6.doubleValue();
    L19:
        if (r11 == null) goto L24;
        Double r112 = r11.b();
        if (r112 == null) goto L24;
        r2 = r112.doubleValue();
    L24:
        return new l(r1, r42, r62, r2);
    L18:
        r62 = 0.0d;
    L13:
        r42 = 0.0d;
        goto L14
    L5:
        r1 = null;
        goto L6
    }
}
