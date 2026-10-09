package androidx.compose.ui.focus;

import androidx.compose.ui.node.InterfaceC3626f;

/* loaded from: classes.dex */
public interface z extends InterfaceC3626f {
    static /* synthetic */ boolean g0(z r02, int r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = C3490f.f17025b.b();
    L7:
        return r02.e1(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
    }

    boolean e1(int r1);

    y m1();
}
