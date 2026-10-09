package com.koushikdutta.async.http;

/* loaded from: classes6.dex */
public interface d {

    public static class a extends e {

        /* renamed from: c, reason: collision with root package name */
        public com.koushikdutta.async.callback.b f41462c;
        public com.koushikdutta.async.future.a d;

        /* renamed from: e, reason: collision with root package name */
        public String f41463e;

        public a() {
        }
    }

    public static class b extends C0451d {

        /* renamed from: j, reason: collision with root package name */
        public com.koushikdutta.async.q f41464j;

        public b() {
        }
    }

    public static class c extends a {

        /* renamed from: f, reason: collision with root package name */
        public com.koushikdutta.async.j f41465f;

        /* renamed from: g, reason: collision with root package name */
        public i f41466g;

        /* renamed from: h, reason: collision with root package name */
        public com.koushikdutta.async.callback.a f41467h;

        /* renamed from: i, reason: collision with root package name */
        public com.koushikdutta.async.callback.a f41468i;

        public c() {
        }
    }

    /* renamed from: com.koushikdutta.async.http.d$d, reason: collision with other inner class name */
    public static class C0451d extends f {
        public C0451d() {
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public com.koushikdutta.async.util.h f41469a;

        /* renamed from: b, reason: collision with root package name */
        public com.koushikdutta.async.http.e f41470b;

        public e() {
            this.f41469a = new com.koushikdutta.async.util.h();
        }
    }

    public static class f extends c {
        public f() {
        }
    }

    public static class g extends h {

        /* renamed from: k, reason: collision with root package name */
        public Exception f41471k;

        public g() {
        }
    }

    public static class h extends b {
        public h() {
        }
    }

    public interface i {
        String c();

        int d();

        String e();

        Headers f();

        i h(String r1);

        i i(Headers r1);

        com.koushikdutta.async.s o();

        i r(String r1);

        i s(com.koushikdutta.async.q r1);

        i t(int r1);

        com.koushikdutta.async.j u();

        i y(com.koushikdutta.async.s r1);
    }

    boolean a(c r1);

    void b(e r1);

    void c(C0451d r1);

    void d(g r1);

    com.koushikdutta.async.http.e e(h r1);

    com.koushikdutta.async.future.a f(a r1);

    void g(b r1);

    void h(f r1);
}
