package com.data.repositories.chat.interactor.mapper.group;

import com.stockbit.dto.chat.group.PrivateGroupAttributeDTO;

/* loaded from: classes4.dex */
public final class b implements com.stockbit.repository.interactor.helper.b {
    public b() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((PrivateGroupAttributeDTO) r1);
    }

    public com.stockbit.domain.model.chat.group.r b(PrivateGroupAttributeDTO r2) {
        if (r2 == null) goto L7;
        Integer r22 = r2.a();
        if (r22 == null) goto L7;
        int r23 = r22.intValue();
    L9:
        return new com.stockbit.domain.model.chat.group.r(r23);
    L7:
        r23 = 0;
        goto L9
    }
}
