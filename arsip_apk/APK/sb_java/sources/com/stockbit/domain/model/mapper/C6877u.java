package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.referral.RedeemUnitResponseData;

/* renamed from: com.stockbit.domain.model.mapper.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6877u implements com.stockbit.domain.model.mapper.base.a {
    public C6877u() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((RedeemUnitResponseData) r1);
    }

    public com.stockbit.domain.model.entity.n b(RedeemUnitResponseData r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.entity.n(Integer.valueOf(r2.a()));
    }
}
