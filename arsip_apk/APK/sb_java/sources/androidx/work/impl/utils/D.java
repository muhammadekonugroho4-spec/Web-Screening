package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class D implements androidx.work.impl.utils.taskexecutor.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f29544a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f29545b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f29546c;
    public final Object d;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final D f29547a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f29548b;

        public a(D r1, Runnable r2) {
            this.f29547a = r1;
            this.f29548b = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29548b.run();     // Catch: Throwable -> L11
            Object r02 = this.f29547a.d;
            monitor-enter(r02);
            this.f29547a.a();     // Catch: Throwable -> L8
            monitor-exit(r02);     // Catch: Throwable -> L8
            return;
        L8:
            th = move-exception;
            throw th;
        L11:
            th = move-exception;
            monitor-enter(this.f29547a.d);
            this.f29547a.a();     // Catch: Throwable -> L17
            throw th;
        L17:
            th = move-exception;
            throw th;
        }
    }

    public D(Executor r1) {
        this.f29545b = r1;
        this.f29544a = new ArrayDeque();
        this.d = new Object();
    }

    public void a() {
        Runnable r02 = (Runnable) this.f29544a.poll();
        this.f29546c = r02;
        if (r02 == null) goto L6;
        this.f29545b.execute(r02);
        return;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r4) {
        Object r02 = this.d;
        monitor-enter(r02);
        this.f29544a.add(new a(this, r4));     // Catch: Throwable -> L7
        if (this.f29546c != null) goto L9;
        a();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.work.impl.utils.taskexecutor.a
    public boolean g0() {
        Object r02 = this.d;
        monitor-enter(r02);
        boolean r1 = !this.f29544a.isEmpty();
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }
}
