package com.stockbit.userauthcontract.base;

import org.koin.core.scope.Scope;

/* loaded from: classes2.dex */
public interface a {
    Scope g();

    default void h() {
        if (g().o() == false) goto L6;
        g().c();
        return;
    }

    void i(b r1);

    void j(c r1);

    void k(boolean r1);
}
