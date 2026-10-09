package com.bumptech.glide.util.pool;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f33404a = null;

    /* renamed from: com.bumptech.glide.util.pool.a$a, reason: collision with other inner class name */
    public class C0341a implements g {
        public C0341a() {
        }

        @Override // com.bumptech.glide.util.pool.a.g
        public void a(Object r1) {
        }
    }

    public class b implements d {
        public b() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        public /* bridge */ /* synthetic */ Object a() {
            return b();
        }

        public List b() {
            return new ArrayList();
        }
    }

    public class c implements g {
        public c() {
        }

        @Override // com.bumptech.glide.util.pool.a.g
        public /* bridge */ /* synthetic */ void a(Object r1) {
            b((List) r1);
        }

        public void b(List r1) {
            r1.clear();
        }
    }

    public interface d {
        Object a();
    }

    public static final class e implements androidx.core.util.e {

        /* renamed from: a, reason: collision with root package name */
        public final d f33405a;

        /* renamed from: b, reason: collision with root package name */
        public final g f33406b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.core.util.e f33407c;

        public e(androidx.core.util.e r1, d r2, g r3) {
            this.f33407c = r1;
            this.f33405a = r2;
            this.f33406b = r3;
        }

        @Override // androidx.core.util.e
        public boolean a(Object r3) {
            if ((r3 instanceof f) == false) goto L5;
            ((f) r3).g().b(true);
        L5:
            this.f33406b.a(r3);
            return this.f33407c.a(r3);
        }

        @Override // androidx.core.util.e
        public Object acquire() {
            Object r02 = this.f33407c.acquire();
            if (r02 != null) goto L8;
            r02 = this.f33405a.a();
            if (Log.isLoggable("FactoryPools", 2) == false) goto L8;
            Log.v("FactoryPools", "Created new " + r02.getClass());
        L8:
            if ((r02 instanceof f) == false) goto L10;
            ((f) r02).g().b(false);
        L10:
            return r02;
        }
    }

    public interface f {
        com.bumptech.glide.util.pool.c g();
    }

    public interface g {
        void a(Object r1);
    }

    static {
        f33404a = new C0341a();
    }

    public static androidx.core.util.e a(androidx.core.util.e r1, d r2) {
        return b(r1, r2, c());
    }

    public static androidx.core.util.e b(androidx.core.util.e r1, d r2, g r3) {
        return new e(r1, r2, r3);
    }

    public static g c() {
        return f33404a;
    }

    public static androidx.core.util.e d(int r1, d r2) {
        return a(new androidx.core.util.g(r1), r2);
    }

    public static androidx.core.util.e e() {
        return f(20);
    }

    public static androidx.core.util.e f(int r2) {
        return b(new androidx.core.util.g(r2), new b(), new c());
    }
}
