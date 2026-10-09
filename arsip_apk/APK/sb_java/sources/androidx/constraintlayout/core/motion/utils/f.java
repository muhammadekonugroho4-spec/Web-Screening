package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class f extends b {

    /* renamed from: a, reason: collision with root package name */
    public double[] f21120a;

    /* renamed from: b, reason: collision with root package name */
    public double[][] f21121b;

    /* renamed from: c, reason: collision with root package name */
    public double f21122c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public double[] f21123e;

    public f(double[] r12, double[][] r13) {
        this.f21122c = Double.NaN;
        this.d = true;
        int r1 = r13[0].length;
        this.f21123e = new double[r1];
        this.f21120a = r12;
        this.f21121b = r13;
        if (r1 <= 2) goto L16;
        int r3 = 0;
        double r4 = 0.0d;
    L5:
        double r6 = r4;
        if (r3 >= r12.length) goto L11;
        double r9 = r13[r3][0];
        if (r3 <= 0) goto L10;
        Math.hypot(r9 - r4, r9 - r6);
    L10:
        r3 = r3 + 1;
        r4 = r9;
        goto L5
    L11:
        this.f21122c = 0.0d;
        return;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double c(double r9, int r11) {
        double[] r02 = this.f21120a;
        int r1 = r02.length;
        int r3 = 0;
        if (this.d == false) goto L13;
        double r4 = r02[0];
        if (r9 > r4) goto L9;
        double r12 = this.f21121b[0][r11];
        double r92 = r9 - r4;
        double r32 = f(r4, r11);
    L8:
        return r12 + (r92 * r32);
    L9:
        int r2 = r1 - 1;
        double r42 = r02[r2];
        if (r9 < r42) goto L21;
        r12 = this.f21121b[r2][r11];
        r92 = r9 - r42;
        r32 = f(r42, r11);
    L21:
        if (r3 >= (r1 - 1)) goto L31;
        double[] r03 = this.f21120a;
        double r43 = r03[r3];
        if (r9 == r43) goto L25;
        int r22 = r3 + 1;
        double r6 = r03[r22];
        if (r9 < r6) goto L28;
        r3 = r22;
        goto L21
    L28:
        double r93 = (r9 - r43) / (r6 - r43);
        double[][] r04 = this.f21121b;
        return (r04[r3][r11] * (1.0d - r93)) + (r04[r22][r11] * r93);
    L25:
        return this.f21121b[r3][r11];
    L31:
        return 0.0d;
    L13:
        if (r9 <= r02[0]) goto L15;
        int r23 = r1 - 1;
        if (r9 < r02[r23]) goto L21;
        return this.f21121b[r23][r11];
    L15:
        return this.f21121b[0][r11];
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void d(double r13, double[] r15) {
        double[] r02 = this.f21120a;
        int r1 = r02.length;
        int r3 = 0;
        int r2 = this.f21121b[0].length;
        if (this.d == false) goto L15;
        double r4 = r02[0];
        if (r13 > r4) goto L9;
        g(r4, this.f21123e);
        int r03 = 0;
    L7:
        if (r03 >= r2) goto L37;
        r15[r03] = this.f21121b[0][r03] + ((r13 - this.f21120a[0]) * this.f21123e[r03]);
        r03 = r03 + 1;
        goto L7
    L37:
        return;
    L9:
        int r42 = r1 - 1;
        double r5 = r02[r42];
        if (r13 < r5) goto L23;
        g(r5, this.f21123e);
    L12:
        if (r3 >= r2) goto L46;
        r15[r3] = this.f21121b[r42][r3] + ((r13 - this.f21120a[r42]) * this.f21123e[r3]);
        r3 = r3 + 1;
        goto L12
    L46:
        return;
    L23:
        int r04 = 0;
    L25:
        if (r04 >= (r1 - 1)) goto L47;
        if (r13 != this.f21120a[r04]) goto L31;
        int r43 = 0;
    L29:
        if (r43 >= r2) goto L31;
        r15[r43] = this.f21121b[r04][r43];
        r43 = r43 + 1;
    L31:
        double[] r44 = this.f21120a;
        int r52 = r04 + 1;
        double r6 = r44[r52];
        if (r13 < r6) goto L33;
        r04 = r52;
        goto L25
    L33:
        double r8 = r44[r04];
        double r132 = (r13 - r8) / (r6 - r8);
    L34:
        if (r3 >= r2) goto L48;
        double[][] r12 = this.f21121b;
        r15[r3] = (r12[r04][r3] * (1.0d - r132)) + (r12[r52][r3] * r132);
        r3 = r3 + 1;
        goto L34
    L48:
        return;
    L47:
        return;
    L15:
        if (r13 > r02[0]) goto L19;
        int r133 = 0;
    L17:
        if (r133 >= r2) goto L49;
        r15[r133] = this.f21121b[0][r133];
        r133 = r133 + 1;
        goto L17
    L49:
        return;
    L19:
        int r45 = r1 - 1;
        if (r13 < r02[r45]) goto L23;
    L21:
        if (r3 >= r2) goto L50;
        r15[r3] = this.f21121b[r45][r3];
        r3 = r3 + 1;
        goto L21
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void e(double r13, float[] r15) {
        double[] r02 = this.f21120a;
        int r1 = r02.length;
        int r3 = 0;
        int r2 = this.f21121b[0].length;
        if (this.d == false) goto L15;
        double r4 = r02[0];
        if (r13 > r4) goto L9;
        g(r4, this.f21123e);
        int r03 = 0;
    L7:
        if (r03 >= r2) goto L37;
        r15[r03] = (float) (this.f21121b[0][r03] + ((r13 - this.f21120a[0]) * this.f21123e[r03]));
        r03 = r03 + 1;
        goto L7
    L37:
        return;
    L9:
        int r42 = r1 - 1;
        double r5 = r02[r42];
        if (r13 < r5) goto L23;
        g(r5, this.f21123e);
    L12:
        if (r3 >= r2) goto L46;
        r15[r3] = (float) (this.f21121b[r42][r3] + ((r13 - this.f21120a[r42]) * this.f21123e[r3]));
        r3 = r3 + 1;
        goto L12
    L46:
        return;
    L23:
        int r04 = 0;
    L25:
        if (r04 >= (r1 - 1)) goto L47;
        if (r13 != this.f21120a[r04]) goto L31;
        int r43 = 0;
    L29:
        if (r43 >= r2) goto L31;
        r15[r43] = (float) this.f21121b[r04][r43];
        r43 = r43 + 1;
    L31:
        double[] r44 = this.f21120a;
        int r52 = r04 + 1;
        double r6 = r44[r52];
        if (r13 < r6) goto L33;
        r04 = r52;
        goto L25
    L33:
        double r8 = r44[r04];
        double r132 = (r13 - r8) / (r6 - r8);
    L34:
        if (r3 >= r2) goto L48;
        double[][] r12 = this.f21121b;
        r15[r3] = (float) ((r12[r04][r3] * (1.0d - r132)) + (r12[r52][r3] * r132));
        r3 = r3 + 1;
        goto L34
    L48:
        return;
    L47:
        return;
    L15:
        if (r13 > r02[0]) goto L19;
        int r133 = 0;
    L17:
        if (r133 >= r2) goto L49;
        r15[r133] = (float) this.f21121b[0][r133];
        r133 = r133 + 1;
        goto L17
    L49:
        return;
    L19:
        int r45 = r1 - 1;
        if (r13 < r02[r45]) goto L23;
    L21:
        if (r3 >= r2) goto L50;
        r15[r3] = (float) this.f21121b[r45][r3];
        r3 = r3 + 1;
        goto L21
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double f(double r8, int r10) {
        double[] r02 = this.f21120a;
        int r1 = r02.length;
        int r2 = 0;
        double r3 = r02[0];
        if (r8 >= r3) goto L5;
    L4:
        r8 = r3;
    L9:
        if (r2 >= (r1 - 1)) goto L15;
        double[] r03 = this.f21120a;
        int r32 = r2 + 1;
        double r4 = r03[r32];
        if (r8 <= r4) goto L12;
        r2 = r32;
        goto L9
    L12:
        double r42 = r4 - r03[r2];
        double[][] r82 = this.f21121b;
        return (r82[r32][r10] - r82[r2][r10]) / r42;
    L15:
        return 0.0d;
    L5:
        r3 = r02[r1 - 1];
        if (r8 < r3) goto L9;
        goto L4
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void g(double r13, double[] r15) {
        double[] r02 = this.f21120a;
        int r1 = r02.length;
        int r3 = 0;
        int r2 = this.f21121b[0].length;
        double r4 = r02[0];
        if (r13 > r4) goto L5;
    L4:
        r13 = r4;
    L8:
        int r03 = 0;
    L10:
        if (r03 >= (r1 - 1)) goto L17;
        double[] r42 = this.f21120a;
        int r5 = r03 + 1;
        double r6 = r42[r5];
        if (r13 <= r6) goto L13;
        r03 = r5;
        goto L10
    L13:
        double r62 = r6 - r42[r03];
    L14:
        if (r3 >= r2) goto L21;
        double[][] r132 = this.f21121b;
        r15[r3] = (r132[r5][r3] - r132[r03][r3]) / r62;
        r3 = r3 + 1;
        goto L14
    L21:
        return;
    L17:
        return;
    L5:
        r4 = r02[r1 - 1];
        if (r13 < r4) goto L8;
        goto L8
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double[] h() {
        return this.f21120a;
    }
}
