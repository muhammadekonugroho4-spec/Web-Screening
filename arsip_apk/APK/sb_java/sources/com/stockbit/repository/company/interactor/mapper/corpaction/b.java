package com.stockbit.repository.company.interactor.mapper.corpaction;

import com.stockbit.dto.company.corpaction.CorpActionStatusInfoDTO;

/* loaded from: classes10.dex */
public final class b implements com.stockbit.repository.interactor.helper.b {
    public b() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((CorpActionStatusInfoDTO) r1);
    }

    public com.stockbit.domain.model.company.corpaction.c b(CorpActionStatusInfoDTO r6) {
        String r1 = null;
        if (r6 == null) goto L5;
        Boolean r2 = r6.a();
    L6:
        boolean r22 = com.stockbit.repository.interactor.helper.a.a(r2);
        if (r6 == null) goto L9;
        String r3 = r6.b();
    L10:
        String r4 = "";
        if (r3 != null) goto L13;
        r3 = "";
    L13:
        if (r6 == null) goto L15;
        r1 = r6.c();
    L15:
        if (r1 == null) goto L19;
        r4 = r1;
    L19:
        return new com.stockbit.domain.model.company.corpaction.c(r22, r3, r4);
    L9:
        r3 = null;
        goto L10
    L5:
        r2 = null;
        goto L6
    }
}
