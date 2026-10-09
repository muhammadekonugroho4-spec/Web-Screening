package com.stockbit.usecase.watchlistmain.contract.repository;

import java.util.List;
import kotlin.coroutines.e;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public interface a {
    Object a(String r1, String r2, boolean r3, e r4);

    Object b(List r1, boolean r2, e r3);

    Flow c(String r1);

    Object d(e r1);

    Object deleteCompany(String r1, String r2, e r3);

    Object e(e r1);

    Object f(String r1, int r2, boolean r3, e r4);

    Object g(boolean r1, e r2);

    Object h(String r1, int r2, int r3, boolean r4, e r5);

    Object i(List r1, boolean r2, e r3);
}
