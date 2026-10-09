package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.tipping.TippingDetailTippingUserSenderResponseData;

/* loaded from: classes8.dex */
public final class N implements com.stockbit.domain.model.mapper.base.a {
    public N() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((TippingDetailTippingUserSenderResponseData) r1);
    }

    public com.stockbit.domain.model.valueobject.s b(TippingDetailTippingUserSenderResponseData r3) {
        if (r3 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.valueobject.s(r3.b(), r3.a());
    }
}
