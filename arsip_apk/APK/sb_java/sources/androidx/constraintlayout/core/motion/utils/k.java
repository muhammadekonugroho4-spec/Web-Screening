package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public double f21140a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21141b;

    /* renamed from: c, reason: collision with root package name */
    public double f21142c;
    public double d;

    /* renamed from: e, reason: collision with root package name */
    public double f21143e;

    /* renamed from: f, reason: collision with root package name */
    public float f21144f;

    /* renamed from: g, reason: collision with root package name */
    public float f21145g;

    /* renamed from: h, reason: collision with root package name */
    public float f21146h;

    /* renamed from: i, reason: collision with root package name */
    public float f21147i;

    /* renamed from: j, reason: collision with root package name */
    public float f21148j;

    /* renamed from: k, reason: collision with root package name */
    public int f21149k;

    public k() {
        this.f21140a = 0.5d;
        this.f21141b = false;
        this.f21149k = 0;
    }

    @Override // androidx.constraintlayout.core.motion.utils.m
    public float a() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.m
    public boolean b() {
        double r02 = this.f21145g - this.d;
        double r2 = this.f21142c;
        double r4 = this.f21146h;
        if (Math.sqrt((((r4 * r4) * this.f21147i) + ((r2 * r02) * r02)) / r2) > this.f21148j) goto L6;
        return true;
    L6:
        return false;
    }

    public final void c(double r25) {
        if (r25 <= 0.0d) goto L20;
        double r1 = this.f21142c;
        double r3 = this.f21140a;
        int r5 = (int) ((9.0d / ((Math.sqrt(r1 / this.f21147i) * r25) * 4.0d)) + 1.0d);
        double r6 = r25 / r5;
        int r8 = 0;
    L6:
        if (r8 >= r5) goto L26;
        float r9 = this.f21145g;
        double r12 = this.d;
        float r10 = this.f21146h;
        double r16 = r1;
        double r14 = ((-r1) * (r9 - r12)) - (r10 * r3);
        float r13 = this.f21147i;
        double r18 = r3;
        double r2 = r10 + (((r14 / r13) * r6) / 2.0d);
        double r11 = ((((-((r9 + ((r6 * r2) / 2.0d)) - r12)) * r16) - (r2 * r18)) / r13) * r6;
        double r15 = r10 + (r11 / 2.0d);
        float r102 = r10 + ((float) r11);
        this.f21146h = r102;
        float r92 = r9 + ((float) (r15 * r6));
        this.f21145g = r92;
        int r17 = this.f21149k;
        if (r17 <= 0) goto L19;
        if (r92 < 0.0f) goto L12;
    L14:
        float r22 = this.f21145g;
        if (r22 <= 1.0f) goto L19;
        if ((r17 & 2) != 2) goto L19;
        this.f21145g = 2.0f - r22;
        this.f21146h = -this.f21146h;
        goto L19
    L12:
        if ((r17 & 1) != 1) goto L14;
        this.f21145g = -r92;
        this.f21146h = -r102;
    L19:
        r8 = r8 + 1;
        r1 = r16;
        r3 = r18;
        goto L6
    L26:
        return;
    }

    public void d(float r3, float r4, float r5, float r6, float r7, float r8, float r9, int r10) {
        this.d = r4;
        this.f21140a = r8;
        this.f21141b = false;
        this.f21145g = r3;
        this.f21143e = r5;
        this.f21142c = r7;
        this.f21147i = r6;
        this.f21148j = r9;
        this.f21149k = r10;
        this.f21144f = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.m
    public float getInterpolation(float r3) {
        c(r3 - this.f21144f);
        this.f21144f = r3;
        if (b() == false) goto L6;
        this.f21145g = (float) this.d;
    L6:
        return this.f21145g;
    }
}
