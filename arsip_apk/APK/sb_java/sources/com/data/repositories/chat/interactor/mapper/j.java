package com.data.repositories.chat.interactor.mapper;

import com.stockbit.dto.chat.room.RoomStatusDTO;

/* loaded from: classes4.dex */
public final class j implements com.stockbit.repository.interactor.helper.b {
    public j() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((RoomStatusDTO) r1);
    }

    public com.stockbit.domain.model.chat.room.l b(RoomStatusDTO r4) {
        Boolean r1 = null;
        if (r4 == null) goto L5;
        Boolean r2 = r4.b();
    L6:
        boolean r22 = com.stockbit.repository.interactor.helper.a.a(r2);
        if (r4 == null) goto L10;
        r1 = r4.a();
    L10:
        return new com.stockbit.domain.model.chat.room.l(r22, com.stockbit.repository.interactor.helper.a.a(r1));
    L5:
        r2 = null;
        goto L6
    }
}
