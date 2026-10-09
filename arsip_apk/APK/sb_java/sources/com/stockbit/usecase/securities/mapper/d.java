package com.stockbit.usecase.securities.mapper;

/* loaded from: classes2.dex */
public abstract class d {
    public static final com.stockbit.usecase.securities.model.account.b a(com.stockbit.domain.model.user.d r9) {
        if (r9 == null) goto L6;
        return new com.stockbit.usecase.securities.model.account.b(r9.e(), String.valueOf(r9.f()), r9.c());
    L6:
        return new com.stockbit.usecase.securities.model.account.b(null, null, null, 7, null);
    }
}
