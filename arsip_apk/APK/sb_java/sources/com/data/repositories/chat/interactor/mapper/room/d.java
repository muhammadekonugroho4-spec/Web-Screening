package com.data.repositories.chat.interactor.mapper.room;

import com.stockbit.dto.chat.room.RoomInfoDTO;

/* loaded from: classes4.dex */
public final class d implements com.stockbit.repository.interactor.helper.b {
    public d() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((RoomInfoDTO) r1);
    }

    public com.stockbit.domain.model.chat.room.g b(RoomInfoDTO r9) {
        String r1 = null;
        if (r9 == null) goto L5;
        String r2 = r9.c();
    L6:
        String r3 = "";
        if (r2 != null) goto L9;
        r2 = "";
    L9:
        if (r9 == null) goto L11;
        String r4 = r9.d();
    L12:
        if (r4 != null) goto L14;
        r4 = "";
    L14:
        if (r9 == null) goto L16;
        String r5 = r9.b();
    L17:
        if (r5 != null) goto L19;
        r5 = "";
    L19:
        if (r9 == null) goto L21;
        r1 = r9.a();
    L21:
        if (r1 == null) goto L25;
        r3 = r1;
    L25:
        return new com.stockbit.domain.model.chat.room.g(r2, r4, r5, r3, false, 16, null);
    L16:
        r5 = null;
        goto L17
    L11:
        r4 = null;
        goto L12
    L5:
        r2 = null;
        goto L6
    }
}
