package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f3693c;
    public static final Executor d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f3694e = null;

    /* renamed from: a, reason: collision with root package name */
    public e f3695a;

    /* renamed from: b, reason: collision with root package name */
    public final e f3696b;

    static {
        d = new a();
        f3694e = new b();
    }

    public c() {
        d r02 = new d();
        this.f3696b = r02;
        this.f3695a = r02;
    }

    public static /* synthetic */ void e(Runnable r1) {
        h().d(r1);
    }

    public static /* synthetic */ void f(Runnable r1) {
        h().a(r1);
    }

    public static Executor g() {
        return f3694e;
    }

    public static c h() {
        if (f3693c == null) goto L7;
        return f3693c;
    L7:
        monitor-enter(c.class);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (f3693c != null) goto L13;
        f3693c = new c();     // Catch: Throwable -> L11
    L13:
        monitor-exit(c.class);     // Catch: Throwable -> L11
        return f3693c;
    }

    public static Executor i() {
        return d;
    }

    @Override // androidx.arch.core.executor.e
    public void a(Runnable r2) {
        this.f3695a.a(r2);
    }

    @Override // androidx.arch.core.executor.e
    public boolean c() {
        return this.f3695a.c();
    }

    @Override // androidx.arch.core.executor.e
    public void d(Runnable r2) {
        this.f3695a.d(r2);
    }
}
