package okio;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class o extends J {

    /* renamed from: g, reason: collision with root package name */
    public J f182441g;

    public o(J r2) {
        kotlin.jvm.internal.p.l(r2, "delegate");
        this.f182441g = r2;
    }

    @Override // okio.J
    public J a() {
        return this.f182441g.a();
    }

    @Override // okio.J
    public J b() {
        return this.f182441g.b();
    }

    @Override // okio.J
    public long c() {
        return this.f182441g.c();
    }

    @Override // okio.J
    public J d(long r2) {
        return this.f182441g.d(r2);
    }

    @Override // okio.J
    public boolean e() {
        return this.f182441g.e();
    }

    @Override // okio.J
    public void f() {
        this.f182441g.f();
    }

    @Override // okio.J
    public J g(long r2, TimeUnit r4) {
        kotlin.jvm.internal.p.l(r4, "unit");
        return this.f182441g.g(r2, r4);
    }

    @Override // okio.J
    public long h() {
        return this.f182441g.h();
    }

    @Override // okio.J
    public void i(Object r2) {
        kotlin.jvm.internal.p.l(r2, "monitor");
        this.f182441g.i(r2);
    }

    public final J j() {
        return this.f182441g;
    }

    public final o k(J r2) {
        kotlin.jvm.internal.p.l(r2, "delegate");
        this.f182441g = r2;
        return this;
    }
}
