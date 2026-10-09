package com.stockbit.securities.interactor.mapper.portfolio;

import com.stockbit.dto.securities.portfolio.BondCouponDTO;

/* loaded from: classes11.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((BondCouponDTO) r1);
    }

    public com.stockbit.domain.model.securities.portfolio.a b(BondCouponDTO r6) {
        String r1 = null;
        if (r6 == null) goto L5;
        String r2 = r6.c();
    L6:
        String r3 = "";
        if (r2 != null) goto L9;
        r2 = "";
    L9:
        if (r6 == null) goto L11;
        String r4 = r6.b();
    L12:
        if (r4 != null) goto L14;
        r4 = "";
    L14:
        if (r6 == null) goto L16;
        r1 = r6.a();
    L16:
        if (r1 == null) goto L20;
        r3 = r1;
    L20:
        return new com.stockbit.domain.model.securities.portfolio.a(r2, r4, r3);
    L11:
        r4 = null;
        goto L12
    L5:
        r2 = null;
        goto L6
    }
}
