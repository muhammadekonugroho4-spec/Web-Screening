package androidx.compose.foundation.text.input.internal;

/* loaded from: classes.dex */
public abstract class M2 {
    public static final void a(CharSequence r2, char[] r3, int r4, int r5, int r6) {
        if ((r2 instanceof androidx.compose.foundation.text.input.g) == false) goto L6;
        ((androidx.compose.foundation.text.input.g) r2).k(r3, r4, r5, r6);
        return;
    L6:
        if (r5 >= r6) goto L8;
        r3[r4] = r2.charAt(r5);
        r5 = r5 + 1;
        r4 = r4 + 1;
        goto L6
    }
}
