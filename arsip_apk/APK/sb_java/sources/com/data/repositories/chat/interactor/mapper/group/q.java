package com.data.repositories.chat.interactor.mapper.group;

import com.stockbit.dto.chat.group.MuteUnmuteGroupDTO;

/* loaded from: classes4.dex */
public final class q implements com.stockbit.repository.interactor.helper.b {
    public q() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((MuteUnmuteGroupDTO) r1);
    }

    public com.stockbit.domain.model.chat.group.q b(MuteUnmuteGroupDTO r2) {
        kotlin.jvm.internal.p.l(r2, "dataModel");
        return new com.stockbit.domain.model.chat.group.q(r2.a());
    }
}
