package com.stockbit.domain.model.mapper.securities;

import com.stockbit.model.entity.securities.TradingExerciseableStockResponseData;

/* loaded from: classes8.dex */
public final class D implements com.stockbit.domain.model.mapper.base.a {
    public D() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((TradingExerciseableStockResponseData) r1);
    }

    public com.stockbit.domain.model.entity.securities.v b(TradingExerciseableStockResponseData r10) {
        if (r10 != null) goto L4;
        return null;
    L4:
        return new com.stockbit.domain.model.entity.securities.v(r10.g(), r10.h(), r10.a(), r10.f(), r10.b(), r10.d(), r10.e(), r10.c());
    }
}
