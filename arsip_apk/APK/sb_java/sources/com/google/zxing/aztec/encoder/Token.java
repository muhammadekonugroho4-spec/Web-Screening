package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
abstract class Token {
    static final Token EMPTY = null;
    private final Token previous;

    static {
        EMPTY = new SimpleToken(null, 0, 0);
    }

    public Token(Token r1) {
        this.previous = r1;
    }

    public final Token add(int r2, int r3) {
        return new SimpleToken(this, r2, r3);
    }

    public final Token addBinaryShift(int r2, int r3) {
        return new BinaryShiftToken(this, r2, r3);
    }

    public abstract void appendTo(BitArray r1, byte[] r2);

    public final Token getPrevious() {
        return this.previous;
    }
}
