package com.google.android.material.color.utilities;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes5.dex */
public final class Cam16 {
    static final double[][] CAM16RGB_TO_XYZ = null;
    static final double[][] XYZ_TO_CAM16RGB = null;
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;

    /* renamed from: j, reason: collision with root package name */
    private final double f38037j;
    private final double jstar;

    /* renamed from: m, reason: collision with root package name */
    private final double f38038m;

    /* renamed from: q, reason: collision with root package name */
    private final double f38039q;

    /* renamed from: s, reason: collision with root package name */
    private final double f38040s;
    private final double[] tempArray;

    static {
        XYZ_TO_CAM16RGB = new double[][]{new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
        CAM16RGB_TO_XYZ = new double[][]{new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};
    }

    private Cam16(double r2, double r4, double r6, double r8, double r10, double r12, double r14, double r16, double r18) {
        this.tempArray = new double[]{0.0d, 0.0d, 0.0d};
        this.hue = r2;
        this.chroma = r4;
        this.f38037j = r6;
        this.f38039q = r8;
        this.f38038m = r10;
        this.f38040s = r12;
        this.jstar = r14;
        this.astar = r16;
        this.bstar = r18;
    }

    public static Cam16 fromInt(int r1) {
        return fromIntInViewingConditions(r1, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromIntInViewingConditions(int r18, ViewingConditions r19) {
        int r02 = r18 & Constants.MAX_HOST_LENGTH;
        double r3 = ColorUtils.linearized((16711680 & r18) >> 16);
        double r1 = ColorUtils.linearized((65280 & r18) >> 8);
        double r5 = ColorUtils.linearized(r02);
        return fromXyzInViewingConditions(((0.41233895d * r3) + (0.35762064d * r1)) + (0.18051042d * r5), ((0.2126d * r3) + (0.7152d * r1)) + (0.0722d * r5), ((r3 * 0.01932141d) + (r1 * 0.11916382d)) + (r5 * 0.95034478d), r19);
    }

    public static Cam16 fromJch(double r7, double r9, double r11) {
        return fromJchInViewingConditions(r7, r9, r11, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(double r27, double r29, double r31, ViewingConditions r33) {
        double r4 = r27 / 100.0d;
        double r15 = (((4.0d / r33.getC()) * Math.sqrt(r4)) * (r33.getAw() + 4.0d)) * r33.getFlRoot();
        double r17 = r29 * r33.getFlRoot();
        double r19 = Math.sqrt(((r29 / Math.sqrt(r4)) * r33.getC()) / (r33.getAw() + 4.0d)) * 50.0d;
        double r02 = Math.toRadians(r31);
        double r21 = (1.7000000000000002d * r27) / ((0.007d * r27) + 1.0d);
        double r2 = Math.log1p(0.0228d * r17) * 43.859649122807014d;
        return new Cam16(r31, r29, r27, r15, r17, r19, r21, r2 * Math.cos(r02), r2 * Math.sin(r02));
    }

    public static Cam16 fromUcs(double r7, double r9, double r11) {
        return fromUcsInViewingConditions(r7, r9, r11, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double r4, double r6, double r8, ViewingConditions r10) {
        double r02 = (Math.expm1(Math.hypot(r6, r8) * 0.0228d) / 0.0228d) / r10.getFlRoot();
        double r62 = Math.atan2(r8, r6) * 57.29577951308232d;
        if (r62 >= 0.0d) goto L5;
        r62 = r62 + 360.0d;
    L5:
        double r82 = r62;
        return fromJchInViewingConditions(r4 / (1.0d - ((r4 - 100.0d) * 0.007d)), r02, r82, r10);
    }

    public static Cam16 fromXyzInViewingConditions(double r35, double r37, double r39, ViewingConditions r41) {
        double[][] r02 = XYZ_TO_CAM16RGB;
        double[] r2 = r02[0];
        double r3 = ((r2[0] * r35) + (r2[1] * r37)) + (r2[2] * r39);
        double[] r22 = r02[1];
        double r7 = ((r22[0] * r35) + (r22[1] * r37)) + (r22[2] * r39);
        double[] r03 = r02[2];
        double r9 = ((r03[0] * r35) + (r03[1] * r37)) + (r03[2] * r39);
        double r1 = r41.getRgbD()[0] * r3;
        double r32 = r41.getRgbD()[1] * r7;
        double r5 = r41.getRgbD()[2] * r9;
        double r72 = Math.pow((r41.getFl() * Math.abs(r1)) / 100.0d, 0.42d);
        double r13 = Math.pow((r41.getFl() * Math.abs(r32)) / 100.0d, 0.42d);
        double r92 = Math.pow((r41.getFl() * Math.abs(r5)) / 100.0d, 0.42d);
        double r04 = ((Math.signum(r1) * 400.0d) * r72) / (r72 + 27.13d);
        double r23 = ((Math.signum(r32) * 400.0d) * r13) / (r13 + 27.13d);
        double r4 = ((Math.signum(r5) * 400.0d) * r92) / (r92 + 27.13d);
        double r8 = (((r04 * 11.0d) + ((-12.0d) * r23)) + r4) / 11.0d;
        double r6 = ((r04 + r23) - (r4 * 2.0d)) / 9.0d;
        double r24 = r23 * 20.0d;
        double r14 = (((r04 * 20.0d) + r24) + (21.0d * r4)) / 20.0d;
        double r05 = (((r04 * 40.0d) + r24) + r4) / 20.0d;
        double r25 = Math.toDegrees(Math.atan2(r6, r8));
        if (r25 >= 0.0d) goto L7;
        r25 = r25 + 360.0d;
    L5:
        double r17 = r25;
        double r26 = Math.toRadians(r17);
        double r21 = Math.pow((r05 * r41.getNbb()) / r41.getAw(), r41.getC() * r41.getZ()) * 100.0d;
        double r19 = r21 / 100.0d;
        double r06 = ((4.0d / r41.getC()) * Math.sqrt(r19)) * (r41.getAw() + 4.0d);
        double r232 = r41.getFlRoot() * r06;
        if (r17 >= 20.14d) goto L12;
        double r12 = r17 + 360.0d;
    L13:
        double r07 = ((((((Math.cos(Math.toRadians(r12) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * r41.getNc()) * r41.getNcb()) * Math.hypot(r8, r6)) / (r14 + 0.305d);
        double r62 = Math.pow(1.64d - Math.pow(0.29d, r41.getN()), 0.73d) * Math.pow(r07, 0.9d);
        double r192 = r62 * Math.sqrt(r19);
        double r252 = r192 * r41.getFlRoot();
        double r27 = Math.sqrt((r62 * r41.getC()) / (r41.getAw() + 4.0d)) * 50.0d;
        double r29 = (1.7000000000000002d * r21) / ((0.007d * r21) + 1.0d);
        double r08 = Math.log1p(0.0228d * r252) * 43.859649122807014d;
        return new Cam16(r17, r192, r21, r232, r252, r27, r29, r08 * Math.cos(r26), r08 * Math.sin(r26));
    L12:
        r12 = r17;
        goto L13
    L7:
        if (r25 < 360.0d) goto L5;
        r25 = r25 - 360.0d;
        goto L5
    }

    public double distance(Cam16 r9) {
        double r02 = getJstar() - r9.getJstar();
        double r2 = getAstar() - r9.getAstar();
        double r4 = getBstar() - r9.getBstar();
        return Math.pow(Math.sqrt(((r02 * r02) + (r2 * r2)) + (r4 * r4)), 0.63d) * 1.41d;
    }

    public double getAstar() {
        return this.astar;
    }

    public double getBstar() {
        return this.bstar;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getJ() {
        return this.f38037j;
    }

    public double getJstar() {
        return this.jstar;
    }

    public double getM() {
        return this.f38038m;
    }

    public double getQ() {
        return this.f38039q;
    }

    public double getS() {
        return this.f38040s;
    }

    public int toInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public int viewed(ViewingConditions r8) {
        double[] r82 = xyzInViewingConditions(r8, this.tempArray);
        return ColorUtils.argbFromXyz(r82[0], r82[1], r82[2]);
    }

    public double[] xyzInViewingConditions(ViewingConditions r25, double[] r26) {
        if (getChroma() != 0.0d) goto L5;
    L8:
        double r3 = 0.0d;
    L9:
        double r32 = Math.pow(r3 / Math.pow(1.64d - Math.pow(0.29d, r25.getN()), 0.73d), 1.1111111111111112d);
        double r9 = Math.toRadians(getHue());
        double r11 = (Math.cos(2.0d + r9) + 3.8d) * 0.25d;
        double r13 = r25.getAw() * Math.pow(getJ() / 100.0d, (1.0d / r25.getC()) / r25.getZ());
        double r112 = ((r11 * 3846.153846153846d) * r25.getNc()) * r25.getNcb();
        double r132 = r13 / r25.getNbb();
        double r02 = Math.sin(r9);
        double r2 = Math.cos(r9);
        double r92 = (((0.305d + r132) * 23.0d) * r32) / (((r112 * 23.0d) + ((11.0d * r32) * r2)) + ((108.0d * r32) * r02));
        double r22 = r2 * r92;
        double r93 = r92 * r02;
        double r133 = r132 * 460.0d;
        double r03 = (((451.0d * r22) + r133) + (288.0d * r93)) / 1403.0d;
        double r15 = ((r133 - (891.0d * r22)) - (261.0d * r93)) / 1403.0d;
        double r134 = ((r133 - (r22 * 220.0d)) - (r93 * 6300.0d)) / 1403.0d;
        double r04 = (Math.signum(r03) * (100.0d / r25.getFl())) * Math.pow(Math.max(0.0d, (Math.abs(r03) * 27.13d) / (400.0d - Math.abs(r03))), 2.380952380952381d);
        double r152 = (Math.signum(r15) * (100.0d / r25.getFl())) * Math.pow(Math.max(0.0d, (Math.abs(r15) * 27.13d) / (400.0d - Math.abs(r15))), 2.380952380952381d);
        double r4 = (Math.signum(r134) * (100.0d / r25.getFl())) * Math.pow(Math.max(0.0d, (Math.abs(r134) * 27.13d) / (400.0d - Math.abs(r134))), 2.380952380952381d);
        double r05 = r04 / r25.getRgbD()[0];
        double r153 = r152 / r25.getRgbD()[1];
        double r42 = r4 / r25.getRgbD()[2];
        double[][] r23 = CAM16RGB_TO_XYZ;
        double[] r33 = r23[0];
        double r6 = ((r33[0] * r05) + (r33[1] * r153)) + (r33[2] * r42);
        double[] r34 = r23[1];
        double r8 = ((r34[0] * r05) + (r34[1] * r153)) + (r34[2] * r42);
        double[] r24 = r23[2];
        double r06 = ((r05 * r24[0]) + (r153 * r24[1])) + (r42 * r24[2]);
        if (r26 == null) goto L14;
        r26[0] = r6;
        r26[1] = r8;
        r26[2] = r06;
        return r26;
    L14:
        return new double[]{r6, r8, r06};
    L5:
        if (getJ() == 0.0d) goto L8;
        r3 = getChroma() / Math.sqrt(getJ() / 100.0d);
        goto L9
    }
}
