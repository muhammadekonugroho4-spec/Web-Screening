package com.google.zxing.common;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class BitMatrix implements Cloneable {
    private final int[] bits;
    private final int height;
    private final int rowSize;
    private final int width;

    public BitMatrix(int r1) {
        this(r1, r1);
    }

    private String buildToString(String r6, String r7, String r8) {
        StringBuilder r02 = new StringBuilder(this.height * (this.width + 1));
        int r2 = 0;
    L4:
        if (r2 >= this.height) goto L15;
        int r3 = 0;
    L7:
        if (r3 >= this.width) goto L13;
        if (get(r3, r2) == false) goto L11;
        String r4 = r6;
    L12:
        r02.append(r4);
        r3 = r3 + 1;
        goto L7
    L11:
        r4 = r7;
        goto L12
    L13:
        r02.append(r8);
        r2 = r2 + 1;
        goto L4
    L15:
        return r02.toString();
    }

    public static BitMatrix parse(boolean[][] r8) {
        int r02 = r8.length;
        int r2 = r8[0].length;
        BitMatrix r3 = new BitMatrix(r2, r02);
        int r4 = 0;
    L3:
        if (r4 >= r02) goto L11;
        boolean[] r5 = r8[r4];
        int r6 = 0;
    L5:
        if (r6 >= r2) goto L10;
        if (r5[r6] == false) goto L9;
        r3.set(r6, r4);
    L9:
        r6 = r6 + 1;
        goto L5
    L10:
        r4 = r4 + 1;
        goto L3
    L11:
        return r3;
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
    public /* bridge */ /* synthetic */ Object m288clone() throws CloneNotSupportedException {
        return clone();
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof BitMatrix) == true) goto L5;
        return false;
    L5:
        BitMatrix r42 = (BitMatrix) r4;
        if (this.width == r42.width) goto L8;
    L15:
        return false;
    L8:
        if (this.height != r42.height) goto L15;
        if (this.rowSize != r42.rowSize) goto L15;
        if (Arrays.equals(this.bits, r42.bits) == false) goto L15;
        return true;
    }

    public void flip(int r4, int r5) {
        int r52 = (r5 * this.rowSize) + (r4 / 32);
        int[] r02 = this.bits;
        int r42 = 1 << (r4 & 31);
        r02[r52] = r42 ^ r02[r52];
    }

    public boolean get(int r2, int r3) {
        int r32 = (r3 * this.rowSize) + (r2 / 32);
        if (((this.bits[r32] >>> (r2 & 31)) & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public int[] getBottomRightOnBit() {
        int r02 = this.bits.length - 1;
    L3:
        if (r02 < 0) goto L7;
        if (this.bits[r02] != 0) goto L7;
        r02 = r02 - 1;
    L7:
        if (r02 >= 0) goto L10;
        return null;
    L10:
        int r1 = this.rowSize;
        int r2 = r02 / r1;
        int r12 = (r02 % r1) << 5;
        int r3 = 31;
    L12:
        if ((this.bits[r02] >>> r3) != 0) goto L15;
        r3 = r3 - 1;
        goto L12
    L15:
        return new int[]{r12 + r3, r2};
    }

    public int[] getEnclosingRectangle() {
        int r02 = this.width;
        int r1 = this.height;
        int r2 = -1;
        int r4 = -1;
        int r5 = 0;
    L4:
        if (r5 >= this.height) goto L34;
        int r6 = 0;
    L6:
        int r7 = this.rowSize;
        if (r6 >= r7) goto L33;
        int r72 = this.bits[(r7 * r5) + r6];
        if (r72 == 0) goto L32;
        if (r5 >= r1) goto L12;
        r1 = r5;
    L12:
        if (r5 <= r4) goto L14;
        r4 = r5;
    L14:
        int r8 = r6 << 5;
        if (r8 >= r02) goto L24;
        int r9 = 0;
    L18:
        if ((r72 << (31 - r9)) != 0) goto L20;
        r9 = r9 + 1;
        goto L18
    L20:
        int r92 = r9 + r8;
        if (r92 >= r02) goto L24;
        r02 = r92;
    L24:
        if ((r8 + 31) <= r2) goto L32;
        int r93 = 31;
    L27:
        if ((r72 >>> r93) != 0) goto L29;
        r93 = r93 - 1;
        goto L27
    L29:
        int r82 = r8 + r93;
        if (r82 <= r2) goto L32;
        r2 = r82;
    L32:
        r6 = r6 + 1;
        goto L6
    L33:
        r5 = r5 + 1;
        goto L4
    L34:
        if (r2 < r02) goto L39;
        if (r4 >= r1) goto L38;
        return null;
    L38:
        return new int[]{r02, r1, (r2 - r02) + 1, (r4 - r1) + 1};
    L39:
        return null;
    }

    public int getHeight() {
        return this.height;
    }

    public BitArray getRow(int r5, BitArray r6) {
        if (r6 != null) goto L4;
    L7:
        r6 = new BitArray(this.width);
    L8:
        int r52 = r5 * this.rowSize;
        int r02 = 0;
    L10:
        if (r02 >= this.rowSize) goto L12;
        r6.setBulk(r02 << 5, this.bits[r52 + r02]);
        r02 = r02 + 1;
        goto L10
    L12:
        return r6;
    L4:
        if (r6.getSize() < this.width) goto L7;
        r6.clear();
        goto L8
    }

    public int getRowSize() {
        return this.rowSize;
    }

    public int[] getTopLeftOnBit() {
        int r02 = 0;
        int r1 = 0;
    L3:
        int[] r2 = this.bits;
        if (r1 >= r2.length) goto L9;
        if (r2[r1] != 0) goto L9;
        r1 = r1 + 1;
    L9:
        if (r1 != r2.length) goto L12;
        return null;
    L12:
        int r3 = this.rowSize;
        int r4 = r1 / r3;
        int r32 = (r1 % r3) << 5;
    L14:
        if ((r2[r1] << (31 - r02)) != 0) goto L17;
        r02 = r02 + 1;
        goto L14
    L17:
        return new int[]{r32 + r02, r4};
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int r02 = this.width;
        return (((((((r02 * 31) + r02) * 31) + this.height) * 31) + this.rowSize) * 31) + Arrays.hashCode(this.bits);
    }

    public void rotate180() {
        int r02 = getWidth();
        int r1 = getHeight();
        BitArray r2 = new BitArray(r02);
        BitArray r3 = new BitArray(r02);
        int r03 = 0;
    L4:
        if (r03 >= ((r1 + 1) / 2)) goto L6;
        r2 = getRow(r03, r2);
        int r4 = (r1 - 1) - r03;
        r3 = getRow(r4, r3);
        r2.reverse();
        r3.reverse();
        setRow(r03, r3);
        setRow(r4, r2);
        r03 = r03 + 1;
        goto L4
    }

    public void set(int r4, int r5) {
        int r52 = (r5 * this.rowSize) + (r4 / 32);
        int[] r02 = this.bits;
        int r42 = 1 << (r4 & 31);
        r02[r52] = r42 | r02[r52];
    }

    public void setRegion(int r8, int r9, int r10, int r11) {
        if (r9 < 0) goto L21;
        if (r8 < 0) goto L21;
        if (r11 <= 0) goto L19;
        if (r10 <= 0) goto L19;
        int r102 = r10 + r8;
        int r112 = r11 + r9;
        if (r112 > this.height) goto L17;
        if (r102 > this.width) goto L17;
    L10:
        if (r9 >= r112) goto L15;
        int r02 = this.rowSize * r9;
        int r1 = r8;
    L12:
        if (r1 >= r102) goto L14;
        int[] r2 = this.bits;
        int r3 = (r1 / 32) + r02;
        r2[r3] = r2[r3] | (1 << (r1 & 31));
        r1 = r1 + 1;
        goto L12
    L14:
        r9 = r9 + 1;
        goto L10
    L15:
        return;
    L17:
        throw new IllegalArgumentException("The region must fit inside the matrix");
    L19:
        throw new IllegalArgumentException("Height and width must be at least 1");
    L21:
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public void setRow(int r4, BitArray r5) {
        int[] r52 = r5.getBitArray();
        int[] r02 = this.bits;
        int r1 = this.rowSize;
        System.arraycopy(r52, 0, r02, r4 * r1, r1);
    }

    public String toString() {
        return toString("X ", "  ");
    }

    public void unset(int r4, int r5) {
        int r52 = (r5 * this.rowSize) + (r4 / 32);
        int[] r02 = this.bits;
        int r1 = r02[r52];
        r02[r52] = (~(1 << (r4 & 31))) & r1;
    }

    public void xor(BitMatrix r11) {
        if (this.width != r11.getWidth()) goto L18;
        if (this.height != r11.getHeight()) goto L18;
        if (this.rowSize != r11.getRowSize()) goto L18;
        BitArray r02 = new BitArray(this.width);
        int r2 = 0;
    L10:
        if (r2 >= this.height) goto L16;
        int r3 = this.rowSize * r2;
        int[] r4 = r11.getRow(r2, r02).getBitArray();
        int r5 = 0;
    L13:
        if (r5 >= this.rowSize) goto L15;
        int[] r6 = this.bits;
        int r7 = r3 + r5;
        r6[r7] = r6[r7] ^ r4[r5];
        r5 = r5 + 1;
        goto L13
    L15:
        r2 = r2 + 1;
        goto L10
    L16:
        return;
    L18:
        throw new IllegalArgumentException("input matrix dimensions do not match");
    }

    public BitMatrix(int r1, int r2) {
        if (r1 <= 0) goto L8;
        if (r2 <= 0) goto L8;
        this.width = r1;
        this.height = r2;
        int r12 = (r1 + 31) / 32;
        this.rowSize = r12;
        this.bits = new int[r12 * r2];
        return;
    L8:
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public BitMatrix clone() {
        return new BitMatrix(this.width, this.height, this.rowSize, (int[]) this.bits.clone());
    }

    public String toString(String r2, String r3) {
        return buildToString(r2, r3, "\n");
    }

    @Deprecated
    public String toString(String r1, String r2, String r3) {
        return buildToString(r1, r2, r3);
    }

    public static BitMatrix parse(String r11, String r12, String r13) {
        if (r11 == null) goto L45;
        boolean[] r02 = new boolean[r11.length()];
        int r2 = 0;
        int r6 = -1;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r7 = 0;
    L5:
        if (r3 >= r11.length()) goto L29;
        if (r11.charAt(r3) == '\n') goto L20;
        if (r11.charAt(r3) == '\r') goto L20;
        if (r11.substring(r3, r12.length() + r3).equals(r12) == false) goto L16;
        r3 = r3 + r12.length();
        r02[r4] = true;
    L14:
        r4 = r4 + 1;
        goto L5
    L16:
        if (r11.substring(r3, r13.length() + r3).equals(r13) == false) goto L19;
        r3 = r3 + r13.length();
        r02[r4] = false;
        goto L14
    L19:
        throw new IllegalArgumentException("illegal character encountered: " + r11.substring(r3));
    L20:
        if (r4 <= r5) goto L28;
        if (r6 != (-1)) goto L24;
        r6 = r4 - r5;
    L25:
        r7 = r7 + 1;
        r5 = r4;
        goto L28
    L24:
        if ((r4 - r5) == r6) goto L25;
        throw new IllegalArgumentException("row lengths do not match");
    L28:
        r3 = r3 + 1;
        goto L5
    L29:
        if (r4 <= r5) goto L37;
        if (r6 != (-1)) goto L33;
        r6 = r4 - r5;
    L34:
        r7 = r7 + 1;
        goto L37
    L33:
        if ((r4 - r5) == r6) goto L34;
        throw new IllegalArgumentException("row lengths do not match");
    L37:
        BitMatrix r112 = new BitMatrix(r6, r7);
    L38:
        if (r2 >= r4) goto L43;
        if (r02[r2] == false) goto L42;
        r112.set(r2 % r6, r2 / r6);
    L42:
        r2 = r2 + 1;
        goto L38
    L43:
        return r112;
    L45:
        throw new IllegalArgumentException();
    }

    private BitMatrix(int r1, int r2, int r3, int[] r4) {
        this.width = r1;
        this.height = r2;
        this.rowSize = r3;
        this.bits = r4;
    }
}
