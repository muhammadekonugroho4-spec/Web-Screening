package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

@Deprecated
/* loaded from: classes6.dex */
public final class MonochromeRectangleDetector {
    private static final int MAX_MODULES = 32;
    private final BitMatrix image;

    public MonochromeRectangleDetector(BitMatrix r1) {
        this.image = r1;
    }

    private int[] blackWhiteRange(int r5, int r6, int r7, int r8, boolean r9) {
        int r02 = (r7 + r8) / 2;
        int r1 = r02;
    L3:
        if (r1 < r7) goto L27;
        BitMatrix r2 = this.image;
        if (r9 == false) goto L10;
        if (r2.get(r1, r5) == false) goto L12;
    L11:
        r1 = r1 - 1;
    L12:
        int r22 = r1;
    L13:
        r22 = r22 - 1;
        if (r22 < r7) goto L22;
        BitMatrix r3 = this.image;
        if (r9 == true) goto L18;
        if (r3.get(r5, r22) == false) goto L13;
    L18:
        if (r3.get(r22, r5) == false) goto L13;
    L22:
        int r32 = r1 - r22;
        if (r22 < r7) goto L27;
        if (r32 > r6) goto L27;
        r1 = r22;
        goto L3
    L10:
        if (r2.get(r5, r1) == false) goto L12;
    L27:
        int r12 = r1 + 1;
    L28:
        if (r02 >= r8) goto L52;
        BitMatrix r72 = this.image;
        if (r9 == false) goto L35;
        if (r72.get(r02, r5) == false) goto L37;
    L36:
        r02 = r02 + 1;
    L37:
        int r73 = r02;
    L38:
        r73 = r73 + 1;
        if (r73 >= r8) goto L47;
        BitMatrix r23 = this.image;
        if (r9 == true) goto L43;
        if (r23.get(r5, r73) == false) goto L38;
    L43:
        if (r23.get(r73, r5) == false) goto L38;
    L47:
        int r24 = r73 - r02;
        if (r73 >= r8) goto L52;
        if (r24 > r6) goto L52;
        r02 = r73;
        goto L28
    L35:
        if (r72.get(r5, r02) == false) goto L37;
    L52:
        int r03 = r02 - 1;
        if (r03 > r12) goto L55;
        return null;
    L55:
        return new int[]{r12, r03};
    }

    private ResultPoint findCornerFromCenter(int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22) throws NotFoundException {
        int[] r1 = null;
        int r3 = r14;
        int r8 = r18;
    L4:
        if (r8 >= r21) goto L50;
        if (r8 < r20) goto L50;
        if (r3 >= r17) goto L50;
        if (r3 < r16) goto L50;
        if (r15 != 0) goto L13;
        int[] r7 = blackWhiteRange(r8, r22, r16, r17, true);
    L14:
        if (r7 == null) goto L15;
        r8 = r8 + r19;
        r3 = r3 + r15;
        r1 = r7;
        goto L4
    L15:
        if (r1 == null) goto L47;
        char r2 = 0;
        if (r15 != 0) goto L32;
        int r82 = r8 - r19;
        int r02 = r1[0];
        if (r02 >= r14) goto L31;
        if (r1[1] <= r14) goto L29;
        if (r19 > 0) goto L27;
        r2 = 1;
    L27:
        return new ResultPoint(r1[r2], r82);
    L29:
        return new ResultPoint(r02, r82);
    L31:
        return new ResultPoint(r1[1], r82);
    L32:
        int r32 = r3 - r15;
        int r142 = r1[0];
        if (r142 >= r18) goto L45;
        if (r1[1] <= r18) goto L43;
        float r03 = r32;
        if (r15 < 0) goto L41;
        r2 = 1;
    L41:
        return new ResultPoint(r03, r1[r2]);
    L43:
        return new ResultPoint(r32, r142);
    L45:
        return new ResultPoint(r32, r1[1]);
    L47:
        throw NotFoundException.getNotFoundInstance();
    L13:
        r7 = blackWhiteRange(r3, r22, r20, r21, false);
    L50:
        throw NotFoundException.getNotFoundInstance();
    }

    public ResultPoint[] detect() throws NotFoundException {
        int r8 = this.image.getHeight();
        int r4 = this.image.getWidth();
        int r5 = r8 / 2;
        int r1 = r4 / 2;
        int r11 = Math.max(1, r8 / 256);
        int r12 = Math.max(1, r4 / 256);
        int r6 = -r11;
        int r9 = r1 / 2;
        int r7 = ((int) findCornerFromCenter(r1, 0, 0, r4, r5, r6, 0, r8, r9).getY()) - 1;
        int r92 = r5 / 2;
        ResultPoint r15 = findCornerFromCenter(r1, -r12, 0, r4, r5, 0, r7, r8, r92);
        int r3 = ((int) r15.getX()) - 1;
        ResultPoint r122 = findCornerFromCenter(r1, r12, r3, r4, r5, 0, r7, r8, r92);
        int r42 = ((int) r122.getX()) + 1;
        ResultPoint r112 = findCornerFromCenter(r1, 0, r3, r42, r5, r11, r7, r8, r9);
        return new ResultPoint[]{findCornerFromCenter(r1, 0, r3, r42, r5, r6, r7, ((int) r112.getY()) + 1, r1 / 4), r15, r122, r112};
    }
}
