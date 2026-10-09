package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.k;
import com.bumptech.glide.util.l;
import com.bumptech.glide.util.pool.a;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.util.h f32740a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.core.util.e f32741b;

    public class a implements a.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f32742a;

        public a(j r1) {
            this.f32742a = r1;
        }

        @Override // com.bumptech.glide.util.pool.a.d
        public /* bridge */ /* synthetic */ Object a() {
            return b();
        }

        public b b() {
            return new b(MessageDigest.getInstance("SHA-256"));
        L4:
            e = move-exception;
            throw new RuntimeException(e);
        }
    }

    public static final class b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final MessageDigest f32743a;

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.util.pool.c f32744b;

        public b(MessageDigest r2) {
            this.f32744b = com.bumptech.glide.util.pool.c.a();
            this.f32743a = r2;
        }

        @Override // com.bumptech.glide.util.pool.a.f
        public com.bumptech.glide.util.pool.c g() {
            return this.f32744b;
        }
    }

    public j() {
        this.f32740a = new com.bumptech.glide.util.h(1000);
        this.f32741b = com.bumptech.glide.util.pool.a.d(10, new a(this));
    }

    public final String a(com.bumptech.glide.load.c r3) {
        b r02 = (b) k.d(this.f32741b.acquire());
        r3.b(r02.f32743a);     // Catch: Throwable -> L6
        String r32 = l.x(r02.f32743a.digest());     // Catch: Throwable -> L6
        this.f32741b.a(r02);
        return r32;
    L6:
        th = move-exception;
        this.f32741b.a(r02);
        throw th;
    }

    public String b(com.bumptech.glide.load.c r4) {
        com.bumptech.glide.util.h r02 = this.f32740a;
        monitor-enter(r02);
        String r1 = (String) this.f32740a.g(r4);     // Catch: Throwable -> L16
        monitor-exit(r02);     // Catch: Throwable -> L16
        if (r1 != null) goto L8;
        r1 = a(r4);
    L8:
        com.bumptech.glide.util.h r2 = this.f32740a;
        monitor-enter(r2);
        this.f32740a.k(r4, r1);     // Catch: Throwable -> L13
        monitor-exit(r2);     // Catch: Throwable -> L13
        return r1;
    L13:
        th = move-exception;
        throw th;
    L16:
        th = move-exception;
        throw th;
    }
}
