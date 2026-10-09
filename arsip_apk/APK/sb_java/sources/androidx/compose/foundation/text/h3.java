package androidx.compose.foundation.text;

import androidx.compose.ui.text.C3740e;

/* loaded from: classes.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.text.input.G f9956a = null;

    static {
        f9956a = new g3(androidx.compose.ui.text.input.G.f19987a.a(), 0, 0);
    }

    public static final /* synthetic */ void a(int r02, int r1, int r2) {
        g(r02, r1, r2);
    }

    public static final /* synthetic */ void b(int r02, int r1, int r2) {
        h(r02, r1, r2);
    }

    public static final androidx.compose.ui.text.input.a0 c(androidx.compose.ui.text.input.c0 r4, C3740e r5) {
        androidx.compose.ui.text.input.a0 r42 = r4.a(r5);
        f(r42, r5.length(), 0, 2, null);
        return new androidx.compose.ui.text.input.a0(r42.b(), new g3(r42.a(), r5.length(), r42.b().length()));
    }

    public static final androidx.compose.ui.text.input.G d() {
        return f9956a;
    }

    public static final void e(androidx.compose.ui.text.input.a0 r5, int r6, int r7) {
        int r02 = r5.b().length();
        int r1 = Math.min(r6, r7);
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        g(r5.a().b(r3), r02, r3);
        r3 = r3 + 1;
        goto L3
    L5:
        g(r5.a().b(r6), r02, r6);
        int r72 = Math.min(r02, r7);
    L6:
        if (r2 >= r72) goto L8;
        h(r5.a().a(r2), r6, r2);
        r2 = r2 + 1;
        goto L6
    L8:
        h(r5.a().a(r02), r6, r02);
    }

    public static /* synthetic */ void f(androidx.compose.ui.text.input.a0 r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 100;
    L5:
        e(r02, r1, r2);
    }

    public static final void g(int r2, int r3, int r4) {
        boolean r02 = false;
        if (r2 < 0) goto L6;
        if (r2 > r3) goto L6;
        r02 = true;
    L6:
        if (r02 == true) goto L9;
        androidx.compose.foundation.internal.e.c("OffsetMapping.originalToTransformed returned invalid mapping: " + r4 + " -> " + r2 + " is not in range of transformed text [0, " + r3 + ']');
        return;
    }

    public static final void h(int r2, int r3, int r4) {
        boolean r02 = false;
        if (r2 < 0) goto L6;
        if (r2 > r3) goto L6;
        r02 = true;
    L6:
        if (r02 == true) goto L9;
        androidx.compose.foundation.internal.e.c("OffsetMapping.transformedToOriginal returned invalid mapping: " + r4 + " -> " + r2 + " is not in range of original text [0, " + r3 + ']');
        return;
    }
}
