package com.stockbit.securities.interactor.mapper.formula;

import com.stockbit.dto.securities.formula.CompositionDTO;

/* loaded from: classes11.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((CompositionDTO) r1);
    }

    public com.stockbit.domain.model.securities.formula.a b(CompositionDTO r6) {
        Integer r1 = null;
        if (r6 == null) goto L5;
        String r2 = r6.a();
    L6:
        if (r2 != null) goto L8;
        r2 = "";
    L8:
        if (r6 == null) goto L10;
        Double r3 = r6.c();
    L11:
        double r32 = com.stockbit.repository.interactor.helper.d.a(r3);
        if (r6 == null) goto L15;
        r1 = r6.b();
    L15:
        return new com.stockbit.domain.model.securities.formula.a(r2, r32, com.stockbit.repository.interactor.helper.d.b(r1));
    L10:
        r3 = null;
        goto L11
    L5:
        r2 = null;
        goto L6
    }
}
