package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
public final class BinaryBitmap {
    private final Binarizer binarizer;
    private BitMatrix matrix;

    public BinaryBitmap(Binarizer r2) {
        if (r2 == null) goto L7;
        this.binarizer = r2;
        return;
    L7:
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public BinaryBitmap crop(int r2, int r3, int r4, int r5) {
        LuminanceSource r22 = this.binarizer.getLuminanceSource().crop(r2, r3, r4, r5);
        return new BinaryBitmap(this.binarizer.createBinarizer(r22));
    }

    public BitMatrix getBlackMatrix() throws NotFoundException {
        if (this.matrix != null) goto L6;
        this.matrix = this.binarizer.getBlackMatrix();
    L6:
        return this.matrix;
    }

    public BitArray getBlackRow(int r2, BitArray r3) throws NotFoundException {
        return this.binarizer.getBlackRow(r2, r3);
    }

    public int getHeight() {
        return this.binarizer.getHeight();
    }

    public int getWidth() {
        return this.binarizer.getWidth();
    }

    public boolean isCropSupported() {
        return this.binarizer.getLuminanceSource().isCropSupported();
    }

    public boolean isRotateSupported() {
        return this.binarizer.getLuminanceSource().isRotateSupported();
    }

    public BinaryBitmap rotateCounterClockwise() {
        LuminanceSource r02 = this.binarizer.getLuminanceSource().rotateCounterClockwise();
        return new BinaryBitmap(this.binarizer.createBinarizer(r02));
    }

    public BinaryBitmap rotateCounterClockwise45() {
        LuminanceSource r02 = this.binarizer.getLuminanceSource().rotateCounterClockwise45();
        return new BinaryBitmap(this.binarizer.createBinarizer(r02));
    }

    public String toString() {
        return getBlackMatrix().toString();
    L4:
        return "";
    }
}
