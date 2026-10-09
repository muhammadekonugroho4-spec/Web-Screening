package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes6.dex */
final class State {
    static final State INITIAL_STATE = null;
    private final int binaryShiftByteCount;
    private final int bitCount;
    private final int mode;
    private final Token token;

    static {
        INITIAL_STATE = new State(Token.EMPTY, 0, 0, 0);
    }

    private State(Token r1, int r2, int r3, int r4) {
        this.token = r1;
        this.mode = r2;
        this.binaryShiftByteCount = r3;
        this.bitCount = r4;
    }

    public State addBinaryShiftChar(int r7) {
        Token r02 = this.token;
        int r1 = this.mode;
        int r2 = this.bitCount;
        if (r1 != 4) goto L5;
    L6:
        int r12 = HighLevelEncoder.LATCH_TABLE[r1][0];
        int r4 = 65535 & r12;
        int r13 = r12 >> 16;
        r02 = r02.add(r4, r13);
        r2 = r2 + r13;
        r1 = 0;
    L7:
        int r3 = this.binaryShiftByteCount;
        if (r3 != 0) goto L10;
    L16:
        int r42 = 18;
    L17:
        State r5 = new State(r02, r1, r3 + 1, r2 + r42);
        if (r5.binaryShiftByteCount == 2078) goto L20;
        return r5;
    L20:
        return r5.endBinaryShift(r7 + 1);
    L10:
        if (r3 == 31) goto L16;
        if (r3 != 62) goto L15;
        r42 = 9;
        goto L17
    L15:
        r42 = 8;
        goto L17
    L5:
        if (r1 != 2) goto L7;
        goto L6
    }

    public State endBinaryShift(int r5) {
        int r02 = this.binaryShiftByteCount;
        if (r02 != 0) goto L6;
        return this;
    L6:
        return new State(this.token.addBinaryShift(r5 - r02, r02), this.mode, 0, this.bitCount);
    }

    public int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    public int getBitCount() {
        return this.bitCount;
    }

    public int getMode() {
        return this.mode;
    }

    public Token getToken() {
        return this.token;
    }

    public boolean isBetterThanOrEqualTo(State r4) {
        int r02 = this.bitCount + (HighLevelEncoder.LATCH_TABLE[this.mode][r4.mode] >> 16);
        int r1 = r4.binaryShiftByteCount;
        if (r1 <= 0) goto L9;
        int r2 = this.binaryShiftByteCount;
        if (r2 == 0) goto L7;
        if (r2 <= r1) goto L9;
    L7:
        r02 = r02 + 10;
    L9:
        if (r02 > r4.bitCount) goto L12;
        return true;
    L12:
        return false;
    }

    public State latchAndAppend(int r5, int r6) {
        int r02 = this.bitCount;
        Token r1 = this.token;
        int r2 = this.mode;
        if (r5 == r2) goto L6;
        int r22 = HighLevelEncoder.LATCH_TABLE[r2][r5];
        int r3 = 65535 & r22;
        int r23 = r22 >> 16;
        r1 = r1.add(r3, r23);
        r02 = r02 + r23;
    L6:
        if (r5 != 2) goto L8;
        int r24 = 4;
    L10:
        return new State(r1.add(r6, r24), r5, 0, r02 + r24);
    L8:
        r24 = 5;
        goto L10
    }

    public State shiftAndAppend(int r6, int r7) {
        Token r02 = this.token;
        int r1 = this.mode;
        if (r1 != 2) goto L5;
        int r2 = 4;
    L7:
        return new State(r02.add(HighLevelEncoder.SHIFT_TABLE[r1][r6], r2).add(r7, 5), this.mode, 0, (this.bitCount + r2) + 5);
    L5:
        r2 = 5;
        goto L7
    }

    public BitArray toBitArray(byte[] r4) {
        LinkedList r02 = new LinkedList();
        Token r1 = endBinaryShift(r4.length).token;
    L3:
        if (r1 == null) goto L5;
        r02.addFirst(r1);
        r1 = r1.getPrevious();
        goto L3
    L5:
        BitArray r12 = new BitArray();
        Iterator r03 = r02.iterator();
    L7:
        if (r03.hasNext() == false) goto L9;
        ((Token) r03.next()).appendTo(r12, r4);
        goto L7
    L9:
        return r12;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{HighLevelEncoder.MODE_NAMES[this.mode], Integer.valueOf(this.bitCount), Integer.valueOf(this.binaryShiftByteCount)});
    }
}
