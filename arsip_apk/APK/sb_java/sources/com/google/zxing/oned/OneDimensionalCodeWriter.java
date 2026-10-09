package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    public OneDimensionalCodeWriter() {
    }

    public static int appendPattern(boolean[] r7, int r8, int[] r9, boolean r10) {
        int r02 = r9.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r02) goto L8;
        int r4 = r9[r2];
        int r5 = 0;
    L5:
        if (r5 >= r4) goto L7;
        r7[r8] = r10;
        r5 = r5 + 1;
        r8 = r8 + 1;
        goto L5
    L7:
        r3 = r3 + r4;
        r10 = !r10;
        r2 = r2 + 1;
        goto L3
    L8:
        return r3;
    }

    private static BitMatrix renderResult(boolean[] r5, int r6, int r7, int r8) {
        int r02 = r5.length;
        int r82 = r8 + r02;
        int r62 = Math.max(r6, r82);
        int r72 = Math.max(1, r7);
        int r83 = r62 / r82;
        int r1 = (r62 - (r02 * r83)) / 2;
        BitMatrix r2 = new BitMatrix(r62, r72);
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L8;
        if (r5[r3] == false) goto L7;
        r2.setRegion(r1, 0, r83, r72);
    L7:
        r3 = r3 + 1;
        r1 = r1 + r83;
        goto L3
    L8:
        return r2;
    }

    @Override // com.google.zxing.Writer
    public final BitMatrix encode(String r7, BarcodeFormat r8, int r9, int r10) throws WriterException {
        return encode(r7, r8, r9, r10, null);
    }

    public abstract boolean[] encode(String r1);

    public int getDefaultMargin() {
        return 10;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String r3, BarcodeFormat r4, int r5, int r6, Map<EncodeHintType, ?> r7) throws WriterException {
        if (r3.isEmpty() == true) goto L16;
        if (r5 < 0) goto L14;
        if (r6 < 0) goto L14;
        int r42 = getDefaultMargin();
        if (r7 == null) goto L12;
        EncodeHintType r02 = EncodeHintType.MARGIN;
        if (r7.containsKey(r02) == false) goto L12;
        r42 = Integer.parseInt(r7.get(r02).toString());
    L12:
        return renderResult(encode(r3), r5, r6, r42);
    L14:
        throw new IllegalArgumentException("Negative size is not allowed. Input: " + r5 + 'x' + r6);
    L16:
        throw new IllegalArgumentException("Found empty contents");
    }
}
