package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.referral.ReferralListRecordResponseData;

/* loaded from: classes8.dex */
public final class A implements com.stockbit.domain.model.mapper.base.a {
    public A() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((ReferralListRecordResponseData) r1);
    }

    public com.stockbit.domain.model.valueobject.m b(ReferralListRecordResponseData r4) {
        if (r4 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.valueobject.m(r4.a(), r4.b(), r4.c());
    }
}
