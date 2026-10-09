package com.stockbit.repository.company.interactor.mapper;

import com.stockbit.dto.company.FundachartTokenDTO;

/* loaded from: classes10.dex */
public final class F implements com.stockbit.repository.interactor.helper.b {
    public F() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((FundachartTokenDTO) r1);
    }

    public com.stockbit.domain.model.company.z b(FundachartTokenDTO r2) {
        kotlin.jvm.internal.p.l(r2, "dataModel");
        String r22 = r2.a();
        if (r22 != null) goto L6;
        r22 = "";
    L6:
        return new com.stockbit.domain.model.company.z(r22);
    }
}
