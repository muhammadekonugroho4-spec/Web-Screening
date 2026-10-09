package androidx.compose.ui.focus;

/* loaded from: classes.dex */
public interface o {
    static /* synthetic */ void d(o r02, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = false;
    L6:
        r02.C(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
    }

    void C(boolean r1);

    boolean w(int r1);
}
