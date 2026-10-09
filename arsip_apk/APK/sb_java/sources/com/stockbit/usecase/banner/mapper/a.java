package com.stockbit.usecase.banner.mapper;

/* loaded from: classes7.dex */
public final class a {
    public a() {
    }

    public com.stockbit.usecase.banner.model.a a(com.stockbit.domain.model.banner.a r5) {
        String r1 = null;
        if (r5 == null) goto L5;
        String r2 = r5.b();
    L6:
        String r3 = "";
        if (r2 != null) goto L9;
        r2 = "";
    L9:
        if (r5 == null) goto L11;
        r1 = r5.a();
    L11:
        if (r1 == null) goto L15;
        r3 = r1;
    L15:
        return new com.stockbit.usecase.banner.model.a(r2, r3);
    L5:
        r2 = null;
        goto L6
    }
}
