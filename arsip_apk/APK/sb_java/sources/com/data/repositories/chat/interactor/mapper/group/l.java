package com.data.repositories.chat.interactor.mapper.group;

import com.stockbit.dto.chat.group.GroupShareTradeDTO;

/* loaded from: classes4.dex */
public final class l implements com.stockbit.repository.interactor.helper.b {
    public l() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((GroupShareTradeDTO) r1);
    }

    public com.stockbit.domain.model.chat.group.j b(GroupShareTradeDTO r5) {
        Boolean r1 = null;
        if (r5 == null) goto L5;
        Boolean r2 = r5.a();
    L6:
        boolean r22 = com.stockbit.repository.interactor.helper.a.a(r2);
        if (r5 == null) goto L9;
        Boolean r3 = r5.b();
    L10:
        boolean r32 = com.stockbit.repository.interactor.helper.a.a(r3);
        if (r5 == null) goto L14;
        r1 = r5.c();
    L14:
        return new com.stockbit.domain.model.chat.group.j(r22, r32, com.stockbit.repository.interactor.helper.a.a(r1));
    L9:
        r3 = null;
        goto L10
    L5:
        r2 = null;
        goto L6
    }
}
