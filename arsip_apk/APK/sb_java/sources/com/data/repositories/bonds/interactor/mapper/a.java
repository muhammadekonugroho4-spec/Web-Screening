package com.data.repositories.bonds.interactor.mapper;

import com.stockbit.dto.bonds.buy.BondBuyDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((BondBuyDTO) r1);
    }

    public com.stockbit.domain.model.bond.a b(BondBuyDTO r2) {
        p.l(r2, "dataModel");
        String r22 = r2.a();
        if (r22 != null) goto L6;
        r22 = "";
    L6:
        return new com.stockbit.domain.model.bond.a(r22);
    }
}
