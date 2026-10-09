package androidx.compose.animation.core;

/* renamed from: androidx.compose.animation.core.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2374e0 {

    /* renamed from: a, reason: collision with root package name */
    public float f6785a;

    /* renamed from: b, reason: collision with root package name */
    public double f6786b;

    /* renamed from: c, reason: collision with root package name */
    public float f6787c;

    static {
    }

    public C2374e0(float r3) {
        this.f6785a = r3;
        this.f6786b = Math.sqrt(50.0d);
        this.f6787c = 1.0f;
    }

    public final float a() {
        return this.f6787c;
    }

    public final float b() {
        double r02 = this.f6786b;
        return (float) (r02 * r02);
    }

    public final void c(float r2) {
        if (r2 >= 0.0f) goto L5;
        Y.a("Damping ratio must be non-negative");
    L5:
        this.f6787c = r2;
    }

    public final void d(float r1) {
        this.f6785a = r1;
    }

    public final void e(float r3) {
        if (b() > 0.0f) goto L5;
        Y.a("Spring stiffness constant must be positive.");
    L5:
        this.f6786b = Math.sqrt(r3);
    }

    public final long f(float r21, float r22, long r23) {
        float r2 = r21 - this.f6785a;
        double r3 = r23 / 1000.0d;
        float r5 = this.f6787c;
        double r6 = r5 * r5;
        double r10 = this.f6786b;
        double r8 = (-r5) * r10;
        if (r5 <= 1.0f) goto L6;
        double r102 = r10 * Math.sqrt(r6 - 1);
        double r52 = r8 + r102;
        double r82 = r8 - r102;
        double r103 = r2;
        double r12 = ((r82 * r103) - r22) / (r82 - r52);
        double r104 = r103 - r12;
        double r1 = r82 * r3;
        double r32 = r3 * r52;
        double r14 = (Math.exp(r1) * r104) + (Math.exp(r32) * r12);
        double r105 = ((r104 * r82) * Math.exp(r1)) + ((r12 * r52) * Math.exp(r32));
    L10:
        return W.a((Float.floatToRawIntBits((float) r105) & 4294967295L) | (Float.floatToRawIntBits((float) (r14 + this.f6785a)) << 32));
    L6:
        if (r5 != 1.0f) goto L8;
        double r13 = r2;
        double r53 = r22 + (r10 * r13);
        double r7 = (-r10) * r3;
        double r15 = r13 + (r3 * r53);
        r14 = r15 * Math.exp(r7);
        r105 = ((r15 * Math.exp(r7)) * (-this.f6786b)) + (r53 * Math.exp(r7));
        goto L10
    L8:
        double r122 = 1;
        double r106 = r10 * Math.sqrt(r122 - r6);
        double r142 = r2;
        double r123 = (r122 / r106) * (((-r8) * r142) + r22);
        double r16 = r106 * r3;
        double r33 = r3 * r8;
        double r54 = Math.exp(r33) * ((Math.cos(r16) * r142) + (Math.sin(r16) * r123));
        r105 = (r8 * r54) + (Math.exp(r33) * ((((-r106) * r142) * Math.sin(r16)) + ((r106 * r123) * Math.cos(r16))));
        r14 = r54;
        goto L10
    }
}
