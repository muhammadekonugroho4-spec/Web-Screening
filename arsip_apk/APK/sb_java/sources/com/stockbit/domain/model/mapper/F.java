package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.SaveStockTransferDataResponse;

/* loaded from: classes8.dex */
public final class F implements com.stockbit.domain.model.mapper.base.a {
    public F() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((SaveStockTransferDataResponse) r1);
    }

    public com.stockbit.domain.model.entity.s b(SaveStockTransferDataResponse r8) {
        if (r8 == null) goto L4;
        String r1 = r8.b();
        if (r1 != null) goto L8;
        r1 = "";
    L8:
        Integer r2 = r8.c();
        int r3 = 0;
        if (r2 == null) goto L11;
        int r22 = r2.intValue();
    L12:
        Integer r4 = r8.a();
        if (r4 == null) goto L16;
        r3 = r4.intValue();
    L16:
        return new com.stockbit.domain.model.entity.s(r1, r22, r3, r8.d());
    L11:
        r22 = 0;
        goto L12
    L4:
        return new com.stockbit.domain.model.entity.s(null, 0, 0, null, 15, null);
    }
}
