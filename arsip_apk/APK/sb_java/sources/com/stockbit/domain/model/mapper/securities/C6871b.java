package com.stockbit.domain.model.mapper.securities;

import com.stockbit.domain.model.valueobject.securities.BankCheck;
import com.stockbit.model.entity.BankCheckResponseData;

/* renamed from: com.stockbit.domain.model.mapper.securities.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6871b implements com.stockbit.domain.model.mapper.base.a {
    public C6871b() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((BankCheckResponseData) r1);
    }

    public BankCheck b(BankCheckResponseData r4) {
        if (r4 != null) goto L6;
        return null;
    L6:
        return new BankCheck(r4.c(), r4.b(), r4.a());
    }
}
