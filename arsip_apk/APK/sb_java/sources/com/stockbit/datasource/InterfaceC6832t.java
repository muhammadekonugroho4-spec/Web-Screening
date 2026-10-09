package com.stockbit.datasource;

/* renamed from: com.stockbit.datasource.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC6832t {
    static /* synthetic */ Object k(InterfaceC6832t r02, String r1, boolean r2, kotlin.coroutines.e r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L7;
        r2 = false;
    L7:
        return r02.f(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderDetail");
    }

    Object a(String r1, kotlin.coroutines.e r2);

    Object b(String r1, kotlin.coroutines.e r2);

    Object c(String r1, kotlin.coroutines.e r2);

    Object d(String r1, String r2, String r3, String r4, String r5, kotlin.coroutines.e r6);

    Object e(String r1, double r2, double r4, kotlin.coroutines.e r6);

    Object f(String r1, boolean r2, kotlin.coroutines.e r3);

    Object g(String r1, kotlin.coroutines.e r2);

    Object getAmendBuyTransaction(String r1, kotlin.coroutines.e r2);

    Object getAmendSellTransaction(String r1, kotlin.coroutines.e r2);

    Object getChargeFormula(kotlin.coroutines.e r1);

    Object getChargeFormulaVersion(kotlin.coroutines.e r1);

    Object getPosition(String r1, String r2, kotlin.coroutines.e r3);

    Object h(String r1, double r2, double r4, kotlin.coroutines.e r6);

    Object i(String r1, String r2, String r3, String r4, String r5, String r6, kotlin.coroutines.e r7);

    Object j(String r1, kotlin.coroutines.e r2);
}
