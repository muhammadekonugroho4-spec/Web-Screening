package com.google.android.play.integrity.internal;

/* loaded from: classes5.dex */
public final class aj implements an {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f38344a = null;

    /* renamed from: b, reason: collision with root package name */
    private volatile an f38345b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f38346c;

    static {
        f38344a = new Object();
    }

    private aj(an r2) {
        this.f38346c = f38344a;
        this.f38345b = r2;
    }

    public static an b(an r1) {
        if ((r1 instanceof aj) == false) goto L6;
        return r1;
    L6:
        return new aj(r1);
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a() {
        Object r02 = this.f38346c;
        Object r1 = f38344a;
        if (r02 != r1) goto L20;
        monitor-enter(this);
        Object r03 = this.f38346c;     // Catch: Throwable -> L13
        if (r03 != r1) goto L16;
        r03 = this.f38345b.a();     // Catch: Throwable -> L13
        Object r2 = this.f38346c;     // Catch: Throwable -> L13
        if (r2 == r1) goto L15;
        if (r2 == r03) goto L15;
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + r2 + " & " + r03 + ". This is likely due to a circular dependency.");     // Catch: Throwable -> L13
    L15:
        this.f38346c = r03;     // Catch: Throwable -> L13
        this.f38345b = null;     // Catch: Throwable -> L13
    L16:
        monitor-exit(this);     // Catch: Throwable -> L13
        return r03;
    L13:
        th = move-exception;
        throw th;
    L20:
        return r02;
    }
}
