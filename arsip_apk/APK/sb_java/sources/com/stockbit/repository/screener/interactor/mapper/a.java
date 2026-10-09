package com.stockbit.repository.screener.interactor.mapper;

import com.stockbit.dto.screener.ScreenerBadgesDTO;

/* loaded from: classes10.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((ScreenerBadgesDTO) r1);
    }

    public com.stockbit.domain.model.screener.a b(ScreenerBadgesDTO r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.screener.a(com.stockbit.repository.interactor.helper.a.a(r2.a()));
    }
}
