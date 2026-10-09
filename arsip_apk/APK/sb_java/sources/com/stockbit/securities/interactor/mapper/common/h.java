package com.stockbit.securities.interactor.mapper.common;

import com.stockbit.domain.model.securities.common.i;
import com.stockbit.dto.securities.common.OrderCountLimitDTO;

/* loaded from: classes11.dex */
public final class h implements com.stockbit.repository.interactor.helper.b {
    public h() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((OrderCountLimitDTO) r1);
    }

    public com.stockbit.domain.model.securities.common.i b(OrderCountLimitDTO r6) {
        if (r6 == null) goto L20;
        OrderCountLimitDTO.SoftLimit r2 = r6.b();
        int r3 = Integer.MAX_VALUE;
        if (r2 == null) goto L8;
        Integer r22 = r2.a();
        if (r22 == null) goto L8;
        int r23 = r22.intValue();
    L9:
        OrderCountLimitDTO.SoftLimit r4 = r6.b();
        if (r4 == null) goto L14;
        Integer r42 = r4.b();
        if (r42 == null) goto L14;
        int r43 = r42.intValue();
    L15:
        i.a r1 = new i.a(r23, r43);
        Integer r24 = r6.a();
        if (r24 == null) goto L19;
        r3 = r24.intValue();
    L19:
        return new com.stockbit.domain.model.securities.common.i(r1, r3, com.stockbit.repository.interactor.helper.d.b(r6.d()), com.stockbit.repository.interactor.helper.d.b(r6.c()));
    L14:
        r43 = Integer.MAX_VALUE;
    L8:
        r23 = Integer.MAX_VALUE;
        goto L9
    L20:
        return null;
    }
}
