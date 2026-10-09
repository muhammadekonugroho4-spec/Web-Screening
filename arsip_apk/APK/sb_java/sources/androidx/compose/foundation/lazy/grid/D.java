package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* loaded from: classes.dex */
public abstract class D {
    public static final int a(C r12) {
        if (r12.a() != Orientation.Vertical) goto L5;
        boolean r02 = true;
    L6:
        List r1 = r12.j();
        if (r1.isEmpty() == false) goto L9;
        return 0;
    L9:
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
    L11:
        if (r3 >= r1.size()) goto L27;
        int r6 = b(r02, r12, r3);
        if (r6 == (-1)) goto L14;
        int r7 = 0;
    L17:
        if (r3 >= r1.size()) goto L25;
        if (b(r02, r12, r3) != r6) goto L25;
        if (r02 == false) goto L23;
        long r8 = ((InterfaceC2588m) r1.get(r3)).a() & 4294967295L;
    L24:
        r7 = Math.max(r7, (int) r8);
        r3 = r3 + 1;
        goto L17
    L23:
        r8 = ((InterfaceC2588m) r1.get(r3)).a() >> 32;
    L25:
        r4 = r4 + r7;
        r5 = r5 + 1;
        goto L11
    L14:
        r3 = r3 + 1;
        goto L11
    L27:
        return (r4 / r5) + r12.i();
    L5:
        r02 = false;
        goto L6
    }

    public static final int b(boolean r02, C r1, int r2) {
        if (r02 == false) goto L6;
        return ((InterfaceC2588m) r1.j().get(r2)).j();
    L6:
        return ((InterfaceC2588m) r1.j().get(r2)).g();
    }
}
