package androidx.compose.animation.core;

/* renamed from: androidx.compose.animation.core.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2372d0 {
    public static final long a(double r25, double r27, double r29, double r31, double r33) {
        double r02 = (2.0d * r27) * Math.sqrt(r25);
        double r2 = (r02 * r02) - (4.0d * r25);
        double r4 = 0.0d;
        if (r2 >= 0.0d) goto L5;
        double r7 = 0.0d;
    L6:
        if (r2 >= 0.0d) goto L8;
        r4 = Math.sqrt(Math.abs(r2));
    L8:
        double r03 = -r02;
        return d((r03 + r7) * 0.5d, r4 * 0.5d, (r03 - r7) * 0.5d, r27, r29, r31, r33);
    L5:
        r7 = Math.sqrt(r2);
        goto L6
    }

    public static final long b(float r10, float r11, float r12, float r13, float r14) {
        if (r11 != 0.0f) goto L7;
        return 9223372036854L;
    L7:
        return a(r10, r11, r12, r13, r14);
    }

    public static final double c(double r20, double r22, double r24, double r26) {
        double r02 = r26;
        double r2 = r20 * r22;
        double r4 = r24 - r2;
        double r6 = Math.log(Math.abs(r02 / r22)) / r20;
        double r8 = Math.log(Math.abs(r02 / r4));
        int r10 = 0;
        double r12 = r8;
        int r11 = 0;
    L4:
        if (r11 >= 6) goto L6;
        r12 = r8 - Math.log(Math.abs(r12 / r20));
        r11 = r11 + 1;
        goto L4
    L6:
        double r122 = r12 / r20;
        if ((Double.doubleToRawLongBits(r6) & Long.MAX_VALUE) >= 9218868437227405312L) goto L9;
        boolean r82 = true;
    L10:
        if (r82 == true) goto L13;
        r6 = r122;
    L19:
        double r112 = (-(r2 + r4)) / (r20 * r4);
        double r13 = r20 * r112;
        double r132 = (Math.exp(r13) * r22) + ((r4 * r112) * Math.exp(r13));
        if (Double.isNaN(r112) == false) goto L22;
    L33:
        r02 = -r02;
    L35:
        double r113 = Double.MAX_VALUE;
    L37:
        if (r113 <= 0.001d) goto L41;
        if (r10 >= 100) goto L41;
        r10 = r10 + 1;
        double r133 = r20 * r6;
        double r242 = r02;
        double r03 = r6 - ((((r22 + (r4 * r6)) * Math.exp(r133)) + r02) / ((((1 + r133) * r4) + r2) * Math.exp(r133)));
        r113 = Math.abs(r6 - r03);
        r6 = r03;
        r02 = r242;
    L41:
        return r6;
    L22:
        if (r112 <= 0.0d) goto L33;
        if (r112 > 0.0d) goto L27;
    L34:
        r6 = (-(2.0d / r20)) - (r22 / r4);
        goto L35
    L27:
        if ((-r132) >= r02) goto L34;
        if (r4 >= 0.0d) goto L33;
        if (r22 <= 0.0d) goto L33;
        r6 = 0.0d;
        goto L33
    L13:
        if ((Double.doubleToRawLongBits(r122) & Long.MAX_VALUE) >= 9218868437227405312L) goto L15;
        boolean r83 = true;
    L16:
        if (r83 == false) goto L19;
        r6 = Math.max(r6, r122);
        goto L19
    L15:
        r83 = false;
        goto L16
    L9:
        r82 = false;
        goto L10
    }

    public static final long d(double r12, double r14, double r16, double r18, double r20, double r22, double r24) {
        double r02 = r20;
        if (r22 == 0.0d) goto L5;
    L8:
        if (r22 >= 0.0d) goto L10;
        r02 = -r02;
    L10:
        double r8 = r02;
        double r6 = Math.abs(r22);
        if (r18 <= 1.0d) goto L14;
        double r122 = e(r12, r16, r6, r8, r24);
    L18:
        return (long) (r122 * 1000.0d);
    L14:
        if (r18 >= 1.0d) goto L16;
        r122 = g(r12, r14, r6, r8, r24);
        goto L18
    L16:
        r122 = c(r12, r6, r8, r24);
        goto L18
    L5:
        if (r02 != 0.0d) goto L8;
        return 0;
    }

    public static final double e(double r24, double r26, double r28, double r30, double r32) {
        double r02 = r32;
        double r4 = r24 - r26;
        double r12 = ((r24 * r28) - r30) / r4;
        double r6 = r28 - r12;
        double r2 = Math.log(Math.abs(r02 / r6)) / r24;
        double r8 = Math.log(Math.abs(r02 / r12)) / r26;
        boolean r11 = true;
        if ((Double.doubleToRawLongBits(r2) & Long.MAX_VALUE) >= 9218868437227405312L) goto L5;
        boolean r10 = true;
    L6:
        if (r10 == true) goto L9;
        r2 = r8;
    L15:
        double r16 = r6 * r24;
        double r102 = Math.log(r16 / ((-r12) * r26)) / (r26 - r24);
        if (Double.isNaN(r102) == false) goto L18;
    L29:
        r02 = -r02;
    L31:
        double r82 = r12 * r26;
        if (Math.abs((Math.exp(r24 * r2) * r16) + (Math.exp(r26 * r2) * r82)) >= 1.0E-4d) goto L34;
        return r2;
    L34:
        double r42 = Double.MAX_VALUE;
        int r103 = 0;
    L36:
        if (r42 <= 0.001d) goto L40;
        if (r103 >= 100) goto L40;
        r103 = r103 + 1;
        double r43 = r24 * r2;
        double r18 = r26 * r2;
        double r44 = r2 - ((((Math.exp(r43) * r6) + (Math.exp(r18) * r12)) + r02) / ((Math.exp(r43) * r16) + (Math.exp(r18) * r82)));
        r42 = Math.abs(r2 - r44);
        r2 = r44;
    L40:
        return r2;
    L18:
        if (r102 <= 0.0d) goto L29;
        if (r102 > 0.0d) goto L23;
    L30:
        r2 = Math.log((-((r12 * r26) * r26)) / (r16 * r24)) / r4;
        goto L31
    L23:
        if ((-f(r6, r24, r102, r12, r26)) >= r02) goto L30;
        if (r12 <= 0.0d) goto L29;
        if (r6 >= 0.0d) goto L29;
        r2 = 0.0d;
        goto L29
    L9:
        if ((Double.doubleToRawLongBits(r8) & Long.MAX_VALUE) < 9218868437227405312L) goto L12;
        r11 = false;
    L12:
        if (r11 == false) goto L15;
        r2 = Math.max(r2, r8);
        goto L15
    L5:
        r10 = false;
        goto L6
    }

    public static final double f(double r02, double r2, double r4, double r6, double r8) {
        return (r02 * Math.exp(r2 * r4)) + (r6 * Math.exp(r8 * r4));
    }

    public static final double g(double r2, double r4, double r6, double r8, double r10) {
        double r82 = (r8 - (r2 * r6)) / r4;
        return Math.log(r10 / Math.sqrt((r6 * r6) + (r82 * r82))) / r2;
    }
}
