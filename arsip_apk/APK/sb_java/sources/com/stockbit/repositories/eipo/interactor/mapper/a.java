package com.stockbit.repositories.eipo.interactor.mapper;

import com.stockbit.dto.eipo.EIpoBalanceDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((EIpoBalanceDTO) r1);
    }

    public Double b(EIpoBalanceDTO r3) {
        p.l(r3, "dataModel");
        return Double.valueOf(com.stockbit.repository.interactor.helper.d.a(r3.a()));
    }
}
