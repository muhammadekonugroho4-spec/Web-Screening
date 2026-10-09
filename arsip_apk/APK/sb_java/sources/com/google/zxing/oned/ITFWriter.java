package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ITFWriter extends OneDimensionalCodeWriter {
    private static final int[] END_PATTERN = null;

    /* renamed from: N, reason: collision with root package name */
    private static final int f38811N = 1;
    private static final int[][] PATTERNS = null;
    private static final int[] START_PATTERN = null;

    /* renamed from: W, reason: collision with root package name */
    private static final int f38812W = 3;

    static {
        START_PATTERN = new int[]{1, 1, 1, 1};
        END_PATTERN = new int[]{3, 1, 1};
        PATTERNS = new int[][]{new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    }

    public ITFWriter() {
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String r2, BarcodeFormat r3, int r4, int r5, Map<EncodeHintType, ?> r6) throws WriterException {
        if (r3 != BarcodeFormat.ITF) goto L7;
        return super.encode(r2, r3, r4, r5, r6);
    L7:
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(r3)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String r14) {
        int r02 = r14.length();
        if ((r02 % 2) != 0) goto L18;
        if (r02 > 80) goto L16;
        boolean[] r1 = new boolean[(r02 * 9) + 9];
        int r2 = OneDimensionalCodeWriter.appendPattern(r1, 0, START_PATTERN, true);
        int r5 = 0;
    L7:
        if (r5 >= r02) goto L13;
        int r6 = Character.digit(r14.charAt(r5), 10);
        int r8 = Character.digit(r14.charAt(r5 + 1), 10);
        int[] r7 = new int[10];
        int r9 = 0;
    L10:
        if (r9 >= 5) goto L12;
        int r10 = r9 * 2;
        int[][] r11 = PATTERNS;
        r7[r10] = r11[r6][r9];
        r7[r10 + 1] = r11[r8][r9];
        r9 = r9 + 1;
        goto L10
    L12:
        r2 = r2 + OneDimensionalCodeWriter.appendPattern(r1, r2, r7, true);
        r5 = r5 + 2;
        goto L7
    L13:
        OneDimensionalCodeWriter.appendPattern(r1, r2, END_PATTERN, true);
        return r1;
    L16:
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(r02)));
    L18:
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
