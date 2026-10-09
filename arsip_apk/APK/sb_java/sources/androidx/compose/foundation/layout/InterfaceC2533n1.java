package androidx.compose.foundation.layout;

import androidx.compose.ui.e;

/* renamed from: androidx.compose.foundation.layout.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2533n1 {
    static /* synthetic */ androidx.compose.ui.m d(InterfaceC2533n1 r02, androidx.compose.ui.m r1, float r2, boolean r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L7;
        r3 = true;
    L7:
        return r02.a(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }

    androidx.compose.ui.m a(androidx.compose.ui.m r1, float r2, boolean r3);

    androidx.compose.ui.m b(androidx.compose.ui.m r1, e.c r2);

    androidx.compose.ui.m c(androidx.compose.ui.m r1);
}
