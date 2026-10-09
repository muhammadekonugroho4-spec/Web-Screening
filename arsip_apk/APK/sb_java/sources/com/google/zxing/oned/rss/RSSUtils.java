package com.google.zxing.oned.rss;

/* loaded from: classes6.dex */
public final class RSSUtils {
    private RSSUtils() {
    }

    private static int combins(int r4, int r5) {
        int r02 = r4 - r5;
        if (r02 > r5) goto L6;
        r02 = r5;
        r5 = r02;
    L6:
        int r1 = 1;
        int r2 = 1;
    L7:
        if (r4 <= r02) goto L12;
        r1 = r1 * r4;
        if (r2 > r5) goto L11;
        r1 = r1 / r2;
        r2 = r2 + 1;
    L11:
        r4 = r4 - 1;
    L12:
        if (r2 > r5) goto L14;
        r1 = r1 / r2;
        r2 = r2 + 1;
        goto L12
    L14:
        return r1;
    }

    public static int getRSSvalue(int[] r18, int r19, boolean r20) {
        int[] r02 = r18;
        int r2 = r02.length;
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r2) goto L5;
        r5 = r5 + r02[r4];
        r4 = r4 + 1;
        goto L3
    L5:
        int r22 = r02.length;
        int r42 = 0;
        int r6 = 0;
        int r7 = 0;
    L6:
        int r8 = r22 - 1;
        if (r42 >= r8) goto L28;
        int r10 = 1 << r42;
        r7 = r7 | r10;
        int r11 = 1;
    L10:
        if (r11 >= r02[r42]) goto L27;
        int r12 = r5 - r11;
        int r14 = r22 - r42;
        int r15 = r14 - 2;
        int r13 = combins(r12 - 1, r15);
        if (r20 == false) goto L17;
        if (r7 != 0) goto L17;
        int r3 = r14 - 1;
        if ((r12 - r3) < r3) goto L17;
        r13 = r13 - combins(r12 - r14, r15);
    L17:
        boolean r9 = true;
        if ((r14 - 1) <= 1) goto L23;
        int r32 = r12 - r15;
        int r152 = 0;
    L20:
        if (r32 <= r19) goto L22;
        r152 = r152 + combins((r12 - r32) - 1, r14 - 3);
        r32 = r32 - 1;
        r9 = r9;
        goto L20
    L22:
        boolean r17 = r9;
        r13 = r13 - (r152 * (r8 - r42));
    L26:
        r6 = r6 + r13;
        r11 = r11 + 1;
        r7 = r7 & (~r10);
        r02 = r18;
        goto L10
    L23:
        r17 = true;
        if (r12 <= r19) goto L26;
        r13 = r13 - 1;
        goto L26
    L27:
        r5 = r5 - r11;
        r42 = r42 + 1;
        r02 = r18;
        goto L6
    L28:
        return r6;
    }
}
