package com.google.zxing;

import com.google.zxing.client.android.Intents;
import java.util.List;

/* loaded from: classes6.dex */
public enum DecodeHintType extends Enum<DecodeHintType> {
    private static final /* synthetic */ DecodeHintType[] $VALUES = null;
    public static final DecodeHintType ALLOWED_EAN_EXTENSIONS = null;
    public static final DecodeHintType ALLOWED_LENGTHS = null;
    public static final DecodeHintType ASSUME_CODE_39_CHECK_DIGIT = null;
    public static final DecodeHintType ASSUME_GS1 = null;
    public static final DecodeHintType CHARACTER_SET = null;
    public static final DecodeHintType NEED_RESULT_POINT_CALLBACK = null;
    public static final DecodeHintType OTHER = null;
    public static final DecodeHintType POSSIBLE_FORMATS = null;
    public static final DecodeHintType PURE_BARCODE = null;
    public static final DecodeHintType RETURN_CODABAR_START_END = null;
    public static final DecodeHintType TRY_HARDER = null;
    private final Class<?> valueType;

    static {
        DecodeHintType r02 = new DecodeHintType("OTHER", 0, Object.class);
        OTHER = r02;
        DecodeHintType r1 = new DecodeHintType("PURE_BARCODE", 1, Void.class);
        PURE_BARCODE = r1;
        DecodeHintType r2 = new DecodeHintType("POSSIBLE_FORMATS", 2, List.class);
        POSSIBLE_FORMATS = r2;
        DecodeHintType r3 = new DecodeHintType("TRY_HARDER", 3, Void.class);
        TRY_HARDER = r3;
        DecodeHintType r4 = new DecodeHintType(Intents.Scan.CHARACTER_SET, 4, String.class);
        CHARACTER_SET = r4;
        DecodeHintType r5 = new DecodeHintType("ALLOWED_LENGTHS", 5, int[].class);
        ALLOWED_LENGTHS = r5;
        DecodeHintType r6 = new DecodeHintType("ASSUME_CODE_39_CHECK_DIGIT", 6, Void.class);
        ASSUME_CODE_39_CHECK_DIGIT = r6;
        DecodeHintType r7 = new DecodeHintType("ASSUME_GS1", 7, Void.class);
        ASSUME_GS1 = r7;
        DecodeHintType r8 = new DecodeHintType("RETURN_CODABAR_START_END", 8, Void.class);
        RETURN_CODABAR_START_END = r8;
        DecodeHintType r9 = new DecodeHintType("NEED_RESULT_POINT_CALLBACK", 9, ResultPointCallback.class);
        NEED_RESULT_POINT_CALLBACK = r9;
        DecodeHintType r10 = new DecodeHintType("ALLOWED_EAN_EXTENSIONS", 10, int[].class);
        ALLOWED_EAN_EXTENSIONS = r10;
        $VALUES = new DecodeHintType[]{r02, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10};
    }

    DecodeHintType(String r1, int r2, Class r3) {
        this.valueType = r3;
    }

    public static DecodeHintType valueOf(String r1) {
        return (DecodeHintType) Enum.valueOf(DecodeHintType.class, r1);
    }

    public static DecodeHintType[] values() {
        return (DecodeHintType[]) $VALUES.clone();
    }

    public Class<?> getValueType() {
        return this.valueType;
    }
}
