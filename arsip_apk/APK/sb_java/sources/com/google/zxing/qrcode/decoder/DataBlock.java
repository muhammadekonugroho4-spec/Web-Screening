package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.Version;

/* loaded from: classes6.dex */
final class DataBlock {
    private final byte[] codewords;
    private final int numDataCodewords;

    private DataBlock(int r1, byte[] r2) {
        this.numDataCodewords = r1;
        this.codewords = r2;
    }

    public static DataBlock[] getDataBlocks(byte[] r12, Version r13, ErrorCorrectionLevel r14) {
        if (r12.length != r13.getTotalCodewords()) goto L39;
        Version.ECBlocks r132 = r13.getECBlocksForLevel(r14);
        Version.ECB[] r142 = r132.getECBlocks();
        int r02 = r142.length;
        int r2 = 0;
        int r3 = 0;
    L5:
        if (r2 >= r02) goto L7;
        r3 = r3 + r142[r2].getCount();
        r2 = r2 + 1;
        goto L5
    L7:
        DataBlock[] r03 = new DataBlock[r3];
        int r22 = r142.length;
        int r4 = 0;
        int r5 = 0;
    L8:
        if (r4 >= r22) goto L14;
        Version.ECB r6 = r142[r4];
        int r7 = 0;
    L11:
        if (r7 >= r6.getCount()) goto L13;
        int r8 = r6.getDataCodewords();
        r03[r5] = new DataBlock(r8, new byte[r132.getECCodewordsPerBlock() + r8]);
        r7 = r7 + 1;
        r5 = r5 + 1;
        goto L11
    L13:
        r4 = r4 + 1;
        goto L8
    L14:
        int r143 = r03[0].codewords.length;
        int r32 = r3 - 1;
    L15:
        if (r32 < 0) goto L19;
        if (r03[r32].codewords.length == r143) goto L19;
        r32 = r32 - 1;
    L19:
        int r33 = r32 + 1;
        int r144 = r143 - r132.getECCodewordsPerBlock();
        int r133 = 0;
        int r23 = 0;
    L20:
        if (r133 >= r144) goto L25;
        int r42 = 0;
    L22:
        if (r42 >= r5) goto L24;
        r03[r42].codewords[r133] = r12[r23];
        r42 = r42 + 1;
        r23 = r23 + 1;
        goto L22
    L24:
        r133 = r133 + 1;
        goto L20
    L25:
        int r134 = r33;
    L26:
        if (r134 >= r5) goto L28;
        r03[r134].codewords[r144] = r12[r23];
        r134 = r134 + 1;
        r23 = r23 + 1;
        goto L26
    L28:
        int r135 = r03[0].codewords.length;
    L29:
        if (r144 >= r135) goto L37;
        int r43 = 0;
    L31:
        if (r43 >= r5) goto L36;
        if (r43 >= r33) goto L34;
        int r62 = r144;
    L35:
        r03[r43].codewords[r62] = r12[r23];
        r43 = r43 + 1;
        r23 = r23 + 1;
        goto L31
    L34:
        r62 = r144 + 1;
        goto L35
    L36:
        r144 = r144 + 1;
        goto L29
    L37:
        return r03;
    L39:
        throw new IllegalArgumentException();
    }

    public byte[] getCodewords() {
        return this.codewords;
    }

    public int getNumDataCodewords() {
        return this.numDataCodewords;
    }
}
