package com.stockbit.repository.banner.interactor.mapper;

import com.stockbit.dto.banner.BannerInfoboxTickerDTO;

/* loaded from: classes10.dex */
public final class b implements com.stockbit.repository.interactor.helper.b {
    public b() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((BannerInfoboxTickerDTO) r1);
    }

    public com.stockbit.domain.model.banner.d b(BannerInfoboxTickerDTO r4) {
        String r1 = null;
        if (r4 == null) goto L5;
        String r2 = r4.a();
    L6:
        if (r4 == null) goto L9;
        r1 = r4.b();
    L9:
        return new com.stockbit.domain.model.banner.d(r2, r1);
    L5:
        r2 = null;
        goto L6
    }
}
