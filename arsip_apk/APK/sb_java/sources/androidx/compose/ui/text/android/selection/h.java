package androidx.compose.ui.text.android.selection;

/* loaded from: classes.dex */
public abstract class h {
    public static final int a(i r1, int r2) {
        if (r1.i(r1.p(r2)) == false) goto L5;
        int r12 = r1.g(r2);
    L7:
        if (r12 != (-1)) goto L9;
        return r2;
    L9:
        return r12;
    L5:
        r12 = r1.d(r2);
        goto L7
    }

    public static final int b(i r1, int r2) {
        if (r1.m(r1.q(r2)) == false) goto L5;
        int r12 = r1.f(r2);
    L7:
        if (r12 != (-1)) goto L9;
        return r2;
    L9:
        return r12;
    L5:
        r12 = r1.e(r2);
        goto L7
    }
}
