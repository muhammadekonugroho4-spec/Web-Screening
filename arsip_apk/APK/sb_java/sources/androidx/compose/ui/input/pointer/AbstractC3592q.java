package androidx.compose.ui.input.pointer;

/* renamed from: androidx.compose.ui.input.pointer.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3592q {
    public static final int a() {
        return I.b(0);
    }

    public static final boolean b(int r02) {
        if ((r02 & 33) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean c(int r02) {
        if ((r02 & 66) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean d(int r1) {
        if ((r1 & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }
}
