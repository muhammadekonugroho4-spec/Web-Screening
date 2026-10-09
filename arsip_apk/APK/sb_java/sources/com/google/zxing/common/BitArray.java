package com.google.zxing.common;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class BitArray implements Cloneable {
    private int[] bits;
    private int size;

    public BitArray() {
        this.size = 0;
        this.bits = new int[1];
    }

    private void ensureCapacity(int r4) {
        if (r4 <= (this.bits.length << 5)) goto L6;
        int[] r42 = makeArray(r4);
        int[] r02 = this.bits;
        System.arraycopy(r02, 0, r42, 0, r02.length);
        this.bits = r42;
        return;
    }

    private static int[] makeArray(int r02) {
        return new int[(r02 + 31) / 32];
    }

    public void appendBit(boolean r5) {
        ensureCapacity(this.size + 1);
        if (r5 == false) goto L5;
        int[] r52 = this.bits;
        int r02 = this.size;
        int r2 = r02 / 32;
        r52[r2] = (1 << (r02 & 31)) | r52[r2];
    L5:
        this.size++;
    }

    public void appendBitArray(BitArray r4) {
        int r02 = r4.size;
        ensureCapacity(this.size + r02);
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        appendBit(r4.get(r1));
        r1 = r1 + 1;
        goto L3
    }

    public void appendBits(int r3, int r4) {
        if (r4 < 0) goto L14;
        if (r4 > 32) goto L14;
        ensureCapacity(this.size + r4);
    L6:
        if (r4 <= 0) goto L12;
        boolean r1 = true;
        if (((r3 >> (r4 - 1)) & 1) == 1) goto L11;
        r1 = false;
    L11:
        appendBit(r1);
        r4 = r4 - 1;
        goto L6
    L12:
        return;
    L14:
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public void clear() {
        int r02 = this.bits.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        this.bits[r2] = 0;
        r2 = r2 + 1;
        goto L3
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m287clone() throws CloneNotSupportedException {
        return clone();
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof BitArray) == true) goto L5;
        return false;
    L5:
        BitArray r42 = (BitArray) r4;
        if (this.size == r42.size) goto L8;
    L11:
        return false;
    L8:
        if (Arrays.equals(this.bits, r42.bits) == false) goto L11;
        return true;
    }

    public void flip(int r5) {
        int[] r02 = this.bits;
        int r1 = r5 / 32;
        int r52 = 1 << (r5 & 31);
        r02[r1] = r52 ^ r02[r1];
    }

    public boolean get(int r3) {
        int r02 = this.bits[r3 / 32];
        if (((1 << (r3 & 31)) & r02) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public int[] getBitArray() {
        return this.bits;
    }

    public int getNextSet(int r4) {
        int r02 = this.size;
        if (r4 < r02) goto L5;
        return r02;
    L5:
        int r03 = r4 / 32;
        int r1 = this.bits[r03];
        int r42 = (~((1 << (r4 & 31)) - 1)) & r1;
    L6:
        if (r42 != 0) goto L12;
        r03 = r03 + 1;
        int[] r43 = this.bits;
        if (r03 == r43.length) goto L10;
        r42 = r43[r03];
        goto L6
    L10:
        return this.size;
    L12:
        int r04 = (r03 << 5) + Integer.numberOfTrailingZeros(r42);
        int r44 = this.size;
        if (r04 <= r44) goto L15;
        return r44;
    L15:
        return r04;
    }

    public int getNextUnset(int r4) {
        int r02 = this.size;
        if (r4 < r02) goto L5;
        return r02;
    L5:
        int r03 = r4 / 32;
        int r1 = ~this.bits[r03];
        int r42 = (~((1 << (r4 & 31)) - 1)) & r1;
    L6:
        if (r42 != 0) goto L12;
        r03 = r03 + 1;
        int[] r43 = this.bits;
        if (r03 == r43.length) goto L10;
        r42 = ~r43[r03];
        goto L6
    L10:
        return this.size;
    L12:
        int r04 = (r03 << 5) + Integer.numberOfTrailingZeros(r42);
        int r44 = this.size;
        if (r04 <= r44) goto L15;
        return r44;
    L15:
        return r04;
    }

    public int getSize() {
        return this.size;
    }

    public int getSizeInBytes() {
        return (this.size + 7) / 8;
    }

    public int hashCode() {
        return (this.size * 31) + Arrays.hashCode(this.bits);
    }

    public boolean isRange(int r9, int r10, boolean r11) {
        if (r10 < r9) goto L27;
        if (r9 < 0) goto L27;
        if (r10 > this.size) goto L27;
        if (r10 != r9) goto L9;
        return true;
    L9:
        int r102 = r10 - 1;
        int r1 = r9 / 32;
        int r2 = r102 / 32;
        int r3 = r1;
    L10:
        if (r3 > r2) goto L25;
        int r4 = 31;
        if (r3 <= r1) goto L14;
        int r6 = 0;
    L15:
        if (r3 < r2) goto L18;
        r4 = 31 & r102;
    L18:
        int r42 = (2 << r4) - (1 << r6);
        int r62 = this.bits[r3] & r42;
        if (r11 == true) goto L22;
        r42 = 0;
    L22:
        if (r62 != r42) goto L23;
        r3 = r3 + 1;
        goto L10
    L23:
        return false;
    L14:
        r6 = r9 & 31;
        goto L15
    L25:
        return true;
    L27:
        throw new IllegalArgumentException();
    }

    public void reverse() {
        int[] r02 = new int[this.bits.length];
        int r2 = 1;
        int r1 = (this.size - 1) / 32;
        int r3 = r1 + 1;
        int r5 = 0;
    L3:
        if (r5 >= r3) goto L5;
        long r6 = this.bits[r5];
        long r62 = ((r6 & 1431655765) << 1) | ((r6 >> 1) & 1431655765);
        long r63 = ((r62 & 858993459) << 2) | ((r62 >> 2) & 858993459);
        long r64 = ((r63 & 252645135) << 4) | ((r63 >> 4) & 252645135);
        long r65 = ((r64 & 16711935) << 8) | ((r64 >> 8) & 16711935);
        r02[r1 - r5] = (int) (((r65 & 65535) << 16) | ((r65 >> 16) & 65535));
        r5 = r5 + 1;
        goto L3
    L5:
        int r52 = this.size;
        int r66 = r3 << 5;
        if (r52 == r66) goto L11;
        int r67 = r66 - r52;
        int r4 = r02[0] >>> r67;
    L8:
        if (r2 >= r3) goto L10;
        int r53 = r02[r2];
        r02[r2 - 1] = r4 | (r53 << (32 - r67));
        r4 = r53 >>> r67;
        r2 = r2 + 1;
        goto L8
    L10:
        r02[r1] = r4;
    L11:
        this.bits = r02;
    }

    public void set(int r5) {
        int[] r02 = this.bits;
        int r1 = r5 / 32;
        int r52 = 1 << (r5 & 31);
        r02[r1] = r52 | r02[r1];
    }

    public void setBulk(int r2, int r3) {
        this.bits[r2 / 32] = r3;
    }

    public void setRange(int r7, int r8) {
        if (r8 < r7) goto L20;
        if (r7 < 0) goto L20;
        if (r8 > this.size) goto L20;
        if (r8 == r7) goto L18;
        int r82 = r8 - 1;
        int r02 = r7 / 32;
        int r1 = r82 / 32;
        int r2 = r02;
    L9:
        if (r2 > r1) goto L24;
        int r3 = 31;
        if (r2 <= r02) goto L13;
        int r4 = 0;
    L14:
        if (r2 < r1) goto L17;
        r3 = 31 & r82;
    L17:
        int r32 = (2 << r3) - (1 << r4);
        int[] r42 = this.bits;
        r42[r2] = r32 | r42[r2];
        r2 = r2 + 1;
        goto L9
    L13:
        r4 = r7 & 31;
        goto L14
    L24:
        return;
    L18:
        return;
    L20:
        throw new IllegalArgumentException();
    }

    public void toBytes(int r7, byte[] r8, int r9, int r10) {
        int r1 = 0;
    L3:
        if (r1 >= r10) goto L12;
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r2 >= 8) goto L11;
        if (get(r7) == false) goto L10;
        r3 = r3 | (1 << (7 - r2));
    L10:
        r7 = r7 + 1;
        r2 = r2 + 1;
        goto L6
    L11:
        r8[r9 + r1] = (byte) r3;
        r1 = r1 + 1;
        goto L3
    }

    public String toString() {
        int r1 = this.size;
        StringBuilder r02 = new StringBuilder((r1 + (r1 / 8)) + 1);
        int r12 = 0;
    L4:
        if (r12 >= this.size) goto L14;
        if ((r12 & 7) != 0) goto L9;
        r02.append(' ');
    L9:
        if (get(r12) == false) goto L11;
        char r2 = 'X';
    L12:
        r02.append(r2);
        r12 = r12 + 1;
        goto L4
    L11:
        r2 = '.';
        goto L12
    L14:
        return r02.toString();
    }

    public void xor(BitArray r5) {
        if (this.size != r5.size) goto L10;
        int r02 = 0;
    L5:
        int[] r1 = this.bits;
        if (r02 >= r1.length) goto L8;
        r1[r02] = r1[r02] ^ r5.bits[r02];
        r02 = r02 + 1;
        goto L5
    L8:
        return;
    L10:
        throw new IllegalArgumentException("Sizes don't match");
    }

    public BitArray clone() {
        return new BitArray((int[]) this.bits.clone(), this.size);
    }

    public BitArray(int r1) {
        this.size = r1;
        this.bits = makeArray(r1);
    }

    public BitArray(int[] r1, int r2) {
        this.bits = r1;
        this.size = r2;
    }
}
