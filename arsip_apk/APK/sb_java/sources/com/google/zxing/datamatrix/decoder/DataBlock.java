package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.Version;

/* loaded from: classes6.dex */
final class DataBlock {
    private final byte[] codewords;
    private final int numDataCodewords;

    private DataBlock(int r1, byte[] r2) {
        this.numDataCodewords = r1;
        this.codewords = r2;
    }

    public static DataBlock[] getDataBlocks(byte[] r13, Version r14) {
        Version.ECBlocks r02 = r14.getECBlocks();
        Version.ECB[] r1 = r02.getECBlocks();
        int r2 = r1.length;
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r2) goto L5;
        r5 = r5 + r1[r4].getCount();
        r4 = r4 + 1;
        goto L3
    L5:
        DataBlock[] r22 = new DataBlock[r5];
        int r42 = r1.length;
        int r52 = 0;
        int r6 = 0;
    L6:
        if (r52 >= r42) goto L12;
        Version.ECB r7 = r1[r52];
        int r8 = 0;
    L9:
        if (r8 >= r7.getCount()) goto L11;
        int r9 = r7.getDataCodewords();
        r22[r6] = new DataBlock(r9, new byte[r02.getECCodewords() + r9]);
        r8 = r8 + 1;
        r6 = r6 + 1;
        goto L9
    L11:
        r52 = r52 + 1;
        goto L6
    L12:
        int r12 = r22[0].codewords.length - r02.getECCodewords();
        int r03 = r12 - 1;
        int r43 = 0;
        int r53 = 0;
    L13:
        if (r43 >= r03) goto L19;
        int r72 = 0;
    L15:
        if (r72 >= r6) goto L17;
        r22[r72].codewords[r43] = r13[r53];
        r72 = r72 + 1;
        r53 = r53 + 1;
        goto L15
    L17:
        r43 = r43 + 1;
        goto L13
    L19:
        if (r14.getVersionNumber() != 24) goto L21;
        boolean r142 = true;
    L22:
        if (r142 == false) goto L24;
        int r44 = 8;
    L25:
        int r73 = 0;
    L26:
        if (r73 >= r44) goto L28;
        r22[r73].codewords[r03] = r13[r53];
        r73 = r73 + 1;
        r53 = r53 + 1;
        goto L26
    L28:
        int r04 = r22[0].codewords.length;
    L29:
        if (r12 >= r04) goto L43;
        int r45 = 0;
    L31:
        if (r45 >= r6) goto L41;
        if (r142 == false) goto L34;
        int r74 = (r45 + 8) % r6;
    L35:
        if (r142 == true) goto L37;
    L39:
        int r82 = r12;
    L40:
        r22[r74].codewords[r82] = r13[r53];
        r45 = r45 + 1;
        r53 = r53 + 1;
        goto L31
    L37:
        if (r74 <= 7) goto L39;
        r82 = r12 - 1;
        goto L40
    L34:
        r74 = r45;
        goto L35
    L41:
        r12 = r12 + 1;
        goto L29
    L43:
        if (r53 != r13.length) goto L46;
        return r22;
    L46:
        throw new IllegalArgumentException();
    L24:
        r44 = r6;
        goto L25
    L21:
        r142 = false;
        goto L22
    }

    public byte[] getCodewords() {
        return this.codewords;
    }

    public int getNumDataCodewords() {
        return this.numDataCodewords;
    }
}
