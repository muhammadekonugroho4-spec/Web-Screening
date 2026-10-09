package com.stockbit.domain.model.mapper.securities;

import com.stockbit.model.entity.securities.CashOnHandResponseData;

/* renamed from: com.stockbit.domain.model.mapper.securities.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6874e implements com.stockbit.domain.model.mapper.base.a {
    public C6874e() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((CashOnHandResponseData) r1);
    }

    public com.stockbit.domain.model.entity.securities.d b(CashOnHandResponseData r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new com.stockbit.domain.model.entity.securities.d(r2.a());
    }
}
