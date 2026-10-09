package com.stockbit.repository.sharetrade.interactor.mapper;

import com.stockbit.dto.sharetrade.ShareTradeTargetPaginationDTO;

/* loaded from: classes4.dex */
public final class e implements com.stockbit.repository.interactor.helper.b {
    public e() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((ShareTradeTargetPaginationDTO) r1);
    }

    public com.stockbit.domain.model.sharetrade.e b(ShareTradeTargetPaginationDTO r2) {
        if (r2 == null) goto L5;
        String r22 = r2.a();
    L7:
        return new com.stockbit.domain.model.sharetrade.e(r22);
    L5:
        r22 = null;
        goto L7
    }
}
