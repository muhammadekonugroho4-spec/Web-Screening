package com.stockbit.repository.company.interactor.mapper.tradebook;

import com.stockbit.dto.company.tradebook.TradeBookBuySellDTO;

/* loaded from: classes10.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((TradeBookBuySellDTO) r1);
    }

    public com.stockbit.domain.model.company.tradebook.a b(TradeBookBuySellDTO r8) {
        if (r8 == null) goto L4;
        String r02 = r8.b();
        if (r02 != null) goto L8;
        r02 = "";
    L8:
        String r3 = r8.a();
        if (r3 != null) goto L11;
        r3 = "";
    L11:
        String r4 = r8.c();
        if (r4 != null) goto L14;
        r4 = "";
    L14:
        String r5 = r8.d();
        if (r5 != null) goto L17;
        r5 = "";
    L17:
        String r82 = r8.e();
        if (r82 != null) goto L21;
        String r6 = "";
    L23:
        return new com.stockbit.domain.model.company.tradebook.a(r02, r3, r4, r5, r6);
    L21:
        r6 = r82;
        goto L23
    L4:
        return new com.stockbit.domain.model.company.tradebook.a("", "", "", "", "");
    }
}
