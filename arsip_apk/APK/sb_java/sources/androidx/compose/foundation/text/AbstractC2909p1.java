package androidx.compose.foundation.text;

import android.view.KeyEvent;

/* renamed from: androidx.compose.foundation.text.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2909p1 {
    public static final boolean a(KeyEvent r2) {
        if (r2.getKeyCode() == 4) goto L5;
        return false;
    L5:
        if (androidx.compose.ui.input.key.c.e(androidx.compose.ui.input.key.d.b(r2), androidx.compose.ui.input.key.c.f18019a.b()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static final void b() {
    }
}
