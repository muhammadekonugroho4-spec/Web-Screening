package androidx.palette.graphics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f27096e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final c f27097f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final c f27098g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final c f27099h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final c f27100i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final c f27101j = null;

    /* renamed from: a, reason: collision with root package name */
    public final float[] f27102a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f27103b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f27104c;
    public boolean d;

    static {
        c r02 = new c();
        f27096e = r02;
        m(r02);
        p(r02);
        c r03 = new c();
        f27097f = r03;
        o(r03);
        p(r03);
        c r04 = new c();
        f27098g = r04;
        l(r04);
        p(r04);
        c r05 = new c();
        f27099h = r05;
        m(r05);
        n(r05);
        c r06 = new c();
        f27100i = r06;
        o(r06);
        n(r06);
        c r07 = new c();
        f27101j = r07;
        l(r07);
        n(r07);
    }

    public c() {
        float[] r1 = new float[3];
        this.f27102a = r1;
        float[] r2 = new float[3];
        this.f27103b = r2;
        this.f27104c = new float[3];
        this.d = true;
        r(r1);
        r(r2);
        q();
    }

    public static void l(c r2) {
        float[] r22 = r2.f27103b;
        r22[1] = 0.26f;
        r22[2] = 0.45f;
    }

    public static void m(c r2) {
        float[] r22 = r2.f27103b;
        r22[0] = 0.55f;
        r22[1] = 0.74f;
    }

    public static void n(c r2) {
        float[] r22 = r2.f27102a;
        r22[1] = 0.3f;
        r22[2] = 0.4f;
    }

    public static void o(c r2) {
        float[] r22 = r2.f27103b;
        r22[0] = 0.3f;
        r22[1] = 0.5f;
        r22[2] = 0.7f;
    }

    public static void p(c r2) {
        float[] r22 = r2.f27102a;
        r22[0] = 0.35f;
        r22[1] = 1.0f;
    }

    public static void r(float[] r2) {
        r2[0] = 0.0f;
        r2[1] = 0.5f;
        r2[2] = 1.0f;
    }

    public float a() {
        return this.f27104c[1];
    }

    public float b() {
        return this.f27103b[2];
    }

    public float c() {
        return this.f27102a[2];
    }

    public float d() {
        return this.f27103b[0];
    }

    public float e() {
        return this.f27102a[0];
    }

    public float f() {
        return this.f27104c[2];
    }

    public float g() {
        return this.f27104c[0];
    }

    public float h() {
        return this.f27103b[1];
    }

    public float i() {
        return this.f27102a[1];
    }

    public boolean j() {
        return this.d;
    }

    public void k() {
        int r02 = this.f27104c.length;
        int r2 = 0;
        float r4 = 0.0f;
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L9;
        float r5 = this.f27104c[r3];
        if (r5 <= 0.0f) goto L7;
        r4 = r4 + r5;
    L7:
        r3 = r3 + 1;
        goto L3
    L9:
        if (r4 == 0.0f) goto L16;
        int r03 = this.f27104c.length;
    L11:
        if (r2 >= r03) goto L23;
        float[] r32 = this.f27104c;
        float r52 = r32[r2];
        if (r52 <= 0.0f) goto L15;
        r32[r2] = r52 / r4;
    L15:
        r2 = r2 + 1;
        goto L11
    L23:
        return;
    }

    public final void q() {
        float[] r02 = this.f27104c;
        r02[0] = 0.24f;
        r02[1] = 0.52f;
        r02[2] = 0.24f;
    }
}
