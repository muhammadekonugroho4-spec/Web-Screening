package com.stockbit.repository.company.interactor.mapper.profile.company;

import com.stockbit.dto.company.profile.CompanyProfilePersonDTO;
import java.util.Locale;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class h implements com.stockbit.repository.interactor.helper.b {
    public h() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((CompanyProfilePersonDTO) r1);
    }

    public com.stockbit.domain.model.company.profile.i b(CompanyProfilePersonDTO r4) {
        p.l(r4, "dataModel");
        String r1 = r4.a();
        String r2 = "";
        if (r1 != null) goto L5;
        r1 = "";
    L5:
        String r42 = r4.b();
        if (r42 == null) goto L9;
        r2 = r42;
    L9:
        String r43 = r2.toUpperCase(Locale.ROOT);
        p.k(r43, "toUpperCase(...)");
        return new com.stockbit.domain.model.company.profile.i(r1, r43);
    }
}
