package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.UserEmittenResponseData;

/* loaded from: classes8.dex */
public final class W implements com.stockbit.domain.model.mapper.base.a {
    public W() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((UserEmittenResponseData) r1);
    }

    public com.stockbit.domain.model.entity.B b(UserEmittenResponseData r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new com.stockbit.domain.model.entity.B(r2.a());
    }
}
