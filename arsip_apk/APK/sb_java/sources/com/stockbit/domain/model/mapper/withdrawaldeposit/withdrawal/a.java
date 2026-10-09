package com.stockbit.domain.model.mapper.withdrawaldeposit.withdrawal;

import com.stockbit.model.entity.withdrawal.WdOperationalTimeData;

/* loaded from: classes8.dex */
public final class a implements com.stockbit.domain.model.mapper.base.a {
    public a() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((WdOperationalTimeData) r1);
    }

    public Boolean b(WdOperationalTimeData r1) {
        if (r1 == null) goto L6;
        Boolean r12 = r1.a();
        if (r12 == null) goto L6;
        boolean r13 = com.stockbit.domain.extension.a.a(r12);
    L8:
        return Boolean.valueOf(r13);
    L6:
        r13 = false;
        goto L8
    }
}
