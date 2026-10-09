package androidx.room.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.p;
import kotlin.w;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.a f27800a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f27801b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f27802c;

    public a(kotlin.jvm.functions.a r2) {
        p.l(r2, "closeAction");
        this.f27800a = r2;
        this.f27801b = new AtomicInteger(0);
        this.f27802c = new AtomicBoolean(false);
    }

    public final boolean a() {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (b() == false) goto L8;
        monitor-exit(this);
        return false;
    L8:
        this.f27801b.incrementAndGet();     // Catch: Throwable -> L12
        monitor-exit(this);
        return true;
    }

    public final boolean b() {
        return this.f27802c.get();
    }

    public final void c() {
        monitor-enter(this);
        this.f27801b.decrementAndGet();     // Catch: Throwable -> L8
        if (this.f27801b.get() < 0) goto L11;
        w r02 = w.f180450a;     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L11:
        throw new IllegalStateException("Unbalanced call to unblock() detected.");     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }
}
