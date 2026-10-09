package com.google.android.material.color.utilities;

/* loaded from: classes5.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = null;
    private final double aw;

    /* renamed from: c, reason: collision with root package name */
    private final double f38057c;
    private final double fl;
    private final double flRoot;

    /* renamed from: n, reason: collision with root package name */
    private final double f38058n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;

    /* renamed from: z, reason: collision with root package name */
    private final double f38059z;

    static {
        DEFAULT = defaultWithBackgroundLstar(50.0d);
    }

    private ViewingConditions(double r1, double r3, double r5, double r7, double r9, double r11, double[] r13, double r14, double r16, double r18) {
        this.f38058n = r1;
        this.aw = r3;
        this.nbb = r5;
        this.ncb = r7;
        this.f38057c = r9;
        this.nc = r11;
        this.rgbD = r13;
        this.fl = r14;
        this.flRoot = r16;
        this.f38059z = r18;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double r8) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, r8, 2.0d, false);
    }

    public static ViewingConditions make(double[] r44, double r45, double r47, double r49, boolean r51) {
        double r5 = Math.max(0.1d, r47);
        double[][] r7 = Cam16.XYZ_TO_CAM16RGB;
        double r9 = r44[0];
        double[] r11 = r7[0];
        double r12 = r11[0] * r9;
        double r15 = r44[1];
        double r122 = r12 + (r11[1] * r15);
        double r18 = r44[2];
        double r123 = r122 + (r11[2] * r18);
        double[] r112 = r7[1];
        double r20 = ((r112[0] * r9) + (r112[1] * r15)) + (r112[2] * r18);
        double[] r72 = r7[2];
        double r92 = ((r9 * r72[0]) + (r15 * r72[1])) + (r18 * r72[2]);
        double r35 = (r49 / 10.0d) + 0.8d;
        if (r35 < 0.9d) goto L6;
        double r152 = MathUtils.lerp(0.59d, 0.69d, (r35 - 0.9d) * 10.0d);
    L5:
        double r33 = r152;
        if (r51 == false) goto L10;
        double r182 = 0.1d;
        double r26 = 1.0d;
    L11:
        double r3 = MathUtils.clampDouble(0.0d, 1.0d, r26);
        double[] r32 = {(((100.0d / r123) * r3) + 1.0d) - r3, (((100.0d / r20) * r3) + 1.0d) - r3, (((100.0d / r92) * r3) + 1.0d) - r3};
        double r24 = 5.0d * r45;
        double r262 = 1.0d / (r24 + 1.0d);
        double r28 = ((r262 * r262) * r262) * r262;
        double r153 = 1.0d - r28;
        double r02 = (r28 * r45) + (((r153 * r182) * r153) * Math.cbrt(r24));
        double r4 = ColorUtils.yFromLstar(r5) / r44[1];
        double r42 = Math.sqrt(r4) + 1.48d;
        double r29 = 0.725d / Math.pow(r4, 0.2d);
        double[] r124 = {Math.pow(((r32[0] * r02) * r123) / 100.0d, 0.42d), Math.pow(((r32[1] * r02) * r20) / 100.0d, 0.42d), Math.pow(((r32[2] * r02) * r92) / 100.0d, 0.42d)};
        double r6 = r124[0];
        double r10 = (r6 * 400.0d) / (r6 + 27.13d);
        double r62 = r124[1];
        double r154 = (r62 * 400.0d) / (r62 + 27.13d);
        double r63 = r124[2];
        double[] r2 = {r10, r154, (400.0d * r63) / (r63 + 27.13d)};
        return new ViewingConditions(r4, (((r2[0] * 2.0d) + r2[1]) + (r2[2] * 0.05d)) * r29, r29, r29, r33, r35, r32, r02, Math.pow(r02, 0.25d), r42);
    L10:
        r182 = 0.1d;
        r26 = (1.0d - (Math.exp(((-r45) - 42.0d) / 92.0d) * 0.2777777777777778d)) * r35;
        goto L11
    L6:
        r152 = MathUtils.lerp(0.525d, 0.59d, (r35 - 0.8d) * 10.0d);
        goto L5
    }

    public double getAw() {
        return this.aw;
    }

    public double getC() {
        return this.f38057c;
    }

    public double getFl() {
        return this.fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f38058n;
    }

    public double getNbb() {
        return this.nbb;
    }

    public double getNc() {
        return this.nc;
    }

    public double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    public double getZ() {
        return this.f38059z;
    }
}
