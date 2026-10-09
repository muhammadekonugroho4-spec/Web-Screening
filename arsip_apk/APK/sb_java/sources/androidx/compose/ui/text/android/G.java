package androidx.compose.ui.text.android;

import android.text.Layout;

/* loaded from: classes.dex */
public abstract class G {
    public static final int a(Layout r2, int r3, boolean r4) {
        if (r3 > 0) goto L6;
        return 0;
    L6:
        if (r3 >= r2.getText().length()) goto L8;
        int r02 = r2.getLineForOffset(r3);
        int r1 = r2.getLineStart(r02);
        int r22 = r2.getLineEnd(r02);
        if (r1 == r3) goto L13;
        if (r22 == r3) goto L13;
    L18:
        return r02;
    L13:
        if (r1 != r3) goto L17;
        if (r4 == false) goto L18;
        return r02 - 1;
    L17:
        if (r4 == true) goto L18;
        return r02 + 1;
    L8:
        return r2.getLineCount() - 1;
    }
}
