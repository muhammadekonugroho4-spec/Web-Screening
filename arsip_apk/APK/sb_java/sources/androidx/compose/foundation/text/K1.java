package androidx.compose.foundation.text;

/* loaded from: classes.dex */
public abstract class K1 {
    public static final int a(CharSequence r3, int r4) {
        int r02 = r3.length();
    L3:
        if (r4 >= r02) goto L9;
        if (r3.charAt(r4) == '\n') goto L6;
        r4 = r4 + 1;
        goto L3
    L6:
        return r4;
    L9:
        return r3.length();
    }

    public static final int b(CharSequence r2, int r3) {
    L2:
        if (r3 <= 0) goto L7;
        if (r2.charAt(r3 - 1) == '\n') goto L5;
        r3 = r3 - 1;
        goto L2
    L5:
        return r3;
    L7:
        return 0;
    }

    public static final long c(CharSequence r1, int r2) {
        return androidx.compose.ui.text.F1.b(b(r1, r2), a(r1, r2));
    }
}
