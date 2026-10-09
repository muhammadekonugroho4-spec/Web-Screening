package com.stockbit.support.crisp;

import kotlin.jvm.functions.l;

/* loaded from: classes11.dex */
public interface a {
    static /* synthetic */ void f(a r02, l r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = null;
    L6:
        r02.d(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateCrispTokenId");
    }

    static /* synthetic */ void j(a r02, String r1, l r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = null;
    L6:
        r02.m(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    void a(l r1);

    void b(String r1);

    void c(String r1);

    void d(l r1);

    void e();

    void g();

    void h(String r1);

    void i(String r1);

    void k();

    void l(String r1);

    void m(String r1, l r2);

    void n(com.stockbit.support.crisp.domain.a r1);

    void o(boolean r1);
}
