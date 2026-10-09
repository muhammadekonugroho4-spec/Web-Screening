package com.google.zxing.common;

/* loaded from: classes6.dex */
public final class PerspectiveTransform {
    private final float a11;
    private final float a12;
    private final float a13;
    private final float a21;
    private final float a22;
    private final float a23;
    private final float a31;
    private final float a32;
    private final float a33;

    private PerspectiveTransform(float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9) {
        this.a11 = r1;
        this.a12 = r4;
        this.a13 = r7;
        this.a21 = r2;
        this.a22 = r5;
        this.a23 = r8;
        this.a31 = r3;
        this.a32 = r6;
        this.a33 = r9;
    }

    public static PerspectiveTransform quadrilateralToQuadrilateral(float r02, float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13, float r14, float r15) {
        PerspectiveTransform r03 = quadrilateralToSquare(r02, r1, r2, r3, r4, r5, r6, r7);
        return squareToQuadrilateral(r8, r9, r10, r11, r12, r13, r14, r15).times(r03);
    }

    public static PerspectiveTransform quadrilateralToSquare(float r02, float r1, float r2, float r3, float r4, float r5, float r6, float r7) {
        return squareToQuadrilateral(r02, r1, r2, r3, r4, r5, r6, r7).buildAdjoint();
    }

    public static PerspectiveTransform squareToQuadrilateral(float r14, float r15, float r16, float r17, float r18, float r19, float r20, float r21) {
        float r02 = ((r14 - r16) + r18) - r20;
        float r1 = ((r15 - r17) + r19) - r21;
        if (r02 == 0.0f) goto L5;
    L8:
        float r2 = r16 - r18;
        float r3 = r20 - r18;
        float r4 = r17 - r19;
        float r5 = r21 - r19;
        float r6 = (r2 * r5) - (r3 * r4);
        float r11 = ((r5 * r02) - (r3 * r1)) / r6;
        float r12 = ((r2 * r1) - (r02 * r4)) / r6;
        return new PerspectiveTransform((r16 - r14) + (r11 * r16), (r20 - r14) + (r12 * r20), r14, (r17 - r15) + (r11 * r17), (r21 - r15) + (r12 * r21), r15, r11, r12, 1.0f);
    L5:
        if (r1 != 0.0f) goto L8;
        return new PerspectiveTransform(r16 - r14, r18 - r16, r14, r17 - r15, r19 - r17, r15, 0.0f, 0.0f, 1.0f);
    }

    public PerspectiveTransform buildAdjoint() {
        float r1 = this.a22;
        float r2 = this.a33;
        float r4 = this.a23;
        float r5 = this.a32;
        float r3 = (r1 * r2) - (r4 * r5);
        float r6 = this.a31;
        float r8 = this.a21;
        float r7 = (r4 * r6) - (r8 * r2);
        float r9 = (r8 * r5) - (r1 * r6);
        float r10 = this.a13;
        float r12 = this.a12;
        float r11 = (r10 * r5) - (r12 * r2);
        float r13 = this.a11;
        return new PerspectiveTransform(r3, r7, r9, r11, (r2 * r13) - (r10 * r6), (r6 * r12) - (r5 * r13), (r12 * r4) - (r10 * r1), (r10 * r8) - (r4 * r13), (r13 * r1) - (r12 * r8));
    }

    public PerspectiveTransform times(PerspectiveTransform r20) {
        float r3 = this.a11;
        float r4 = r20.a11;
        float r6 = this.a21;
        float r7 = r20.a12;
        float r5 = (r3 * r4) + (r6 * r7);
        float r8 = this.a31;
        float r9 = r20.a13;
        float r52 = r5 + (r8 * r9);
        float r10 = r20.a21;
        float r12 = r20.a22;
        float r11 = (r3 * r10) + (r6 * r12);
        float r13 = r20.a23;
        float r112 = r11 + (r8 * r13);
        float r14 = r20.a31;
        float r15 = r20.a32;
        float r1 = r20.a33;
        float r32 = ((r3 * r14) + (r6 * r15)) + (r8 * r1);
        float r62 = this.a12;
        float r16 = this.a22;
        float r82 = (r62 * r4) + (r16 * r7);
        float r17 = this.a32;
        float r83 = r82 + (r17 * r9);
        float r172 = ((r62 * r10) + (r16 * r12)) + (r17 * r13);
        float r63 = ((r62 * r14) + (r16 * r15)) + (r17 * r1);
        float r18 = this.a13;
        float r42 = r4 * r18;
        float r19 = this.a23;
        float r43 = r42 + (r7 * r19);
        float r72 = this.a33;
        return new PerspectiveTransform(r52, r112, r32, r83, r172, r63, r43 + (r9 * r72), ((r18 * r10) + (r12 * r19)) + (r13 * r72), ((r18 * r14) + (r19 * r15)) + (r72 * r1));
    }

    public void transformPoints(float[] r20) {
        int r2 = r20.length;
        float r3 = this.a11;
        float r4 = this.a12;
        float r5 = this.a13;
        float r6 = this.a21;
        float r7 = this.a22;
        float r8 = this.a23;
        float r9 = this.a31;
        float r10 = this.a32;
        float r11 = this.a33;
        int r12 = 0;
    L3:
        if (r12 >= r2) goto L5;
        float r13 = r20[r12];
        int r14 = r12 + 1;
        float r15 = r20[r14];
        float r16 = ((r5 * r13) + (r8 * r15)) + r11;
        r20[r12] = (((r3 * r13) + (r6 * r15)) + r9) / r16;
        r20[r14] = (((r13 * r4) + (r15 * r7)) + r10) / r16;
        r12 = r12 + 2;
        goto L3
    }

    public void transformPoints(float[] r8, float[] r9) {
        int r02 = r8.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        float r2 = r8[r1];
        float r3 = r9[r1];
        float r4 = ((this.a13 * r2) + (this.a23 * r3)) + this.a33;
        r8[r1] = (((this.a11 * r2) + (this.a21 * r3)) + this.a31) / r4;
        r9[r1] = (((this.a12 * r2) + (this.a22 * r3)) + this.a32) / r4;
        r1 = r1 + 1;
        goto L3
    }
}
