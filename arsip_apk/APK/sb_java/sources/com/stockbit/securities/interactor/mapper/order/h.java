package com.stockbit.securities.interactor.mapper.order;

import com.stockbit.dto.securities.common.OrderIdDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class h implements com.stockbit.repository.interactor.helper.b {
    public h() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((OrderIdDTO) r1);
    }

    public String b(OrderIdDTO r2) {
        p.l(r2, "dataModel");
        String r22 = r2.a();
        if (r22 != null) goto L6;
        return "";
    L6:
        return r22;
    }
}
