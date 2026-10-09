package kotlinx.serialization.json.internal;

/* renamed from: kotlinx.serialization.json.internal.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11983j {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC11990q f180872a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f180873b;

    public C11983j(InterfaceC11990q r2) {
        kotlin.jvm.internal.p.l(r2, "writer");
        this.f180872a = r2;
        this.f180873b = true;
    }

    public final boolean a() {
        return this.f180873b;
    }

    public void b() {
        this.f180873b = true;
    }

    public void c() {
        this.f180873b = false;
    }

    public void d() {
        this.f180873b = false;
    }

    public void e(byte r4) {
        this.f180872a.writeLong(r4);
    }

    public final void f(char r2) {
        this.f180872a.a(r2);
    }

    public void g(double r2) {
        this.f180872a.c(String.valueOf(r2));
    }

    public void h(float r2) {
        this.f180872a.c(String.valueOf(r2));
    }

    public void i(int r4) {
        this.f180872a.writeLong(r4);
    }

    public void j(long r2) {
        this.f180872a.writeLong(r2);
    }

    public final void k(String r2) {
        kotlin.jvm.internal.p.l(r2, "v");
        this.f180872a.c(r2);
    }

    public void l(short r4) {
        this.f180872a.writeLong(r4);
    }

    public void m(boolean r2) {
        this.f180872a.c(String.valueOf(r2));
    }

    public void n(String r2) {
        kotlin.jvm.internal.p.l(r2, "value");
        this.f180872a.b(r2);
    }

    public final void o(boolean r1) {
        this.f180873b = r1;
    }

    public void p() {
    }

    public void q() {
    }
}
