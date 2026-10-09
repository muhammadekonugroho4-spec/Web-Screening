package com.data.repositories.bonds.interactor.mapper.portfolio.detail;

import com.stockbit.dto.bonds.portfolio.detail.BondsPortfolioDetailMetaDTO;

/* loaded from: classes4.dex */
public final class e implements com.stockbit.repository.interactor.helper.b {
    public e() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((BondsPortfolioDetailMetaDTO) r1);
    }

    public com.stockbit.domain.model.bond.portfolio.detail.e b(BondsPortfolioDetailMetaDTO r9) {
        Double r1 = null;
        if (r9 == null) goto L5;
        Double r2 = r9.a();
    L6:
        double r22 = com.stockbit.repository.interactor.helper.d.a(r2);
        if (r9 == null) goto L9;
        String r4 = r9.b();
    L10:
        String r5 = "";
        if (r4 != null) goto L13;
        r4 = "";
    L13:
        if (r9 == null) goto L15;
        String r6 = r9.c();
    L16:
        if (r6 == null) goto L19;
        r5 = r6;
    L19:
        if (r9 == null) goto L22;
        r1 = r9.d();
    L22:
        return new com.stockbit.domain.model.bond.portfolio.detail.e(r22, r4, r5, com.stockbit.repository.interactor.helper.d.a(r1));
    L15:
        r6 = null;
        goto L16
    L9:
        r4 = null;
        goto L10
    L5:
        r2 = null;
        goto L6
    }
}
