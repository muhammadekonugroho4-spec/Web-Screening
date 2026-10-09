package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.C;
import androidx.compose.foundation.lazy.grid.InterfaceC2588m;

/* loaded from: classes.dex */
public abstract class e {
    public static final int a(C r4) {
        if (r4.a() != Orientation.Vertical) goto L7;
        long r02 = r4.b() & 4294967295L;
    L6:
        return (int) r02;
    L7:
        r02 = r4.b() >> 32;
        goto L6
    }

    public static final int b(InterfaceC2588m r1, Orientation r2) {
        if (r2 != Orientation.Vertical) goto L7;
        return androidx.compose.ui.unit.o.l(r1.i());
    L7:
        return androidx.compose.ui.unit.o.k(r1.i());
    }

    public static final int c(InterfaceC2588m r2, Orientation r3) {
        if (r3 != Orientation.Vertical) goto L7;
        long r22 = r2.a() & 4294967295L;
    L6:
        return (int) r22;
    L7:
        r22 = r2.a() >> 32;
        goto L6
    }
}
