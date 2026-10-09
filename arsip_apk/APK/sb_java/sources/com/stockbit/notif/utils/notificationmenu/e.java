package com.stockbit.notif.utils.notificationmenu;

/* loaded from: classes10.dex */
public interface e {
    static /* synthetic */ void G1(e r02, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        r02.n1(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderToolbar");
    }

    void n1(boolean r1);
}
