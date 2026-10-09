package androidx.compose.ui.node;

/* renamed from: androidx.compose.ui.node.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3623c {
    public static int[] a(int[] r02) {
        return r02;
    }

    public static final int b(int[] r1, int r2) {
        return r1[r2 + c(r1)];
    }

    public static final int c(int[] r02) {
        return r02.length / 2;
    }

    public static final void d(int[] r1, int r2, int r3) {
        r1[r2 + c(r1)] = r3;
    }
}
