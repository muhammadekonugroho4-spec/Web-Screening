package com.stockbit.repository.company.interactor.mapper;

import com.stockbit.dto.company.analyst.AnalystPriceTargetDTO;

/* renamed from: com.stockbit.repository.company.interactor.mapper.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9736c implements com.stockbit.repository.interactor.helper.b {
    public C9736c() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((AnalystPriceTargetDTO) r1);
    }

    public com.stockbit.domain.model.company.analyst.c b(AnalystPriceTargetDTO r5) {
        if (r5 == null) goto L6;
        return new com.stockbit.domain.model.company.analyst.c(com.stockbit.repository.interactor.helper.d.b(r5.c()), com.stockbit.repository.interactor.helper.d.b(r5.b()), com.stockbit.repository.interactor.helper.d.b(r5.a()), com.stockbit.repository.interactor.helper.d.b(r5.d()));
    L6:
        return new com.stockbit.domain.model.company.analyst.c(0, 0, 0, 0);
    }
}
