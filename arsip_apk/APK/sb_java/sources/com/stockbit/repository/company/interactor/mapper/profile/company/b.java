package com.stockbit.repository.company.interactor.mapper.profile.company;

import com.stockbit.dto.company.profile.CompanyProfileBeneficiaryDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b implements com.stockbit.repository.interactor.helper.b {
    public b() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((CompanyProfileBeneficiaryDTO) r1);
    }

    public com.stockbit.domain.model.company.profile.b b(CompanyProfileBeneficiaryDTO r2) {
        p.l(r2, "dataModel");
        String r22 = r2.a();
        if (r22 != null) goto L6;
        r22 = "";
    L6:
        return new com.stockbit.domain.model.company.profile.b(r22);
    }
}
