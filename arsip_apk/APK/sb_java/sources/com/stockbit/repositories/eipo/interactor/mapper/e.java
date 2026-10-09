package com.stockbit.repositories.eipo.interactor.mapper;

import com.stockbit.dto.eipo.EIpoCreateDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class e implements com.stockbit.repository.interactor.helper.b {
    public e() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((EIpoCreateDTO) r1);
    }

    public String b(EIpoCreateDTO r2) {
        p.l(r2, "dataModel");
        String r22 = r2.a();
        if (r22 != null) goto L6;
        return "";
    L6:
        return r22;
    }
}
