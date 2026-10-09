package com.stockbit.repository.movers.interactor.mapper;

import com.stockbit.domain.model.movers.o;
import com.stockbit.dto.movers.MoversNotationDTO;

/* loaded from: classes10.dex */
public final class c implements com.stockbit.repository.interactor.helper.b {
    public c() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((MoversNotationDTO) r1);
    }

    public o b(MoversNotationDTO r5) {
        String r1 = null;
        if (r5 == null) goto L5;
        String r2 = r5.a();
    L6:
        String r3 = "";
        if (r2 != null) goto L9;
        r2 = "";
    L9:
        if (r5 == null) goto L11;
        r1 = r5.b();
    L11:
        if (r1 == null) goto L15;
        r3 = r1;
    L15:
        return new o(r2, r3);
    L5:
        r2 = null;
        goto L6
    }
}
