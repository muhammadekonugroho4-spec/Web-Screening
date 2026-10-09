package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.z;

/* renamed from: androidx.compose.ui.text.font.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3749d {
    public static final z a(z.a r02) {
        return r02.m();
    }

    public static final int b(boolean r02, boolean r1) {
        if (r1 == false) goto L6;
        if (r02 == false) goto L6;
        return 3;
    L6:
        if (r02 == false) goto L9;
        return 1;
    L9:
        if (r1 == false) goto L12;
        return 2;
    L12:
        return 0;
    }

    public static final int c(z r1, int r2) {
        if (r1.r(a(z.f19942b)) < 0) goto L5;
        boolean r12 = true;
    L7:
        return b(r12, C3765u.f(r2, C3765u.f19932b.a()));
    L5:
        r12 = false;
        goto L7
    }
}
