package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.referral.CouponListMetaResponseData;

/* renamed from: com.stockbit.domain.model.mapper.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6859h implements com.stockbit.domain.model.mapper.base.a {
    public C6859h() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((CouponListMetaResponseData) r1);
    }

    public com.stockbit.domain.model.valueobject.b b(CouponListMetaResponseData r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.valueobject.b(r2.a());
    }
}
