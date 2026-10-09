package com.stockbit.repository;

/* loaded from: classes10.dex */
public interface S {
    static /* synthetic */ Object a(S r02, FetchProfileStrategy r1, kotlin.coroutines.e r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r1 = FetchProfileStrategy.REMOTE_WITH_LOCAL_FALLBACK;
    L7:
        return r02.f(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMyProfile");
    }

    static /* synthetic */ Object g(S r02, FetchProfileStrategy r1, kotlin.coroutines.e r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r1 = FetchProfileStrategy.REMOTE_WITH_LOCAL_FALLBACK;
    L7:
        return r02.h(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSocialInfo");
    }

    Object b(String r1, kotlin.coroutines.e r2);

    Object c(kotlin.coroutines.e r1);

    Object d(kotlin.coroutines.e r1);

    Object e(kotlin.coroutines.e r1);

    Object f(FetchProfileStrategy r1, kotlin.coroutines.e r2);

    Object h(FetchProfileStrategy r1, kotlin.coroutines.e r2);
}
