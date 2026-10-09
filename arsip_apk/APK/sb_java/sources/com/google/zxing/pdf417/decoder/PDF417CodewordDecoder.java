package com.google.zxing.pdf417.decoder;

import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Array;

/* loaded from: classes6.dex */
final class PDF417CodewordDecoder {
    private static final float[][] RATIOS_TABLE = null;

    static {
        RATIOS_TABLE = (float[][]) Array.newInstance(Float.TYPE, new int[]{PDF417Common.SYMBOL_TABLE.length, 8});
        int r02 = 0;
    L3:
        int[] r1 = PDF417Common.SYMBOL_TABLE;
        if (r02 >= r1.length) goto L13;
        int r12 = r1[r02];
        int r4 = r12 & 1;
        int r5 = 0;
    L6:
        if (r5 >= 8) goto L12;
        float r6 = 0.0f;
    L8:
        int r7 = r12 & 1;
        if (r7 != r4) goto L11;
        r6 = r6 + 1.0f;
        r12 = r12 >> 1;
        goto L8
    L11:
        RATIOS_TABLE[r02][7 - r5] = r6 / 17.0f;
        r5 = r5 + 1;
        r4 = r7;
        goto L6
    L12:
        r02 = r02 + 1;
        goto L3
    }

    private PDF417CodewordDecoder() {
    }

    private static int getBitValue(int[] r7) {
        long r02 = 0;
        int r3 = 0;
    L4:
        if (r3 >= r7.length) goto L15;
        int r4 = 0;
    L7:
        if (r4 >= r7[r3]) goto L13;
        int r5 = 1;
        long r03 = r02 << 1;
        if ((r3 % 2) == 0) goto L12;
        r5 = 0;
    L12:
        r02 = r03 | r5;
        r4 = r4 + 1;
        goto L7
    L13:
        r3 = r3 + 1;
        goto L4
    L15:
        return (int) r02;
    }

    private static int getClosestDecodedValue(int[] r10) {
        int r02 = MathUtils.sum(r10);
        float[] r2 = new float[8];
        if (r02 <= 1) goto L7;
        int r3 = 0;
    L5:
        if (r3 >= 8) goto L7;
        r2[r3] = r10[r3] / r02;
        r3 = r3 + 1;
    L7:
        float r102 = Float.MAX_VALUE;
        int r03 = -1;
        int r32 = 0;
    L8:
        float[][] r5 = RATIOS_TABLE;
        if (r32 >= r5.length) goto L19;
        float[] r52 = r5[r32];
        float r6 = 0.0f;
        int r7 = 0;
    L11:
        if (r7 >= 8) goto L16;
        float r8 = r52[r7] - r2[r7];
        r6 = r6 + (r8 * r8);
        if (r6 >= r102) goto L16;
        r7 = r7 + 1;
    L16:
        if (r6 >= r102) goto L18;
        r03 = PDF417Common.SYMBOL_TABLE[r32];
        r102 = r6;
    L18:
        r32 = r32 + 1;
        goto L8
    L19:
        return r03;
    }

    private static int getDecodedCodewordValue(int[] r2) {
        int r22 = getBitValue(r2);
        if (PDF417Common.getCodeword(r22) != (-1)) goto L5;
        return -1;
    L5:
        return r22;
    }

    public static int getDecodedValue(int[] r2) {
        int r02 = getDecodedCodewordValue(sampleBitCounts(r2));
        if (r02 == (-1)) goto L6;
        return r02;
    L6:
        return getClosestDecodedValue(r2);
    }

    private static int[] sampleBitCounts(int[] r8) {
        float r02 = MathUtils.sum(r8);
        int[] r1 = new int[8];
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r2 >= 17) goto L9;
        float r5 = (r02 / 34.0f) + ((r2 * r02) / 17.0f);
        int r6 = r8[r4];
        if ((r3 + r6) > r5) goto L8;
        r3 = r3 + r6;
        r4 = r4 + 1;
    L8:
        r1[r4] = r1[r4] + 1;
        r2 = r2 + 1;
        goto L4
    L9:
        return r1;
    }
}
