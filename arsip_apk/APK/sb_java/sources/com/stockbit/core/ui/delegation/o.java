package com.stockbit.core.ui.delegation;

import com.stockbit.core.ui.delegation.MainActivityDialogDelegateImpl;

/* loaded from: classes8.dex */
public interface o {
    static /* synthetic */ void g(o r02, MainActivityDialogDelegateImpl.a.InterfaceC0752a r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = null;
    L6:
        r02.h(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNextDialogOnQueue");
    }

    void a();

    void b();

    void c();

    void d(boolean r1);

    void e();

    void f(String r1);

    void h(MainActivityDialogDelegateImpl.a.InterfaceC0752a r1);

    void i();
}
