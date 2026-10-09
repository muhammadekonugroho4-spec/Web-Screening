package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.referral.UpdateReferralCodeResponseData;

/* loaded from: classes8.dex */
public final class V implements com.stockbit.domain.model.mapper.base.a {
    public V() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((UpdateReferralCodeResponseData) r1);
    }

    public com.stockbit.domain.model.entity.A b(UpdateReferralCodeResponseData r4) {
        if (r4 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.entity.A(r4.a(), r4.b(), r4.getError());
    }
}
