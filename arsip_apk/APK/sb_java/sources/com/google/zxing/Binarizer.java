package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
public abstract class Binarizer {
    private final LuminanceSource source;

    public Binarizer(LuminanceSource r1) {
        this.source = r1;
    }

    public abstract Binarizer createBinarizer(LuminanceSource r1);

    public abstract BitMatrix getBlackMatrix() throws NotFoundException;

    public abstract BitArray getBlackRow(int r1, BitArray r2) throws NotFoundException;

    public final int getHeight() {
        return this.source.getHeight();
    }

    public final LuminanceSource getLuminanceSource() {
        return this.source;
    }

    public final int getWidth() {
        return this.source.getWidth();
    }
}
