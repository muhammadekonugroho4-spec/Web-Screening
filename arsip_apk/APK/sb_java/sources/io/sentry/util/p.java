package io.sentry.util;

import io.sentry.InterfaceC11576d0;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f176879a;

    /* renamed from: b, reason: collision with root package name */
    public final a f176880b;

    /* renamed from: c, reason: collision with root package name */
    public final AutoClosableReentrantLock f176881c;

    public interface a {
        Object a();
    }

    public p(a r2) {
        this.f176879a = null;
        this.f176881c = new AutoClosableReentrantLock();
        this.f176880b = r2;
    }

    public Object a() {
        if (this.f176879a != null) goto L20;
        InterfaceC11576d0 r02 = this.f176881c.a();
    L9:
        th = move-exception;
        if (r02 != null) goto L21;
    L18:
        throw th;
    L21:
        r02.close();     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        th.addSuppressed(th);
        goto L18
    L6:
        if (this.f176879a != null) goto L11;
        this.f176879a = this.f176880b.a();     // Catch: Throwable -> L9
    L11:
        if (r02 == null) goto L20;
        r02.close();
    L20:
        return this.f176879a;
    }

    public void b() {
        InterfaceC11576d0 r02 = this.f176881c.a();
        this.f176879a = null;     // Catch: Throwable -> L7
        if (r02 == null) goto L18;
        r02.close();
        return;
    L18:
        return;
    L7:
        th = move-exception;
        if (r02 != null) goto L14;
    L13:
        throw th;
    L14:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    public void c(Object r2) {
        InterfaceC11576d0 r02 = this.f176881c.a();
        this.f176879a = r2;     // Catch: Throwable -> L7
        if (r02 == null) goto L18;
        r02.close();
        return;
    L18:
        return;
    L7:
        th = move-exception;
        if (r02 != null) goto L14;
    L13:
        throw th;
    L14:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }
}
