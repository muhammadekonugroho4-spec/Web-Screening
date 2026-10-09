package com.stockbit.repository.company.interactor.mapper;

import com.stockbit.dto.company.CompanyChartbitTokenDTO;

/* loaded from: classes10.dex */
public final class g implements com.stockbit.repository.interactor.helper.b {
    public g() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((CompanyChartbitTokenDTO) r1);
    }

    public String b(CompanyChartbitTokenDTO r2) {
        kotlin.jvm.internal.p.l(r2, "dataModel");
        String r22 = r2.a();
        if (r22 != null) goto L6;
        return "";
    L6:
        return r22;
    }
}
