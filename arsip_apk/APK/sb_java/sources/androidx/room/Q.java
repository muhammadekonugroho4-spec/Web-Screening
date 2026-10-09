package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class Q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f27709a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f27710b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f27711c;
    public final Object d;

    public Q(Executor r2) {
        kotlin.jvm.internal.p.l(r2, "executor");
        this.f27709a = r2;
        this.f27710b = new ArrayDeque();
        this.d = new Object();
    }

    public static /* synthetic */ void a(Runnable r02, Q r1) {
        b(r02, r1);
    }

    public static final void b(Runnable r02, Q r1) {
        r02.run();     // Catch: Throwable -> L5
        r1.c();
        return;
    L5:
        th = move-exception;
        r1.c();
        throw th;
    }

    public final void c() {
        Object r02 = this.d;
        monitor-enter(r02);
        Object r1 = this.f27710b.poll();     // Catch: Throwable -> L7
        Runnable r2 = (Runnable) r1;     // Catch: Throwable -> L7
        this.f27711c = r2;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        this.f27709a.execute(r2);     // Catch: Throwable -> L7
    L9:
        kotlin.w r12 = kotlin.w.f180450a;     // Catch: Throwable -> L7
        monitor-exit(r02);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable r4) {
        kotlin.jvm.internal.p.l(r4, "command");
        Object r02 = this.d;
        monitor-enter(r02);
        this.f27710b.offer(new P(r4, this));     // Catch: Throwable -> L7
        if (this.f27711c != null) goto L9;
        c();     // Catch: Throwable -> L7
    L9:
        kotlin.w r42 = kotlin.w.f180450a;     // Catch: Throwable -> L7
        monitor-exit(r02);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
