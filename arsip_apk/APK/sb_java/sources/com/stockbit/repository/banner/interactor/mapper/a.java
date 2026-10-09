package com.stockbit.repository.banner.interactor.mapper;

import com.stockbit.dto.banner.BannerContentDTO;

/* loaded from: classes10.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((BannerContentDTO) r1);
    }

    public com.stockbit.domain.model.banner.a b(BannerContentDTO r4) {
        String r1 = null;
        if (r4 == null) goto L5;
        String r2 = r4.b();
    L6:
        if (r4 == null) goto L9;
        r1 = r4.a();
    L9:
        return new com.stockbit.domain.model.banner.a(r2, r1);
    L5:
        r2 = null;
        goto L6
    }
}
