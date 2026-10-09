package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
enum DataMask extends Enum<DataMask> {
    private static final /* synthetic */ DataMask[] $VALUES = null;
    public static final DataMask DATA_MASK_000 = null;
    public static final DataMask DATA_MASK_001 = null;
    public static final DataMask DATA_MASK_010 = null;
    public static final DataMask DATA_MASK_011 = null;
    public static final DataMask DATA_MASK_100 = null;
    public static final DataMask DATA_MASK_101 = null;
    public static final DataMask DATA_MASK_110 = null;
    public static final DataMask DATA_MASK_111 = null;

    static {
        final String r1 = "DATA_MASK_000";
        final int r2 = 0;
        DataMask r02 = new AnonymousClass1(r1, r2);
        DATA_MASK_000 = r02;
        final String r3 = "DATA_MASK_001";
        final int r4 = 1;
        DataMask r12 = new AnonymousClass2(r3, r4);
        DATA_MASK_001 = r12;
        final String r5 = "DATA_MASK_010";
        final int r6 = 2;
        DataMask r32 = new AnonymousClass3(r5, r6);
        DATA_MASK_010 = r32;
        final String r7 = "DATA_MASK_011";
        final int r8 = 3;
        DataMask r52 = new AnonymousClass4(r7, r8);
        DATA_MASK_011 = r52;
        final String r9 = "DATA_MASK_100";
        final int r10 = 4;
        DataMask r72 = new AnonymousClass5(r9, r10);
        DATA_MASK_100 = r72;
        final String r11 = "DATA_MASK_101";
        final int r122 = 5;
        DataMask r92 = new AnonymousClass6(r11, r122);
        DATA_MASK_101 = r92;
        final String r13 = "DATA_MASK_110";
        final int r14 = 6;
        DataMask r112 = new AnonymousClass7(r13, r14);
        DATA_MASK_110 = r112;
        final String r15 = "DATA_MASK_111";
        final int r22 = 7;
        DataMask r132 = new AnonymousClass8(r15, r22);
        DATA_MASK_111 = r132;
        $VALUES = new DataMask[]{r02, r12, r32, r52, r72, r92, r112, r132};
    }

    DataMask(String r1, int r2) {
    }

    public static DataMask valueOf(String r1) {
        return (DataMask) Enum.valueOf(DataMask.class, r1);
    }

    public static DataMask[] values() {
        return (DataMask[]) $VALUES.clone();
    }

    public abstract boolean isMasked(int r1, int r2);

    public final void unmaskBitMatrix(BitMatrix r5, int r6) {
        int r1 = 0;
    L3:
        if (r1 >= r6) goto L11;
        int r2 = 0;
    L5:
        if (r2 >= r6) goto L10;
        if (isMasked(r1, r2) == false) goto L9;
        r5.flip(r2, r1);
    L9:
        r2 = r2 + 1;
        goto L5
    L10:
        r1 = r1 + 1;
        goto L3
    }

    /* synthetic */ DataMask(String r1, int r2, AnonymousClass1 r3) {
        this(r1, r2);
    }
}
