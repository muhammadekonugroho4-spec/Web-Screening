package com.stockbit.repository.alert.interactor.mapper;

import com.stockbit.domain.model.alert.q;
import com.stockbit.dto.alert.AlertSummaryResponseDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class h implements com.stockbit.repository.interactor.helper.b {
    public h() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((AlertSummaryResponseDTO) r1);
    }

    public q b(AlertSummaryResponseDTO r4) {
        p.l(r4, "dataModel");
        AlertSummaryResponseDTO.UnseenCount r1 = r4.b();
        int r2 = 0;
        if (r1 == null) goto L7;
        Integer r12 = r1.a();
        if (r12 == null) goto L7;
        int r13 = r12.intValue();
    L8:
        Integer r42 = r4.a();
        if (r42 == null) goto L12;
        r2 = r42.intValue();
    L12:
        return new q(r13, r2);
    L7:
        r13 = 0;
        goto L8
    }
}
