package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class g extends b {

    /* renamed from: a, reason: collision with root package name */
    public double[] f21124a;

    /* renamed from: b, reason: collision with root package name */
    public double[][] f21125b;

    /* renamed from: c, reason: collision with root package name */
    public double[][] f21126c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public double[] f21127e;

    public g(double[] r22, double[][] r23) {
        this.d = true;
        int r4 = r22.length;
        int r6 = r23[0].length;
        this.f21127e = new double[r6];
        int r7 = r4 - 1;
        Class r10 = Double.TYPE;
        double[][] r9 = (double[][]) Array.newInstance(r10, new int[]{r7, r6});
        double[][] r3 = (double[][]) Array.newInstance(r10, new int[]{r4, r6});
        int r102 = 0;
    L3:
        if (r102 >= r6) goto L12;
        int r11 = 0;
    L5:
        if (r11 >= r7) goto L11;
        int r12 = r11 + 1;
        double r13 = r22[r12] - r22[r11];
        double[] r15 = r9[r11];
        double r17 = (r23[r12][r102] - r23[r11][r102]) / r13;
        r15[r102] = r17;
        if (r11 != 0) goto L9;
        r3[r11][r102] = r17;
    L10:
        r11 = r12;
        goto L5
    L9:
        r3[r11][r102] = (r9[r11 - 1][r102] + r17) * 0.5d;
        goto L10
    L11:
        r3[r7][r102] = r9[r4 - 2][r102];
        r102 = r102 + 1;
        goto L3
    L12:
        int r42 = 0;
    L13:
        if (r42 >= r7) goto L24;
        int r8 = 0;
    L15:
        if (r8 >= r6) goto L23;
        double r112 = r9[r42][r8];
        if (r112 != 0.0d) goto L19;
        r3[r42][r8] = 0.0d;
        r3[r42 + 1][r8] = 0.0d;
    L22:
        r8 = r8 + 1;
        goto L15
    L19:
        double r132 = r3[r42][r8] / r112;
        int r103 = r42 + 1;
        double r113 = r3[r103][r8] / r112;
        double r152 = Math.hypot(r132, r113);
        if (r152 <= 9.0d) goto L22;
        double r172 = 3.0d / r152;
        double[] r153 = r3[r42];
        double[] r16 = r9[r42];
        r153[r8] = (r132 * r172) * r16[r8];
        r3[r103][r8] = (r172 * r113) * r16[r8];
        goto L22
    L23:
        r42 = r42 + 1;
        goto L13
    L24:
        this.f21124a = r22;
        this.f21125b = r23;
        this.f21126c = r3;
    }

    public static g i(String r8) {
        double[] r02 = new double[r8.length() / 2];
        int r1 = r8.indexOf(40) + 1;
        int r3 = r8.indexOf(44, r1);
        int r4 = 0;
    L4:
        if (r3 == (-1)) goto L6;
        r02[r4] = Double.parseDouble(r8.substring(r1, r3).trim());
        r1 = r3 + 1;
        r3 = r8.indexOf(44, r1);
        r4 = r4 + 1;
        goto L4
    L6:
        String r82 = r8.substring(r1, r8.indexOf(41, r1)).trim();
        r02[r4] = Double.parseDouble(r82);
        return j(Arrays.copyOf(r02, r4 + 1));
    }

    public static g j(double[] r18) {
        int r1 = (r18.length * 3) - 2;
        int r3 = r18.length - 1;
        double r5 = 1.0d / r3;
        double[][] r2 = (double[][]) Array.newInstance(Double.TYPE, new int[]{r1, 1});
        double[] r12 = new double[r1];
        int r9 = 0;
    L4:
        if (r9 >= r18.length) goto L10;
        double r10 = r18[r9];
        int r122 = r9 + r3;
        r2[r122][0] = r10;
        double r13 = r9 * r5;
        r12[r122] = r13;
        if (r9 <= 0) goto L8;
        int r123 = (r3 * 2) + r9;
        r2[r123][0] = r10 + 1.0d;
        r12[r123] = r13 + 1.0d;
        int r124 = r9 - 1;
        r2[r124][0] = (r10 - 1.0d) - r5;
        r12[r124] = (r13 - 1.0d) - r5;
    L8:
        r9 = r9 + 1;
        goto L4
    L10:
        return new g(r12, r2);
    }

    public static double k(double r10, double r12, double r14, double r16, double r18, double r20) {
        double r02 = r12 * r12;
        double r6 = r12 * 6.0d;
        double r2 = (((((-6.0d) * r02) * r16) + (r6 * r16)) + ((6.0d * r02) * r14)) - (r6 * r14);
        double r142 = 3.0d * r10;
        return ((((r2 + ((r142 * r20) * r02)) + ((r142 * r18) * r02)) - (((2.0d * r10) * r20) * r12)) - (((4.0d * r10) * r18) * r12)) + (r10 * r18);
    }

    public static double l(double r12, double r14, double r16, double r18, double r20, double r22) {
        double r02 = r14 * r14;
        double r2 = r02 * r14;
        double r6 = 3.0d * r02;
        double r4 = ((((((-2.0d) * r2) * r18) + (r6 * r18)) + ((r2 * 2.0d) * r16)) - (r6 * r16)) + r16;
        double r62 = r12 * r22;
        double r42 = r4 + (r62 * r2);
        double r10 = r12 * r20;
        return (((r42 + (r2 * r10)) - (r62 * r02)) - (((r12 * 2.0d) * r20) * r02)) + (r10 * r14);
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double c(double r23, int r25) {
        double[] r2 = this.f21124a;
        int r3 = r2.length;
        int r5 = 0;
        if (this.d == false) goto L13;
        double r6 = r2[0];
        if (r23 > r6) goto L9;
        double r32 = this.f21125b[0][r25];
        double r8 = r23 - r6;
        double r1 = f(r6, r25);
    L8:
        return r32 + (r8 * r1);
    L9:
        int r4 = r3 - 1;
        double r62 = r2[r4];
        if (r23 < r62) goto L21;
        r32 = this.f21125b[r4][r25];
        r8 = r23 - r62;
        r1 = f(r62, r25);
    L21:
        if (r5 >= (r3 - 1)) goto L31;
        double[] r22 = this.f21124a;
        double r63 = r22[r5];
        if (r23 == r63) goto L25;
        int r42 = r5 + 1;
        double r82 = r22[r42];
        if (r23 < r82) goto L28;
        r5 = r42;
        goto L21
    L28:
        double r10 = r82 - r63;
        double r12 = (r23 - r63) / r10;
        double[][] r24 = this.f21125b;
        double r14 = r24[r5][r25];
        double r16 = r24[r42][r25];
        double[][] r26 = this.f21126c;
        return l(r10, r12, r14, r16, r26[r5][r25], r26[r42][r25]);
    L25:
        return this.f21125b[r5][r25];
    L31:
        return 0.0d;
    L13:
        if (r23 <= r2[0]) goto L15;
        int r43 = r3 - 1;
        if (r23 < r2[r43]) goto L21;
        return this.f21125b[r43][r25];
    L15:
        return this.f21125b[0][r25];
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void d(double r24, double[] r26) {
        double[] r1 = this.f21124a;
        int r2 = r1.length;
        int r4 = 0;
        int r3 = this.f21125b[0].length;
        if (this.d == false) goto L15;
        double r5 = r1[0];
        if (r24 > r5) goto L9;
        g(r5, this.f21127e);
        int r12 = 0;
    L7:
        if (r12 >= r3) goto L37;
        r26[r12] = this.f21125b[0][r12] + ((r24 - this.f21124a[0]) * this.f21127e[r12]);
        r12 = r12 + 1;
        goto L7
    L37:
        return;
    L9:
        int r52 = r2 - 1;
        double r6 = r1[r52];
        if (r24 < r6) goto L23;
        g(r6, this.f21127e);
    L12:
        if (r4 >= r3) goto L46;
        r26[r4] = this.f21125b[r52][r4] + ((r24 - this.f21124a[r52]) * this.f21127e[r4]);
        r4 = r4 + 1;
        goto L12
    L46:
        return;
    L23:
        int r13 = 0;
    L25:
        if (r13 >= (r2 - 1)) goto L47;
        if (r24 != this.f21124a[r13]) goto L31;
        int r53 = 0;
    L29:
        if (r53 >= r3) goto L31;
        r26[r53] = this.f21125b[r13][r53];
        r53 = r53 + 1;
    L31:
        double[] r54 = this.f21124a;
        int r62 = r13 + 1;
        double r7 = r54[r62];
        if (r24 < r7) goto L33;
        r13 = r62;
        goto L25
    L33:
        double r9 = r54[r13];
        double r11 = r7 - r9;
        double r132 = (r24 - r9) / r11;
    L34:
        if (r4 >= r3) goto L48;
        double[][] r22 = this.f21125b;
        double r15 = r22[r13][r4];
        double r17 = r22[r62][r4];
        double[][] r23 = this.f21126c;
        r26[r4] = l(r11, r132, r15, r17, r23[r13][r4], r23[r62][r4]);
        r4 = r4 + 1;
        goto L34
    L48:
        return;
    L47:
        return;
    L15:
        if (r24 > r1[0]) goto L19;
        int r14 = 0;
    L17:
        if (r14 >= r3) goto L49;
        r26[r14] = this.f21125b[0][r14];
        r14 = r14 + 1;
        goto L17
    L49:
        return;
    L19:
        int r55 = r2 - 1;
        if (r24 < r1[r55]) goto L23;
    L21:
        if (r4 >= r3) goto L50;
        r26[r4] = this.f21125b[r55][r4];
        r4 = r4 + 1;
        goto L21
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void e(double r24, float[] r26) {
        double[] r1 = this.f21124a;
        int r2 = r1.length;
        int r4 = 0;
        int r3 = this.f21125b[0].length;
        if (this.d == false) goto L15;
        double r5 = r1[0];
        if (r24 > r5) goto L9;
        g(r5, this.f21127e);
        int r12 = 0;
    L7:
        if (r12 >= r3) goto L37;
        r26[r12] = (float) (this.f21125b[0][r12] + ((r24 - this.f21124a[0]) * this.f21127e[r12]));
        r12 = r12 + 1;
        goto L7
    L37:
        return;
    L9:
        int r52 = r2 - 1;
        double r6 = r1[r52];
        if (r24 < r6) goto L23;
        g(r6, this.f21127e);
    L12:
        if (r4 >= r3) goto L46;
        r26[r4] = (float) (this.f21125b[r52][r4] + ((r24 - this.f21124a[r52]) * this.f21127e[r4]));
        r4 = r4 + 1;
        goto L12
    L46:
        return;
    L23:
        int r13 = 0;
    L25:
        if (r13 >= (r2 - 1)) goto L47;
        if (r24 != this.f21124a[r13]) goto L31;
        int r53 = 0;
    L29:
        if (r53 >= r3) goto L31;
        r26[r53] = (float) this.f21125b[r13][r53];
        r53 = r53 + 1;
    L31:
        double[] r54 = this.f21124a;
        int r62 = r13 + 1;
        double r7 = r54[r62];
        if (r24 < r7) goto L33;
        r13 = r62;
        goto L25
    L33:
        double r9 = r54[r13];
        double r11 = r7 - r9;
        double r132 = (r24 - r9) / r11;
    L34:
        if (r4 >= r3) goto L48;
        double[][] r22 = this.f21125b;
        double r15 = r22[r13][r4];
        double r17 = r22[r62][r4];
        double[][] r23 = this.f21126c;
        r26[r4] = (float) l(r11, r132, r15, r17, r23[r13][r4], r23[r62][r4]);
        r4 = r4 + 1;
        goto L34
    L48:
        return;
    L47:
        return;
    L15:
        if (r24 > r1[0]) goto L19;
        int r14 = 0;
    L17:
        if (r14 >= r3) goto L49;
        r26[r14] = (float) this.f21125b[0][r14];
        r14 = r14 + 1;
        goto L17
    L49:
        return;
    L19:
        int r55 = r2 - 1;
        if (r24 < r1[r55]) goto L23;
    L21:
        if (r4 >= r3) goto L50;
        r26[r4] = (float) this.f21125b[r55][r4];
        r4 = r4 + 1;
        goto L21
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double f(double r24, int r26) {
        double[] r1 = this.f21124a;
        int r2 = r1.length;
        int r3 = 0;
        double r4 = r1[0];
        if (r24 < r4) goto L10;
        r4 = r1[r2 - 1];
        if (r24 >= r4) goto L10;
        r4 = r24;
    L10:
        if (r3 >= (r2 - 1)) goto L16;
        double[] r12 = this.f21124a;
        int r6 = r3 + 1;
        double r7 = r12[r6];
        if (r4 <= r7) goto L13;
        r3 = r6;
        goto L10
    L13:
        double r9 = r12[r3];
        double r11 = r7 - r9;
        double[][] r13 = this.f21125b;
        double r15 = r13[r3][r26];
        double r17 = r13[r6][r26];
        double[][] r14 = this.f21126c;
        return k(r11, (r4 - r9) / r11, r15, r17, r14[r3][r26], r14[r6][r26]) / r11;
    L16:
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void g(double r26, double[] r28) {
        double[] r1 = this.f21124a;
        int r2 = r1.length;
        int r4 = 0;
        int r3 = this.f21125b[0].length;
        double r5 = r1[0];
        if (r26 <= r5) goto L9;
        r5 = r1[r2 - 1];
        if (r26 >= r5) goto L9;
        r5 = r26;
    L9:
        int r12 = 0;
    L11:
        if (r12 >= (r2 - 1)) goto L18;
        double[] r7 = this.f21124a;
        int r8 = r12 + 1;
        double r9 = r7[r8];
        if (r5 <= r9) goto L14;
        r12 = r8;
        goto L11
    L14:
        double r11 = r7[r12];
        double r13 = r9 - r11;
        double r15 = (r5 - r11) / r13;
    L15:
        if (r4 >= r3) goto L22;
        double[][] r22 = this.f21125b;
        double r17 = r22[r12][r4];
        double r19 = r22[r8][r4];
        double[][] r23 = this.f21126c;
        r28[r4] = k(r13, r15, r17, r19, r23[r12][r4], r23[r8][r4]) / r13;
        r4 = r4 + 1;
        goto L15
    L22:
        return;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double[] h() {
        return this.f21124a;
    }
}
