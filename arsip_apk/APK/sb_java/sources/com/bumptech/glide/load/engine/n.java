package com.bumptech.glide.load.engine;

/* loaded from: classes4.dex */
public class n implements s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32856a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32857b;

    /* renamed from: c, reason: collision with root package name */
    public final s f32858c;
    public final a d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.c f32859e;

    /* renamed from: f, reason: collision with root package name */
    public int f32860f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32861g;

    public interface a {
        void c(com.bumptech.glide.load.c r1, n r2);
    }

    public n(s r1, boolean r2, boolean r3, com.bumptech.glide.load.c r4, a r5) {
        this.f32858c = (s) com.bumptech.glide.util.k.d(r1);
        this.f32856a = r2;
        this.f32857b = r3;
        this.f32859e = r4;
        this.d = (a) com.bumptech.glide.util.k.d(r5);
    }

    @Override // com.bumptech.glide.load.engine.s
    public Class a() {
        return this.f32858c.a();
    }

    public synchronized void b() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f32861g == true) goto L11;
        this.f32860f++;
        monitor-exit(this);
        return;
    L11:
        throw new IllegalStateException("Cannot acquire a recycled resource");     // Catch: Throwable -> L8
    }

    public s c() {
        return this.f32858c;
    }

    public boolean d() {
        return this.f32856a;
    }

    public void e() {
        monitor-enter(this);
        int r02 = this.f32860f;     // Catch: Throwable -> L13
        if (r02 <= 0) goto L16;
        boolean r1 = true;
        int r03 = r02 - 1;     // Catch: Throwable -> L13
        this.f32860f = r03;     // Catch: Throwable -> L13
        if (r03 == 0) goto L9;
        r1 = false;
    L9:
        monitor-exit(this);     // Catch: Throwable -> L13
        if (r1 == false) goto L20;
        this.d.c(this.f32859e, this);
        return;
    L20:
        return;
    L16:
        throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.load.engine.s
    public Object get() {
        return this.f32858c.get();
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return this.f32858c.getSize();
    }

    @Override // com.bumptech.glide.load.engine.s
    public synchronized void recycle() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.f32860f > 0) goto L18;
        if (this.f32861g == true) goto L16;
        this.f32861g = true;     // Catch: Throwable -> L11
        if (this.f32857b == false) goto L13;
        this.f32858c.recycle();     // Catch: Throwable -> L11
    L13:
        monitor-exit(this);
        return;
    L16:
        throw new IllegalStateException("Cannot recycle a resource that has already been recycled");     // Catch: Throwable -> L11
    L18:
        throw new IllegalStateException("Cannot recycle a resource while it is still acquired");     // Catch: Throwable -> L11
    }

    public synchronized String toString() {
        monitor-enter(this);
        String r02 = "EngineResource{isMemoryCacheable=" + this.f32856a + ", listener=" + this.d + ", key=" + this.f32859e + ", acquired=" + this.f32860f + ", isRecycled=" + this.f32861g + ", resource=" + this.f32858c + '}';     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }
}
