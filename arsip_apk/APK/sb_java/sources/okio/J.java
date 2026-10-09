package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class J {

    /* renamed from: e, reason: collision with root package name */
    public static final b f182327e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final J f182328f = null;

    /* renamed from: a, reason: collision with root package name */
    public boolean f182329a;

    /* renamed from: b, reason: collision with root package name */
    public long f182330b;

    /* renamed from: c, reason: collision with root package name */
    public long f182331c;
    public volatile Object d;

    public static final class a extends J {
        public a() {
        }

        @Override // okio.J
        public J d(long r1) {
            return this;
        }

        @Override // okio.J
        public void f() {
        }

        @Override // okio.J
        public J g(long r1, TimeUnit r3) {
            kotlin.jvm.internal.p.l(r3, "unit");
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final long a(long r4, long r6) {
            if (r4 != 0) goto L6;
        L11:
            return r6;
        L6:
            if (r6 != 0) goto L9;
        L10:
            return r4;
        L9:
            if (r4 >= r6) goto L11;
            goto L10
        }

        public b() {
        }
    }

    static {
        f182327e = new b(null);
        f182328f = new a();
    }

    public J() {
    }

    public J a() {
        this.f182329a = false;
        return this;
    }

    public J b() {
        this.f182331c = 0;
        return this;
    }

    public long c() {
        if (this.f182329a == false) goto L7;
        return this.f182330b;
    L7:
        throw new IllegalStateException("No deadline");
    }

    public J d(long r2) {
        this.f182329a = true;
        this.f182330b = r2;
        return this;
    }

    public boolean e() {
        return this.f182329a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted() == true) goto L13;
        if (this.f182329a == true) goto L7;
        return;
    L7:
        if ((this.f182330b - System.nanoTime()) <= 0) goto L10;
        return;
    L10:
        throw new InterruptedIOException("deadline reached");
    L13:
        throw new InterruptedIOException("interrupted");
    }

    public J g(long r3, TimeUnit r5) {
        kotlin.jvm.internal.p.l(r5, "unit");
        if (r3 < 0) goto L7;
        this.f182331c = r5.toNanos(r3);
        return this;
    L7:
        throw new IllegalArgumentException(("timeout < 0: " + r3).toString());
    }

    public long h() {
        return this.f182331c;
    }

    public void i(Object r12) {
        kotlin.jvm.internal.p.l(r12, "monitor");
        boolean r02 = e();     // Catch: InterruptedException -> L29
        long r1 = h();     // Catch: InterruptedException -> L29
        if (r02 == false) goto L6;
    L9:
        long r5 = System.nanoTime();     // Catch: InterruptedException -> L29
        if (r02 == true) goto L12;
    L14:
        if (r02 == true) goto L16;
    L18:
        if (r1 <= 0) goto L28;
        Object r03 = this.d;     // Catch: InterruptedException -> L29
        long r9 = r1 / 1000000;     // Catch: InterruptedException -> L29
        r12.wait(r9, (int) (r1 - (1000000 * r9)));     // Catch: InterruptedException -> L29
        if ((System.nanoTime() - r5) >= r1) goto L23;
        return;
    L23:
        if (this.d == r03) goto L26;
        return;
    L26:
        throw new InterruptedIOException("timeout");     // Catch: InterruptedException -> L29
    L28:
        throw new InterruptedIOException("timeout");     // Catch: InterruptedException -> L29
    L16:
        r1 = c() - r5;
        goto L18
    L12:
        if (r1 == 0) goto L14;
        r1 = Math.min(r1, c() - r5);     // Catch: InterruptedException -> L29
        goto L18
    L6:
        if (r1 != 0) goto L9;
        r12.wait();     // Catch: InterruptedException -> L29
        return;
    L29:
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }
}
