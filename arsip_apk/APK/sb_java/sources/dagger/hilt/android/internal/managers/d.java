package dagger.hilt.android.internal.managers;

/* loaded from: classes2.dex */
public final class d implements dagger.hilt.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f173964a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f173965b;

    /* renamed from: c, reason: collision with root package name */
    public final f f173966c;

    public d(f r2) {
        this.f173965b = new Object();
        this.f173966c = r2;
    }

    @Override // dagger.hilt.internal.b
    public Object L2() {
        if (this.f173964a != null) goto L16;
        Object r02 = this.f173965b;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (this.f173964a != null) goto L11;
        this.f173964a = this.f173966c.get();     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
    L16:
        return this.f173964a;
    }
}
