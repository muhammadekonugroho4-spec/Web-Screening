package com.google.zxing;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes6.dex */
public abstract class LuminanceSource {
    private final int height;
    private final int width;

    public LuminanceSource(int r1, int r2) {
        this.width = r1;
        this.height = r2;
    }

    public LuminanceSource crop(int r1, int r2, int r3, int r4) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int getHeight() {
        return this.height;
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int r1, byte[] r2);

    public final int getWidth() {
        return this.width;
    }

    public LuminanceSource invert() {
        return new InvertedLuminanceSource(this);
    }

    public boolean isCropSupported() {
        return false;
    }

    public boolean isRotateSupported() {
        return false;
    }

    public LuminanceSource rotateCounterClockwise() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public LuminanceSource rotateCounterClockwise45() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        int r02 = this.width;
        byte[] r1 = new byte[r02];
        StringBuilder r2 = new StringBuilder(this.height * (r02 + 1));
        int r3 = 0;
    L4:
        if (r3 >= this.height) goto L21;
        r1 = getRow(r3, r1);
        int r4 = 0;
    L7:
        if (r4 >= this.width) goto L19;
        int r5 = r1[r4] & UnsignedBytes.MAX_VALUE;
        if (r5 >= 64) goto L12;
        char r52 = '#';
    L18:
        r2.append(r52);
        r4 = r4 + 1;
        goto L7
    L12:
        if (r5 >= 128) goto L15;
        r52 = '+';
        goto L18
    L15:
        if (r5 >= 192) goto L17;
        r52 = '.';
        goto L18
    L17:
        r52 = ' ';
        goto L18
    L19:
        r2.append('\n');
        r3 = r3 + 1;
        goto L4
    L21:
        return r2.toString();
    }
}
