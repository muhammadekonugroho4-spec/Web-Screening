package androidx.compose.foundation.text.input.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class A1 {
    public static int[] a(int r02) {
        return b(new int[r02 * 3]);
    }

    public static int[] b(int[] r02) {
        return r02;
    }

    public static final int[] c(int[] r02, int r1) {
        int[] r03 = Arrays.copyOf(r02, r1 * 3);
        kotlin.jvm.internal.p.k(r03, "copyOf(...)");
        return b(r03);
    }

    public static final int d(int[] r02) {
        return r02.length / 3;
    }

    public static final void e(int[] r02, int r1, int r2, int r3, int r4) {
        int r12 = r1 * 3;
        r02[r12] = r2;
        r02[r12 + 1] = r3;
        r02[r12 + 2] = r4;
    }
}
