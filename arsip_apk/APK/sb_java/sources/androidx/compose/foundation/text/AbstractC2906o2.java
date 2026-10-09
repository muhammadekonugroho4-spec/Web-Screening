package androidx.compose.foundation.text;

import android.view.KeyEvent;

/* renamed from: androidx.compose.foundation.text.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2906o2 {
    public static final boolean a(KeyEvent r1) {
        if (r1.getAction() == 0) goto L5;
        return false;
    L5:
        if (Character.isISOControl(r1.getUnicodeChar()) == true) goto L10;
        return true;
    L10:
        return false;
    }
}
