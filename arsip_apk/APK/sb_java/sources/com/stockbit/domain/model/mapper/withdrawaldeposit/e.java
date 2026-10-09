package com.stockbit.domain.model.mapper.withdrawaldeposit;

import com.stockbit.domain.model.entity.deposit.RdnDetail;
import com.stockbit.model.entity.deposit.DepositRdnDetailData;

/* loaded from: classes8.dex */
public final class e implements com.stockbit.domain.model.mapper.base.a {
    public e() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((DepositRdnDetailData) r1);
    }

    public RdnDetail b(DepositRdnDetailData r10) {
        if (r10 != null) goto L6;
        return new RdnDetail(null, null, null, null, null, false, 63, null);
    L6:
        return new RdnDetail(r10.c(), r10.e(), r10.d(), r10.a(), r10.b(), r10.f());
    }
}
