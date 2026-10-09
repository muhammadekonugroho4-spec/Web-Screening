package com.google.zxing.pdf417.decoder;

/* loaded from: classes6.dex */
final class BarcodeMetadata {
    private final int columnCount;
    private final int errorCorrectionLevel;
    private final int rowCount;
    private final int rowCountLowerPart;
    private final int rowCountUpperPart;

    public BarcodeMetadata(int r1, int r2, int r3, int r4) {
        this.columnCount = r1;
        this.errorCorrectionLevel = r4;
        this.rowCountUpperPart = r2;
        this.rowCountLowerPart = r3;
        this.rowCount = r2 + r3;
    }

    public int getColumnCount() {
        return this.columnCount;
    }

    public int getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowCountLowerPart() {
        return this.rowCountLowerPart;
    }

    public int getRowCountUpperPart() {
        return this.rowCountUpperPart;
    }
}
