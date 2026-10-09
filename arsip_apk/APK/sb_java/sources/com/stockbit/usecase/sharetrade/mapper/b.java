package com.stockbit.usecase.sharetrade.mapper;

/* loaded from: classes2.dex */
public final class b {
    public b() {
    }

    public com.stockbit.usecase.sharetrade.model.b a(com.stockbit.domain.model.sharetrade.b r4) {
        int r1 = 0;
        if (r4 == null) goto L7;
        Boolean r2 = r4.a();
        if (r2 == null) goto L7;
        boolean r22 = r2.booleanValue();
    L8:
        if (r4 == null) goto L13;
        Integer r42 = r4.b();
        if (r42 == null) goto L13;
        r1 = r42.intValue();
    L13:
        return new com.stockbit.usecase.sharetrade.model.b(r22, r1);
    L7:
        r22 = false;
        goto L8
    }
}
