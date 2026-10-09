package androidx.compose.ui.input.pointer;

/* loaded from: classes.dex */
public abstract class x {
    public static long a(long r02) {
        return r02;
    }

    public static final boolean b(long r02, long r2) {
        if (r02 != r2) goto L6;
        return true;
    L6:
        return false;
    }

    public static int c(long r02) {
        return Long.hashCode(r02);
    }

    public static String d(long r2) {
        return "PointerId(value=" + r2 + ')';
    }
}
