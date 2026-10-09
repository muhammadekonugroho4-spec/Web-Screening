package androidx.compose.ui.text.input;

import androidx.compose.ui.text.E1;
import androidx.compose.ui.text.F1;

/* renamed from: androidx.compose.ui.text.input.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3791m {
    public static final long a(long r3, long r5) {
        int r02 = E1.l(r3);
        int r1 = E1.k(r3);
        if (E1.p(r5, r3) == false) goto L16;
        if (E1.d(r5, r3) == false) goto L8;
        r02 = E1.l(r5);
        r1 = r02;
    L19:
        return F1.b(r02, r1);
    L8:
        if (E1.d(r3, r5) == false) goto L12;
        int r32 = E1.j(r5);
    L10:
        r1 = r1 - r32;
        goto L19
    L12:
        if (E1.e(r5, r02) == false) goto L14;
        r02 = E1.l(r5);
        r32 = E1.j(r5);
        goto L10
    L14:
        r1 = E1.l(r5);
        goto L19
    L16:
        if (r1 <= E1.l(r5)) goto L19;
        r02 = r02 - E1.j(r5);
        r32 = E1.j(r5);
        goto L10
    }
}
