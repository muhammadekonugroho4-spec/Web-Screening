package com.google.zxing.qrcode.decoder;

import com.google.zxing.ResultPoint;

/* loaded from: classes6.dex */
public final class QRCodeDecoderMetaData {
    private final boolean mirrored;

    public QRCodeDecoderMetaData(boolean r1) {
        this.mirrored = r1;
    }

    public void applyMirroredCorrection(ResultPoint[] r5) {
        if (this.mirrored == false) goto L10;
        if (r5 != null) goto L6;
        return;
    L6:
        if (r5.length < 3) goto L12;
        ResultPoint r1 = r5[0];
        r5[0] = r5[2];
        r5[2] = r1;
        return;
    L12:
        return;
    }

    public boolean isMirrored() {
        return this.mirrored;
    }
}
