package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.StockDocumentResponseData;

/* loaded from: classes8.dex */
public final class J implements com.stockbit.domain.model.mapper.base.a {
    public J() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((StockDocumentResponseData) r1);
    }

    public com.stockbit.domain.model.entity.u b(StockDocumentResponseData r7) {
        if (r7 == null) goto L4;
        Integer r1 = r7.a();
        if (r1 == null) goto L8;
        int r12 = r1.intValue();
    L9:
        String r2 = r7.c();
        String r3 = "";
        if (r2 != null) goto L12;
        r2 = "";
    L12:
        String r72 = r7.b();
        if (r72 == null) goto L17;
        r3 = r72;
    L17:
        return new com.stockbit.domain.model.entity.u(r12, r2, r3);
    L8:
        r12 = 0;
        goto L9
    L4:
        return new com.stockbit.domain.model.entity.u(0, null, null, 7, null);
    }
}
