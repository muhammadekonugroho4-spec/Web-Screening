package com.stockbit.repository.company.interactor.mapper.info;

import com.stockbit.dto.company.CompanyCatalogDTO;

/* loaded from: classes10.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((CompanyCatalogDTO) r1);
    }

    public com.stockbit.domain.model.company.info.a b(CompanyCatalogDTO r9) {
        Boolean r1 = null;
        if (r9 == null) goto L5;
        String r2 = r9.b();
    L6:
        String r3 = "";
        if (r2 != null) goto L9;
        r2 = "";
    L9:
        if (r9 == null) goto L11;
        String r4 = r9.a();
    L12:
        if (r4 != null) goto L14;
        r4 = "";
    L14:
        if (r9 == null) goto L16;
        String r5 = r9.c();
    L17:
        if (r5 != null) goto L19;
        r5 = "";
    L19:
        if (r9 == null) goto L21;
        String r6 = r9.e();
    L22:
        if (r6 != null) goto L24;
        r6 = "";
    L24:
        if (r9 == null) goto L26;
        String r7 = r9.d();
    L27:
        if (r7 == null) goto L30;
        r3 = r7;
    L30:
        if (r9 == null) goto L32;
        r1 = r9.f();
    L32:
        boolean r92 = com.stockbit.repository.interactor.helper.a.a(r1);
        return new com.stockbit.domain.model.company.info.a(r2, r4, r5, r6, r3, r92);
    L26:
        r7 = null;
        goto L27
    L21:
        r6 = null;
        goto L22
    L16:
        r5 = null;
        goto L17
    L11:
        r4 = null;
        goto L12
    L5:
        r2 = null;
        goto L6
    }
}
