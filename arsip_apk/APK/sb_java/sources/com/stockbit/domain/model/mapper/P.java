package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.tipping.TippingSendActionResponseData;

/* loaded from: classes8.dex */
public final class P implements com.stockbit.domain.model.mapper.base.a {
    public P() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((TippingSendActionResponseData) r1);
    }

    public com.stockbit.domain.model.valueobject.t b(TippingSendActionResponseData r4) {
        if (r4 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.valueobject.t(r4.c(), r4.a(), r4.b());
    }
}
