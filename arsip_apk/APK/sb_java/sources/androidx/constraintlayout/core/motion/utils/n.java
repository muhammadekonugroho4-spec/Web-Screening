package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public float f21150a;

    /* renamed from: b, reason: collision with root package name */
    public float f21151b;

    /* renamed from: c, reason: collision with root package name */
    public float f21152c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f21153e;

    /* renamed from: f, reason: collision with root package name */
    public float f21154f;

    /* renamed from: g, reason: collision with root package name */
    public float f21155g;

    /* renamed from: h, reason: collision with root package name */
    public float f21156h;

    /* renamed from: i, reason: collision with root package name */
    public float f21157i;

    /* renamed from: j, reason: collision with root package name */
    public int f21158j;

    /* renamed from: k, reason: collision with root package name */
    public String f21159k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21160l;

    /* renamed from: m, reason: collision with root package name */
    public float f21161m;

    /* renamed from: n, reason: collision with root package name */
    public float f21162n;

    /* renamed from: o, reason: collision with root package name */
    public float f21163o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21164p;

    public n() {
        this.f21160l = false;
        this.f21164p = false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.m
    public float a() {
        if (this.f21160l == false) goto L7;
        return -e(this.f21163o);
    L7:
        return e(this.f21163o);
    }

    @Override // androidx.constraintlayout.core.motion.utils.m
    public boolean b() {
        if (a() < 1.0E-5f) goto L5;
        return false;
    L5:
        if (Math.abs(this.f21157i - this.f21162n) >= 1.0E-5f) goto L10;
        return true;
    L10:
        return false;
    }

    public final float c(float r6) {
        this.f21164p = false;
        float r02 = this.d;
        if (r6 > r02) goto L6;
        float r1 = this.f21150a;
        return (r1 * r6) + ((((this.f21151b - r1) * r6) * r6) / (r02 * 2.0f));
    L6:
        int r12 = this.f21158j;
        if (r12 == 1) goto L9;
        float r62 = r6 - r02;
        float r03 = this.f21153e;
        if (r62 >= r03) goto L15;
        float r13 = this.f21155g;
        float r3 = this.f21151b;
        return (r13 + (r3 * r62)) + ((((this.f21152c - r3) * r62) * r62) / (r03 * 2.0f));
    L15:
        if (r12 == 2) goto L17;
        float r63 = r62 - r03;
        float r04 = this.f21154f;
        if (r63 > r04) goto L22;
        float r14 = this.f21156h;
        float r32 = this.f21152c;
        return (r14 + (r32 * r63)) - (((r32 * r63) * r63) / (r04 * 2.0f));
    L22:
        this.f21164p = true;
        return this.f21157i;
    L17:
        return this.f21156h;
    L9:
        return this.f21155g;
    }

    public void d(float r7, float r8, float r9, float r10, float r11, float r12) {
        boolean r02 = false;
        this.f21164p = false;
        this.f21161m = r7;
        if (r7 <= r8) goto L5;
        r02 = true;
    L5:
        this.f21160l = r02;
        if (r02 == false) goto L9;
        f(-r9, r7 - r8, r11, r12, r10);
        return;
    L9:
        f(r9, r8 - r7, r11, r12, r10);
    }

    public float e(float r5) {
        float r02 = this.d;
        if (r5 > r02) goto L6;
        float r1 = this.f21150a;
        return r1 + (((this.f21151b - r1) * r5) / r02);
    L6:
        int r12 = this.f21158j;
        if (r12 != 1) goto L9;
        return 0.0f;
    L9:
        float r52 = r5 - r02;
        float r03 = this.f21153e;
        if (r52 >= r03) goto L14;
        float r13 = this.f21151b;
        return r13 + (((this.f21152c - r13) * r52) / r03);
    L14:
        if (r12 != 2) goto L16;
        return 0.0f;
    L16:
        float r53 = r52 - r03;
        float r04 = this.f21154f;
        if (r53 >= r04) goto L20;
        float r14 = this.f21152c;
        return r14 - ((r53 * r14) / r04);
    L20:
        return 0.0f;
    }

    public final void f(float r9, float r10, float r11, float r12, float r13) {
        this.f21164p = false;
        this.f21157i = r10;
        if (r9 != 0.0f) goto L5;
        r9 = 1.0E-4f;
    L5:
        float r1 = r9 / r11;
        float r2 = (r1 * r9) / 2.0f;
        if (r9 >= 0.0f) goto L14;
        float r132 = (float) Math.sqrt((r10 - ((((-r9) / r11) * r9) / 2.0f)) * r11);
        if (r132 >= r12) goto L11;
        this.f21159k = "backward accelerate, decelerate";
        this.f21158j = 2;
        this.f21150a = r9;
        this.f21151b = r132;
        this.f21152c = 0.0f;
        float r122 = (r132 - r9) / r11;
        this.d = r122;
        this.f21153e = r132 / r11;
        this.f21155g = ((r9 + r132) * r122) / 2.0f;
        this.f21156h = r10;
        this.f21157i = r10;
        return;
    L11:
        this.f21159k = "backward accelerate cruse decelerate";
        this.f21158j = 3;
        this.f21150a = r9;
        this.f21151b = r12;
        this.f21152c = r12;
        float r133 = (r12 - r9) / r11;
        this.d = r133;
        float r112 = r12 / r11;
        this.f21154f = r112;
        float r92 = ((r9 + r12) * r133) / 2.0f;
        float r113 = (r112 * r12) / 2.0f;
        this.f21153e = ((r10 - r92) - r113) / r12;
        this.f21155g = r92;
        this.f21156h = r10 - r113;
        this.f21157i = r10;
        return;
    L14:
        if (r2 < r10) goto L17;
        this.f21159k = "hard stop";
        this.f21158j = 1;
        this.f21150a = r9;
        this.f21151b = 0.0f;
        this.f21155g = r10;
        this.d = (2.0f * r10) / r9;
        return;
    L17:
        float r22 = r10 - r2;
        float r4 = r22 / r9;
        if ((r4 + r1) >= r13) goto L21;
        this.f21159k = "cruse decelerate";
        this.f21158j = 2;
        this.f21150a = r9;
        this.f21151b = r9;
        this.f21152c = 0.0f;
        this.f21155g = r22;
        this.f21156h = r10;
        this.d = r4;
        this.f21153e = r1;
        return;
    L21:
        float r134 = (float) Math.sqrt((r11 * r10) + ((r9 * r9) / 2.0f));
        float r14 = (r134 - r9) / r11;
        this.d = r14;
        float r23 = r134 / r11;
        this.f21153e = r23;
        if (r134 >= r12) goto L25;
        this.f21159k = "accelerate decelerate";
        this.f21158j = 2;
        this.f21150a = r9;
        this.f21151b = r134;
        this.f21152c = 0.0f;
        this.d = r14;
        this.f21153e = r23;
        this.f21155g = ((r9 + r134) * r14) / 2.0f;
        this.f21156h = r10;
        return;
    L25:
        this.f21159k = "accelerate cruse decelerate";
        this.f21158j = 3;
        this.f21150a = r9;
        this.f21151b = r12;
        this.f21152c = r12;
        float r135 = (r12 - r9) / r11;
        this.d = r135;
        float r114 = r12 / r11;
        this.f21154f = r114;
        float r93 = ((r9 + r12) * r135) / 2.0f;
        float r115 = (r114 * r12) / 2.0f;
        this.f21153e = ((r10 - r93) - r115) / r12;
        this.f21155g = r93;
        this.f21156h = r10 - r115;
        this.f21157i = r10;
    }

    @Override // androidx.constraintlayout.core.motion.utils.m
    public float getInterpolation(float r2) {
        float r02 = c(r2);
        this.f21162n = r02;
        this.f21163o = r2;
        if (this.f21160l == false) goto L7;
        return this.f21161m - r02;
    L7:
        return this.f21161m + r02;
    }
}
