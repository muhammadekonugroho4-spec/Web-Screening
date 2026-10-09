package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.referral.ReferralInfoResponseData;

/* renamed from: com.stockbit.domain.model.mapper.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6879w implements com.stockbit.domain.model.mapper.base.a {
    public C6879w() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((ReferralInfoResponseData) r1);
    }

    public com.stockbit.domain.model.entity.o b(ReferralInfoResponseData r4) {
        if (r4 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.entity.o(Integer.valueOf(r4.a()), r4.b(), Integer.valueOf(r4.c()));
    }
}
