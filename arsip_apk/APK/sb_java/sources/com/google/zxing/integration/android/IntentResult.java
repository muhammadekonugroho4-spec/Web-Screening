package com.google.zxing.integration.android;

/* loaded from: classes6.dex */
public final class IntentResult {
    private final String barcodeImagePath;
    private final String contents;
    private final String errorCorrectionLevel;
    private final String formatName;
    private final Integer orientation;
    private final byte[] rawBytes;

    public IntentResult() {
        this(null, null, null, null, null, null);
    }

    public String getBarcodeImagePath() {
        return this.barcodeImagePath;
    }

    public String getContents() {
        return this.contents;
    }

    public String getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    public String getFormatName() {
        return this.formatName;
    }

    public Integer getOrientation() {
        return this.orientation;
    }

    public byte[] getRawBytes() {
        return this.rawBytes;
    }

    public String toString() {
        byte[] r02 = this.rawBytes;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return "Format: " + this.formatName + "\nContents: " + this.contents + "\nRaw bytes: (" + r03 + " bytes)\nOrientation: " + this.orientation + "\nEC level: " + this.errorCorrectionLevel + "\nBarcode image: " + this.barcodeImagePath + '\n';
    L5:
        r03 = r02.length;
        goto L7
    }

    public IntentResult(String r1, String r2, byte[] r3, Integer r4, String r5, String r6) {
        this.contents = r1;
        this.formatName = r2;
        this.rawBytes = r3;
        this.orientation = r4;
        this.errorCorrectionLevel = r5;
        this.barcodeImagePath = r6;
    }
}
