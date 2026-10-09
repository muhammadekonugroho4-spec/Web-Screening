package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
final class BitMatrixParser {
    private final BitMatrix mappingBitMatrix;
    private final BitMatrix readMappingMatrix;
    private final Version version;

    public BitMatrixParser(BitMatrix r3) throws FormatException {
        int r02 = r3.getHeight();
        if (r02 < 8) goto L11;
        if (r02 > 144) goto L11;
        if ((r02 & 1) != 0) goto L11;
        this.version = readVersion(r3);
        BitMatrix r32 = extractDataRegion(r3);
        this.mappingBitMatrix = r32;
        this.readMappingMatrix = new BitMatrix(r32.getWidth(), r32.getHeight());
        return;
    L11:
        throw FormatException.getFormatInstance();
    }

    private BitMatrix extractDataRegion(BitMatrix r17) {
        int r1 = this.version.getSymbolSizeRows();
        int r2 = this.version.getSymbolSizeColumns();
        if (r17.getHeight() != r1) goto L21;
        int r3 = this.version.getDataRegionSizeRows();
        int r4 = this.version.getDataRegionSizeColumns();
        int r12 = r1 / r3;
        int r22 = r2 / r4;
        int r6 = r22 * r4;
        BitMatrix r7 = new BitMatrix(r6, r12 * r3);
        int r62 = 0;
    L5:
        if (r62 >= r12) goto L19;
        int r8 = r62 * r3;
        int r9 = 0;
    L7:
        if (r9 >= r22) goto L18;
        int r10 = r9 * r4;
        int r11 = 0;
    L9:
        if (r11 >= r3) goto L17;
        int r122 = (((r3 + 2) * r62) + 1) + r11;
        int r13 = r8 + r11;
        int r14 = 0;
    L11:
        if (r14 >= r4) goto L16;
        if (r17.get((((r4 + 2) * r9) + 1) + r14, r122) == false) goto L15;
        r7.set(r10 + r14, r13);
    L15:
        r14 = r14 + 1;
        goto L11
    L16:
        r11 = r11 + 1;
        goto L9
    L17:
        r9 = r9 + 1;
        goto L7
    L18:
        r62 = r62 + 1;
        goto L5
    L19:
        return r7;
    L21:
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    private int readCorner1(int r6, int r7) {
        int r02 = r6 - 1;
        int r2 = (readModule(r02, 0, r6, r7) ? 1 : 0) << 1;
        if (readModule(r02, 1, r6, r7) == false) goto L5;
        r2 = r2 | 1;
    L5:
        int r22 = r2 << 1;
        if (readModule(r02, 2, r6, r7) == false) goto L8;
        r22 = r22 | 1;
    L8:
        int r03 = r22 << 1;
        if (readModule(0, r7 - 2, r6, r7) == false) goto L11;
        r03 = r03 | 1;
    L11:
        int r04 = r03 << 1;
        int r23 = r7 - 1;
        if (readModule(0, r23, r6, r7) == false) goto L14;
        r04 = r04 | 1;
    L14:
        int r05 = r04 << 1;
        if (readModule(1, r23, r6, r7) == false) goto L17;
        r05 = r05 | 1;
    L17:
        int r06 = r05 << 1;
        if (readModule(2, r23, r6, r7) == false) goto L20;
        r06 = r06 | 1;
    L20:
        int r07 = r06 << 1;
        if (readModule(3, r23, r6, r7) == true) goto L23;
        return r07;
    L23:
        return r07 | 1;
    }

    private int readCorner2(int r5, int r6) {
        int r02 = (readModule(r5 + (-3), 0, r5, r6) ? 1 : 0) << 1;
        if (readModule(r5 - 2, 0, r5, r6) == false) goto L5;
        r02 = r02 | 1;
    L5:
        int r03 = r02 << 1;
        if (readModule(r5 - 1, 0, r5, r6) == false) goto L8;
        r03 = r03 | 1;
    L8:
        int r04 = r03 << 1;
        if (readModule(0, r6 - 4, r5, r6) == false) goto L11;
        r04 = r04 | 1;
    L11:
        int r05 = r04 << 1;
        if (readModule(0, r6 - 3, r5, r6) == false) goto L14;
        r05 = r05 | 1;
    L14:
        int r06 = r05 << 1;
        if (readModule(0, r6 - 2, r5, r6) == false) goto L17;
        r06 = r06 | 1;
    L17:
        int r07 = r06 << 1;
        int r3 = r6 - 1;
        if (readModule(0, r3, r5, r6) == false) goto L20;
        r07 = r07 | 1;
    L20:
        int r08 = r07 << 1;
        if (readModule(1, r3, r5, r6) == true) goto L23;
        return r08;
    L23:
        return r08 | 1;
    }

    private int readCorner3(int r8, int r9) {
        int r02 = r8 - 1;
        int r2 = (readModule(r02, 0, r8, r9) ? 1 : 0) << 1;
        int r4 = r9 - 1;
        if (readModule(r02, r4, r8, r9) == false) goto L5;
        r2 = r2 | 1;
    L5:
        int r03 = r2 << 1;
        int r22 = r9 - 3;
        if (readModule(0, r22, r8, r9) == false) goto L8;
        r03 = r03 | 1;
    L8:
        int r04 = r03 << 1;
        int r5 = r9 - 2;
        if (readModule(0, r5, r8, r9) == false) goto L11;
        r04 = r04 | 1;
    L11:
        int r05 = r04 << 1;
        if (readModule(0, r4, r8, r9) == false) goto L14;
        r05 = r05 | 1;
    L14:
        int r06 = r05 << 1;
        if (readModule(1, r22, r8, r9) == false) goto L17;
        r06 = r06 | 1;
    L17:
        int r07 = r06 << 1;
        if (readModule(1, r5, r8, r9) == false) goto L20;
        r07 = r07 | 1;
    L20:
        int r08 = r07 << 1;
        if (readModule(1, r4, r8, r9) == true) goto L23;
        return r08;
    L23:
        return r08 | 1;
    }

    private int readCorner4(int r5, int r6) {
        int r02 = (readModule(r5 + (-3), 0, r5, r6) ? 1 : 0) << 1;
        if (readModule(r5 - 2, 0, r5, r6) == false) goto L5;
        r02 = r02 | 1;
    L5:
        int r03 = r02 << 1;
        if (readModule(r5 - 1, 0, r5, r6) == false) goto L8;
        r03 = r03 | 1;
    L8:
        int r04 = r03 << 1;
        if (readModule(0, r6 - 2, r5, r6) == false) goto L11;
        r04 = r04 | 1;
    L11:
        int r05 = r04 << 1;
        int r3 = r6 - 1;
        if (readModule(0, r3, r5, r6) == false) goto L14;
        r05 = r05 | 1;
    L14:
        int r06 = r05 << 1;
        if (readModule(1, r3, r5, r6) == false) goto L17;
        r06 = r06 | 1;
    L17:
        int r07 = r06 << 1;
        if (readModule(2, r3, r5, r6) == false) goto L20;
        r07 = r07 | 1;
    L20:
        int r08 = r07 << 1;
        if (readModule(3, r3, r5, r6) == true) goto L23;
        return r08;
    L23:
        return r08 | 1;
    }

    private boolean readModule(int r1, int r2, int r3, int r4) {
        if (r1 >= 0) goto L4;
        r1 = r1 + r3;
        r2 = r2 + (4 - ((r3 + 4) & 7));
    L4:
        if (r2 >= 0) goto L6;
        r2 = r2 + r4;
        r1 = r1 + (4 - ((r4 + 4) & 7));
    L6:
        this.readMappingMatrix.set(r2, r1);
        return this.mappingBitMatrix.get(r2, r1);
    }

    private int readUtah(int r6, int r7, int r8, int r9) {
        int r02 = r6 - 2;
        int r1 = r7 - 2;
        int r2 = (readModule(r02, r1, r8, r9) ? 1 : 0) << 1;
        int r3 = r7 - 1;
        if (readModule(r02, r3, r8, r9) == false) goto L5;
        r2 = r2 | 1;
    L5:
        int r03 = r2 << 1;
        int r22 = r6 - 1;
        if (readModule(r22, r1, r8, r9) == false) goto L8;
        r03 = r03 | 1;
    L8:
        int r04 = r03 << 1;
        if (readModule(r22, r3, r8, r9) == false) goto L11;
        r04 = r04 | 1;
    L11:
        int r05 = r04 << 1;
        if (readModule(r22, r7, r8, r9) == false) goto L14;
        r05 = r05 | 1;
    L14:
        int r06 = r05 << 1;
        if (readModule(r6, r1, r8, r9) == false) goto L17;
        r06 = r06 | 1;
    L17:
        int r07 = r06 << 1;
        if (readModule(r6, r3, r8, r9) == false) goto L20;
        r07 = r07 | 1;
    L20:
        int r08 = r07 << 1;
        if (readModule(r6, r7, r8, r9) == true) goto L23;
        return r08;
    L23:
        return r08 | 1;
    }

    private static Version readVersion(BitMatrix r1) throws FormatException {
        return Version.getVersionForDimensions(r1.getHeight(), r1.getWidth());
    }

    public Version getVersion() {
        return this.version;
    }

    public byte[] readCodewords() throws FormatException {
        byte[] r02 = new byte[this.version.getTotalCodewords()];
        int r1 = this.mappingBitMatrix.getHeight();
        int r2 = this.mappingBitMatrix.getWidth();
        int r3 = 0;
        boolean r5 = false;
        int r6 = 0;
        boolean r7 = false;
        boolean r8 = false;
        boolean r9 = false;
        int r10 = 4;
    L4:
        if (r10 != r1) goto L8;
        if (r3 != 0) goto L8;
        if (r5 == true) goto L8;
        r02[r6] = (byte) readCorner1(r1, r2);
        r10 = r10 - 2;
        r3 = r3 + 2;
        r6 = r6 + 1;
        r5 = true;
    L51:
        if (r10 < r1) goto L4;
        if (r3 < r2) goto L4;
        if (r6 != this.version.getTotalCodewords()) goto L57;
        return r02;
    L57:
        throw FormatException.getFormatInstance();
    L8:
        int r12 = r1 - 2;
        if (r10 != r12) goto L16;
        if (r3 != 0) goto L16;
        if ((r2 & 3) == 0) goto L16;
        if (r7 == true) goto L16;
        r02[r6] = (byte) readCorner2(r1, r2);
        r10 = r10 - 2;
        r3 = r3 + 2;
        r6 = r6 + 1;
        r7 = true;
    L16:
        if (r10 == (r1 + 4)) goto L18;
    L23:
        if (r10 != r12) goto L29;
        if (r3 != 0) goto L29;
        if ((r2 & 7) != 4) goto L29;
        if (r9 == true) goto L29;
        r02[r6] = (byte) readCorner4(r1, r2);
        r10 = r10 - 2;
        r3 = r3 + 2;
        r6 = r6 + 1;
        r9 = true;
    L29:
        if (r10 >= r1) goto L34;
        if (r3 < 0) goto L34;
        if (this.readMappingMatrix.get(r3, r10) == true) goto L34;
        r02[r6] = (byte) readUtah(r10, r3, r1, r2);
        r6 = r6 + 1;
    L34:
        int r11 = r10 - 2;
        int r122 = r3 + 2;
        if (r11 < 0) goto L39;
        if (r122 >= r2) goto L39;
        r10 = r11;
        r3 = r122;
    L39:
        int r102 = r10 - 1;
        int r32 = r3 + 5;
    L40:
        if (r102 < 0) goto L45;
        if (r32 >= r2) goto L45;
        if (this.readMappingMatrix.get(r32, r102) == true) goto L45;
        r02[r6] = (byte) readUtah(r102, r32, r1, r2);
        r6 = r6 + 1;
    L45:
        int r112 = r102 + 2;
        int r123 = r32 - 2;
        if (r112 >= r1) goto L50;
        if (r123 < 0) goto L50;
        r102 = r112;
        r32 = r123;
    L50:
        r10 = r102 + 5;
        r3 = r32 - 1;
        goto L51
    L18:
        if (r3 != 2) goto L23;
        if ((r2 & 7) != 0) goto L23;
        if (r8 == true) goto L23;
        r02[r6] = (byte) readCorner3(r1, r2);
        r10 = r10 - 2;
        r3 = r3 + 2;
        r6 = r6 + 1;
        r8 = true;
        goto L51
    }
}
