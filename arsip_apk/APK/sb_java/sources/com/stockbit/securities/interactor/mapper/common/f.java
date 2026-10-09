package com.stockbit.securities.interactor.mapper.common;

import com.stockbit.dto.securities.common.FullCallAuctionCycleDTO;

/* loaded from: classes11.dex */
public final class f implements com.stockbit.repository.interactor.helper.b {
    public f() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((FullCallAuctionCycleDTO) r1);
    }

    public com.stockbit.domain.model.securities.common.f b(FullCallAuctionCycleDTO r6) {
        String r02 = null;
        if (r6 == null) goto L18;
        String r2 = r6.c();
        String r3 = "";
        if (r2 != null) goto L7;
        r2 = "";
    L7:
        String r4 = r6.b();
        if (r4 != null) goto L10;
        r4 = "";
    L10:
        FullCallAuctionCycleDTO.BannerMessageDTO r62 = r6.a();
        if (r62 == null) goto L13;
        r02 = r62.a();
    L13:
        if (r02 == null) goto L17;
        r3 = r02;
    L17:
        return new com.stockbit.domain.model.securities.common.f(r2, r4, r3);
    L18:
        return null;
    }
}
