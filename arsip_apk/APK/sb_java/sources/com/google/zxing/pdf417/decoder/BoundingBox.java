package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
final class BoundingBox {
    private final ResultPoint bottomLeft;
    private final ResultPoint bottomRight;
    private final BitMatrix image;
    private final int maxX;
    private final int maxY;
    private final int minX;
    private final int minY;
    private final ResultPoint topLeft;
    private final ResultPoint topRight;

    public BoundingBox(BitMatrix r4, ResultPoint r5, ResultPoint r6, ResultPoint r7, ResultPoint r8) throws NotFoundException {
        boolean r02 = false;
        if (r5 == null) goto L7;
        if (r6 == null) goto L7;
        boolean r2 = false;
    L8:
        if (r7 == null) goto L10;
        if (r8 == null) goto L10;
    L11:
        if (r2 == false) goto L16;
        if (r02 == false) goto L16;
        throw NotFoundException.getNotFoundInstance();
    L16:
        if (r2 == false) goto L18;
        r5 = new ResultPoint(0.0f, r7.getY());
        r6 = new ResultPoint(0.0f, r8.getY());
    L20:
        this.image = r4;
        this.topLeft = r5;
        this.bottomLeft = r6;
        this.topRight = r7;
        this.bottomRight = r8;
        this.minX = (int) Math.min(r5.getX(), r6.getX());
        this.maxX = (int) Math.max(r7.getX(), r8.getX());
        this.minY = (int) Math.min(r5.getY(), r7.getY());
        this.maxY = (int) Math.max(r6.getY(), r8.getY());
        return;
    L18:
        if (r02 == false) goto L20;
        r7 = new ResultPoint(r4.getWidth() - 1, r5.getY());
        r8 = new ResultPoint(r4.getWidth() - 1, r6.getY());
    L10:
        r02 = true;
    L7:
        r2 = true;
        goto L8
    }

    public static BoundingBox merge(BoundingBox r6, BoundingBox r7) throws NotFoundException {
        if (r6 != null) goto L4;
        return r7;
    L4:
        if (r7 != null) goto L7;
        return r6;
    L7:
        return new BoundingBox(r6.image, r6.topLeft, r6.bottomLeft, r7.topRight, r7.bottomRight);
    }

    public BoundingBox addMissingRows(int r13, int r14, boolean r15) throws NotFoundException {
        ResultPoint r02 = this.topLeft;
        ResultPoint r1 = this.bottomLeft;
        ResultPoint r2 = this.topRight;
        ResultPoint r3 = this.bottomRight;
        if (r13 <= 0) goto L15;
        if (r15 == false) goto L6;
        ResultPoint r4 = r02;
    L7:
        int r5 = ((int) r4.getY()) - r13;
        if (r5 >= 0) goto L10;
        r5 = 0;
    L10:
        ResultPoint r132 = new ResultPoint(r4.getX(), r5);
        if (r15 == false) goto L14;
        ResultPoint r8 = r132;
    L13:
        ResultPoint r10 = r2;
    L16:
        if (r14 <= 0) goto L28;
        if (r15 == false) goto L19;
        ResultPoint r133 = this.bottomLeft;
    L20:
        int r03 = ((int) r133.getY()) + r14;
        if (r03 < this.image.getHeight()) goto L23;
        r03 = this.image.getHeight() - 1;
    L23:
        ResultPoint r142 = new ResultPoint(r133.getX(), r03);
        if (r15 == false) goto L27;
        ResultPoint r9 = r142;
    L26:
        ResultPoint r11 = r3;
    L30:
        return new BoundingBox(this.image, r8, r9, r10, r11);
    L27:
        r11 = r142;
        r9 = r1;
        goto L30
    L19:
        r133 = this.bottomRight;
        goto L20
    L28:
        r9 = r1;
        goto L26
    L14:
        r10 = r132;
        r8 = r02;
        goto L16
    L6:
        r4 = r2;
        goto L7
    L15:
        r8 = r02;
        goto L13
    }

    public ResultPoint getBottomLeft() {
        return this.bottomLeft;
    }

    public ResultPoint getBottomRight() {
        return this.bottomRight;
    }

    public int getMaxX() {
        return this.maxX;
    }

    public int getMaxY() {
        return this.maxY;
    }

    public int getMinX() {
        return this.minX;
    }

    public int getMinY() {
        return this.minY;
    }

    public ResultPoint getTopLeft() {
        return this.topLeft;
    }

    public ResultPoint getTopRight() {
        return this.topRight;
    }

    public BoundingBox(BoundingBox r2) {
        this.image = r2.image;
        this.topLeft = r2.getTopLeft();
        this.bottomLeft = r2.getBottomLeft();
        this.topRight = r2.getTopRight();
        this.bottomRight = r2.getBottomRight();
        this.minX = r2.getMinX();
        this.maxX = r2.getMaxX();
        this.minY = r2.getMinY();
        this.maxY = r2.getMaxY();
    }
}
