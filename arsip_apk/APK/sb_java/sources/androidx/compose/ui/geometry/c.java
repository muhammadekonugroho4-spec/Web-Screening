package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public float f17047a;

    /* renamed from: b, reason: collision with root package name */
    public float f17048b;

    /* renamed from: c, reason: collision with root package name */
    public float f17049c;
    public float d;

    static {
    }

    public c(float r1, float r2, float r3, float r4) {
        this.f17047a = r1;
        this.f17048b = r2;
        this.f17049c = r3;
        this.d = r4;
    }

    public final float a() {
        return this.d;
    }

    public final float b() {
        return this.f17047a;
    }

    public final float c() {
        return this.f17049c;
    }

    public final float d() {
        return this.f17048b;
    }

    public final void e(float r2, float r3, float r4, float r5) {
        this.f17047a = Math.max(r2, this.f17047a);
        this.f17048b = Math.max(r3, this.f17048b);
        this.f17049c = Math.min(r4, this.f17049c);
        this.d = Math.min(r5, this.d);
    }

    public final boolean f() {
        boolean r1 = false;
        if (this.f17047a < this.f17049c) goto L5;
        boolean r02 = true;
    L7:
        if (this.f17048b < this.d) goto L10;
        r1 = true;
    L10:
        return r02 | r1;
    L5:
        r02 = false;
        goto L7
    }

    public final void g(float r1, float r2, float r3, float r4) {
        this.f17047a = r1;
        this.f17048b = r2;
        this.f17049c = r3;
        this.d = r4;
    }

    public final void h(float r1) {
        this.d = r1;
    }

    public final void i(float r1) {
        this.f17047a = r1;
    }

    public final void j(float r1) {
        this.f17049c = r1;
    }

    public final void k(float r1) {
        this.f17048b = r1;
    }

    public final void l(float r2, float r3) {
        this.f17047a += r2;
        this.f17048b += r3;
        this.f17049c += r2;
        this.d += r3;
    }

    public final void m(long r4) {
        l(Float.intBitsToFloat((int) (r4 >> 32)), Float.intBitsToFloat((int) (r4 & 4294967295L)));
    }

    public String toString() {
        return "MutableRect(" + b.a(this.f17047a, 1) + ", " + b.a(this.f17048b, 1) + ", " + b.a(this.f17049c, 1) + ", " + b.a(this.d, 1) + ')';
    }
}
