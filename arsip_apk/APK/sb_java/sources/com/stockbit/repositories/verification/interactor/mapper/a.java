package com.stockbit.repositories.verification.interactor.mapper;

import com.stockbit.dto.verification.DukcapilCurrentStateDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((DukcapilCurrentStateDTO) r1);
    }

    public com.stockbit.domain.model.verification.a b(DukcapilCurrentStateDTO r2) {
        p.l(r2, "dataModel");
        Boolean r22 = r2.a();
        if (r22 == null) goto L5;
        boolean r23 = r22.booleanValue();
    L7:
        return new com.stockbit.domain.model.verification.a(r23);
    L5:
        r23 = false;
        goto L7
    }
}
