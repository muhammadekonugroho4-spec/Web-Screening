package com.stockbit.datasource;

/* loaded from: classes8.dex */
public interface A {
    static /* synthetic */ Object d(A r02, String r1, String r2, boolean r3, kotlin.coroutines.e r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 4) == 0) goto L7;
        r3 = false;
    L7:
        return r02.c(r1, r2, r3, r4);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEmittenInfo");
    }

    Object a(kotlin.coroutines.e r1);

    Object b(String r1, String r2, kotlin.coroutines.e r3);

    Object c(String r1, String r2, boolean r3, kotlin.coroutines.e r4);

    Object getEmittenDiscover(String r1, kotlin.coroutines.e r2);

    Object getEmittenFinItems(String r1, String r2, kotlin.coroutines.e r3);

    Object getEmittenIndexes(kotlin.coroutines.e r1);
}
