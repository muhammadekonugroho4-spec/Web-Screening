package com.stockbit.domain.model.mapper.securities;

import com.stockbit.model.entity.securities.TradingExerciseTradeableResponseData;

/* loaded from: classes8.dex */
public final class C implements com.stockbit.domain.model.mapper.base.a {
    public C() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((TradingExerciseTradeableResponseData) r1);
    }

    public com.stockbit.domain.model.entity.securities.u b(TradingExerciseTradeableResponseData r3) {
        if (r3 != null) goto L4;
        return null;
    L4:
        return new com.stockbit.domain.model.entity.securities.u(r3.b(), r3.a());
    }
}
