package com.stockbit.repository.securities;

import java.util.List;
import kotlin.coroutines.e;

/* loaded from: classes4.dex */
public interface c {
    static /* synthetic */ Object g(c r02, String r1, int r2, boolean r3, e r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 4) == 0) goto L7;
        r3 = false;
    L7:
        return r02.i(r1, r2, r3, r4);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderBook");
    }

    static /* synthetic */ Object h(c r02, String r1, boolean r2, boolean r3, e r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 4) == 0) goto L7;
        r3 = false;
    L7:
        return r02.a(r1, r2, r3, r4);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderBook");
    }

    static /* synthetic */ Object j(c r6, String r7, int r8, String r9, boolean r10, e r11, int r12, Object r13) {
        if (r13 != null) goto L12;
        if ((r12 & 4) == 0) goto L6;
        r9 = "";
    L6:
        String r3 = r9;
        if ((r12 & 8) == 0) goto L10;
        r10 = false;
    L10:
        return r6.d(r7, r8, r3, r10, r11);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderBook");
    }

    Object a(String r1, boolean r2, boolean r3, e r4);

    Object b(String r1, String r2, String r3, String r4, String r5, String r6, e r7);

    Object c(List r1, boolean r2, e r3);

    Object d(String r1, int r2, String r3, boolean r4, e r5);

    Object e(String r1, String r2, String r3, String r4, String r5, String r6, String r7, e r8);

    Object f(com.stockbit.domain.param.orderqueue.a r1, e r2);

    Object i(String r1, int r2, boolean r3, e r4);
}
