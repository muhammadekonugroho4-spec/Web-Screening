package com.data.repositories.chat.interactor.mapper.message;

import com.stockbit.domain.model.chat.message.attachment.shared.invitation.MessageInvitationEntity;
import com.stockbit.dto.chat.message.attachment.shared.invitation.MessageInvitationDTO;

/* loaded from: classes4.dex */
public final class h implements com.stockbit.repository.interactor.helper.b {
    public h() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((MessageInvitationDTO) r1);
    }

    public MessageInvitationEntity b(MessageInvitationDTO r4) {
        if (r4 != null) goto L5;
        return null;
    L5:
        String r1 = r4.a();
        String r2 = "";
        if (r1 != null) goto L8;
        r1 = "";
    L8:
        String r42 = r4.b();
        if (r42 == null) goto L13;
        r2 = r42;
    L13:
        return new MessageInvitationEntity(r1, r2);
    }
}
