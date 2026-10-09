package com.data.repositories.chat.interactor.mapper.group;

import com.stockbit.dto.chat.group.PublicGroupAttributeDTO;

/* loaded from: classes4.dex */
public final class c implements com.stockbit.repository.interactor.helper.b {
    public c() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((PublicGroupAttributeDTO) r1);
    }

    public com.stockbit.domain.model.chat.group.s b(PublicGroupAttributeDTO r2) {
        if (r2 == null) goto L5;
        String r22 = r2.a();
    L6:
        if (r22 != null) goto L9;
        r22 = "";
    L9:
        return new com.stockbit.domain.model.chat.group.s(r22);
    L5:
        r22 = null;
        goto L6
    }
}
