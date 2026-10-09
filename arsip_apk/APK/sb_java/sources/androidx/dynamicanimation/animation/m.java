package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.h;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public double f24009a;

    /* renamed from: b, reason: collision with root package name */
    public double f24010b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24011c;
    public double d;

    /* renamed from: e, reason: collision with root package name */
    public double f24012e;

    /* renamed from: f, reason: collision with root package name */
    public double f24013f;

    /* renamed from: g, reason: collision with root package name */
    public double f24014g;

    /* renamed from: h, reason: collision with root package name */
    public double f24015h;

    /* renamed from: i, reason: collision with root package name */
    public double f24016i;

    /* renamed from: j, reason: collision with root package name */
    public final h.p f24017j;

    public m() {
        this.f24009a = Math.sqrt(1500.0d);
        this.f24010b = 0.5d;
        this.f24011c = false;
        this.f24016i = Double.MAX_VALUE;
        this.f24017j = new h.p();
    }

    public float a() {
        return (float) this.f24010b;
    }

    public float b() {
        return (float) this.f24016i;
    }

    public float c() {
        double r02 = this.f24009a;
        return (float) (r02 * r02);
    }

    public final void d() {
        if (this.f24011c == false) goto L6;
        return;
    L6:
        if (this.f24016i == Double.MAX_VALUE) goto L18;
        double r02 = this.f24010b;
        if (r02 <= 1.0d) goto L11;
        double r6 = this.f24009a;
        this.f24013f = ((-r02) * r6) + (r6 * Math.sqrt((r02 * r02) - 1.0d));
        double r03 = this.f24010b;
        double r62 = this.f24009a;
        this.f24014g = ((-r03) * r62) - (r62 * Math.sqrt((r03 * r03) - 1.0d));
    L15:
        this.f24011c = true;
        return;
    L11:
        if (r02 < 0.0d) goto L15;
        if (r02 >= 1.0d) goto L15;
        this.f24015h = this.f24009a * Math.sqrt(1.0d - (r02 * r02));
        goto L15
    L18:
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public boolean e(float r5, float r6) {
        if (Math.abs(r6) < this.f24012e) goto L5;
        return false;
    L5:
        if (Math.abs(r5 - b()) >= this.d) goto L10;
        return true;
    L10:
        return false;
    }

    public m f(float r3) {
        if (r3 < 0.0f) goto L7;
        this.f24010b = r3;
        this.f24011c = false;
        return this;
    L7:
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public m g(float r3) {
        this.f24016i = r3;
        return this;
    }

    public m h(float r3) {
        if (r3 <= 0.0f) goto L7;
        this.f24009a = Math.sqrt(r3);
        this.f24011c = false;
        return this;
    L7:
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public void i(double r3) {
        double r32 = Math.abs(r3);
        this.d = r32;
        this.f24012e = r32 * 62.5d;
    }

    public h.p j(double r17, double r19, long r21) {
        d();
        double r1 = r21 / 1000.0d;
        double r3 = r17 - this.f24016i;
        double r5 = this.f24010b;
        if (r5 <= 1.0d) goto L6;
        double r52 = this.f24014g;
        double r12 = this.f24013f;
        double r7 = r3 - (((r52 * r3) - r19) / (r52 - r12));
        double r32 = ((r3 * r52) - r19) / (r52 - r12);
        double r53 = (Math.pow(2.718281828459045d, r52 * r1) * r7) + (Math.pow(2.718281828459045d, this.f24013f * r1) * r32);
        double r122 = this.f24014g;
        double r72 = (r7 * r122) * Math.pow(2.718281828459045d, r122 * r1);
        double r123 = this.f24013f;
        double r73 = r72 + ((r32 * r123) * Math.pow(2.718281828459045d, r123 * r1));
    L9:
        h.p r13 = this.f24017j;
        r13.f24002a = (float) (r53 + this.f24016i);
        r13.f24003b = (float) r73;
        return r13;
    L6:
        if (r5 != 1.0d) goto L8;
        double r54 = this.f24009a;
        double r74 = r19 + (r54 * r3);
        double r33 = r3 + (r74 * r1);
        r53 = Math.pow(2.718281828459045d, (-r54) * r1) * r33;
        double r34 = r33 * Math.pow(2.718281828459045d, (-this.f24009a) * r1);
        double r124 = this.f24009a;
        r73 = (r74 * Math.pow(2.718281828459045d, (-r124) * r1)) + (r34 * (-r124));
        goto L9
    L8:
        double r75 = 1.0d / this.f24015h;
        double r125 = this.f24009a;
        double r76 = r75 * (((r5 * r125) * r3) + r19);
        r53 = Math.pow(2.718281828459045d, ((-r5) * r125) * r1) * ((Math.cos(this.f24015h * r1) * r3) + (Math.sin(this.f24015h * r1) * r76));
        double r126 = this.f24009a;
        double r10 = this.f24010b;
        double r9 = Math.pow(2.718281828459045d, ((-r10) * r126) * r1);
        double r11 = this.f24015h;
        double r14 = ((-r11) * r3) * Math.sin(r11 * r1);
        double r35 = this.f24015h;
        r73 = (((-r126) * r53) * r10) + (r9 * (r14 + ((r76 * r35) * Math.cos(r35 * r1))));
        goto L9
    }

    public m(float r3) {
        this.f24009a = Math.sqrt(1500.0d);
        this.f24010b = 0.5d;
        this.f24011c = false;
        this.f24016i = Double.MAX_VALUE;
        this.f24017j = new h.p();
        this.f24016i = r3;
    }
}
