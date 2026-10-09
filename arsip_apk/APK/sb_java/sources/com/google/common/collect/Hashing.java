package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
final class Hashing {
    private static final long C1 = -862048943;
    private static final long C2 = 461845907;
    private static final int MAX_TABLE_SIZE = 1073741824;

    private Hashing() {
    }

    public static int closedTableSize(int r3, double r4) {
        int r32 = Math.max(r3, 2);
        int r02 = Integer.highestOneBit(r32);
        if (r32 <= ((int) (r4 * r02))) goto L9;
        int r33 = r02 << 1;
        if (r33 <= 0) goto L7;
        return r33;
    L7:
        return 1073741824;
    L9:
        return r02;
    }

    public static boolean needsResizing(int r4, int r5, double r6) {
        if (r4 > (r6 * r5)) goto L5;
        return false;
    L5:
        if (r5 >= 1073741824) goto L10;
        return true;
    L10:
        return false;
    }

    public static int smear(int r4) {
        return (int) (Integer.rotateLeft((int) (r4 * C1), 15) * C2);
    }

    public static int smearedHash(Object r02) {
        if (r02 != null) goto L4;
        int r03 = 0;
    L6:
        return smear(r03);
    L4:
        r03 = r02.hashCode();
        goto L6
    }
}
