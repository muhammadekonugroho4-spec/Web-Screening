package com.stockbit.domain.model.mapper.calendar;

import com.stockbit.model.entity.IpoDataDetail;

/* loaded from: classes8.dex */
public final class d implements com.stockbit.domain.model.mapper.base.a {
    public d() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return c((IpoDataDetail) r1);
    }

    public final com.stockbit.domain.model.entity.calendar.h b(IpoDataDetail r6) {
        String r1 = r6.c();
        String r2 = "";
        if (r1 != null) goto L5;
        r1 = "";
    L5:
        String r3 = r6.d();
        if (r3 != null) goto L8;
        r3 = "";
    L8:
        String r4 = r6.b();
        if (r4 != null) goto L11;
        r4 = "";
    L11:
        String r62 = r6.a();
        if (r62 == null) goto L16;
        r2 = r62;
    L16:
        return new com.stockbit.domain.model.entity.calendar.h(r1, r3, r4, r2);
    }

    public com.stockbit.domain.model.entity.calendar.h c(IpoDataDetail r8) {
        if (r8 != null) goto L6;
        return new com.stockbit.domain.model.entity.calendar.h(null, null, null, null, 15, null);
    L6:
        return b(r8);
    }
}
