package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.referral.RedeemAllResponseData;

/* renamed from: com.stockbit.domain.model.mapper.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6876t implements com.stockbit.domain.model.mapper.base.a {
    public C6876t() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((RedeemAllResponseData) r1);
    }

    public com.stockbit.domain.model.entity.m b(RedeemAllResponseData r4) {
        if (r4 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.entity.m(r4.b(), r4.getError(), r4.a());
    }
}
