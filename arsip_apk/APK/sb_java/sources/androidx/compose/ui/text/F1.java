package androidx.compose.ui.text;

/* loaded from: classes.dex */
public abstract class F1 {
    public static final long a(int r2) {
        return b(r2, r2);
    }

    public static final long b(int r02, int r1) {
        return E1.c(d(r02, r1));
    }

    public static final long c(long r2, int r4, int r5) {
        int r02 = E1.n(r2);
        if (r02 >= r4) goto L5;
        r02 = r4;
    L5:
        if (r02 <= r5) goto L7;
        r02 = r5;
    L7:
        int r1 = E1.i(r2);
        if (r1 < r4) goto L11;
        r4 = r1;
    L11:
        if (r4 > r5) goto L15;
        r5 = r4;
    L15:
        if (r02 != E1.n(r2)) goto L21;
        if (r5 != E1.i(r2)) goto L21;
        return r2;
    L21:
        return b(r02, r5);
    }

    public static final long d(int r4, int r5) {
        if (r4 < 0) goto L5;
        if (r5 < 0) goto L5;
        boolean r02 = true;
    L6:
        if (r02 == true) goto L9;
        androidx.compose.ui.text.internal.a.a("start and end cannot be negative. [start: " + r4 + ", end: " + r5 + ']');
    L9:
        return (r5 & 4294967295L) | (r4 << 32);
    L5:
        r02 = false;
        goto L6
    }

    public static final String e(CharSequence r1, long r2) {
        return r1.subSequence(E1.l(r2), E1.k(r2)).toString();
    }
}
