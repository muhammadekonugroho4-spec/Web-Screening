package com.data.repositories.chat.interactor.mapper.message;

import com.stockbit.domain.model.chat.message.MessageFlagEntity;
import com.stockbit.dto.chat.message.MessageFlagDTO;

/* loaded from: classes4.dex */
public final class g implements com.stockbit.repository.interactor.helper.b {
    public g() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((MessageFlagDTO) r1);
    }

    public MessageFlagEntity b(MessageFlagDTO r6) {
        boolean r1 = false;
        if (r6 == null) goto L5;
        boolean r2 = r6.c();
    L6:
        if (r6 == null) goto L8;
        boolean r3 = r6.b();
    L9:
        if (r6 == null) goto L11;
        boolean r4 = r6.d();
    L12:
        if (r6 == null) goto L15;
        r1 = r6.a();
    L15:
        return new MessageFlagEntity(r2, r3, r4, r1);
    L11:
        r4 = false;
        goto L12
    L8:
        r3 = false;
        goto L9
    L5:
        r2 = false;
        goto L6
    }
}
