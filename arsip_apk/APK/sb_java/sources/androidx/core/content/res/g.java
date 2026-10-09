package androidx.core.content.res;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public abstract class g {
    public static int[] a(int[] r2, int r3, int r4) {
        if ((r3 + 1) <= r2.length) goto L5;
        int[] r02 = new int[c(r3)];
        System.arraycopy(r2, 0, r02, 0, r3);
        r2 = r02;
    L5:
        r2[r3] = r4;
        return r2;
    }

    public static Object[] b(Object[] r2, int r3, Object r4) {
        if ((r3 + 1) <= r2.length) goto L5;
        Object[] r02 = (Object[]) Array.newInstance(r2.getClass().getComponentType(), c(r3));
        System.arraycopy(r2, 0, r02, 0, r3);
        r2 = r02;
    L5:
        r2[r3] = r4;
        return r2;
    }

    public static int c(int r1) {
        if (r1 > 4) goto L7;
        return 8;
    L7:
        return r1 * 2;
    }
}
