package com.stockbit.securities.interactor.mapper.common;

import com.stockbit.dto.securities.common.DebtRatioRulesDTO;

/* loaded from: classes11.dex */
public final class e implements com.stockbit.repository.interactor.helper.b {
    public e() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((DebtRatioRulesDTO) r1);
    }

    public com.stockbit.domain.model.securities.common.e b(DebtRatioRulesDTO r7) {
        Double r1 = null;
        if (r7 == null) goto L5;
        Double r2 = r7.a();
    L6:
        double r22 = com.stockbit.repository.interactor.helper.d.a(r2);
        if (r7 == null) goto L10;
        r1 = r7.b();
    L10:
        return new com.stockbit.domain.model.securities.common.e(r22, com.stockbit.repository.interactor.helper.d.a(r1));
    L5:
        r2 = null;
        goto L6
    }
}
