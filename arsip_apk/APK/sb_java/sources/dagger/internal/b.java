package dagger.internal;

/* loaded from: classes2.dex */
public final class b implements h, dagger.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f173980c = null;

    /* renamed from: a, reason: collision with root package name */
    public volatile h f173981a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f173982b;

    static {
        f173980c = new Object();
    }

    public b(h r2) {
        this.f173982b = f173980c;
        this.f173981a = r2;
    }

    public static dagger.a b(h r1) {
        if ((r1 instanceof dagger.a) == false) goto L7;
        return (dagger.a) r1;
    L7:
        return new b((h) g.b(r1));
    }

    public static dagger.a c(javax.inject.a r02) {
        return b(i.a(r02));
    }

    public static h d(h r1) {
        g.b(r1);
        if ((r1 instanceof b) == false) goto L6;
        return r1;
    L6:
        return new b(r1);
    }

    public static javax.inject.a e(javax.inject.a r02) {
        return d(i.a(r02));
    }

    public static Object f(Object r3, Object r4) {
        if (r3 == f173980c) goto L8;
        if (r3 != r4) goto L7;
        return r4;
    L7:
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + r3 + " & " + r4 + ". This is likely due to a circular dependency.");
    L8:
        return r4;
    }

    public final synchronized Object a() {
        monitor-enter(this);
        Object r02 = this.f173982b;     // Catch: Throwable -> L7
        if (r02 != f173980c) goto L9;
        r02 = this.f173981a.get();     // Catch: Throwable -> L7
        this.f173982b = f(this.f173982b, r02);     // Catch: Throwable -> L7
        this.f173981a = null;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return r02;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // javax.inject.a
    public Object get() {
        Object r02 = this.f173982b;
        if (r02 == f173980c) goto L5;
        return r02;
    L5:
        return a();
    }
}
