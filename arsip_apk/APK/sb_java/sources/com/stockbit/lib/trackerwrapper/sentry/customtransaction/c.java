package com.stockbit.lib.trackerwrapper.sentry.customtransaction;

import io.sentry.InterfaceC11591g0;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f120636a;

    /* renamed from: b, reason: collision with root package name */
    public final b f120637b;

    public c(String r2, b r3) {
        p.l(r2, "transactionId");
        p.l(r3, "manager");
        this.f120636a = r2;
        this.f120637b = r3;
    }

    public final InterfaceC11591g0 a(String r3, String r4) {
        p.l(r3, "operation");
        p.l(r4, "description");
        return this.f120637b.a(this.f120636a, r3, r4);
    }

    public final void b() {
        this.f120637b.b(this.f120636a);
    }

    public final void c() {
        this.f120637b.c(this.f120636a);
    }

    public final void d() {
        this.f120637b.f(this.f120636a);
    }

    public final void e(InterfaceC11591g0 r7) {
        b.e(this.f120637b, this.f120636a, r7, null, 4, null);
    }

    public final void f() {
        this.f120637b.i(this.f120636a);
    }
}
