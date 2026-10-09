package com.data.repositories.intraservice_interactor;

import com.stockbit.dto.intraservice.MoveCashDTO;
import com.stockbit.repository.interactor.helper.b;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a implements b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((MoveCashDTO) r1);
    }

    public com.stockbit.domain.model.intraservice.a b(MoveCashDTO r2) {
        p.l(r2, "dataModel");
        return new com.stockbit.domain.model.intraservice.a(r2.a());
    }
}
