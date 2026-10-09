package com.stockbit.domain.model.mapper.amendbank;

import com.stockbit.model.entity.LivenessQuotaResponseData;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g implements com.stockbit.domain.model.mapper.base.a {
    public g() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((LivenessQuotaResponseData) r1);
    }

    public com.stockbit.domain.model.entity.amendbank.c b(LivenessQuotaResponseData r3) {
        if (r3 == null) goto L6;
        com.stockbit.domain.model.entity.amendbank.c r02 = new com.stockbit.domain.model.entity.amendbank.c();
        r02.b(p.g(r3.a(), Boolean.TRUE));
        return r02;
    L6:
        return new com.stockbit.domain.model.entity.amendbank.c();
    }
}
