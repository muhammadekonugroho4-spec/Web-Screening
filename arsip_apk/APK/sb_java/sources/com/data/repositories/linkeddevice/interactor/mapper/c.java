package com.data.repositories.linkeddevice.interactor.mapper;

import com.stockbit.dto.linkeddevice.DeviceDTO;

/* loaded from: classes4.dex */
public final class c implements com.stockbit.repository.interactor.helper.b {
    public c() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((DeviceDTO) r1);
    }

    public com.stockbit.domain.model.linkeddevice.a b(DeviceDTO r5) {
        String r1 = null;
        if (r5 == null) goto L5;
        String r2 = r5.a();
    L6:
        String r3 = "";
        if (r2 != null) goto L9;
        r2 = "";
    L9:
        if (r5 == null) goto L11;
        r1 = r5.b();
    L11:
        if (r1 == null) goto L15;
        r3 = r1;
    L15:
        return new com.stockbit.domain.model.linkeddevice.a(r2, r3);
    L5:
        r2 = null;
        goto L6
    }
}
