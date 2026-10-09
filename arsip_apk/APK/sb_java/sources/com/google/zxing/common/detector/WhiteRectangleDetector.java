package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
public final class WhiteRectangleDetector {
    private static final int CORR = 1;
    private static final int INIT_SIZE = 10;
    private final int downInit;
    private final int height;
    private final BitMatrix image;
    private final int leftInit;
    private final int rightInit;
    private final int upInit;
    private final int width;

    public WhiteRectangleDetector(BitMatrix r4) throws NotFoundException {
        this(r4, 10, r4.getWidth() / 2, r4.getHeight() / 2);
    }

    private ResultPoint[] centerEdges(ResultPoint r7, ResultPoint r8, ResultPoint r9, ResultPoint r10) {
        float r02 = r7.getX();
        float r72 = r7.getY();
        float r1 = r8.getX();
        float r82 = r8.getY();
        float r2 = r9.getX();
        float r92 = r9.getY();
        float r3 = r10.getX();
        float r102 = r10.getY();
        if (r02 >= (this.width / 2.0f)) goto L7;
        return new ResultPoint[]{new ResultPoint(r3 - 1.0f, r102 + 1.0f), new ResultPoint(r1 + 1.0f, r82 + 1.0f), new ResultPoint(r2 - 1.0f, r92 - 1.0f), new ResultPoint(r02 + 1.0f, r72 - 1.0f)};
    L7:
        return new ResultPoint[]{new ResultPoint(r3 + 1.0f, r102 + 1.0f), new ResultPoint(r1 + 1.0f, r82 - 1.0f), new ResultPoint(r2 - 1.0f, r92 + 1.0f), new ResultPoint(r02 - 1.0f, r72 - 1.0f)};
    }

    private boolean containsBlackPoint(int r2, int r3, int r4, boolean r5) {
        if (r5 == false) goto L9;
    L4:
        if (r2 > r3) goto L14;
        if (this.image.get(r2, r4) == true) goto L7;
        r2 = r2 + 1;
        goto L4
    L7:
        return true;
    L14:
        return false;
    L9:
        if (r2 > r3) goto L20;
        if (this.image.get(r4, r2) == true) goto L12;
        r2 = r2 + 1;
        goto L9
    L12:
        return true;
    L20:
        return false;
    }

    private ResultPoint getBlackPointOnSegment(float r6, float r7, float r8, float r9) {
        int r02 = MathUtils.round(MathUtils.distance(r6, r7, r8, r9));
        float r1 = r02;
        float r82 = (r8 - r6) / r1;
        float r92 = (r9 - r7) / r1;
        int r12 = 0;
    L3:
        if (r12 >= r02) goto L9;
        float r2 = r12;
        int r3 = MathUtils.round((r2 * r82) + r6);
        int r22 = MathUtils.round((r2 * r92) + r7);
        if (this.image.get(r3, r22) == true) goto L7;
        r12 = r12 + 1;
        goto L3
    L7:
        return new ResultPoint(r3, r22);
    L9:
        return null;
    }

    public ResultPoint[] detect() throws NotFoundException {
        int r02 = this.leftInit;
        int r1 = this.rightInit;
        int r2 = this.upInit;
        int r3 = this.downInit;
        boolean r4 = false;
        int r5 = 1;
        boolean r7 = false;
        boolean r8 = false;
        boolean r9 = false;
        boolean r10 = false;
        boolean r11 = false;
        boolean r6 = true;
    L3:
        if (r6 == false) goto L54;
        boolean r12 = false;
        boolean r62 = true;
    L5:
        if (r62 == true) goto L8;
        if (r7 == false) goto L8;
    L15:
        if (r1 >= this.width) goto L16;
        boolean r63 = true;
    L18:
        if (r63 == true) goto L21;
        if (r8 == false) goto L21;
    L28:
        if (r3 >= this.height) goto L16;
        boolean r64 = true;
    L31:
        if (r64 == true) goto L33;
        if (r9 == false) goto L33;
    L39:
        if (r02 < 0) goto L16;
        r6 = r12;
        boolean r122 = true;
    L42:
        if (r122 == true) goto L44;
        if (r11 == false) goto L44;
    L50:
        if (r2 < 0) goto L16;
        if (r6 == false) goto L3;
        r10 = true;
    L44:
        if (r2 < 0) goto L50;
        r122 = containsBlackPoint(r02, r1, r2, true);
        if (r122 == true) goto L47;
        if (r11 == true) goto L42;
        r2 = r2 - 1;
        goto L42
    L47:
        r2 = r2 - 1;
        r6 = true;
        r11 = true;
    L33:
        if (r02 < 0) goto L39;
        r64 = containsBlackPoint(r2, r3, r02, false);
        if (r64 == true) goto L36;
        if (r9 == true) goto L31;
        r02 = r02 - 1;
        goto L31
    L36:
        r02 = r02 - 1;
        r9 = true;
        r12 = true;
    L21:
        if (r3 >= this.height) goto L28;
        r63 = containsBlackPoint(r02, r1, r3, true);
        if (r63 == true) goto L24;
        if (r8 == true) goto L18;
        r3 = r3 + 1;
        goto L18
    L24:
        r3 = r3 + 1;
        r8 = true;
        r12 = true;
    L16:
        r4 = true;
    L8:
        if (r1 >= this.width) goto L15;
        r62 = containsBlackPoint(r2, r3, r1, false);
        if (r62 == true) goto L11;
        if (r7 == true) goto L5;
        r1 = r1 + 1;
        goto L5
    L11:
        r1 = r1 + 1;
        r7 = true;
        r12 = true;
    L54:
        if (r4 == true) goto L86;
        if (r10 == false) goto L86;
        int r42 = r1 - r02;
        ResultPoint r65 = null;
        int r82 = 1;
        ResultPoint r72 = null;
    L57:
        if (r72 != null) goto L60;
        if (r82 >= r42) goto L60;
        r72 = getBlackPointOnSegment(r02, r3 - r82, r02 + r82, r3);
        r82 = r82 + 1;
    L60:
        if (r72 == null) goto L84;
        int r92 = 1;
        ResultPoint r83 = null;
    L62:
        if (r83 != null) goto L65;
        if (r92 >= r42) goto L65;
        r83 = getBlackPointOnSegment(r02, r2 + r92, r02 + r92, r2);
        r92 = r92 + 1;
    L65:
        if (r83 == null) goto L82;
        int r93 = 1;
        ResultPoint r03 = null;
    L67:
        if (r03 != null) goto L70;
        if (r93 >= r42) goto L70;
        r03 = getBlackPointOnSegment(r1, r2 + r93, r1 - r93, r2);
        r93 = r93 + 1;
    L70:
        if (r03 == null) goto L80;
    L71:
        if (r65 != null) goto L74;
        if (r5 >= r42) goto L74;
        r65 = getBlackPointOnSegment(r1, r3 - r5, r1 - r5, r3);
        r5 = r5 + 1;
    L74:
        if (r65 == null) goto L78;
        return centerEdges(r65, r72, r03, r83);
    L78:
        throw NotFoundException.getNotFoundInstance();
    L80:
        throw NotFoundException.getNotFoundInstance();
    L82:
        throw NotFoundException.getNotFoundInstance();
    L84:
        throw NotFoundException.getNotFoundInstance();
    L86:
        throw NotFoundException.getNotFoundInstance();
    }

    public WhiteRectangleDetector(BitMatrix r4, int r5, int r6, int r7) throws NotFoundException {
        this.image = r4;
        int r02 = r4.getHeight();
        this.height = r02;
        int r42 = r4.getWidth();
        this.width = r42;
        int r52 = r5 / 2;
        int r1 = r6 - r52;
        this.leftInit = r1;
        int r62 = r6 + r52;
        this.rightInit = r62;
        int r2 = r7 - r52;
        this.upInit = r2;
        int r72 = r7 + r52;
        this.downInit = r72;
        if (r2 < 0) goto L9;
        if (r1 < 0) goto L9;
        if (r72 >= r02) goto L9;
        if (r62 >= r42) goto L9;
        return;
    L9:
        throw NotFoundException.getNotFoundInstance();
    }
}
