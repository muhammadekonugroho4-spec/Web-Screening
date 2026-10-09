package io.sentry.util.network;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f176869a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f176870b;

    /* renamed from: c, reason: collision with root package name */
    public Long f176871c;
    public Long d;

    /* renamed from: e, reason: collision with root package name */
    public d f176872e;

    /* renamed from: f, reason: collision with root package name */
    public d f176873f;

    public c(String r1) {
        this.f176869a = r1;
    }

    public String a() {
        return this.f176869a;
    }

    public d b() {
        return this.f176872e;
    }

    public Long c() {
        return this.f176871c;
    }

    public d d() {
        return this.f176873f;
    }

    public Long e() {
        return this.d;
    }

    public Integer f() {
        return this.f176870b;
    }

    public void g(d r1) {
        this.f176872e = r1;
        this.f176871c = r1.c();
    }

    public void h(int r1, d r2) {
        this.f176870b = Integer.valueOf(r1);
        this.f176873f = r2;
        this.d = r2.c();
    }

    public String toString() {
        return "NetworkRequestData{method='" + this.f176869a + "', statusCode=" + this.f176870b + ", requestBodySize=" + this.f176871c + ", responseBodySize=" + this.d + ", request=" + this.f176872e + ", response=" + this.f176873f + '}';
    }
}
