package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
final class BinaryShiftToken extends Token {
    private final short binaryShiftByteCount;
    private final short binaryShiftStart;

    public BinaryShiftToken(Token r1, int r2, int r3) {
        super(r1);
        this.binaryShiftStart = (short) r2;
        this.binaryShiftByteCount = (short) r3;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public void appendTo(BitArray r6, byte[] r7) {
        int r02 = 0;
    L3:
        short r1 = this.binaryShiftByteCount;
        if (r02 >= r1) goto L16;
        if (r02 == 0) goto L9;
        if (r02 != 31) goto L15;
        if (r1 <= 62) goto L9;
    L15:
        r6.appendBits(r7[this.binaryShiftStart + r02], 8);
        r02 = r02 + 1;
    L9:
        r6.appendBits(31, 5);
        short r4 = this.binaryShiftByteCount;
        if (r4 <= 62) goto L12;
        r6.appendBits(r4 - 31, 16);
        goto L15
    L12:
        if (r02 != 0) goto L14;
        r6.appendBits(Math.min(r4, 31), 5);
        goto L15
    L14:
        r6.appendBits(r4 - 31, 5);
        goto L15
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder("<");
        r02.append(this.binaryShiftStart);
        r02.append("::");
        r02.append((this.binaryShiftStart + this.binaryShiftByteCount) - 1);
        r02.append('>');
        return r02.toString();
    }
}
