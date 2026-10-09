package com.stockbit.usecase.crisp;

import kotlin.coroutines.e;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.data.repositories.crisp.a f157055a;

    public b(com.data.repositories.crisp.a r2) {
        p.l(r2, "crispRepository");
        this.f157055a = r2;
    }

    public final Object a(String r2, e r3) {
        return this.f157055a.b(r2, r3);
    }
}
