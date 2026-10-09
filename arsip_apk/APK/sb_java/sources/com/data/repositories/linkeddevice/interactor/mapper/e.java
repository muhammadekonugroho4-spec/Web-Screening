package com.data.repositories.linkeddevice.interactor.mapper;

import com.stockbit.dto.linkeddevice.GeoLocationDTO;

/* loaded from: classes4.dex */
public final class e implements com.stockbit.repository.interactor.helper.b {
    public e() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((GeoLocationDTO) r1);
    }

    public com.stockbit.domain.model.linkeddevice.e b(GeoLocationDTO r10) {
        String r1 = null;
        if (r10 == null) goto L5;
        Double r2 = r10.b();
    L6:
        double r22 = com.stockbit.repository.interactor.helper.d.a(r2);
        if (r10 == null) goto L9;
        Double r4 = r10.c();
    L10:
        double r42 = com.stockbit.repository.interactor.helper.d.a(r4);
        if (r10 == null) goto L13;
        String r6 = r10.a();
    L15:
        if (r6 != null) goto L17;
        r6 = "";
    L17:
        if (r10 == null) goto L19;
        r1 = r10.d();
    L19:
        if (r1 != null) goto L21;
        double r12 = r22;
        double r3 = r42;
        String r5 = r6;
        String r62 = "";
    L23:
        return new com.stockbit.domain.model.linkeddevice.e(r12, r3, r5, r62);
    L21:
        String r8 = r6;
        r62 = r1;
        r12 = r22;
        r3 = r42;
        r5 = r8;
        goto L23
    L13:
        r6 = null;
        goto L15
    L9:
        r4 = null;
        goto L10
    L5:
        r2 = null;
        goto L6
    }
}
