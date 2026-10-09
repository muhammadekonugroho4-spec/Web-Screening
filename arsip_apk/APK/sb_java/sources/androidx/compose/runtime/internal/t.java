package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f16347a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16348b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16349c;

    static {
    }

    public t() {
        this.f16347a = new AtomicReference(u.a());
        this.f16348b = new Object();
    }

    public final Object a() {
        long r02 = y.a();
        if (r02 != x.a()) goto L7;
        return this.f16349c;
    L7:
        return ((w) this.f16347a.get()).b(r02);
    }

    public final void b(Object r6) {
        long r02 = y.a();
        if (r02 != x.a()) goto L6;
        this.f16349c = r6;
        return;
    L6:
        Object r2 = this.f16348b;
        monitor-enter(r2);
        w r3 = (w) this.f16347a.get();     // Catch: Throwable -> L15
        if (r3.d(r02, r6) == false) goto L12;
        monitor-exit(r2);
        return;
    L12:
        this.f16347a.set(r3.c(r02, r6));     // Catch: Throwable -> L15
        kotlin.w r62 = kotlin.w.f180450a;     // Catch: Throwable -> L15
        monitor-exit(r2);
        return;
    L15:
        th = move-exception;
        throw th;
    }
}
