package com.data.repositories.chat.interactor.mapper.group;

import com.stockbit.dto.chat.room.UnreadMessageDTO;

/* loaded from: classes4.dex */
public final class s implements com.stockbit.repository.interactor.helper.b {
    public s() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((UnreadMessageDTO) r1);
    }

    public com.stockbit.domain.model.chat.room.o b(UnreadMessageDTO r3) {
        if (r3 == null) goto L7;
        Integer r1 = r3.b();
        if (r1 == null) goto L7;
        int r12 = r1.intValue();
    L8:
        if (r3 == null) goto L10;
        String r32 = r3.a();
    L11:
        if (r32 != null) goto L14;
        r32 = "";
    L14:
        return new com.stockbit.domain.model.chat.room.o(r12, r32);
    L10:
        r32 = null;
    L7:
        r12 = 0;
        goto L8
    }
}
