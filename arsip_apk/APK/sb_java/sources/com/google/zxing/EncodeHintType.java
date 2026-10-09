package com.google.zxing;

import com.google.zxing.client.android.Intents;

/* loaded from: classes6.dex */
public enum EncodeHintType extends Enum<EncodeHintType> {
    private static final /* synthetic */ EncodeHintType[] $VALUES = null;
    public static final EncodeHintType AZTEC_LAYERS = null;
    public static final EncodeHintType CHARACTER_SET = null;
    public static final EncodeHintType DATA_MATRIX_SHAPE = null;
    public static final EncodeHintType ERROR_CORRECTION = null;
    public static final EncodeHintType GS1_FORMAT = null;
    public static final EncodeHintType MARGIN = null;

    @Deprecated
    public static final EncodeHintType MAX_SIZE = null;

    @Deprecated
    public static final EncodeHintType MIN_SIZE = null;
    public static final EncodeHintType PDF417_COMPACT = null;
    public static final EncodeHintType PDF417_COMPACTION = null;
    public static final EncodeHintType PDF417_DIMENSIONS = null;
    public static final EncodeHintType QR_VERSION = null;

    static {
        EncodeHintType r02 = new EncodeHintType("ERROR_CORRECTION", 0);
        ERROR_CORRECTION = r02;
        EncodeHintType r1 = new EncodeHintType(Intents.Scan.CHARACTER_SET, 1);
        CHARACTER_SET = r1;
        EncodeHintType r2 = new EncodeHintType("DATA_MATRIX_SHAPE", 2);
        DATA_MATRIX_SHAPE = r2;
        EncodeHintType r3 = new EncodeHintType("MIN_SIZE", 3);
        MIN_SIZE = r3;
        EncodeHintType r4 = new EncodeHintType("MAX_SIZE", 4);
        MAX_SIZE = r4;
        EncodeHintType r5 = new EncodeHintType("MARGIN", 5);
        MARGIN = r5;
        EncodeHintType r6 = new EncodeHintType("PDF417_COMPACT", 6);
        PDF417_COMPACT = r6;
        EncodeHintType r7 = new EncodeHintType("PDF417_COMPACTION", 7);
        PDF417_COMPACTION = r7;
        EncodeHintType r8 = new EncodeHintType("PDF417_DIMENSIONS", 8);
        PDF417_DIMENSIONS = r8;
        EncodeHintType r9 = new EncodeHintType("AZTEC_LAYERS", 9);
        AZTEC_LAYERS = r9;
        EncodeHintType r10 = new EncodeHintType("QR_VERSION", 10);
        QR_VERSION = r10;
        EncodeHintType r11 = new EncodeHintType("GS1_FORMAT", 11);
        GS1_FORMAT = r11;
        $VALUES = new EncodeHintType[]{r02, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11};
    }

    EncodeHintType(String r1, int r2) {
    }

    public static EncodeHintType valueOf(String r1) {
        return (EncodeHintType) Enum.valueOf(EncodeHintType.class, r1);
    }

    public static EncodeHintType[] values() {
        return (EncodeHintType[]) $VALUES.clone();
    }
}
