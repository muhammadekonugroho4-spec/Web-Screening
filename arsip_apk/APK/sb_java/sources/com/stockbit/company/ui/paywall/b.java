package com.stockbit.company.ui.paywall;

/* loaded from: classes7.dex */
public interface b {
    void C3();

    void F0();

    default void X2(Boolean r1) {
        if (com.stockbit.lib.extension.b.b(r1) == false) goto L6;
        C3();
        return;
    L6:
        F0();
    }
}
