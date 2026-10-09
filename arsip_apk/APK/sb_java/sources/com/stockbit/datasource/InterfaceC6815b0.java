package com.stockbit.datasource;

import java.util.List;

/* renamed from: com.stockbit.datasource.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC6815b0 {
    static /* synthetic */ Object h(InterfaceC6815b0 r1, int r2, String r3, String r4, String r5, kotlin.coroutines.e r6, int r7, Object r8) {
        if (r8 != null) goto L12;
        if ((r7 & 2) == 0) goto L7;
        r3 = null;
    L7:
        if ((r7 & 8) == 0) goto L10;
        r5 = null;
    L10:
        return r1.d(r2, r3, r4, r5, r6);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchAll");
    }

    Object a(String r1, int r2, String r3, kotlin.coroutines.e r4);

    Object b(String r1, String r2, int r3, kotlin.coroutines.e r4);

    Object c(kotlin.coroutines.e r1);

    Object d(int r1, String r2, String r3, String r4, kotlin.coroutines.e r5);

    Object e(String r1, Boolean r2, List r3, List r4, int r5, Integer r6, Boolean r7, kotlin.coroutines.e r8);

    Object f(long r1, kotlin.coroutines.e r3);

    Object g(kotlin.coroutines.e r1);

    Object getCompanySymbolInSubSector(String r1, String r2, kotlin.coroutines.e r3);

    Object getEmittenClassificationCompany(List r1, int r2, int r3, String r4, String r5, kotlin.coroutines.e r6);

    Object getEmittenSectorCompany(String r1, kotlin.coroutines.e r2);

    Object getEmittenSectors(kotlin.coroutines.e r1);

    Object getEmittenSubSectorsInSector(String r1, kotlin.coroutines.e r2);

    Object getRecentSearch(kotlin.coroutines.e r1);

    Object getSpecialBoard(kotlin.coroutines.e r1);

    Object i(String r1, Long r2, kotlin.coroutines.e r3);

    Object j(String r1, kotlin.coroutines.e r2);

    Object k(String r1, int r2, int r3, kotlin.coroutines.e r4);

    Object l(kotlin.coroutines.e r1);
}
