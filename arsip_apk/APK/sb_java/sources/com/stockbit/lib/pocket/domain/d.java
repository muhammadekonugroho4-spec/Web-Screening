package com.stockbit.lib.pocket.domain;

import java.util.Map;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes10.dex */
public interface d {
    static /* synthetic */ k d(d r02, com.stockbit.lib.pocket.domain.entity.b r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = true;
    L7:
        return r02.h(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLastValue");
    }

    Flow a(com.stockbit.lib.pocket.domain.entity.b r1, boolean r2);

    void b();

    Flow c();

    void e(String r1, k r2);

    void f(String r1, k r2);

    void g(com.stockbit.lib.pocket.domain.entity.b r1, k r2);

    k h(com.stockbit.lib.pocket.domain.entity.b r1, boolean r2);

    Map i();

    Flow j(com.stockbit.lib.pocket.domain.entity.b r1, boolean r2);
}
