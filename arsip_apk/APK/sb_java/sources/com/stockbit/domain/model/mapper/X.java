package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.SecuritiesIdentityVerificationKTPResponseData;

/* loaded from: classes8.dex */
public final class X implements com.stockbit.domain.model.mapper.base.a {
    public X() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((SecuritiesIdentityVerificationKTPResponseData) r1);
    }

    public com.stockbit.domain.model.valueobject.v b(SecuritiesIdentityVerificationKTPResponseData r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.valueobject.v(com.stockbit.domain.extension.a.a(r2.a()));
    }
}
