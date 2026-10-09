package androidx.compose.ui.tooling;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f20412a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20413b;

    static {
    }

    public F() {
        this.f20413b = new Object();
    }

    public final void a(Throwable r2) {
        Object r02 = this.f20413b;
        monitor-enter(r02);
        this.f20412a = r2;     // Catch: Throwable -> L7
        kotlin.w r22 = kotlin.w.f180450a;     // Catch: Throwable -> L7
        monitor-exit(r02);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void b() {
        Object r02 = this.f20413b;
        monitor-enter(r02);
        Throwable r1 = this.f20412a;     // Catch: Throwable -> L11
        if (r1 != null) goto L9;
        monitor-exit(r02);
        return;
    L9:
        this.f20412a = null;     // Catch: Throwable -> L11
        throw r1;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }
}
