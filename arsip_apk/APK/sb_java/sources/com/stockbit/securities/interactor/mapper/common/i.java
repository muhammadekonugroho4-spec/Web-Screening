package com.stockbit.securities.interactor.mapper.common;

import com.stockbit.dto.securities.common.SplitOrderInfoDTO;

/* loaded from: classes11.dex */
public final class i implements com.stockbit.repository.interactor.helper.b {
    public i() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((SplitOrderInfoDTO) r1);
    }

    public com.stockbit.domain.model.securities.common.j b(SplitOrderInfoDTO r9) {
        if (r9 == null) goto L12;
        int r1 = com.stockbit.repository.interactor.helper.d.b(r9.c());
        int r2 = com.stockbit.repository.interactor.helper.d.b(r9.d());
        String r3 = r9.e();
        String r4 = "";
        if (r3 != null) goto L6;
        r3 = "";
    L6:
        String r5 = r9.f();
        if (r5 == null) goto L11;
        r4 = r5;
    L11:
        return new com.stockbit.domain.model.securities.common.j(r1, r2, r3, r4, com.stockbit.repository.interactor.helper.d.b(r9.b()), com.stockbit.repository.interactor.helper.d.c(r9.a()));
    L12:
        return null;
    }
}
