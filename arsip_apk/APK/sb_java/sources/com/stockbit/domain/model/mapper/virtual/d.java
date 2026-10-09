package com.stockbit.domain.model.mapper.virtual;

import com.stockbit.model.entity.TradingSwitchToVirtualResponseData;

/* loaded from: classes8.dex */
public final class d implements com.stockbit.domain.model.mapper.base.a {
    public d() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((TradingSwitchToVirtualResponseData) r1);
    }

    public com.stockbit.domain.model.entity.virtual.g b(TradingSwitchToVirtualResponseData r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new com.stockbit.domain.model.entity.virtual.g(r2.a());
    }
}
