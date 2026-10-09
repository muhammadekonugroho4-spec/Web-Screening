package com.stockbit.domain.model.mapper.register;

import com.stockbit.model.entity.register.RegistrationCommonResponseData;

/* loaded from: classes8.dex */
public final class a implements com.stockbit.domain.model.mapper.base.a {
    public a() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((RegistrationCommonResponseData) r1);
    }

    public com.stockbit.domain.model.valueobject.register.b b(RegistrationCommonResponseData r4) {
        if (r4 == null) goto L4;
        boolean r1 = r4.c();
        String r42 = r4.b();
        if (r42 != null) goto L9;
        r42 = "";
    L9:
        return new com.stockbit.domain.model.valueobject.register.b(r1, r42);
    L4:
        return new com.stockbit.domain.model.valueobject.register.b(false, null, 3, null);
    }
}
