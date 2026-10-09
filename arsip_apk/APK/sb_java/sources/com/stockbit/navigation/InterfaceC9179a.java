package com.stockbit.navigation;

import android.os.Bundle;

/* renamed from: com.stockbit.navigation.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC9179a {
    static /* synthetic */ void T(InterfaceC9179a r02, BottomNavigationMenu r1, Bundle r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = null;
    L6:
        r02.R(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSelectBottomMenu");
    }

    void E0(boolean r1);

    void R(BottomNavigationMenu r1, Bundle r2);

    boolean l0();
}
