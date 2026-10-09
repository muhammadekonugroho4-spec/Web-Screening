package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public float f21186a;

    /* renamed from: b, reason: collision with root package name */
    public float f21187b;

    /* renamed from: c, reason: collision with root package name */
    public float f21188c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f21189e;

    /* renamed from: f, reason: collision with root package name */
    public float f21190f;

    static {
    }

    public q() {
    }

    public void a(float r19, float r20, int r21, int r22, float[] r23) {
        float r3 = r23[0];
        float r5 = r23[1];
        float r6 = (r20 - 0.5f) * 2.0f;
        float r32 = r3 + this.f21188c;
        float r52 = r5 + this.d;
        float r33 = r32 + (this.f21186a * ((r19 - 0.5f) * 2.0f));
        float r53 = r52 + (this.f21187b * r6);
        float r8 = (float) Math.toRadians(this.f21190f);
        float r9 = (float) Math.toRadians(this.f21189e);
        double r12 = r8;
        double r14 = r22 * r6;
        float r34 = r33 + (((float) ((((-r21) * r7) * Math.sin(r12)) - (Math.cos(r12) * r14))) * r9);
        float r54 = r53 + (r9 * ((float) (((r21 * r7) * Math.cos(r12)) - (r14 * Math.sin(r12)))));
        r23[0] = r34;
        r23[1] = r54;
    }

    public void b() {
        this.f21189e = 0.0f;
        this.d = 0.0f;
        this.f21188c = 0.0f;
        this.f21187b = 0.0f;
        this.f21186a = 0.0f;
    }

    public void c(e r1, float r2) {
        if (r1 == null) goto L5;
        this.f21189e = r1.b(r2);
        return;
    }

    public void d(j r2, float r3) {
        if (r2 == null) goto L5;
        this.f21189e = r2.b(r3);
        this.f21190f = r2.a(r3);
        return;
    }

    public void e(e r1, e r2, float r3) {
        if (r1 == null) goto L4;
        this.f21186a = r1.b(r3);
    L4:
        if (r2 == null) goto L7;
        this.f21187b = r2.b(r3);
        return;
    }

    public void f(j r1, j r2, float r3) {
        if (r1 == null) goto L4;
        this.f21186a = r1.b(r3);
    L4:
        if (r2 == null) goto L7;
        this.f21187b = r2.b(r3);
        return;
    }

    public void g(e r1, e r2, float r3) {
        if (r1 == null) goto L4;
        this.f21188c = r1.b(r3);
    L4:
        if (r2 == null) goto L7;
        this.d = r2.b(r3);
        return;
    }

    public void h(j r1, j r2, float r3) {
        if (r1 == null) goto L4;
        this.f21188c = r1.b(r3);
    L4:
        if (r2 == null) goto L7;
        this.d = r2.b(r3);
        return;
    }
}
