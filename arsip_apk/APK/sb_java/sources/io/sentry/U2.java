package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class U2 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile U2 f174995c;
    public static final AutoClosableReentrantLock d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Boolean f174996e;

    /* renamed from: f, reason: collision with root package name */
    public static final AutoClosableReentrantLock f174997f = null;

    /* renamed from: a, reason: collision with root package name */
    public final Set f174998a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f174999b;

    static {
        d = new AutoClosableReentrantLock();
        f174996e = null;
        f174997f = new AutoClosableReentrantLock();
    }

    public U2() {
        this.f174998a = new CopyOnWriteArraySet();
        this.f174999b = new CopyOnWriteArraySet();
    }

    public static U2 d() {
        if (f174995c != null) goto L20;
        InterfaceC11576d0 r02 = d.a();
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
        if (f174995c != null) goto L11;
        f174995c = new U2();     // Catch: Throwable -> L9
    L11:
        if (r02 == null) goto L20;
        r02.close();
    L20:
        return f174995c;
    }

    public void a(String r2) {
        io.sentry.util.v.c(r2, "integration is required.");
        this.f174998a.add(r2);
    }

    public void b(String r2, String r3) {
        io.sentry.util.v.c(r2, "name is required.");
        io.sentry.util.v.c(r3, "version is required.");
        io.sentry.protocol.x r02 = new io.sentry.protocol.x(r2, r3);
        this.f174999b.add(r02);
        InterfaceC11576d0 r22 = f174997f.a();
        f174996e = null;     // Catch: Throwable -> L7
        if (r22 == null) goto L18;
        r22.close();
        return;
    L18:
        return;
    L7:
        th = move-exception;
        if (r22 != null) goto L16;
    L13:
        throw th;
    L16:
        r22.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    public boolean c(Q r10) {
        Boolean r2 = f174996e;
        if (r2 != null) goto L5;
        InterfaceC11576d0 r22 = f174997f.a();
        Iterator r3 = this.f174999b.iterator();     // Catch: Throwable -> L15
        boolean r5 = false;
    L9:
        if (r3.hasNext() == false) goto L17;
        io.sentry.protocol.x r6 = (io.sentry.protocol.x) r3.next();     // Catch: Throwable -> L15
        if (r6.a().startsWith("maven:io.sentry:") == false) goto L9;
        if ("8.34.0".equalsIgnoreCase(r6.b()) == true) goto L9;
        r10.c(SentryLevel.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", new Object[]{r6.a(), "8.34.0", r6.b()});     // Catch: Throwable -> L15
        r5 = true;
        goto L9
    L17:
        if (r5 == false) goto L19;
        SentryLevel r02 = SentryLevel.ERROR;     // Catch: Throwable -> L15
        r10.c(r02, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);     // Catch: Throwable -> L15
        r10.c(r02, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);     // Catch: Throwable -> L15
        r10.c(r02, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);     // Catch: Throwable -> L15
        r10.c(r02, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);     // Catch: Throwable -> L15
    L19:
        f174996e = Boolean.valueOf(r5);     // Catch: Throwable -> L15
        if (r22 == null) goto L22;
        r22.close();
    L22:
        return r5;
    L15:
        th = move-exception;
        if (r22 != null) goto L31;
    L28:
        throw th;
    L31:
        r22.close();     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        th.addSuppressed(th);
        goto L28
    L5:
        return r2.booleanValue();
    }

    public Set e() {
        return this.f174998a;
    }

    public Set f() {
        return this.f174999b;
    }
}
