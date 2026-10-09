package kotlin.collections.unsigned;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class b extends a {
    public static boolean a(short[] r1, short[] r2) {
        if (r1 != null) goto L5;
        r1 = null;
    L5:
        if (r2 != null) goto L8;
        r2 = null;
    L8:
        return Arrays.equals(r1, r2);
    }

    public static boolean b(int[] r1, int[] r2) {
        if (r1 != null) goto L5;
        r1 = null;
    L5:
        if (r2 != null) goto L8;
        r2 = null;
    L8:
        return Arrays.equals(r1, r2);
    }

    public static boolean c(byte[] r1, byte[] r2) {
        if (r1 != null) goto L5;
        r1 = null;
    L5:
        if (r2 != null) goto L8;
        r2 = null;
    L8:
        return Arrays.equals(r1, r2);
    }

    public static boolean d(long[] r1, long[] r2) {
        if (r1 != null) goto L5;
        r1 = null;
    L5:
        if (r2 != null) goto L8;
        r2 = null;
    L8:
        return Arrays.equals(r1, r2);
    }
}
