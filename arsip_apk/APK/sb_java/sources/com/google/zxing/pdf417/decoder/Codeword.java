package com.google.zxing.pdf417.decoder;

/* loaded from: classes6.dex */
final class Codeword {
    private static final int BARCODE_ROW_UNKNOWN = -1;
    private final int bucket;
    private final int endX;
    private int rowNumber;
    private final int startX;
    private final int value;

    public Codeword(int r2, int r3, int r4, int r5) {
        this.rowNumber = -1;
        this.startX = r2;
        this.endX = r3;
        this.bucket = r4;
        this.value = r5;
    }

    public int getBucket() {
        return this.bucket;
    }

    public int getEndX() {
        return this.endX;
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public int getStartX() {
        return this.startX;
    }

    public int getValue() {
        return this.value;
    }

    public int getWidth() {
        return this.endX - this.startX;
    }

    public boolean hasValidRowNumber() {
        return isValidRowNumber(this.rowNumber);
    }

    public boolean isValidRowNumber(int r2) {
        if (r2 != (-1)) goto L5;
        return false;
    L5:
        if (this.bucket != ((r2 % 3) * 3)) goto L10;
        return true;
    L10:
        return false;
    }

    public void setRowNumber(int r1) {
        this.rowNumber = r1;
    }

    public void setRowNumberAsRowIndicatorColumn() {
        this.rowNumber = ((this.value / 30) * 3) + (this.bucket / 3);
    }

    public String toString() {
        return this.rowNumber + "|" + this.value;
    }
}
