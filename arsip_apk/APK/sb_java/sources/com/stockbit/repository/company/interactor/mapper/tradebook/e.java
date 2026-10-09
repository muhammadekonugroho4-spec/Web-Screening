package com.stockbit.repository.company.interactor.mapper.tradebook;

import com.stockbit.domain.model.company.tradebook.i;
import com.stockbit.dto.company.tradebook.TradeBookPaginateDTO;

/* loaded from: classes10.dex */
public final class e implements com.stockbit.repository.interactor.helper.b {
    public e() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((TradeBookPaginateDTO) r1);
    }

    public i b(TradeBookPaginateDTO r3) {
        String r02 = "";
        if (r3 == null) goto L5;
        String r32 = r3.a();
        if (r32 == null) goto L11;
        r02 = r32;
    L11:
        return new i(r02);
    L5:
        return new i("");
    }
}
