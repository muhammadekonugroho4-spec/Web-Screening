package com.google.zxing.datamatrix.decoder;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.zxing.FormatException;

/* loaded from: classes6.dex */
public final class Version {
    private static final Version[] VERSIONS = null;
    private final int dataRegionSizeColumns;
    private final int dataRegionSizeRows;
    private final ECBlocks ecBlocks;
    private final int symbolSizeColumns;
    private final int symbolSizeRows;
    private final int totalCodewords;
    private final int versionNumber;

    /* renamed from: com.google.zxing.datamatrix.decoder.Version$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class ECB {
        private final int count;
        private final int dataCodewords;

        public /* synthetic */ ECB(int r1, int r2, AnonymousClass1 r3) {
            this(r1, r2);
        }

        public int getCount() {
            return this.count;
        }

        public int getDataCodewords() {
            return this.dataCodewords;
        }

        private ECB(int r1, int r2) {
            this.count = r1;
            this.dataCodewords = r2;
        }
    }

    public static final class ECBlocks {
        private final ECB[] ecBlocks;
        private final int ecCodewords;

        public /* synthetic */ ECBlocks(int r1, ECB r2, AnonymousClass1 r3) {
            this(r1, r2);
        }

        public ECB[] getECBlocks() {
            return this.ecBlocks;
        }

        public int getECCodewords() {
            return this.ecCodewords;
        }

        public /* synthetic */ ECBlocks(int r1, ECB r2, ECB r3, AnonymousClass1 r4) {
            this(r1, r2, r3);
        }

        private ECBlocks(int r1, ECB r2) {
            this.ecCodewords = r1;
            this.ecBlocks = new ECB[]{r2};
        }

        private ECBlocks(int r1, ECB r2, ECB r3) {
            this.ecCodewords = r1;
            this.ecBlocks = new ECB[]{r2, r3};
        }
    }

    static {
        VERSIONS = buildVersions();
    }

    private Version(int r2, int r3, int r4, int r5, int r6, ECBlocks r7) {
        this.versionNumber = r2;
        this.symbolSizeRows = r3;
        this.symbolSizeColumns = r4;
        this.dataRegionSizeRows = r5;
        this.dataRegionSizeColumns = r6;
        this.ecBlocks = r7;
        int r22 = r7.getECCodewords();
        ECB[] r32 = r7.getECBlocks();
        int r42 = r32.length;
        int r52 = 0;
        int r62 = 0;
    L3:
        if (r52 >= r42) goto L5;
        ECB r72 = r32[r52];
        r62 = r62 + (r72.getCount() * (r72.getDataCodewords() + r22));
        r52 = r52 + 1;
        goto L3
    L5:
        this.totalCodewords = r62;
    }

    private static Version[] buildVersions() {
        int r7 = 1;
        AnonymousClass1 r8 = null;
        int r9 = 5;
        Version r02 = new Version(1, 10, 10, 8, 8, new ECBlocks(r9, new ECB(r7, 3, r8), r8));
        int r4 = 7;
        Version r2 = new Version(2, 12, 12, 10, 10, new ECBlocks(r4, new ECB(r7, r9, r8), r8));
        int r10 = 10;
        Version r3 = new Version(3, 14, 14, 12, 12, new ECBlocks(r10, new ECB(r7, 8, r8), r8));
        int r12 = 12;
        Version r102 = new Version(4, 16, 16, 14, 14, new ECBlocks(r12, new ECB(r7, r12, r8), r8));
        int r13 = 18;
        Version r5 = new Version(5, 18, 18, 16, 16, new ECBlocks(14, new ECB(r7, r13, r8), r8));
        Version r122 = new Version(6, 20, 20, 18, 18, new ECBlocks(r13, new ECB(r7, 22, r8), r8));
        ECB r15 = new ECB(r7, 30, r8);
        Version r132 = new Version(7, 22, 22, 20, 20, new ECBlocks(20, r15, r8));
        int r152 = 36;
        int r1 = 24;
        Version r22 = new Version(8, 24, 24, 22, 22, new ECBlocks(r1, new ECB(r7, r152, r8), r8));
        ECB r14 = new ECB(r7, 44, r8);
        Version r23 = new Version(9, 26, 26, 24, 24, new ECBlocks(28, r14, r8));
        Version r24 = new Version(10, 32, 32, 14, 14, new ECBlocks(r152, new ECB(r7, 62, r8), r8));
        ECB r142 = new ECB(r7, 86, r8);
        int r42 = 42;
        Version r31 = new Version(11, 36, 36, 16, 16, new ECBlocks(r42, r142, r8));
        int r92 = 114;
        int r16 = 48;
        Version r32 = new Version(12, 40, 40, 18, 18, new ECBlocks(r16, new ECB(r7, r92, r8), r8));
        ECB r143 = new ECB(r7, 144, r8);
        int r6 = 56;
        Version r33 = new Version(13, 44, 44, 20, 20, new ECBlocks(r6, r143, r8));
        ECB r144 = new ECB(r7, 174, r8);
        Version r34 = new Version(14, 48, 48, 22, 22, new ECBlocks(68, r144, r8));
        int r17 = 2;
        Version r35 = new Version(15, 52, 52, 24, 24, new ECBlocks(r42, new ECB(r17, 102, r8), r8));
        Version r43 = new Version(16, 64, 64, 14, 14, new ECBlocks(r6, new ECB(r17, 140, r8), r8));
        int r145 = 4;
        Version r44 = new Version(17, 72, 72, 16, 16, new ECBlocks(r152, new ECB(r145, 92, r8), r8));
        int r72 = 48;
        Version r45 = new Version(18, 80, 80, 18, 18, new ECBlocks(r72, new ECB(r145, r92, r8), r8));
        Version r46 = new Version(19, 88, 88, 20, 20, new ECBlocks(r6, new ECB(r145, 144, r8), r8));
        ECB r52 = new ECB(r145, 174, r8);
        Version r47 = new Version(20, 96, 96, 22, 22, new ECBlocks(68, r52, r8));
        Version r48 = new Version(21, 104, 104, 24, 24, new ECBlocks(r6, new ECB(6, ModuleDescriptor.MODULE_VERSION, r8), r8));
        ECB r53 = new ECB(6, 175, r8);
        Version r49 = new Version(22, Constants.MAX_KEY_LENGTH, Constants.MAX_KEY_LENGTH, 18, 18, new ECBlocks(68, r53, r8));
        int r73 = 8;
        ECB r54 = new ECB(r73, 163, r8);
        Version r36 = new Version(23, 132, 132, 20, 20, new ECBlocks(62, r54, r8));
        int r74 = 8;
        ECB r55 = new ECB(r74, 156, r8);
        ECB r62 = new ECB(r17, 155, r8);
        Version r50 = new Version(24, 144, 144, 22, 22, new ECBlocks(62, r55, r62, r8));
        int r56 = 1;
        ECB r410 = new ECB(r56, 5, r8);
        Version r51 = new Version(25, 8, 18, 6, 16, new ECBlocks(7, r410, r8));
        ECB r411 = new ECB(r56, 10, r8);
        Version r522 = new Version(26, 8, 32, 6, 14, new ECBlocks(11, r411, r8));
        int r63 = 1;
        ECB r412 = new ECB(r63, 16, r8);
        Version r532 = new Version(27, 12, 26, 10, 24, new ECBlocks(14, r412, r8));
        ECB r413 = new ECB(r63, 22, r8);
        Version r542 = new Version(28, 12, 36, 10, 16, new ECBlocks(18, r413, r8));
        int r64 = 1;
        ECB r414 = new ECB(r64, 32, r8);
        Version r552 = new Version(29, 16, 36, 14, 16, new ECBlocks(24, r414, r8));
        int r65 = 1;
        ECB r415 = new ECB(r65, 49, r8);
        return new Version[]{r02, r2, r3, r102, r5, r122, r132, r22, r23, r24, r31, r32, r33, r34, r35, r43, r44, r45, r46, r47, r48, r49, r36, r50, r51, r522, r532, r542, r552, new Version(30, 16, 48, 14, 22, new ECBlocks(28, r415, r8))};
    }

    public static Version getVersionForDimensions(int r5, int r6) throws FormatException {
        if ((r5 & 1) != 0) goto L17;
        if ((r6 & 1) != 0) goto L17;
        Version[] r02 = VERSIONS;
        int r1 = r02.length;
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L15;
        Version r3 = r02[r2];
        if (r3.symbolSizeRows != r5) goto L13;
        if (r3.symbolSizeColumns != r6) goto L13;
        return r3;
    L13:
        r2 = r2 + 1;
        goto L7
    L15:
        throw FormatException.getFormatInstance();
    L17:
        throw FormatException.getFormatInstance();
    }

    public int getDataRegionSizeColumns() {
        return this.dataRegionSizeColumns;
    }

    public int getDataRegionSizeRows() {
        return this.dataRegionSizeRows;
    }

    public ECBlocks getECBlocks() {
        return this.ecBlocks;
    }

    public int getSymbolSizeColumns() {
        return this.symbolSizeColumns;
    }

    public int getSymbolSizeRows() {
        return this.symbolSizeRows;
    }

    public int getTotalCodewords() {
        return this.totalCodewords;
    }

    public int getVersionNumber() {
        return this.versionNumber;
    }

    public String toString() {
        return String.valueOf(this.versionNumber);
    }
}
