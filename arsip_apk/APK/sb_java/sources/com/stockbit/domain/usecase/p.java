package com.stockbit.domain.usecase;

import com.stockbit.domain.repository.InterfaceC6882a;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6882a f88115a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.auth.a f88116b;

    public p(InterfaceC6882a r2, com.stockbit.auth.a r3) {
        kotlin.jvm.internal.p.l(r2, "authRepository");
        kotlin.jvm.internal.p.l(r3, "localAuthRepository");
        this.f88115a = r2;
        this.f88116b = r3;
    }

    public final void a() {
        this.f88115a.p(this.f88116b.s());
    }
}
