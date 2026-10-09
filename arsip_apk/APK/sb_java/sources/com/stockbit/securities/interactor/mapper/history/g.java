package com.stockbit.securities.interactor.mapper.history;

import com.stockbit.dto.securities.HistoryTooltipDTO;

/* loaded from: classes11.dex */
public final class g implements com.stockbit.repository.interactor.helper.b {
    public g() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((HistoryTooltipDTO) r1);
    }

    public com.stockbit.domain.model.securities.j b(HistoryTooltipDTO r5) {
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
        return new com.stockbit.domain.model.securities.j(r2, r3);
    L5:
        r2 = null;
        goto L6
    }
}
