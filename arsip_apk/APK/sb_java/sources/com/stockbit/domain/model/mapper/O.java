package com.stockbit.domain.model.mapper;

import com.stockbit.domain.model.valueobject.TippingMyJarProfile;
import com.stockbit.model.entity.tipping.TippingMyJarProfileResponseData;

/* loaded from: classes8.dex */
public final class O implements com.stockbit.domain.model.mapper.base.a {
    public O() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((TippingMyJarProfileResponseData) r1);
    }

    public TippingMyJarProfile b(TippingMyJarProfileResponseData r8) {
        if (r8 != null) goto L5;
        return null;
    L5:
        String r1 = r8.d();
        int r2 = r8.a();
        int r3 = r8.e();
        int r4 = r8.f();
        int r6 = r8.b();
        return new TippingMyJarProfile(r1, r2, r3, r4, r8.c(), r6);
    }
}
