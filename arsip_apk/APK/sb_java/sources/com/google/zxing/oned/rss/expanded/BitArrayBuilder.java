package com.google.zxing.oned.rss.expanded;

import com.google.zxing.common.BitArray;
import java.util.List;

/* loaded from: classes6.dex */
final class BitArrayBuilder {
    private BitArrayBuilder() {
    }

    public static BitArray buildBitArray(List<ExpandedPair> r9) {
        int r02 = r9.size() << 1;
        int r2 = r02 - 1;
        if (r9.get(r9.size() - 1).getRightChar() != null) goto L5;
        r2 = r02 - 2;
    L5:
        BitArray r03 = new BitArray(r2 * 12);
        int r22 = 0;
        int r3 = r9.get(0).getRightChar().getValue();
        int r5 = 11;
    L6:
        if (r5 < 0) goto L11;
        if (((1 << r5) & r3) == 0) goto L10;
        r03.set(r22);
    L10:
        r22 = r22 + 1;
        r5 = r5 - 1;
        goto L6
    L11:
        int r32 = 1;
    L13:
        if (r32 >= r9.size()) goto L29;
        ExpandedPair r52 = r9.get(r32);
        int r6 = r52.getLeftChar().getValue();
        int r7 = 11;
    L15:
        if (r7 < 0) goto L21;
        if (((1 << r7) & r6) == 0) goto L19;
        r03.set(r22);
    L19:
        r22 = r22 + 1;
        r7 = r7 - 1;
        goto L15
    L21:
        if (r52.getRightChar() == null) goto L28;
        int r53 = r52.getRightChar().getValue();
        int r62 = 11;
    L23:
        if (r62 < 0) goto L28;
        if (((1 << r62) & r53) == 0) goto L27;
        r03.set(r22);
    L27:
        r22 = r22 + 1;
        r62 = r62 - 1;
    L28:
        r32 = r32 + 1;
        goto L13
    L29:
        return r03;
    }
}
