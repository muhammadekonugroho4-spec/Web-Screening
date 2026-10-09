package com.android.volley;

import com.android.volley.a;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f32016a;

    /* renamed from: b, reason: collision with root package name */
    public final a.C0304a f32017b;

    /* renamed from: c, reason: collision with root package name */
    public final VolleyError f32018c;
    public boolean d;

    public interface a {
        void a(VolleyError r1);
    }

    public interface b {
        void a(Object r1);
    }

    public j(Object r2, a.C0304a r3) {
        this.d = false;
        this.f32016a = r2;
        this.f32017b = r3;
        this.f32018c = null;
    }

    public static j a(VolleyError r1) {
        return new j(r1);
    }

    public static j c(Object r1, a.C0304a r2) {
        return new j(r1, r2);
    }

    public boolean b() {
        if (this.f32018c != null) goto L6;
        return true;
    L6:
        return false;
    }

    public j(VolleyError r2) {
        this.d = false;
        this.f32016a = null;
        this.f32017b = null;
        this.f32018c = r2;
    }
}
