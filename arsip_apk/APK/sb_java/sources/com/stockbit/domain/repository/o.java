package com.stockbit.domain.repository;

import com.stockbit.model.entity.screener.ScreenerTemplateRequest;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes8.dex */
public interface o {
    Flow a(String r1, String r2);

    Flow b();

    Flow c();

    Flow d(ScreenerTemplateRequest r1);

    Flow e(String r1, String r2, int r3);

    Flow f(String r1);

    Flow g(boolean r1);

    Flow h(int r1, int r2);
}
