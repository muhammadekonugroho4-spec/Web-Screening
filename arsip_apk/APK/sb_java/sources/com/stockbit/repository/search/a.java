package com.stockbit.repository.search;

import com.stockbit.domain.model.search.c;
import java.util.List;
import kotlin.coroutines.e;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes10.dex */
public interface a {
    static /* synthetic */ Object e(a r1, String r2, Boolean r3, List r4, List r5, Boolean r6, Integer r7, e r8, int r9, Object r10) {
        if (r10 != null) goto L12;
        if ((r9 & 16) == 0) goto L7;
        r6 = null;
    L7:
        if ((r9 & 32) == 0) goto L10;
        r7 = null;
    L10:
        return r1.l(r2, r3, r4, r5, r6, r7, r8);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchCompany");
    }

    Object a(String r1, int r2, String r3, e r4);

    Object b(String r1, String r2, int r3, e r4);

    Object c(String r1, e r2);

    Flow d();

    Object f(String r1, e r2);

    Flow g();

    Object getCompanySymbolInSubSector(String r1, String r2, e r3);

    Object getEmittenSectorCompany(String r1, e r2);

    Object getEmittenSectors(e r1);

    Object getEmittenSubSectorsInSector(String r1, e r2);

    Object getSpecialBoard(e r1);

    Flow h(String r1);

    Flow i(String r1, boolean r2, List r3);

    Object j(long r1, e r3);

    Object k(e r1);

    Object l(String r1, Boolean r2, List r3, List r4, Boolean r5, Integer r6, e r7);

    Flow m(String r1);

    Object n(c r1, e r2);

    Flow o(String r1);

    Object p(e r1);

    Object q(String r1, Integer r2, e r3);

    Object r(e r1);

    Flow s(String r1);

    Object t(String r1, e r2);

    Object u(e r1);

    Object v(long r1, e r3);

    Flow w();

    Object x(long r1, e r3);
}
