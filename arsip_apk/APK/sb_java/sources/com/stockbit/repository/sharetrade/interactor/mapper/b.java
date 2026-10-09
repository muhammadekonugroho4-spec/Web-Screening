package com.stockbit.repository.sharetrade.interactor.mapper;

import com.stockbit.dto.sharetrade.AutoShareTradeStatusDTO;

/* loaded from: classes4.dex */
public final class b implements com.stockbit.repository.interactor.helper.b {
    public b() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((AutoShareTradeStatusDTO) r1);
    }

    public com.stockbit.domain.model.sharetrade.b b(AutoShareTradeStatusDTO r4) {
        int r1 = 0;
        if (r4 == null) goto L7;
        Boolean r2 = r4.a();
        if (r2 == null) goto L7;
        boolean r22 = r2.booleanValue();
    L8:
        Boolean r23 = Boolean.valueOf(r22);
        if (r4 == null) goto L14;
        Integer r42 = r4.b();
        if (r42 == null) goto L14;
        r1 = r42.intValue();
    L14:
        return new com.stockbit.domain.model.sharetrade.b(r23, Integer.valueOf(r1));
    L7:
        r22 = false;
        goto L8
    }
}
