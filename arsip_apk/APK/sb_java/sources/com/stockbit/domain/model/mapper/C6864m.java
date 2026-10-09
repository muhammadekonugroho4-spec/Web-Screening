package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.EIpoLinkResponseData;

/* renamed from: com.stockbit.domain.model.mapper.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6864m implements com.stockbit.domain.model.mapper.base.a {
    public C6864m() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((EIpoLinkResponseData) r1);
    }

    public com.stockbit.domain.model.valueobject.f b(EIpoLinkResponseData r4) {
        if (r4 == null) goto L4;
        String r1 = r4.b();
        String r2 = "";
        if (r1 != null) goto L8;
        r1 = "";
    L8:
        String r42 = r4.a();
        if (r42 == null) goto L13;
        r2 = r42;
    L13:
        return new com.stockbit.domain.model.valueobject.f(r1, r2);
    L4:
        return new com.stockbit.domain.model.valueobject.f(null, null, 3, null);
    }
}
