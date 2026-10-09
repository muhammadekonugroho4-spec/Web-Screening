package androidx.compose.ui.text.android;

import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class O {
    public static final boolean a(Spanned r2, Class r3) {
        if (r2.nextSpanTransition(-1, r2.length(), r3) == r2.length()) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean b(Spanned r1, Class r2, int r3, int r4) {
        if (r1.nextSpanTransition(r3 - 1, r4, r2) == r4) goto L5;
        return true;
    L5:
        return false;
    }
}
