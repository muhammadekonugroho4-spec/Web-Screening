package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* loaded from: classes6.dex */
public class DefaultPlacement {
    private final byte[] bits;
    private final CharSequence codewords;
    private final int numcols;
    private final int numrows;

    public DefaultPlacement(CharSequence r1, int r2, int r3) {
        this.codewords = r1;
        this.numcols = r2;
        this.numrows = r3;
        byte[] r12 = new byte[r2 * r3];
        this.bits = r12;
        Arrays.fill(r12, (byte) -1);
    }

    private void corner1(int r7) {
        module(this.numrows - 1, 0, r7, 1);
        module(this.numrows - 1, 1, r7, 2);
        module(this.numrows - 1, 2, r7, 3);
        module(0, this.numcols - 2, r7, 4);
        module(0, this.numcols - 1, r7, 5);
        module(1, this.numcols - 1, r7, 6);
        module(2, this.numcols - 1, r7, 7);
        module(3, this.numcols - 1, r7, 8);
    }

    private void corner2(int r7) {
        module(this.numrows - 3, 0, r7, 1);
        module(this.numrows - 2, 0, r7, 2);
        module(this.numrows - 1, 0, r7, 3);
        module(0, this.numcols - 4, r7, 4);
        module(0, this.numcols - 3, r7, 5);
        module(0, this.numcols - 2, r7, 6);
        module(0, this.numcols - 1, r7, 7);
        module(1, this.numcols - 1, r7, 8);
    }

    private void corner3(int r7) {
        module(this.numrows - 3, 0, r7, 1);
        module(this.numrows - 2, 0, r7, 2);
        module(this.numrows - 1, 0, r7, 3);
        module(0, this.numcols - 2, r7, 4);
        module(0, this.numcols - 1, r7, 5);
        module(1, this.numcols - 1, r7, 6);
        module(2, this.numcols - 1, r7, 7);
        module(3, this.numcols - 1, r7, 8);
    }

    private void corner4(int r7) {
        module(this.numrows - 1, 0, r7, 1);
        module(this.numrows - 1, this.numcols - 1, r7, 2);
        module(0, this.numcols - 3, r7, 3);
        module(0, this.numcols - 2, r7, 4);
        module(0, this.numcols - 1, r7, 5);
        module(1, this.numcols - 3, r7, 6);
        module(1, this.numcols - 2, r7, 7);
        module(1, this.numcols - 1, r7, 8);
    }

    private boolean hasBit(int r3, int r4) {
        if (this.bits[(r4 * this.numcols) + r3] < 0) goto L6;
        return true;
    L6:
        return false;
    }

    private void module(int r2, int r3, int r4, int r5) {
        if (r2 >= 0) goto L4;
        int r02 = this.numrows;
        r2 = r2 + r02;
        r3 = r3 + (4 - ((r02 + 4) % 8));
    L4:
        if (r3 >= 0) goto L6;
        int r03 = this.numcols;
        r3 = r3 + r03;
        r2 = r2 + (4 - ((r03 + 4) % 8));
    L6:
        char r42 = this.codewords.charAt(r4);
        boolean r04 = true;
        if ((r42 & (1 << (8 - r5))) != 0) goto L10;
        r04 = false;
    L10:
        setBit(r3, r2, r04);
    }

    private void setBit(int r3, int r4, boolean r5) {
        this.bits[(r4 * this.numcols) + r3] = r5 ? 1 : 0;
    }

    private void utah(int r5, int r6, int r7) {
        int r02 = r5 - 2;
        int r1 = r6 - 2;
        module(r02, r1, r7, 1);
        int r2 = r6 - 1;
        module(r02, r2, r7, 2);
        int r03 = r5 - 1;
        module(r03, r1, r7, 3);
        module(r03, r2, r7, 4);
        module(r03, r6, r7, 5);
        module(r5, r1, r7, 6);
        module(r5, r2, r7, 7);
        module(r5, r6, r7, 8);
    }

    public final boolean getBit(int r3, int r4) {
        if (this.bits[(r4 * this.numcols) + r3] != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public final byte[] getBits() {
        return this.bits;
    }

    public final int getNumcols() {
        return this.numcols;
    }

    public final int getNumrows() {
        return this.numrows;
    }

    public final void place() {
        int r02 = 0;
        int r2 = 0;
        int r3 = 4;
    L4:
        if (r3 != this.numrows) goto L8;
        if (r02 != 0) goto L8;
        corner1(r2);
        r2 = r2 + 1;
    L8:
        if (r3 != (this.numrows - 2)) goto L14;
        if (r02 != 0) goto L14;
        if ((this.numcols % 4) == 0) goto L14;
        corner2(r2);
        r2 = r2 + 1;
    L14:
        if (r3 != (this.numrows - 2)) goto L20;
        if (r02 != 0) goto L20;
        if ((this.numcols % 8) != 4) goto L20;
        corner3(r2);
        r2 = r2 + 1;
    L20:
        if (r3 != (this.numrows + 4)) goto L26;
        if (r02 != 2) goto L26;
        if ((this.numcols % 8) != 0) goto L26;
        corner4(r2);
        r2 = r2 + 1;
    L26:
        if (r3 >= this.numrows) goto L31;
        if (r02 < 0) goto L31;
        if (hasBit(r02, r3) == true) goto L31;
        utah(r3, r02, r2);
        r2 = r2 + 1;
    L31:
        int r4 = r3 - 2;
        int r6 = r02 + 2;
        if (r4 < 0) goto L37;
        if (r6 >= this.numcols) goto L37;
        r3 = r4;
        r02 = r6;
    L37:
        int r32 = r3 - 1;
        int r03 = r02 + 5;
    L38:
        if (r32 >= 0) goto L40;
    L44:
        int r42 = r32 + 2;
        int r62 = r03 - 2;
        int r7 = this.numrows;
        if (r42 >= r7) goto L49;
        if (r62 < 0) goto L49;
        r32 = r42;
        r03 = r62;
    L49:
        r3 = r32 + 5;
        r02 = r03 - 1;
        if (r3 < r7) goto L4;
        int r43 = this.numcols;
        if (r02 < r43) goto L4;
        if (hasBit(r43 - 1, r7 - 1) == true) goto L67;
        setBit(this.numcols - 1, this.numrows - 1, true);
        setBit(this.numcols - 2, this.numrows - 2, true);
        return;
    L67:
        return;
    L40:
        if (r03 >= this.numcols) goto L44;
        if (hasBit(r03, r32) == true) goto L44;
        utah(r32, r03, r2);
        r2 = r2 + 1;
        goto L44
    }
}
