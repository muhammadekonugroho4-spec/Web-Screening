package com.stockbit.repository.company.interactor.mapper.profile.company;

import com.stockbit.domain.model.company.profile.l;
import com.stockbit.dto.company.profile.CompanyProfileSubsidiaryDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class k implements com.stockbit.repository.interactor.helper.b {
    public k() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((CompanyProfileSubsidiaryDTO) r1);
    }

    public l b(CompanyProfileSubsidiaryDTO r6) {
        p.l(r6, "dataModel");
        String r1 = r6.a();
        String r2 = "";
        if (r1 != null) goto L5;
        r1 = "";
    L5:
        String r3 = r6.b();
        if (r3 != null) goto L8;
        r3 = "";
    L8:
        String r4 = r6.c();
        if (r4 != null) goto L11;
        r4 = "";
    L11:
        String r62 = r6.d();
        if (r62 == null) goto L16;
        r2 = r62;
    L16:
        return new l(r1, r3, r4, r2);
    }
}
