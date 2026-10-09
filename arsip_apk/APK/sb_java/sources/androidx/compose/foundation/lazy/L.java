package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C2615e0;

/* loaded from: classes.dex */
public interface L {
    static /* synthetic */ C2615e0.b b(L r02, int r1, kotlin.jvm.functions.l r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = null;
    L7:
        return r02.a(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedulePrefetch");
    }

    C2615e0.b a(int r1, kotlin.jvm.functions.l r2);
}
