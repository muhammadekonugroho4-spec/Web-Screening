package androidx.compose.ui.input.key;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public abstract class d {
    public static final long a(KeyEvent r2) {
        return i.a(r2.getKeyCode());
    }

    public static final int b(KeyEvent r1) {
        int r12 = r1.getAction();
        if (r12 == 0) goto L11;
        if (r12 == 1) goto L9;
        return c.f18019a.c();
    L9:
        return c.f18019a.b();
    L11:
        return c.f18019a.a();
    }

    public static final int c(KeyEvent r02) {
        return r02.getUnicodeChar();
    }

    public static final boolean d(KeyEvent r02) {
        return r02.isAltPressed();
    }

    public static final boolean e(KeyEvent r02) {
        return r02.isCtrlPressed();
    }

    public static final boolean f(KeyEvent r02) {
        return r02.isShiftPressed();
    }
}
