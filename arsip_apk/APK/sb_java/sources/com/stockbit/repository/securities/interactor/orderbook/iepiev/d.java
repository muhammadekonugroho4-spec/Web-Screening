package com.stockbit.repository.securities.interactor.orderbook.iepiev;

import com.stockbit.dto.company.iepiev.PriceFeedItemDTO;

/* loaded from: classes4.dex */
public final class d implements com.stockbit.repository.interactor.helper.b {
    public d() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((PriceFeedItemDTO) r1);
    }

    public com.stockbit.domain.model.company.iepiev.d b(PriceFeedItemDTO r4) {
        if (r4 == null) goto L8;
        String r02 = r4.a();
        if (r02 != null) goto L7;
        r02 = "";
    L7:
        return new com.stockbit.domain.model.company.iepiev.d(com.stockbit.repository.interactor.helper.d.a(r4.b()), r02);
    L8:
        return null;
    }
}
