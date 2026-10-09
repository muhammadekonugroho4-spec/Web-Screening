package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* loaded from: classes6.dex */
public final class BarcodeMatrix {
    private int currentRow;
    private final int height;
    private final BarcodeRow[] matrix;
    private final int width;

    public BarcodeMatrix(int r6, int r7) {
        BarcodeRow[] r02 = new BarcodeRow[r6];
        this.matrix = r02;
        int r03 = r02.length;
        int r1 = 0;
    L3:
        if (r1 >= r03) goto L5;
        this.matrix[r1] = new BarcodeRow(((r7 + 4) * 17) + 1);
        r1 = r1 + 1;
        goto L3
    L5:
        this.width = r7 * 17;
        this.height = r6;
        this.currentRow = -1;
    }

    public BarcodeRow getCurrentRow() {
        return this.matrix[this.currentRow];
    }

    public byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public byte[][] getScaledMatrix(int r8, int r9) {
        int r1 = 0;
        byte[][] r02 = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{this.height * r9, this.width * r8});
        int r2 = this.height * r9;
    L3:
        if (r1 >= r2) goto L5;
        r02[(r2 - r1) - 1] = this.matrix[r1 / r9].getScaledRow(r8);
        r1 = r1 + 1;
        goto L3
    L5:
        return r02;
    }

    public void set(int r2, int r3, byte r4) {
        this.matrix[r3].set(r2, r4);
    }

    public void startRow() {
        this.currentRow++;
    }
}
