package com.google.zxing.qrcode.decoder;

/* loaded from: classes6.dex */
public enum Mode extends Enum<Mode> {
    private static final /* synthetic */ Mode[] $VALUES = null;
    public static final Mode ALPHANUMERIC = null;
    public static final Mode BYTE = null;
    public static final Mode ECI = null;
    public static final Mode FNC1_FIRST_POSITION = null;
    public static final Mode FNC1_SECOND_POSITION = null;
    public static final Mode HANZI = null;
    public static final Mode KANJI = null;
    public static final Mode NUMERIC = null;
    public static final Mode STRUCTURED_APPEND = null;
    public static final Mode TERMINATOR = null;
    private final int bits;
    private final int[] characterCountBitsForVersions;

    static {
        Mode r02 = new Mode("TERMINATOR", 0, new int[]{0, 0, 0}, 0);
        TERMINATOR = r02;
        Mode r2 = new Mode("NUMERIC", 1, new int[]{10, 12, 14}, 1);
        NUMERIC = r2;
        Mode r22 = new Mode("ALPHANUMERIC", 2, new int[]{9, 11, 13}, 2);
        ALPHANUMERIC = r22;
        Mode r3 = new Mode("STRUCTURED_APPEND", 3, new int[]{0, 0, 0}, 3);
        STRUCTURED_APPEND = r3;
        Mode r9 = new Mode("BYTE", 4, new int[]{8, 16, 16}, 4);
        BYTE = r9;
        Mode r10 = new Mode("ECI", 5, new int[]{0, 0, 0}, 7);
        ECI = r10;
        Mode r12 = new Mode("KANJI", 6, new int[]{8, 10, 12}, 8);
        KANJI = r12;
        Mode r7 = new Mode("FNC1_FIRST_POSITION", 7, new int[]{0, 0, 0}, 5);
        FNC1_FIRST_POSITION = r7;
        Mode r8 = new Mode("FNC1_SECOND_POSITION", 8, new int[]{0, 0, 0}, 9);
        FNC1_SECOND_POSITION = r8;
        Mode r92 = new Mode("HANZI", 9, new int[]{8, 10, 12}, 13);
        HANZI = r92;
        $VALUES = new Mode[]{r02, r2, r22, r3, r9, r10, r12, r7, r8, r92};
    }

    Mode(String r1, int r2, int[] r3, int r4) {
        this.characterCountBitsForVersions = r3;
        this.bits = r4;
    }

    public static Mode forBits(int r1) {
        if (r1 == 0) goto L42;
        if (r1 == 1) goto L40;
        if (r1 == 2) goto L38;
        if (r1 == 3) goto L36;
        if (r1 == 4) goto L34;
        if (r1 == 5) goto L32;
        if (r1 == 7) goto L30;
        if (r1 == 8) goto L28;
        if (r1 == 9) goto L26;
        if (r1 != 13) goto L24;
        return HANZI;
    L24:
        throw new IllegalArgumentException();
    L26:
        return FNC1_SECOND_POSITION;
    L28:
        return KANJI;
    L30:
        return ECI;
    L32:
        return FNC1_FIRST_POSITION;
    L34:
        return BYTE;
    L36:
        return STRUCTURED_APPEND;
    L38:
        return ALPHANUMERIC;
    L40:
        return NUMERIC;
    L42:
        return TERMINATOR;
    }

    public static Mode valueOf(String r1) {
        return (Mode) Enum.valueOf(Mode.class, r1);
    }

    public static Mode[] values() {
        return (Mode[]) $VALUES.clone();
    }

    public int getBits() {
        return this.bits;
    }

    public int getCharacterCountBits(Version r2) {
        int r22 = r2.getVersionNumber();
        if (r22 > 9) goto L6;
        char r23 = 0;
    L10:
        return this.characterCountBitsForVersions[r23];
    L6:
        if (r22 > 26) goto L8;
        r23 = 1;
        goto L10
    L8:
        r23 = 2;
        goto L10
    }
}
