package com.google.zxing;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes6.dex */
public final class RGBLuminanceSource extends LuminanceSource {
    private final int dataHeight;
    private final int dataWidth;
    private final int left;
    private final byte[] luminances;
    private final int top;

    public RGBLuminanceSource(int r5, int r6, int[] r7) {
        super(r5, r6);
        this.dataWidth = r5;
        this.dataHeight = r6;
        int r02 = 0;
        this.left = 0;
        this.top = 0;
        int r52 = r5 * r6;
        this.luminances = new byte[r52];
    L3:
        if (r02 >= r52) goto L5;
        int r62 = r7[r02];
        int r1 = (r62 >> 16) & Constants.MAX_HOST_LENGTH;
        int r2 = (r62 >> 7) & 510;
        int r63 = r62 & Constants.MAX_HOST_LENGTH;
        this.luminances[r02] = (byte) (((r1 + r2) + r63) / 4);
        r02 = r02 + 1;
        goto L3
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int r9, int r10, int r11, int r12) {
        return new RGBLuminanceSource(this.luminances, this.dataWidth, this.dataHeight, this.left + r9, this.top + r10, r11, r12);
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int r02 = getWidth();
        int r1 = getHeight();
        int r2 = this.dataWidth;
        if (r02 == r2) goto L5;
    L8:
        int r3 = r02 * r1;
        byte[] r4 = new byte[r3];
        int r5 = (this.top * r2) + this.left;
        int r6 = 0;
        if (r02 != r2) goto L12;
        System.arraycopy(this.luminances, r5, r4, 0, r3);
        return r4;
    L12:
        if (r6 >= r1) goto L14;
        byte[] r32 = this.luminances;
        System.arraycopy(r32, r5, r4, r6 * r02, r02);
        r5 = r5 + this.dataWidth;
        r6 = r6 + 1;
        goto L12
    L14:
        return r4;
    L5:
        if (r1 != this.dataHeight) goto L8;
        return this.luminances;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int r4, byte[] r5) {
        if (r4 < 0) goto L13;
        if (r4 >= getHeight()) goto L13;
        int r02 = getWidth();
        if (r5 != null) goto L8;
    L9:
        r5 = new byte[r02];
    L10:
        int r42 = ((r4 + this.top) * this.dataWidth) + this.left;
        System.arraycopy(this.luminances, r42, r5, 0, r02);
        return r5;
    L8:
        if (r5.length >= r02) goto L10;
    L13:
        throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(r4)));
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }

    private RGBLuminanceSource(byte[] r1, int r2, int r3, int r4, int r5, int r6, int r7) {
        super(r6, r7);
        if ((r6 + r4) > r2) goto L9;
        if ((r7 + r5) > r3) goto L9;
        this.luminances = r1;
        this.dataWidth = r2;
        this.dataHeight = r3;
        this.left = r4;
        this.top = r5;
        return;
    L9:
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }
}
