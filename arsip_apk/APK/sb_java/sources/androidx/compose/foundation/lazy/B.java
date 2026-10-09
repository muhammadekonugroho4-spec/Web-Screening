package androidx.compose.foundation.lazy;

import java.util.List;

/* loaded from: classes.dex */
public abstract class B {
    public static final int a(A r5) {
        List r02 = r5.j();
        int r2 = 0;
        if (r02.isEmpty() == false) goto L5;
        return 0;
    L5:
        int r1 = r02.size();
        int r3 = 0;
    L6:
        if (r2 >= r1) goto L9;
        r3 = r3 + ((InterfaceC2658q) r02.get(r2)).getSize();
        r2 = r2 + 1;
        goto L6
    L9:
        return (r3 / r02.size()) + r5.i();
    }
}
