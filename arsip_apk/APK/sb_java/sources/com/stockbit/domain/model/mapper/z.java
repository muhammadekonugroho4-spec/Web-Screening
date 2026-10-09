package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.referral.ReferralListPageResponseData;

/* loaded from: classes8.dex */
public final class z implements com.stockbit.domain.model.mapper.base.a {
    public z() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((ReferralListPageResponseData) r1);
    }

    public com.stockbit.domain.model.valueobject.l b(ReferralListPageResponseData r3) {
        if (r3 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.valueobject.l(r3.a(), r3.b());
    }
}
