package com.stockbit.securities.interactor.mapper.history;

import com.stockbit.domain.model.securities.m;
import com.stockbit.dto.securities.RealizedColorDTO;

/* loaded from: classes11.dex */
public final class i implements com.stockbit.repository.interactor.helper.b {
    public i() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((RealizedColorDTO) r1);
    }

    public m b(RealizedColorDTO r5) {
        String r1 = null;
        if (r5 == null) goto L5;
        String r2 = r5.b();
    L6:
        String r3 = "";
        if (r2 != null) goto L9;
        r2 = "";
    L9:
        if (r5 == null) goto L11;
        r1 = r5.a();
    L11:
        if (r1 == null) goto L15;
        r3 = r1;
    L15:
        return new m(r2, r3);
    L5:
        r2 = null;
        goto L6
    }
}
