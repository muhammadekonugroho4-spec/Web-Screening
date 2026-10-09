package androidx.glance;

/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public o f25259a;

    /* renamed from: b, reason: collision with root package name */
    public p f25260b;

    /* renamed from: c, reason: collision with root package name */
    public g f25261c;
    public int d;

    static {
    }

    public i() {
        this.f25259a = o.f25335a;
        this.d = androidx.glance.layout.d.f25308b.c();
    }

    @Override // androidx.glance.h
    public o a() {
        return this.f25259a;
    }

    @Override // androidx.glance.h
    public h b() {
        i r02 = new i();
        r02.c(a());
        r02.f25260b = this.f25260b;
        r02.f25261c = this.f25261c;
        r02.d = this.d;
        return r02;
    }

    @Override // androidx.glance.h
    public void c(o r1) {
        this.f25259a = r1;
    }

    public final g d() {
        return this.f25261c;
    }

    public final int e() {
        return this.d;
    }

    public final p f() {
        return this.f25260b;
    }

    public final void g(g r1) {
        this.f25261c = r1;
    }

    public final void h(int r1) {
        this.d = r1;
    }

    public final void i(p r1) {
        this.f25260b = r1;
    }

    public String toString() {
        return "EmittableImage(modifier=" + a() + ", provider=" + this.f25260b + ", colorFilterParams=" + this.f25261c + ", contentScale=" + androidx.glance.layout.d.i(this.d) + ')';
    }
}
