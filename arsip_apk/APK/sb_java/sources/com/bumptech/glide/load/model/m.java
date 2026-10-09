package com.bumptech.glide.load.model;

import java.util.Queue;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.util.h f32949a;

    public class a extends com.bumptech.glide.util.h {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m f32950e;

        public a(m r1, long r2) {
            this.f32950e = r1;
            super(r2);
        }

        @Override // com.bumptech.glide.util.h
        public /* bridge */ /* synthetic */ void j(Object r1, Object r2) {
            n((b) r1, r2);
        }

        public void n(b r1, Object r2) {
            r1.c();
        }
    }

    public static final class b {
        public static final Queue d = null;

        /* renamed from: a, reason: collision with root package name */
        public int f32951a;

        /* renamed from: b, reason: collision with root package name */
        public int f32952b;

        /* renamed from: c, reason: collision with root package name */
        public Object f32953c;

        static {
            d = com.bumptech.glide.util.l.f(0);
        }

        public b() {
        }

        public static b a(Object r2, int r3, int r4) {
            Queue r02 = d;
            monitor-enter(r02);
            b r1 = (b) r02.poll();     // Catch: Throwable -> L10
            monitor-exit(r02);     // Catch: Throwable -> L10
            if (r1 != null) goto L8;
            r1 = new b();
        L8:
            r1.b(r2, r3, r4);
            return r1;
        L10:
            th = move-exception;
            throw th;
        }

        public final void b(Object r1, int r2, int r3) {
            this.f32953c = r1;
            this.f32952b = r2;
            this.f32951a = r3;
        }

        public void c() {
            Queue r02 = d;
            monitor-enter(r02);
            r02.offer(this);     // Catch: Throwable -> L7
            monitor-exit(r02);     // Catch: Throwable -> L7
            return;
        L7:
            th = move-exception;
            throw th;
        }

        public boolean equals(Object r4) {
            if ((r4 instanceof b) == false) goto L12;
            b r42 = (b) r4;
            if (this.f32952b != r42.f32952b) goto L12;
            if (this.f32951a != r42.f32951a) goto L12;
            if (this.f32953c.equals(r42.f32953c) == false) goto L12;
            return true;
        L12:
            return false;
        }

        public int hashCode() {
            return (((this.f32951a * 31) + this.f32952b) * 31) + this.f32953c.hashCode();
        }
    }

    public m(long r2) {
        this.f32949a = new a(this, r2);
    }

    public Object a(Object r1, int r2, int r3) {
        b r12 = b.a(r1, r2, r3);
        Object r22 = this.f32949a.g(r12);
        r12.c();
        return r22;
    }

    public void b(Object r1, int r2, int r3, Object r4) {
        b r12 = b.a(r1, r2, r3);
        this.f32949a.k(r12, r4);
    }
}
