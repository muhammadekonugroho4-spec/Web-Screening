package com.data.repositories.bonds.interactor.mapper.portfolio.detail;

import com.stockbit.dto.bonds.portfolio.detail.BondsPortfolioDetailItemDTO;

/* loaded from: classes4.dex */
public final class c implements com.stockbit.repository.interactor.helper.b {
    public c() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((BondsPortfolioDetailItemDTO) r1);
    }

    public com.stockbit.domain.model.bond.portfolio.detail.d b(BondsPortfolioDetailItemDTO r11) {
        String r02 = null;
        if (r11 == null) goto L7;
        BondsPortfolioDetailItemDTO.BondsPortfolioDetailItemCouponDTO r1 = r11.b();
        if (r1 == null) goto L7;
        Double r12 = r1.a();
    L8:
        double r5 = com.stockbit.repository.interactor.helper.d.a(r12);
        if (r11 == null) goto L13;
        BondsPortfolioDetailItemDTO.BondsPortfolioDetailItemCouponDTO r13 = r11.b();
        if (r13 == null) goto L13;
        Double r14 = r13.b();
    L14:
        double r7 = com.stockbit.repository.interactor.helper.d.a(r14);
        if (r11 == null) goto L17;
        Double r15 = r11.a();
    L18:
        double r3 = com.stockbit.repository.interactor.helper.d.a(r15);
        if (r11 == null) goto L21;
        r02 = r11.c();
    L21:
        if (r02 != null) goto L24;
        r02 = "";
    L24:
        return new com.stockbit.domain.model.bond.portfolio.detail.d(r3, r5, r7, r02);
    L17:
        r15 = null;
    L13:
        r14 = null;
    L7:
        r12 = null;
        goto L8
    }
}
