package com.google.crypto.tink.internal;

import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.annotations.Alpha;
import java.util.Arrays;

@Alpha
/* loaded from: classes6.dex */
public final class Field25519 {
    private static final int[] EXPAND_SHIFT = null;
    private static final int[] EXPAND_START = null;
    public static final int FIELD_LEN = 32;
    public static final int LIMB_CNT = 10;
    private static final int[] MASK = null;
    private static final int[] SHIFT = null;
    private static final long TWO_TO_25 = 33554432;
    private static final long TWO_TO_26 = 67108864;

    static {
        EXPAND_START = new int[]{0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
        EXPAND_SHIFT = new int[]{0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
        MASK = new int[]{67108863, 33554431};
        SHIFT = new int[]{26, 25};
    }

    private Field25519() {
    }

    public static byte[] contract(long[] r16) {
        long[] r1 = Arrays.copyOf(r16, 10);
        int r2 = 0;
        int r3 = 0;
    L3:
        int r8 = 2;
        if (r3 >= 2) goto L9;
        int r82 = 0;
    L6:
        if (r82 >= 9) goto L8;
        long r10 = r1[r82];
        int r12 = -((int) (((r10 >> 31) & r10) >> SHIFT[r82 & 1]));
        r1[r82] = r10 + (r12 << r14);
        r82 = r82 + 1;
        r1[r82] = r1[r82] - r12;
        goto L6
    L8:
        long r102 = r1[9];
        r1[9] = r102 + (r6 << 25);
        r1[0] = r1[0] - ((-((int) (((r102 >> 31) & r102) >> 25))) * 19);
        r3 = r3 + 1;
        goto L3
    L9:
        long r103 = r1[0];
        r1[0] = r103 + (r3 << 26);
        r1[1] = r1[1] - (-((int) (((r103 >> 31) & r103) >> 26)));
        int r32 = 0;
    L10:
        if (r32 >= 2) goto L15;
        int r104 = r2;
    L12:
        if (r104 >= 9) goto L14;
        long r11 = r1[r104];
        int r162 = r2;
        int r22 = (int) (r11 >> SHIFT[r104 & 1]);
        r1[r104] = r11 & MASK[r14];
        r104 = r104 + 1;
        r1[r104] = r1[r104] + r22;
        r2 = r162;
        r32 = r32;
        goto L12
    L14:
        r32 = r32 + 1;
        goto L10
    L15:
        int r163 = r2;
        long r23 = r1[9];
        r1[9] = r23 & 33554431;
        long r24 = r1[r163] + (((int) (r23 >> 25)) * 19);
        r1[r163] = r24;
        int r25 = gte((int) r24, 67108845);
        int r4 = 1;
    L16:
        if (r4 >= 10) goto L18;
        r25 = r25 & eq((int) r1[r4], MASK[r4 & 1]);
        r4 = r4 + 1;
        goto L16
    L18:
        r1[r163] = r1[r163] - (67108845 & r25);
        long r5 = 33554431 & r25;
        r1[1] = r1[1] - r5;
    L19:
        if (r8 >= 10) goto L21;
        r1[r8] = r1[r8] - (67108863 & r25);
        int r33 = r8 + 1;
        r1[r33] = r1[r33] - r5;
        r8 = r8 + 2;
        goto L19
    L21:
        int r26 = r163;
    L22:
        if (r26 >= 10) goto L24;
        r1[r26] = r1[r26] << EXPAND_SHIFT[r26];
        r26 = r26 + 1;
        goto L22
    L24:
        byte[] r27 = new byte[32];
        int r34 = r163;
    L25:
        if (r34 >= 10) goto L27;
        int r42 = EXPAND_START[r34];
        long r52 = r27[r42];
        long r7 = r1[r34];
        r27[r42] = (byte) (r52 | (r7 & 255));
        r27[r42 + 1] = (byte) (r27[r5] | ((r7 >> 8) & 255));
        r27[r42 + 2] = (byte) (r27[r5] | ((r7 >> 16) & 255));
        r27[r42 + 3] = (byte) (r27[r4] | ((r7 >> 24) & 255));
        r34 = r34 + 1;
        goto L25
    L27:
        return r27;
    }

    private static int eq(int r02, int r1) {
        int r03 = ~(r02 ^ r1);
        int r04 = r03 & (r03 << 16);
        int r05 = r04 & (r04 << 8);
        int r06 = r05 & (r05 << 4);
        int r07 = r06 & (r06 << 2);
        return (r07 & (r07 << 1)) >> 31;
    }

    public static long[] expand(byte[] r9) {
        long[] r1 = new long[10];
        int r2 = 0;
    L3:
        if (r2 >= 10) goto L5;
        int r3 = EXPAND_START[r2];
        r1[r2] = (((((r9[r3] & UnsignedBytes.MAX_VALUE) | ((r9[r3 + 1] & UnsignedBytes.MAX_VALUE) << 8)) | ((r9[r3 + 2] & UnsignedBytes.MAX_VALUE) << 16)) | ((r9[r3 + 3] & UnsignedBytes.MAX_VALUE) << 24)) >> EXPAND_SHIFT[r2]) & MASK[r2 & 1];
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    private static int gte(int r02, int r1) {
        return ~((r02 - r1) >> 31);
    }

    public static void inverse(long[] r11, long[] r12) {
        long[] r1 = new long[10];
        long[] r2 = new long[10];
        long[] r3 = new long[10];
        long[] r4 = new long[10];
        long[] r5 = new long[10];
        long[] r6 = new long[10];
        long[] r7 = new long[10];
        long[] r8 = new long[10];
        long[] r9 = new long[10];
        long[] r10 = new long[10];
        square(r1, r12);
        square(r10, r1);
        square(r9, r10);
        mult(r2, r9, r12);
        mult(r3, r2, r1);
        square(r9, r3);
        mult(r4, r9, r2);
        square(r9, r4);
        square(r10, r9);
        square(r9, r10);
        square(r10, r9);
        square(r9, r10);
        mult(r5, r9, r4);
        square(r9, r5);
        square(r10, r9);
        int r122 = 2;
        int r13 = 2;
    L3:
        if (r13 >= 10) goto L5;
        square(r9, r10);
        square(r10, r9);
        r13 = r13 + 2;
        goto L3
    L5:
        mult(r6, r10, r5);
        square(r9, r6);
        square(r10, r9);
        int r14 = 2;
    L7:
        if (r14 >= 20) goto L9;
        square(r9, r10);
        square(r10, r9);
        r14 = r14 + 2;
        goto L7
    L9:
        mult(r9, r10, r6);
        square(r10, r9);
        square(r9, r10);
        int r15 = 2;
    L10:
        if (r15 >= 10) goto L12;
        square(r10, r9);
        square(r9, r10);
        r15 = r15 + 2;
        goto L10
    L12:
        mult(r7, r9, r5);
        square(r9, r7);
        square(r10, r9);
        int r02 = 2;
    L14:
        if (r02 >= 50) goto L16;
        square(r9, r10);
        square(r10, r9);
        r02 = r02 + 2;
        goto L14
    L16:
        mult(r8, r10, r7);
        square(r10, r8);
        square(r9, r10);
        int r03 = 2;
    L18:
        if (r03 >= 100) goto L20;
        square(r10, r9);
        square(r9, r10);
        r03 = r03 + 2;
        goto L18
    L20:
        mult(r10, r9, r8);
        square(r9, r10);
        square(r10, r9);
    L21:
        if (r122 >= 50) goto L23;
        square(r9, r10);
        square(r10, r9);
        r122 = r122 + 2;
        goto L21
    L23:
        mult(r9, r10, r7);
        square(r10, r9);
        square(r9, r10);
        square(r10, r9);
        square(r9, r10);
        square(r10, r9);
        mult(r11, r10, r3);
    }

    public static void mult(long[] r1, long[] r2, long[] r3) {
        long[] r02 = new long[19];
        product(r02, r2, r3);
        reduce(r02, r1);
    }

    public static void product(long[] r44, long[] r45, long[] r46) {
        r44[0] = r45[0] * r46[0];
        long r1 = r45[0];
        long r4 = r46[1] * r1;
        long r6 = r45[1];
        long r8 = r46[0];
        r44[1] = r4 + (r6 * r8);
        long r42 = r45[1];
        long r12 = r46[1];
        r44[2] = (((r42 * 2) * r12) + (r46[2] * r1)) + (r45[2] * r8);
        long r10 = r46[2];
        long r16 = r45[2];
        r44[3] = (((r42 * r10) + (r16 * r12)) + (r46[3] * r1)) + (r45[3] * r8);
        long r18 = r46[3];
        long r22 = r45[3];
        r44[4] = (((r16 * r10) + (((r42 * r18) + (r22 * r12)) * 2)) + (r46[4] * r1)) + (r45[4] * r8);
        long r14 = (r16 * r18) + (r22 * r10);
        long r20 = r46[4];
        long r142 = r14 + (r42 * r20);
        long r24 = r45[4];
        r44[5] = ((r142 + (r24 * r12)) + (r46[5] * r1)) + (r45[5] * r8);
        long r26 = r46[5];
        long r143 = (r22 * r18) + (r42 * r26);
        long r28 = r45[5];
        r44[6] = (((((r143 + (r28 * r12)) * 2) + (r16 * r20)) + (r24 * r10)) + (r46[6] * r1)) + (r45[6] * r8);
        long r144 = (((r22 * r20) + (r24 * r18)) + (r16 * r26)) + (r28 * r10);
        long r30 = r46[6];
        long r145 = r144 + (r42 * r30);
        long r32 = r45[6];
        r44[7] = ((r145 + (r32 * r12)) + (r46[7] * r1)) + (r45[7] * r8);
        long r34 = (r22 * r26) + (r28 * r18);
        long r36 = r46[7];
        long r342 = r34 + (r42 * r36);
        long r38 = r45[7];
        r44[8] = (((((r24 * r20) + ((r342 + (r38 * r12)) * 2)) + (r16 * r30)) + (r32 * r10)) + (r46[8] * r1)) + (r45[8] * r8);
        long r146 = (((((r24 * r26) + (r28 * r20)) + (r22 * r30)) + (r32 * r18)) + (r16 * r36)) + (r38 * r10);
        long r343 = r46[8];
        long r147 = r146 + (r42 * r343);
        long r40 = r45[8];
        r44[9] = ((r147 + (r40 * r12)) + (r1 * r46[9])) + (r45[9] * r8);
        long r13 = ((r28 * r26) + (r22 * r36)) + (r38 * r18);
        long r82 = r46[9];
        long r3 = r45[9];
        r44[10] = ((((((r13 + (r42 * r82)) + (r12 * r3)) * 2) + (r24 * r30)) + (r32 * r20)) + (r16 * r343)) + (r40 * r10);
        r44[11] = (((((((r28 * r30) + (r32 * r26)) + (r24 * r36)) + (r38 * r20)) + (r22 * r343)) + (r40 * r18)) + (r16 * r82)) + (r10 * r3);
        r44[12] = (((r32 * r30) + (((((r28 * r36) + (r38 * r26)) + (r22 * r82)) + (r18 * r3)) * 2)) + (r24 * r343)) + (r40 * r20);
        r44[13] = (((((r32 * r36) + (r38 * r30)) + (r28 * r343)) + (r40 * r26)) + (r24 * r82)) + (r20 * r3);
        r44[14] = (((((r38 * r36) + (r28 * r82)) + (r26 * r3)) * 2) + (r32 * r343)) + (r40 * r30);
        r44[15] = (((r38 * r343) + (r40 * r36)) + (r32 * r82)) + (r30 * r3);
        r44[16] = (r40 * r343) + (((r38 * r82) + (r36 * r3)) * 2);
        r44[17] = (r40 * r82) + (r343 * r3);
        r44[18] = (r3 * 2) * r82;
    }

    public static void reduce(long[] r3, long[] r4) {
        if (r3.length == 19) goto L6;
        long[] r02 = new long[19];
        System.arraycopy(r3, 0, r02, 0, r3.length);
        r3 = r02;
    L6:
        reduceSizeByModularReduction(r3);
        reduceCoefficients(r3);
        System.arraycopy(r3, 0, r4, 0, 10);
    }

    public static void reduceCoefficients(long[] r14) {
        r14[10] = 0;
        int r4 = 0;
    L4:
        if (r4 >= 10) goto L6;
        long r8 = r14[r4];
        long r6 = r8 / TWO_TO_26;
        r14[r4] = r8 - (r6 << 26);
        int r5 = r4 + 1;
        long r82 = r14[r5] + r6;
        r14[r5] = r82;
        long r62 = r82 / TWO_TO_25;
        r14[r5] = r82 - (r62 << 25);
        r4 = r4 + 2;
        r14[r4] = r14[r4] + r62;
        goto L4
    L6:
        long r83 = r14[0];
        long r10 = r14[10];
        long r84 = r83 + (r10 << 4);
        r14[0] = r84;
        long r85 = r84 + (r10 << 1);
        r14[0] = r85;
        long r86 = r85 + r10;
        r14[0] = r86;
        r14[10] = 0;
        long r02 = r86 / TWO_TO_26;
        r14[0] = r86 - (r02 << 26);
        r14[1] = r14[1] + r02;
    }

    public static void reduceSizeByModularReduction(long[] r9) {
        long r1 = r9[8];
        long r3 = r9[18];
        long r12 = r1 + (r3 << 4);
        r9[8] = r12;
        long r13 = r12 + (r3 << 1);
        r9[8] = r13;
        r9[8] = r13 + r3;
        long r14 = r9[7];
        long r32 = r9[17];
        long r15 = r14 + (r32 << 4);
        r9[7] = r15;
        long r16 = r15 + (r32 << 1);
        r9[7] = r16;
        r9[7] = r16 + r32;
        long r17 = r9[6];
        long r33 = r9[16];
        long r18 = r17 + (r33 << 4);
        r9[6] = r18;
        long r19 = r18 + (r33 << 1);
        r9[6] = r19;
        r9[6] = r19 + r33;
        long r110 = r9[5];
        long r34 = r9[15];
        long r111 = r110 + (r34 << 4);
        r9[5] = r111;
        long r112 = r111 + (r34 << 1);
        r9[5] = r112;
        r9[5] = r112 + r34;
        long r02 = r9[4];
        long r2 = r9[14];
        long r03 = r02 + (r2 << 4);
        r9[4] = r03;
        long r04 = r03 + (r2 << 1);
        r9[4] = r04;
        r9[4] = r04 + r2;
        long r113 = r9[3];
        long r35 = r9[13];
        long r114 = r113 + (r35 << 4);
        r9[3] = r114;
        long r115 = r114 + (r35 << 1);
        r9[3] = r115;
        r9[3] = r115 + r35;
        long r116 = r9[2];
        long r36 = r9[12];
        long r117 = r116 + (r36 << 4);
        r9[2] = r117;
        long r118 = r117 + (r36 << 1);
        r9[2] = r118;
        r9[2] = r118 + r36;
        long r05 = r9[1];
        long r22 = r9[11];
        long r06 = r05 + (r22 << 4);
        r9[1] = r06;
        long r07 = r06 + (r22 << 1);
        r9[1] = r07;
        r9[1] = r07 + r22;
        long r119 = r9[0];
        long r37 = r9[10];
        long r120 = r119 + (r37 << 4);
        r9[0] = r120;
        long r121 = r120 + (r37 << 1);
        r9[0] = r121;
        r9[0] = r121 + r37;
    }

    public static void scalarProduct(long[] r3, long[] r4, long r5) {
        int r02 = 0;
    L4:
        if (r02 >= 10) goto L6;
        r3[r02] = r4[r02] * r5;
        r02 = r02 + 1;
        goto L4
    }

    public static void square(long[] r1, long[] r2) {
        long[] r02 = new long[19];
        squareInner(r02, r2);
        reduce(r02, r1);
    }

    private static void squareInner(long[] r30, long[] r31) {
        long r1 = r31[0];
        r30[0] = r1 * r1;
        long r02 = r31[0];
        r30[1] = (r02 * 2) * r31[1];
        long r4 = r31[1];
        r30[2] = ((r4 * r4) + (r31[2] * r02)) * 2;
        long r6 = r31[2];
        r30[3] = ((r4 * r6) + (r31[3] * r02)) * 2;
        long r15 = r31[3];
        r30[4] = ((r6 * r6) + ((r4 * 4) * r15)) + ((r02 * 2) * r31[4]);
        long r13 = r31[4];
        r30[5] = (((r6 * r15) + (r4 * r13)) + (r31[5] * r02)) * 2;
        long r8 = ((r15 * r15) + (r6 * r13)) + (r31[6] * r02);
        long r20 = r31[5];
        r30[6] = (r8 + ((r4 * 2) * r20)) * 2;
        long r17 = r31[6];
        r30[7] = ((((r15 * r13) + (r6 * r20)) + (r4 * r17)) + (r31[7] * r02)) * 2;
        long r22 = (r6 * r17) + (r31[8] * r02);
        long r24 = r31[7];
        r30[8] = (r13 * r13) + ((r22 + (((r4 * r24) + (r15 * r20)) * 2)) * 2);
        long r82 = ((r13 * r20) + (r15 * r17)) + (r6 * r24);
        long r222 = r31[8];
        r30[9] = ((r82 + (r4 * r222)) + (r02 * r31[9])) * 2;
        long r26 = r31[9];
        r30[10] = ((((r20 * r20) + (r13 * r17)) + (r6 * r222)) + (((r15 * r24) + (r4 * r26)) * 2)) * 2;
        r30[11] = ((((r20 * r17) + (r13 * r24)) + (r15 * r222)) + (r6 * r26)) * 2;
        r30[12] = (r17 * r17) + (((r13 * r222) + (((r20 * r24) + (r15 * r26)) * 2)) * 2);
        r30[13] = (((r17 * r24) + (r20 * r222)) + (r13 * r26)) * 2;
        r30[14] = (((r24 * r24) + (r17 * r222)) + ((r20 * 2) * r26)) * 2;
        r30[15] = ((r24 * r222) + (r17 * r26)) * 2;
        r30[16] = (r222 * r222) + ((r24 * 4) * r26);
        r30[17] = (r222 * 2) * r26;
        r30[18] = (2 * r26) * r26;
    }

    public static void sub(long[] r5, long[] r6, long[] r7) {
        int r02 = 0;
    L4:
        if (r02 >= 10) goto L6;
        r5[r02] = r6[r02] - r7[r02];
        r02 = r02 + 1;
        goto L4
    }

    public static void sum(long[] r5, long[] r6, long[] r7) {
        int r02 = 0;
    L4:
        if (r02 >= 10) goto L6;
        r5[r02] = r6[r02] + r7[r02];
        r02 = r02 + 1;
        goto L4
    }

    public static void sub(long[] r02, long[] r1) {
        sub(r02, r1, r02);
    }

    public static void sum(long[] r02, long[] r1) {
        sum(r02, r02, r1);
    }
}
