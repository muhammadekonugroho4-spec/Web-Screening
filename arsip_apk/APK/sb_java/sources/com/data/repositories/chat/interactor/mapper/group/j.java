package com.data.repositories.chat.interactor.mapper.group;

import com.stockbit.dto.chat.group.MemberStatsDTO;

/* loaded from: classes4.dex */
public final class j implements com.stockbit.repository.interactor.helper.b {
    public j() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((MemberStatsDTO) r1);
    }

    public com.stockbit.domain.model.chat.group.n b(MemberStatsDTO r6) {
        Integer r1 = null;
        if (r6 == null) goto L5;
        Integer r2 = r6.c();
    L6:
        int r22 = com.stockbit.repository.interactor.helper.d.b(r2);
        if (r6 == null) goto L9;
        Integer r3 = r6.d();
    L10:
        int r32 = com.stockbit.repository.interactor.helper.d.b(r3);
        if (r6 == null) goto L13;
        Integer r4 = r6.b();
    L14:
        int r42 = com.stockbit.repository.interactor.helper.d.b(r4);
        if (r6 == null) goto L18;
        r1 = r6.a();
    L18:
        return new com.stockbit.domain.model.chat.group.n(r22, r32, r42, com.stockbit.repository.interactor.helper.d.b(r1));
    L13:
        r4 = null;
        goto L14
    L9:
        r3 = null;
        goto L10
    L5:
        r2 = null;
        goto L6
    }
}
