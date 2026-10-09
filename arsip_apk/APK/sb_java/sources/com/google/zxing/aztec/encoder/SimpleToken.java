package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
final class SimpleToken extends Token {
    private final short bitCount;
    private final short value;

    public SimpleToken(Token r1, int r2, int r3) {
        super(r1);
        this.value = (short) r2;
        this.bitCount = (short) r3;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public void appendTo(BitArray r2, byte[] r3) {
        r2.appendBits(this.value, this.bitCount);
    }

    public String toString() {
        short r02 = this.value;
        short r1 = this.bitCount;
        return "<" + Integer.toBinaryString(((r02 & ((1 << r1) - 1)) | (1 << r1)) | (1 << this.bitCount)).substring(1) + '>';
    }
}
