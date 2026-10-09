package com.stockbit.domain.model.mapper;

import com.stockbit.model.entity.ChangeRequestResponseData;

/* renamed from: com.stockbit.domain.model.mapper.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6855d implements com.stockbit.domain.model.mapper.base.a {
    public C6855d() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((ChangeRequestResponseData) r1);
    }

    public com.stockbit.domain.model.valueobject.a b(ChangeRequestResponseData r4) {
        if (r4 != null) goto L5;
        return null;
    L5:
        String r1 = r4.a();
        String r2 = "";
        if (r1 != null) goto L8;
        r1 = "";
    L8:
        String r42 = r4.b();
        if (r42 == null) goto L13;
        r2 = r42;
    L13:
        return new com.stockbit.domain.model.valueobject.a(r1, r2);
    }
}
