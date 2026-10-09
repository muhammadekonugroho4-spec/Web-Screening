package com.google.zxing.qrcode.decoder;

/* loaded from: classes6.dex */
public enum ErrorCorrectionLevel extends Enum<ErrorCorrectionLevel> {
    private static final /* synthetic */ ErrorCorrectionLevel[] $VALUES = null;
    private static final ErrorCorrectionLevel[] FOR_BITS = null;

    /* renamed from: H, reason: collision with root package name */
    public static final ErrorCorrectionLevel f38813H = null;

    /* renamed from: L, reason: collision with root package name */
    public static final ErrorCorrectionLevel f38814L = null;

    /* renamed from: M, reason: collision with root package name */
    public static final ErrorCorrectionLevel f38815M = null;

    /* renamed from: Q, reason: collision with root package name */
    public static final ErrorCorrectionLevel f38816Q = null;
    private final int bits;

    static {
        ErrorCorrectionLevel r02 = new ErrorCorrectionLevel("L", 0, 1);
        f38814L = r02;
        ErrorCorrectionLevel r1 = new ErrorCorrectionLevel("M", 1, 0);
        f38815M = r1;
        ErrorCorrectionLevel r2 = new ErrorCorrectionLevel("Q", 2, 3);
        f38816Q = r2;
        ErrorCorrectionLevel r3 = new ErrorCorrectionLevel("H", 3, 2);
        f38813H = r3;
        $VALUES = new ErrorCorrectionLevel[]{r02, r1, r2, r3};
        FOR_BITS = new ErrorCorrectionLevel[]{r1, r02, r3, r2};
    }

    ErrorCorrectionLevel(String r1, int r2, int r3) {
        this.bits = r3;
    }

    public static ErrorCorrectionLevel forBits(int r2) {
        if (r2 < 0) goto L8;
        ErrorCorrectionLevel[] r02 = FOR_BITS;
        if (r2 >= r02.length) goto L8;
        return r02[r2];
    L8:
        throw new IllegalArgumentException();
    }

    public static ErrorCorrectionLevel valueOf(String r1) {
        return (ErrorCorrectionLevel) Enum.valueOf(ErrorCorrectionLevel.class, r1);
    }

    public static ErrorCorrectionLevel[] values() {
        return (ErrorCorrectionLevel[]) $VALUES.clone();
    }

    public int getBits() {
        return this.bits;
    }
}
