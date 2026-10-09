package com.bumptech.glide.load.engine;

import com.bumptech.glide.util.pool.a;

/* loaded from: classes4.dex */
public final class r implements s, a.f {

    /* renamed from: e, reason: collision with root package name */
    public static final androidx.core.util.e f32867e = null;

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.util.pool.c f32868a;

    /* renamed from: b, reason: collision with root package name */
    public s f32869b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32870c;
    public boolean d;

    public class a implements a.d {
        public a() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        public /* bridge */ /* synthetic */ Object a() {
            return b();
        }

        public r b() {
            return new r();
        }
    }

    static {
        f32867e = com.bumptech.glide.util.pool.a.d(20, new a());
    }

    public r() {
        this.f32868a = com.bumptech.glide.util.pool.c.a();
    }

    public static r c(s r1) {
        r r02 = (r) com.bumptech.glide.util.k.d((r) f32867e.acquire());
        r02.b(r1);
        return r02;
    }

    private void d() {
        this.f32869b = null;
        f32867e.a(this);
    }

    @Override // com.bumptech.glide.load.engine.s
    public Class a() {
        return this.f32869b.a();
    }

    public final void b(s r2) {
        this.d = false;
        this.f32870c = true;
        this.f32869b = r2;
    }

    public synchronized void e() {
        monitor-enter(this);
        this.f32868a.c();     // Catch: Throwable -> L9
        if (this.f32870c == false) goto L14;
        this.f32870c = false;     // Catch: Throwable -> L9
        if (this.d == false) goto L11;
        recycle();     // Catch: Throwable -> L9
    L11:
        monitor-exit(this);
        return;
    L14:
        throw new IllegalStateException("Already unlocked");     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    @Override // com.bumptech.glide.util.pool.a.f
    public com.bumptech.glide.util.pool.c g() {
        return this.f32868a;
    }

    @Override // com.bumptech.glide.load.engine.s
    public Object get() {
        return this.f32869b.get();
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return this.f32869b.getSize();
    }

    @Override // com.bumptech.glide.load.engine.s
    public synchronized void recycle() {
        monitor-enter(this);
        this.f32868a.c();     // Catch: Throwable -> L7
        this.d = true;     // Catch: Throwable -> L7
        if (this.f32870c == true) goto L9;
        this.f32869b.recycle();     // Catch: Throwable -> L7
        d();     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
