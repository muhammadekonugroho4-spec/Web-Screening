package com.data.repositories.bonds.interactor.mapper.portfolio;

import com.stockbit.dto.bonds.portfolio.BondsPortfolioAmountPercentageDTO;
import com.stockbit.repository.interactor.helper.d;

/* loaded from: classes4.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((BondsPortfolioAmountPercentageDTO) r1);
    }

    public com.stockbit.domain.model.bond.portfolio.a b(BondsPortfolioAmountPercentageDTO r7) {
        Double r1 = null;
        if (r7 == null) goto L5;
        Double r2 = r7.a();
    L6:
        double r22 = d.a(r2);
        if (r7 == null) goto L10;
        r1 = r7.b();
    L10:
        return new com.stockbit.domain.model.bond.portfolio.a(r22, d.a(r1));
    L5:
        r2 = null;
        goto L6
    }
}
