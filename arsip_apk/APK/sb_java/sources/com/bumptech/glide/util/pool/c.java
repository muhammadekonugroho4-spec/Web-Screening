package com.bumptech.glide.util.pool;

/* loaded from: classes4.dex */
public abstract class c {

    public static /* synthetic */ class a {
    }

    public static class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f33408a;

        public b() {
            super(null);
        }

        @Override // com.bumptech.glide.util.pool.c
        public void b(boolean r1) {
            this.f33408a = r1;
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
            if (this.f33408a == true) goto L6;
            return;
        L6:
            throw new IllegalStateException("Already released");
        }
    }

    public /* synthetic */ c(a r1) {
        this();
    }

    public static c a() {
        return new b();
    }

    public abstract void b(boolean r1);

    public abstract void c();

    public c() {
    }
}
