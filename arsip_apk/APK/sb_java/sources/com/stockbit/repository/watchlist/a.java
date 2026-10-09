package com.stockbit.repository.watchlist;

import com.stockbit.domain.param.watchlist.c;
import java.util.List;
import kotlin.coroutines.e;

/* loaded from: classes7.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1181a f130596a = null;

    /* renamed from: com.stockbit.repository.watchlist.a$a, reason: collision with other inner class name */
    public static final class C1181a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C1181a f130597a = null;

        static {
            f130597a = new C1181a();
        }

        public C1181a() {
        }
    }

    static {
        f130596a = C1181a.f130597a;
    }

    static /* synthetic */ Object i(a r02, List r1, int r2, int r3, e r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 4) == 0) goto L7;
        r3 = 25;
    L7:
        return r02.h(r1, r2, r3, r4);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWatchlistGroup");
    }

    Object a(List r1, Boolean r2, e r3);

    Object b(String r1, String r2, e r3);

    Object c(String r1, e r2);

    Object d(String r1, boolean r2, e r3);

    Object deleteCompanyFromWatchlist(String r1, String r2, e r3);

    Object e(List r1, List r2, e r3);

    Object f(String r1, c r2, e r3);

    Object g(List r1, String r2, e r3);

    Object getCompanyFollowerInfo(List r1, e r2);

    Object h(List r1, int r2, int r3, e r4);

    Object j(String r1, e r2);

    Object k(List r1, e r2);

    Object l(String r1, e r2);
}
