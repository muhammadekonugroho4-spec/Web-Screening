package com.data.repositories.securitiesoa.interactor.mapper;

import com.stockbit.domain.model.openingaccount.k;
import com.stockbit.dto.auth.securities.SecuritiesOANextPageDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class g implements com.stockbit.repository.interactor.helper.b {
    public g() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((SecuritiesOANextPageDTO) r1);
    }

    public k b(SecuritiesOANextPageDTO r2) {
        p.l(r2, "dataModel");
        String r22 = r2.a();
        if (r22 != null) goto L6;
        r22 = "";
    L6:
        return new k(r22);
    }
}
