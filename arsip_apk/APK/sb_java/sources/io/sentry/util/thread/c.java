package io.sentry.util.thread;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f176889a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final c f176890b = null;

    static {
        f176889a = Thread.currentThread().getId();
        f176890b = new c();
    }

    public c() {
    }

    public static c d() {
        return f176890b;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return f(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    public String b() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Thread.currentThread().getId();
    }

    public boolean e(long r3) {
        if (f176889a != r3) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean f(Thread r3) {
        return e(r3.getId());
    }
}
