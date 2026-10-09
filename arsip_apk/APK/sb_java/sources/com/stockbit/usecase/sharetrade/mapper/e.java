package com.stockbit.usecase.sharetrade.mapper;

/* loaded from: classes2.dex */
public final class e {
    public e() {
    }

    public com.stockbit.usecase.sharetrade.model.d a(com.stockbit.domain.model.sharetrade.e r2) {
        if (r2 == null) goto L5;
        String r22 = r2.a();
    L7:
        return new com.stockbit.usecase.sharetrade.model.d(r22);
    L5:
        r22 = null;
        goto L7
    }
}
