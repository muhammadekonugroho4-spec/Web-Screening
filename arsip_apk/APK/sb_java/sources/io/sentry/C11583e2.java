package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;

/* renamed from: io.sentry.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11583e2 {
    public static final C11583e2 d = null;

    /* renamed from: a, reason: collision with root package name */
    public boolean f176216a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f176217b;

    /* renamed from: c, reason: collision with root package name */
    public final AutoClosableReentrantLock f176218c;

    static {
        d = new C11583e2();
    }

    public C11583e2() {
        this.f176218c = new AutoClosableReentrantLock();
    }

    public static C11583e2 a() {
        return d;
    }

    public void b() {
        InterfaceC11576d0 r02 = this.f176218c.a();
        this.f176216a = false;     // Catch: Throwable -> L7
        this.f176217b = null;     // Catch: Throwable -> L7
        if (r02 == null) goto L18;
        r02.close();
        return;
    L18:
        return;
    L7:
        th = move-exception;
        if (r02 != null) goto L16;
    L13:
        throw th;
    L16:
        r02.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    public void c(boolean r3) {
        InterfaceC11576d0 r02 = this.f176218c.a();
    L7:
        th = move-exception;
        if (r02 != null) goto L18;
    L17:
        throw th;
    L18:
        r02.close();     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        th.addSuppressed(th);
        goto L17
    L4:
        if (this.f176216a == true) goto L9;
        this.f176217b = Boolean.valueOf(r3);     // Catch: Throwable -> L7
        this.f176216a = true;     // Catch: Throwable -> L7
    L9:
        if (r02 == null) goto L22;
        r02.close();
        return;
    }
}
