package com.google.zxing;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes6.dex */
public final class InvertedLuminanceSource extends LuminanceSource {
    private final LuminanceSource delegate;

    public InvertedLuminanceSource(LuminanceSource r3) {
        super(r3.getWidth(), r3.getHeight());
        this.delegate = r3;
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int r3, int r4, int r5, int r6) {
        return new InvertedLuminanceSource(this.delegate.crop(r3, r4, r5, r6));
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        byte[] r02 = this.delegate.getMatrix();
        int r1 = getWidth() * getHeight();
        byte[] r2 = new byte[r1];
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r2[r3] = (byte) (255 - (r02[r3] & UnsignedBytes.MAX_VALUE));
        r3 = r3 + 1;
        goto L3
    L5:
        return r2;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int r3, byte[] r4) {
        byte[] r32 = this.delegate.getRow(r3, r4);
        int r42 = getWidth();
        int r02 = 0;
    L3:
        if (r02 >= r42) goto L5;
        r32[r02] = (byte) (255 - (r32[r02] & UnsignedBytes.MAX_VALUE));
        r02 = r02 + 1;
        goto L3
    L5:
        return r32;
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource invert() {
        return this.delegate;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return this.delegate.isCropSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isRotateSupported() {
        return this.delegate.isRotateSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise() {
        return new InvertedLuminanceSource(this.delegate.rotateCounterClockwise());
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise45() {
        return new InvertedLuminanceSource(this.delegate.rotateCounterClockwise45());
    }
}
