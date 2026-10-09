package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: g, reason: collision with root package name */
    public static final long f174792g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final long f174793h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static volatile I f174794i;

    /* renamed from: j, reason: collision with root package name */
    public static final AutoClosableReentrantLock f174795j = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f174796a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f174797b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f174798c;
    public final AtomicBoolean d;

    /* renamed from: e, reason: collision with root package name */
    public final Callable f174799e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f174800f;

    public static /* synthetic */ class a {
    }

    public static final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f174801a;

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r5) {
            StringBuilder r1 = new StringBuilder();
            r1.append("SentryHostnameCache-");
            int r2 = this.f174801a;
            this.f174801a = r2 + 1;
            r1.append(r2);
            Thread r02 = new Thread(r5, r1.toString());
            r02.setDaemon(true);
            return r02;
        }

        public /* synthetic */ b(a r1) {
            this();
        }
    }

    static {
        f174792g = TimeUnit.HOURS.toMillis(5);
        f174793h = TimeUnit.SECONDS.toMillis(1);
        f174795j = new AutoClosableReentrantLock();
    }

    public I() {
        this(f174792g);
    }

    public static /* synthetic */ InetAddress a() {
        return InetAddress.getLocalHost();
    }

    public static /* synthetic */ Void b(I r5) {
        r5.getClass();
        r5.f174797b = ((InetAddress) r5.f174799e.call()).getCanonicalHostName();     // Catch: Throwable -> L6
        r5.f174798c = System.currentTimeMillis() + r5.f174796a;     // Catch: Throwable -> L6
        r5.d.set(false);
        return null;
    L6:
        th = move-exception;
        r5.d.set(false);
        throw th;
    }

    public static I e() {
        if (f174794i != null) goto L20;
        InterfaceC11576d0 r02 = f174795j.a();
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
        if (f174794i != null) goto L11;
        f174794i = new I();     // Catch: Throwable -> L9
    L11:
        if (r02 == null) goto L20;
        r02.close();
    L20:
        return f174794i;
    }

    public void c() {
        this.f174800f.shutdown();
    }

    public String d() {
        if (this.f174798c >= System.currentTimeMillis()) goto L8;
        if (this.d.compareAndSet(false, true) == false) goto L8;
        g();
    L8:
        return this.f174797b;
    }

    public final void f() {
        this.f174798c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1);
    }

    public final void g() {
        Callable r02 = new H(this);
        this.f174800f.submit(r02).get(f174793h, TimeUnit.MILLISECONDS);     // Catch: Throwable -> L5 InterruptedException -> L6
        return;
    L6:
        Thread.currentThread().interrupt();
        f();
        return;
    L5:
        f();
    }

    public I(long r2) {
        this(r2, new G());
    }

    public I(long r3, Callable r5) {
        this.d = new AtomicBoolean(false);
        this.f174800f = Executors.newSingleThreadExecutor(new b(null));
        this.f174796a = r3;
        this.f174799e = (Callable) io.sentry.util.v.c(r5, "getLocalhost is required");
        g();
    }
}
