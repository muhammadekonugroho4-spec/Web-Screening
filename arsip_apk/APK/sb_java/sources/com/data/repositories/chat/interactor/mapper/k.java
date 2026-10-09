package com.data.repositories.chat.interactor.mapper;

import com.stockbit.domain.model.chat.room.m;
import com.stockbit.dto.chat.room.RoomUnreadMessageDTO;

/* loaded from: classes4.dex */
public final class k implements com.stockbit.repository.interactor.helper.b {
    public k() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((RoomUnreadMessageDTO) r1);
    }

    public m b(RoomUnreadMessageDTO r4) {
        Integer r1 = null;
        if (r4 == null) goto L5;
        Integer r2 = r4.a();
    L6:
        int r22 = com.stockbit.repository.interactor.helper.d.b(r2);
        if (r4 == null) goto L10;
        r1 = r4.b();
    L10:
        return new m(r22, com.stockbit.repository.interactor.helper.d.b(r1));
    L5:
        r2 = null;
        goto L6
    }
}
