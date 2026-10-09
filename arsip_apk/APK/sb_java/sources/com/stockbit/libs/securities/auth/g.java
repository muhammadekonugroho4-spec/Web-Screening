package com.stockbit.libs.securities.auth;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f120715a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f120716b;

    public g() {
        this.f120715a = new AtomicReference(i.f120718a);
        this.f120716b = new AtomicBoolean(false);
    }

    public final boolean a() {
        return p.g(this.f120715a.get(), h.f120717a);
    }

    public final boolean b() {
        return p.g(this.f120715a.get(), j.f120719a);
    }

    public final void c() {
        this.f120715a.set(h.f120717a);
        this.f120716b.set(true);
    }

    public final void d() {
        if (p.g(this.f120715a.get(), h.f120717a) == false) goto L6;
        this.f120716b.set(true);
        return;
    }

    public final void e() {
        this.f120715a.set(i.f120718a);
        this.f120716b.set(false);
    }

    public final void f() {
        if (androidx.camera.view.i.a(this.f120715a, h.f120717a, i.f120718a) == false) goto L6;
        this.f120716b.set(false);
        return;
    }

    public final void g() {
        androidx.camera.view.i.a(this.f120715a, j.f120719a, i.f120718a);
    }

    public final boolean h() {
        return androidx.camera.view.i.a(this.f120715a, i.f120718a, j.f120719a);
    }

    public final boolean i() {
        if (p.g(this.f120715a.get(), h.f120717a) == true) goto L5;
    L7:
        return false;
    L5:
        if (this.f120716b.compareAndSet(true, false) == false) goto L7;
        return true;
    }
}
