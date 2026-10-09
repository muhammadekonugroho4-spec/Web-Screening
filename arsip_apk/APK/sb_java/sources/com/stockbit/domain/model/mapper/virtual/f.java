package com.stockbit.domain.model.mapper.virtual;

import com.stockbit.model.entity.virtual.VirtualBuyResponseData;

/* loaded from: classes8.dex */
public final class f implements com.stockbit.domain.model.mapper.base.a {
    public f() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((VirtualBuyResponseData) r1);
    }

    public com.stockbit.domain.model.entity.virtual.b b(VirtualBuyResponseData r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new com.stockbit.domain.model.entity.virtual.b(r2.a());
    }
}
