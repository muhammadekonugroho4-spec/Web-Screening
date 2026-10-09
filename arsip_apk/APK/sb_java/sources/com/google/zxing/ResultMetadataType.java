package com.google.zxing;

/* loaded from: classes6.dex */
public enum ResultMetadataType extends Enum<ResultMetadataType> {
    private static final /* synthetic */ ResultMetadataType[] $VALUES = null;
    public static final ResultMetadataType BYTE_SEGMENTS = null;
    public static final ResultMetadataType ERROR_CORRECTION_LEVEL = null;
    public static final ResultMetadataType ISSUE_NUMBER = null;
    public static final ResultMetadataType ORIENTATION = null;
    public static final ResultMetadataType OTHER = null;
    public static final ResultMetadataType PDF417_EXTRA_METADATA = null;
    public static final ResultMetadataType POSSIBLE_COUNTRY = null;
    public static final ResultMetadataType STRUCTURED_APPEND_PARITY = null;
    public static final ResultMetadataType STRUCTURED_APPEND_SEQUENCE = null;
    public static final ResultMetadataType SUGGESTED_PRICE = null;
    public static final ResultMetadataType UPC_EAN_EXTENSION = null;

    static {
        ResultMetadataType r02 = new ResultMetadataType("OTHER", 0);
        OTHER = r02;
        ResultMetadataType r1 = new ResultMetadataType("ORIENTATION", 1);
        ORIENTATION = r1;
        ResultMetadataType r2 = new ResultMetadataType("BYTE_SEGMENTS", 2);
        BYTE_SEGMENTS = r2;
        ResultMetadataType r3 = new ResultMetadataType("ERROR_CORRECTION_LEVEL", 3);
        ERROR_CORRECTION_LEVEL = r3;
        ResultMetadataType r4 = new ResultMetadataType("ISSUE_NUMBER", 4);
        ISSUE_NUMBER = r4;
        ResultMetadataType r5 = new ResultMetadataType("SUGGESTED_PRICE", 5);
        SUGGESTED_PRICE = r5;
        ResultMetadataType r6 = new ResultMetadataType("POSSIBLE_COUNTRY", 6);
        POSSIBLE_COUNTRY = r6;
        ResultMetadataType r7 = new ResultMetadataType("UPC_EAN_EXTENSION", 7);
        UPC_EAN_EXTENSION = r7;
        ResultMetadataType r8 = new ResultMetadataType("PDF417_EXTRA_METADATA", 8);
        PDF417_EXTRA_METADATA = r8;
        ResultMetadataType r9 = new ResultMetadataType("STRUCTURED_APPEND_SEQUENCE", 9);
        STRUCTURED_APPEND_SEQUENCE = r9;
        ResultMetadataType r10 = new ResultMetadataType("STRUCTURED_APPEND_PARITY", 10);
        STRUCTURED_APPEND_PARITY = r10;
        $VALUES = new ResultMetadataType[]{r02, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10};
    }

    ResultMetadataType(String r1, int r2) {
    }

    public static ResultMetadataType valueOf(String r1) {
        return (ResultMetadataType) Enum.valueOf(ResultMetadataType.class, r1);
    }

    public static ResultMetadataType[] values() {
        return (ResultMetadataType[]) $VALUES.clone();
    }
}
